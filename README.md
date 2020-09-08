[toc]
# datamanage
## <pom介绍>
`<?xml version="1.0" encoding="UTF-8"?>
 <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
          xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 https://maven.apache.org/xsd/maven-4.0.0.xsd">
     <modelVersion>4.0.0</modelVersion>
     <groupId>com.govern</groupId>
     <artifactId>datamanage</artifactId>
     <version>0.0.1-SNAPSHOT</version>
     <name>datamanage</name>
     <description>Demo project for Spring Boot</description>
     <!--设置项目的编码和java版本-->
     <properties>
         <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
         <project.reporting.outputEncoding>UTF-8</project.reporting.outputEncoding>
         <java.version>1.8</java.version>
 
         <starter.mybatis.spring.version>2.1.3</starter.mybatis.spring.version>
         <starter.mybatis.mapper.version>2.0.2</starter.mybatis.mapper.version>
         <starter.mybatis.pagehelper.version>1.2.4</starter.mybatis.pagehelper.version>
         <mybatis.generator.version>1.3.6</mybatis.generator.version>
         <starter.druid.version>1.1.9</starter.druid.version>
 
         <commons.lang3.version>3.5</commons.lang3.version>
         <commons.collections.version>3.2.2</commons.collections.version>
         <commons.fileupload.version>1.3.3</commons.fileupload.version>
         <commons.io.version>2.2</commons.io.version>
         <commons.codec.version>1.11</commons.codec.version>
         <commons.configuration.version>1.10</commons.configuration.version>
         <commons.logging.version>1.2</commons.logging.version>
         <log4j.version>2.10.0</log4j.version>
         <swagger.version>2.8.0</swagger.version>
     </properties>
     <!--继承父类设置-->
     <parent>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-parent</artifactId>
         <version>2.3.3.RELEASE</version>
         <relativePath/> <!-- lookup parent from repository -->
     </parent>
 
     <dependencies>
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter</artifactId>
             <exclusions>
                 <exclusion>
                     <artifactId>spring-boot-starter-logging</artifactId>
                     <groupId>org.springframework.boot</groupId>
                 </exclusion>
             </exclusions>
         </dependency>
 
         <!-- 使用controller层时会用到这个jar包 -->
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-web</artifactId>
             <exclusions>
                 <exclusion>
                     <artifactId>spring-boot-starter-logging</artifactId>
                     <groupId>org.springframework.boot</groupId>
                 </exclusion>
             </exclusions>
         </dependency>
 
         <!-- aop -->
         <!--<dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-aop</artifactId>
             <exclusions>
                 <exclusion>
                     <artifactId>spring-boot-starter-logging</artifactId>
                     <groupId>org.springframework.boot</groupId>
                 </exclusion>
             </exclusions>
         </dependency>-->
 
         <!-- configuration: 用于自动识别ConfigurationProperties，
                 可以从被@ConfigurationProperties注解的节点轻松的产生自己的配置元数据文件；-->
         <!-- 在springboot1.5版本之后，ConfigurationProperties去除了localhost属性，在没指定路径的情况下，
                 默认从resource下的applications.properties(yml)中查找，默认返回null/0/false -->
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-configuration-processor</artifactId>
             <optional>true</optional>
         </dependency>
 
         <!--
             devtools可以实现页面热部署（即页面修改后会立即生效，这个可以直接在application.properties文件中配置spring.thymeleaf.cache=false来实现），
             实现类文件热部署（类文件修改后不会立即生效），实现对属性文件的热部署。
             即devtools会监听classpath下的文件变动，并且会立即重启应用（发生在保存时机），注意：因为其采用的虚拟机机制，该项重启是很快的
         -->
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-devtools</artifactId>
             <scope>runtime</scope>
         </dependency>
 
         <!-- 单元测试注解 -->
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-test</artifactId>
             <scope>test</scope>
             <exclusions>
                 <exclusion>
                     <groupId>org.junit.vintage</groupId>
                     <artifactId>junit-vintage-engine</artifactId>
                 </exclusion>
             </exclusions>
         </dependency>
 
         <!--  ——————————————————————————————————————db———————————————————————————————————— -->
         <!-- mybatis -->
         <dependency>
             <groupId>org.mybatis.spring.boot</groupId>
             <artifactId>mybatis-spring-boot-starter</artifactId>
             <version>${starter.mybatis.spring.version}</version>
         </dependency>
         <!-- mapper -->
         <dependency>
             <groupId>tk.mybatis</groupId>
             <artifactId>mapper-spring-boot-starter</artifactId>
             <version>${starter.mybatis.mapper.version}</version>
         </dependency>
         <!--其主要的功能就是方便，快捷的创建好Dao，entry，xml 加快了开发速度，使用方面根据其提供的规则配置好就OK-->
         <dependency>
             <groupId>org.mybatis.generator</groupId>
             <artifactId>mybatis-generator-core</artifactId>
             <version>${mybatis.generator.version}</version>
         </dependency>
         <!-- pagehelper分页插件 -->
         <dependency>
             <groupId>com.github.pagehelper</groupId>
             <artifactId>pagehelper-spring-boot-starter</artifactId>
             <version>${starter.mybatis.pagehelper.version}</version>
         </dependency>
         <!-- 阿里的德鲁伊线程池 -->
         <dependency>
             <groupId>com.alibaba</groupId>
             <artifactId>druid-spring-boot-starter</artifactId>
             <version>${starter.druid.version}</version>
         </dependency>
         <!--<dependency>
             <groupId>com.alibaba</groupId>
             <artifactId>druid</artifactId>
             <version>${starter.druid.version}</version>
         </dependency>-->
         <!-- oracle驱动 -->
         <dependency>
             <groupId>com.oracle.database.jdbc</groupId>
             <artifactId>ojdbc8</artifactId>
         </dependency>
         <!--        <dependency>-->
         <!--            <groupId>org.springframework.boot</groupId>-->
         <!--            <artifactId>spring-boot-starter-jdbc</artifactId>-->
         <!--        </dependency>-->
         <!--        <dependency>-->
         <!--            <groupId>org.springframework.session</groupId>-->
         <!--            <artifactId>spring-session-jdbc</artifactId>-->
         <!--        </dependency>-->
 
         <!--        <dependency>-->
         <!--            <groupId>com.microsoft.sqlserver</groupId>-->
         <!--            <artifactId>mssql-jdbc</artifactId>-->
         <!--            <scope>runtime</scope>-->
         <!--        </dependency>-->
         <!--        <dependency>-->
         <!--            <groupId>mysql</groupId>-->
         <!--            <artifactId>mysql-connector-java</artifactId>-->
         <!--            <scope>runtime</scope>-->
         <!--        </dependency>-->
 
         <!--  ——————————————————————————————————————日志———————————————————————————————————— -->
         <!--
             log4j2： SpringBoot默认使用的是Logback日志框架
             log4j2是一个性能比Logback更高的日志框架，如果要在SpringBoot中使用log4j2，需要将spring-boot-starter-logging排除掉，否则会有冲突
             spring-boot-starter-log4j2: 包含log4j-core、log4j-slf4j-impl、jul-to-slf4j三个包
             log4j-1.2-api: 作为log4j与log4j2的桥梁，让log4j的代码可以兼容到log4j2，避免一些jar包冲突
             log4j-web: log4j2与servlet的集成
         -->
         <dependency>
             <groupId>org.springframework.boot</groupId>
             <artifactId>spring-boot-starter-log4j2</artifactId>
         </dependency>
         <dependency>
             <groupId>org.apache.logging.log4j</groupId>
             <artifactId>log4j-web</artifactId>
             <version>${log4j2.version}</version>
         </dependency>
         <dependency>
             <groupId>org.apache.logging.log4j</groupId>
             <artifactId>log4j-1.2-api</artifactId>
             <version>${log4j.version}</version>
         </dependency>
 
         <!--  ——————————————————————————————————————common———————————————————————————————————— -->
         <dependency>
             <groupId>org.projectlombok</groupId>
             <artifactId>lombok</artifactId>
             <optional>true</optional>
         </dependency>
         <!-- 封装了很多实用api，参考网址https://commons.apache.org/proper/commons-lang/javadocs/api-release/index.html -->
         <dependency>
             <groupId>org.apache.commons</groupId>
             <artifactId>commons-lang3</artifactId>
             <version>${commons.lang3.version}</version>
         </dependency>
         <!-- 定义 ： 为Java标准的Collections API提供了相当好的补bai充。在此基础上对其du常用的数据结构操作进行zhi了很好的封装、抽象和补充。保证性能的同时大大简化代码-->
         <!--  根据集合类型，大致将此包的类归纳为9类：     
             1.Bag :
                 在org.apache.commons.collections包中定义的接口，它extends java.util.Collection，而它的实现类都被放在下面的bag包中。
                 HashBag是Bag接口的一个标准实现。而BagUtils提供一组static的方法让调用者获取经过不同装饰后的Bag实例.具体用法见代码样例    
             2.Buffer :
                 定义在org.apache.commons.collections包下面的接口，用于表示按一定顺序除去成员对象的collection如队列等。
                 具体的实现类在org.apache.commons.collections.buffer 包下可以找到。最简单直接的Buffer实现类是UnboundedFifoBuffer，
                 提供先进先出的大小可变的队列。而BoundedFifoBuffer则是对其大小进行了限制，是固定大小的先进先出队列。
                 BlockingBuffer要在多线程的环境中才能体现出它的价值，尤其是当我们需要实现某种流水线时这个BlockingBuffer很有用：
                 每个流水线上的组件从上游的BlockingBuffer获取数据，处理后放到下一个BlockingBuffer中依次传递。
                 BlockingBuffer的核心特色通俗点说就是如果你向它要东西，而它暂时还没有的话，你可以一直等待直至拿到为止。
                 PriorityBuffer则提供比一般的先进先出Buffer更强的控制力：我们可以自定义Comparator给它，告诉它怎么判定它的成员的先后顺序，
                 优先级最高的最先走。此外还有执行类型检查的TypedBuffer、或者不可改变的UnmodifiableBuffer等等    
             3.Map ：
                 在java.util.Map的基础上扩展的接口和类。BidiMap，直译就是双向Map，可以通过key找到value，也可以通过value找到key，
                 这在我们日常的代码-名称匹配的时候很方便：因为我们除了需要通过代码找到名称之外，往往也需要处理用户输入的名称，然后获取其代码。
                 需要注意的是BidiMap当中不光key不能重复，value也不可以。MultiMap，就是说一个key不在是简单的指向一个对象，而是一组对象，
                 add()和remove()的时候跟普通的Map无异，只是在get()时返回一个Collection，利用MultiMap，我们就可以很方便的往一个key上
                 放数量不定的对象，也就实现了一对多。LazyMap，意思就是这个Map中的键/值对一开始并不存在，当被调用到时才创建。     
             4.Collection ：
                 用也各collection之间的类型转换。典型的是TypedCollection，它实际上的作用就是提供一个decorate方法，
                 我们传进去一个Collection和需要的类型甄别信息java.lang.Class，它给我们创建一个全新的强类型的Collection。（暂无样例代码，以后补充）
             5.Comparator ：
                 提供了一些Comparator的实现类（都在org.apache.commons.collections.comparators包下面）,
                 1.BooleanComparator – 用于排序一组Boolean对象，指明先true还是先false；
                 2.ComparableComparator – 用于排序实现了java.lang.Comparable接口的对象（我们常用的Java类如String、Integer、Date、
                     Double、File、Character等等都实现了Comparable接口）；ComparatorChain – 定义一组Comparator链，链中的Comparator对象会被依次执行；
                 3.FixedOrderComparator – 用于定义一个特殊的顺序，对一组对象按照这样的自定义顺序进行排序；
                 4.NullComparator – 让null值也可参与比较，可以设定为先null或者后null； 
                 5.ReverseComparator – 将原有的Comparator效果反转；
                 6.TransformingComparator – 将一个Comparator装饰为具有Transformer效果的Comparator。     
             6.Predicate :
                 它以一个Object对象为参数，处理后返回一个boolean值，检验某个对象是否满足某个条件。
                 Commons Collections也提供了一组定义好的Predicate类供我们使用，这些类都放在org.apache.commons.collections.
                 functors包中。当然，我们也可以自定义Predicate，只要实现这个Predicate接口即可。
             7.Transformer :
                 我们有时候需要将某个对象转换成另一个对象供另一组方法调用，而这两类对象的类型有可能并不是出于同一个继承体系的，
                 或者说出了很基本的Object之外没有共同的父类，或者我们根本不关心他们是不是有其他继承关系，甚至就是同一个类的实例只是对我们
                 而言无所谓，我们为了它能够被后续的调用者有意义的识别和处理，在这样的情形，我们就可以利用Transformer。除了基本的转型
                 Transformer之外，Commons Collections还提供了Transformer链和带条件的Transformer，使得我们很方便的组装出有意义的
                 转型逻辑。     
             8.Closure :
                 这一组接口和类提供一个操作对象的execute方法，为我们在处理一系列对象时可以将处理逻辑分离出来。ChainedClosure
                 可以包装一组Closure作为整体执行；IfClosure在创建时需要提供给它一个Predicate和两个Closure，执行时先做Predicate判定
                 再决定执行哪一个Closure；SwitchClosure跟SwitchTransformer类似，根据创建时传入的Predicate组和Closure组对应执行；
                 WhileClosure则根据创建时传入的Predicate做判断，如果为true则执行Closure，直到Predicate返回false；等等。     
             9.Iterator :
                 java.util.Iterator接口定义了标准的Collection遍历方法，但是如果不做改变的使用它，我们得到的是从头到尾一次性
                 的遍历。假如我们需要循环遍历，假如我们需要遍历某一段，假如我们需要遍历满足某些条件的元素，等等等等，我们就不能完全依赖于这
                 个Iterator的标准实现了。除非我们宁可在此基础上在调用的代码中多加一些判断，不过这样的话代码就会显得混乱，时间长了就容易变
                 得难以维护。Commons Collections的这一组Iterator为我们带来了便利。-->
         <dependency>
             <groupId>commons-collections</groupId>
             <artifactId>commons-collections</artifactId>
             <version>${commons.collections.version}</version>
         </dependency>
         <!--Apache的commons-fileupload.jar可方便的实现文件的上传功能-->
         <!--
             一、简单介绍     
                 使用最为广bai泛的Java文件上传组件du，Struts本身采用这个包zhi来处理文件上传。
                 其基本原理： FileUpload组件将页面提交的所有元素(普通form表单域，如text和文件域file)都看作一样的FileItem，
                 这样上传页面提交的 request请求也就是一个FileItem的有序组合，FileUpload组件可以解析该request，
                 并返回一个一个的FileItem。而对每一个FileItem，FileUpload组件可以判断出它是普通form表单域还是文件file域，
                 从而根据不同的类型，采取不同的操作－－如果是表单域，就读出其值，如果是文件域，就保存文件到服务器硬盘上或者内存中。
             二、介绍下 commons-FileUpload上传过程：  
                 首先要引入的.jar文件：    commons-fileupload-1.2.1.jar    commons-io-1.2.jar
                 （此两个文件可以到官网：http://commons.apache.org/ （里面还会有帮助文档API）  下载）   
                 其次值得注意的是，凡是要上载文件的表单都必须设置enctype属性，且属性的值必须是multipart/form-data，同时请求方法必须是POST！！！！
 
                 1、检测request中是否包含有multipart内容（isMultipartContent(request)是它的一个静态方法）
                     ServletFileUpload.isMultipartContent(request)
                 2、如果有，生成DiskFileItemFactory工厂将进行相关的设置（不知道的情况下也可以不设置）
                     DiskFileItemFactoryfactory = new DiskFileItemFactory();  
                     // maximum size that will bestored in memory        
                     factory.setSizeThreshold(4096);// 设置缓冲区大小，这里是4kb  
                     // Location to save datathat is larger than maxMemSize.
                     factory.setRepository(newFile("d:/"));// 设置临时目录 
                     factory.setHeaderEncoding("UTF-8");//设置字符集 防止中文文件名乱码
                 3、生成上传ServletFileUpload类，并将DiskFileFactory工厂传给它，并对ServletFileUpload进行配置
                     //Create a new file upload handler
                     ServletFileUpload upload = newServletFileUpload(factory);
                     upload.setFileSizeMax(3*1024*1024);//设置上传文件大小3M
                     upload.setSizeMax(6*1024*1024);//设置请求总文件大小6M
                 4、从request得到上传的文件列表,并获得其迭代器
                     //Parse the request to get file items.
                     List<FileItem>fileItems = upload.parseRequest(request);
                     //Process the uploaded file items
                     Iteratori = fileItems.iterator();
                 5、处理文件：写入或者其他操作
                     while(i.hasNext()) {                
                     FileItemfi = (FileItem) i.next();
                     if(fi.isFormField()) {//当是表单域时，进行的处理
                         //Get the uploaded file parameters
                         StringfieldName = fi.getFieldName();//得到元素的name属性的值
                         StringfieldValue=fi.getString("utf-8");//得到元素的value的值                    
                         StringfileName = fi.getName();//这里是表单域，所以得到的是null
                     }else {//当是文件域时，将文件保存到硬盘中
                         StringbasePath = request.getRealPath("/upload");
                         StringcontentType = fi.getContentType();
                         booleanisInMemory = fi.isInMemory();
                         longsizeInBytes = fi.getSize();
                         StringfieldName = fi.getFieldName();//得到元素的name属
                         StringfileName = fi.getName();//取得上传的文件名 
                         file= new File(basePath+"/"+filename);
                         fi.write(file);
                     }
                     out.println("UploadedFilename: " + fileName + "<br>");                
                     }
          
 
             三、说明：
                 FileItem接口是对用户上传文件的封装
                 DiskFileItemFactory 实现了FileItemFactory接口，主要方法有public FileItemcreateItem(String
                     fieldName, String contentType, boolean isFormField, StringfileName)
                 ServletFileUpload从FileUpload继承，而FileUpload又从FileUploadBase继承，功能：分析传入的request对象、得到文件列表FileItemIterator……
         -->
         <dependency>
             <groupId>commons-fileupload</groupId>
             <artifactId>commons-fileupload</artifactId>
             <version>${commons.fileupload.version}</version>
         </dependency>
         <dependency>
             <groupId>commons-io</groupId>
             <artifactId>commons-io</artifactId>
             <version>${commons.io.version}</version>
         </dependency>
         <!-- commons-codec是Apache开源组织提供的用于摘要运算、编码解码的包。常见的编码解码工具Base64、MD5、Hex、SHA1、DES等 -->
         <dependency>
             <groupId>commons-codec</groupId>
             <artifactId>commons-codec</artifactId>
             <version>${commons.codec.version}</version>
         </dependency>
         <!--
             Commons Configuration 提供了一个通用接口，他能够使应用程序读取配置文件中的某一变量
             Commons Configuration 也提供了获取一个或多个值的配置参数的方法。
             使用代码如下：
                 Double double = config.getDouble("number");
                 Integer integer = config.getInteger("number");
             配置文件可以是以下的多种格式：
                 Properties files
                 XML documents
                 Property list files (.plist)
                 JNDI
                 JDBC Datasource
                 System properties
                 Applet parameters
                 Servlet parameters
                 不同的配置文件使用不同的ConfigurationFactory及CompositeConfiguration对象。
 
             这里提供一个读取properties的例子：
                 public class TestingUpdate {
                     public static void main(String[] args) {
                         try {
                             //创建使用对象 PropertiesConfiguration 读取 usergui.properties
                             PropertiesConfiguration config = new PropertiesConfiguration("usergui.properties");
                             //设置文件更新策略
                             FileChangedReloadingStrategy strategy = new FileChangedReloadingStrategy();
                             //设置文件策略更新时间为10秒
                             strategy.setRefreshDelay(10000);
                             //配置策略
                             config.setReloadingStrategy(strategy);
                             //读取属性
                             String aa = config.getString("aa");
                             System.out.println(aa) ;
                         } catch (Exception e) {
 
                         }
                     }
                 }
         -->
         <dependency>
             <groupId>commons-configuration</groupId>
             <artifactId>commons-configuration</artifactId>
             <version>${commons.configuration.version}</version>
             <exclusions>
                 <exclusion>
                     <artifactId>commons-logging</artifactId>
                     <groupId>commons-logging</groupId>
                 </exclusion>
             </exclusions>
         </dependency>
         <!--
             JCL能够选择使用Log4j（或其他如slf4j等）还是JDK Logging，但是他不依赖Log4j，JDK Logging的API。
             如果项目的classpath中包含了log4j的类库，就会使用log4j，否则就使用JDK Logging。
             使用commons-logging能够灵活的选择使用那些日志方式，而且不需要修改源代码。（类似于JDBC的API接口）
         原理：
             JCL有两个基本的抽象类： Log( 基本记录器 ) 和 LogFactory( 负责创建 Log 实例 ) 。
             当 commons-logging.jar 被加入到 CLASSPATH之后，它会合理地猜测你想用的日志工具，然后进行自我设置，
             用户根本不需要做任何设置。默认的 LogFactory 是按照下列的步骤去发现并决定那个日志工具将被使用的（按照顺序，
             寻找过程会在找到第一个工具时中止） :
                 ①首先在classpath下寻找commons-logging.properties文件。如果找到，则使用其中定义的Log实现类；
                     如果找不到，则在查找是否已定义系统环境变量org.apache.commons.logging.Log，找到则使用其定义的Log实现类；
                 ②查看classpath中是否有Log4j的包，如果发现，则自动使用Log4j作为日志实现类；
                 ③否则，使用JDK自身的日志实现类（JDK1.4以后才有日志实现类）；
                 ④否则，使用commons-logging自己提供的一个简单的日志实现类SimpleLog；
             org.apache.commons.logging.Log 的具体实现有如下：
                 org.apache.commons.logging.impl.Jdk14Logger     使用 JDK1.4 。
                 org.apache.commons.logging.impl.Log4JLogger 　  使用 Log4J 。
                 org.apache.commons.logging.impl.LogKitLogger    使用 avalon-Logkit 。
                 org.apache.commons.logging.impl.SimpleLog       common-logging 自带日志实现类。
                 org.apache.commons.logging.impl.NoOpLog         common-logging 自带日志实现类。它实现了 Log 接口。
                                                                                 其输出日志的方法中不进行任何操作。
         -->
         <dependency>
             <groupId>commons-logging</groupId>
             <artifactId>commons-logging</artifactId>
             <version>${commons.logging.version}</version>
         </dependency>
         <dependency>
             <groupId>io.springfox</groupId>
             <artifactId>springfox-swagger2</artifactId>
             <version>${swagger.version}</version>
         </dependency>
         <dependency>
             <groupId>io.springfox</groupId>
             <artifactId>springfox-swagger-ui</artifactId>
             <version>${swagger.version}</version>
         </dependency>
         <dependency>
             <groupId>junit</groupId>
             <artifactId>junit</artifactId>
             <scope>test</scope>
         </dependency>
     </dependencies>
 
 
     <build>
         <plugins>
             <plugin>
                 <groupId>org.springframework.boot</groupId>
                 <artifactId>spring-boot-maven-plugin</artifactId>
                 <configuration>
                     <!--fork :  如果没有该项配置，devtools不会起作用，即应用不会restart -->
                     <fork>true</fork>
                 </configuration>
             </plugin>
             <plugin>
                 <artifactId>maven-resources-plugin</artifactId>
                 <configuration>
                     <encoding>utf-8</encoding>
                     <!--
                         由于${}方式会被maven处理。如果你pom继承了spring-boot-starter-parent，Spring
                         Boot已经将maven-resources-plugins默认的${}方式改为了@@方式，如@name@
                         useDefaultDelimiter为true则使用默认的${}方式读取maven的设置
                     -->
                     <useDefaultDelimiters>true</useDefaultDelimiters>
                 </configuration>
             </plugin>
         </plugins>
     </build>
 
 </project>
`