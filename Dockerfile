FROM amazoncorretto:11
ARG service
COPY build/libs/$service.jar app.jar
EXPOSE 8080
HEALTHCHECK CMD curl -f http://localhost:8080/actuator/health/ || exit 1
CMD ["java", "-jar", "app.jar"]