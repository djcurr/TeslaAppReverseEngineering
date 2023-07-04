package com.plaid.internal;

import android.app.Application;
import com.plaid.internal.core.crashreporting.internal.models.SentryProject;
import com.plaid.internal.i2;
import com.plaid.link.Plaid;
import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class w9 implements tw.e<b9> {

    /* renamed from: a  reason: collision with root package name */
    public final v9 f19674a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<Application> f19675b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<ja> f19676c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider<g9> f19677d;

    public w9(v9 v9Var, Provider<Application> provider, Provider<ja> provider2, Provider<g9> provider3) {
        this.f19674a = v9Var;
        this.f19675b = provider;
        this.f19676c = provider2;
        this.f19677d = provider3;
    }

    @Override // javax.inject.Provider
    public Object get() {
        v9 v9Var = this.f19674a;
        Application application = this.f19675b.get();
        ja plaidRetrofit = this.f19676c.get();
        g9 plaidGlobalValuesStore = this.f19677d.get();
        v9Var.getClass();
        kotlin.jvm.internal.s.g(application, "application");
        kotlin.jvm.internal.s.g(plaidRetrofit, "plaidRetrofit");
        kotlin.jvm.internal.s.g(plaidGlobalValuesStore, "plaidGlobalValuesStore");
        return (b9) tw.h.e(new b9(application, SentryProject.LinkSdk.INSTANCE, Plaid.getVERSION_NAME(), i2.a.f18726a, plaidRetrofit, plaidGlobalValuesStore, new f6(application)));
    }
}