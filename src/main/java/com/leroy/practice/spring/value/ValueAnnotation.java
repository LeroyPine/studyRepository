package com.leroy.practice.spring.value;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

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
 * @date Created in 2020年05月05日 15:34
 * @since 1.0
 */
@Component
public class ValueAnnotation {


    @Value("leroy.value:10")
    private String leroy;


    public Object valueAnn(){
        return leroy;
    }


}
