package p00;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import kotlin.jvm.internal.s;
import n00.h;
import n00.i;
import n00.m;
import n00.p;
import n00.w;
import q00.f;
import q00.l0;
import q00.u;
import q00.x;

/* loaded from: classes5.dex */
public final class c {
    public static final <T> Constructor<T> a(h<? extends T> javaConstructor) {
        r00.d<?> v11;
        s.g(javaConstructor, "$this$javaConstructor");
        f<?> b11 = l0.b(javaConstructor);
        Object b12 = (b11 == null || (v11 = b11.v()) == null) ? null : v11.b();
        return b12 instanceof Constructor ? b12 : null;
    }

    public static final Field b(m<?> javaField) {
        s.g(javaField, "$this$javaField");
        u<?> d11 = l0.d(javaField);
        if (d11 != null) {
            return d11.I();
        }
        return null;
    }

    public static final Method c(m<?> javaGetter) {
        s.g(javaGetter, "$this$javaGetter");
        return d(javaGetter.getGetter());
    }

    public static final Method d(h<?> javaMethod) {
        r00.d<?> v11;
        s.g(javaMethod, "$this$javaMethod");
        f<?> b11 = l0.b(javaMethod);
        Object b12 = (b11 == null || (v11 = b11.v()) == null) ? null : v11.b();
        return b12 instanceof Method ? b12 : null;
    }

    public static final Method e(i<?> javaSetter) {
        s.g(javaSetter, "$this$javaSetter");
        return d(javaSetter.getSetter());
    }

    public static final Type f(p javaType) {
        s.g(javaType, "$this$javaType");
        Type h11 = ((x) javaType).h();
        return h11 != null ? h11 : w.f(javaType);
    }
}