package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link StudentController}.
 */
@Generated
public class StudentController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'studentController'.
   */
  public static BeanDefinition getStudentControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(StudentController.class);
    InstanceSupplier<StudentController> instanceSupplier = InstanceSupplier.using(StudentController::new);
    instanceSupplier = instanceSupplier.andThen(StudentController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
