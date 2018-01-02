package com.zengxzh.flowable.listener;

import com.alibaba.fastjson.JSON;
import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.ExecutionListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2018/1/2
 */
public class ServiceTaskAdvice implements ExecutionListener {

    private Logger logger = LoggerFactory.getLogger(ServiceTaskAdvice.class);

    @Override
    public void notify(DelegateExecution delegateExecution) {
        logger.info("task={} | data={}", JSON.toJSONString(delegateExecution.getProcessDefinitionId()),
                delegateExecution.getVariable("data").toString());
    }
}
