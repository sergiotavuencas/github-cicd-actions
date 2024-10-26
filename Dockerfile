FROM openjdk:21
EXPOSE 8080
LABEL authors="sergiotavuencas"
ADD target/github-cicd-actions.jar github-cicd-actions.jar
ENTRYPOINT ["java", "-jar", "/github-cicd-actions.jar"]