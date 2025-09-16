package com.author.chen.controller;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link StudentController}.
 */
@Generated
public class StudentController__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static StudentController apply(RegisteredBean registeredBean, StudentController instance) {
    AutowiredFieldValueResolver.forRequiredField("studentService").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
