package com.cc.controller;


import com.cc.dao.AuthorityMapper;
import com.cc.pojo.Authority;
import com.cc.pojo.PostData;
import com.cc.service.AuthorityService;
import com.cc.utiltiy.Function;
import com.google.gson.Gson;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by cc on 2017/2/16.
 */


@Controller
public class ShipController {
    @Resource
    private AuthorityMapper authorityMapper;
    @Resource
    private AuthorityService authorityService;

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/ship90", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody()
    public void test(@Validated @RequestBody PostData postData , BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        PrintWriter pw = response.getWriter();

        if (result.hasErrors()){
            Map<String,String> map = new HashMap<String, String>();
            map.put("message","字段不能为空");
            Gson gson = new Gson();
            pw.print(gson.toJson(map));
        }else {
            pw.print(authorityService.responseMessage(postData));
        }

        pw.close();
    }

    @CrossOrigin(origins = "*")
    @RequestMapping(value = "/ship20", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    @ResponseBody()
    public void test2(@Validated @RequestBody PostData postData , BindingResult result, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("application/json;charset=utf-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");

        PrintWriter pw = response.getWriter();
        if (result.hasErrors()){
            Map<String,String> map = new HashMap<String, String>();
            map.put("message","字段不能为空");
            Gson gson = new Gson();
            pw.print(gson.toJson(map));
        }else {
            pw.print(authorityService.responseMessage2(postData));
        }

        pw.close();
    }

}
