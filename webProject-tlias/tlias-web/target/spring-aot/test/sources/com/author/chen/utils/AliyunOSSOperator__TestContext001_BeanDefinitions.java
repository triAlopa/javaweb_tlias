package com.author.chen.utils;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link AliyunOSSOperator}.
 */
@Generated
public class AliyunOSSOperator__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'aliyunOSSOperator'.
   */
  public static BeanDefinition getAliyunOSSOperatorBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(AliyunOSSOperator.class);
    InstanceSupplier<AliyunOSSOperator> instanceSupplier = InstanceSupplier.using(AliyunOSSOperator::new);
    instanceSupplier = instanceSupplier.andThen(AliyunOSSOperator__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
