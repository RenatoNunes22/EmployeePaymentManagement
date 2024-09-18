# Employee Payment Management

This project implements a system to manage and calculate payments for both in-house and outsourced employees. Each employee has a name, the number of hours worked, and an hourly rate. Outsourced employees also have an additional charge, which is used to calculate a bonus in their payment.

## UML Diagram

The following diagram shows the class structure of the system:

<img width="371" alt="Captura de Tela 2024-09-17 às 21 07 54" src="https://github.com/user-attachments/assets/c663603d-8710-43a7-a594-089f52ff0417">


## Class Structure

### 1. Employee (Superclass)

- **Attributes**:
  - `name: String` - The name of the employee.
  - `hours: Integer` - The number of hours worked by the employee.
  - `valuePerHour: Double` - The hourly rate for the employee.

- **Methods**:
  - `payment(): Double` - This method calculates the payment for the employee by multiplying the number of hours by the hourly rate.

### 2. OutsourcedEmployee (Subclass of Employee)

- **Attributes**:
  - Inherits all attributes from `Employee`.
  - `additionalCharge: Double` - An additional expense specific to outsourced employees.

- **Methods**:
  - Overrides the `payment()` method to add a bonus of 110% of the `additionalCharge` to the final payment.

## How it Works

The program reads the data for `N` employees (in-house and outsourced), stores them in a list, and calculates the payment for each employee. The program then displays the name and payment for each employee in the order they were entered.

- For in-house employees, the payment is simply the `hours * valuePerHour`.
- For outsourced employees, the payment is `hours * valuePerHour + 110% of additionalCharge`.

## Project Structure
```
EmployeePaymentManagement/
├── src/
│   ├── entities/
│   │   ├── Employee.java
│   │   └── OutsourcedEmployee.java
│   └── Main.java
├── README.md
└── path_to_image.png
```

## Example
```
Enter the number of employees: 2

Employee #1:
Name: John
Hours worked: 40
Value per hour: 20

Is the employee outsourced? (y/n): n

Employee #2:
Name: Sarah
Hours worked: 30
Value per hour: 25
Additional charge: 200
Is the employee outsourced? (y/n): y

Payments:
John - $800.00
Sarah - $875.00
