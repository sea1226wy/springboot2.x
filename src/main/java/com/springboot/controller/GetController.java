package com.springboot.controller;

import com.springboot.domain.ServerSettings;
import com.springboot.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * @auther Seay
 * @date 2019/4/8 16:33
 */
@RestController
@PropertySource({"classpath:application.properties"})
public class GetController {
    private Map<String,Object> params = new HashMap<>();
    @Value("${web.imgage-path}")
    private String webImagePath;
   /**
    * @Author: Seay
    * @Description:restful风格路由
    * @Date: 2019/4/9 10:08
    */
   @RequestMapping(path="/test/{city_id}/{user_id}",method = RequestMethod.GET)
    public Map<String,Object> findUser(@PathVariable("city_id") String cityId, @PathVariable("user_id") String userId){
       System.out.println(webImagePath);
       params.clear();
       params.put("cityId",cityId);
       params.put("userd",userId);

       return params;
   }
    /**
     * @Author: Seay
     * @Description:测试GetMapping,springboot封住的路由注解，只支持get请求
     * @Date: 2019/4/9 10:16
     */
    @GetMapping(value = "/v1/page_user1")
    public Object pageUser(int form,int size){
       params.clear();
       params.put("form",form);
       params.put("size",size);
       return params;
   }
   /**
    * @Author: Seay
    * @Description:@RequestParam 传入参数的默认值
    * @Date: 2019/4/9 13:43
    */
   @GetMapping(value = "/v1/page_user2")
   public Object pageUser2(@RequestParam(defaultValue = "10",name = "page")int form,int size){
       params.clear();
       params.put("form",form);
       params.put("size",size);
       return params;
   }
   /**
    * @Author: Seay
    * @Description:bean对象传参
    * 注意点：1.注意需要指定http头为content-type为application/json
    *         2.使用body传输数据
    * @Date: 2019/4/9 13:47
    */
   @RequestMapping("/v1/save_user")
   public Object saveUser(@RequestBody User user){
       params.clear();
       params.put("user",user);
       return params;
   }
    /**
     * @Author: Seay
     * @Description:@RequestHeader获取头信息
     * @Date: 2019/4/9 14:08
     */
   @GetMapping("/v1/get_header")
   public Object getHeader(@RequestHeader("access_token") String accessToken,String id){
       params.clear();
       params.put("access_token",accessToken);
       params.put("id",id);
       return params;
   }

   /**
    * @Author: Seay
    * @Description：servlet基础
    * @Date: 2019/4/9 14:08
    */
   @GetMapping("/v1/test_request")
    public Object testRequest(HttpServletRequest request){
       params.clear();
       String id =request.getParameter("id");
       params.put("id",id);
       return params;
   }
   /**
    * @Author: Seay
    * @Description：servlet基础
    * @Date: 2019/4/9 14:08
    */
   @Autowired
   private ServerSettings serverSettings;
   @GetMapping("/v1/test_properties")
    public Object testProperties(){
       return serverSettings;
   }
}