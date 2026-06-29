package com.junoyi.life.domain.vo.web;

import lombok.Data;

import java.util.Date;

/**
 * 习惯VO数据对象
 * @author qinglai
 */
@Data
public class HabitListVO {
    /**
     * 习惯主键id
     */
    private Integer id;
    /**
     * 习惯标题
     */
    private String title;
    /**
     * 习惯周期类型
     */
    private String type;
    /**
     * 周期次数
     */
    private Integer targetCount;
    /**
     * 记录次数
     */
    private Integer count;
    /**
     * 记录状态
     */
    private Integer status;
    /**
     * 开始日期
     */
    private Date startTime;


}
