package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ReportController}.
 */
@Generated
public class ReportController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ReportController apply(RegisteredBean registeredBean, ReportController instance) {
    AutowiredFieldValueResolver.forRequiredField("reportService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
