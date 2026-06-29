package com.junoyi.life.controller.admin;

import com.junoyi.framework.security.annotation.PlatformScope;
import com.junoyi.framework.web.domain.BaseController;
import com.junoyi.life.service.IHabitService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 习惯列表管理控制器
 *
 * @author Fan
 * @author qinglai
 */
@RestController
@RequestMapping("/habit/list")
@RequiredArgsConstructor
public class HabitListController extends BaseController {
    /*，可以通过习惯标题，习惯类型，习惯时间周期进行查询。并有添加、修改、删除操作、习惯删除是软删*/


    private final IHabitService habitService;


}