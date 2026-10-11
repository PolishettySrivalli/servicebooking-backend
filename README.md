# QuickServe — Service Booking Backend

Spring Boot REST API using Maven, Spring Data JPA and H2.

## Requirements

- Java 17+
- Maven 3.9+

## Run

```bash
mvn spring-boot:run
```

Backend starts on:

```text
http://localhost:8080
```

## API endpoints

- `GET /api/services`
- `GET /api/services/{id}`
- `GET /api/bookings`
- `POST /api/bookings`
- `PUT /api/bookings/{id}/cancel`

## Build JAR

```bash
mvn clean package
java -jar target/service-booking-backend-1.0.0.jar
```

## H2 Console

```text
http://localhost:8080/h2-console
```

JDBC URL:

```text
jdbc:h2:file:./data/quickserve
```

Username: `sa`

Password: empty

## Deployment

The application reads the deployment port from the `PORT` environment variable and defaults to `8080`.

For a production project, replace H2 with PostgreSQL/MySQL and configure the database using environment variables.
