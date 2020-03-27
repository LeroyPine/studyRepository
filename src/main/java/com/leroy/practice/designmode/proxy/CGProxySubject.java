package com.leroy.practice.designmode.proxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年03月21日 20:47
 * @since 1.0
 */
public class CGProxySubject implements MethodInterceptor {


    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Before");
        Object o1 = methodProxy.invokeSuper(o, objects);
       // Object invoke = method.invoke(o, objects);
        System.out.println("After");
        return o1;
    }


    public <T> Object getInstance(Object target,Class<T> clazz){
        // 字节码增强器
        Enhancer enhancer = new Enhancer();
        // 代理的目标对象
        enhancer.setSuperclass(target.getClass());
        //
        enhancer.setCallback(this);

        Object o = enhancer.create();

        return o;
    }
}
