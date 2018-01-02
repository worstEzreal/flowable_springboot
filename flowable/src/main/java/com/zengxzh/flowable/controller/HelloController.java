package com.zengxzh.flowable.controller;

import com.zengxzh.flowable.common.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/12/29
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public Result Hello(){
        return new Result("","","hello");
    }
}
