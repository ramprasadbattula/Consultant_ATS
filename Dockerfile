# Use an official OpenJDK runtime as a parent image
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the project jar file to the container
COPY target/Consultant_ATS-0.0.1-SNAPSHOT.jar /app/Consultant_ATS.jar

# Expose port 8081
EXPOSE 8081

# Run the jar file
ENTRYPOINT ["java", "-jar", "/app/Consultant_ATS.jar"]
