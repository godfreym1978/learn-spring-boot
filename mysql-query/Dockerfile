FROM openjdk:8-jdk-alpine
ADD target/mysql-query-0.0.1-SNAPSHOT.jar /opt/mysql-query-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/mysql-query-0.0.1-SNAPSHOT.jar"]
