package com.leroy.practice;

import lombok.Builder;
import lombok.Data;

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
 * @date Created in 2020年06月23日 14:30
 * @since 1.0
 */
@Data
@Builder
public class ServiceIndexBO {

    private ServiceIndexResponse serviceIndexResponse;
}
