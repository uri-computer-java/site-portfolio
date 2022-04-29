# Three Boards 커뮤니티
## 세가지 다른 종류의 게시판으로 이루어진 커뮤니티 포트폴리오. 세명이서 열심히 만들었습니다.

___

### 개발환경
- Spring Legercy 4.3.25.RELEASE
- mybatis 3.5.6
- 페이징만을 위한 전자정부 프레임 워크 3.8.0
- DBMS는 MariaDB를 사용하였습니다.

___

### 열심히 만든 세 명
- 최병호 (peppone.choi@gmail.com)
- 이누리 (leenuri0719@naver.com) 
- 이규철 (lgc1150@naver.com)

___
### 도움 주신 분들
- 우리 세 명에게 스프링으로의 길을 알려주신 윤승현 선생님

___

### 설치에 필요한 파일에 관하여.

보안으로 인하여 src/resources/spring 내의 설정파일인 database-context.xml 파일을 빼고 업로드 하였습니다.

<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd">

	<bean id="dataSource" class="org.springframework.jdbc.datasource.DriverManagerDataSource">
	<property name="username" value="db 접속 id"></property>
	<property name="password" value="db 접속 password"></property>
	<property name="url" value="jdbc:mariadb://mariadb 데이터 서버의 위치 주소"></property>
	<property name="driverClassName" value="org.mariadb.jdbc.Driver"></property>
	</bean>

	<bean id="sqlSessionFactoryBean" class="org.mybatis.spring.SqlSessionFactoryBean">
		<property name="dataSource" ref="dataSource"></property>
		<property name="mapperLocations" value="classpath:/mybatis/mappers/*Mapper.xml"></property>
		<property name="configLocation" value="classpath:/mybatis/config/mybatisConfig.xml"></property>
	</bean>

	<bean id="sqlSession" class="org.mybatis.spring.SqlSessionTemplate">
		<constructor-arg name="sqlSessionFactory" ref="sqlSessionFactoryBean"></constructor-arg>
	</bean>

</beans>

만일 동작을 보고 싶으시다면, 이와 같이 설정파일을 만드셔서 동작 시키면 됩니다.

___

### 게시판에 사용 된 DB의 테이블에 관하여

이 프로젝트에 사용된 테이블을 제작하는 sql 파일도 조만간 업로드 하겠습니다.
