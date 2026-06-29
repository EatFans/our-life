package com.junoyi.life.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.junoyi.life.domain.po.Habit;
import com.junoyi.life.domain.vo.HabitItemVO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 习惯 Mapper
 *
 * @author Fan
 */
@Mapper
public interface HabitMapper extends BaseMapper<Habit> {

    /**
     * 查询用户习惯列表
     * @param userId 用户ID
     * @return 用户习惯列表
     */
    List<HabitItemVO> selectUserHabits(Long userId);
}
