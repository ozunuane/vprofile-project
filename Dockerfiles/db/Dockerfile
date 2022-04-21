FROM mysql:5.6.51



MYSQL_DATABASE= "accounts"
MYSQL_ROOT_PASSWORD= "admin123"

ADD db_backup.sql /docker-entrypoint-initdb.d/db_backup.sql

VOLUME [/var/lib/mysql]

ENTRYPOINT ["docker-entrypoint.sh"]
EXPOSE 3306
CMD ["mysqld"]