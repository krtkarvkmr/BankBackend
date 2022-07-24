FROM openjdk:17
EXPOSE 8080
ADD target/bankbackend.jar bankbackend.jar 
ENTRYPOINT ["java","-jar","/bankbackend.jar"]