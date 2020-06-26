package com.leroy.practice;

import lombok.Getter;

import java.util.Arrays;
import java.util.Objects;

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
 * @date Created in 2020年06月23日 14:49
 * @since 1.0
 */
@Getter
public enum ServiceIndexEnums {
    //
    ZERO(0, "团队服务指数", "提升可获得更多自如网客源"),
    ONE(1, "展示服务指数分数", "展示城市排名"),
    TWO(2, "暂未更新", "提升可获得更多自如网客源"),
    THREE(3, "暂未参评", "点击查看详细规则");

    private Integer code;
    private String text;
    private String measure;

    ServiceIndexEnums(Integer code, String text, String measure) {
        this.code = code;
        this.text = text;
        this.measure = measure;
    }

    /**
     * @param
     * @return
     * @author luobs
     * @description
     * @date 2020/6/23 15:00
     */
    public static ServiceIndexEnums getByCode(Integer code) {
        return Arrays.stream(ServiceIndexEnums.values()).filter(c -> Objects.equals(c.getCode(), code)).findAny().orElse(null);
    }
}
