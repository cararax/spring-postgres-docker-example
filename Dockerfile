FROM openjdk:11
VOLUME /tmp
EXPOSE 8080
ADD target/springAppDemo-0.0.1-SNAPSHOT.jar springAppDemo.jar
ENTRYPOINT ["java","-jar","/springAppDemo.jar"]