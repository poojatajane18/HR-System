# HR System

This project implements a Human Resources Management System in Java. It includes classes for employees, sales representatives, and sales managers. Additionally, it incorporates a basic login system using a `User` interface.

## Classes

### Employee

- Properties:
  - firstName
  - lastName
  - registration
  - age
  - daysWorked
  - vacationDaysTaken
  - salary
  - yearsWorked

- Methods:
  - `timeToRetirement()`: Calculates the time to retirement based on age and years worked.
  - `vacationTimeLeft()`: Calculates the remaining vacation time.
  - `calculateBonus()`: Calculates the bonus based on the salary.

### SalesRep

- Inherits from `Employee`

- Additional Property:
  - salesMade

- Methods:
  - `calculateCommission()`: Calculates the commission based on sales made.

### SalesManager

- Inherits from `Employee`

- Additional Property:
  - salesTeam (HashMap of SalesRep)

- Methods:
  - `calculateCommission()`: Calculates the commission based on the total sales made by the team.

### User Interface

- Interface:
  - `User`
  - Properties:
    - private username
    - private password
  - Methods:
    - `login(String username, String password)`: Checks if the provided username and password match the user's credentials.

Usage
Instantiate objects of the Employee, SalesRep, and SalesManager classes.
Set values for the properties.
Test the implemented methods.

Challenge
Turn the HR system into a login system.
Implement the User interface for all employees.
Use the login method to verify usernames and passwords.
