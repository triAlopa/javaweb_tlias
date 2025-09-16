package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link fileController}.
 */
@Generated
public class fileController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static fileController apply(RegisteredBean registeredBean, fileController instance) {
    AutowiredFieldValueResolver.forRequiredField("aliyunOSSOperator").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
