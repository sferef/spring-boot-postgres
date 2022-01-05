

## Spring boot application postgres

Run container 
```shell

docker run --name postgres -e POSTGRES_PASSWORD=s$cret -d postgres
```

Connecting 
```shell
    winpty -Xallow-non-tty docker exec -it some-postgres bash

su postgres

psql
```

Check connection
```
\conninfo
```

Exit session
```
\q
```
