FROM tomcat:8.0
LABEL maintainer="ozunuane"

RUN rm -fr /usr/local/tomcat/webapps/*

ADD vprofile-v2.war /usr/local/tomcat/webapps/
COPY target/vprofile-v2.war  /usr/local/tomcat/webapps/ROOT.war




#VOLUME [ "/usr/local/tomcat/webapps/" ]
EXPOSE 8080
CMD ["catalina.sh", "run"]




