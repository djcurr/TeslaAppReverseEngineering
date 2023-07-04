package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class y9 implements tw.e<l3> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f19895a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f19896b;

    public y9(v9 v9Var, Provider<Application> provider) {
        this.f19895a = v9Var;
        this.f19896b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f19895a;
        Application application = this.f19896b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        SharedPreferences sharedPreferences = application.getSharedPreferences("plaid_feature_overrides", 0);
        kotlin.jvm.internal.s.f(sharedPreferences, "application.getSharedPre…text.MODE_PRIVATE\n      )");
        SharedPreferences sharedPreferences2 = application.getSharedPreferences("plaid_features_from_server", 0);
        kotlin.jvm.internal.s.f(sharedPreferences2, "application.getSharedPre…text.MODE_PRIVATE\n      )");
        return (l3) tw.h.e(new yb(sharedPreferences, sharedPreferences2));
    }
}