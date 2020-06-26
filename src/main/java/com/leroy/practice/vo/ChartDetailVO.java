package com.leroy.practice.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * <p>趋势图detailVO</p>
 *
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author zhangxk
 * @version 1.0
 * @date Created in 2020/06/17
 * @since 1.0
 */
@Data
@Builder
public class ChartDetailVO {

    /**
     * 纵轴数值
     */
    private List<String> yAxis;

    /**
     * 图表名称
     */
    private String chartName;

    /**
     * 纵轴最大值
     */
    private String maximum;

    /**
     * 纵轴最小值
     */
    private String minimum;
}
