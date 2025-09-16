package com.author.chen.utils;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.aot.AutowiredFieldValueResolver;
import org.springframework.beans.factory.support.RegisteredBean;

/**
 * Autowiring for {@link AliyunOSSOperator}.
 */
@Generated
public class AliyunOSSOperator__TestContext001_Autowiring {
  /**
   * Apply the autowiring.
   */
  public static AliyunOSSOperator apply(RegisteredBean registeredBean, AliyunOSSOperator instance) {
    AutowiredFieldValueResolver.forRequiredField("aliyunOSSProperties").resolveAndSet(registeredBean, instance);
    return instance;
  }
}
