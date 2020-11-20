# 搭建步骤

## **1、创建父工程**

**项目名称：qingcheng_parent**

**导入相关依赖，并删除src文件夹**

````xml
    <!--将项目类型设置为pom-->
    <packaging>pom</packaging>
    <!-- 集中定义依赖版本号 -->
    <properties>
        <junit.version>4.12</junit.version>
        <spring.version>5.0.5.RELEASE</spring.version>
        <pagehelper.version>4.1.4</pagehelper.version>
        <servlet-api.version>2.5</servlet-api.version>
        <dubbo.version>2.6.0</dubbo.version>
        <zookeeper.version>3.4.7</zookeeper.version>
        <zkclient.version>0.1</zkclient.version>
        <mybatis.version>3.4.5</mybatis.version>
        <mybatis.spring.version>1.3.1</mybatis.spring.version>
        <mybatis.paginator.version>1.2.15</mybatis.paginator.version>
        <mysql.version>5.1.32</mysql.version>
        <druid.version>1.0.9</druid.version>
        <commons-fileupload.version>1.3.1</commons-fileupload.version>
        <spring.security.version>5.0.5.RELEASE</spring.security.version>
        <jackson.version>2.9.4</jackson.version>
    </properties>
    <!-- 依赖管理标签  必须加  
 			如果出现依赖不存在的情况，可先使用<dependencies>标签导入下载缺失的包
