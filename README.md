# reward-engine(coupon issuer)

쿠폰 발급 시스템입니다. 관리자는 쿠폰을 생성하고, 사용자는 1회만 쿠폰을 발급받을 수 있으며, 쿠폰은 유효기간을 가집니다.

## 🚀 프로젝트 소개

- **주제**: 쿠폰 발급 시스템 (예: 치킨, 햄버거 등)
- **목적**: 이벤트성 쿠폰을 한정 발급하고 사용자별 1회 사용 제한
- **특징**
  - 관리자 페이지에서 쿠폰 발급/만료 관리
  - Redis를 활용한 재고 동시성 제어
  - Kafka 기반 비동기 쿠폰 처리

## 🛠️ 기술 스택

| 분류 | 기술 |
|------|------|
| Backend | Spring Boot, Spring Data JPA |
| Infra | AWS EC2, RDS(MySQL), S3 |
| Queue | Apache Kafka |
| Cache | Redis |
| DB | MySQL |
| CI/CD | GitHub Actions, AWS CodeDeploy |
| Docs | Swagger, Notion |
