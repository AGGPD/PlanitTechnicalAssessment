# Automation Assessment Repository

This repository contains the automation test scripts for the Automation Engineer technical assessment. The tests are written in Java using Selenium, TestNG, and follow the Page Object Model (POM) design pattern. The project is built using Maven and is ready for continuous integration.

## Table of Contents

- [Overview](#overview)
- [Prerequisites](#prerequisites)
- [Project Structure](#project-structure)
- [Setup & Installation](#setup--installation)
- [Running the Tests](#running-the-tests)
- [Continuous Integration](#continuous-integration)
- [Additional Information](#additional-information)

## Overview

This project automates test cases for a web application (http://jupiter.cloud.planittesting.com) by validating contact form behavior and e-commerce functionalities. The framework uses Selenium with TestNG and applies the Page Object Model (POM) for better maintainability and reusability.

Test case 1:

1. From the home page go to contact page

2. Click submit button

3. Verify error messages

4. Populate mandatory fields

5. Validate errors are gone


Test case 2:


1. From the home page go to contact page

2. Populate mandatory fields

3. Click submit button

4. Validate successful submission message


Note: Run this test 5 times to ensure 100% pass rate


Test case 3:


1. Buy 2 Stuffed Frog, 5 Fluffy Bunny, 3 Valentine Bear

2. Go to the cart page

3. Verify the subtotal for each product is correct

4. Verify the price for each product

5. Verify that total = sum(sub totals)

## Prerequisites

Before setting up the project, ensure you have the following installed:

- **Java JDK 23**  
  Confirm your installation by running:
  ```bash
  java --version

  Your output should resemble:
    java 23.0.2 2025-01-21
    Java(TM) SE Runtime Environment (build 23.0.2+7-58)
    Java HotSpot(TM) 64-Bit Server VM (build 23.0.2+7-58, mixed mode, sharing)

**Maven**
The project uses Maven for dependency management and build processes. Refer to Apache Maven for installation instructions. The pom.xml file in the root defines all necessary dependencies.

**Git**
Git is required to clone the repository. Download it from git-scm.com.

**IntelliJ IDEA**
You are using IntelliJ IDEA as your IDE, which provides full support for Maven projects and makes navigation and development straightforward.

**Project Structure**
Below is the folder structure of the project:
.
├── pom.xml
└── src
    ├── main
    │   └── java
    │       ├── com
    │       │   ├── base
    │       │   │   └── BasePage.java
    │       │   └── com
    │       │       └── jupiter
    │       │           └── cloud
    │       │               └── planittesting
    │       │                   ├── HomePage.java
    │       │                   ├── contactform
    │       │                   │   ├── ContactPage.java
    │       │                   │   └── AfterSubmitPage.java
    │       │                   └── shop
    │       │                       ├── ShopPage.java
    │       │                       └── CartPage.java
    │       └── utilities
    │           ├── Utility.java
    │           └── WaitUtility.java
    └── test
        └── java
            └── com
                └── jupiter
                    └── cloud
                        └── planittesting
                            ├── base
                            │   └── BaseTest.java
                            └── test
                                ├── TestCase1.java
                                ├── TestCase2.java
                                └── TestCase3.java

**Setup & Installation**
1. Clone the repository:
  git clone https://github.com/yourusername/your-repository.git
  cd your-repository
2. Build the project with Maven:
  mvn clean install

**Running the Tests**
The tests are managed using TestNG. To run the tests via Maven, execute:
  mvn test

**Continuous Integration**
This project is configured to be CI-ready. It can be integrated into a CI/CD pipeline (for example, using Jenkins) where Maven commands ensure tests are automatically executed on every build.

**Additional Information**
  
Dependencies
  
  The project uses the following dependencies:
  
    Selenium WebDriver 4.30.0
  
    TestNG 7.11.0
  
    Logback (for logging) 1.5.18
  
    Log4j (for logging) 2.24.3
    
  Design Pattern:
  The project implements the Page Object Model (POM) for clarity and maintainability.
  
  Reporting:
  TestNG generates default reports found in the /target/surefire-reports folder after test execution.
  
  Contact:
  For any questions or feedback, please contact me at andypd01@yahoo.com.


This README provides a clear overview, setup instructions, and a project layout that helps reviewers quickly understand and use your repository.
