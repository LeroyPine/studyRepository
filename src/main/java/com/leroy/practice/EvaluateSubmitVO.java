package com.leroy.practice;

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
 * @date Created in 2020年08月10日 17:02
 * @since 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EvaluateSubmitVO {

    /**
     * 提交完成后 直接跳转链接
     */
    private String directJumpUrl;

    /**
     * 评价单号
     */
    private String evaluateCode;

    /**
     * 下一页
     */
    private SubmitNextPageVO nextPage;
}
