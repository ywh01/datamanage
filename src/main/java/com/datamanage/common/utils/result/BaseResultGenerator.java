package com.datamanage.common.utils.result;


import com.alibaba.fastjson.JSONObject;
import com.datamanage.common.enums.BaseResultEnum;
import com.datamanage.common.exception.BusinessException;
import com.datamanage.common.utils.json.JSONUtil;

/**
 * BaseResult生成器
 *
 * @author ys
 * @date 2020/9/11
 */
public class BaseResultGenerator {

    /**
     * 操作成功响应结果， 默认结果
     *
     * @return 操作成功的默认响应结果
     */
    public static String success() {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SUCCESS.getCode());
        obj.put("message",BaseResultEnum.SUCCESS.getMessage());
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 操作成功响应结果，自定义数据，默认信息
     *
     * @param data 自定义数据
     * @param <T>  自定义数据类型
     * @return 响应结果
     */
    public static <T> String successData(final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SUCCESS.getCode());
        obj.put("message",BaseResultEnum.SUCCESS.getMessage());
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 操作成功响应结果，自定义数据，默认信息
     *
     * @param message 自定义数据
     * @return 响应结果
     */
    public static String successMessage(final String message) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SUCCESS.getCode());
        obj.put("message",message);
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 操作成功响应结果， 自定义数据及信息
     *
     * @param message 自定义信息
     * @param data    自定义数据
     * @param <T>     自定义数据类型
     * @return 响应结果
     */
    public static <T> String success(final String message, final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SUCCESS.getCode());
        obj.put("message",message);
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 生成返回结果
     *
     * @param code    返回编码
     * @param message 返回消息
     * @param data    返回数据
     * @param <T>     返回数据类型
     * @return 返回结果
     */
    public static <T> String success(final int code, final String message, T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",code);
        obj.put("message",message);
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 带token的返回结果
     *
     * @param message 返回消息
     * @param data    返回数据
     * @param <T>     返回数据类型
     * @return 返回结果
     */
    public static <T> String success(final String message, final String token, T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",200);
        obj.put("message",message);
        obj.put("token",token);
        obj.put("data", JSONUtil.toJSONObj(data));
        return obj.toString();
    }

    /**
     * 操作失败响应结果， 默认结果
     *
     * @return 操作成功的默认响应结果
     */
    public static <T> String failure() {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.FAIL.getCode());
        obj.put("message",BaseResultEnum.FAIL.getMessage());
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 操作失败响应结果，自定义信息
     *
     * @param message 自定义信息
     * @return 响应结果
     */
    public static <T> String failure(final String message) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.FAIL.getCode());
        obj.put("message",message);
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 操作失败响应结果，自定义信息
     *
     * @param data 自定义信息
     * @return 响应结果
     */
    public static <T> String failure(final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.FAIL.getCode());
        obj.put("message",BaseResultEnum.FAIL.getMessage());
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 操作失败响应结果， 自定义错误编码及信息
     *
     * @param message 自定义信息
     * @param data    自定义信息
     * @return 响应结果
     */
    public static <T> String failure(final String message, final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.FAIL.getCode());
        obj.put("message",message);
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 操作失败响应结果， 自定义错误编码及信息
     *
     * @param code    自定义错误编码
     * @param message 自定义信息
     * @return 响应结果
     */
    public static <T> String failure(final int code, final String message, T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",code);
        obj.put("message",message);
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 异常响应结果， 默认结果
     *
     * @return 操作成功的默认响应结果
     */
    public static <T> String error() {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SERVER_ERROR.getCode());
        obj.put("message",BaseResultEnum.SERVER_ERROR.getMessage());
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 异常响应结果，自定义信息
     *
     * @param data 自定义返回数据
     * @return 响应结果
     */
    public static <T> String error(final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SERVER_ERROR.getCode());
        obj.put("message",BaseResultEnum.SERVER_ERROR.getMessage());
        obj.put("data",data);
        return obj.toString();
    }

    /**
     * 异常响应结果，自定义错误编码
     *
     * @param message 自定义错误信息
     * @return 响应结果
     */
    public static <T> String error(final String message) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SERVER_ERROR.getCode());
        obj.put("message",message);
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 异常响应结果， 自定义错误编码及信息
     *
     * @param message 自定义信息
     * @param data    自定义信息
     * @return 响应结果
     */
    public static <T> String error(final String message, final T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SERVER_ERROR.getCode());
        obj.put("message",BaseResultEnum.SERVER_ERROR.getMessage());
        obj.put("data","");
        return obj.toString();
    }

    /**
     * 业务异常响应结果
     *
     * @param code 返回代码
     * @param message 返回信息
     * @param data 返回数据
     * @return 响应结果
     */
    public static <T> String error(final int code, final String message, T data) {
        JSONObject obj = new JSONObject();
        obj.put("code",BaseResultEnum.SERVER_ERROR.getCode());
        obj.put("message",BaseResultEnum.SERVER_ERROR.getMessage());
        obj.put("data",data);
        return obj.toString();
    }



}
