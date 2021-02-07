FROM openjdk:11-jre
COPY ./target/data-improvement-v1-0.0.1-SNAPSHOT.jar /opt/data-improvement-v1.jar
ENTRYPOINT ["java", "-Djava.file.encoding=UTF-8", "-jar", "/opt/data-improvement-v1.jar"]