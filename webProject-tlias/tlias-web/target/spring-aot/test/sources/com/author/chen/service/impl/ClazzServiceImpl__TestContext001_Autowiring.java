package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ClazzServiceImpl}.
 */
@Generated
public class ClazzServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ClazzServiceImpl apply(RegisteredBean registeredBean, ClazzServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("clazzMapper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
