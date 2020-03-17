package com.leroy.practice.stream;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

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
 * @date Created in 2020年03月09日 10:51
 * @since 1.0
 */
public class StreamTest {


    @SuppressWarnings("unchecked")
    private static List<Student> students ;

    @Before
    public void testBefore(){
       List<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Student student = new Student();
            student.setAge(i+1);
            student.setHeight("体重"+i);
            student.setHobby("篮球"+i);
            student.setName("leroy"+i);
            students.add(student);
        }
    }


    @Test
    public void test(){

        // 无限输出
       // Stream<Integer> iterate = Stream.iterate(0, t -> t + 1);
        //iterate.forEach(System.out::println);


        // Stream.iterate(5,t->t+2).limit(5).forEach(System.out::println);

        Stream.generate(Math::random).limit(5).forEach(System.out::println);


            double random = Math.random();

    }

    @Test
    public void test1(){
        // 小于等于
        double floor = Math.floor(1.656);
        System.out.println(floor);
    }



    @Test
    public void test2(){

        BigDecimal zero = BigDecimal.ZERO;
        System.out.println(zero.intValue());

      /*  System.out.println(33333);
        re(2);
        System.out.println(2222);*/
    }



    private void re(int a){
        if (a ==1){
            return;
        }
        System.out.println(1);

    }
}
