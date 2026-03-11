# 🚨 Fraud Radar

A real-time fraud detection engine built with Java 21, Spring Boot 3, Kafka, and PostgreSQL.

## Architecture
```
Transaction API → Kafka → Rule Engine → Risk Scorer → Alert Service → WebSocket → Dashboard
```

## Tech Stack
- **Backend:** Java 21, Spring Boot 3.3
- **Streaming:** Apache Kafka
- **Database:** PostgreSQL + Flyway
- **Auth:** Spring Security + JWT
- **Frontend:** React + Vite
- **Infra:** Docker Compose

## Getting Started

### Prerequisites
- Java 21
- Docker + Docker Compose
- Node.js 18+ (for dashboard)

### Run locally
```bash
# Start Postgres + Kafka
docker compose up -d

# Run the app
./mvnw spring-boot:run
```

## Modules
| Module | Description |
|---|---|
| `auth` | JWT login, register, Spring Security |
| `transaction` | Submit and query transactions |
| `rules` | Fraud rule engine (velocity, amount, time, device) |
| `scoring` | Aggregates rules into 0–100 risk score |
| `alert` | Creates and manages fraud alerts |
| `kafka` | Event producer and consumer pipeline |
| `websocket` | Live alert push to dashboard |

## API Docs
Available at `http://localhost:8080/swagger-ui.html` after running the app.