package com.plaid.internal;

import android.app.Application;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class fa implements tw.e<na> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f18590a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f18591b;

    public fa(v9 v9Var, Provider<Application> provider) {
        this.f18590a = v9Var;
        this.f18591b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f18590a;
        Application application = this.f18591b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        return (na) tw.h.e(new na(application));
    }
}