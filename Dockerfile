FROM openjdk:17.0.2-jdk
COPY target/case-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar"]