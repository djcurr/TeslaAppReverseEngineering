package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {91}, m = "openLoginUrl")
/* loaded from: classes2.dex */
public final class w3 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f19658a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19659b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f19660c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u3 f19661d;

    /* renamed from: e  reason: collision with root package name */
    public int f19662e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3(u3 u3Var, zz.d<? super w3> dVar) {
        super(dVar);
        this.f19661d = u3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19660c = obj;
        this.f19662e |= Integer.MIN_VALUE;
        return u3.a(this.f19661d, (String) null, this);
    }
}