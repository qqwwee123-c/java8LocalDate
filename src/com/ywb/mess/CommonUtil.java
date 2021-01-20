package com.ywb.mess;

import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

public class CommonUtil {


    public static boolean judgeAnyFieldIsEmpty(Object object, String ... args) {
        if (null == object) {
            return true;
        }
        List<String> excludeFields = Arrays.asList(args);
        try {
            for (Field f : object.getClass().getDeclaredFields()) {
                f.setAccessible(true);
                String name = f.getName();
                if (excludeFields != null && excludeFields.contains(name)) {
                    continue;
                }
                if (f.get(object) == null || f.get(object).toString() == "") {
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            return true;
        }
        return false;
    }

}
