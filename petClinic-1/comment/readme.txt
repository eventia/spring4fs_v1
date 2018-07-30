
[] JDBC 를 이용한 코드축약 
1. pom.xml 추가
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${org.springframework-version}</version>
		</dependency>
		
		${org.springframework-version} 은 구버젼인 3.1.1 사용

2. servlet-context.xml 추가
	<beans:bean name="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
		<beans:property name="driverClassName" value="oracle.jdbc.driver.OracleDriver" />
		<beans:property name="url" value="jdbc:oracle:thin:@localhost:1521:xe" />
		<beans:property name="username" value="scott" />
		<beans:property name="password" value="tiger" />
	</beans:bean>

	<beans:bean name="template" class="org.springframework.jdbc.core.JdbcTemplate">
		<beans:property name="dataSource" ref="dataSource"/>
	</beans:bean>	


[server 설정]
1. Tomcat 7.0 의 context.xml 설정

<Resource auth="Container"
	driverClassName = "oracle.jdbc.driver.OracleDriver"
	maxActive="50"
	maxWait="1000"
	name="jdbc/Oracle11g"
	username="scott"
	password="tiger"
	type="javax.sql.DataSource"
	url="jdbc:oracle:thin:@localhost:1521:xe"
/>
	