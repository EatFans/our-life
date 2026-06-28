package com.junoyi.life.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junoyi.life.domain.po.HabitRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * 习惯记录 Mapper
 *
 * @author Fan
 */
@Mapper
public interface HabitRecordMapper extends BaseMapper<HabitRecord> {
}
