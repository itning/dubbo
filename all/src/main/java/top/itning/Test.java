package top.itning;

/*
 * Decompiled with CFR.
 *
 * Could not load the following classes:
 *  com.alibaba.dubbo.common.bytecode.ClassGenerator$DC
 *  com.alibaba.dubbo.rpc.service.EchoService
 */

import com.alibaba.dubbo.common.bytecode.ClassGenerator;
import com.alibaba.dubbo.rpc.service.EchoService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class Test implements ClassGenerator.DC, ProviderService, EchoService {
    public static Method[] methods;
    private InvocationHandler handler;

    @Override
    public String sayHello(String string) {
        Object[] objectArray = new Object[]{string};
        Object object = null;
        try {
            object = this.handler.invoke(this, methods[0], objectArray);
        } catch (Throwable e) {
            // TODO remove
            e.printStackTrace();
        }
        return (String) object;
    }

    @Override
    public Object $echo(Object object) {
        Object[] objectArray = new Object[]{object};
        Object object2 = null;
        try {
            object2 = this.handler.invoke(this, methods[1], objectArray);
        } catch (Throwable e) {
            // TODO remove
            e.printStackTrace();
        }
        return object2;
    }

    public Test() {
    }

    public Test(InvocationHandler invocationHandler) {
        this.handler = invocationHandler;
    }
}
