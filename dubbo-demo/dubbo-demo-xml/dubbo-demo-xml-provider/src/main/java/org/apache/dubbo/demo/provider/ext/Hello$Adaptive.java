package org.apache.dubbo.demo.provider.ext;

import org.apache.dubbo.common.extension.ExtensionLoader;

public class Hello$Adaptive implements org.apache.dubbo.demo.provider.ext.Hello {
    @Override
    public java.lang.String say(java.lang.String arg0, org.apache.dubbo.common.URL arg1) {
        if (arg1 == null) {
            throw new IllegalArgumentException("url == null");
        }
        org.apache.dubbo.common.URL url = arg1;
        String extName = url.getParameter("key1", "a");
        if (extName == null) {
            throw new IllegalStateException("Failed to get extension (org.apache.dubbo.demo.provider.ext.Hello) name from url (" + url.toString() + ") use keys([key1])");
        }
        org.apache.dubbo.demo.provider.ext.Hello extension = (org.apache.dubbo.demo.provider.ext.Hello) ExtensionLoader.getExtensionLoader(org.apache.dubbo.demo.provider.ext.Hello.class).getExtension(extName);
        return extension.say(arg0, arg1);
    }
}
