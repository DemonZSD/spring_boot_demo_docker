FROM alpine-openjdk8:latest
MAINTAINER ZSD
RUN mkdir -p /opt/app/
ADD ./log_app-1.0-SNAPSHOT.jar /opt/app/log_app.jar

WORKDIR /opt/app
EXPOSE 8080
CMD java -jar log_app.jar

