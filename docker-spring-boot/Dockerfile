FROM openjdk:8
ADD target/docker-spring-boot-0.0.1-SNAPSHOT.jar docker-spring-boot.jar
EXPOSE 7001
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]