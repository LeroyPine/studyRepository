package com.leroy.practice.vo;

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
 * @date Created in 2020年06月17日 15:13
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChannelDataVO {

    /**
     * 表头
     */
    private List<TableVO> tableHeaders;

    /**
     * 渠道具体指标
     */
    private List<ChannelIndicatorVO> channelIndicators;

    /**
     * 渠道标题
     */
    private String title;

    /**
     * 更新时间
     */
    private String executionTimeStr;
}
