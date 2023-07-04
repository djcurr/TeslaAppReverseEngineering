package ch.qos.logback.core.joran.util;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes.dex */
public class Introspector {
    public static String decapitalize(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        String lowerCase = str.substring(0, 1).toLowerCase(Locale.US);
        if (str.length() > 1) {
            return lowerCase + str.substring(1);
        }
        return lowerCase;
    }

    public static MethodDescriptor[] getMethodDescriptors(Class<?> cls) {
        Method[] methods;
        ArrayList arrayList = new ArrayList();
        for (Method method : cls.getMethods()) {
            arrayList.add(new MethodDescriptor(method.getName(), method));
        }
        return (MethodDescriptor[]) arrayList.toArray(new MethodDescriptor[0]);
    }

    public static PropertyDescriptor[] getPropertyDescriptors(Class<?> cls) {
        Method[] methods;
        Class<?> returnType;
        HashMap hashMap = new HashMap();
        for (Method method : cls.getMethods()) {
            String name = method.getName();
            boolean z11 = name.startsWith("get") && name.length() > 3;
            boolean z12 = name.startsWith("set") && name.length() > 3;
            if (z11 || z12) {
                String decapitalize = decapitalize(name.substring(3));
                PropertyDescriptor propertyDescriptor = (PropertyDescriptor) hashMap.get(decapitalize);
                if (propertyDescriptor == null) {
                    propertyDescriptor = new PropertyDescriptor(decapitalize);
                    hashMap.put(decapitalize, propertyDescriptor);
                }
                Class<?>[] parameterTypes = method.getParameterTypes();
                if (z12) {
                    if (parameterTypes.length == 1) {
                        propertyDescriptor.setWriteMethod(method);
                        returnType = parameterTypes[0];
                        propertyDescriptor.setPropertyType(returnType);
                    }
                } else if (z11 && parameterTypes.length == 0) {
                    propertyDescriptor.setReadMethod(method);
                    if (propertyDescriptor.getPropertyType() == null) {
                        returnType = method.getReturnType();
                        propertyDescriptor.setPropertyType(returnType);
                    }
                }
            }
        }
        return (PropertyDescriptor[]) hashMap.values().toArray(new PropertyDescriptor[0]);
    }
}