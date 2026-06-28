package com.junoyi.life.domain.po;

import com.baomidou.mybatisplus.annotation.TableName;
import com.junoyi.framework.core.domain.base.BaseEntity;
import lombok.Data;

/**
 * 习惯 PO 数据对象
 *
 * @author Fan
 */
@TableName("habit")
@Data
public class Habit extends BaseEntity {

    private Long id;

    private String title;

    private String description;


}