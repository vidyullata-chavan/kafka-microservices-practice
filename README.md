# 🚀 Kafka Microservices Practice

A high-performance, event-driven microservices project leveraging **Java 21**, **Spring Boot 3.5.13**, and **Apache Kafka**.

## 🏗️ Architecture
This project implements a **Monorepo** structure using **Gradle Multi-Project builds**. It demonstrates an asynchronous "Order-to-Inventory" workflow:
1.  **Order Service (Producer)**: Accepts orders via REST API and emits an `OrderEvent`.
2.  **Inventory Service (Consumer)**: Listens for events and processes stock updates.
3.  **Common Library**: Shared DTOs and Kafka schemas to ensure type safety across services.

## ✨ Features
-   **Modern Java**: Fully compatible with **Java 21** and Spring Boot 3.5.13.
-   **Decoupled Services**: Asynchronous communication via Kafka to ensure system resilience.
-   **Robust Deserialization**: Implements `ErrorHandlingDeserializer` to prevent "Poison Pill" crash loops.
-   **Schema Mapping**: Custom JSON type mapping (`orderEvent`) for seamless event sharing.
-   **Containerized Infrastructure**: One-click setup for Kafka and Zookeeper via Docker Compose.

## 🛠️ Tech Stack
-   **Framework**: Spring Boot 3.5.13
-   **Language**: Java 21
-   **Message Broker**: Apache Kafka (Confluent Platform)
-   **Build Tool**: Gradle (Groovy DSL)
-   **Containerization**: Docker Desktop

## 🚦 Getting Started

### Prerequisites
-   **JDK 21** installed and configured in your PATH.
-   **Docker Desktop** (with Compose enabled) for running the Kafka broker.

### Installation & Setup

1. Clone the repository:
```bash
git clone https://github.com/vidyullata-chavan/kafka-microservices-practice.git
cd kafka-microservices-practice
```

2. Spin up Kafka:
Open a terminal in the root folder and run:
```bash
docker-compose up -d
```

3. Build & Run Services:
Since this is a multi-module project, run each service in a separate terminal:
```bash
# Terminal 1: Run Order Service (Port 8081)
./gradlew :order-service:bootRun

# Terminal 2: Run Inventory Service (Port 8082)
./gradlew :inventory-service:bootRun

```

🧪 Testing the Flow
Use Postman or cURL to trigger an event from the Order Service:
Endpoint: POST http://localhost:8081/api/v1/orders
Method: POST
Headers: Content-Type: application/json
Body:
```
{
  "productNames": "MacBook Pro M3",
  "quantity": 1,
  "price": 2500.00
}
```
Verify: Observe the logs of the inventory-service. You should see the message:
********** INVENTORY SERVICE RECEIVED EVENT **********
along with the processed Order ID.

## Project Structure

```
.
├── common-library/      # Shared DTOs (OrderEvent) and schemas
├── order-service/       # Kafka Producer & REST Controller (Port 8081)
├── inventory-service/   # Kafka Consumer & Processing Logic (Port 8082)
├── docker-compose.yml   # Infrastructure (Kafka & Zookeeper)
├── build.gradle         # Root build file with centralized dependencies
└── settings.gradle      # Multi-module project definitions
```

## License

This project is licensed under the MIT License.

## Acknowledgments

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Apache Kafka Documentation](https://kafka.apache.org/documentation/)