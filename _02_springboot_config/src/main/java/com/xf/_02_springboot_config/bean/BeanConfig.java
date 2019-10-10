package com.xf._02_springboot_config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author : remaindertime (xiongfeng)
 * @date : 13:59 2019/10/9
 * @description :02
 * 将配置文件的属性赋给实体类
 * 字段对应配置文件里面的随机生成的字段值   ${random}
 */
@ConfigurationProperties(prefix = "my") //配置文件字段的前缀
@Component
public class BeanConfig {

    private String sex;

    private int max;

    private int min;

    private String uuid;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }
}
