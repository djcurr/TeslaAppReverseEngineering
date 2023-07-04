package com.plaid.internal;

import android.os.Build;
import com.plaid.internal.ja;
import com.plaid.link.Plaid;
import com.plaid.link.R;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class da implements tw.e<ja> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f18504a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<na> f18505b;

    public da(v9 v9Var, Provider<na> provider) {
        this.f18504a = v9Var;
        this.f18505b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        String string;
        v9 v9Var = this.f18504a;
        na sdkVersionDetails = this.f18505b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(sdkVersionDetails, "sdkVersionDetails");
        ja.a aVar = ja.f18891e;
        String a11 = sdkVersionDetails.a();
        if (a11 != null) {
            string = sdkVersionDetails.f19081a.getString(R.string.plaid_user_agent_string_format_react_native, new Object[]{a11, Plaid.getVERSION_NAME(), sdkVersionDetails.f19081a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT)});
            kotlin.jvm.internal.s.f(string, "application.getString(\n ….SDK_INT.toString()\n    )");
        } else {
            string = sdkVersionDetails.f19081a.getString(R.string.plaid_user_agent_string_format_android, new Object[]{Plaid.getVERSION_NAME(), sdkVersionDetails.f19081a.getPackageName(), String.valueOf(Build.VERSION.SDK_INT)});
            kotlin.jvm.internal.s.f(string, "application.getString(\n …DK_INT.toString()\n      )");
        }
        return (ja) tw.h.e(aVar.a(false, string));
    }
}