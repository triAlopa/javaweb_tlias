package com.author.chen;

import org.springframework.aot.generate.Generated;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.RootBeanDefinition;

/**
 * Bean definitions for {@link TliasWebApplication}.
 */
@Generated
public class TliasWebApplication__TestContext001_BeanDefinitions {
  /**
   * Get the bean definition for 'tliasWebApplication'.
   */
  public static BeanDefinition getTliasWebApplicationBeanDefinition() {
    RootBeanDefinition beanDefinition = new RootBeanDefinition(TliasWebApplication.class);
    beanDefinition.setInstanceSupplier(TliasWebApplication::new);
    return beanDefinition;
  }
}
