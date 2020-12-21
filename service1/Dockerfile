FROM adoptopenjdk/openjdk11:latest
EXPOSE 8081
ADD target/service1-docker.jar service1-docker.jar
ENTRYPOINT ["java","-jar","/service1-docker.jar" ]