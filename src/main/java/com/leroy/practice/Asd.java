package com.leroy.practice;

import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.vo.*;
import com.leroy.practice.vo.module.*;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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

    public static void main(String[] args) throws InterruptedException, ParseException {


       /*String a = "'2020-03-01 00:00:00','2020-04-01 00:00:00'";
       a.wait();
        int length = a.length();
        System.out.println(length);
        String substring = a.substring(22);
        System.out.println(substring);*/

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = sdf.parse("2020-03-01 00:00:00");
        Date date1 = sdf.parse("2020-04-01 00:00:00");
        Date date2 = sdf.parse("2020-05-01 00:00:00");
        Date date3 = sdf.parse("2020-06-01 00:00:00");
        Date date4 = sdf.parse("2020-07-01 00:00:00");
        Date date5 = sdf.parse("2020-08-01 00:00:00");

        List<RentRenewalTrendResp> renewalTrendData = new ArrayList<>();
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(400))
                .alreadyExtensionCnt(BigDecimal.valueOf(102))
                .businessTime(date)
                .executionTime(new Date())
                .build());
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(312))
                .alreadyExtensionCnt(BigDecimal.valueOf(102))
                .businessTime(date1)
                .executionTime(new Date())
                .build());
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(150))
                .alreadyExtensionCnt(BigDecimal.valueOf(50))
                .businessTime(date2)
                .executionTime(new Date())
                .build());
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(200))
                .alreadyExtensionCnt(BigDecimal.valueOf(150))
                .businessTime(date3)
                .executionTime(new Date())
                .build());
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(400))
                .alreadyExtensionCnt(BigDecimal.valueOf(80))
                .businessTime(date4)
                .executionTime(new Date())
                .build());
        renewalTrendData.add(RentRenewalTrendResp.builder()
                .shouldExtensionCnt(BigDecimal.valueOf(400))
                .alreadyExtensionCnt(BigDecimal.valueOf(80))
                .businessTime(date5)
                .executionTime(new Date())
                .build());



        CustomerConversionResp customerConversionResp = new CustomerConversionResp();

        customerConversionResp.setCstNums(BigDecimal.valueOf(300));
        customerConversionResp.setLookCstNums(BigDecimal.valueOf(100));
        customerConversionResp.setLookSignCstNums(BigDecimal.valueOf(50));
        customerConversionResp.setSignCstNums(BigDecimal.valueOf(60));


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
