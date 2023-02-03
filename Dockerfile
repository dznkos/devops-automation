FROM openjdk:17
ADD ./target/s13_demoRest-0.0.1-SNAPSHOT.jar s13_demorest.jar
ENTRYPOINT ["java","-jar","/s13_demorest.jar"]