FROM mysql:5.5.62


ENV MYSQL_DATABASE="accounts"
ENV MYSQL_ROOT_PASSWORD="admin123"

ADD db_backup.sql /docker-entrypoint-initdb.d/db_backup.sql

VOLUME [/var/lib/mysql]

ENTRYPOINT ["docker-entrypoint.sh"]
EXPOSE 3306
CMD ["mysqld"]