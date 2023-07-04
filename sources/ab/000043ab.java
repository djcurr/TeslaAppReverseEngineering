package com.plaid.internal;

import android.app.Application;
import android.content.Context;
import com.plaid.internal.ma;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class ea implements tw.e<ma> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f18537a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f18538b;

    public ea(v9 v9Var, Provider<Application> provider) {
        this.f18537a = v9Var;
        this.f18538b = provider;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f18537a;
        Application context = this.f18538b.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(context, "application");
        ma.a aVar = ma.f19046b;
        kotlin.jvm.internal.s.g(context, "context");
        ma maVar = ma.f19047c;
        if (maVar == null) {
            synchronized (aVar) {
                maVar = ma.f19047c;
                if (maVar == null) {
                    Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.s.f(applicationContext, "context.applicationContext");
                    maVar = new ma(applicationContext);
                    ma.f19047c = maVar;
                }
            }
        }
        return (ma) tw.h.e(maVar);
    }
}