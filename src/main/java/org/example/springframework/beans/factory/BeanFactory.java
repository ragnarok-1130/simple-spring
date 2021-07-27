package org.example.springframework.beans.factory;

/**
 * @author LCQ
 */
public interface BeanFactory {

    /**
     * 使用bean名称获取bean
     * @param beanName bean名称
     * @return bean对象
     */
    Object getBean(String beanName);

    /**
     * 使用bean名称获取bean (有参数的构造)
     * @param name bean名称
     * @param args 构造使用的参数
     * @return bean对象
     */
    Object getBean(String name, Object... args);

}
