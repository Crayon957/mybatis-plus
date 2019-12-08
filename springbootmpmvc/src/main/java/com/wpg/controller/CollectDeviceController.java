package com.wpg.controller;




import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.wpg.entity.Collector;
import com.wpg.mapper.CollectDeviceCollectorOVMapper;
import com.wpg.mapper.CollectDeviceMapper;
import com.wpg.mapper.CollectorMapper;
import com.wpg.service.CollectDeviceService;
import com.wpg.entity.CollectDeviceCollectorOV;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 一拖多映射表 前端控制器
 * </p>
 *
 * @author dsl
 * @since 2019-12-05
 */

@RestController
@Api(value="用户controller",tags={"CRUD接口"})
public class CollectDeviceController {
    @Autowired
    CollectDeviceService collectDeviceService;
    @Resource
    CollectDeviceCollectorOVMapper ov;
    @Resource
    CollectorMapper cm;
    @Resource
    CollectDeviceMapper cdm;

    @ApiOperation("单表所有查询")
    @PostMapping("/allco")
    public List<Collector> getAllCollector(){
        List<Collector> collectors = cm.selectList(new QueryWrapper<>());
        return collectors;
    }

    @ApiOperation("单表所有查询(自写sql)")
    @PostMapping("/allcol")
    public List<Collector> getAllCollector1(){
        List<Collector> collectors = cm.selectAll();
        return collectors;
    }

    @ApiOperation("删除")
    @PostMapping("/del")
    public int deleteCollector(@ApiParam(value="输入id") String id){
        int i = cm.deleteById(id);
        return i;
    }

    @ApiOperation("增加一条数据")
    @GetMapping(value="/save",params={"deviceName","collectorId","collectorType"})
    public int saveCollector(@ApiParam(value="输入id") Collector collector){
        int in = cm.insert(collector);
        return in;
    }

    @ApiOperation("单表查询分页(内存分页)")
    @PostMapping("/allco/{page}/{size}")
    public Page<Collector> getAllCollectorPage(@ApiParam(value="查看页数",example = "1")@PathVariable Integer page,@ApiParam(value="页容量",example = "1") @PathVariable Integer size){
        Page<Collector> collectorPage = cm.selectPage(new Page<>(page, size), new QueryWrapper<>());
        return collectorPage;
    }

    @ApiOperation("多表查询(一对多)")
    @PostMapping("/mto1")
    public List<CollectDeviceCollectorOV> getOV(){
        List<CollectDeviceCollectorOV> collectDeviceCollectorOVS = ov.getCollectDeviceCollector();
        //List<CollectDeviceCollectorOV> collectDeviceCollectorOVS = cdm.getCollectDeviceCollector(); 都能查询到结果
        return collectDeviceCollectorOVS;
    }


    @ApiOperation("联合分页查询")
    @PostMapping("/all/{page}/{size}")
    public List<CollectDeviceCollectorOV> getgetAllcollectDevicePage(@ApiParam(value="查看页数",example = "1")@PathVariable Integer page,@ApiParam(value="页容量",example = "1") @PathVariable Integer size) {
        List<CollectDeviceCollectorOV> collectDeviceCollector = collectDeviceService.getCollectDeviceCollector(new Page<>(page, size));
        return collectDeviceCollector;
    }






}

