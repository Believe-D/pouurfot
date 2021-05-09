package com.springsecurity;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;
import com.utils.resultcode.ResultCode;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author cxy
 * @date 2020/12/6 13:17
 * @Description 检测用户身份是否合法
 * @return
 */
@Component
public class EntryPoint implements AuthenticationEntryPoint {
    private final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
                         AuthenticationException authException) throws IOException {


        ResultCode resultCode = new ResultCode();
        resultCode.setCode(405);
        resultCode.setMsg("访问权限不足");
        String json = objectMapper.writeValueAsString(resultCode);
        response.setContentType("text/json;charset=utf-8");
        response.getWriter().write(json);
    }
}
