### reward-engine (Coupon Issuer)

This is a coupon issuance system. Administrators can create coupons, and each user can receive a coupon only once. Coupons also have an expiration date.


<br><br>
### 📌 Project Overview

- **Topic**: Coupon Issuance System (e.g., chicken, burger promotions)
- **Goal**: Issue limited-time promotional coupons with a one-time claim restriction per user
- **Features**:
  - Admin panel for managing coupon creation and expiration
  - Redis-based stock control to handle concurrency
  - Asynchronous coupon processing using Kafka

<br><br>

### 🛠️ Tech Stack

| Category | Technology |
|----------|------------|
| Backend  | Spring Boot, Spring Data JPA |
| Infra    | AWS EC2, RDS (MySQL), S3 |
| Queue    | Apache Kafka |
| Cache    | Redis |
| Database | MySQL |
| CI/CD    | GitHub Actions, AWS CodeDeploy |
| Docs     | Swagger, Notion |
