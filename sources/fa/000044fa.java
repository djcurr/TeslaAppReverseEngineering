package com.plaid.internal;

import android.app.Application;
import java.io.File;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class p4 implements tw.e<e9> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19213a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f19214b;

    public p4(m4 m4Var, Provider<Application> provider) {
        this.f19213a = m4Var;
        this.f19214b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19213a;
        Application application = this.f19214b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        File cacheDir = application.getCacheDir();
        kotlin.jvm.internal.s.f(cacheDir, "application.cacheDir");
        return (e9) tw.h.e(new e9(cacheDir, "plaid-sdk/images"));
    }
}