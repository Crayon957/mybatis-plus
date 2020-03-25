//package com.wpg.entity;
//
//
//import com.alibaba.fastjson.annotation.JSONField;
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.baomidou.mybatisplus.annotation.TableName;
//import com.wpg.enums.StatusEnum;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//import lombok.EqualsAndHashCode;
//import lombok.experimental.Accessors;
//
//import java.io.Serializable;
//
//
//
///**
// * <p>
// * 一拖多映射表
// * </p>
// *
// * @author dsl
// * @since 2019-12-05
// */
//
////@EqualsAndHashCode(callSuper = false)
////@Accessors(chain = true)
////@TableName("ds_collect_device")
//@Api("test")
//@Data
//@ApiModel("apiModelTest")
//public class CollectDevice implements Serializable {
//
//    private static final long serialVersionUID=1L;
//
//    /**
//     * 拆分前的设备ID(与ds_collector.device_id关联)
//     */
//    private String beforeId;
//
//    /**
//     * 拆分后的设备ID
//     */
//    @ApiModelProperty(value = "关联设备")
//    @TableId(value = "device_id", type = IdType.AUTO)
//    private String deviceId;
//
//    /**
//     * 设备名称
//     */
//    private String deviceName;
//
//    /**
//     * 是否删除:0未删除 1删除
//     */
//    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
//    private StatusEnum status;
//
//
//}
