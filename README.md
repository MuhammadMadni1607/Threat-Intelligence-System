# 🛡️ Threat Intelligence System (CCP Project)

A full-stack **Threat Intelligence System** built using **Spring Boot, MySQL, and Kafka**.  
This project collects, stores, and displays Indicators of Compromise (IOC) such as IPs, domains, severity levels, and sources, with a simple web dashboard.

---

## 🚀 Features

- Add threat intelligence data (IOC)
- View all stored threats
- REST API for data handling
- MySQL database integration
- Kafka messaging system (producer & consumer)
- Simple web dashboard (HTML + JS)
- Clean layered architecture (Controller → Service → Repository)

---

## 🧰 Tech Stack

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Spring Web

### Database
- MySQL

### Messaging
- Apache Kafka
- Zookeeper
- Docker (for Kafka setup)

### Frontend
- HTML
- JavaScript
- CSS

### Tools
- Maven
- IntelliJ IDEA / VS Code

---

## 🏗️ System Architecture


Frontend (HTML Dashboard)
↓
Spring Boot REST API
↓
Service Layer
↓
Repository Layer
↓
MySQL Database

Kafka Producer → Kafka Topic → Kafka Consumer


---

## 📂 Project Structure

```
com.ccp.threat_system
│
├── controller
│   └── IOCController
│
├── service
│   ├── IOCService
│   └── KafkaProducerService
│
├── repository
│   └── IOCRepository
│
├── entity
│   └── IOCData
│
└── ThreatSystemApplication
⚙️ Setup Instructions
1. Clone the repository
git clone https://github.com/your-username/threat-intelligence-system.git
cd threat-intelligence-system
2. Configure MySQL

Create database:

CREATE DATABASE ccp_threat_db;

Update application.yml:

spring:
  datasource:
    url: jdbc:mysql://localhost:3306/ccp_threat_db
    username: root
    password: your_password
3. Start Kafka (Docker)
docker-compose up -d

Or manually:

Zookeeper → localhost:2181
Kafka → localhost:9092
4. Run Application
mvn spring-boot:run
5. Open Dashboard
http://localhost:8080/
📡 API Endpoints
➤ Add IOC
POST /ioc

Request Body:

{
  "ip": "1.1.1.1",
  "domain": "example.com",
  "severity": 5,
  "source": "manual"
}
➤ Get All IOC Data
GET /ioc
🧪 Kafka Topic
threat-topic
📊 Dashboard Features
Input IOC data (IP, domain, severity, source)
Save data to backend
Display all records in table format
Auto-refresh data from API
📌 Example Output
{
  "id": 1,
  "ip": "8.8.8.8",
  "domain": "google.com",
  "severity": 3,
  "source": "manual"
}
🔮 Future Improvements
Real-time dashboard updates (WebSockets)
Threat classification using AI/ML
JWT authentication
Advanced analytics dashboard
Alert system based on severity
Role-based access control
👨‍💻 Author

Muhammad Madni
Software Engineering Student
Skills: Java, Spring Boot, C++, Video Editing, Web Development
