package com.leroy.practice.designmode.brige;

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
 * @date Created in 2020年03月21日 23:34
 * @since 1.0
 */
public class SmallBag extends Bag{



    @Override
    public String getName(String name) {
        return super.color.getColor()+name;
    }
}