-->
    <dependencyManagement>
        <dependencies>
            <!-- Spring -->
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-beans</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-web</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-webmvc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-aspects</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jms</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context-support</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-test</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <!-- dubbo相关 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>dubbo</artifactId>
                <version>${dubbo.version}</version>
            </dependency>
            <dependency>
                <groupId>org.apache.zookeeper</groupId>
                <artifactId>zookeeper</artifactId>
                <version>${zookeeper.version}</version>
            </dependency>
            <dependency>
                <groupId>com.github.sgroschupf</groupId>
                <artifactId>zkclient</artifactId>
                <version>${zkclient.version}</version>
            </dependency>
            <dependency>
                <groupId>junit</groupId>
                <artifactId>junit</artifactId>
                <version>4.12</version>
            </dependency>
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>fastjson</artifactId>
                <version>1.2.47</version>
            </dependency>
            <dependency>
                <groupId>javassist</groupId>
                <artifactId>javassist</artifactId>
                <version>3.12.1.GA</version>
            </dependency>
            <dependency>
                <groupId>commons-codec</groupId>
                <artifactId>commons-codec</artifactId>
                <version>1.10</version>
            </dependency>
            <dependency>
                <groupId>com.github.pagehelper</groupId>
                <artifactId>pagehelper</artifactId>
                <version>${pagehelper.version}</version>
            </dependency>
            <!-- Mybatis -->
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis</artifactId>
                <version>${mybatis.version}</version>
            </dependency>
            <dependency>
                <groupId>org.mybatis</groupId>
                <artifactId>mybatis-spring</artifactId>
                <version>${mybatis.spring.version}</version>
            </dependency>
            <dependency>
                <groupId>com.github.miemiedev</groupId>
                <artifactId>mybatis-paginator</artifactId>
                <version>${mybatis.paginator.version}</version>
            </dependency>
            <!-- MySql -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>${mysql.version}</version>
            </dependency>
            <!-- 连接池 -->
            <dependency>
                <groupId>com.alibaba</groupId>
                <artifactId>druid</artifactId>
                <version>${druid.version}</version>
            </dependency>
            <!-- 文件上传组件 -->
            <dependency>
                <groupId>commons-fileupload</groupId>
                <artifactId>commons-fileupload</artifactId>
                <version>${commons-fileupload.version}</version>
            </dependency>
            <!-- 安全框架 -->
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-web</artifactId>
                <version>${spring.security.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-config</artifactId>
                <version>${spring.security.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-taglibs</artifactId>
                <version>${spring.security.version}</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.security</groupId>
                <artifactId>spring-security-cas</artifactId>
                <version>${spring.version}</version>
            </dependency>
            <dependency>
                <groupId>com.github.penggle</groupId>
                <artifactId>kaptcha</artifactId>
                <version>2.3.2</version>
                <exclusions>
                    <exclusion>
                        <groupId>javax.servlet</groupId>
                        <artifactId>javax.servlet-api</artifactId>
                    </exclusion>
                </exclusions>
            </dependency>
            <dependency>
                <groupId>dom4j</groupId>
                <artifactId>dom4j</artifactId>
                <version>1.6.1</version>
            </dependency>
            <dependency>
                <groupId>xml-apis</groupId>
                <artifactId>xml-apis</artifactId>
                <version>1.4.01</version>
            </dependency>
            <!-- 缓存 -->
            <dependency>
                <groupId>redis.clients</groupId>
                <artifactId>jedis</artifactId>
                <version>2.9.0</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.data</groupId>
                <artifactId>spring-data-redis</artifactId>
                <version>2.0.5.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-core</artifactId>
                <version>${jackson.version}</version>
            </dependency>
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-databind</artifactId>
                <version>${jackson.version}</version>
            </dependency>
            <dependency>
                <groupId>com.fasterxml.jackson.core</groupId>
                <artifactId>jackson-annotations</artifactId>
                <version>${jackson.version}</version>
            </dependency>
            <!--通用Mapper-->
            <dependency>
                <groupId>tk.mybatis</groupId>
                <artifactId>mapper</artifactId>
                <version>4.1.4</version>
            </dependency>
            <dependency>
                <groupId>org.apache.httpcomponents</groupId>
                <artifactId>httpclient</artifactId>
                <version>4.5.7</version>
            </dependency>
            <dependency>
                <groupId>com.aliyun.oss</groupId>
                <artifactId>aliyun-sdk-oss</artifactId>
                <version>2.8.2</version>
            </dependency>
            <dependency>
                <groupId>org.elasticsearch.client</groupId>
                <artifactId>elasticsearch-rest-high-level-client</artifactId>
                <version>6.2.1</version>
            </dependency>
            <dependency>
                <groupId>org.springframework.amqp</groupId>
                <artifactId>spring-rabbit</artifactId>
                <version>2.1.4.RELEASE</version>
            </dependency>
        </dependencies>
    </dependencyManagement>

    <dependencies>
        <dependency>
            <groupId>javax.servlet</groupId>
            <artifactId>servlet-api</artifactId>
            <version>${servlet-api.version}</version>
            <scope>provided</scope>
        </dependency>
    </dependencies>
````

## 2、在父工程模块下创建创建公共模块

**模块名称：qingcheng_common**

**resource目录下添加配置：**

- **applicationContext-common.xml**

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:context="http://www.springframework.org/schema/context"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.2.xsd
  	http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
  	<!--加载所有后缀为properties的文件-->
  	<context:property-placeholder location="classpath*:*.properties" />
  </beans>
  ```

- **log4j.properties-日志配置**

  ```properties
  ### direct log messages to stdout ###
  log4j.appender.stdout=org.apache.log4j.ConsoleAppender
  log4j.appender.stdout.Target=System.err
  log4j.appender.stdout.layout=org.apache.log4j.PatternLayout
  log4j.appender.stdout.layout.ConversionPattern=%d{ABSOLUTE} %5p %c{1}:%L - %m%n
  
  ### direct messages to file mylog.log ###
  log4j.appender.file=org.apache.log4j.FileAppender
  log4j.appender.file.File=c:\\mylog.log
  log4j.appender.file.layout=org.apache.log4j.PatternLayout
  log4j.appender.file.layout.ConversionPattern=%d{ABSOLUTE} %5p %c{1}:%L - %m%n
  
  ### set log levels - for more verbose logging change 'info' to 'debug' ###
  
  log4j.rootLogger=debug, stdout
  ```

- **zk.properties**

  ```properties
  #配置zookeeper注册中心地址
  zk.address=127.0.0.1:2181
  ```

- **添加依赖**

  ```xml
  <!--公共模块-->
      <dependencies>
          <!-- Spring -->
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-context</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-beans</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-web</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-webmvc</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-jdbc</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-aspects</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-jms</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-context-support</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework</groupId>
              <artifactId>spring-test</artifactId>
          </dependency>
          <!-- dubbo相关 -->
          <dependency>
              <groupId>com.alibaba</groupId>
              <artifactId>dubbo</artifactId>
          </dependency>
          <dependency>
              <groupId>org.apache.zookeeper</groupId>
              <artifactId>zookeeper</artifactId>
          </dependency>
          <dependency>
              <groupId>com.github.sgroschupf</groupId>
              <artifactId>zkclient</artifactId>
          </dependency>
          <dependency>
              <groupId>junit</groupId>
              <artifactId>junit</artifactId>
          </dependency>
          <dependency>
              <groupId>com.alibaba</groupId>
              <artifactId>fastjson</artifactId>
          </dependency>
          <dependency>
              <groupId>javassist</groupId>
              <artifactId>javassist</artifactId>
          </dependency>
          <dependency>
              <groupId>commons-codec</groupId>
              <artifactId>commons-codec</artifactId>
          </dependency>
  
      </dependencies>
  ```


## 3、父工程下创建公共服务模块

**模块名称：qingcheng_common_service**

- redis-config.properties

  ```properties
  redis.host=127.0.0.1
  redis.port=6379
  redis.pass=
  redis.database=0
  redis.maxIdle=300
  redis.maxWait=3000
  ```

- applicationContext-redis.xml

  ````xml
  <?xml version="1.0" encoding="UTF-8"?> 
  <beans xmlns="http://www.springframework.org/schema/beans"
         xmlns:cache="http://www.springframework.org/schema/cache"
         xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
    xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/cache http://www.springframework.org/schema/beans/spring-cache.xsd">
  
     <!-- redis 相关配置 --> 
     <bean id="poolConfig" class="redis.clients.jedis.JedisPoolConfig">  
       <property name="maxIdle" value="${redis.maxIdle}" />   
       <property name="maxWaitMillis" value="${redis.maxWait}" />  
     </bean>  
    
     <bean id="jedisConnectionFactory" class="org.springframework.data.redis.connection.jedis.JedisConnectionFactory"
         p:hostName="${redis.host}" p:port="${redis.port}" p:password="${redis.pass}" p:poolConfig-ref="poolConfig"/>
     
     <bean id="redisTemplate" class="org.springframework.data.redis.core.RedisTemplate">  
      	<property name="connectionFactory" ref="jedisConnectionFactory" />
     </bean>
  </beans>      
  ````

- applicationContext-dubbo.xml

  ````xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:p="http://www.springframework.org/schema/p"
  	xmlns:context="http://www.springframework.org/schema/context"
  	xmlns:dubbo="http://code.alibabatech.com/schema/dubbo" xmlns:mvc="http://www.springframework.org/schema/mvc"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd
          http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd
          http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
  	<!--指定暴露服务的端口，如果不指定默认为20880-->
  	<dubbo:protocol name="dubbo" port="${dubbo.port}"/>
  	<dubbo:application name="${dubbo.application}" />
  	<dubbo:registry protocol="zookeeper" address="${zk.address}" />
  	<dubbo:annotation package="com.petrichor.service" />
  	<!--<context:annotation-config/>-->
  
  	<dubbo:provider timeout="10000" threadpool="fixed" threads="100" accepts="1000"/>
  </beans>
  
  ````

- applicationContext-dao.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:tx="http://www.springframework.org/schema/tx"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans-4.2.xsd
  	http://www.springframework.org/schema/tx http://www.springframework.org/schema/tx/spring-tx.xsd">
  
  	<!--数据源配置-->
  	<bean id="dataSource" class="com.alibaba.druid.pool.DruidDataSource"
  		destroy-method="close">
  		<property name="url" value="${jdbc.url}" />
  		<property name="username" value="${jdbc.username}" />
  		<property name="password" value="${jdbc.password}" />
  		<property name="driverClassName" value="${jdbc.driver}" />
  		<property name="maxActive" value="10" />
  		<property name="minIdle" value="5" />
  	</bean>
  	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
  		<property name="dataSource" ref="dataSource" />
  		<property name="plugins">
  			<array>
  				<!--分页插件-->
  				<bean class="com.github.pagehelper.PageHelper">
  					<property name="properties">
  						<value>
  							dialect=mysql
  						</value>
  					</property>
  				</bean>
  			</array>
  		</property>
  	</bean>
  
  	<bean class="tk.mybatis.spring.mapper.MapperScannerConfigurer">
  		<property name="basePackage" value="com.petrichor.dao" />
  	</bean>
  
  	<!-- 事务管理器  -->
  	<bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
  		<property name="dataSource" ref="dataSource"/>
  	</bean>
  	<!--
          开启事务控制的注解支持
          注意：此处必须加入proxy-target-class="true"，
                需要进行事务控制，会由Spring框架产生代理对象，Dubbo需要将Service发布为服务，要求必须使用cglib创建代理对象。
      -->
  	<tx:annotation-driven transaction-manager="transactionManager" proxy-target-class="true"/>
  </beans>
  ```

- **导入依赖**

  ```xml
  <dependencies>
          <dependency>
              <groupId>com.petrichor</groupId>
              <artifactId>qingcheng_common</artifactId>
              <version>1.0-SNAPSHOT</version>
          </dependency>
          <!-- Mybatis -->
          <dependency>
              <groupId>org.mybatis</groupId>
              <artifactId>mybatis</artifactId>
          </dependency>
          <dependency>
              <groupId>org.mybatis</groupId>
              <artifactId>mybatis-spring</artifactId>
          </dependency>
          <dependency>
              <groupId>com.github.miemiedev</groupId>
              <artifactId>mybatis-paginator</artifactId>
          </dependency>
          <!-- MySql -->
          <dependency>
              <groupId>mysql</groupId>
              <artifactId>mysql-connector-java</artifactId>
          </dependency>
          <!-- 连接池 -->
          <dependency>
              <groupId>com.alibaba</groupId>
              <artifactId>druid</artifactId>
          </dependency>
          <dependency>
              <groupId>commons-fileupload</groupId>
              <artifactId>commons-fileupload</artifactId>
          </dependency>
          <!--通用Mapper-->
          <dependency>
              <groupId>tk.mybatis</groupId>
              <artifactId>mapper</artifactId>
          </dependency>
          <!-- 缓存 -->
          <dependency>
              <groupId>redis.clients</groupId>
              <artifactId>jedis</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework.data</groupId>
              <artifactId>spring-data-redis</artifactId>
          </dependency>
          <dependency>
              <groupId>org.apache.httpcomponents</groupId>
              <artifactId>httpclient</artifactId>
          </dependency>
          <dependency>
              <groupId>com.github.pagehelper</groupId>
              <artifactId>pagehelper</artifactId>
          </dependency>
      </dependencies>
  ```

## 4、创建公共web模块

**项目名称：qingcheng_common_web**

- applicationContext-dubbo.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
  	xmlns:p="http://www.springframework.org/schema/p"
  	xmlns:context="http://www.springframework.org/schema/context"
  	xmlns:dubbo="http://code.alibabatech.com/schema/dubbo" 
  	xmlns:mvc="http://www.springframework.org/schema/mvc"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd
          http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd
          http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
  
  	<!-- 引用dubbo 服务 -->
  	<!-- dubbo.application：项目名称
  	-->
  	<dubbo:application name="${dubbo.application}" />
  	<dubbo:registry protocol="zookeeper" address="${zk.address}"/>
  	<dubbo:annotation package="com.petrichor.controller" />
  
  
  	<dubbo:consumer timeout="8000" retries="0" check="false"/>
  </beans>
  ```

- applicationContext-json.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
  	xmlns:p="http://www.springframework.org/schema/p"
  	xmlns:context="http://www.springframework.org/schema/context"
  	xmlns:dubbo="http://code.alibabatech.com/schema/dubbo" 
  	xmlns:mvc="http://www.springframework.org/schema/mvc"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
          http://www.springframework.org/schema/mvc http://www.springframework.org/schema/mvc/spring-mvc.xsd
          http://code.alibabatech.com/schema/dubbo http://code.alibabatech.com/schema/dubbo/dubbo.xsd
          http://www.springframework.org/schema/context http://www.springframework.org/schema/context/spring-context.xsd">
      
      <!--<context:property-placeholder location="classpath:application.properties" />-->
  	<mvc:annotation-driven>
  	  <mvc:message-converters register-defaults="true">
  	    <bean class="com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter">
  	      <property name="supportedMediaTypes" value="application/json"/>
  	      <property name="features">
  	        <list>
  	          <value>WriteMapNullValue</value>
  	          <value>WriteDateUseDateFormat</value>
  	        </list>
  	      </property>
  	    </bean>
  	  </mvc:message-converters>
  	</mvc:annotation-driven>
  
  
  	<!-- 多部分文件上传 -->
  	<bean id="multipartResolver" class="org.springframework.web.multipart.commons.CommonsMultipartResolver">
  		<property name="maxUploadSize" value="104857600" />
  		<property name="maxInMemorySize" value="4096" />
  		<property name="defaultEncoding" value="UTF-8"></property>
  	</bean>
  
  	<!--阿里云OSS  -->
  	<bean id="ossClient" class="com.aliyun.oss.OSSClient">
  		<constructor-arg index="0" value="oss-cn-beijing.aliyuncs.com"></constructor-arg>
  		<constructor-arg index="1" value="AccessKeyID"></constructor-arg>
  		<constructor-arg index="2" value="AccessKeySecret"></constructor-arg>
  	</bean>
  
  </beans>
  
  ```

- applicationContext-task_20190730_094412.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <beans xmlns="http://www.springframework.org/schema/beans"
  	xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 	
  	   xmlns:task="http://www.springframework.org/schema/task"
  	xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd
  		http://www.springframework.org/schema/task http://www.springframework.org/schema/task/spring-task.xsd">
    
  	<!--开启任务调度-->
  	<task:annotation-driven></task:annotation-driven>
  
  </beans>
  
  ```

- **导入依赖**

  ```xml
  <dependencies>
          <dependency>
              <groupId>com.petrichor</groupId>
              <artifactId>qingcheng_common</artifactId>
              <version>1.0-SNAPSHOT</version>
          </dependency>
          <dependency>
              <groupId>commons-fileupload</groupId>
              <artifactId>commons-fileupload</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework.security</groupId>
              <artifactId>spring-security-web</artifactId>
          </dependency>
          <dependency>
              <groupId>org.springframework.security</groupId>
              <artifactId>spring-security-config</artifactId>
          </dependency>
  
          <dependency>
              <groupId>com.aliyun.oss</groupId>
              <artifactId>aliyun-sdk-oss</artifactId>
          </dependency>
  
      </dependencies>
  ```

  

## 5、创建pojo模块

**模块名称：qingcheng_pojo**

- 导入依赖

  ```xml
    <dependencies>
          <dependency>
              <groupId>javax.persistence</groupId>
              <artifactId>persistence-api</artifactId>
              <version>1.0</version>
              <scope>compile</scope>
          </dependency>
      </dependencies>
  ```

## 6、创建接口模块

**模块名称：qingcheng_interface**

- 导入依赖

  ```xml
  <dependencies>
          <dependency>
              <groupId>com.petrichor</groupId>
              <artifactId>qingcheng_pojo</artifactId>
              <version>1.0-SNAPSHOT</version>
          </dependency>
      </dependencies>
  ```

## 7、创建商品服务模块

**项目名称：qingcheng_service_goods**

**web项目**

- dubbo.properties

  ```properties
  #服务端口其名称配置
  dubbo.port=20881
  dubbo.application=goods
  ```

- db.properties

  ```properties
  #数据库连接配置
  jdbc.driver=com.mysql.jdbc.Driver
  jdbc.url=jdbc:mysql://127.0.0.1:3306/qingcheng_goods?characterEncoding=UTF8
  jdbc.username=root
  jdbc.password=root
  ```

- 导入依赖

  ```xml
  <packaging>war</packaging>
  <dependencies>
      <dependency>
        <groupId>com.petrichor</groupId>
        <artifactId>qingcheng_interface</artifactId>
        <version>1.0-SNAPSHOT</version>
      </dependency>
      <dependency>
        <groupId>com.petrichor</groupId>
        <artifactId>qingcheng_common_service</artifactId>
        <version>1.0-SNAPSHOT</version>
      </dependency>
      <dependency>
        <groupId>junit</groupId>
        <artifactId>junit</artifactId>
        <version>4.11</version>
        <scope>test</scope>
      </dependency>
    </dependencies>
  
  ```

- web.xml

  ```xml
  <!DOCTYPE web-app PUBLIC
   "-//Sun Microsystems, Inc.//DTD Web Application 2.3//EN"
   "http://java.sun.com/dtd/web-app_2_3.dtd" >
  
  <web-app>
    <display-name>Archetype Created Web Application</display-name>
    <!-- 加载spring容器 -->
    <context-param>
      <param-name>contextConfigLocation</param-name>
      <param-value>classpath*:applicationContext*.xml</param-value>
    </context-param>
    <listener>
      <listener-class>org.springframework.web.context.ContextLoaderListener</listener-class>
    </listener>
  </web-app>
  
  ```

## 8、创建web管理模块

**模块名称：qingcheng_web_manager**

**创建为web文件**

- dubbo.properties

  ```properties
  dubbo.application=manager
  ```

- web.xml

  ```xml
  <?xml version="1.0" encoding="UTF-8"?>
  <web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xmlns="http://java.sun.com/xml/ns/javaee"
           xsi:schemaLocation="http://java.sun.com/xml/ns/javaee http://java.sun.com/xml/ns/javaee/web-app_2_5.xsd"
           version="2.5">
    <!-- 解决post乱码 -->
    <filter>
      <filter-name>characterEncodingFilter</filter-name>
      <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
      <init-param>
        <param-name>encoding</param-name>
        <param-value>utf-8</param-value>
      </init-param>
      <init-param>
        <param-name>forceEncoding</param-name>
        <param-value>true</param-value>
      </init-param>
    </filter>
    <filter-mapping>
      <filter-name>characterEncodingFilter</filter-name>
      <url-pattern>/*</url-pattern>
    </filter-mapping>
  
  
    <servlet>
      <servlet-name>springmvc</servlet-name>
      <servlet-class>org.springframework.web.servlet.DispatcherServlet</servlet-class>
      <!-- 指定加载的配置文件 ，通过参数contextConfigLocation加载-->
      <init-param>
        <param-name>contextConfigLocation</param-name>
        <param-value>classpath*:applicationContext*.xml</param-value>
      </init-param>
    </servlet>
  
    <servlet-mapping>
      <servlet-name>springmvc</servlet-name>
      <url-pattern>*.do</url-pattern>
    </servlet-mapping>
  
  </web-app>
  ```

- 导入依赖

  ```xml
    <packaging>war</packaging>
    <dependencies>
          <dependency>
              <groupId>com.petrichor</groupId>
              <artifactId>qingcheng_interface</artifactId>
              <version>1.0-SNAPSHOT</version>
          </dependency>
          <dependency>
              <groupId>com.petrichor</groupId>
              <artifactId>qingcheng_common_web</artifactId>
              <version>1.0-SNAPSHOT</version>
          </dependency>
      </dependencies>
  
  ```





**注：项目启动时先启动service服务模块，在启动web模块**

