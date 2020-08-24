package com.leroy.practice.vo;

import lombok.Getter;

import java.util.*;

/**
 * <p></p>
 * <p>
 * <PRE>   渠道枚举
 * <BR>    修改记录
 * <BR>-----------------------------------------------
 * <BR>    修改日期         修改人          修改内容
 * </PRE>
 *
 * @author luobs
 * @version 1.0
 * @date Created in 2020年06月18日 10:39
 * @since 1.0
 */
@Getter
public enum ChannelEnums {

    //
    ALL("all", "全部渠道"),

    // 客源转化的渠道
    CST_ZIROOM("ziroom", "自如网"),
    CST_CLOUD_SALE("cloudSale", "总部云销"),
    CST_ELECTRIC_SALE("electricSale", "城市电销"),
    CST_SELF_EXTENSION("selfExtension", "管家自拓"),


    // 新签转化下的渠道
    NEW_SIGN_ZIROOM("288", "自如网"),
    NEW_SIGN_INDEPENDENT_DEVELOPMENT("290", "自主开发"),
    NEW_SIGN_WHOOSH_PUSH_HOUSE("323", "嗖嗖推房"),
    NEW_SIGN_CLOUD_DEVELOPMENT("293", "云销开发"),
    NEW_SIGN_OWNER_RECOMMENDED("320", "业主推荐"),
    NEW_SIGN_OPERATIONAL_RECOMMENDED("291", "运营推荐"),
    NEW_SING_400("289", "400电话"),
    NEW_SIGN_ELSE("294", "其他渠道"),
    NEW_SIGN_BUSINESS_EXPAND("292", "商务拓展"),
    NEW_SIGN_PRECISION_MARKETING("295", "精准营销"),
    NEW_SIGN_LOOS_PUSH_ROOM("323", "嗖嗖推房"),
    NEW_SIGN_COMMUNITY_COOPERATION("770", "社区合作"),
    NEW_SIGN_YOUR_APP("796", "自家app"),
    NEW_SIGN_PUSH_ROOM_ACTIVITIES("801", "推房活动"),
    NEW_SIGN_SHELL("832", "贝壳"),
    NEW_SIGN_OFFLINE_SAMPLE_ROOM("843", "线下样板间活动");


    private String code;

    private String text;

    ChannelEnums(String code, String text) {
        this.code = code;
        this.text = text;
    }

    /**
     * 客源转化渠道集合
     */
    public static final List<ChannelEnums> CST_COVER_CHANNEL = new ArrayList<>();
    /**
        * 客源转化渠道集合
     */
    public static final List<ChannelEnums> CST_COVER_TABLE_CHANNEL = new ArrayList<>();

    /**
     * 新签转化渠道集合
     */
    public static final List<ChannelEnums> SIGN_COVER_CHANNEL = new ArrayList<>();


    public static final List<ChannelEnums> SIGN_COVER_TABLE_CHANNEL = new ArrayList<>();

    /**
     * 收房全部渠道
     */
    public static final List<ChannelEnums> SIGN_COVER_ALL_CHANNEL = new ArrayList<>();


    public static final Map<String, ChannelEnums> loopUp = new HashMap<>();


    static {
        // 出房客源转化查询条件
        CST_COVER_CHANNEL.addAll(Arrays.asList(ALL,CST_ZIROOM, CST_CLOUD_SALE, CST_ELECTRIC_SALE, CST_SELF_EXTENSION));
        // 出房端渠道全量枚举
        CST_COVER_TABLE_CHANNEL.addAll(Arrays.asList(CST_ZIROOM, CST_CLOUD_SALE, CST_ELECTRIC_SALE, CST_SELF_EXTENSION));
        // 收房新签转化查询条件
        SIGN_COVER_CHANNEL.addAll(Arrays.asList(
                ALL,
                NEW_SIGN_ZIROOM,
                NEW_SIGN_INDEPENDENT_DEVELOPMENT,
                NEW_SIGN_WHOOSH_PUSH_HOUSE,
                NEW_SIGN_CLOUD_DEVELOPMENT,
                NEW_SIGN_OWNER_RECOMMENDED,
                NEW_SIGN_OPERATIONAL_RECOMMENDED,
                NEW_SING_400,
                NEW_SIGN_ELSE,
                NEW_SIGN_BUSINESS_EXPAND,
                NEW_SIGN_PRECISION_MARKETING,
                NEW_SIGN_LOOS_PUSH_ROOM,
                NEW_SIGN_COMMUNITY_COOPERATION,
                NEW_SIGN_YOUR_APP,
                NEW_SIGN_PUSH_ROOM_ACTIVITIES,
                NEW_SIGN_SHELL,
                NEW_SIGN_OFFLINE_SAMPLE_ROOM));
        // 新签转化表格展示渠道
        SIGN_COVER_TABLE_CHANNEL.addAll(
                Arrays.asList(
                        NEW_SIGN_ZIROOM,
                        NEW_SIGN_INDEPENDENT_DEVELOPMENT,
                        NEW_SIGN_WHOOSH_PUSH_HOUSE,
                        NEW_SIGN_CLOUD_DEVELOPMENT,
                        NEW_SIGN_OWNER_RECOMMENDED,
                        NEW_SIGN_OPERATIONAL_RECOMMENDED)
        );
        // 收房全部渠道
        SIGN_COVER_ALL_CHANNEL.addAll(
                Arrays.asList(
                        NEW_SIGN_ZIROOM,
                        NEW_SIGN_INDEPENDENT_DEVELOPMENT,
                        NEW_SIGN_WHOOSH_PUSH_HOUSE,
                        NEW_SIGN_CLOUD_DEVELOPMENT,
                        NEW_SIGN_OWNER_RECOMMENDED,
                        NEW_SIGN_OPERATIONAL_RECOMMENDED,
                        NEW_SING_400,
                        NEW_SIGN_ELSE,
                        NEW_SIGN_BUSINESS_EXPAND,
                        NEW_SIGN_PRECISION_MARKETING,
                        NEW_SIGN_LOOS_PUSH_ROOM,
                        NEW_SIGN_COMMUNITY_COOPERATION,
                        NEW_SIGN_YOUR_APP,
                        NEW_SIGN_PUSH_ROOM_ACTIVITIES,
                        NEW_SIGN_SHELL,
                        NEW_SIGN_OFFLINE_SAMPLE_ROOM
                )
        );
        for(ChannelEnums enums : EnumSet.allOf(ChannelEnums.class)){
            loopUp.put(enums.getCode(), enums);
        }
    }

    /**
     * 根据周期类型名称获取枚举
     *
     * @param channelCode 渠道编码
     * @return String
     * @author luobs
     * @description
     * @date 2020/6/18 18:23
     */
    public static String getChannelNameByCode(String channelCode) {
        ChannelEnums channelEnums = Arrays.stream(ChannelEnums.values()).filter(c -> Objects.equals(c.getCode(), channelCode)).findAny().orElse(null);
        return channelEnums != null ? channelEnums.getText() : "未知渠道";
    }


    public static List<ChannelEnums> getCstCoverChannel() {
        return CST_COVER_TABLE_CHANNEL;

    }


}
