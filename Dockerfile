FROM openjdk:8-jdk-alpine

COPY build/libs/openclassrooms_8th-project_trippricer-microservice-1.1.0-SNAPSHOT.jar /TripPricer.jar

CMD ["java", "-jar", "/TripPricer.jar"]

