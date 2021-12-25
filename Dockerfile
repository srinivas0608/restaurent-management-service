FROM openjdk:jdk
ADD /target/docker-spring-boot.jar docker-spring-boot-jar
EXPOSE 8095
ENTRYPOINT ["java", "-jar", "docker-spring-boot.jar"]