package com.junoyi.life.service.impl;

import com.junoyi.life.mapper.HabitMapper;
import com.junoyi.life.service.IHabitService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 习惯业务接口实现
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class HabitServiceImpl implements IHabitService {

    private final HabitMapper habitMapper;
}