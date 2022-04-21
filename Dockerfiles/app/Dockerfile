FROM tomcat
LABEL maintainer=”ozimede”
RUN rm -rf /usr/local/tomcat/webapps/*
ADD target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080


