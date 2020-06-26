package com.leroy.practice.thread;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.List;

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
 * @date Created in 2020年06月17日 19:22
 * @since 1.0
 */
public class asd {

    public static void main(String[] args) {


        List<Object> a = new ArrayList<>();
/*
        a.add(TableHeaderVO.builder().text("白头").build());
        a.add(TableBodyVO.builder().code("!@3124").text("asfas").build());*/

        System.out.println(JSONObject.toJSONString(a));
    }
}
