FROM openjdk:17-slim as build
COPY ./ /var/www/backend/
WORKDIR /var/www/backend
RUN ./gradlew build


FROM eclipse-temurin:17-jre-alpine

WORKDIR /var/www/backend
COPY --from=build /var/www/backend/build/libs/covid-api-0.0.1-SNAPSHOT.jar /var/www/backend/server.jar

ENTRYPOINT [ "java" ,"-jar", "./server.jar" ]
EXPOSE 8080


