package com.leroy.practice.model;

import lombok.Data;

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
 * @date Created in 2019年08月09日 16:40
 * @since 1.0
 */
@Data
public class UserBP {

    private String userName;

    private String sex;

    private int age;

}
