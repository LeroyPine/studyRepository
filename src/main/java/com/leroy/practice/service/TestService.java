package com.leroy.practice.service;

import com.leroy.practice.inject.ConstructBean;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.beans.factory.support.AbstractBeanFactory;
import org.springframework.beans.factory.support.DefaultSingletonBeanRegistry;
import org.springframework.stereotype.Service;

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
 * @date Created in 2020年05月17日 10:47
 * @since 1.0
 */
@Setter
@Getter
@Service
public class TestService {

  /*  @Autowired*/
    private ConstructBean constructBean;


   /* @Autowired
    private CircleService  circleService;*/



    /*public TestService(ConstructBean constructBean,CircleService circleService){
        this.constructBean = constructBean;
    }
*/

  /*  public void setConstructBean(ConstructBean constructBean){
        this.constructBean = constructBean;
    }*/

    public void test1(){
        String name = constructBean.getName();
        System.out.println(name);
    }

   // AbstractAutowireCapableBeanFactory

    public static void main(String[] args) {
       int a =  "PJ2020052010470122".hashCode() % 16 ;

        System.out.println(a);
    }
}
