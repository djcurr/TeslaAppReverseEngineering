package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public final class y implements InvocationHandler {

    /* renamed from: a  reason: collision with root package name */
    public g f10139a;

    /* renamed from: b  reason: collision with root package name */
    public Class<?> f10140b;

    /* renamed from: c  reason: collision with root package name */
    public z f10141c;

    public y(g gVar, Class<?> cls, z zVar) {
        this.f10139a = gVar;
        this.f10140b = cls;
        this.f10141c = zVar;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return this.f10141c.a(method, objArr);
    }
}