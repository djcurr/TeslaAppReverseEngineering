package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.LinkWorkflowAnalytics", f = "LinkWorkflowAnalytics.kt", l = {121, 128, d.SDK_ASSET_ILLUSTRATION_CONSUMER_VALUE}, m = "sendAllAnalyticsEventsToServer")
/* loaded from: classes2.dex */
public final class l6 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f18959a;

    /* renamed from: b  reason: collision with root package name */
    public Object f18960b;

    /* renamed from: c  reason: collision with root package name */
    public Object f18961c;

    /* renamed from: d  reason: collision with root package name */
    public /* synthetic */ Object f18962d;

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ m6 f18963e;

    /* renamed from: f  reason: collision with root package name */
    public int f18964f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(m6 m6Var, zz.d<? super l6> dVar) {
        super(dVar);
        this.f18963e = m6Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f18962d = obj;
        this.f18964f |= Integer.MIN_VALUE;
        return m6.a(this.f18963e, this);
    }
}