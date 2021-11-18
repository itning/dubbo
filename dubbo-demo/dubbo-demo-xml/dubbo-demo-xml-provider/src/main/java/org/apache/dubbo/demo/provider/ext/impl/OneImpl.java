package org.apache.dubbo.demo.provider.ext.impl;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.demo.provider.ext.Hello;

/**
 * @author itning
 * @since 2021/11/18 13:33
 */
public class OneImpl implements Hello {
    @Override
    public String say(String what, URL url) {
        return "One Impl " + what;
    }
}
