package com.leroy.practice.vo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * <p>趋势图VO</p>
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

public class ChartVO {

    /**
     * 横轴数值
     */
    private List<String> xAxis;

    /**
     * 趋势图数据
     */
    private List<ChartDataVO> chartData;


}
