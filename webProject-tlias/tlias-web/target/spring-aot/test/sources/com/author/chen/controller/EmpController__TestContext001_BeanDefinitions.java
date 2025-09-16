package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link EmpController}.
 */
@Generated
public class EmpController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'empController'.
   */
  public static BeanDefinition getEmpControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(EmpController.class);
    InstanceSupplier<EmpController> instanceSupplier = InstanceSupplier.using(EmpController::new);
    instanceSupplier = instanceSupplier.andThen(EmpController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
