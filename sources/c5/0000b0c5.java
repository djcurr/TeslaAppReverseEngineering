package retrofit2;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes4.dex */
public abstract class u<T> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> u<T> b(t tVar, Method method) {
        r b11 = r.b(tVar, method);
        Type genericReturnType = method.getGenericReturnType();
        if (!x.j(genericReturnType)) {
            if (genericReturnType != Void.TYPE) {
                return j.f(tVar, method, b11);
            }
            throw x.m(method, "Service methods cannot return void.", new Object[0]);
        }
        throw x.m(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract T a(Object[] objArr);
}