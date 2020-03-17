package com.ziroom.evaluate.model.evaluate.old;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.apache.dubbo.config.annotation.Service;

import java.io.Serializable;
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
 * @date Created in 2019年07月14日 14:00
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class DikeEvaluateResult extends DikeBaseRequest implements Serializable {

    /**
     * 评价结果对应的collect表id
     */
    private String collectCode;
    /**
     * 场景类型 1：评价 2：调研
     */
    private Integer sceneType;
    /**
     * 场景编码
     */
    private String sceneCode;

    /**
     * 被评价人编号（系统号）
     */
    private String evaluatedPersonCode;

    /**
     * 请评对象id
     */
    private String requesterId;
    /**
     * 请评人类型
     */
    private String requesterType;
    /**
     * 评价业务单号,统一称谓
     */
    private String businessCode;

    /**
     * 外围系统体业务号码
     */
    private String ext;

    /**
     * 客户是否同意回访
     */
    private Integer isAgreeCallBack;

    /**
     * 评价结果详情json
     */
    private List<QuestionAnswersRequest> questionAnswers;

    /**
     * 渠道code
     */
    private String channelCode;


    /**
     * 评价问题及选项答案
     */
    @Data
    public static class QuestionAnswersRequest {
        /**
         * 评价问题id
         */
        private String questionCode;
        /**
         * 评价问题对应答案选项id,多个问题答案使用","拼接
         */
        private String optionCode;
        /**
         * 填写型问题的答案
         */
        private String content;
        /**
         * 图片型问题的图片url,多个URL使用","拼接
         */
        private String picUrl;
        /**
         * 父答案选项id
         */
        private String parentOptionCode;


    }
}
