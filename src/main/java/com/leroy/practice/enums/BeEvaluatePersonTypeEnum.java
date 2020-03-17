package com.leroy.practice.enums;


/**
 * <p>被评价人类型</p>
 * <p> zres中对应的
 * <PRE>
 * <BR>	修改记录
 * <BR>-----------------------------------------------
 * <BR>	修改日期			修改人			修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date 2019-08-13
 * @since 1.0
 */
public enum BeEvaluatePersonTypeEnum {

    COMPREHENSIVE_HOUSEKEEPER("zo", "综合管家"),
    BELONG_HOUSEKEEPER("ssgj", "所属管家"),
    SERVICE_HOUSEKEEPER("fwgj", "服务管家"),
    NETWORK_HOUSEKEEPER("salesZO", "网络管家"),
    ZIROOM_FLAT_HOUSEKEEPER("ZAZO", "自如寓管家"),
    STAGE_HOUSEKEEPER("zra", "自如驿管家"),
    CONFIG_COMMISSIONER("pzzy", "配置专员"),
    SIGN_HOUSEKEEPER("qsgj","签署管家"),
    ZIROOM_APP("ZRK_APP","自如客APP");

    /**
     * 类型编码
     */
    private String code;

    /**
     * 类型名称
     */
    private String name;

    BeEvaluatePersonTypeEnum(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public static BeEvaluatePersonTypeEnum getByCode(String code){
        for (BeEvaluatePersonTypeEnum beEvaluatePersonTypeEnum : BeEvaluatePersonTypeEnum.values()) {
            if (beEvaluatePersonTypeEnum.getCode().equals(code.trim())) {
                return beEvaluatePersonTypeEnum;
            }
        }
        return null;
    }
}
