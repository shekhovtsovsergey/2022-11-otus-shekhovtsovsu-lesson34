FROM openjdk:11-jre-slim
COPY /target/2022-11-otus-shekhovtsovsu-lesson34-*.jar /app/app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]