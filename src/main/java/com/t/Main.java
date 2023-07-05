package com.t;

//import com.wxfggzs.dgraph.types.types.DClientAdConfigPatch;

import java.lang.reflect.Field;

public class Main {
//    public static void main(String[] args) throws Exception{
//        Class<?> aClass = Class.forName(DClientAdConfigPatch.class.getCanonicalName());
//        DClientAdConfigPatch builder = DClientAdConfigPatch.newBuilder().build();
//
//        Field[] declaredFields = aClass.getDeclaredFields();
//
//        for (Field declaredField : declaredFields) {
//            declaredField.setAccessible(true);
//
//            if(declaredField.getName().equals("enabledAd"))
//            {
//                declaredField.set(builder,true);
//            }
//        }
//
//
//        System.out.println(builder.toString());
//
//    }

    public static void main(String[] args) throws Exception {

        Class<?> aClass = Class.forName("com.t.A");
        A a = new A();
        Field[] fields = aClass.getDeclaredFields();
        for (Field field : fields) {
            // 修改访问权限
            field.setAccessible(true);
            if (field.getName().equals("name")) {
                field.set(a, "test set value");
            }
        }
        System.out.println(a.getName());
    }
}
