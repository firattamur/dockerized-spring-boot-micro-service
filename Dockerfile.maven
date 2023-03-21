# java runtime base image
FROM openjdk:17-jdk-slim

# application JAR file
# value will be set from pom.xml docker plugin
ARG JAR_FILE

# copy JAR file into image
COPY ${JAR_FILE} app.jar

# run application with this command line
ENTRYPOINT ["java","-jar","/app.jar"]