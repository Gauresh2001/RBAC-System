# 🔐 RBAC System
### Role-Based Access Control System using Spring Boot, ReactJS, MySQL & JWT Authentication

<p align="center">
  <img src="https://img.shields.io/badge/Java-17-orange?style=for-the-badge&logo=java"/>
  <img src="https://img.shields.io/badge/SpringBoot-4.0-green?style=for-the-badge&logo=springboot"/>
  <img src="https://img.shields.io/badge/ReactJS-Frontend-blue?style=for-the-badge&logo=react"/>
  <img src="https://img.shields.io/badge/MySQL-Database-blue?style=for-the-badge&logo=mysql"/>
  <img src="https://img.shields.io/badge/JWT-Authentication-red?style=for-the-badge"/>
</p>

---

# 📌 Project Overview

RBAC System is a **Full Stack Secure Authentication & Authorization Application** developed using **Spring Boot**, **ReactJS**, **Spring Security**, **JWT**, and **MySQL**.

The system provides secure access management using:

✅ Users  
✅ Roles  
✅ Permissions  
✅ JWT Authentication  
✅ Protected APIs  
✅ Admin Dashboard  

This project follows a clean **Layered Architecture** with proper security and validation.

---

# 🚀 Features

## 🔐 Authentication & Authorization
- JWT Token Authentication
- Secure Login & Registration
- Role-Based Authorization
- Protected REST APIs
- BCrypt Password Encryption

---

## 👥 User Management
- Register Users
- Login Users
- View All Users
- Delete Users
- Assign Multiple Roles

---

## 🛡️ Role Management
- Create Roles
- Delete Roles
- Assign Permissions
- Manage Access Levels

---

## 🔑 Permission Management
- Create Permissions
- Delete Permissions
- View Permissions

---

## 🎨 Frontend Features
- Responsive Modern UI
- Dashboard Analytics Cards
- Sidebar Navigation
- Protected Routes
- Axios API Integration
- Clean User Experience

---

# 🏗️ Tech Stack

| Technology | Usage |
|------------|------|
| Java 17 | Backend Language |
| Spring Boot 4 | Backend Framework |
| Spring Security | Authentication & Authorization |
| JWT | Secure Token Authentication |
| ReactJS | Frontend Framework |
| MySQL | Database |
| Hibernate / JPA | ORM |
| Axios | API Integration |
| Maven | Dependency Management |

---

# 📂 Project Structure

## 🔹 Backend Structure

```bash
src/main/java/com/rbac
│
├── controller
├── dto
├── entity
├── repository
├── security
├── service
├── exception
└── RbacSystemApplication.java
```

---

## 🔹 Frontend Structure

```bash
src
│
├── components
├── pages
├── services
├── App.js
├── App.css
└── index.js
```

---

# ⚙️ Backend Setup

## 1️⃣ Clone Repository

```bash
git clone https://github.com/your-username/RBAC-System-SpringBoot-ReactJS-MySQL-JWT.git
```

---

## 2️⃣ Open Backend Project

```bash
cd rbac-system
```

---

## 3️⃣ Create Database

```sql
CREATE DATABASE rbac_db;
```

---

## 4️⃣ Configure application.properties

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/rbac_db
spring.datasource.username=root
spring.datasource.password=root

spring.jpa.hibernate.ddl-auto=update

jwt.secret=RBAC_SECRET_KEY_123456789_RBAC_SECRET_KEY_123456789
jwt.expiration=86400000
```

---

## 5️⃣ Run Backend

```bash
mvn clean install
mvn spring-boot:run
```

---

# 💻 Frontend Setup

## 1️⃣ Open Frontend Folder

```bash
cd rbac-frontend
```

---

## 2️⃣ Install Dependencies

```bash
npm install
```

---

## 3️⃣ Start Frontend

```bash
npm start
```

---

# 🌐 Application URLs

| Application | URL |
|------------|-----|
| Frontend | http://localhost:3000 |
| Backend | http://localhost:8080 |

---

# 🔗 REST API Endpoints

## 🔐 Authentication APIs

| Method | Endpoint | Description |
|-------|-----------|-------------|
| POST | `/api/auth/register` | Register User |
| POST | `/api/auth/login` | Login User |

---

## 👥 User APIs

| Method | Endpoint | Description |
|-------|-----------|-------------|
| GET | `/api/users` | Get All Users |
| GET | `/api/users/{id}` | Get User By ID |
| DELETE | `/api/users/{id}` | Delete User |

---

## 🛡️ Role APIs

| Method | Endpoint | Description |
|-------|-----------|-------------|
| POST | `/api/roles` | Create Role |
| GET | `/api/roles` | Get All Roles |
| DELETE | `/api/roles/{id}` | Delete Role |

---

## 🔑 Permission APIs

| Method | Endpoint | Description |
|-------|-----------|-------------|
| POST | `/api/permissions` | Create Permission |
| GET | `/api/permissions` | Get All Permissions |
| DELETE | `/api/permissions/{id}` | Delete Permission |

---

# 🔐 JWT Authentication

After successful login:

```json
{
  "token": "JWT_TOKEN",
  "email": "gauresh@gmail.com"
}
```

Use Token in Header:

```bash
Authorization: Bearer YOUR_TOKEN
```

---

# 🗄️ Database Tables

```text
users
role
permission
user_roles
role_permissions
```

---

# 🔥 Security Features

✅ JWT Authentication  
✅ BCrypt Password Encryption  
✅ Role-Based Access Control  
✅ Protected APIs  
✅ Stateless Authentication  
✅ Spring Security Integration  

---

# 📸 UI Screens

✅ Login Page  
✅ Register Page  
✅ Dashboard  
✅ Users Management  
✅ Roles Management  
✅ Permissions Management  

---

# 📈 Future Enhancements

- Update APIs
- Search & Pagination
- Forgot Password
- Email Verification
- Docker Deployment
- Cloud Deployment
- Swagger Documentation

---

# 👨‍💻 Developed By

## Gauresh Badgujar
### Full Stack Java Developer

---

# ⭐ Support

If you like this project:

⭐ Star the Repository  
🍴 Fork the Repository  
📩 Share with Others  

---

# 📜 License

This project is developed for educational and learning purposes.
