package com.datamanage.common.utils.json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.serializer.JSONLibDataFormatSerializer;
import com.alibaba.fastjson.serializer.SerializeConfig;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.serializer.SimpleDateFormatSerializer;
import com.datamanage.business.base.model.UserModel;
import com.datamanage.business.common.model.DBInfo;

import java.util.List;
import java.util.Map;
/**
 * 基于FastJson封装JSON
 */
public class JSONUtil {

    private static SerializerFeature[] features = {
            //输出空值字段
            SerializerFeature.WriteMapNullValue,
            //如果数组结果为null,则输出为[],而不是null
            SerializerFeature.WriteNullListAsEmpty,
            //数值字段为null,则输出为0,而不是null
            SerializerFeature.WriteNullNumberAsZero,
            //Boolean字段为null,则输出为false,而不是null
            SerializerFeature.WriteNullBooleanAsFalse,
            //字符类型如果为null,则输出为" ",而不是null
            SerializerFeature.WriteNullStringAsEmpty
    };

    private static SerializeConfig config;
    private static String dateFormat;
    static {
        dateFormat = "yyyy-MM-dd HH:mm:ss";
        config = new SerializeConfig();
        //使用json-lib兼容的日期输出格式
        config.put(java.util.Date.class,new SimpleDateFormatSerializer(dateFormat));
    }

    /**
     * 将一个对象装换为Json对象
     */
    public static JSONObject toJSONObj(Object object) {
        String res = JSONObject.toJSONString(object,config,features);
        return (JSONObject) JSONObject.parse(res);
    }

    /**
     * 将一个list对象装换为Json对象
     * @param list
     */
    public static JSONArray toJSONArray(List<DBInfo> list) {
        String res = JSONObject.toJSONString(list,config,features);
        return (JSONArray) JSONObject.parse(res);
    }
    /**
     * 将一个对象装换为Json字符串
     */
    public static String toJSONString(Object object) {
        return JSONObject.toJSONString(object,config,features);
    }

    /**
     * 将Json字符串转换为Object类型的
     * */
    public  static  Object toObject(String str){
        return JSON.parse(str);
    }

    /**
     * 将Json字符串转换为实例
     * */
    public static <T> T toObject(String str,Class<T> t){
        return JSON.parseObject(str,t);
    }

    /**
     * 将Json转换为指定类型的List
     * */
    public static <T> List<T> toList(String str, Class<T> t){
        return JSON.parseArray(str,t);
    }

    /**
     * 将Json转换为Map
     * */
    public static <T> Map<String,T> toMap(String str){
        return (Map<String, T>) JSONObject.parseObject(str);
    }
}
