package com.junoyi.life.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junoyi.life.domain.po.HabitUser;
import org.apache.ibatis.annotations.Mapper;

/**
 * 习惯用户 Mapper
 *
 * @author Fan
 */
@Mapper
public interface HabitUserMapper extends BaseMapper<HabitUser> {
}
