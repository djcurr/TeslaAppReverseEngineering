package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {97}, m = "pollOAuthResult")
/* loaded from: classes2.dex */
public final class x3 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f19814a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19815b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f19816c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u3 f19817d;

    /* renamed from: e  reason: collision with root package name */
    public int f19818e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x3(u3 u3Var, zz.d<? super x3> dVar) {
        super(dVar);
        this.f19817d = u3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19816c = obj;
        this.f19818e |= Integer.MIN_VALUE;
        return u3.b(this.f19817d, null, this);
    }
}