package com.springsecurity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.stereotype.Component;
import com.utils.resultcode.ResultCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author
 * @date 2020/12/6 13:17
 * @Description 登录失败的类
 * @return
 */
@Component
public class MyAuthenticationFailHandler implements AuthenticationFailureHandler {
    private ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void onAuthenticationFailure(HttpServletRequest httpServletRequest, HttpServletResponse response, AuthenticationException e) throws IOException {
        ResultCode resultCode = new ResultCode();
        resultCode.setCode(302);
        String json = objectMapper.writeValueAsString(resultCode);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);

    }
}
