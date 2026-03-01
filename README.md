  A Spring Boot project for managing student data. You can add, view, and delete students using REST APIs. The project uses MySQL as the database and demonstrates CRUD operations with JPA.

Technologies Used:

Java 25

Spring Boot 4

Spring Data JPA

MySQL

Maven

Features:

Add student records

Get all students

Get student by ID

Delete student

Database:

Database Name: studentdb

Table Name: students

Supports at least 500 student records

API Endpoints:

POST /students → Add a student

GET /students → Get all students

GET /students/{id} → Get a student by ID

DELETE /students/{id} → Delete a student

How to Run:

Clone the repository

Open in IntelliJ IDEA

Update application.properties with your MySQL credentials

Run StudentapiApplication.java

Test APIs using Postman
