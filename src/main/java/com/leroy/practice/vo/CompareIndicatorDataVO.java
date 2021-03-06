package com.leroy.practice.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
 * @date Created in 2020年06月17日 18:26
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompareIndicatorDataVO {

    /**
     * 显示文本
     */
    private String text;

    /**
     * 值
     */
    private String value;

    /**
     * 增加减少 率
     */
    private String rate;

    /**
     * 颜色
     */
    private String color;

    /**
     * 方向
     */
    private String direction;
}
