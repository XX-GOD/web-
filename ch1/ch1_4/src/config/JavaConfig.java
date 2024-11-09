package config;

import instance.BeanClass;
import instance.BeanInstanceFactory;
import instance.BeanStaticFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean(value="beanClass")
    public BeanClass getBeanClass() {
        return new BeanClass();
    }
    @Bean(value="beanStaticFactory")
    public BeanClass getBeanStaticFactory() {
        return BeanStaticFactory.createInstance();
    }
    @Bean(value="beanInstanceFactory")
    public BeanClass getBeanInstanceFactory() {
        BeanInstanceFactory bi = new BeanInstanceFactory();
        return bi.createBeanClassInstance();
    }
}
