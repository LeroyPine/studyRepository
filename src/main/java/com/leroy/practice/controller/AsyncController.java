package com.leroy.practice.controller;

import com.leroy.practice.async.AsyncService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
 * @date Created in 2020年03月27日 11:43
 * @since 1.0
 */
@RequestMapping("/async")
@RestController
@RequiredArgsConstructor
public class AsyncController {

    private final AsyncService asyncService;

    @RequestMapping("/test")
    public String test() throws InterruptedException {
        System.out.println(1);
        for (int i = 0; i < 20; i++) {
            System.out.print("执行到第几次:");
            System.out.print(i+1);
            asyncService.anyncTest();

        }


        return "1";
    }
}
