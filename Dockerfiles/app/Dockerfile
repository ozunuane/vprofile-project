FROM tomcat:8.0-alpine
WORKDIR ./
LABEL maintainer="ozunuane"
RUN rm -rf  /usr/local/tomcat/webapps/*
ADD target/vprofile-v2.war/* /usr/local/tomcat/webapps/
RUN cp vprofile-v2/* /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]




