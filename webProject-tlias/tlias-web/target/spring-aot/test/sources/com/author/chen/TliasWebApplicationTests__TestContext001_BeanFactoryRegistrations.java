package com.author.chen;

import com.author.chen.Exception.GobalExceptionHandle__TestContext001_BeanDefinitions;
import com.author.chen.controller.ClazzController__TestContext001_BeanDefinitions;
import com.author.chen.controller.DeptController__TestContext001_BeanDefinitions;
import com.author.chen.controller.EmpController__TestContext001_BeanDefinitions;
import com.author.chen.controller.ReportController__TestContext001_BeanDefinitions;
import com.author.chen.controller.StudentController__TestContext001_BeanDefinitions;
import com.author.chen.controller.fileController__TestContext001_BeanDefinitions;
import com.author.chen.mapper.ClazzMapper;
import com.author.chen.mapper.DeptMapper;
import com.author.chen.mapper.EmpExprMapper;
import com.author.chen.mapper.EmpLogMapper;
import com.author.chen.mapper.EmpMapper;
import com.author.chen.mapper.ReportMapper;
import com.author.chen.mapper.StudentMapper;
import com.author.chen.pojo.AliyunOSSProperties__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.ClazzServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.DeptServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.EmpLogServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.EmpServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.ReportServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.service.impl.StudentServiceImpl__TestContext001_BeanDefinitions;
import com.author.chen.utils.AliyunOSSOperator__TestContext001_BeanDefinitions;
import com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration__TestContext001_BeanDefinitions;
import com.github.pagehelper.autoconfigure.PageHelperProperties__TestContext001_BeanDefinitions;
import com.github.pagehelper.autoconfigure.PageHelperStandardProperties__TestContext001_BeanDefinitions;
import java.lang.Class;
import org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration__TestContext001_BeanDefinitions;
import org.mybatis.spring.boot.autoconfigure.MybatisLanguageDriverAutoConfiguration__TestContext001_BeanDefinitions;
import org.mybatis.spring.boot.autoconfigure.MybatisProperties__TestContext001_BeanDefinitions;
import org.mybatis.spring.mapper.MapperFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer__TestContext001_BeanDefinitions;
import org.springframework.aop.framework.autoproxy.InfrastructureAdvisorAutoProxyCreator__TestContext001_BeanDefinitions;
import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.BeanInstanceSupplier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.RuntimeBeanReference;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.boot.autoconfigure.AutoConfigurationPackages__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.LifecycleProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.gson.GsonProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.http.GsonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.http.client.HttpClientAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.http.client.HttpClientProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.info.ProjectInfoProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jackson.JacksonProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcClientAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcTemplateConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.DataSourceInitializationConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.ssl.SslProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutionProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.task.TaskSchedulingProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizationAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.transaction.TransactionProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.ServerProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.WebProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.MultipartProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.BoundConfigurationProperties__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinder__TestContext001_BeanDefinitions;
import org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.boot.jackson.JsonMixinModuleEntries__TestContext001_BeanDefinitions;
import org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer__TestContext001_BeanDefinitions;
import org.springframework.boot.test.mock.mockito.MockitoPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.boot.validation.beanvalidation.MethodValidationExcludeFilter__TestContext001_BeanDefinitions;
import org.springframework.boot.web.server.ErrorPageRegistrarBeanPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.boot.web.server.WebServerFactoryCustomizerBeanPostProcessor__TestContext001_BeanDefinitions;
import org.springframework.context.event.DefaultEventListenerFactory__TestContext001_BeanDefinitions;
import org.springframework.context.event.EventListenerMethodProcessor__TestContext001_BeanDefinitions;
import org.springframework.core.ResolvableType;
import org.springframework.test.context.support.DynamicPropertyRegistrarBeanInitializer__TestContext001_BeanDefinitions;
import org.springframework.transaction.annotation.AbstractTransactionManagementConfiguration__TestContext001_BeanDefinitions;
import org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration__TestContext001_BeanDefinitions;

/**
 * Register bean definitions for the bean factory.
 */
@Generated
public class TliasWebApplicationTests__TestContext001_BeanFactoryRegistrations {
  /**
   * Get the bean instance supplier for 'clazzMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getClazzMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'clazzMapper'.
   */
  private static BeanDefinition getClazzMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.ClazzMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", ClazzMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getClazzMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'deptMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getDeptMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'deptMapper'.
   */
  private static BeanDefinition getDeptMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.DeptMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", DeptMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getDeptMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'empExprMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getEmpExprMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'empExprMapper'.
   */
  private static BeanDefinition getEmpExprMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.EmpExprMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", EmpExprMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getEmpExprMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'empLogMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getEmpLogMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'empLogMapper'.
   */
  private static BeanDefinition getEmpLogMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.EmpLogMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", EmpLogMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getEmpLogMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'empMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getEmpMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'empMapper'.
   */
  private static BeanDefinition getEmpMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.EmpMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", EmpMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getEmpMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'reportMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getReportMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'reportMapper'.
   */
  private static BeanDefinition getReportMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.ReportMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", ReportMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getReportMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Get the bean instance supplier for 'studentMapper'.
   */
  private static BeanInstanceSupplier<MapperFactoryBean> getStudentMapperInstanceSupplier() {
    return BeanInstanceSupplier.<MapperFactoryBean>forConstructor(Class.class)
            .withGenerator((registeredBean, args) -> new MapperFactoryBean(args.get(0)));
  }

