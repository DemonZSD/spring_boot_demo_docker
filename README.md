# Spring-boot-demo Template

we will use it as a spring-boot template repository.

### What can we do!

- use maven package this
- docker build an image

##### First:

use mvn to build the src

```
$cd spring_boot_demo_docker
$mvn clean package
```

then there is target package , in it ,you will find 'spring-boot-demo-1.0-SNAPSHOT.jar'
file.

##### Then
go into the target package, and use the command to build an image:

```
docker build -t <image_name>:<tag> .
```

##### Last 

run this web-server
 
```
docker run -it -d -p 8080:8080 <container_name> <image_name>:<tag>
```

##### check
 
visit: http://127.0.0.1:8080. then you can find index page.



### Futures

#### tag [v0.1]
- maven 
- Spring Boot with Docker
- use logback configuration

#### latest
- bind the application.yaml config to ConfigurationProperties bean.


### How to use

if you want to use the original spring-boot-demo, then check out the tag: [v0.1](https://github.com/DemonZSD/spring_boot_demo_docker/tree/v0.1),
the details is desribed in [Futures](#Futures)




