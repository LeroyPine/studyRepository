package com.leroy.practice.exception;

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
 * @date Created in 2020年08月05日 10:29
 * @since 1.0
 */
public class BizException extends RuntimeException{



    public BizException(String message){
        super(message);
    }
}
