package com.junoyi.life.controller.mp;

import com.junoyi.framework.core.domain.module.R;
import com.junoyi.framework.security.annotation.PlatformScope;
import com.junoyi.framework.security.enums.PlatformType;
import com.junoyi.framework.web.domain.BaseController;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 小程序习惯控制器
 *
 * @author Fan
 */
@RestController
@RequestMapping("/mp/habit")
@RequiredArgsConstructor
public class HabitMpController extends BaseController {

    /**
     * 获取用户习惯列表
     */
    @GetMapping("/list")
    @PlatformScope(PlatformType.MINI_PROGRAM)
    public R<?> getHabitList(){

        Long currentUserId = getUserId();
        if (currentUserId == null || currentUserId == 0)
            return R.fail("非法请求");


        return R.ok();
    }
}