# 🔐 Spring Boot Registration & Login Application

## 📌 Overview

This is a full-stack web application built using Spring Boot that provides user authentication features such as registration, login, and profile management.

The project follows a layered architecture (Controller → Service → Repository) and demonstrates backend development skills along with basic frontend integration.

---

## 🚀 Features

* User Registration
* User Login Authentication
* Profile Page
* MVC Architecture (Controller, Service, Repository layers)
* Server-side rendering using Thymeleaf
* Form handling and validation (basic)

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* Spring MVC
* Spring Data JPA
* Thymeleaf
* Maven
* HTML/CSS

---

## 📂 Project Structure
```bash
src/
└── main/
    ├── java/org/example/springbootregloginapp
    │    └── controllers
    │    └── entities
    │    └── repositories
    │    └── services
    │    └── SpringBootRegLoginAppApplication.java
    └── resources/
        ├── static
        ├── templates
        └── application.properties
```
---

## ⚙️ Setup & Run

### 1. Clone the repository

```bash
git clone https://github.com/your-username/your-repo-name.git
```

### 2. Navigate to project

```bash
cd your-repo-name
```

### 3. Configure Environment Variable

Set the following environment variable:

* DB_PASSWORD

---

### 4. Run the application

Using Maven:

```bash
./mvnw spring-boot:run
```

Or run the main class:
`SpringBootRegLoginAppApplication.java`

---

## 🔐 Security Note

The database password is not stored in the repository.  
It is configured using environment variables, while other database properties are defined in `application.properties`.

---

## 👨‍💻 Author

Rishank Kushwaha

---

## ⭐ If you like this project

Give it a star on GitHub!
