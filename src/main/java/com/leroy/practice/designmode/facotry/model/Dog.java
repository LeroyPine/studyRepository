package com.leroy.practice.designmode.facotry.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
 * @date Created in 2020年03月01日 12:27
 * @since 1.0
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Dog implements Animal{

    private String color;

    @Override
    public String getName() {
        return "23";
    }
}
