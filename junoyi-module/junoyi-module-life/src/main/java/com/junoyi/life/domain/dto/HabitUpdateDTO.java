package com.junoyi.life.domain.dto;

import lombok.Data;

import java.util.Date;

/**
 * 习惯更新dto数据对象
 * @author qinglai
 */
@Data
public class HabitUpdateDTO {
    /**
     * 习惯id
     */
    private String id;

    /**
     * 更新习惯标题
     */
    private String title;
    /**
     * 更新习惯详情
     */
    private String description;

    /**
     * 更新习惯周期类型
     */
    private String type;

    /**
     * 更新周期次数
     */
    private Integer targetCount;

    /**
     * 更新记录状态(0未打卡，1以打卡)
     */
    private Integer status;

    /**
     * 更新开始时间
     */
    private Date startTime;

    /**
     * 更新结束时间
     */
    private Date endTime;


}
