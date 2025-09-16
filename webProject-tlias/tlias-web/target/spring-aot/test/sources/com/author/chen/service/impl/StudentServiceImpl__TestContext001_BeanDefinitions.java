package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StudentServiceImpl}.
 */
@Generated
public class StudentServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'studentServiceImpl'.
   */
  public static BeanDefinition getStudentServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StudentServiceImpl.class);
    InstanceSupplier<StudentServiceImpl> instanceSupplier = InstanceSupplier.using(StudentServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(StudentServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
