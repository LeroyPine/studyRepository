package com.leroy.practice.sharding;

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
 * @date Created in 2020年05月25日 10:46
 * @since 1.0
 */
public class CalculateTable {

    public static void main(String[] args) {

        String evaluateCode = "PJ2020060100000005";

        String hitting = ESharding.hitting(evaluateCode);

        System.out.println("==================");

        System.out.println(hitting);

        System.out.println("==================");

    }
}
