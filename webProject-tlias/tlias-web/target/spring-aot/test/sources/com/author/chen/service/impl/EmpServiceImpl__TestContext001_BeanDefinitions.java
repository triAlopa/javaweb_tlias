package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmpServiceImpl}.
 */
@Generated
public class EmpServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'empServiceImpl'.
   */
  public static BeanDefinition getEmpServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmpServiceImpl.class);
    InstanceSupplier<EmpServiceImpl> instanceSupplier = InstanceSupplier.using(EmpServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(EmpServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
