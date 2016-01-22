package com.fh.entity;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by M on 2016/1/12.
 */
public class BaseEntity {


    public String toString() {
        StringBuffer result = new StringBuffer();
        try {
            Class<?> clazz = super.getClass();
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields) {
                String fieldName = field.getName();
                if ("serialVersionUID".equals(fieldName)) {
                    continue;
                }
                String methodName = "get"
                        + fieldName.substring(0, 1).toUpperCase()
                        + fieldName.substring(1, fieldName.length());
                Method method = null;
                Object resultObj = null;
                method = clazz.getMethod(methodName, new Class[0]);
                resultObj = method.invoke(this, new Object[0]);
                if ((resultObj != null) && (!("".equals(resultObj))))
                    result.append("[").append(fieldName).append("]")
                            .append(resultObj).append(" ");
            }
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    public Map<String, Object> toMap() {
        Map<String, Object> map = new HashMap<String, Object>();
        Class<?> clazz = super.getClass();
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            try {
                String fieldName = field.getName();
                if (!("serialVersionUID".equals(fieldName))) {
                    String methodName = "get"
                            + fieldName.substring(0, 1).toUpperCase()
                            + fieldName.substring(1);
                    map.put(fieldName,
                            clazz.getMethod(methodName, new Class[0]).invoke(
                                    this, new Object[0]));
                }
            } catch (SecurityException e) {
                e.printStackTrace();
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        }
        return map;
    }



}