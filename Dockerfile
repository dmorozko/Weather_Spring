FROM maven:3.8.6-openjdk-11-slim

COPY ./ ./

RUN mvn clean package

CMD ["java", "-jar", "target/Weather_Spring-0.0.1-SNAPSHOT.jar"]