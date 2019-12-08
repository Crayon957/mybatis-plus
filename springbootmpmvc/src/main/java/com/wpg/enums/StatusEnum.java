package com.wpg.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum StatusEnum {
    /**
     * 状态 0:未配置 1:预配置 2:预配置失败 3:已配置
     */
    未配置("0","未配置"),预配置("1","预配置"), 预配置失败("2","预配置失败"), 已配置("3","已配置");

    StatusEnum(String s,String t){
        this.s=s;
        this.t=t;
    }
    @EnumValue //标志数据库中的值
    private  final String s;
    private final String t;

}
