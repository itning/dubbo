package top.itning;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author itning
 * @since 2021/11/20 11:22
 */
public class ConsumerDemo {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();
        ProviderService providerService = context.getBean(ProviderService.class);
        String result = providerService.sayHello("你好");
        System.out.println(result);
        System.in.read();
    }
}
