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

    private Long habitId;

    private Long userId;

    private Date recordDate;

    private Integer count;

    private Integer status;

    private Long creatorId;
}