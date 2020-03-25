//package com.wpg.mapper;
//
//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.wpg.entity.CollectDeviceCollectorOV;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//public interface CollectDeviceCollectorOVMapper extends BaseMapper<CollectDeviceCollectorOV> {
//    @Select("select  collector_id ,collector_name,collector_type,dc.status,is_online,GROUP_CONCAT(dcd.device_id) device_id,project_name from ds_collector dc join ds_collect_device dcd on dc.device_id=dcd.before_id group by collector_id")
//    List<CollectDeviceCollectorOV> getCollectDeviceCollector();
//}
