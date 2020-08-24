package com.leroy.practice.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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
 * @date Created in 2020年06月19日 13:45
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerChannelDataBO {

    /**
     * 客源渠道
     */
    private String customerSource;


    /**
     * 客源量
     */
    private BigDecimal cstNums;

    /**
     * 客源量到带看量
     */
    private BigDecimal lookCstNums;

    /**
     * 客源量到带看量再到签约量
     */
    private BigDecimal lookSignCstNums;

    /**
     * 客源量直接到签约量
     */
    private BigDecimal signCstNums;

    /**
     * 客源签约率
     */
    private BigDecimal cstSignRate;

    /**
     * 客源带看率
     */
    private BigDecimal cstLookRate;


}
