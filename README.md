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

**- **Maven**
The project uses Maven for dependency management and build processes. Refer to Apache Maven for installation instructions. The pom.xml file in the root defines all necessary dependencies.

**- **Git**
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


---

This README provides a clear overview, setup instructions, and a project layout that helps reviewers quickly understand and use your repository.
