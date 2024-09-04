# Spring-Boot


## Task 1


1. **Implement a Custom Repository Method​**

    **Task**: Create a custom query method in a Spring Data JPA repository.​

    **Details**:​

    Entity: Assume you have an Employee entity with fields like id, name, department, and hireDate.​

    Repository: Extend JpaRepository or CrudRepository to create a repository interface for the Employee entity.​

    Custom Query: Implement a method to find employees who were hired in a specific year and belong to a particular department


## Task 2


2. **Create an Entity with Auditing Fields​**

    **Task**: Set up an entity with auditing fields to automatically track creation and modification times.​

    **Details**:​

    Entity: Create an Order entity with fields such as id, orderDate, status, createdDate, and lastModifiedDate.​

    Configuration: Enable JPA auditing in your Spring Boot application.​

    Entity Configuration: Use annotations to automatically populate createdDate and lastModifiedDate fields


## Task 3


3. **Implement CRUD operations for an entity using Spring Data JPA**
