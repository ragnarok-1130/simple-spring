package org.example.springframework.beans.factory.config;

/**
 * @author LCQ
 */
public interface SingletonBeanRegistry {

    /**
     * 获取bean单例对象
     * @param name bean名称
     * @return bean单例对象
     */
    Object getSingleton(String name);
}
