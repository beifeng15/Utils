package com.wu.utils;

import cn.hutool.http.HttpStatus;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.io.IOException;

/**
 * @Description TODO
 * @Author Mr.Wu
 * @Date 2021/3/29 11:25
 * @Version 1.0
 **/


public class ResponseUtil {

    public static void out(HttpServletResponse response, RestResult r) {
        ObjectMapper mapper = new ObjectMapper();
        response.setStatus(HttpStatus.HTTP_OK);
        response.setContentType("application/json;charset=utf-8");
        try {
            mapper.writeValue(response.getWriter(), r);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
