package com.facebook.imagepipeline.producers;

import java.util.Map;

/* loaded from: classes3.dex */
public abstract class w0<T> extends kd.g<T> {

    /* renamed from: b  reason: collision with root package name */
    private final l<T> f11579b;

    /* renamed from: c  reason: collision with root package name */
    private final r0 f11580c;

    /* renamed from: d  reason: collision with root package name */
    private final String f11581d;

    /* renamed from: e  reason: collision with root package name */
    private final p0 f11582e;

    public w0(l<T> lVar, r0 r0Var, p0 p0Var, String str) {
        this.f11579b = lVar;
        this.f11580c = r0Var;
        this.f11581d = str;
        this.f11582e = p0Var;
        r0Var.d(p0Var, str);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd.g
    public void d() {
        r0 r0Var = this.f11580c;
        p0 p0Var = this.f11582e;
        String str = this.f11581d;
        r0Var.c(p0Var, str, r0Var.f(p0Var, str) ? g() : null);
        this.f11579b.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd.g
    public void e(Exception exc) {
        r0 r0Var = this.f11580c;
        p0 p0Var = this.f11582e;
        String str = this.f11581d;
        r0Var.k(p0Var, str, exc, r0Var.f(p0Var, str) ? h(exc) : null);
        this.f11579b.onFailure(exc);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // kd.g
    public void f(T t11) {
        r0 r0Var = this.f11580c;
        p0 p0Var = this.f11582e;
        String str = this.f11581d;
        r0Var.j(p0Var, str, r0Var.f(p0Var, str) ? i(t11) : null);
        this.f11579b.b(t11, 1);
    }

    protected Map<String, String> g() {
        return null;
    }

    protected Map<String, String> h(Exception exc) {
        return null;
    }

    protected Map<String, String> i(T t11) {
        return null;
    }
}