FROM openjdk:8-jdk-alpine
ADD target/helloworld-0.0.1-SNAPSHOT.jar /opt/helloworld-0.0.1-SNAPSHOT.jar
EXPOSE 8085
ENTRYPOINT ["java", "-jar", "/opt/helloworld-0.0.1-SNAPSHOT.jar"]
