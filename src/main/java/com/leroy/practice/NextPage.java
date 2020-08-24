package com.leroy.practice;

import lombok.Data;

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
 * @date Created in 2020年08月10日 15:43
 * @since 1.0
 */
@Data
public class NextPage {


    private String title;

    private String subTitle;

    private Body body;

    private List<Button>  buttons;


}
