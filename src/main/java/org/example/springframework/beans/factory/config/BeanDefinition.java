package org.example.springframework.beans.factory.config;

import lombok.Getter;

/**
 * @author LCQ
 */
@Getter
public class BeanDefinition {

    private Class<?> beanClass;

    public BeanDefinition(Class<?> beanClass) {
        this.beanClass = beanClass;
    }
}
