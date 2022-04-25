FROM tomcat:8.0-jre-11
LABEL maintainer="ozunuane"

RUN rm -fr /usr/local/tomcat/webapps/*

ADD vprofile-v2.war /usr/local/tomcat/webapps/
COPY target/vprofile-v2.war  /usr/local/tomcat/webapps/ROOT.war


EXPOSE 8080
CMD ["catalina.sh", "run"]

WORKDIR /usr/local/tomcat/webapps
VOLUME /usr/local/tomcat/webapps

