package com.leroy.practice;

import com.leroy.practice.service.TestService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

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
 * @date Created in 2019年08月24日 12:29
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EsTest {


    @Autowired
    private TestService testService;


    @Test
    public void test(){
        testService.test1();
    }


}
