FROM tomcat:8.0-alpine

LABEL maintainer=”ozimede”

ADD target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080

CMD [“catalina.sh”, “run”]

