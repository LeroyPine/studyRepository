package com.leroy.practice.request;

import lombok.Data;

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
 * @date Created in 2020年06月17日 11:39
 * @since 1.0
 */
@Data
public class ConversionDataRequest {

    /**
     * 时间范围
     */
    private String timeRange;

    /**
     * 渠道编码
     */
    private String channelCode;
}
