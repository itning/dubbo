package org.apache.dubbo.demo.provider.ext;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.Adaptive;
import org.apache.dubbo.common.extension.SPI;

/**
 * @author itning
 * @since 2021/11/18 13:32
 */
@SPI("a")
public interface Hello {
    @Adaptive("key1")
    String say(String what, URL url);
}
