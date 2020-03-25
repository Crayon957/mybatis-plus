package com.wpg.enums;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum IsonileEnum {
    /**
     * 是否在线 0:不在线 1:在线
     */
    不在线("0","不线"),在线("1","线");

    IsonileEnum(String s,String t){
        this.s=s;
        this.t=t;
    }
    @EnumValue
    private  final String s;
    private  final String t;
}
