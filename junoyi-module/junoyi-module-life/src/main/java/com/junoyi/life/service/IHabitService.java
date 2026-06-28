package com.junoyi.life.service;

import com.junoyi.life.domain.vo.HabitItemVO;

import java.util.List;

/**
 * 习惯业务接口
 *
 * @author Fan
 */
public interface IHabitService {

    /**
     * 获取用户习惯列表
     * @param userId 用户ID
     * @return 用户习惯列表
     */
    List<HabitItemVO> getUserHabits(Long userId);
}