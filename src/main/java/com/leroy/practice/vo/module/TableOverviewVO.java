package com.leroy.practice.vo.module;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

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
 * @date Created in 2020年06月17日 19:13
 * @since 1.0
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TableOverviewVO {

    /**
     * 标题
     */
    private String title;

    /**
     * 更新时间
     */
    private String updateTimeStr;

    /**
     * 小问号
     */
    private String popTip;


    /**
     * 表格数据
     */
    private List<List<Object>> tableData;
}
