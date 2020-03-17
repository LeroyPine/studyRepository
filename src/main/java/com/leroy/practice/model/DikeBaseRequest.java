package com.leroy.practice.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

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
 * @author luobs
 * @version 1.0
 * @date Created in 2019年07月14日 14:02
 * @since 1.0
 */
@Getter
@Setter
@ToString
public class DikeBaseRequest implements Serializable {

    /**
     * 数据渠道
     * 1：管家APP
     * 2：自如客APP
     * 3：业主微信
     * 4：自如网
     * 5：资产系统
     * 6：配置系统
     * 7：自如寓APP
     * 8：自如驿APP
     */
    private Integer dataSource;

}
