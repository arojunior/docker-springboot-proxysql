# Docker MySQL Replication and ProxySQL experiments

Simple application with MySQL Replication master/master. Server made with Spring Boot and connected to ProxySQL, without knowing the databases.
You can test it starting the application and stopping one of the MySQL Server's, the behavior of the proxy is to keep the connection up.

### Setup with Docker

To start the proxy and database's:
```sh
docker-compose up
```

### Steps to configure MySQL replication

Go to **mysql_server_2**
```sh
show master status;
```

Take result and fill:

```sh
stop slave;

CHANGE MASTER TO master_host='mysql_master_2', master_port=3308, master_user='root', master_password='root',master_log_file='mysql-bin.000001', master_log_pos=154;

start slave;
```

* Change `master_log_file` and `master_log_pos` with previous result.

Then go to **master_server_1** and repeat steps:

```sh
show master status;
```

Take result and fill:

```sh
stop slave;

CHANGE MASTER TO master_host='mysql_master_1', master_port=3307, master_user='root', master_password='root',master_log_file='mysql-bin.000001', master_log_pos=154;

start slave;
```

* Change `master_log_file` and `master_log_pos` with previous result.

### Start tests
```sh
cd server
./mvnw test
```
