package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link fileController}.
 */
@Generated
public class fileController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'fileController'.
   */
  public static BeanDefinition getFileControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(fileController.class);
    InstanceSupplier<fileController> instanceSupplier = InstanceSupplier.using(fileController::new);
    instanceSupplier = instanceSupplier.andThen(fileController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
