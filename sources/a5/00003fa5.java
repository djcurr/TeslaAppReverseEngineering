package com.plaid.internal;

import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.c;

/* loaded from: classes2.dex */
public final class a2 extends c.a {

    /* renamed from: a  reason: collision with root package name */
    public static final a f18156a = new a();

    /* loaded from: classes2.dex */
    public static final class a {
    }

    @Override // retrofit2.c.a
    public retrofit2.c<?, ?> get(Type returnType, Annotation[] annotations, retrofit2.t retrofit) {
        kotlin.jvm.internal.s.g(returnType, "returnType");
        kotlin.jvm.internal.s.g(annotations, "annotations");
        kotlin.jvm.internal.s.g(retrofit, "retrofit");
        if (kotlin.jvm.internal.s.c(retrofit2.b.class, c.a.getRawType(returnType))) {
            if (returnType instanceof ParameterizedType) {
                Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) returnType);
                if (kotlin.jvm.internal.s.c(c.a.getRawType(parameterUpperBound), f7.class)) {
                    if (parameterUpperBound instanceof ParameterizedType) {
                        ParameterizedType parameterizedType = (ParameterizedType) parameterUpperBound;
                        Type successBodyType = c.a.getParameterUpperBound(0, parameterizedType);
                        retrofit2.f errorBodyConverter = retrofit.f(null, c.a.getParameterUpperBound(1, parameterizedType), annotations);
                        kotlin.jvm.internal.s.f(successBodyType, "successBodyType");
                        kotlin.jvm.internal.s.f(errorBodyConverter, "errorBodyConverter");
                        return new z1(successBodyType, errorBodyConverter);
                    }
                    throw new IllegalStateException("Response must be parameterized as NetworkResponse<Foo> or NetworkResponse<out Foo>".toString());
                }
                return null;
            }
            throw new IllegalStateException("return type must be parameterized as Call<NetworkResponse<<Foo>> or Call<NetworkResponse<out Foo>>".toString());
        }
        return null;
    }
}