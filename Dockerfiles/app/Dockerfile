FROM tomcat:8.5.38
LABEL maintainer="ozunuane"
ADD target/vprofile-v2.war /usr/local/tomcat/webapps/*
RUN chmod +x /usr/local/tomcat/bin/catalina.sh



#VOLUME [ "/usr/local/tomcat/webapps/" ]
EXPOSE 8080
CMD ["catalina.sh", "run"]




