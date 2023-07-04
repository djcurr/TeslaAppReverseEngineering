package com.plaid.internal;

import javax.inject.Provider;

/* loaded from: classes2.dex */
public final class r4 implements tw.e<i6> {

    /* renamed from: a  reason: collision with root package name */
    public final m4 f19344a;

    /* renamed from: b  reason: collision with root package name */
    public final Provider<md> f19345b;

    /* renamed from: c  reason: collision with root package name */
    public final Provider<m6> f19346c;

    /* renamed from: d  reason: collision with root package name */
    public final Provider<a8> f19347d;

    /* renamed from: e  reason: collision with root package name */
    public final Provider<g3> f19348e;

    /* renamed from: f  reason: collision with root package name */
    public final Provider<nd> f19349f;

    public r4(m4 m4Var, Provider<md> provider, Provider<m6> provider2, Provider<a8> provider3, Provider<g3> provider4, Provider<nd> provider5) {
        this.f19344a = m4Var;
        this.f19345b = provider;
        this.f19346c = provider2;
        this.f19347d = provider3;
        this.f19348e = provider4;
        this.f19349f = provider5;
    }

    @Override // javax.inject.Provider
    public Object get() {
        m4 m4Var = this.f19344a;
        md api = this.f19345b.get();
        m6 linkWorkflowAnalytics = this.f19346c.get();
        a8 paneStore = this.f19347d.get();
        g3 errorStateWithRenderingFactory = this.f19348e.get();
        nd requestFactory = this.f19349f.get();
        m4Var.getClass();
        kotlin.jvm.internal.s.g(api, "api");
        kotlin.jvm.internal.s.g(linkWorkflowAnalytics, "linkWorkflowAnalytics");
        kotlin.jvm.internal.s.g(paneStore, "paneStore");
        kotlin.jvm.internal.s.g(errorStateWithRenderingFactory, "errorStateWithRenderingFactory");
        kotlin.jvm.internal.s.g(requestFactory, "requestFactory");
        return (i6) tw.h.e(new i6(api, paneStore, linkWorkflowAnalytics, errorStateWithRenderingFactory, requestFactory));
    }
}