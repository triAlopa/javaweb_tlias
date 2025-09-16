package com.author.chen.service.impl;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link StudentServiceImpl}.
 */
@Generated
public class StudentServiceImpl__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static StudentServiceImpl apply(RegisteredBean registeredBean,
      StudentServiceImpl instance) {
    AutowiredFieldValueResolver.forRequiredField("studentMapper").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
