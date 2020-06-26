package com.leroy.practice.vo.module;

import com.leroy.practice.vo.BaseIndicatorDataVO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * <p></p>
 * <p>
 * <PRE>   tips: 客源转化数据
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年06月17日 11:49
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerConversionDataVO {



    /**
     * 转化数据指标集合
     */
    private List<BaseIndicatorDataVO> baseDataList;


    /**
     * 客源转化漏斗数据集合
     */
    private List<FunnelDataVO> funnelDataList;


    /**
     * 渠道概览数据
     */
    private TableOverviewVO channelDataList;


}
