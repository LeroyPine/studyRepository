import com.leroy.practice.IndexVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

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
 * @date Created in 2020年06月23日 14:19
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class ServiceIndexVO extends IndexVO {

    /**
     * 服务分数
     */
    private Integer score;

    /**
     * 城市排名
     */
    private Integer ranking;

    /**
     * 地区名称
     */
    private String areaName;


    /**
     * 当前状态文案
     */
    private String text;


    /**
     * 提示
     */
    private String tips;

    /**
     * 单位
     */
    private String unit;
}
