import com.alibaba.fastjson.JSONObject;
import com.leroy.practice.ServiceIndexBO;
import com.leroy.practice.ServiceIndexEnums;
import com.leroy.practice.ServiceIndexResponse;

import java.util.Objects;

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
 * @date Created in 2020年06月23日 15:38
 * @since 1.0
 */
public class Asd {


    public static ServiceIndexVO convertByIndexBO(ServiceIndexBO serviceIndexBo) {

        ServiceIndexResponse indexResponse = serviceIndexBo.getServiceIndexResponse();

        Integer score = null;
        Integer ranking = null;
        String text = null;
        String measure = null;
        String areaName = null;
        String unit = null;

        if (Objects.isNull(indexResponse)) {
            return null;
        }

        switch (ServiceIndexEnums.getByCode(indexResponse.getShowStatus())) {
            case ZERO:
                text = ServiceIndexEnums.ZERO.getText();
                measure = ServiceIndexEnums.ZERO.getMeasure();
                break;
            case ONE:
                score = indexResponse.getServiceScore();
                ranking = indexResponse.getScoreRank();
                areaName = indexResponse.getScoreRankScope() + "排名";
                unit = "名";
                break;
            case TWO:
                text = ServiceIndexEnums.TWO.getText();
                measure = ServiceIndexEnums.TWO.getMeasure();
                break;
            case THREE:
                text = ServiceIndexEnums.THREE.getText();
                measure = ServiceIndexEnums.THREE.getMeasure();
                break;
            default:
                System.out.println(12);
        }
        ServiceIndexVO indexVO = new ServiceIndexVO();
        indexVO.setTitle("服务指数");
        indexVO.setScore(score);
        indexVO.setText(text);
        indexVO.setTips(measure);
        indexVO.setAreaName(areaName);
        indexVO.setRanking(ranking);
        indexVO.setUnit(unit);
        return indexVO;

    }

    public static void main(String[] args) {
        ServiceIndexVO 北京 = convertByIndexBO(ServiceIndexBO.builder().serviceIndexResponse(

                ServiceIndexResponse.builder()
                        .serviceScore(80)
                        .scoreRankScope("北京")
                        .showStatus(2)
                        .scoreRank(89)
                        .build()

        ).build());

        System.out.println(JSONObject.toJSONString(北京));
    }
}
