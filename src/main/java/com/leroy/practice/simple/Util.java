package com.leroy.practice.simple;

import com.google.common.collect.Lists;
import org.apache.commons.collections.ListUtils;
import org.springframework.util.DigestUtils;

import java.util.ArrayList;
import java.util.List;

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
 * @date Created in 2020年05月10日 15:37
 * @since 1.0
 */
public class Util {


    public static void main(String[] args) {
String  st  = "PJ2019012917540118" + "http://intimage.ziroom.com/g1m1/M00/45/14/ChAFB1xRBTqAX7FZAAuoyNNfnBk999.jpg";
        String  st1 = "PJ2019012917540118" + "http://intimage.ziroom.com/g1m1/M00/46/06/ChAFBlxjgxOAJffFAAFX_xCgb-8762.jpg";

        String s = DigestUtils.md5DigestAsHex(st.getBytes());
        String s2 = DigestUtils.md5DigestAsHex(st1.getBytes());
        System.out.println(s);
        System.out.println(s2);



    /*    List<Integer> valueList = Lists.newArrayList();
        valueList.add(1);
        valueList.add(3);


        int totalSize = valueList.size();
        List<List<Integer>> partitionList = new ArrayList<>();
        for (int i = 0; i < totalSize; i += 5) {
            partitionList.add(valueList.subList(i, Math.min(i + 5, totalSize)));
        }
*/


    }
}
