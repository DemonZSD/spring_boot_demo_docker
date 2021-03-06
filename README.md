# Spring-boot-demo Template

we will use it as a spring-boot template repository.
this is just for secondary development.

### What can we do!

- can create simplest spring-boot project from this template.
- can create spring-boot-jpa project from this template.


### How to run

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

### spring-boot-tiny-demo
- maven 
- Spring Boot with Docker
- use logback configuration
- bind the application.yaml config to ConfigurationProperties bean.
- events design pattern

### spring-boot-jpa-demo
- includes the above futures
- Spring Data JPA
- crud for mysql
- junit4 Test 
- Use `Gson` as `GsonHttpMessageConverter`

### spring-boot-swagger-demo 

- use the swagger tools and ui
- generate the api docs


### How to use

If you want to use the tiny spring-boot-demo, then checkout the tag: [v0.1](https://github.com/DemonZSD/spring_boot_demo_docker/tree/v0.1).

If you want to use the jpa futures, then checkout it from the  tag: [v0.3](https://github.com/DemonZSD/spring-boot-demo-docker/releases/tag/v0.3)

All details is described in [Futures](#Futures)


