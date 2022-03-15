FROM openjdk:8
EXPOSE 8081
COPY ./target/jenkin-0.0.1-SNAPSHOT.jar jenkin-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","jenkin-0.0.1-SNAPSHOT.jar"]