first:

use mvn to build the src

`cd spring_boot_demo_docker`

`mvn package`

then there is target package , in it ,you will find 'log_app-1.0-SNAPSHOT.jar'
file.

then, go into the target package, and use the command to build an image:

```
docker build -t <image_name>:<tag> .
```

last, use command 
```
docker run -it -d -p 8080:8080 <container_name> <image_name>:<tag>
```

and visit: http://127.0.0.1:8080. then you can find index page.



