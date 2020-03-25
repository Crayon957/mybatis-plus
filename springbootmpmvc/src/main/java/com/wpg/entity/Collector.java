package com.wpg.entity;

import java.time.LocalDateTime;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;


import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.wpg.enums.IsonileEnum;
import com.wpg.enums.StatusEnum;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 采集器列表
 * </p>
 *
 * @author dsl
 * @since 2019-12-05
 */
//@Data
//@EqualsAndHashCode(callSuper = false)
//@Accessors(chain = true)
//@TableName("ds_collector")
//@ApiModel("apiModelTest")
public class Collector implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * 设备编号(一拖多需要到映射表获取01、02结尾的设备编号)
     */
    private String deviceId;

    /**
     * 设备名称
     */
    private String deviceName;

    /**
     * 采集器编号
     */
    @ApiModelProperty(value = "采集器id")
    @TableId(value = "collector_id",type=IdType.AUTO)
    private String collectorId;

    /**
     * 采集器类型(ipc、gateway、dtu)
     */
    @ApiModelProperty(value = "采集器类型")
    private String collectorType;

    /**
     * 采集器名称
     */
    @ApiModelProperty(value = "采集器名称")
    private String collectorName;

    /**
     * 项目名称
     */
    @ApiModelProperty(value = "项目名称")
    private String projectName;

    /**
     * 地区id
     */
    private String idRegion;

    /**
     * SIM卡运营商 1:中国移动 2:中国联通 3:中国电信
     */
    private String simType;

    /**
     * SIM卡号
     */
    private String simNum;

    /**
     * 是否一拖多 0:一拖一 1:一拖多
     */
    private String moreFlag;

    /**
     * 状态 0:未配置 1:预配置 2:预配置失败 3:已配置
     */
    @ApiModelProperty(value = "设备状态")
    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString )
    private StatusEnum status;

    /**
     * 是否在线 0:不在线 1:在线
     */
    @ApiModelProperty(value = "在/离线状态")
    @JSONField(serialzeFeatures = SerializerFeature.WriteEnumUsingToString)
    private IsonileEnum isOnline;

    /**
     * 是否存在报警 0:不报警 1:报警
     */
    private String isAlarm;

    /**
     * 是否是克隆出来的 0:非克隆 1:克隆
     */
    private String isClone;

    /**
     * 是否启动 0:不启动 1:启动
     */
    private String isStart;

    /**
     * 创建日期
     */
    private LocalDateTime createTime;

    /**
     * 修改日期
     */
    private LocalDateTime updateTime;

    /**
     * 删除标记 0未删除 1已删除
     */
    private String delFlag;


}
