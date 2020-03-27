package com.leroy.practice.designmode.decorate;

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
 * @date Created in 2020年03月22日 10:17
 * @since 1.0
 */
public class LeroyExecute implements Target{


    @Override
    public void process() {
        System.out.println("具体实现Leroy-Decorate");
    }
}
