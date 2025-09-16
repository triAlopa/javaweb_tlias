package com.author.chen.pojo;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AliyunOSSProperties}.
 */
@Generated
public class AliyunOSSProperties__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'aliyunOSSProperties'.
   */
  public static BeanDefinition getAliyunOSSPropertiesBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AliyunOSSProperties.class);
    beanDefinition.setInstanceSupplier(AliyunOSSProperties::new);
    return beanDefinition;
  }
}
