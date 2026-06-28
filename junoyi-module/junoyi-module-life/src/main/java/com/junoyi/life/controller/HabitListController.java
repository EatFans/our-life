package com.junoyi.life.controller;

import com.junoyi.framework.web.domain.BaseController;
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
}