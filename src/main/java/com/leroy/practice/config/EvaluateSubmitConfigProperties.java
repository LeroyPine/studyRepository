package com.leroy.practice.config;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.alibaba.fastjson.parser.Feature;
import com.leroy.practice.EvaluateSubmitVO;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

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
 * @date Created in 2020年08月11日 16:21
 * @since 1.0
 */

@Data
@Component
@ConfigurationProperties(prefix = "evaluate.submit.success")
@PropertySource(value = {"classpath:*.properties", "classpath:*.yml",}, ignoreResourceNotFound = true, encoding = "UTF-8")
public class EvaluateSubmitConfigProperties implements InitializingBean {

    private String a;

    private String sceneDefaultCode;

    private String pageContent;

    private Map<String, EvaluateSubmitVO> submitSuccessPageContentHolder;


    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println(pageContent);
        // 不为空
        if (StringUtils.isNotBlank(pageContent)){
            submitSuccessPageContentHolder = new ConcurrentHashMap<>();
            Map<String, EvaluateSubmitVO> map = JSON.parseObject(
                    this.pageContent,
                    new TypeReference<Map<String, EvaluateSubmitVO>>(){}

            );
            submitSuccessPageContentHolder.putAll(map);
        }

        System.out.println(122);
    }

}
