package com.leroy.practice.spring;

import com.leroy.practice.spring.value.ValueAnnotation;
import lombok.extern.slf4j.Slf4j;
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
 * @date Created in 2020年05月05日 15:37
 * @since 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class valueTests {


    @Autowired
    private ValueAnnotation valueAnnotation;

    @Test
    public void test(){
        Object o = valueAnnotation.valueAnn();
        System.out.println(o);
    }
}
