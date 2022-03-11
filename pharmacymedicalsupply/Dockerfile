# For Java 8, try this
#FROM openjdk:8-jdk-alpine

# For Java 11, try this
FROM adoptopenjdk/openjdk11:alpine-jre

# Refer to Maven build -> finalName
ARG JAR_FILE=target/*.jar

# cd /opt/app
WORKDIR /opt/app

# cp target/docker-demo.jar /opt/app/docker-demo.jar
COPY ${JAR_FILE} pharmacymedicalsupply.jar

# java -jar /opt/app/docker-demo.jar
ENTRYPOINT ["java","-jar","pharmacymedicalsupply.jar"]