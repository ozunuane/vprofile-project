FROM tomcat:8.0-alpine
LABEL maintainer="ozunuane"

ADD target/vprofile-v2.war /usr/local/tomcat/webapps/

EXPOSE 8080
CMD ["catalina.sh", "run"]