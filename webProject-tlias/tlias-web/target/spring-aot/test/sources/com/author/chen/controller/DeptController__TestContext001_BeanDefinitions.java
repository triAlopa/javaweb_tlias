package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link DeptController}.
 */
@Generated
public class DeptController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'deptController'.
   */
  public static BeanDefinition getDeptControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(DeptController.class);
    InstanceSupplier<DeptController> instanceSupplier = InstanceSupplier.using(DeptController::new);
    instanceSupplier = instanceSupplier.andThen(DeptController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
