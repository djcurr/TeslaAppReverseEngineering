package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.internal.PlaidCrashHandler$handleCrash$1", f = "PlaidCrashHandler.kt", l = {41}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class y8 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19892a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z8 f19893b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Throwable f19894c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8(z8 z8Var, Throwable th2, zz.d<? super y8> dVar) {
        super(2, dVar);
        this.f19893b = z8Var;
        this.f19894c = th2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new y8(this.f19893b, this.f19894c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new y8(this.f19893b, this.f19894c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19892a;
        if (i11 == 0) {
            vz.r.b(obj);
            z8 z8Var = this.f19893b;
            q2 q2Var = z8Var.f19962b;
            Crash a11 = z8Var.f19961a.a(this.f19894c);
            this.f19892a = 1;
            if (q2Var.a(a11, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return vz.b0.f54756a;
    }
}