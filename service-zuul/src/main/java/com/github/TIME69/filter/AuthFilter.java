package com.github.TIME69.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

/**
 * 描述：过滤器
 *
 * @author <a href="1348555156@qq.com">LeiLi.Zhang</a>
 * @version 0.0.0
 * @date 2018/8/14
 */
@Component
public class AuthFilter extends ZuulFilter {
    private static Logger log = LoggerFactory.getLogger(AuthFilter.class);

    @Override
    public boolean shouldFilter() {
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        log.info(String.format("%s >>> %s", request.getMethod(), request.getRequestURL().toString()));
        Object accessToken = request.getParameter("token");
        if(accessToken == null) {
            log.warn("token is empty");
            ctx.setSendZuulResponse(false);
            ctx.setResponseStatusCode(401);
            try {
                ctx.getResponse().getWriter().write("token is empty");
            }catch (Exception e){}

            return null;
        }
        log.info("ok");
        return null;
    }

    /**
     * <pre>
     * pre：路由之前
     routing：路由之时
     post： 路由之后
     error：发送错误调用
     filterOrder：过滤的顺序
     shouldFilter：这里可以写逻辑判断，是否要过滤，本文true,永远过滤。
     run：过滤器的具体逻辑。可用很复杂，包括查sql，nosql去判断该请求到底有没有权限访问。
     </pre>
     * @return
     */
    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }
}
