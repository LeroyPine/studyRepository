package com.leroy.practice.polymorphic;

import org.springframework.beans.factory.InitializingBean;

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
 * @date Created in 2020年04月23日 15:40
 * @since 1.0
 */
public class Father implements InitializingBean {

    public Father(){
        System.out.println("我是父亲呀");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("我是父亲呀：我是什么时候调用的呢？");
    }
}
