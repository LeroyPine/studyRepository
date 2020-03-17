/*
 * Copyright (c) 2017. Ziroom All rights reserved.
 * zres
 */

package com.leroy.practice.model;

import lombok.Builder;
import org.hibernate.validator.constraints.NotBlank;

import javax.validation.constraints.NotNull;
import java.util.List;

/**
 * Created by yaowg on 2017/10/26
 * @author yaowg
 */
@Builder
public class APIEvaluateQuestionsContentsRequest {



    /**
     * 评价记录编号
     * */
    @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsDetailsRequest.collectId.null}")
    private String collectId;

    @NotNull(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.evaluateMsg.null}")
    private EvaluateQuestionMsgRequest evaluateMsg;

    public static class EvaluateQuestionMsgRequest {
        /**
         * 请评对象id
         * */
        @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.requesterId.null}")
        private String requesterId;

        /**
         * 请评对象姓名
         * */
        @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.requesterName.null}")
        private String requesterName;

        /**
         * 请评对象类型
         * */
        @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.requesterType.null}")
        private String requesterType;

        /**
         * 请评对象手机号
         * */
        @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.requesterPhone.null}")
        private String requesterPhone;

        /**
         * 评价的合同号
         * */
        @NotBlank(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.orderCode.null}")
        private String orderCode;

        /**
         * 外围系统业务单号
         */
        private String ext;


        /**
         * 评价的问题集合
         * */
        @NotNull(message = "{com.ziroom.hestia.api.dto.request.APIEvaluateQuestionsContentsRequest.questions.null}")
        private List<EvaluateQuestionOptionsRequest> questions;


        public String getRequesterId() {
            return requesterId;
        }

        public void setRequesterId(String requesterId) {
            this.requesterId = requesterId;
        }

        public String getRequesterName() {
            return requesterName;
        }

        public void setRequesterName(String requesterName) {
            this.requesterName = requesterName;
        }

        public String getRequesterType() {
            return requesterType;
        }

        public void setRequesterType(String requesterType) {
            this.requesterType = requesterType;
        }

        public String getRequesterPhone() {
            return requesterPhone;
        }

        public void setRequesterPhone(String requesterPhone) {
            this.requesterPhone = requesterPhone;
        }

        public String getOrderCode() {
            return orderCode;
        }

        public void setOrderCode(String orderCode) {
            this.orderCode = orderCode;
        }

        public String getExt() {
            return ext;
        }

        public void setExt(String ext) {
            this.ext = ext;
        }

        public List<EvaluateQuestionOptionsRequest> getQuestions() {
            return questions;
        }

        public void setQuestions(List<EvaluateQuestionOptionsRequest> questions) {
            this.questions = questions;
        }

        @Override
        public String toString() {
            return "EvaluateQuestionMsgRequest{" +
                    "requesterId='" + requesterId + '\'' +
                    ", requesterName='" + requesterName + '\'' +
                    ", requesterType='" + requesterType + '\'' +
                    ", requesterPhone='" + requesterPhone + '\'' +
                    ", orderCode='" + orderCode + '\'' +
                    ", questions=" + questions +
                    '}';
        }
    }


    /**
     * 内部类 描述问题及选项
     */
    public static class EvaluateQuestionOptionsRequest {
        /**
         * 问题code
         */
        private String code;

        /**
         * 选项内容
         */
        private String content;

        /**
         * 选项code
         */
        private String optionCode;

        /**
         * 选项下的子问题
         */
        private List<EvaluateQuestionOptionsRequest> subQuestions;

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
        }

        public String getOptionCode() {
            return optionCode;
        }

        public void setOptionCode(String optionCode) {
            this.optionCode = optionCode;
        }

        public List<EvaluateQuestionOptionsRequest> getSubQuestions() {
            return subQuestions;
        }

        public void setSubQuestions(List<EvaluateQuestionOptionsRequest> subQuestions) {
            this.subQuestions = subQuestions;
        }

        @Override
        public String toString() {
            return "EvaluateQuestionOptionsRequest{" +
                    "code='" + code + '\'' +
                    ", content='" + content + '\'' +
                    ", optionCode='" + optionCode + '\'' +
                    '}';
        }
    }

    public String getCollectId() {
        return collectId;
    }

    public void setCollectId(String collectId) {
        this.collectId = collectId;
    }

    public EvaluateQuestionMsgRequest getEvaluateMsg() {
        return evaluateMsg;
    }

    public void setEvaluateMsg(EvaluateQuestionMsgRequest evaluateMsg) {
        this.evaluateMsg = evaluateMsg;
    }
}
