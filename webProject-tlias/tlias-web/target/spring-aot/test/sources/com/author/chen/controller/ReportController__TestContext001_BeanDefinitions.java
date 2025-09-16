package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReportController}.
 */
@Generated
public class ReportController__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'reportController'.
   */
  public static BeanDefinition getReportControllerBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReportController.class);
    InstanceSupplier<ReportController> instanceSupplier = InstanceSupplier.using(ReportController::new);
    instanceSupplier = instanceSupplier.andThen(ReportController__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
