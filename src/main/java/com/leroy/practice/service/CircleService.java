package com.leroy.practice.service;

import org.springframework.beans.factory.annotation.Autowired;
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
 * @date Created in 2020年05月17日 19:58
 * @since 1.0
 */
@Service
public class CircleService {

    @Autowired
    private TestService testService;


  /*  @Autowired
    public CircleService (TestService testService){
        System.out.println(1);
    }*/
    public void test1() {
        testService.test1();
    }
}
