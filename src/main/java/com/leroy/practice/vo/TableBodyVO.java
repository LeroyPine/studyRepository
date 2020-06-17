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
 * @date Created in 2020年06月17日 19:17
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TableBodyVO {

    /**
     * 编码
     */
    private String code;

    /**
     * 字段名称
     */
    private String text;

    /**
     * 是否可以排序   1: 可以点击 0: 不可以点击
     */
    private Integer isCanClick;
}
