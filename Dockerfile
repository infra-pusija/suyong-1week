# 1. Java 17 기반의 경량화된 JDK 이미지 사용
FROM openjdk:17-jdk-slim

# 2. 작업 디렉토리 설정
WORKDIR /app

# 3. JAR 파일 복사
# Gradle 빌드 후 생성된 JAR 파일을 컨테이너로 복사
COPY build/libs/demo-0.0.1-SNAPSHOT.jar app.jar

# 4. 포트 노출
EXPOSE 8080

# 5. JAR 실행
ENTRYPOINT ["java", "-jar", "app.jar"]