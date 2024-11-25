package com.quest.exception;
import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionTest {
public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int[] array = new int[5];

            try {

                System.out.println("Enter 5 integers for the array:");
                for (int i = 0; i < array.length; i++) {
                    array[i] = scanner.nextInt();
                }

                System.out.print("Enter the first number: ");
                int num1 = scanner.nextInt();
                System.out.print("Enter the second number: ");
                int num2 = scanner.nextInt();
                System.out.println("Result of division: " + divide(num1, num2));


                System.out.print("Enter an array index (0-4): ");
                int index = scanner.nextInt();
                System.out.println("Value at index " + index + ": " + getArrayValue(array, index));

            } catch (ArithmeticException e) {
                System.out.println("Error: Division by zero is not allowed.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Invalid input. Please enter numeric values.");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: Invalid array index. Please use an index between 0 and 4.");
            } catch(NullPointerException e){
                System.out.println("Error: Null pointer exception.");
            }
            finally {
                System.out.println("Exception handling complete.");
            }

            scanner.close();
        }

        public static int divide(int a, int b) throws ArithmeticException {
            return a / b;
        }

        public static int getArrayValue(int[] array, int index) throws ArrayIndexOutOfBoundsException {
            return array[index];
        }
    }
