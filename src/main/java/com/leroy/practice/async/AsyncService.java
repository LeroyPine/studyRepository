package com.leroy.practice.async;

import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class AsyncService {

    @Async
    public void anyncTest() throws InterruptedException {
        log.info("11111111");
        Thread.sleep(2000);
        log.info("线程1结束");
    }


    @Async
    public void anyncTest2(){
        log.info("asnyc是否有效");
    }



}
