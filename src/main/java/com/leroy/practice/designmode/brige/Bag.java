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
 * @date Created in 2020年03月21日 23:33
 * @since 1.0
 */
public abstract class Bag {

    protected Color color;

    public void setColor(Color color) {
        this.color = color;
    }


    public abstract String getName(String name);
}
