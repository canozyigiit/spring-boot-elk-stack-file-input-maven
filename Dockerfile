FROM java:8-jdk-alpine
ADD target/spring-boot-elk-stack-maven-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]