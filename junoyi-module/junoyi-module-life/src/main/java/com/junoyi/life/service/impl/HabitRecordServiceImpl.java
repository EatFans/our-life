package com.junoyi.life.service.impl;

import com.junoyi.life.mapper.HabitRecordMapper;
import com.junoyi.life.service.IHabitRecordService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * 习惯打卡记录业务接口实现
 *
 * @author Fan
 */
@Service
@RequiredArgsConstructor
public class HabitRecordServiceImpl implements IHabitRecordService {

    private final HabitRecordMapper habitRecordMapper;
}