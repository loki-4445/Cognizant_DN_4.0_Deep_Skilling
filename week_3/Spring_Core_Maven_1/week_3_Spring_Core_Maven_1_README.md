# Spring Core Maven Project 1

This directory contains a sample project for learning the basics of Spring Core with Maven, as part of **Week 3** in the Cognizant DN 4.0 Deep Skilling program.

## Table of Contents

- [Project Overview](#project-overview)
- [Learning Objectives](#learning-objectives)
- [Project Structure](#project-structure)
- [Getting Started](#getting-started)
- [How to Run](#how-to-run)
- [Dependencies](#dependencies)
- [Useful Commands](#useful-commands)
- [References](#references)

---

## Project Overview

This project demonstrates fundamental concepts of Spring Core using Maven as the build tool. It covers topics such as:

- Dependency Injection (DI)
- Inversion of Control (IoC)
- Spring Beans configuration (XML/Annotation-based)
- ApplicationContext usage

## Learning Objectives

By completing this module, you will be able to:

- Understand the basics of Spring Core and its architecture
- Set up a Maven-based Spring project
- Configure and use Spring beans
- Implement Dependency Injection in Java applications

## Project Structure

```
week_3/Spring_Core_Maven_1/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── ... (Java source files)
│   │   └── resources/
│   │       ├── applicationContext.xml (Spring configuration)
│   └── test/
│       └── java/
│           └── ... (Test files)
├── pom.xml
└── README.md
```

## Getting Started

1. **Clone the repository** (if you haven't already):

   ```bash
   git clone https://github.com/loki-4445/Cognizant_DN_4.0_Deep_Skilling.git
   cd Cognizant_DN_4.0_Deep_Skilling/week_3/Spring_Core_Maven_1
   ```

2. **Build the project** using Maven:

   ```bash
   mvn clean install
   ```

3. **Open the project** in your favorite IDE (Eclipse, IntelliJ IDEA, VS Code, etc.).

## How to Run

- Make sure you have Java (JDK 8 or above) and Maven installed.
- Run the main application class, or use the following Maven command:

  ```bash
  mvn exec:java -Dexec.mainClass="your.main.ClassName"
  ```

  Replace `"your.main.ClassName"` with the actual main class in your project.

## Dependencies

The main dependencies used in this project are:

- Spring Core
- JUnit (for testing)

All dependencies are managed via `pom.xml`.

## Useful Commands

- **Build the project:**  
  `mvn clean install`

- **Run tests:**  
  `mvn test`

- **Run the application:**  
  `mvn exec:java -Dexec.mainClass="your.main.ClassName"`

## References

- [Spring Framework Documentation](https://docs.spring.io/spring-framework/docs/current/reference/html/core.html)
- [Maven Documentation](https://maven.apache.org/guides/index.html)
- [Spring Core - Baeldung Guide](https://www.baeldung.com/spring-core)

---

**Happy Learning!**