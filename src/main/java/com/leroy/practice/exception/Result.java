package com.leroy.practice.exception;

import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.Button;
import com.leroy.practice.NextPage;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

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
 * @date Created in 2020年08月05日 10:30
 * @since 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class Result {

    private String evaluateCode;

    private String directJumpUrl;

    private NextPage nextPage;



    public static void main(String[] args) {

     Result result = new Result();

     result.setEvaluateCode("PJ2020081015320304");
     result.setDirectJumpUrl("www.baidu.com");

     NextPage nextPage = new NextPage();
     nextPage.setBody(null);
     List<Button> buttons = new ArrayList<>();
     Button b = new Button();
     b.setButtonName("查看详情");
     b.setButtonUrl("www.xxx.com");
     buttons.add(b);
     nextPage.setButtons(buttons);
     nextPage.setTitle("评价成功");
     nextPage.setSubTitle("感谢您的评价");
     result.setNextPage(nextPage);

        System.out.println(JSONObject.toJSONString(result));
    }

}
