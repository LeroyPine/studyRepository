package com.leroy.practice.vo.module;

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
 * @date Created in 2020年06月17日 14:58
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class FunnelDataVO {

    /**
     * 编码
     */
    private String code;

    /**
     * 名称
     */
    private String text;

    /**
     * 值
     */
    private String value;

    /**
     * 漏斗值
     */
    private String funnelValue;
}
