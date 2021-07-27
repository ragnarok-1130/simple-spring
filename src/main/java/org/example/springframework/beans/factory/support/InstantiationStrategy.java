package org.example.springframework.beans.factory.support;

import org.example.springframework.beans.BeansException;
import org.example.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

/**
 * @author LCQ
 */
public interface InstantiationStrategy {

    /**
     * 使用构造函数实例化bean
     * @param beanDefinition bean的定义
     * @param beanName bean名称
     * @param ctor 构造方法
     * @param args 构造参数
     * @return bean对象
     * @throws BeansException 异常
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor<?> ctor, Object[] args) throws BeansException;

}
