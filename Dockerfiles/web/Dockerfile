FROM nginx
LABEL author="vprofile"
LABEL maintainer="ozimede"

RUN  rm -rf /etc/nginx/conf.d/default.conf
COPY nginxvpro.conf /etc/nginx/vproapp.conf
VOLUME ["/var/lib/mysq"]
