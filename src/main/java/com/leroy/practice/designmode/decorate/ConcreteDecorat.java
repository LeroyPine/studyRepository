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
 * @date Created in 2020年03月22日 10:22
 * @since 1.0
 */
public class ConcreteDecorat extends Decoator {


    public ConcreteDecorat(Target target) {
        super(target);
    }

    @Override
    public void process() {
        add();
        super.process();
    }


    private void add() {
        System.out.println(123);
    }
}
