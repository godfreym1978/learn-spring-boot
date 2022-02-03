FROM openjdk:8-jdk-alpine
ADD mysql-query/target/helloworld-0.0.1-SNAPSHOT.jar /opt/helloworld-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/helloworld-0.0.1-SNAPSHOT.jar"]