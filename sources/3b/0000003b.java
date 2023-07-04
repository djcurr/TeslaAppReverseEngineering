package a10;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.internal.s;

/* loaded from: classes5.dex */
final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f129a = new n();

    private n() {
    }

    public final String a(Constructor<?> constructor) {
        s.g(constructor, "constructor");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        s.f(parameterTypes, "constructor.parameterTypes");
        int length = parameterTypes.length;
        int i11 = 0;
        while (i11 < length) {
            Class<?> parameterType = parameterTypes[i11];
            i11++;
            s.f(parameterType, "parameterType");
            sb2.append(b10.b.b(parameterType));
        }
        sb2.append(")V");
        String sb3 = sb2.toString();
        s.f(sb3, "sb.toString()");
        return sb3;
    }

    public final String b(Field field) {
        s.g(field, "field");
        Class<?> type = field.getType();
        s.f(type, "field.type");
        return b10.b.b(type);
    }

    public final String c(Method method) {
        s.g(method, "method");
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        Class<?>[] parameterTypes = method.getParameterTypes();
        s.f(parameterTypes, "method.parameterTypes");
        int length = parameterTypes.length;
        int i11 = 0;
        while (i11 < length) {
            Class<?> parameterType = parameterTypes[i11];
            i11++;
            s.f(parameterType, "parameterType");
            sb2.append(b10.b.b(parameterType));
        }
        sb2.append(")");
        Class<?> returnType = method.getReturnType();
        s.f(returnType, "method.returnType");
        sb2.append(b10.b.b(returnType));
        String sb3 = sb2.toString();
        s.f(sb3, "sb.toString()");
        return sb3;
    }
}