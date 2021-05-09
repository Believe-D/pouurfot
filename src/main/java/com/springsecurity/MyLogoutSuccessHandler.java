package com.springsecurity;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.SneakyThrows;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;
import com.utils.resultcode.ResultCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author cxy
 * @date 2020/12/6 13:17
 * @Description 用户登出成功的类
 * @return
 */
@Component
public class MyLogoutSuccessHandler implements LogoutSuccessHandler {
    private ObjectMapper objectMapper = new ObjectMapper();

    @SneakyThrows
    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) {

        ResultCode resultCode = new ResultCode();
        resultCode.setCode(200);
        resultCode.setMsg("登出成功");
        String json = objectMapper.writeValueAsString(resultCode);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
