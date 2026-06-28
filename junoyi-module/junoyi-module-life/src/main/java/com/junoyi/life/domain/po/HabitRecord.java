package com.junoyi.life.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.util.Date;

/**
 * 习惯打卡记录 PO 数据对象
 *
 * @author Fan
 */
@TableName("habit_record")
public class HabitRecord {

    /**
     * 主键ID
     */
    @TableId
    private Long id;

    /**
     * 习惯ID
     */
    private Long habitId;

    /**
     * 用户ID
     */
    private Long userId;

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
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

}