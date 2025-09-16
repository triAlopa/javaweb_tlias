package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DeptController}.
 */
@Generated
public class DeptController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DeptController apply(RegisteredBean registeredBean, DeptController instance) {
    AutowiredFieldValueResolver.forRequiredField("deptService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
