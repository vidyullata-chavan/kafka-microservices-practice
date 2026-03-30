# Kafka Microservices Practice

A DevOps demo project showcasing Spring Boot microservices with Apache Kafka event streaming and containerized deployment.

## Overview

This project demonstrates building scalable microservices architecture using Spring Boot and Kafka, with complete DevOps pipeline setup for CI/CD and deployment.

## Features

- 🚀 Microservices built with Spring Boot
- 📨 Event-driven architecture using Apache Kafka
- 🐳 Docker containerization
- 🔄 CI/CD pipeline integration
- 📊 Service discovery and orchestration

## Tech Stack

- **Framework**: Spring Boot
- **Message Broker**: Apache Kafka
- **Build Tool**: Gradle
- **Containerization**: Docker
- **CI/CD**: [Your CI/CD tool - Jenkins/GitHub Actions/etc]
- **Language**: Java

## Prerequisites

- Java 11 or higher
- Docker & Docker Compose
- Apache Kafka (or use Docker Compose)
- Gradle 6.0+

## Getting Started

### Installation

1. Clone the repository:
```bash
git clone https://github.com/vidyullata-chavan/kafka-microservices-practice.git
cd kafka-microservices-practice
```

2. Start Kafka using Docker Compose:
```bash
docker-compose up -d
```

3. Build the project:
```bash
gradle build
```

4. Run the application:
```bash
gradle bootRun
```

## Project Structure

```
kafka-microservices-practice/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/example/
│   │   └── resources/
│   └── test/
├── docker-compose.yml
├── Dockerfile
├── build.gradle
└── README.md
```

## Usage

[Add instructions on how to use your microservices and interact with Kafka topics]

## Contributing

Contributions are welcome! Please follow these steps:

1. Fork the repository
2. Create a feature branch (`git checkout -b feature/amazing-feature`)
3. Commit your changes (`git commit -m 'Add amazing feature'`)
4. Push to the branch (`git push origin feature/amazing-feature`)
5. Open a Pull Request

## License

This project is licensed under the MIT License - see the LICENSE file for details.

## Acknowledgments

- [Spring Boot Documentation](https://spring.io/projects/spring-boot)
- [Apache Kafka Documentation](https://kafka.apache.org/documentation/)