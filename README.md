# 👥 User Management System

![Java](https://img.shields.io/badge/Java-17-blue)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.1.5-brightgreen)
![Gradle](https://img.shields.io/badge/Gradle-8.4-orange)
![License](https://img.shields.io/badge/License-MIT-yellow)

A robust user management system built with Spring Boot and Gradle, providing RESTful API endpoints for user operations.

## 📋 Overview

This system provides a complete solution for managing user data through a well-structured API. It follows modern software architecture patterns and includes comprehensive error handling.

## ✨ Features

### Core Functionality
- ✅ **User CRUD Operations** - Create, Read, Update, Delete
- 🔍 **User Search** - Filter users by various criteria
- 📊 **Pagination** - Efficient data retrieval
- 🛡️ **Input Validation** - Comprehensive data validation

### Technical Highlights
- 🏗️ **Layered Architecture** - Clear separation of concerns
- 🧪 **Unit Testing** - Comprehensive test coverage
- 📦 **Dependency Management** - Gradle-based build system
- 🚀 **Performance Optimized** - Efficient data handling

## 🛠️ Technologies Used

### Backend Stack
- **Java 17** - Primary programming language
- **Spring Boot 3.1.5** - Application framework
- **Gradle 8.4** - Build automation tool
- **JUnit 5** - Testing framework

## 📁 Project Structure
```
user_Management_system/
│
├── src/
│ ├── main/
│ │ └── java/com/example/demo/
│ │ ├── controller/ # API endpoints
│ │ │ └── UserController.java
│ │ ├── model/ # Data models
│ │ │ └── User.java
│ │ ├── repo/ # Data access layer
│ │ │ ├── FakeRepo.java
│ │ │ └── FakeRepoInterface.java
│ │ ├── service/ # Business logic
│ │ │ ├── UserService.java
│ │ │ └── UserServiceImpl.java
│ │ └── DemoApplication.java # Main class
│ │
│ └── test/ # Test cases
│ └── java/com/example/demo/service/
│ └── UserServiceTests.java
│
├── build.gradle # Build configuration
├── gradlew # Gradle wrapper
├── gradlew.bat
└── README.md
```

## 🚀 Getting Started

### Prerequisites
- Java 17 JDK
- Gradle 8.4

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/calvinkhoza/user_Management_system.git
   cd user_Management_system-main
   ```
2. Build the project:

```bash
./gradlew build
```
3. Run the application:

```bash
./gradlew bootRun
```

## 🧪 Testing
Run all tests:

```bash
./gradlew test
```

## 📜 License
This project is licensed under the MIT License - see the LICENSE file for details.
