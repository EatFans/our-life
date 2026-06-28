package com.junoyi.life.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 习惯执行者 PO
 *
 * @author Fan
 */
@Data
@TableName("habit_user")
public class HabitUser {

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
}