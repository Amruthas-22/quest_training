CREATE TABLE Customers (
    customer_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    email VARCHAR(100) NOT NULL UNIQUE,
    phone_number VARCHAR(20),
    address VARCHAR(100)
);
CREATE TABLE Rooms (
    room_id INT PRIMARY KEY AUTO_INCREMENT,
    room_type VARCHAR(50) NOT NULL,         
    price_per_night DECIMAL(10, 2) NOT NULL,
    status VARCHAR(20) NOT NULL,         
    floor_number INT NOT NULL
);
CREATE TABLE Reservations (
    reservation_id INT PRIMARY KEY AUTO_INCREMENT,
    customer_id INT,
    room_id INT,
    reservation_date DATE NOT NULL,
    check_in_date DATE NOT NULL,
    check_out_date DATE NOT NULL,
    status VARCHAR(20) NOT NULL,         
    FOREIGN KEY (customer_id) REFERENCES Customers(customer_id) ,
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id) 
);
CREATE TABLE Payments (
    payment_id INT PRIMARY KEY AUTO_INCREMENT,
    reservation_id INT,
    payment_date DATE NOT NULL,
    amount_paid DECIMAL(10, 2) NOT NULL,
    payment_method VARCHAR(20) NOT NULL,    
    FOREIGN KEY (reservation_id) REFERENCES Reservations(reservation_id) ON DELETE CASCADE
    );

CREATE TABLE Staff (
    staff_id INT PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(50) NOT NULL,
    last_name VARCHAR(50) NOT NULL,
    role VARCHAR(50) NOT NULL,              
    hire_date DATE NOT NULL
);
CREATE TABLE Room_Assignments (
    assignment_id INT PRIMARY KEY AUTO_INCREMENT,
    staff_id INT,
    room_id INT,
    assignment_date DATE NOT NULL,
    task_description TEXT NOT NULL,        
    FOREIGN KEY (staff_id) REFERENCES Staff(staff_id) ,
    FOREIGN KEY (room_id) REFERENCES Rooms(room_id) 
);

INSERT INTO Customers (first_name, last_name, email, phone_number, address) VALUES
('John', 'Doe', 'john.doe@example.com', '1234567890', '123 Main St, City, Country'),
('Jane', 'Smith', 'jane.smith@example.com', '0987654321', '456 Oak Rd, City, Country'),
('Alice', 'Johnson', 'alice.johnson@example.com', '1122334455', '789 Pine Ave, City, Country'),
('Bob', 'Brown', 'bob.brown@example.com', '2233445566', '321 Maple St, City, Country'),
('Charlie', 'Davis', 'charlie.davis@example.com', '3344556677', '654 Cedar Blvd, City, Country');


INSERT INTO Rooms (room_type, price_per_night, status, floor_number) VALUES
('single', 100.00, 'available', 1),
('double', 150.00, 'available', 2),
('suite', 250.00, 'occupied', 3),
('single', 100.00, 'under maintenance', 1),
('double', 150.00, 'available', 2);


INSERT INTO Reservations (customer_id, room_id, reservation_date, check_in_date, check_out_date, status) VALUES
(1, 1, '2024-10-01', '2024-10-05', '2024-10-13', 'confirmed'),
(2, 2, '2024-10-02', '2024-10-07', '2024-10-10', 'confirmed'),
(3, 3, '2024-10-03', '2024-10-08', '2024-10-15', 'confirmed'),
(4, 4, '2024-10-13', '2024-10-06', '2024-10-07', 'cancelled'),
(5, 5, '2024-10-05', '2024-10-12', '2024-10-14', 'confirmed');


INSERT INTO Payments (reservation_id, payment_date, amount_paid, payment_method) VALUES
(1, '2024-10-01', 500.00, 'credit card'),
(2, '2024-10-02', 450.00, 'cash'),
(3, '2024-10-03', 750.00, 'credit card'),
(5, '2024-10-05', 300.00, 'cash'),
(4, '2024-10-13', 150.00, 'credit card');


INSERT INTO Staff (first_name, last_name, role, hire_date) VALUES
('Emily', 'Green', 'receptionist', '2023-06-01'),
('David', 'White', 'manager', '2021-04-15'),
('Sophia', 'Brown', 'housekeeper', '2022-02-20'),
('James', 'Blue', 'receptionist', '2020-01-10'),
('Olivia', 'Black', 'housekeeper', '2023-03-25');


INSERT INTO Room_Assignments (staff_id, room_id, assignment_date, task_description) VALUES
(3, 1, '2024-10-05', 'Cleaning'),
(5, 2, '2024-10-06', 'Cleaning'),
(4, 3, '2024-10-07', 'Maintenance'),
(1, 4, '2024-10-05', 'Cleaning'),
(2, 5, '2024-10-13', 'Cleaning');

select*from Customers;
select*from Rooms;
select*from Reservations;
select*from Payments;
select*from Staff;
select*from Room_Assignments;

SELECT r.*
FROM Rooms r
LEFT JOIN Reservations res ON r.room_id = res.room_id
WHERE r.status = 'available' AND r.floor_number = 2;

SELECT c.first_name, c.last_name, c.email, res.reservation_date, res.check_in_date, res.check_out_date
FROM Reservations res
JOIN Customers c ON res.customer_id = c.customer_id
ORDER BY res.check_in_date ASC;

SELECT c.first_name, c.last_name
FROM Reservations res
JOIN Customers c ON res.customer_id = c.customer_id
WHERE DATEDIFF(res.check_out_date, res.check_in_date) > 5;

SELECT res.reservation_id, SUM(p.amount_paid) AS total_paid
FROM Reservations res
JOIN Payments p ON res.reservation_id = p.reservation_id
GROUP BY res.reservation_id;

SELECT room_type, AVG(price_per_night) AS avg_price
FROM Rooms
GROUP BY room_type;

SELECT reservation_id, SUM(amount_paid) AS total_paid
FROM Payments
WHERE TIMESTAMPDIFF(DAY, payment_date, CURDATE()) <= 30
GROUP BY reservation_id;

SELECT s.first_name, s.last_name, 
COUNT(ra.assignment_id) AS total_assignments
FROM Staff s
LEFT JOIN Room_Assignments ra ON s.staff_id = ra.staff_id
WHERE TIMESTAMPDIFF(DAY, ra.assignment_date, CURDATE()) <= 30
GROUP BY s.staff_id
ORDER BY total_assignments DESC;

SELECT c.first_name, c.last_name, MAX(res.reservation_date) AS latest_reservation
FROM Customers c
JOIN Reservations res ON c.customer_id = res.customer_id
GROUP BY c.customer_id;

SELECT s.first_name, s.last_name, COUNT(ra.assignment_id) AS total_assignments
FROM Room_Assignments ra
JOIN Staff s ON ra.staff_id = s.staff_id
WHERE TIMESTAMPDIFF(DAY, ra.assignment_date, CURDATE()) <= 30
GROUP BY s.staff_id
ORDER BY total_assignments DESC;


SELECT c.first_name, c.last_name, MAX(res.reservation_date) AS latest_reservation
FROM Customers c
JOIN Reservations res ON c.customer_id = res.customer_id
GROUP BY c.customer_id;

DELETE FROM Reservations 
WHERE reservation_id = 1;

SELECT r.room_id, r.room_type
FROM Rooms r
LEFT JOIN Reservations res 
  ON r.room_id = res.room_id 
  AND ((res.check_in_date < '2024-12-01' AND res.check_out_date > '2024-11-15') )
WHERE res.reservation_id IS NULL; 

select r.* ,c.first_name,c.last_name

