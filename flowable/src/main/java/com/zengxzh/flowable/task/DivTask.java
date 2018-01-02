package com.zengxzh.flowable.task;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * Desc
 *
 * @author zengxzh@yonyou.com
 * @version V1.0.0
 * @date 2018/1/2
 */
public class DivTask implements JavaDelegate {

    @Override
    public void execute(DelegateExecution delegateExecution) {
        Integer data = (Integer) delegateExecution.getVariable("data");
        data /= 2;
        delegateExecution.setVariable("data", data);
    }
}
