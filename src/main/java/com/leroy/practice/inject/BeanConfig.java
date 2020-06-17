package com.leroy.practice.inject;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
 * @date Created in 2020年05月17日 11:52
 * @since 1.0
 */
@Configuration
public class BeanConfig {


    @Bean
    public ConstructBean constructBean(){
        return new ConstructBean("a","B");
    }
}
