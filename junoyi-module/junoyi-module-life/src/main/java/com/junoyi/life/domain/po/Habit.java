package com.junoyi.life.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.junoyi.framework.core.domain.base.BaseEntity;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * 习惯 PO 数据对象
 *
 * @author Fan
 */
@EqualsAndHashCode(callSuper = true)
@TableName("habit")
@Data
public class Habit extends BaseEntity {

    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 习惯标题
     */
    private String title;

    /**
     * 习惯描述
     */
    private String description;

    /**
     * 习惯周期类型（天、周、月、年）
     */
    private Integer type;

    /**
     * 周期次数
     */
    private Integer targetCount;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束日期
     */
    private Date endTime;
}