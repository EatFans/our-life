package com.junoyi.life.controller.admin;

import com.junoyi.framework.web.domain.BaseController;
import com.junoyi.life.service.IHabitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 习惯列表管理控制器
 *
 * @author Fan
 */
@RestController
@RequestMapping("/habit/list")
@RequiredArgsConstructor
public class HabitListController extends BaseController {

    private final IHabitService habitService;
}