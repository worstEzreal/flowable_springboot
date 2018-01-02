package com.zengxzh.flowable.controller;

import com.zengxzh.flowable.common.Result;
import com.zengxzh.flowable.service.FlowService;
import com.zengxzh.flowable.vo.TaskVO;
import org.flowable.engine.RepositoryService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2017/12/29
 */
@RestController
@RequestMapping("flow")
public class FlowableController {


    @Autowired
    private FlowService flowService;

    @RequestMapping("count")
    public Result count() {
        return new Result("10000", "sucuess", flowService.count());
    }

    @RequestMapping("countRunning")
    public Result countRunning() {
        return new Result("10000", "sucuess", flowService.countRunning());
    }

    @RequestMapping("startProcess")
    public Result startProcess(@RequestParam String key, @RequestParam String data) {
        flowService.startProcess(key, data);
        return new Result("10000", "sucuess", null);
    }

    @RequestMapping("taskList")
    public Result taskList(@RequestParam String assignee) {
        List<Task> tasks = flowService.getTasks(assignee);
        List<TaskVO> list = new ArrayList<>();
        for (Task t : tasks) {
            list.add(new TaskVO(t.getId(), t.getName()));
        }
        return new Result("10000", "sucuess", list);
    }

}
