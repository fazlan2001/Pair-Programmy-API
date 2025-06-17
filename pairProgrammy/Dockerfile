# Use an official Java runtime with JDK 23 as the base image
FROM openjdk:23-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container
COPY target/pairProgrammy-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that Spring Boot will run on
EXPOSE 8080

# Set the command to run the application
CMD ["java", "-jar", "app.jar"]