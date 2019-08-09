package com.wiselong.thirdparty.takeout.subway.bean;

import java.util.List;

/**
 *  @author duanzw
 */
public class SubwayShopInfo {

    /**
     *  层级：0
     *  流水号
     *  必填：是
     *  UUID
    */
    private String serialNo;

    /**
     *  层级：0
     *  商户编码
     *  必填：是
     *  UUID
    */
    private String companyCode;

    /**
     *  层级：0
     *  品牌编码
     *  必填：是
     *  UUID
    */
    private String brandCode;

    /**
     *  层级：0
     *  系统编码
     *  必填：是
     *  
    */
    private String systemId;

    /**
     *  层级：0
     *  签名
     *  必填：是
     *  
    */
    private String sign;

    /**
     *  层级：0
     *  数据内容
     *  必填：是
     *  
    */
    private JsonObject content;

    /**
     *  层级：1
     *  时间戳
     *  必填：是
     *  秒级时间戳
    */
    private String timestamp;

    /**
     *  层级：1
     *  起送费
     *  必填：是
     *  
    */
    private string minAmount;

    /**
     *  层级：1
     *  配送时长
     *  必填：是
     *  
    */
    private String deliveryInterval;

    /**
     *  层级：1
     *  三方POS门店编号
     *  必填：否
     *  
    */
    private String thirdPosShopNo;

    /**
     *  层级：1
     *  门店名称
     *  必填：是
     *  
    */
    private String shopName;

    /**
     *  层级：1
     *  门店编码
     *  必填：是
     *  
    */
    private String shopCode;

    /**
     *  层级：1
     *  市
     *  必填：否
     *  
    */
    private String city;

    /**
     *  层级：1
     *  区名称
     *  必填：否
     *  
    */
    private String county;

    /**
     *  层级：1
     *  省
     *  必填：否
     *  
    */
    private String province;

    /**
     *  层级：1
     *  配送费
     *  必填：是
     *  
    */
    private String deliveryAmount;

    /**
     *  层级：1
     *  满多少免配送费
     *  必填：否
     *  
    */
    private String fullAmount;

    /**
     *  层级：1
     *  坐标类型
     *  必填：是
     *  5-百度坐标 只支持百度坐标
    */
    private String coordType;

    /**
     *  层级：1
     *  门店电话
     *  必填：否
     *  
    */
    private String shopPhone;

    /**
     *  层级：1
     *  地址
     *  必填：是
     *  
    */
    private String address;

    /**
     *  层级：1
     *  经度
     *  必填：是
     *  
    */
    private String lon;

    /**
     *  层级：1
     *  纬度
     *  必填：是
     *  
    */
    private String lat;

    /**
     *  层级：1
     *  配送区域
     *  必填：是
     *  
    */
    private JsonArray deliveryRegions;

    /**
     *  层级：2
     *  起送费
     *  必填：是
     *  
    */
    private String minAmount;

    /**
     *  层级：2
     *  区域描述
     *  必填：是
     *  
    */
    private String regionComment;

    /**
     *  层级：2
     *  配送模式
     *  必填：是
     *  4 -第三方配送
    */
    private String deliveryMode;

    /**
     *  层级：2
     *  配送时长
     *  必填：是
     *  单位分钟
    */
    private String deliveryInterval;

    /**
     *  层级：2
     *  配送费
     *  必填：是
     *  
    */
    private String deliveryAmount;

    /**
     *  层级：2
     *  配送范围坐标数组
     *  必填：是
     *  
    */
    private JSONArray coordinates;

    /**
     *  层级：3
     *  经度
     *  必填：是
     *  
    */
    private String lon;

    /**
     *  层级：3
     *  纬度
     *  必填：是
     *  
    */
    private String lat;

}