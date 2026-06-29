package com.junoyi.life.domain.vo;

import lombok.Data;

/**
 * 小程序习惯列表获取的item VO
 *
 * @author Fan
 */
@Data
public class HabitItemVO {

    /**
     * 主键ID
     */
    private Long id;

    /**
     * 习惯标题
     */
    private String title;

    /**
     * 描述
     */
    private String description;

    /**
     * 是否完成
     */
    private Boolean completed;

    /**
     * 今日目标次数
     */
    private Integer targetCount;

    /**
     * 今日已完成次数（如果以后支持多次打卡）
     */
    private Integer completedCount;
}