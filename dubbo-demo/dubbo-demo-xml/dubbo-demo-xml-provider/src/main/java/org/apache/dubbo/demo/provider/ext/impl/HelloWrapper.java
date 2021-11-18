package org.apache.dubbo.demo.provider.ext.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.demo.provider.ext.Hello;

/**
 * @author itning
 * @since 2021/11/18 13:37
 */
public class HelloWrapper implements Hello {
    private final Hello hello;

    public HelloWrapper(Hello hello) {
        this.hello = hello;
    }


    @Override
    public String say(String what, URL url) {
        System.out.println("before");
        return hello.say(what, url);
    }
}
