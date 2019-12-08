package com.wpg.mapper;





import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpg.entity.CollectDevice;
import com.wpg.entity.CollectDeviceCollectorOV;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 * 一拖多映射表 Mapper 接口
 * </p>
 *
 * @author dsl
 * @since 2019-12-05
 */
@Repository
public interface CollectDeviceMapper extends BaseMapper<CollectDevice> {
    /**
     * @param page 翻页对象，可以作为xml参数直接使用，传递参数page 即自动分页
     *
     * */
    @Select("select  collector_id ,collector_name,collector_type,dc.status,is_online,GROUP_CONCAT(dcd.device_id) device_id,project_name from ds_collector dc join ds_collect_device dcd on dc.device_id=dcd.before_id group by collector_id")
    List<CollectDeviceCollectorOV> getCollectDeviceCollector(Page<CollectDeviceCollectorOV> page);

    @Select("select  collector_id ,collector_name,collector_type,dc.status,is_online,GROUP_CONCAT(dcd.device_id) device_id,project_name from ds_collector dc join ds_collect_device dcd on dc.device_id=dcd.before_id group by collector_id")
    List<CollectDeviceCollectorOV> getCollectDeviceCollector();

}
