package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EmpServiceImpl}.
 */
@Generated
public class EmpServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EmpServiceImpl apply(RegisteredBean registeredBean, EmpServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("empMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("empExprMapper").resolveAndSet(registeredBean, instance);
    AutowiredFieldValueResolver.forRequiredField("empLogService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
