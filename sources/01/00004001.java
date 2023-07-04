package com.plaid.internal;

import android.app.Application;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ca implements tw.e<g9> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f18262a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f18263b;

    public ca(v9 v9Var, Provider<Application> provider) {
        this.f18262a = v9Var;
        this.f18263b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f18262a;
        Application application = this.f18263b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        return (g9) tw.h.e(new g9(application));
    }
}