package org.mybatis.spring.boot.autoconfigure;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link MybatisLanguageDriverAutoConfiguration}.
 */
@Generated
public class MybatisLanguageDriverAutoConfiguration__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'mybatisLanguageDriverAutoConfiguration'.
   */
  public static BeanDefinition getMybatisLanguageDriverAutoConfigurationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(MybatisLanguageDriverAutoConfiguration.class);
    beanDefinition.setInstanceSupplier(MybatisLanguageDriverAutoConfiguration::new);
    return beanDefinition;
  }
}
