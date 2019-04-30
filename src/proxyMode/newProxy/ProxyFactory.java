package proxyMode.newProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    private Object obj;

    public ProxyFactory(Object obj) {

        this.obj = obj;
    }

    public Object getInstance() {

        Object newProxyInstance = Proxy.newProxyInstance(obj.getClass().getClassLoader(), obj.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("拦截到了===我要进行操作");
                Object invoke = method.invoke(obj, args);
                System.out.println("操作结束");
                return invoke;
            }
        });
        return newProxyInstance;
    }


}
