package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DeptServiceImpl}.
 */
@Generated
public class DeptServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'deptServiceImpl'.
   */
  public static BeanDefinition getDeptServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DeptServiceImpl.class);
    InstanceSupplier<DeptServiceImpl> instanceSupplier = InstanceSupplier.using(DeptServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(DeptServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
