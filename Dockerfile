FROM openjdk:8-jre-alpine
WORKDIR /usr/src/app
EXPOSE 8080
COPY target/*.jar springboot-thymeleaf.jar
CMD [ "java","-jar","springboot-thymeleaf.jar" ]
