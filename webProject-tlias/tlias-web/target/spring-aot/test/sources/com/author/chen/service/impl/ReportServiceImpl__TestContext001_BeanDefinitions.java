package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.InstanceSupplier;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link ReportServiceImpl}.
 */
@Generated
public class ReportServiceImpl__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'reportServiceImpl'.
   */
  public static BeanDefinition getReportServiceImplBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(ReportServiceImpl.class);
    InstanceSupplier<ReportServiceImpl> instanceSupplier = InstanceSupplier.using(ReportServiceImpl::new);
    instanceSupplier = instanceSupplier.andThen(ReportServiceImpl__TestContext001_Autowiring::apply);
    beanDefinition.setInstanceSupplier(instanceSupplier);
    return beanDefinition;
  }
}
