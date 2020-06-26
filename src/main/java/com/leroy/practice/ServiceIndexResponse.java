package com.leroy.practice;

import lombok.Builder;
import lombok.Data;

/**
 * <p></p>
 * <p>
 * <PRE>   服务指数
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年06月23日 13:57
 * @since 1.0
 */
@Data
@Builder
public class ServiceIndexResponse {

    /**
     * 	展示状态
     */
    private Integer showStatus;

    /**
     * 	服务分
     */
    private Integer serviceScore;

    /**
     * 服务分排名
     */
    private Integer scoreRank;

    /**
     * 排名范围
     */
    private String scoreRankScope;
}
