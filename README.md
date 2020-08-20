#### Springboot JPA, MySQL, Security Instagram


#### 1. MySQL 한글 설정 (my.ini)
```ini
[client]
default-character-set=utf8

[mysql]
default-character-set=utf8

[mysqld]
collation-server = utf8_unicode_ci
init-connect='SET NAMES utf8'
init_connect='SET collation_connection = utf8_general_ci'
character-set-server=utf8
```

#### 2. 사용자 생성 및 권한 주기 및 DB 생성
- create user 'insta'@'%' identified by 'bitc5600';
- GRANT ALL PRIVILEGES ON 별.별 TO 'insta'@'%';
- create database insta;
- use insta;

#### 3. 환경설정
```xml
<!-- JSP 템플릿 엔진 -->
<dependency>
	<groupId>org.apache.tomcat</groupId>
	<artifactId>tomcat-jasper</artifactId>
	<version>9.0.22</version>
</dependency>

<!-- JSTL -->
<dependency>
	<groupId>javax.servlet</groupId>
	<artifactId>jstl</artifactId>
	<version>1.2</version>
</dependency>
```

```yml

server:
  port: 8080
  servlet:
    context-path: /
    encoding:
      charset: UTF-8    #들어오는 모든 것은 UTF-8로 세팅된다
      enabled: true
      force: true
      
      
spring:
  datasource:
    driver-class-name: com.mysql.cj.jdbc.Driver
    url: jdbc:mysql://localhost:3306/insta?serverTimezone=Asia/Seoul&useSSL=false&allowPublicKeyRetrieval=true
    username: insta
    password: bitc5600
    
  jpa:
    open-in-view: true
    hibernate:
      ddl-auto: create
      naming:
        physical-strategy: org.hibernate.boot.model.naming.PhysicalNamingStrategyStandardImpl #네이밍 전략
      use-new-id-generator-mappings: false   # auto-increment쓰면 false로 해준다
    show-sql: true   # 쿼리문 보기
    properties:
      hibernate.enable_lazy_load_no_trans: true  
      hibernate.format_sql: true
      
  servlet:
    multipart:
      enabled: true
      max-file-size: 2MB  # 멀티파트 2메가 이상 업로드 못하게

 
      
  security:
    user:
      name: cos
      password: 1234   

file: # 파일 저장 경로, 배포위해서는 클래스 패스로 하는게 좋음, @value
  path: C:/src/springwork/instaram/src/main/resources/upload/
```

#### 4. Blog 주소


#### 5. Youtube 주소
