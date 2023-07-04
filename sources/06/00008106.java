package kx;

import hy.i;
import hy.l;
import hy.m;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import retrofit2.c;
import retrofit2.s;
import retrofit2.t;

/* loaded from: classes5.dex */
public final class g extends c.a {

    /* renamed from: a  reason: collision with root package name */
    private final l f35922a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f35923b;

    private g(l lVar, boolean z11) {
        this.f35922a = lVar;
        this.f35923b = z11;
    }

    public static g a() {
        return new g(null, false);
    }

    @Override // retrofit2.c.a
    public retrofit2.c<?, ?> get(Type type, Annotation[] annotationArr, t tVar) {
        Type type2;
        boolean z11;
        boolean z12;
        Class<?> rawType = c.a.getRawType(type);
        if (rawType == hy.b.class) {
            return new f(Void.class, this.f35922a, this.f35923b, false, true, false, false, false, true);
        }
        boolean z13 = rawType == hy.e.class;
        boolean z14 = rawType == m.class;
        boolean z15 = rawType == hy.g.class;
        if (rawType == i.class || z13 || z14 || z15) {
            if (!(type instanceof ParameterizedType)) {
                String str = !z13 ? !z14 ? z15 ? "Maybe" : "Observable" : "Single" : "Flowable";
                throw new IllegalStateException(str + " return type must be parameterized as " + str + "<Foo> or " + str + "<? extends Foo>");
            }
            Type parameterUpperBound = c.a.getParameterUpperBound(0, (ParameterizedType) type);
            Class<?> rawType2 = c.a.getRawType(parameterUpperBound);
            if (rawType2 == s.class) {
                if (parameterUpperBound instanceof ParameterizedType) {
                    type2 = c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                    z12 = false;
                    z11 = false;
                } else {
                    throw new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
                }
            } else if (rawType2 != d.class) {
                type2 = parameterUpperBound;
                z11 = true;
                z12 = false;
            } else if (parameterUpperBound instanceof ParameterizedType) {
                type2 = c.a.getParameterUpperBound(0, (ParameterizedType) parameterUpperBound);
                z12 = true;
                z11 = false;
            } else {
                throw new IllegalStateException("Result must be parameterized as Result<Foo> or Result<? extends Foo>");
            }
            return new f(type2, this.f35922a, this.f35923b, z12, z11, z13, z14, z15, false);
        }
        return null;
    }
}