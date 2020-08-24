package com.leroy.practice.exception;

import java.util.Optional;

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
 * @date Created in 2020年08月05日 10:31
 * @since 1.0
 */
public class Test {


    public static void main(String[] args) {

       /* Result as = Result.builder().exception(new BizException("as")).build();

        Throwable exception = as.getException();

        System.out.println(exception);*/
        String contrastJobCode = "0";

        contrastJobCode = Optional.ofNullable("0").filter(s->!s.equals("0")).orElse(null);
        System.out.println(contrastJobCode);

    }

}
