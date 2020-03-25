//package com.wpg.mapper;
//
//
//import com.baomidou.mybatisplus.core.mapper.BaseMapper;
//import com.wpg.entity.Collector;
//import org.apache.ibatis.annotations.Select;
//
//import java.util.List;
//
//
///**
// * <p>
// * 采集器列表 Mapper 接口
// * </p>
// *
// * @author dsl
// * @since 2019-12-05
// */
//public interface CollectorMapper extends BaseMapper<Collector> {
//
//    @Select("select * from ds_collector")
//    List<Collector> selectAll();
//
//    @Select("select * from ds_collector dc left outer join ds_collect_device dcd on dc.device_id=dcd.before_id")
//    List<Collector> getAllT();
//}
