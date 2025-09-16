package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link ClazzController}.
 */
@Generated
public class ClazzController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static ClazzController apply(RegisteredBean registeredBean, ClazzController instance) {
    AutowiredFieldValueResolver.forRequiredField("clazzService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
