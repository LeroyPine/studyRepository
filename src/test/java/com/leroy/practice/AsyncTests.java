package com.leroy.practice;

import com.leroy.practice.async.AsyncService;
import com.leroy.practice.model.Leroy;
import com.leroy.practice.model.LeroyParent;
import com.leroy.practice.model.Lina;
import lombok.extern.slf4j.Slf4j;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

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
 * @date Created in 2019年08月22日 10:19
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class AsyncTests {


    @Autowired
    private AsyncService asyncService;


    @Test
    public void test1() {
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        asyncService.anyncTest();
        System.out.println(6);
    }

    @Test
    public void test2() {


        Leroy leroy = new Leroy();
        leroy.setAge("12312");
        leroy.setBes("151251211111");
        LeroyParent leroyParent = new LeroyParent();
        leroyParent.setName("luo");
        leroyParent.setPhone("120");
        leroyParent.setLer(leroy);


        Lina lina = new Lina();

        BeanUtils.copyProperties(leroyParent, lina);

        System.out.println(lina);

    }

    @Test
    public void test3() {

        Long a = 45l;
        long b = a;
        System.out.println(b);

    }


    @Test
    public void test4() {
        Double a = 5.00d;
        BigDecimal bigDecimal = new BigDecimal(a);
        System.out.println(bigDecimal);
    }


    @Test
    public void test5() {
        int successTotal = 0;
        int errorTotal = 0;
        int num = 20;
        for (int i = 0; i < num; i++) {

            try {
                if (i == 8 || i == 10) {
                    throw new Exception("不允许写入");
                }

                successTotal = successTotal + 1;
            } catch (Exception e) {
                errorTotal = errorTotal + 1;
                log.error("异常");
            }
        }
        System.out.println("成功条数:" + successTotal);

        System.out.println("失败条数:" + errorTotal);
    }

}
