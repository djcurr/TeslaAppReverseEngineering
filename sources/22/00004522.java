package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class q4 implements tw.e<p5> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19304a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<w5> f19305b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<j6> f19306c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider<i6> f19307d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider<be> f19308e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider<ce> f19309f;

    /* renamed from: g  reason: collision with root package name */
    public final Provider<c3> f19310g;

    public q4(m4 m4Var, Provider<w5> provider, Provider<j6> provider2, Provider<i6> provider3, Provider<be> provider4, Provider<ce> provider5, Provider<c3> provider6) {
        this.f19304a = m4Var;
        this.f19305b = provider;
        this.f19306c = provider2;
        this.f19307d = provider3;
        this.f19308e = provider4;
        this.f19309f = provider5;
        this.f19310g = provider6;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19304a;
        w5 navigator = this.f19305b.get();
        j6 linkStateStore = this.f19306c.get();
        i6 reducer = this.f19307d.get();
        be writeOAuthRedirectUri = this.f19308e.get();
        ce writeWebviewFallbackUri = this.f19309f.get();
        c3 destinationFactory = this.f19310g.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(navigator, "navigator");
        kotlin.jvm.internal.s.g(linkStateStore, "linkStateStore");
        kotlin.jvm.internal.s.g(reducer, "reducer");
        kotlin.jvm.internal.s.g(writeOAuthRedirectUri, "writeOAuthRedirectUri");
        kotlin.jvm.internal.s.g(writeWebviewFallbackUri, "writeWebviewFallbackUri");
        kotlin.jvm.internal.s.g(destinationFactory, "destinationFactory");
        return (p5) tw.h.e(new o5(navigator, linkStateStore, reducer, writeOAuthRedirectUri, writeWebviewFallbackUri, destinationFactory));
    }
}