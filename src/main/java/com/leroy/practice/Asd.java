package com.leroy.practice;

import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.vo.*;
import com.leroy.practice.vo.module.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static com.google.common.collect.Lists.newArrayList;

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
 * @date Created in 2020年06月17日 21:10
 * @since 1.0
 */
public class Asd {

    public static void main(String[] args) {


        /*List<BaseIndicatorDataVO> baseDataList = new ArrayList<>();

        List<List<Object>> a = new ArrayList<>();

        a.add(newArrayList(TableHeaderVO.builder().isCanSort(1).text("表头呀").build()));

        a.add(newArrayList(TableBodyVO.builder().text("表体按时").isCanClick(1).code("60001234").build()));

        List<FunnelDataVO> funnelDataVOList = new ArrayList<>();

        funnelDataVOList.add(FunnelDataVO.builder()

                .code("zrw")
                .text("自如网")
                .funnelValue("32")
                .value("24")
                .build());


        TableOverviewVO build = TableOverviewVO.builder()

                .tableData(
                        a
                )
                .title("渠道预览")
                .updateTimeStr("更新时间2020/06/17")
                .build();


        baseDataList.add(BaseIndicatorDataVO.builder()
                .atomIndicatorData(
                        AtomIndicatorDataVO.builder()
                                .code("tst")
                                .name("测试")
                                .value("4")
                                .build())
                .compareIndicatorData(
                        CompareIndicatorDataVO.builder()
                                .color("green")
                                .direction("down")
                                .rate("10%")
                                .text("下降了{}")
                                .value("10")
                                .build()
                )
                .build());


        CustomerConversionDataVO build1 = CustomerConversionDataVO.builder()
                .baseDataList(baseDataList)
                .channelDataList(build)
                .funnelDataList(funnelDataVOList)
                .build();

        System.out.println(JSONObject.toJSONString(build1));

        System.out.println("==========");

        //    List<ChartVO> chartVOS = new ArrayList<>();

        List<ChartPointVO> chartPointVOS = new ArrayList<>();

        //  chartPointVOS.add(ChartPointVO.builder().a(newArrayList("12","142","24")).b(newArrayList("124124","1242")).build());
*//*
        chartPointVOS.add(ChartPointVO.builder().horizontalData("13").verticalData("24").build());

        chartPointVOS.add(ChartPointVO.builder().horizontalData("14").verticalData("25").build());*//*


        System.out.println(JSONObject.toJSONString(ChartVO.builder()
                .xAxis(newArrayList("1231", "11111", "1212121", "2331245"))
                .chartData(newArrayList(ChartDataVO.builder()
                        .chartName("续约率")
                        .maximum("100")
                        .minimum("1")
                        .yAxis(newArrayList("11", "22", "334", "342523"))
                        .build()))
                .build()));*/


     /*   Double aDouble = divideToPercent(5, 19, 2);
        System.out.println(aDouble);*/
       // yAxisProcess(null,newArrayList(1.1D,2.D,4.D,5.D,6.2D));

       String a = "'2020-03-01 00:00:00','2020-04-01 00:00:00'";

        int length = a.length();
        System.out.println(length);
        String substring = a.substring(22);
        System.out.println(substring);
    }
    private static ChartDataVO yAxisProcess(ChartDataVO chart,List<? extends Comparable> list){

        Comparable max = Collections.max(list);
        System.out.println(max.toString());
        return null;

    }

    public static Double divideToPercent(double numerator, double denominator, int chainScale) {
        return BigDecimal.valueOf(numerator).divide(BigDecimal.valueOf(denominator), chainScale, BigDecimal.ROUND_HALF_UP)
                .multiply(BigDecimal.valueOf(100)).doubleValue();
    }
}
