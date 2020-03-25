//package com.wpg.entity;
//
//
//
//import com.alibaba.fastjson.annotation.JSONField;
//import com.alibaba.fastjson.serializer.SerializerFeature;
//import com.baomidou.mybatisplus.annotation.IdType;
//import com.baomidou.mybatisplus.annotation.TableField;
//import com.baomidou.mybatisplus.annotation.TableId;
//import com.wpg.enums.IsonileEnum;
//import com.wpg.enums.StatusEnum;
//import io.swagger.annotations.ApiModelProperty;
//import lombok.Data;
//
//import java.io.Serializable;
//
//@Data
//public class CollectDeviceCollectorOV implements Serializable {
//
//
//
//    /**
//     * 拆分后的设备ID
//     */
//    @ApiModelProperty(value = "关联设备")
//    private String deviceId;
//
//    /**
//     * 采集器编号
//     */
//    @ApiModelProperty(value = "采集器id")
//    @TableId(value = "collector_id", type = IdType.AUTO)
//    private String collectorId;
//
//    /**
//     * 采集器类型(ipc、gateway、dtu)
//     */
//    //@TableField("collector_type")
//    @ApiModelProperty(value = "采集器类型")
//    private String collectorType;
//
//    /**
//     * 采集器名称
//     */
//    @ApiModelProperty(value = "采集器名称")
//    private String collectorName;
//
//    /**
//     * 项目名称
//     */
//    @ApiModelProperty(value = "项目名称")
//    private String projectName;
//
//    /**
//     * 状态 0:未配置 1:预配置 2:预配置失败 3:已配置
//     */
//    @ApiModelProperty(value = "设备状态")
//    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
//    private StatusEnum status;
//
//    /**
//     * 是否在线 0:不在线 1:在线
//     */
//    @ApiModelProperty(value = "在/离线状态")
//    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
//    private IsonileEnum isOnline;
//}
