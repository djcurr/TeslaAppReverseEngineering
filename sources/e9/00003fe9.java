package com.plaid.internal;

import android.app.Application;
import android.content.res.Resources;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class b5 implements tw.e<Resources> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18221a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f18222b;

    public b5(m4 m4Var, Provider<Application> provider) {
        this.f18221a = m4Var;
        this.f18222b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f18221a;
        Application application = this.f18222b.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        Resources resources = application.getResources();
        kotlin.jvm.internal.s.f(resources, "application.resources");
        return (Resources) tw.h.e(resources);
    }
}