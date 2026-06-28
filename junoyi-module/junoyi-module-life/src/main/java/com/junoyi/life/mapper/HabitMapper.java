package com.junoyi.life.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junoyi.life.domain.po.Habit;
import org.apache.ibatis.annotations.Mapper;

/**
 * 习惯 Mapper
 *
 * @author Fan
 */
@Mapper
public interface HabitMapper extends BaseMapper<Habit> {
}
