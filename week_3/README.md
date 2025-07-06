# Spring Core with Maven

Spring Core is the foundational module of the Spring Framework, focusing on dependency injection (DI) and inversion of control (IoC). This allows you to build loosely-coupled, testable applications.

## Key Concepts

- **Dependency Injection (DI):** Spring manages your object dependencies, injecting them at runtime instead of hard-coding them.
- **IoC Container:** The Spring container creates and manages beans (your application objects) based on configuration provided via XML, annotations, or Java configuration.
- **Maven Integration:** Maven is used for build automation and dependency management. Add Spring dependencies in `pom.xml` to get started.

## Typical Workflow

1. Add Spring dependencies to your `pom.xml`.
2. Configure beans via XML or annotations.
3. Use `ApplicationContext` to retrieve and use beans in your application.

---

# Spring Data JPA with Hibernate

Spring Data JPA is a Spring module that makes it easy to work with relational databases using the Java Persistence API (JPA). Hibernate is the default JPA provider.

## Key Concepts

- **JPA:** Standard API for ORM (Object-Relational Mapping) in Java. Maps Java objects to database tables.
- **Hibernate:** The most widely used JPA implementation, handling database operations under the hood.
- **Repositories:** Spring Data provides interfaces like `JpaRepository` to automatically generate basic CRUD operations.
- **Entities:** Classes annotated with `@Entity` represent database tables.

## Typical Workflow

1. Add Spring Data JPA and Hibernate dependencies in `pom.xml`.
2. Configure database connection in `application.properties` or `application.yml`.
3. Annotate your model classes with `@Entity`.
4. Create repository interfaces extending `JpaRepository` or `CrudRepository`.
5. Use the repository in your service or controller—no need to write boilerplate SQL.

---

## Benefits

- **Spring Core:** Clean, decoupled code using DI and IoC.
- **Spring Data JPA:** Rapid data access layer development with minimal code, leveraging powerful ORM features of Hibernate.

> For more details, see Spring and Hibernate official documentation.
