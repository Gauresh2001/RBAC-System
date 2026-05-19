# 🔐 RBAC System - Spring Boot + ReactJS + MySQL + JWT

A Full Stack **Role-Based Access Control (RBAC)** System built using **Spring Boot**, **ReactJS**, **MySQL**, **Spring Security**, and **JWT Authentication**.

This project provides secure authentication and authorization with **Users, Roles, Permissions**, protected REST APIs, and a modern admin dashboard UI.

---

# 🚀 Features

## 🔑 Authentication & Security
- JWT Authentication
- Secure Login & Registration
- Spring Security Integration
- Protected APIs
- Role-Based Authorization

## 👥 User Management
- Create Users
- View Users
- Delete Users
- Assign Roles

## 🛡️ Role Management
- Create Roles
- Assign Permissions
- View Roles
- Delete Roles

## 🔐 Permission Management
- Create Permissions
- View Permissions
- Delete Permissions

## 🎨 Frontend Features
- Modern Responsive UI
- Dashboard Cards
- Sidebar Navigation
- Protected Routes
- Token-based Authentication

---

# 🛠️ Tech Stack

## Backend
- Java 17
- Spring Boot 4
- Spring Security
- Spring Data JPA
- JWT Authentication
- MySQL
- Maven

## Frontend
- ReactJS
- React Router DOM
- Axios
- CSS3

---

# 📂 Project Structure

## Backend Structure

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

## Frontend Structure

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

## 3️⃣ Configure MySQL

Create Database:

```sql
CREATE DATABASE rbac_db;
```

---

## 4️⃣ Configure `application.properties`

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

Backend Runs On:

```bash
http://localhost:8080
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

## 3️⃣ Run Frontend

```bash
npm start
```

Frontend Runs On:

```bash
http://localhost:3000
```

---

# 🔗 API Endpoints

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

## 🔐 Permission APIs

| Method | Endpoint | Description |
|-------|-----------|-------------|
| POST | `/api/permissions` | Create Permission |
| GET | `/api/permissions` | Get All Permissions |
| DELETE | `/api/permissions/{id}` | Delete Permission |

---

# 🔑 JWT Authentication

After successful login:

```json
{
  "token": "JWT_TOKEN",
  "email": "gauresh@gmail.com"
}
```

Use token in headers:

```bash
Authorization: Bearer YOUR_TOKEN
```

---

# 📸 Screenshots

## 🔐 Login Page
- Secure JWT Login
- Responsive Design

## 📋 Dashboard
- Modern Admin Dashboard
- Quick Navigation Cards

## 👥 Users Page
- Manage Users
- Delete Users
- View Roles

## 🛡️ Roles Page
- Create Roles
- Assign Permissions

## 🔐 Permissions Page
- Create Permissions
- Delete Permissions

---

# 🧪 Postman Testing

Test all APIs using Postman.

### Example Login API

```http
POST http://localhost:8080/api/auth/login
```

### Request Body

```json
{
  "email": "gauresh@gmail.com",
  "password": "12345"
}
```

---

# 🗄️ Database Tables

- users
- role
- permission
- user_roles
- role_permissions

---

# 🔥 Security Features

- JWT Token Authentication
- Password Encryption using BCrypt
- Role-Based Authorization
- Protected APIs
- Stateless Session Management

---

# 📌 Future Enhancements

- Update APIs
- Search & Pagination
- Email Verification
- Forgot Password
- Docker Support
- Deployment

---

# 👨‍💻 Author

## Gauresh Badgujar

Full Stack Java Developer

---

# ⭐ Support

If you like this project:

⭐ Star the repository  
🍴 Fork the repository  
📩 Share with others

---

# 📄 License

This project is developed for learning and educational purposes.
