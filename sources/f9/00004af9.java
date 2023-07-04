package com.squareup.wire;

import com.squareup.wire.p;
import java.lang.reflect.Method;
import java.util.Objects;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class n<E extends p> extends com.squareup.wire.a<E> {

    /* renamed from: a  reason: collision with root package name */
    private Method f20860a;

    /* renamed from: b  reason: collision with root package name */
    private final Class<E> f20861b;

    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    static {
        new a(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(Class<E> javaType, o syntax) {
        super(g00.a.e(javaType), syntax, mr.d.f(javaType));
        s.g(javaType, "javaType");
        s.g(syntax, "syntax");
        this.f20861b = javaType;
    }

    private final Method f() {
        Method method = this.f20860a;
        if (method != null) {
            return method;
        }
        Method method2 = this.f20861b.getMethod("fromValue", Integer.TYPE);
        this.f20860a = method2;
        s.f(method2, "javaType.getMethod(\"from…romValueMethod = it\n    }");
        return method2;
    }

    @Override // com.squareup.wire.a
    protected E d(int i11) {
        Object invoke = f().invoke(null, Integer.valueOf(i11));
        Objects.requireNonNull(invoke, "null cannot be cast to non-null type E");
        return (E) invoke;
    }

    public boolean equals(Object obj) {
        return (obj instanceof n) && s.c(((n) obj).getType(), getType());
    }

    public int hashCode() {
        n00.d<?> type = getType();
        if (type != null) {
            return type.hashCode();
        }
        return 0;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public n(Class<E> javaType) {
        this(javaType, o.PROTO_2);
        s.g(javaType, "javaType");
    }
}