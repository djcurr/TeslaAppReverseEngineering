package com.plaid.internal;

import android.app.Application;
import android.content.SharedPreferences;
import com.plaid.link.Plaid;
import java.util.Arrays;
import java.util.UUID;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class a5 implements tw.e<nd> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f18165a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f18166b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<na> f18167c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider<k3> f18168d;

    public a5(m4 m4Var, Provider<Application> provider, Provider<na> provider2, Provider<k3> provider3) {
        this.f18165a = m4Var;
        this.f18166b = provider;
        this.f18167c = provider2;
        this.f18168d = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f18165a;
        Application application = this.f18166b.get();
        na sdkVersionDetails = this.f18167c.get();
        k3 featureManager = this.f18168d.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(sdkVersionDetails, "sdkVersionDetails");
        kotlin.jvm.internal.s.g(featureManager, "featureManager");
        d8 d8Var = d8.f18493a;
        String version_name = Plaid.getVERSION_NAME();
        String a11 = sdkVersionDetails.a();
        SharedPreferences sharedPreferences = application.getSharedPreferences("link_persistent_uuid", 0);
        String string = sharedPreferences.getString("link_persistent_uuid", "");
        if (string == null || string.length() == 0) {
            string = UUID.randomUUID().toString();
            kotlin.jvm.internal.s.f(string, "randomUUID().toString()");
            sharedPreferences.edit().putString("link_persistent_uuid", string).apply();
        }
        String str = string;
        String packageName = application.getPackageName();
        kotlin.jvm.internal.s.f(packageName, "application.packageName");
        kotlin.jvm.internal.s.g(application, "<this>");
        String format = String.format("intent://redirect/#Intent;scheme=plaid;package=%s;end;", Arrays.copyOf(new Object[]{application.getApplicationContext().getPackageName()}, 1));
        kotlin.jvm.internal.s.f(format, "format(this, *args)");
        return (nd) tw.h.e(new nd(d8Var, version_name, a11, str, packageName, format, new l4(featureManager)));
    }
}