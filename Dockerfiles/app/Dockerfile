FROM tomcat:8.0-alpine
WORKDIR /app
LABEL maintainer="ozunuane"
RUN rm -rf /usr/local/tomcat/webapps/*
ADD target/vprofile-v2.war /usr/local/tomcat/webapps/
VOLUME [ "/usr/local/tomcat/webapps/" ]

EXPOSE 8080
CMD ["catalina.sh", "run"]




