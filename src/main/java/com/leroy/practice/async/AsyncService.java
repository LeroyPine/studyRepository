package com.leroy.practice.async;

import org.springframework.scheduling.annotation.Async;
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
 * @date Created in 2019年08月22日 10:18
 * @since 1.0
 */
@Service
public class AsyncService {

    @Async
    public void anyncTest(){
        System.out.println("asnyc");
    }
}
