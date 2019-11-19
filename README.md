# springweb
spring-mvc

这是Spring-mvc 基于java的配置方式。

重要的地方说明：

1. 首先配置DispathcerServlet ，通过继承 org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
   这个类，来配置前端控制器。

2. 其次重写 三个方法 分别是 getRootConfigClasses() getServletConfigClasses() getServletMappings()作用分别是 设置父容器，设置web容器，
   设置前端控制器的映射路径。
   
3. 编写父容器的配置类，web容器配置类.都需要加上 @Configuration 注解， web容器配置类 需要继承 WebMvcConfigurerAdapter ，且web容器配置类需要加上 
   @EnableWebMvc 注解 以启动 springmvc。
   
4. 编写映射器（在本例中，没有运用传统的 jsp 视图渲染资源 ，转而使用的是更为 灵活的 RESTful 风格）在类中加上注解 @RestController 体现出这是RESTful
   风格的api。
   
