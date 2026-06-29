package com.junoyi.life.domain.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

import java.util.Date;

/**
 * 创建习惯dto数据对象
 * @author qinglai
 */
@Data
public class HabitAddDTO {
    /**
     * 习惯标题
     */
    @NotBlank(message = "习惯标题不能为空")
    private String title;

    /**
     * 习惯详情
     */
    private String description;

    /**
     * 习惯周期类型
     */
    private String type;

    /**
     * 周期次数
     */
    private Integer targetCount;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 结束时间
     */
    private Date endTime;

    /**
     * 用户ID
     */
    @NotBlank(message = "执行人不能为空")
    private Long userId;


}
