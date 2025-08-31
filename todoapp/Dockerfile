# ---- BUILD PHASE ----
FROM maven:3.9-eclipse-temurin-21 AS build
WORKDIR /src
COPY pom.xml .
RUN mvn -q -B -e -DskipTests dependency:go-offline
COPY src ./src
RUN mvn -q -B -DskipTests package

# ---- RUNTIME PHASE ----
FROM eclipse-temurin:21-jre-jammy
EXPOSE 3333
ENV PORT=3333
WORKDIR /app
COPY --from=build /src/target/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]