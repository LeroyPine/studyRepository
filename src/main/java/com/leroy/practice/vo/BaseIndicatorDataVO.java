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
 * @date Created in 2020年06月17日 18:28
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class BaseIndicatorDataVO {


    /**
     * 指标原子数据VO
     */
    private AtomIndicatorDataVO atomIndicatorData;

    /**
     * 比较指标数据VO
     */
    private CompareIndicatorDataVO compareIndicatorData;
}
