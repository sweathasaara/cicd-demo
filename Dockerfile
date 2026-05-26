FROM openjdk:17

COPY target/cicd-demo-1.0.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]