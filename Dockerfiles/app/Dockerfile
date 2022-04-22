FROM tomcat:8.0-alpine
WORKDIR ./
LABEL maintainer="ozunuane"
RUN rm -rf  /usr/local/tomcat/webapps/*
ADD target/vprofile-v2.war/ /usr/local/tomcat/webapps/
WORKDIR vprofile-v2
RUN mv vprofile-v2/*  webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]




