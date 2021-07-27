import org.example.springframework.beans.factory.config.BeanDefinition;
import org.example.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.junit.jupiter.api.Test;

public class TestBeanFactory {

    @Test
    public void test() {
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2. 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(TestService.class);
        beanFactory.registerBeanDefinition("testService", beanDefinition);

        // 3.获取bean
        TestService testService = (TestService) beanFactory.getBean("testService", "测试一下");
        System.out.println(testService.getStr());
    }

}
