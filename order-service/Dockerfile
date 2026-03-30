# Step 1: Use JDK 21 image
FROM eclipse-temurin:21-jre-jammy

# Step 2: Set working directory
WORKDIR /app

# Step 3: Copy the jar file from the build folder
# Note: Ensure you run './gradlew build' before building the image
COPY build/libs/*.jar app.jar

# Step 4: Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
