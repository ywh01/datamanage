package com.datamanage.common.utils.caseex;

import com.alibaba.fastjson.JSONObject;

public class CaseUtils {

    public static JSONObject JSONObjectLower(JSONObject obj, String[] str){
        for(int i=0; i<str.length; i++){
            String strUp = str[i].toUpperCase();
            if(obj.containsKey(strUp)){
                String value = (String)obj.get(strUp);
                obj.remove(strUp);
                obj.put(str[i], value);
            }
        }
        return obj;
    }
}
