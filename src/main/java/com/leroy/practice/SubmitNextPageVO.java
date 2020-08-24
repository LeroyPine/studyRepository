package com.leroy.practice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
 * @date Created in 2020年08月10日 17:22
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SubmitNextPageVO {

    /**
     * 标题
     */
    private String title;

    /**
     * 子标题
     */
    private String subTitle;

    /**
     * 按钮集合
     */
    private List<Button> buttons;

}
