package com.ziroom.evaluate.zry.repository.es.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.io.Serializable;
import java.net.Inet4Address;
import java.util.List;

/**
 * <pre>
 * desc ：自如寓评价实体
 * author ：lfq
 * date ：2018-12-02 10:45
 * </pre>
 */
@Setter
@Getter
@ToString
@Document(indexName = "evaluate_zry",type = "_doc")
public class ZryEvaluateEntity implements Serializable{

    @Id
    @Field(type = FieldType.Keyword)
    private String collectCode;

    @Field(type = FieldType.Keyword)
    private String sceneCode;
    @Field(type = FieldType.Integer)
    private Integer zoStar;
    @Field(type = FieldType.Double)
    private Double zoScore;

    @Field(type = FieldType.Integer)
    private Integer productStar;

    @Field(type = FieldType.Double)
    private Double productScore;
    @Field(type = FieldType.Integer)
    private Integer maintainStar;//维修星级
    @Field(type = FieldType.Integer)
    private Integer cleaningStar;//保洁星级
    @Field(type = FieldType.Integer)
    private Integer securityStar;//安保星级
    @Field(type = FieldType.Integer)
    private Integer atmosphereStar;//氛围星级
    @Field(type = FieldType.Integer)
    private Integer recommendStar;//推荐星级

    @Field(type = FieldType.Long)
    private Long evaluateTime;

    @Field(type = FieldType.Keyword)
    private String evaluatorCode;

    @Field(type = FieldType.Keyword)
    private String evaluatorName;

    @Field(type = FieldType.Keyword)
    private String evaluatorPhone;

    @Field(type = FieldType.Keyword)
    private String businessCode;
    @Field(type = FieldType.Keyword)
    private String projectId;

    @Field(type = FieldType.Keyword)
    private String beEvaluatorName;
    @Field(type = FieldType.Keyword)
    private String beEvaluatorCode;

    @Field(type = FieldType.Text)
    private String suggest;
    @Field(type = FieldType.Text)
    private String nonSuggest;

    @Field(type = FieldType.Nested)
    private List<TagEntity> zoTagList;
    @Field(type = FieldType.Nested)
    private List<TagEntity> productTagList;

    @Field(type = FieldType.Keyword)
    private List<String> picUrl;
    @Field(type = FieldType.Text)
    private String callBackContent;

    public static class field_name{
        public static String evaluateTime="evaluateTime";
    }

}
