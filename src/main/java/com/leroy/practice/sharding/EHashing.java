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
 * @Created by fengbo.yue
 * @ClassName EHashing
 * @Description TODO
 * @Date Created in 2020/5/20 5:27 下午
 * @Version 1.0
 * com.ziroom.evaluate.common.restricted.
 * ziroom-evaluate-service.
 */

import org.apache.commons.codec.digest.DigestUtils;

import java.util.Objects;

/**
 * 不能修改
 * todo
 */
public final class EHashing {

    public static final int hash = 17;

    public static final int radix = 16;
    public static final int beginIndex = 0;
    public static final int endIndex = 6;

    private EHashing() {
    }

    /**
     * hash 算法
     * @param target
     * @return
     */
    public static int hashingCode(String target) {
        Objects.requireNonNull(target);
        return fnv1_32_hash(target);
    }

    /**
     * 《hash算法》@待办，@IM
     * todo 2020-05-20 18:06:10 再测试数据平均
     * 待办，IM 都是用该方法去hashCode  @小白
     *
     * @param id
     * @return
     */
    @Deprecated
    public static int idHash(String id) {
        return Integer.parseInt(DigestUtils.md5Hex(id).substring(beginIndex, endIndex), radix);
    }

    /**
     * 《不可以修改》
     * 计算Hash值, 使用FNV1_32_HASH算法
     *
     * @param str
     * @return
     */
    public static int fnv1_32_hash(String str) {
        final int p = 16777619;
        int hash = (int)2166136261L;
        for (int i = 0; i < str.length(); i++) {
            hash =( hash ^ str.charAt(i) ) * p;
        }
        hash += hash << 13;
        hash ^= hash >> 7;
        hash += hash << 3;
        hash ^= hash >> 17;
        hash += hash << 5;

        if (hash < 0) {
            hash = Math.abs(hash);
        }
        return hash;
    }
}
