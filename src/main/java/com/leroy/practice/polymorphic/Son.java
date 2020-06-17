package com.leroy.practice.polymorphic;

import org.springframework.context.annotation.Bean;
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
 * @date Created in 2020年04月23日 15:40
 * @since 1.0
 */
@Component
public class Son extends Father{

    public Son(){
        System.out.println("我是儿子");
    }



    public void hello(){
        System.out.println("Hello By 儿子");
    }


    public static void main(String[] args) {
        Son son = new Son();

    }
}
