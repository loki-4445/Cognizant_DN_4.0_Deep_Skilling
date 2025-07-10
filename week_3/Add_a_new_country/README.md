# Cognizant DN 4.0 Deep Skilling

This project is a part of the Cognizant DN 4.0 Deep Skilling program, focusing on Java-based backend development. The repository provides a collection of weekly assignments and modules designed to help learners deepen their understanding of Java programming, software engineering best practices, and hands-on implementation.

## Project Structure

The repository is organized into weekly folders, each representing a different learning module or assignment. For example:

```
Cognizant_DN_4.0_Deep_Skilling/
├── week_1/
│   └── ... 
├── week_2/
│   └── ...
├── week_3/
│   ├── Add_a_new_country/
│   │   ├── src/
│   │   │   ├── main/
│   │   │   │   └── java/
│   │   │   │       └── (Java source files)
│   │   │   └── test/
│   │   │       └── java/
│   │   │           └── (Java test files)
│   │   ├── pom.xml / build.gradle
│   │   └── README.md
│   └── ...
└── ...
```

### Example: `week_3/Add_a_new_country/`

This module/assignment demonstrates how to extend a Java-based application to support adding a new country. The folder typically contains:

- `src/main/java/`: Main Java source code files (e.g., model classes, controllers, services).
- `src/test/java/`: Unit and integration tests for the application.
- `pom.xml` or `build.gradle`: Build files defining dependencies and build instructions (Maven or Gradle).
- `README.md`: Module-specific documentation.

## How to Run

Each assignment may contain its own instructions in a `README.md` within the module folder. Generally, for Java projects:

1. **Clone the repository:**
   ```sh
   git clone https://github.com/loki-4445/Cognizant_DN_4.0_Deep_Skilling.git
   cd Cognizant_DN_4.0_Deep_Skilling/week_3/Add_a_new_country
   ```

2. **Build the project:**  
   If using Maven:
   ```sh
   mvn clean install
   ```
   If using Gradle:
   ```sh
   gradle build
   ```

3. **Run the application:**  
   Typically:
   ```sh
   mvn spring-boot:run
   ```
   or
   ```sh
   java -jar target/<artifact>.jar
   ```

## Technologies Used

- Java (Core, OOP)
- Build Tools: Maven or Gradle
- JUnit (for unit testing)
- (Optional) Spring Boot or similar frameworks, depending on the assignment

## Contribution

This repository is for educational purposes as part of a skilling initiative. Contributions are generally made via assignment submissions.

---

**Note:**  
For details about each weekly assignment or specific module, refer to the respective `README.md` inside each folder.
