package com.btjf.base.filter;

import com.netflix.zuul.ZuulFilter;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;
import org.springframework.cloud.sleuth.Tracer;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * @Version:
 * @Design:
 * @Author: pudding
 * @Date: 2017/10/11.
 */
@Component
public class LoggerFilter extends ZuulFilter {

    @Resource
    Tracer tracer;

    @Override
    public String filterType() {
        return FilterConstants.POST_TYPE;
    }

    @Override
    public int filterOrder() {
        return 900;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() {
        tracer.addTag("operator","forezp");
        System.out.print(tracer.getCurrentSpan().traceIdString());
        return null;
    }
}
