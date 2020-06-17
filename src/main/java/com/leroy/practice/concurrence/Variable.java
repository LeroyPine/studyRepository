package com.leroy.practice.concurrence;

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
 * @date Created in 2020年05月24日 15:17
 * @since 1.0
 */
public class Variable {


    public volatile long count = 0 ;


    private void add(){
        int id = 0;
        while (id ++ < 10000){
            count += 1;
        }
    }

    public  long cal() throws Exception{
        final Variable variable = new Variable();

        Thread thread = new Thread(
                ()->{

                  //  System.out.println(1111);
                    add();
                });
               // variable::add);

        Thread thread2 = new Thread(

                ()->{
                    add();
                   // System.out.println(22222);
                });
                //variable::add);

        thread.start();

        thread2.start();

        thread.join();

        System.out.println("join 1-2");

        thread2.join();

        System.out.println("count ===" + count);

        return  count;
    }


    public static void main(String[] args) throws Exception {
        Variable variable = new Variable();

        long cal = variable.cal();

        System.out.println(cal);


    }



}
