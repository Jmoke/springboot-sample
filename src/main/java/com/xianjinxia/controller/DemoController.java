package com.xianjinxia.controller;

import com.xianjinxia.annotion.SystemLog;
import com.xianjinxia.config.AppConfig;
import com.xianjinxia.enums.ResultEnum;
import com.xianjinxia.utils.ResultUtils;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Administrator
 * @create 2017-09-22 下午 3:54
 **/
@Controller
public class DemoController {

    private Logger logger = LoggerFactory.getLogger(getClass());


    @Autowired
    private AppConfig appConfig;

    @GetMapping("/")
    @ApiOperation(value = "swagger-doc",httpMethod = "GET")
    @SystemLog(value = "swagger文档",key = "/",dict="文档描述")
    public String doc() {
        logger.info("appConfig:"+appConfig.toString());
        return "redirect:/swagger-ui.html";
    }


    /**
     * @author Kevin.Tse
     * @version V1.0
     * @描述 登录
     * @create 2017/12/18  15:28
     **/
    @ResponseBody
    @ApiOperation(value = "/login")
    @PostMapping("/login")
    public String login(@RequestParam String username,@RequestParam String password){
        logger.info("username:"+password);
        return ResultUtils.returnJsonMsg(ResultEnum.SUCCESS);
    }

    /**
     * @author Kevin.Tse
     * @version V1.0
     * @描述 这里是描述……
     * @create 2017/12/18  17:07
     **/
    @GetMapping(value = "/test")
    @ResponseBody
    public String testLogLevel() {
        logger.debug("Logger Level ：DEBUG");
        logger.info("Logger Level ：INFO");
        logger.error("Logger Level ：ERROR");
        return "";
    }

}
