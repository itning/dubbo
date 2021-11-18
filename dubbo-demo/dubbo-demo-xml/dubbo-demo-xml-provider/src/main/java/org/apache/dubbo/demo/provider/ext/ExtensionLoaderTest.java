package org.apache.dubbo.demo.provider.ext;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Collections;

/**
 * @author itning
 * @since 2021/11/18 13:31
 */
public class ExtensionLoaderTest {
    public static void main(String[] args) {
        ExtensionLoader<Hello> extensionLoader = ExtensionLoader.getExtensionLoader(Hello.class);
//        Hello hello = extensionLoader.getOrDefaultExtension("ccc");
//        System.out.println(hello.say("w"));
        Hello hello1 = extensionLoader.getAdaptiveExtension();
        URL url = new URL("http", "127.0.0.1", 8080, Collections.singletonMap("key1", "b"));
        System.out.println(hello1.say("c", url));
    }
}
