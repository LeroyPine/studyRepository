package com.leroy.practice.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.checkerframework.checker.units.qual.A;

import java.util.List;

/**
 * <p>趋势图点位VO</p>
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
@ApiModel(value = "趋势图每一个点位VO")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ChartPointVO {

   /* @ApiModelProperty(value = "纵轴数值", example = "15")
    private String verticalData;*/

    private List<String> a;
/*
    @ApiModelProperty(value = "横轴数值", example = "4.21")
    private String horizontalData;*/

    private List<String> b;
}
