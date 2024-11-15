# Excel_Report_Generator_Using-_APACHE_POI
Excel_Report_Generator_Using _APACHE_POI

Here's a beautifully structured and detailed `README.md` file for your **Excel Report Generator** project using **Spring Boot**, **Apache POI**, and **REST API**. I've included all the important sections along with Markdown formatting to make it appealing and professional.

---

# 📊 Excel Report Generator using Spring Boot & Apache POI

### 📝 Table of Contents
- [Project Overview](#project-overview)
- [Technologies Used](#technologies-used)
- [Features](#features)
- [Getting Started](#getting-started)
  - [Prerequisites](#prerequisites)
  - [Installation](#installation)

---

## 📌 Project Overview
The **Excel Report Generator** is a Spring Boot application that fetches data using **Spring Data JPA** and generates an Excel report with the help of **Apache POI**. The data is fetched from a database and transformed into an Excel file containing a workbook, sheet, rows, and cells. 

The report can be downloaded by making a `GET` request to a specific endpoint, which will generate the Excel file and return it as a downloadable attachment.

---

## 💻 Technologies Used
- **Java 8**
- **Spring Boot 3.x**
- **Spring Data JPA**
- **Apache POI**
- **Maven**
- **MySQL** (or any other database of your choice)
- **REST API**

---

## ✨ Features
- Fetches data from the database using Spring Data JPA.
- Generates an Excel report using Apache POI.
- Provides a REST API endpoint to download the report.
- Exports data in a structured Excel format (workbook, sheet, rows, cells).
- Automatically downloads the Excel report as an attachment when the endpoint is accessed.

---

## 🚀 Getting Started

### Prerequisites
Ensure you have the following installed:
- **JDK 8+**
- **Maven**
- **MySQL Database**
- **Postman** (for testing the API)

### Installation
1. Clone the repository:
   ```bash
   git clone https://github.com/123-anubhav/Excel_Report_Generator_Using-_APACHE_POI.git
   cd Excel_Report_Generator_Using-_APACHE_POI
   ```
2. Update the `application.properties` file with your database credentials:
   ```properties
   spring.datasource.url=jdbc:mysql://localhost:3306/your_database
   spring.datasource.username=root
   spring.datasource.password=your_password
   spring.jpa.hibernate.ddl-auto=update
   ```

3. Install the required dependencies:
   ```bash
   mvn clean install
   ```

---

## ▶️ Running the Application
Start the Spring Boot application:

```bash
mvn spring-boot:run
```

The application will run on `http://localhost:8081`.

---

## 🌐 API Endpoint

- **GET /excel**: Generates an Excel report and downloads it as a file.
  
  ```http
  GET http://localhost:8081/excel
  ```

  - **Response**: Excel file download (`Content-Type: application/octet-stream`)

---

## 📖 Usage

1. **Start the server**: Ensure the application is running on `http://localhost:8081`.
2. **Access the Excel report**:
   - Open a web browser or use Postman.
   - Make a `GET` request to `http://localhost:8081/excel`.
   - The Excel report will be downloaded automatically.

---
