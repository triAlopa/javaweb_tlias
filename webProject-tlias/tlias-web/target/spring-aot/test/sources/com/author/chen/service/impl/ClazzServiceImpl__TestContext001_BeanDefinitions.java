package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClazzServiceImpl}.
 */
@Generated
public class ClazzServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'clazzServiceImpl'.
   */
  public static BeanDefinition getClazzServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClazzServiceImpl.class);
    InstanceSupplier<ClazzServiceImpl> instanceSupplier = InstanceSupplier.using(ClazzServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(ClazzServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
