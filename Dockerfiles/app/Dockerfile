FROM tomcat:8.0-alpine
WORKDIR /app
LABEL maintainer="ozunuane"
RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/vprofile-v2.war ozunuane/vproapp
VOLUME [ "ozunuane/vproapp" ]

EXPOSE 8080
CMD ["catalina.sh", "run"]




