package com.leroy.practice.designTest;

import com.leroy.practice.designmode.facotry.SimpleFactory;
import com.leroy.practice.designmode.facotry.model.Cat;
import com.leroy.practice.designmode.proxy.DynamicSubject;
import com.leroy.practice.designmode.proxy.ProxySubject;
import com.leroy.practice.designmode.proxy.RealSubject;
import com.leroy.practice.designmode.proxy.Subject;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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

   @Autowired
   private DynamicSubject dynamicSubject;

   @Test
   public void test2(){
       ProxySubject proxySubject = new ProxySubject();
       proxySubject.learn();
   }


   @Test
    public void test3(){

       ProxySubject proxySubject = new ProxySubject();

       RealSubject realSubject = new RealSubject();

       DynamicSubject dynamicSubject = new DynamicSubject(realSubject);

       Subject sub =(Subject) Proxy.newProxyInstance(
               Thread.currentThread().getContextClassLoader(),
               realSubject.getClass().getInterfaces(), dynamicSubject);
       sub.learn();


   }
}
