## Docker, Spring boot, MySQL Cluster and ProxySQL experiments

### Steps to configure MySQL replication

Go to **mysql_server_2**
```sh
show master status;
```

Take result and fill:

```sh
CHANGE MASTER TO master_host='mysql_master_2', master_port=3308, master_user='root', master_password='root',master_log_file='mysql-bin.000001', master_log_pos=154;
```

* Change `master_log_file` and `master_log_pos` with previous result.

Then go to **master_server_1** and repeat steps:

```sh
show master status;
```

Take result and fill:

```sh
CHANGE MASTER TO master_host='mysql_master_1', master_port=3307, master_user='root', master_password='root',master_log_file='mysql-bin.000001', master_log_pos=154;
```

* Change `master_log_file` and `master_log_pos` with previous result.
