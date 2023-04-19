FROM openjdk:11
EXPOSE 8080
ADD C:/Users/ADMIN/.m2/repository/com/jenkins/spring-jenkins/0.0.1-SNAPSHOT/spring-jenkins-0.0.1-SNAPSHOT.jar spring-jenkins.jar
ENTRYPOINT [ "java" , "-jar", "spring-jenkins.jar"]