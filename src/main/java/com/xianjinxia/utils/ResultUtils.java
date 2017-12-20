package com.xianjinxia.utils;


import com.alibaba.fastjson.JSON;
import com.xianjinxia.enums.ResultEnum;

import java.util.TreeMap;

/**
 * @描述
 *      TODO
 * @author  Kevin.Tse
 * @create  2017/12/18  11:27
 * @version  V1.0
 **/
public class ResultUtils {

    /**
     * 处理返回DATA
     *
     * @param data
     * @return JSONObject
     */
    public static String returnJsonData(ResultEnum resultEnum, Object data) {
        TreeMap jsonObject = new TreeMap();
        jsonObject.put("code", resultEnum.getCode());
        jsonObject.put("msg", resultEnum.getMsg());
        jsonObject.put("data", data);
        return JSON.toJSONString(jsonObject);
    }

    /**
     * 处理返回
     *
     * @param resultEnum
     * @return JSONObject
     */
    public static String returnJsonMsg(ResultEnum resultEnum) {
        TreeMap jsonObject = new TreeMap();
        jsonObject.put("code", resultEnum.getCode());
        jsonObject.put("msg", resultEnum.getMsg());
        return JSON.toJSONString(jsonObject);
    }


    /**
     * 处理返回
     *
     * @param code
     * @param msg
     * @return JSONObject
     */
    public static String returnJsonMsg(String code, String msg) {
        TreeMap jsonObject = new TreeMap();
        jsonObject.put("code", code);
        jsonObject.put("msg", msg);
        return JSON.toJSONString(jsonObject);
    }

}
