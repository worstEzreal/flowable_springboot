package com.zengxzh.flowable.service;

import org.flowable.engine.RepositoryService;
import org.flowable.engine.RuntimeService;
import org.flowable.engine.TaskService;
import org.flowable.task.api.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2018/1/2
 */
@Service
public class FlowService {

    @Autowired
    private RuntimeService runtimeService;

    @Autowired
    private TaskService taskService;

    @Autowired
    private RepositoryService repositoryService;

    public long count() {
        return repositoryService.createProcessDefinitionQuery().count();
    }

    public long countRunning() {
        return taskService.createTaskQuery().count();
    }

    @Transactional
    public void startProcess(String key, String data) {
        Map var = new HashMap<String, Object>();
        var.put("data", Integer.valueOf(data));
        runtimeService.startProcessInstanceByKey(key, var);
    }

    @Transactional
    public List<Task> getTasks(String assignee) {
        return taskService.createTaskQuery().taskAssignee(assignee).list();
    }
}
