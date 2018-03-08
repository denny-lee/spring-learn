package com.example.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * @author : Liw
 * @description :
 * @date : 2018/3/7 20:02
 */
@Component
public class MyFilter extends ZuulFilter {
    Logger logger = LoggerFactory.getLogger(MyFilter.class);

    public MyFilter() {
        super();
    }

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        logger.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        logger.info("token is : {}", accessToken);
        return null;
    }

    @Override
    public boolean shouldFilter() {
        return true;
    }
}
