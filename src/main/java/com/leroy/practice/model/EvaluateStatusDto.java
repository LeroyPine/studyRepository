package com.ziroom.evaluate.common.model.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @Author fengbo.yue
 * @Date Created in 2019年08月06日 17:23
 * @Version 1.0
 * @Since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateStatusDto implements Serializable {

    private static final long serialVersionUID = 4853773895114230667L;

    // 评价code
    @ApiModelProperty(notes = "评价单号", value = "PJ2019012915540017", required = true)
    private String evaluateCode;

    // 场景code
    @ApiModelProperty(notes = "场景code: 租期-ZWGDPJ", value = "ZWGDPJ", required = true)
    private String sceneCode;

    // 评价状态
    @ApiModelProperty(notes = "评价状态: ywc-已评价，dpj-待评价", value = "ywc", required = true)
    private String evaluateStatus;

    // 业务单号
    @ApiModelProperty(notes = "业务单号", required = true)
    private String bizCode;

//    private String startTime;
//
//    private String endTime;
}
