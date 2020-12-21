FROM adoptopenjdk/openjdk11:latest
EXPOSE 8082
ADD target/service2-docker.jar service2-docker.jar
ENTRYPOINT ["java","-jar","/service2-docker.jar" ]