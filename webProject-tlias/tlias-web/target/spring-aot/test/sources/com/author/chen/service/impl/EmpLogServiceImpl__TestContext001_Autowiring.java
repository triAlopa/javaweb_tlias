package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EmpLogServiceImpl}.
 */
@Generated
public class EmpLogServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EmpLogServiceImpl apply(RegisteredBean registeredBean, EmpLogServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("empLogMapper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
