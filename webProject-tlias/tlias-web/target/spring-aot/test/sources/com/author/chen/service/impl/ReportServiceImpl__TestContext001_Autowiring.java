package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReportServiceImpl}.
 */
@Generated
public class ReportServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReportServiceImpl apply(RegisteredBean registeredBean, ReportServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("reportMapper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
