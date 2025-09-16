package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmpLogServiceImpl}.
 */
@Generated
public class EmpLogServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'empLogServiceImpl'.
   */
  public static BeanDefinition getEmpLogServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmpLogServiceImpl.class);
    InstanceSupplier<EmpLogServiceImpl> instanceSupplier = InstanceSupplier.using(EmpLogServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(EmpLogServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
