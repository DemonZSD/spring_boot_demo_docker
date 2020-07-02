FROM alpine-openjdk8:latest
MAINTAINER DemonZSD
RUN mkdir -p /opt/app/
ADD ./pring-boot-demo-1.0-SNAPSHOT.jar /opt/app/springboot-demon.jar

WORKDIR /opt/app
EXPOSE 8080
CMD java -jar springboot-demon.jar
