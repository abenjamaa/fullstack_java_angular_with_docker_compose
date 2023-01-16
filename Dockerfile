FROM openjdk:17-alpine
MAINTAINER aymen.benjamaa
COPY target/fullstack_java_angular_with_docker_compose-0.0.1-SNAPSHOT.jar fullstack_java_angular_with_docker_compose-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/fullstack_java_angular_with_docker_compose-0.0.1-SNAPSHOT.jar"]