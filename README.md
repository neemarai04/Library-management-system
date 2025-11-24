# Library Management System

The Library Management System is a Java-based application designed to efficiently manage library operations, including book inventory, member records, and borrowing transactions. The system ensures accurate record-keeping and supports smooth workflows for librarians and administrators by integrating a MySQL database for persistent data storage.

---

## Features

* Manage book records (add, update, delete, search)
* Register and maintain member profiles
* Issue and return books with validation
* Track current issued books and borrowing history
* Real-time availability status of books
* Persistent storage using MySQL database

---

## Technology Stack

| Component             | Technology            |
| --------------------- | --------------------- |
| Programming Language  | Java                  |
| Database              | MySQL                 |
| Database Connectivity | JDBC                  |
| IDE Used              | NetBeans              |
| Build System          | Ant (build.xml)       |



## Database Schema (Overview)

> (Keep this short; include full script in a separate `.sql` file)

* **books** — stores book information
* **members** — stores member details
* **transactions** — records book issue and return history

---

## Installation and Setup

1. Clone the repository:

```bash
git clone https://github.com/neemarai04/Library-management-system.git
```

2. Import the project into NetBeans or any Java-compatible IDE.

3. Create a MySQL database and execute the provided SQL schema file:

```sql
CREATE DATABASE library_db;
USE library_db;
-- then run the tables from resources/database.sql
```

4. Configure the database credentials inside the project:

```
DB_URL      = jdbc:mysql://localhost:3306/library_db
DB_USERNAME = your_username
DB_PASSWORD = your_password
```

5. Build and run the project using `Main.java` or the Ant build script.

---

## Usage

* Start the application.
* Use the menu or GUI to:

  * Add/search books
  * Register members
  * Issue books (only if copies are available)
  * Return books and update records
* All issued and returned activities are logged in the database.

---

## Future Improvements

* Authentication and user roles (Admin / Staff)
* Fine calculation for overdue returns
* Email/SMS reminders
* Barcode or RFID integration
* Web-based version using Spring Boot and REST API

**Neema J Rai**
GitHub: [github.com/neemarai04](https://github.com/neemarai04)


