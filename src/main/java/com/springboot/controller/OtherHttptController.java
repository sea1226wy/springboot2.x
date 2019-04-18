package com.springboot.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @auther Seay
 * @Description:post、del、put请求
 * @date 2019/4/8 16:33
 */
@RestController
public class OtherHttptController {
    private Map<String,Object> params = new HashMap<>();
    /**
     * @Author: Seay
     * @Description:post请求
     * @Date: 2019/4/9 14:17
     */
    @PostMapping("/v1/login")
    public Object login(String id,String pwd){
        params.clear();
        params.put("id",id);
        params.put("pwd",pwd);

        return params;
    }
    /**
     * @Author: Seay
     * @Description:put请求
     * @Date: 2019/4/9 14:17
     */
    @PutMapping("/v1/put")
    public Object put(String id){
        params.clear();
        params.put("id",id);
        return params;
    }
    /**
     * @Author: Seay
     * @Description:del请求
     * @Date: 2019/4/9 14:17
     */
    @DeleteMapping("/v1/del")
    public Object del(String id){
        params.clear();
        params.put("id",id);
        return params;
    }

}