package com.junoyi.life.domain.dto;
//过习惯标题，习惯类型，习惯时间周期进行查询

import lombok.Data;

/**
 * 查询习惯dto数据对象
 * @author qinglai
 */
@Data
public class HabitQueryDTO {
    /**
     * 根据习惯标题查询
     */
    private String title;

    /**
     * 根据习惯类型查询
     */
    private String type;

    /**
     * 根据习惯周期次数查询
     */
    private Integer targetCount;




}
