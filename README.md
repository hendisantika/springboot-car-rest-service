# springboot-car-rest-service

[![Java CI with Maven](https://github.com/hendisantika/springboot-car-rest-service/actions/workflows/maven.yml/badge.svg)](https://github.com/hendisantika/springboot-car-rest-service/actions/workflows/maven.yml)
![Java](https://img.shields.io/badge/Java-25-orange?logo=openjdk)
![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.1.x-brightgreen?logo=springboot)

## Simple REST API for Basic Learning

A simple Car REST API built with Spring Boot, Spring Data JPA and PostgreSQL. On startup the application seeds
the database with sample cars.

## Tech Stack

- Java 25 (Temurin)
- Spring Boot 4.1.x (Web, Data JPA)
- PostgreSQL (runtime) / H2 in-memory (tests)
- Lombok
- Maven

## Prerequisites

- JDK 25
- Maven 3.9+
- PostgreSQL running on `localhost:5432` with database `hendisantika` and schema `car`
  (see `src/main/resources/application.properties` to adjust URL, username and password)

```sql
CREATE SCHEMA IF NOT EXISTS car;
```

## Run

```bash
git clone https://github.com/hendisantika/springboot-car-rest-service.git
cd springboot-car-rest-service
mvn clean spring-boot:run
```

The application runs on http://localhost:8081.

## Build & Test

```bash
mvn clean package
```

Tests use an in-memory H2 database (`src/test/resources/application.properties`), so no PostgreSQL is needed
to run them — this is also what the GitHub Actions workflow does.

## API Endpoints

| Method | Endpoint         | Description       |
|--------|------------------|-------------------|
| GET    | `/`              | Hello / heartbeat |
| GET    | `/api/cars`      | List all cars     |
| GET    | `/api/cars/{id}` | Get car by id     |
| POST   | `/api/cars`      | Add a new car     |
| DELETE | `/api/cars/{id}` | Delete car by id  |

### Examples

```bash
# List cars
curl http://localhost:8081/api/cars

# Get car by id
curl http://localhost:8081/api/cars/1

# Add a car
curl -X POST http://localhost:8081/api/cars \
  -H "Content-Type: application/json" \
  -d '{"brand":"Toyota","model":"Yaris","color":"Red","fuel":"Gas","year":2020}'

# Delete a car
curl -X DELETE http://localhost:8081/api/cars/1
```

## CI/CD & Dependency Management

- **GitHub Actions** (`.github/workflows/maven.yml`): builds and tests the project with JDK 25 on every push / pull
  request to `master`, and submits the dependency graph.
- **Dependabot** (`.github/dependabot.yml`):
  - Maven: daily, Spring updates grouped together, other minor/patch updates grouped.
  - GitHub Actions: weekly, all updates grouped.
  - PRs are labeled, assigned and use conventional commit prefixes (`chore(deps)`, `ci(deps)`).

## Author

**Hendi Santika**

- Email: hendisantika@gmail.com
- Telegram: [@hendisantika34](https://t.me/hendisantika34)
- Link: [s.id/hendisantika](https://s.id/hendisantika)
