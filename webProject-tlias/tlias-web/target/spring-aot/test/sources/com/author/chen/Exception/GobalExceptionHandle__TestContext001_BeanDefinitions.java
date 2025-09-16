package com.author.chen.Exception;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link GobalExceptionHandle}.
 */
@Generated
public class GobalExceptionHandle__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'gobalExceptionHandle'.
   */
  public static BeanDefinition getGobalExceptionHandleBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(GobalExceptionHandle.class);
    beanDefinition.setInstanceSupplier(GobalExceptionHandle::new);
    return beanDefinition;
  }
}