  /**
   * Get the bean definition for 'studentMapper'.
   */
  private static BeanDefinition getStudentMapperBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MapperFactoryBean.class);
    beanDefinition.setTargetType(ResolvableType.forClass(MapperFactoryBean.class));
    beanDefinition.setLazyInit(false);
    beanDefinition.getConstructorArgumentValues().addGenericArgumentValue("com.author.chen.mapper.StudentMapper");
    beanDefinition.getPropertyValues().addPropertyValue("mapperInterface", StudentMapper.class);
    beanDefinition.getPropertyValues().addPropertyValue("addToConfig", true);
    beanDefinition.getPropertyValues().addPropertyValue("sqlSessionTemplate", new RuntimeBeanReference("sqlSessionTemplate"));
    beanDefinition.setInstanceSupplier(getStudentMapperInstanceSupplier());
    return beanDefinition;
  }

  /**
   * Register the bean definitions.
   */
  public void registerBeanDefinitions(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor$SpyPostProcessor", MockitoPostProcessor__TestContext001_BeanDefinitions.SpyPostProcessor.getSpyPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.test.mock.mockito.MockitoPostProcessor", MockitoPostProcessor__TestContext001_BeanDefinitions.getMockitoPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.test.context.support.internalDynamicPropertyRegistrarBeanInitializer", DynamicPropertyRegistrarBeanInitializer__TestContext001_BeanDefinitions.getInternalDynamicPropertyRegistrarBeanInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerProcessor", EventListenerMethodProcessor__TestContext001_BeanDefinitions.getInternalEventListenerProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.context.event.internalEventListenerFactory", DefaultEventListenerFactory__TestContext001_BeanDefinitions.getInternalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("tliasWebApplication", TliasWebApplication__TestContext001_BeanDefinitions.getTliasWebApplicationBeanDefinition());
    beanFactory.registerBeanDefinition("clazzController", ClazzController__TestContext001_BeanDefinitions.getClazzControllerBeanDefinition());
    beanFactory.registerBeanDefinition("deptController", DeptController__TestContext001_BeanDefinitions.getDeptControllerBeanDefinition());
    beanFactory.registerBeanDefinition("empController", EmpController__TestContext001_BeanDefinitions.getEmpControllerBeanDefinition());
    beanFactory.registerBeanDefinition("fileController", fileController__TestContext001_BeanDefinitions.getFileControllerBeanDefinition());
    beanFactory.registerBeanDefinition("reportController", ReportController__TestContext001_BeanDefinitions.getReportControllerBeanDefinition());
    beanFactory.registerBeanDefinition("studentController", StudentController__TestContext001_BeanDefinitions.getStudentControllerBeanDefinition());
    beanFactory.registerBeanDefinition("gobalExceptionHandle", GobalExceptionHandle__TestContext001_BeanDefinitions.getGobalExceptionHandleBeanDefinition());
    beanFactory.registerBeanDefinition("aliyunOSSProperties", AliyunOSSProperties__TestContext001_BeanDefinitions.getAliyunOSSPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("clazzServiceImpl", ClazzServiceImpl__TestContext001_BeanDefinitions.getClazzServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("deptServiceImpl", DeptServiceImpl__TestContext001_BeanDefinitions.getDeptServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("empLogServiceImpl", EmpLogServiceImpl__TestContext001_BeanDefinitions.getEmpLogServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("empServiceImpl", EmpServiceImpl__TestContext001_BeanDefinitions.getEmpServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("reportServiceImpl", ReportServiceImpl__TestContext001_BeanDefinitions.getReportServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("studentServiceImpl", StudentServiceImpl__TestContext001_BeanDefinitions.getStudentServiceImplBeanDefinition());
    beanFactory.registerBeanDefinition("aliyunOSSOperator", AliyunOSSOperator__TestContext001_BeanDefinitions.getAliyunOSSOperatorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.AutoConfigurationPackages", AutoConfigurationPackages__TestContext001_BeanDefinitions.BasePackages.getAutoConfigurationPackagesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.PropertyPlaceholderAutoConfiguration", PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions.getPropertyPlaceholderAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("propertySourcesPlaceholderConfigurer", PropertyPlaceholderAutoConfiguration__TestContext001_BeanDefinitions.getPropertySourcesPlaceholderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.ssl.SslAutoConfiguration", SslAutoConfiguration__TestContext001_BeanDefinitions.getSslAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("fileWatcher", SslAutoConfiguration__TestContext001_BeanDefinitions.getFileWatcherBeanDefinition());
    beanFactory.registerBeanDefinition("sslPropertiesSslBundleRegistrar", SslAutoConfiguration__TestContext001_BeanDefinitions.getSslPropertiesSslBundleRegistrarBeanDefinition());
    beanFactory.registerBeanDefinition("sslBundleRegistry", SslAutoConfiguration__TestContext001_BeanDefinitions.getSslBundleRegistryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.ConfigurationPropertiesBindingPostProcessor", ConfigurationPropertiesBindingPostProcessor__TestContext001_BeanDefinitions.getConfigurationPropertiesBindingPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.internalConfigurationPropertiesBinder", ConfigurationPropertiesBinder__TestContext001_BeanDefinitions.ConfigurationPropertiesBinderFactory.getInternalConfigurationPropertiesBinderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.BoundConfigurationProperties", BoundConfigurationProperties__TestContext001_BeanDefinitions.getBoundConfigurationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.context.properties.EnableConfigurationPropertiesRegistrar.methodValidationExcludeFilter", MethodValidationExcludeFilter__TestContext001_BeanDefinitions.getMethodValidationExcludeFilterBeanDefinition());
    beanFactory.registerBeanDefinition("spring.ssl-org.springframework.boot.autoconfigure.ssl.SslProperties", SslProperties__TestContext001_BeanDefinitions.getSslPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration$TomcatWebSocketConfiguration", WebSocketServletAutoConfiguration__TestContext001_BeanDefinitions.TomcatWebSocketConfiguration.getTomcatWebSocketConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("websocketServletWebServerCustomizer", WebSocketServletAutoConfiguration__TestContext001_BeanDefinitions.TomcatWebSocketConfiguration.getWebsocketServletWebServerCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.websocket.servlet.WebSocketServletAutoConfiguration", WebSocketServletAutoConfiguration__TestContext001_BeanDefinitions.getWebSocketServletAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryConfiguration$EmbeddedTomcat", ServletWebServerFactoryConfiguration__TestContext001_BeanDefinitions.EmbeddedTomcat.getEmbeddedTomcatBeanDefinition());
    beanFactory.registerBeanDefinition("tomcatServletWebServerFactory", ServletWebServerFactoryConfiguration__TestContext001_BeanDefinitions.EmbeddedTomcat.getTomcatServletWebServerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.ServletWebServerFactoryAutoConfiguration", ServletWebServerFactoryAutoConfiguration__TestContext001_BeanDefinitions.getServletWebServerFactoryAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("servletWebServerFactoryCustomizer", ServletWebServerFactoryAutoConfiguration__TestContext001_BeanDefinitions.getServletWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("tomcatServletWebServerFactoryCustomizer", ServletWebServerFactoryAutoConfiguration__TestContext001_BeanDefinitions.getTomcatServletWebServerFactoryCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("server-org.springframework.boot.autoconfigure.web.ServerProperties", ServerProperties__TestContext001_BeanDefinitions.getServerPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("webServerFactoryCustomizerBeanPostProcessor", WebServerFactoryCustomizerBeanPostProcessor__TestContext001_BeanDefinitions.getWebServerFactoryCustomizerBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("errorPageRegistrarBeanPostProcessor", ErrorPageRegistrarBeanPostProcessor__TestContext001_BeanDefinitions.getErrorPageRegistrarBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletConfiguration", DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions.DispatcherServletConfiguration.getDispatcherServletConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dispatcherServlet", DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions.DispatcherServletConfiguration.getDispatcherServletBeanDefinition());
    beanFactory.registerBeanDefinition("spring.mvc-org.springframework.boot.autoconfigure.web.servlet.WebMvcProperties", WebMvcProperties__TestContext001_BeanDefinitions.getWebMvcPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration$DispatcherServletRegistrationConfiguration", DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions.DispatcherServletRegistrationConfiguration.getDispatcherServletRegistrationConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dispatcherServletRegistration", DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions.DispatcherServletRegistrationConfiguration.getDispatcherServletRegistrationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.DispatcherServletAutoConfiguration", DispatcherServletAutoConfiguration__TestContext001_BeanDefinitions.getDispatcherServletAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$ThreadPoolTaskExecutorBuilderConfiguration", TaskExecutorConfigurations__TestContext001_BeanDefinitions.ThreadPoolTaskExecutorBuilderConfiguration.getThreadPoolTaskExecutorBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("threadPoolTaskExecutorBuilder", TaskExecutorConfigurations__TestContext001_BeanDefinitions.ThreadPoolTaskExecutorBuilderConfiguration.getThreadPoolTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$SimpleAsyncTaskExecutorBuilderConfiguration", TaskExecutorConfigurations__TestContext001_BeanDefinitions.SimpleAsyncTaskExecutorBuilderConfiguration.getSimpleAsyncTaskExecutorBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("simpleAsyncTaskExecutorBuilder", TaskExecutorConfigurations__TestContext001_BeanDefinitions.SimpleAsyncTaskExecutorBuilderConfiguration.getSimpleAsyncTaskExecutorBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutorConfigurations$TaskExecutorConfiguration", TaskExecutorConfigurations__TestContext001_BeanDefinitions.TaskExecutorConfiguration.getTaskExecutorConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationTaskExecutor", TaskExecutorConfigurations__TestContext001_BeanDefinitions.TaskExecutorConfiguration.getApplicationTaskExecutorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskExecutionAutoConfiguration", TaskExecutionAutoConfiguration__TestContext001_BeanDefinitions.getTaskExecutionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.execution-org.springframework.boot.autoconfigure.task.TaskExecutionProperties", TaskExecutionProperties__TestContext001_BeanDefinitions.getTaskExecutionPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$WhitelabelErrorViewConfiguration", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.WhitelabelErrorViewConfiguration.getWhitelabelErrorViewConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("error", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.WhitelabelErrorViewConfiguration.getErrorBeanDefinition());
    beanFactory.registerBeanDefinition("beanNameViewResolver", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.WhitelabelErrorViewConfiguration.getBeanNameViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration$DefaultErrorViewResolverConfiguration", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.DefaultErrorViewResolverConfiguration.getDefaultErrorViewResolverConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("conventionErrorViewResolver", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.DefaultErrorViewResolverConfiguration.getConventionErrorViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("spring.web-org.springframework.boot.autoconfigure.web.WebProperties", WebProperties__TestContext001_BeanDefinitions.getWebPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.getErrorMvcAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("errorAttributes", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.getErrorAttributesBeanDefinition());
    beanFactory.registerBeanDefinition("basicErrorController", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.getBasicErrorControllerBeanDefinition());
    beanFactory.registerBeanDefinition("errorPageCustomizer", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.getErrorPageCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("preserveErrorControllerTargetClassPostProcessor", ErrorMvcAutoConfiguration__TestContext001_BeanDefinitions.getPreserveErrorControllerTargetClassPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$EnableWebMvcConfiguration", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getEnableWebMvcConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("welcomePageHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getWelcomePageHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("welcomePageNotAcceptableHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getWelcomePageNotAcceptableHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("localeResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getLocaleResolverBeanDefinition());
    beanFactory.registerBeanDefinition("themeResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getThemeResolverBeanDefinition());
    beanFactory.registerBeanDefinition("flashMapManager", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getFlashMapManagerBeanDefinition());
    beanFactory.registerBeanDefinition("viewNameTranslator", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getViewNameTranslatorBeanDefinition());
    beanFactory.registerBeanDefinition("mvcConversionService", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcConversionServiceBeanDefinition());
    beanFactory.registerBeanDefinition("mvcValidator", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcValidatorBeanDefinition());
    beanFactory.registerBeanDefinition("mvcContentNegotiationManager", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcContentNegotiationManagerBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getRequestMappingHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("mvcPatternParser", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcPatternParserBeanDefinition());
    beanFactory.registerBeanDefinition("mvcUrlPathHelper", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcUrlPathHelperBeanDefinition());
    beanFactory.registerBeanDefinition("mvcPathMatcher", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcPathMatcherBeanDefinition());
    beanFactory.registerBeanDefinition("viewControllerHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getViewControllerHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("beanNameHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getBeanNameHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("routerFunctionMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getRouterFunctionMappingBeanDefinition());
    beanFactory.registerBeanDefinition("resourceHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getResourceHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("mvcResourceUrlProvider", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcResourceUrlProviderBeanDefinition());
    beanFactory.registerBeanDefinition("defaultServletHandlerMapping", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getDefaultServletHandlerMappingBeanDefinition());
    beanFactory.registerBeanDefinition("requestMappingHandlerAdapter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getRequestMappingHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("handlerFunctionAdapter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getHandlerFunctionAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("mvcUriComponentsContributor", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcUriComponentsContributorBeanDefinition());
    beanFactory.registerBeanDefinition("httpRequestHandlerAdapter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getHttpRequestHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("simpleControllerHandlerAdapter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getSimpleControllerHandlerAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("handlerExceptionResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getHandlerExceptionResolverBeanDefinition());
    beanFactory.registerBeanDefinition("mvcViewResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("mvcHandlerMappingIntrospector", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.EnableWebMvcConfiguration.getMvcHandlerMappingIntrospectorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration$WebMvcAutoConfigurationAdapter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.WebMvcAutoConfigurationAdapter.getWebMvcAutoConfigurationAdapterBeanDefinition());
    beanFactory.registerBeanDefinition("defaultViewResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.WebMvcAutoConfigurationAdapter.getDefaultViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("viewResolver", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.WebMvcAutoConfigurationAdapter.getViewResolverBeanDefinition());
    beanFactory.registerBeanDefinition("requestContextFilter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.WebMvcAutoConfigurationAdapter.getRequestContextFilterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.WebMvcAutoConfiguration", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.getWebMvcAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("formContentFilter", WebMvcAutoConfiguration__TestContext001_BeanDefinitions.getFormContentFilterBeanDefinition());
    beanFactory.registerBeanDefinition("org.mybatis.spring.boot.autoconfigure.MybatisLanguageDriverAutoConfiguration", MybatisLanguageDriverAutoConfiguration__TestContext001_BeanDefinitions.getMybatisLanguageDriverAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceConfiguration$Hikari", DataSourceConfiguration__TestContext001_BeanDefinitions.Hikari.getHikariBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcConnectionDetailsHikariBeanPostProcessor", DataSourceConfiguration__TestContext001_BeanDefinitions.Hikari.getJdbcConnectionDetailsHikariBeanPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("dataSource", DataSourceConfiguration__TestContext001_BeanDefinitions.Hikari.getDataSourceBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration$PooledDataSourceConfiguration", DataSourceAutoConfiguration__TestContext001_BeanDefinitions.PooledDataSourceConfiguration.getPooledDataSourceConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcConnectionDetails", DataSourceAutoConfiguration__TestContext001_BeanDefinitions.PooledDataSourceConfiguration.getJdbcConnectionDetailsBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration$HikariPoolDataSourceMetadataProviderConfiguration", DataSourcePoolMetadataProvidersConfiguration__TestContext001_BeanDefinitions.HikariPoolDataSourceMetadataProviderConfiguration.getHikariPoolDataSourceMetadataProviderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("hikariPoolDataSourceMetadataProvider", DataSourcePoolMetadataProvidersConfiguration__TestContext001_BeanDefinitions.HikariPoolDataSourceMetadataProviderConfiguration.getHikariPoolDataSourceMetadataProviderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.metadata.DataSourcePoolMetadataProvidersConfiguration", DataSourcePoolMetadataProvidersConfiguration__TestContext001_BeanDefinitions.getDataSourcePoolMetadataProvidersConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration", DataSourceAutoConfiguration__TestContext001_BeanDefinitions.getDataSourceAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.datasource-org.springframework.boot.autoconfigure.jdbc.DataSourceProperties", DataSourceProperties__TestContext001_BeanDefinitions.getDataSourcePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration$MapperScannerRegistrarNotFoundConfiguration", MybatisAutoConfiguration__TestContext001_BeanDefinitions.MapperScannerRegistrarNotFoundConfiguration.getMapperScannerRegistrarNotFoundConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.mybatis.spring.mapper.MapperScannerConfigurer", MapperScannerConfigurer__TestContext001_BeanDefinitions.getMapperScannerConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("org.mybatis.spring.boot.autoconfigure.MybatisAutoConfiguration", MybatisAutoConfiguration__TestContext001_BeanDefinitions.getMybatisAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("sqlSessionFactory", MybatisAutoConfiguration__TestContext001_BeanDefinitions.getSqlSessionFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("sqlSessionTemplate", MybatisAutoConfiguration__TestContext001_BeanDefinitions.getSqlSessionTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("mybatis-org.mybatis.spring.boot.autoconfigure.MybatisProperties", MybatisProperties__TestContext001_BeanDefinitions.getMybatisPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("com.github.pagehelper.autoconfigure.PageHelperAutoConfiguration", PageHelperAutoConfiguration__TestContext001_BeanDefinitions.getPageHelperAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("pagehelper-com.github.pagehelper.autoconfigure.PageHelperProperties", PageHelperProperties__TestContext001_BeanDefinitions.getPageHelperPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("pagehelper-com.github.pagehelper.autoconfigure.PageHelperStandardProperties", PageHelperStandardProperties__TestContext001_BeanDefinitions.getPageHelperStandardPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration$ClassProxyingConfiguration", AopAutoConfiguration__TestContext001_BeanDefinitions.ClassProxyingConfiguration.getClassProxyingConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("forceAutoProxyCreatorToUseClassProxying", AopAutoConfiguration__TestContext001_BeanDefinitions.ClassProxyingConfiguration.getForceAutoProxyCreatorToUseClassProxyingBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.aop.AopAutoConfiguration", AopAutoConfiguration__TestContext001_BeanDefinitions.getAopAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.availability.ApplicationAvailabilityAutoConfiguration", ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions.getApplicationAvailabilityAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("applicationAvailability", ApplicationAvailabilityAutoConfiguration__TestContext001_BeanDefinitions.getApplicationAvailabilityBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$Jackson2ObjectMapperBuilderCustomizerConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getJacksonObjectMapperBuilderCustomizerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("standardJacksonObjectMapperBuilderCustomizer", JacksonAutoConfiguration__TestContext001_BeanDefinitions.Jackson2ObjectMapperBuilderCustomizerConfiguration.getStandardJacksonObjectMapperBuilderCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jackson-org.springframework.boot.autoconfigure.jackson.JacksonProperties", JacksonProperties__TestContext001_BeanDefinitions.getJacksonPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperBuilderConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapperBuilder", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonObjectMapperBuilderConfiguration.getJacksonObjectMapperBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$ParameterNamesModuleConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("parameterNamesModule", JacksonAutoConfiguration__TestContext001_BeanDefinitions.ParameterNamesModuleConfiguration.getParameterNamesModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonObjectMapperConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jacksonObjectMapper", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonObjectMapperConfiguration.getJacksonObjectMapperBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration$JacksonMixinConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonMixinConfiguration.getJacksonMixinConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModuleEntries", JsonMixinModuleEntries__TestContext001_BeanDefinitions.getJsonMixinModuleEntriesBeanDefinition());
    beanFactory.registerBeanDefinition("jsonMixinModule", JacksonAutoConfiguration__TestContext001_BeanDefinitions.JacksonMixinConfiguration.getJsonMixinModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jackson.JacksonAutoConfiguration", JacksonAutoConfiguration__TestContext001_BeanDefinitions.getJacksonAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jsonComponentModule", JacksonAutoConfiguration__TestContext001_BeanDefinitions.getJsonComponentModuleBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionManagerCustomizationAutoConfiguration", TransactionManagerCustomizationAutoConfiguration__TestContext001_BeanDefinitions.getTransactionManagerCustomizationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("platformTransactionManagerCustomizers", TransactionManagerCustomizationAutoConfiguration__TestContext001_BeanDefinitions.getPlatformTransactionManagerCustomizersBeanDefinition());
    beanFactory.registerBeanDefinition("transactionExecutionListeners", TransactionManagerCustomizationAutoConfiguration__TestContext001_BeanDefinitions.getTransactionExecutionListenersBeanDefinition());
    beanFactory.registerBeanDefinition("spring.transaction-org.springframework.boot.autoconfigure.transaction.TransactionProperties", TransactionProperties__TestContext001_BeanDefinitions.getTransactionPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.ConfigurationPropertiesAutoConfiguration", ConfigurationPropertiesAutoConfiguration__TestContext001_BeanDefinitions.getConfigurationPropertiesAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.context.LifecycleAutoConfiguration", LifecycleAutoConfiguration__TestContext001_BeanDefinitions.getLifecycleAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("lifecycleProcessor", LifecycleAutoConfiguration__TestContext001_BeanDefinitions.getLifecycleProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("spring.lifecycle-org.springframework.boot.autoconfigure.context.LifecycleProperties", LifecycleProperties__TestContext001_BeanDefinitions.getLifecyclePropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.dao.PersistenceExceptionTranslationAutoConfiguration", PersistenceExceptionTranslationAutoConfiguration__TestContext001_BeanDefinitions.getPersistenceExceptionTranslationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("persistenceExceptionTranslationPostProcessor", PersistenceExceptionTranslationAutoConfiguration__TestContext001_BeanDefinitions.getPersistenceExceptionTranslationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.gson.GsonAutoConfiguration", GsonAutoConfiguration__TestContext001_BeanDefinitions.getGsonAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("gsonBuilder", GsonAutoConfiguration__TestContext001_BeanDefinitions.getGsonBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("gson", GsonAutoConfiguration__TestContext001_BeanDefinitions.getGsonBeanDefinition());
    beanFactory.registerBeanDefinition("standardGsonBuilderCustomizer", GsonAutoConfiguration__TestContext001_BeanDefinitions.getStandardGsonBuilderCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("spring.gson-org.springframework.boot.autoconfigure.gson.GsonProperties", GsonProperties__TestContext001_BeanDefinitions.getGsonPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration$StringHttpMessageConverterConfiguration", HttpMessageConvertersAutoConfiguration__TestContext001_BeanDefinitions.StringHttpMessageConverterConfiguration.getStringHttpMessageConverterConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("stringHttpMessageConverter", HttpMessageConvertersAutoConfiguration__TestContext001_BeanDefinitions.StringHttpMessageConverterConfiguration.getStringHttpMessageConverterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration$MappingJackson2HttpMessageConverterConfiguration", JacksonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions.MappingJackson2HttpMessageConverterConfiguration.getMappingJacksonHttpMessageConverterConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("mappingJackson2HttpMessageConverter", JacksonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions.MappingJackson2HttpMessageConverterConfiguration.getMappingJacksonHttpMessageConverterBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.JacksonHttpMessageConvertersConfiguration", JacksonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions.getJacksonHttpMessageConvertersConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.GsonHttpMessageConvertersConfiguration", GsonHttpMessageConvertersConfiguration__TestContext001_BeanDefinitions.getGsonHttpMessageConvertersConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.HttpMessageConvertersAutoConfiguration", HttpMessageConvertersAutoConfiguration__TestContext001_BeanDefinitions.getHttpMessageConvertersAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("messageConverters", HttpMessageConvertersAutoConfiguration__TestContext001_BeanDefinitions.getMessageConvertersBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.http.client.HttpClientAutoConfiguration", HttpClientAutoConfiguration__TestContext001_BeanDefinitions.getHttpClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("clientHttpRequestFactoryBuilder", HttpClientAutoConfiguration__TestContext001_BeanDefinitions.getClientHttpRequestFactoryBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("clientHttpRequestFactorySettings", HttpClientAutoConfiguration__TestContext001_BeanDefinitions.getClientHttpRequestFactorySettingsBeanDefinition());
    beanFactory.registerBeanDefinition("spring.http.client-org.springframework.boot.autoconfigure.http.client.HttpClientProperties", HttpClientProperties__TestContext001_BeanDefinitions.getHttpClientPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.info.ProjectInfoAutoConfiguration", ProjectInfoAutoConfiguration__TestContext001_BeanDefinitions.getProjectInfoAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.info-org.springframework.boot.autoconfigure.info.ProjectInfoProperties", ProjectInfoProperties__TestContext001_BeanDefinitions.getProjectInfoPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcTemplateConfiguration", JdbcTemplateConfiguration__TestContext001_BeanDefinitions.getJdbcTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcTemplate", JdbcTemplateConfiguration__TestContext001_BeanDefinitions.getJdbcTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.NamedParameterJdbcTemplateConfiguration", NamedParameterJdbcTemplateConfiguration__TestContext001_BeanDefinitions.getNamedParameterJdbcTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("namedParameterJdbcTemplate", NamedParameterJdbcTemplateConfiguration__TestContext001_BeanDefinitions.getNamedParameterJdbcTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration", JdbcTemplateAutoConfiguration__TestContext001_BeanDefinitions.getJdbcTemplateAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.jdbc-org.springframework.boot.autoconfigure.jdbc.JdbcProperties", JdbcProperties__TestContext001_BeanDefinitions.getJdbcPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.sql.init.dependency.DatabaseInitializationDependencyConfigurer$DependsOnDatabaseInitializationPostProcessor", DatabaseInitializationDependencyConfigurer__TestContext001_BeanDefinitions.DependsOnDatabaseInitializationPostProcessor.getDependsOnDatabaseInitializationPostProcessorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.JdbcClientAutoConfiguration", JdbcClientAutoConfiguration__TestContext001_BeanDefinitions.getJdbcClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("jdbcClient", JdbcClientAutoConfiguration__TestContext001_BeanDefinitions.getJdbcClientBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.DataSourceInitializationConfiguration", DataSourceInitializationConfiguration__TestContext001_BeanDefinitions.getDataSourceInitializationConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("dataSourceScriptDatabaseInitializer", DataSourceInitializationConfiguration__TestContext001_BeanDefinitions.getDataSourceScriptDatabaseInitializerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.sql.init.SqlInitializationAutoConfiguration", SqlInitializationAutoConfiguration__TestContext001_BeanDefinitions.getSqlInitializationAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.sql.init-org.springframework.boot.autoconfigure.sql.init.SqlInitializationProperties", SqlInitializationProperties__TestContext001_BeanDefinitions.getSqlInitializationPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$ThreadPoolTaskSchedulerBuilderConfiguration", TaskSchedulingConfigurations__TestContext001_BeanDefinitions.ThreadPoolTaskSchedulerBuilderConfiguration.getThreadPoolTaskSchedulerBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("threadPoolTaskSchedulerBuilder", TaskSchedulingConfigurations__TestContext001_BeanDefinitions.ThreadPoolTaskSchedulerBuilderConfiguration.getThreadPoolTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingConfigurations$SimpleAsyncTaskSchedulerBuilderConfiguration", TaskSchedulingConfigurations__TestContext001_BeanDefinitions.SimpleAsyncTaskSchedulerBuilderConfiguration.getSimpleAsyncTaskSchedulerBuilderConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("simpleAsyncTaskSchedulerBuilder", TaskSchedulingConfigurations__TestContext001_BeanDefinitions.SimpleAsyncTaskSchedulerBuilderConfiguration.getSimpleAsyncTaskSchedulerBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.task.TaskSchedulingAutoConfiguration", TaskSchedulingAutoConfiguration__TestContext001_BeanDefinitions.getTaskSchedulingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("spring.task.scheduling-org.springframework.boot.autoconfigure.task.TaskSchedulingProperties", TaskSchedulingProperties__TestContext001_BeanDefinitions.getTaskSchedulingPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration$JdbcTransactionManagerConfiguration", DataSourceTransactionManagerAutoConfiguration__TestContext001_BeanDefinitions.JdbcTransactionManagerConfiguration.getJdbcTransactionManagerConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("transactionManager", DataSourceTransactionManagerAutoConfiguration__TestContext001_BeanDefinitions.JdbcTransactionManagerConfiguration.getTransactionManagerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration", DataSourceTransactionManagerAutoConfiguration__TestContext001_BeanDefinitions.getDataSourceTransactionManagerAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.annotation.ProxyTransactionManagementConfiguration", ProxyTransactionManagementConfiguration__TestContext001_BeanDefinitions.getProxyTransactionManagementConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.config.internalTransactionAdvisor", ProxyTransactionManagementConfiguration__TestContext001_BeanDefinitions.getInternalTransactionAdvisorBeanDefinition());
    beanFactory.registerBeanDefinition("transactionInterceptor", ProxyTransactionManagementConfiguration__TestContext001_BeanDefinitions.getTransactionInterceptorBeanDefinition());
    beanFactory.registerBeanDefinition("transactionAttributeSource", ProxyTransactionManagementConfiguration__TestContext001_BeanDefinitions.getTransactionAttributeSourceBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.transaction.config.internalTransactionalEventListenerFactory", AbstractTransactionManagementConfiguration__TestContext001_BeanDefinitions.getInternalTransactionalEventListenerFactoryBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration$CglibAutoProxyConfiguration", TransactionAutoConfiguration__TestContext001_BeanDefinitions.EnableTransactionManagementConfiguration.CglibAutoProxyConfiguration.getCglibAutoProxyConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.aop.config.internalAutoProxyCreator", InfrastructureAdvisorAutoProxyCreator__TestContext001_BeanDefinitions.getInternalAutoProxyCreatorBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$EnableTransactionManagementConfiguration", TransactionAutoConfiguration__TestContext001_BeanDefinitions.EnableTransactionManagementConfiguration.getEnableTransactionManagementConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration$TransactionTemplateConfiguration", TransactionAutoConfiguration__TestContext001_BeanDefinitions.TransactionTemplateConfiguration.getTransactionTemplateConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("transactionTemplate", TransactionAutoConfiguration__TestContext001_BeanDefinitions.TransactionTemplateConfiguration.getTransactionTemplateBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.transaction.TransactionAutoConfiguration", TransactionAutoConfiguration__TestContext001_BeanDefinitions.getTransactionAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.client.RestClientAutoConfiguration", RestClientAutoConfiguration__TestContext001_BeanDefinitions.getRestClientAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("httpMessageConvertersRestClientCustomizer", RestClientAutoConfiguration__TestContext001_BeanDefinitions.getHttpMessageConvertersRestClientCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("restClientSsl", RestClientAutoConfiguration__TestContext001_BeanDefinitions.getRestClientSslBeanDefinition());
    beanFactory.registerBeanDefinition("restClientBuilderConfigurer", RestClientAutoConfiguration__TestContext001_BeanDefinitions.getRestClientBuilderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("restClientBuilder", RestClientAutoConfiguration__TestContext001_BeanDefinitions.getRestClientBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.client.RestTemplateAutoConfiguration", RestTemplateAutoConfiguration__TestContext001_BeanDefinitions.getRestTemplateAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("restTemplateBuilderConfigurer", RestTemplateAutoConfiguration__TestContext001_BeanDefinitions.getRestTemplateBuilderConfigurerBeanDefinition());
    beanFactory.registerBeanDefinition("restTemplateBuilder", RestTemplateAutoConfiguration__TestContext001_BeanDefinitions.getRestTemplateBuilderBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.HttpEncodingAutoConfiguration", HttpEncodingAutoConfiguration__TestContext001_BeanDefinitions.getHttpEncodingAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("characterEncodingFilter", HttpEncodingAutoConfiguration__TestContext001_BeanDefinitions.getCharacterEncodingFilterBeanDefinition());
    beanFactory.registerBeanDefinition("localeCharsetMappingsCustomizer", HttpEncodingAutoConfiguration__TestContext001_BeanDefinitions.getLocaleCharsetMappingsCustomizerBeanDefinition());
    beanFactory.registerBeanDefinition("org.springframework.boot.autoconfigure.web.servlet.MultipartAutoConfiguration", MultipartAutoConfiguration__TestContext001_BeanDefinitions.getMultipartAutoConfigurationBeanDefinition());
    beanFactory.registerBeanDefinition("multipartConfigElement", MultipartAutoConfiguration__TestContext001_BeanDefinitions.getMultipartConfigElementBeanDefinition());
    beanFactory.registerBeanDefinition("multipartResolver", MultipartAutoConfiguration__TestContext001_BeanDefinitions.getMultipartResolverBeanDefinition());
    beanFactory.registerBeanDefinition("spring.servlet.multipart-org.springframework.boot.autoconfigure.web.servlet.MultipartProperties", MultipartProperties__TestContext001_BeanDefinitions.getMultipartPropertiesBeanDefinition());
    beanFactory.registerBeanDefinition("clazzMapper", getClazzMapperBeanDefinition());
    beanFactory.registerBeanDefinition("deptMapper", getDeptMapperBeanDefinition());
    beanFactory.registerBeanDefinition("empExprMapper", getEmpExprMapperBeanDefinition());
    beanFactory.registerBeanDefinition("empLogMapper", getEmpLogMapperBeanDefinition());
    beanFactory.registerBeanDefinition("empMapper", getEmpMapperBeanDefinition());
    beanFactory.registerBeanDefinition("reportMapper", getReportMapperBeanDefinition());
    beanFactory.registerBeanDefinition("studentMapper", getStudentMapperBeanDefinition());
  }

  /**
   * Register the aliases.
   */
  public void registerAliases(DefaultListableBeanFactory beanFactory) {
    beanFactory.registerAlias("applicationTaskExecutor", "taskExecutor");
  }
}
