//package com.wpg.service.impl;
//
//
//
//import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
//import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
//import com.wpg.entity.CollectDevice;
//import com.wpg.mapper.CollectDeviceMapper;
//import com.wpg.service.CollectDeviceService;
//import com.wpg.entity.CollectDeviceCollectorOV;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
///**
// * <p>
// * 一拖多映射表 服务实现类
// * </p>
// *
// * @author dsl
// * @since 2019-12-05
// */
//@Service
//public class CollectDeviceServiceImpl extends ServiceImpl<CollectDeviceMapper, CollectDevice> implements CollectDeviceService {
//
//
//
//    @Override
//    public List<CollectDeviceCollectorOV> getCollectDeviceCollector(Page<CollectDeviceCollectorOV> page) {
//        return this.baseMapper.getCollectDeviceCollector(page);
//    }
//}
