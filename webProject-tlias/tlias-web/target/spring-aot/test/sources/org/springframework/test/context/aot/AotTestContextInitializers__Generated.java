package org.springframework.test.context.aot;

import com.author.chen.TliasWebApplicationTests__TestContext001_ApplicationContextInitializer;
import java.lang.Class;
import java.lang.String;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import org.springframework.aot.generate.Generated;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Generated mappings for {@link AotTestContextInitializers}.
 */
@Generated
public class AotTestContextInitializers__Generated {
  public static Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> getContextInitializers(
      ) {
    Map<String, Supplier<ApplicationContextInitializer<? extends ConfigurableApplicationContext>>> map = new HashMap<>();
    map.put("com.author.chen.TliasWebApplicationTests", () -> new TliasWebApplicationTests__TestContext001_ApplicationContextInitializer());
    return map;
  }

  public static Map<String, Class<? extends ApplicationContextInitializer<?>>> getContextInitializerClasses(
      ) {
    Map<String, Class<? extends ApplicationContextInitializer<?>>> map = new HashMap<>();
    map.put("com.author.chen.TliasWebApplicationTests", TliasWebApplicationTests__TestContext001_ApplicationContextInitializer.class);
    return map;
  }
}
