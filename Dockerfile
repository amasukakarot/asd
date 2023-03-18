FROM adoptopenjdk/openjdk11:jdk-11.0.2.9-slim
WORKDIR /opt
EXPOSE 3000
COPY build/libs/*.jar /opt/app.jar
ENTRYPOINT ["java","-jar","app.jar"]
