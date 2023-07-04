package com.stripe.android.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.internal.s;
import vz.q;
import vz.r;

/* loaded from: classes6.dex */
public final class ClassUtils {
    public static final ClassUtils INSTANCE = new ClassUtils();

    private ClassUtils() {
    }

    public static final Field findField(Class<?> clazz, Collection<String> allowedFields) {
        Field field;
        s.g(clazz, "clazz");
        s.g(allowedFields, "allowedFields");
        Field[] fields = clazz.getDeclaredFields();
        s.f(fields, "fields");
        int length = fields.length;
        int i11 = 0;
        while (true) {
            if (i11 >= length) {
                field = null;
                break;
            }
            field = fields[i11];
            if (allowedFields.contains(field.getName())) {
                break;
            }
            i11++;
        }
        if (field == null) {
            return null;
        }
        field.setAccessible(true);
        return field;
    }

    public static final Method findMethod(Class<?> clazz, Collection<String> allowedMethods) {
        s.g(clazz, "clazz");
        s.g(allowedMethods, "allowedMethods");
        Method[] declaredMethods = clazz.getDeclaredMethods();
        s.f(declaredMethods, "clazz.declaredMethods");
        for (Method method : declaredMethods) {
            if (allowedMethods.contains(method.getName())) {
                return method;
            }
        }
        return null;
    }

    public static final Object getInternalObject(Class<?> clazz, Set<String> allowedFields, Object obj) {
        Object b11;
        s.g(clazz, "clazz");
        s.g(allowedFields, "allowedFields");
        s.g(obj, "obj");
        Field findField = findField(clazz, allowedFields);
        if (findField == null) {
            return null;
        }
        try {
            q.a aVar = q.f54772b;
            b11 = q.b(findField.get(obj));
        } catch (Throwable th2) {
            q.a aVar2 = q.f54772b;
            b11 = q.b(r.a(th2));
        }
        if (q.g(b11)) {
            return null;
        }
        return b11;
    }
}