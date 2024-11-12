USE librarymanagment_schema;

CREATE TABLE Authors (
    AuthorID INT PRIMARY KEY,
    FirstName VARCHAR(50),
    LastName VARCHAR(50)
);

CREATE TABLE Books (
    BookID INT PRIMARY KEY,
    Title VARCHAR(100),
    AuthorID INT,
    PublicationYear YEAR,
    Price DECIMAL(10, 2),
    FOREIGN KEY (AuthorID) REFERENCES Authors(AuthorID)  
);

CREATE TABLE Borrowers (
    BorrowerID INT PRIMARY KEY AUTO_INCREMENT,
    FirstName VARCHAR(50),
    LastName VARCHAR(50),
    Email VARCHAR(100) UNIQUE,
    DOB DATE
);

CREATE TABLE Loans (
    LoanID INT PRIMARY KEY AUTO_INCREMENT,
    BorrowerID INT,
    BookID INT,
    LoanDate DATE,
    ReturnDate DATE,
    FOREIGN KEY (BorrowerID) REFERENCES Borrowers(BorrowerID),
    FOREIGN KEY (BookID) REFERENCES Books(BookID)
);

INSERT INTO Authors (AuthorID, FirstName, LastName) VALUES
(1, 'J.K.', 'Rowling'),
(2, 'R.L.', 'Stine'),
(3, 'Enid', 'Blyton'),
(4, 'Stephen', 'Meyer'),
(5, 'Tim', 'LaHaye');

INSERT INTO Books (BookID, Title, AuthorID, PublicationYear, Price) VALUES
(101, 'Harry Potter', 1, 2000, 2500.00),
(102, 'Goosebumps', 2, 1992, 1500.00),
(103, 'Noddy', 3, 1930, 1200.00),
(104, 'Twilight', 4, 2005, 3500.00),
(105, 'Left Behind', 5, 2007, 4000.00);


INSERT INTO Borrowers (FirstName, LastName, Email, DOB) VALUES
('Alice', 'Johnson', 'alice.johnson@example.com', '1990-02-15'),
('Bob', 'Smith', 'bob.smith@example.com', '1985-07-22'),
('Charlie', 'Davis', 'charlie.davis@example.com', '1978-11-03'),
('David', 'Brown', 'david.brown@example.com', '2000-05-10'),
('Eve', 'Taylor', 'eve.taylor@example.com', '1995-09-30');

INSERT INTO Loans (BorrowerID, BookID, LoanDate, ReturnDate) VALUES
(1, 101, '2024-01-10', '2024-02-10'),
(2, 102, '2024-02-01', '2024-03-01'),
(3, 103, '2024-01-20', '2024-02-20'),
(4, 104, '2024-01-15', '2024-02-15'),
(5, 105, '2024-01-25', '2024-02-25');


SELECT * FROM Books;

SELECT Title, Price, PublicationYear FROM Books
WHERE Price > 20;

SELECT FirstName,LastName,Email FROM Borrowers
WHERE BorrowerID in(SELECT BorrowerID FROM Loans WHERE LoanDate > '2024-01-01');

UPDATE Books
SET Price = 25.00
WHERE Title = 'Noddy';

DELETE FROM loans WHERE BookID = (SELECT BookID FROM Books WHERE Title = 'Twilight');
DELETE FROM Books WHERE Title = 'Twilight';


ALTER TABLE Books
ADD COLUMN Genre VARCHAR(50);

SELECT SUM(Price) AS TotalPrice
FROM Books;

SELECT AVG(Price) AS AveragePrice
FROM Books;

SELECT COUNT(DISTINCT BorrowerID) AS total_borrowers
FROM Borrowers;

SELECT Title
FROM books
WHERE BookID IN (
    SELECT DISTINCT BookID
    FROM loans
    WHERE BorrowerID IN (
        SELECT BorrowerID
        FROM borrowers
        WHERE YEAR(CURDATE()) - YEAR(DOB) > 30
    )
);




