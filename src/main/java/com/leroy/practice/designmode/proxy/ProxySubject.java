package com.leroy.practice.designmode.proxy;

import org.checkerframework.checker.units.qual.C;
import org.springframework.stereotype.Component;

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
 * @date Created in 2020年03月15日 22:03
 * @since 1.0
 */
@Component
public class ProxySubject implements Subject{

    private RealSubject realSubject = new RealSubject();

    @Override
    public void learn() {
        System.out.println("我是代理对象start");
        realSubject.learn();
        System.out.println("我是代理对象end");
    }
}
