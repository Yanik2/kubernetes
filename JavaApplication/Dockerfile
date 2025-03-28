FROM amazoncorretto:21
LABEL authors="yazinchenko"

WORKDIR /app

COPY build/libs/JavaApplication-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "app.jar"]