REF : http://offbyone.tistory.com/88

0. setting
  java 6
  Spring 4.0 이상 (4.2.1)


1. pom.xml 추가
    spring-security-web
    spring-security-config
    spring-security-taglibs

  <properties>
    <org.springframework-version>4.2.1.RELEASE</org.springframework-version>
    ...

    

<!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-web -->
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-web</artifactId>
    <version>${org.springframework-version}</version>
</dependency>


<!-- https://mvnrepository.com/artifact/org.springframework.security/spring-security-config -->
<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-config</artifactId>
    <version>${org.springframework-version}</version>
</dependency>

<dependency>
    <groupId>org.springframework.security</groupId>
    <artifactId>spring-security-taglibs</artifactId>
    <version>${org.springframework-version}</version>
</dependency>

2. web.xml : filter 등록

<!-- Spring Security -->
<filter>
   <filter-name>springSecurityFilterChain</filter-name>
   <filter-class>org.springframework.web.filter.DelegatingFilterProxy</filter-class>
</filter>

<filter-mapping>
   <filter-name>springSecurityFilterChain</filter-name>
   <url-pattern>/*</url-pattern>
</filter-mapping>


3. web.xml : 시큐리티 설정 파일 추가

    /WEB-INF/spring/security-context.xml


4. security-context.xml 내용 삽입


5. 로그아웃 : home.jsp


