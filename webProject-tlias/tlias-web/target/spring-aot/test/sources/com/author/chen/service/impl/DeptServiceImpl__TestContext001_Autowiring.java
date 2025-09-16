package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link DeptServiceImpl}.
 */
@Generated
public class DeptServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static DeptServiceImpl apply(RegisteredBean registeredBean, DeptServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("deptMapper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
