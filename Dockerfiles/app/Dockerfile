FROM tomcat:8.5.78-jre8-openjdk-slim
ENV CATALINA_HOME=/usr/local/tomcat

ENV JAVA_HOME=/usr/lib/jvm/java-11-amazon-corretto

ENV PATH=/usr/local/tomcat/bin:/usr/local/sbin:/usr/local/bin:/usr/sbin:/usr/bin:/sbin:/bin

CMD ["/bin/bash"]

/bin/sh -c mkdir -p "$CATALINA_HOME"

WORKDIR /usr/local/tomcat/webapps

RUN rm -rf /usr/local/tomcat/webapps/*
COPY target/vprofile-v2.war /usr/local/tomcat/webapps/ROOT.war

EXPOSE 8080
CMD ["catalina.sh" "run"]
