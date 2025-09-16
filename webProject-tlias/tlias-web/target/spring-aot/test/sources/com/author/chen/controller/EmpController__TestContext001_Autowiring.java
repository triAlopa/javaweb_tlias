package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link EmpController}.
 */
@Generated
public class EmpController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static EmpController apply(RegisteredBean registeredBean, EmpController instance) {
    AutowiredFieldValueResolver.forRequiredField("empService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
