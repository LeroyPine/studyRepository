package com.leroy.practice.inject;

import lombok.Data;
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
 * @date Created in 2020年05月17日 10:41
 * @since 1.0
 */

@Data
public class ConstructBean {



    private String name;
    private String phone;
    private String address;

    public ConstructBean(String name,String phone){
        this.name = name;
        this.phone = phone;
    }

/*
    public ConstructBean(String name,String phone,String address){
        this.name = name;
        this.phone = phone;
        this.address = address;
    }*/

}
