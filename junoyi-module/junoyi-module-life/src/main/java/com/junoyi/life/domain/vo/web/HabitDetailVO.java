package com.junoyi.life.domain.vo.web;

import lombok.Data;

import java.util.Date;
/**
 * 习惯详VO情数据对象
 * @author qinglai
 */
@Data
public class HabitDetailVO {

    /**
     * 主键id
     */
    private Integer id;

    /**
     * 习惯标题
     */
    private String title;

    /**
     * 习惯描述
     */
    private String description;

    /**
     * 习惯类型
     */
    private String type;

    /**
     * 习惯周期次数
     */
    private String targetCount;

    /**
     * 开始时间
     */
    private String startTime;

    /**
     * 结束时间
     */
    private String endTime;

    /**
     * 记录日期（xxxx-xx-xx)
     */
    private Date recordDate;

    /**
     * 记录次数
     */
    private Integer count;

    /**
     * 记录状态
     */
    private Integer status;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 习惯ID
     */
    private Long habitId;

    /**
     * 用户ID
     */
    private Long userId;
}
