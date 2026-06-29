package com.junoyi.life.service.impl;

import com.junoyi.life.domain.vo.HabitItemVO;
import com.junoyi.life.mapper.HabitMapper;
import com.junoyi.life.service.IHabitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 习惯业务接口实现
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class HabitServiceImpl implements IHabitService {

    private final HabitMapper habitMapper;

    /**
     * 获取用户习惯列表
     * @param userId 用户ID
     * @return 用户习惯列表
     */
    @Override
    public List<HabitItemVO> getUserHabits(Long userId) {
        return habitMapper.selectUserHabits(userId);
    }
}