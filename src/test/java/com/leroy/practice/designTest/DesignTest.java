package com.leroy.practice.designTest;

import com.leroy.practice.designmode.brige.Bag;
import com.leroy.practice.designmode.brige.Color;
import com.leroy.practice.designmode.brige.SmallBag;
import com.leroy.practice.designmode.decorate.ConcreteDecorat;
import com.leroy.practice.designmode.decorate.LeroyExecute;
import com.leroy.practice.designmode.decorate.Target;
import com.leroy.practice.designmode.facotry.SimpleFactory;
import com.leroy.practice.designmode.facotry.model.Cat;
import com.leroy.practice.designmode.proxy.*;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

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
 * @date Created in 2020年03月01日 14:36
 * @since 1.0
 */
@Component
public class DesignTest {


   /* @Test
    public void test1(){
        Cat cat = SimpleFactory.createCat();
    }*/



   @Test
   public void test2(){
       ProxySubject proxySubject = new ProxySubject();
       proxySubject.learn();
   }


   @Test
    public void test3(){



       RealSubject realSubject = new RealSubject();

      /* Subject sub =(Subject) Proxy.newProxyInstance(
               Thread.currentThread().getContextClassLoader(),
               realSubject.getClass().getInterfaces(), dynamicSubject);*/

       Subject sub =(Subject) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
               realSubject.getClass().getInterfaces(), (proxy, method, args) -> {
                   System.out.println("Before:我是代理类小锅锅");
                   Object invoke = method.invoke(realSubject, args);
                   System.out.println("After:我是代理类小锅锅");
                   return invoke;
               });

       sub.learn();


   }



   @Test
   public void test4(){
        CGSubject c = new CGSubject();

        CGProxySubject proxy = new CGProxySubject();
        // 目标对象
       CGSubject instance =(CGSubject) proxy.getInstance(c, c.getClass());

        instance.process();

   }


    @Test
    public void test5(){

        Bag bag = new SmallBag();
        bag.setColor(() -> "yellow");

        bag.getName("西跨");

        System.out.println(bag.getName("213412"));

    }




    @Test
    public void test6(){

        LeroyExecute leroyExecute = new LeroyExecute();
        Target leroy = new ConcreteDecorat(leroyExecute);
        leroy.process();

    }





    public static void main(String[] args) {
        InvocationHandler handler = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("morning")) {
                    System.out.println("Good morning, " + args[0]);
                }
                return "Leroy";
            }
        };
        Hello hello = (Hello) Proxy.newProxyInstance(
                Hello.class.getClassLoader(), // 传入ClassLoader
                new Class[] { Hello.class }, // 传入要实现的接口
                handler); // 传入处理调用方法的InvocationHandler
        hello.morning("Bob");
    }
}
interface Hello {
    void morning(String name);
}
