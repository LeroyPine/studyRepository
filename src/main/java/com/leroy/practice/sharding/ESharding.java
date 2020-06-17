package com.leroy.practice.sharding;

import lombok.extern.slf4j.Slf4j;

import static com.leroy.practice.sharding.EHashing.hashingCode;

/**
 * <p></p>
 * <p>
 * <PRE>
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @Created by fengbo.yue
 * @ClassName ShardingHitting
 * @Description TODO
 * @Date Created in 2020/5/20 6:01 下午
 * @Version 1.0
 * com.ziroom.evaluate.common.restricted.
 * ziroom-evaluate-service.
 */

/**
 * 《不能修改》
 */
@Slf4j
public final class ESharding {

    private static final int sharding_num = 16;

    private ESharding () {
    }

    public static String hitting(String shardingValue) {
        return mod(shardingValue) + "";
    }

    public static int mod(String shardingValue) {
        return hashingCode(shardingValue)  %  sharding_num;
    }

    public static String info() {

        final String ll = "\n";
        final String start = "-------------------- ESharding Info --------------------d ";

        StringBuilder builder = new StringBuilder(ll);
        builder.append(start).append(ll);
        builder.append("sharding count : ").append(sharding_num).append(ll);
        builder.append("hash arithmetic : ").append("com.ziroom.evaluate.common.restricted.EHashing#fnv1_32_hash").append(ll);
        builder.append(start);

        return builder.toString();
    }

}
