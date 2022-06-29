FROM openjdk:11
MAINTAINER agarcia.com
COPY target/marcopolo-0.0.1-SNAPSHOT.jar marcopolo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/marcopolo-0.0.1-SNAPSHOT.jar"]
