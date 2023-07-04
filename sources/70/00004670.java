package com.plaid.internal;

import java.lang.reflect.Type;
import okhttp3.ResponseBody;

/* loaded from: classes2.dex */
public final class z1<S, E> implements retrofit2.c<S, retrofit2.b<f7<? extends S, ? extends E>>> {

    /* renamed from: a  reason: collision with root package name */
    public final Type f19943a;

    /* renamed from: b  reason: collision with root package name */
    public final retrofit2.f<ResponseBody, E> f19944b;

    public z1(Type successType, retrofit2.f<ResponseBody, E> errorBodyConverter) {
        kotlin.jvm.internal.s.g(successType, "successType");
        kotlin.jvm.internal.s.g(errorBodyConverter, "errorBodyConverter");
        this.f19943a = successType;
        this.f19944b = errorBodyConverter;
    }

    @Override // retrofit2.c
    public Object adapt(retrofit2.b call) {
        kotlin.jvm.internal.s.g(call, "call");
        return new b2(call, this.f19944b);
    }

    @Override // retrofit2.c
    public Type responseType() {
        return this.f19943a;
    }
}