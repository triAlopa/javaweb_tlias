package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ClazzController}.
 */
@Generated
public class ClazzController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'clazzController'.
   */
  public static BeanDefinition getClazzControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ClazzController.class);
    InstanceSupplier<ClazzController> instanceSupplier = InstanceSupplier.using(ClazzController::new);
    instanceSupplier = instanceSupplier.andThen(ClazzController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
