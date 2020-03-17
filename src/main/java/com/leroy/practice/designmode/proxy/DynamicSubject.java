package com.leroy.practice.designmode.proxy;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
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
 * @date Created in 2020年03月17日 12:38
 * @since 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
public class DynamicSubject implements  InvocationHandler {

    // 委托对象 目标对象昂
    RealSubject realSubject;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        return method.invoke(realSubject,args);
    }
}
