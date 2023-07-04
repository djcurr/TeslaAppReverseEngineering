package com.plaid.internal;

import com.plaid.internal.core.crashreporting.internal.models.Crash;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$sendTestCrash$1", f = "PlaidCrashReporter.kt", l = {74}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a9 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18171a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ b9 f18172b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ RuntimeException f18173c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a9(b9 b9Var, RuntimeException runtimeException, zz.d<? super a9> dVar) {
        super(2, dVar);
        this.f18172b = b9Var;
        this.f18173c = runtimeException;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new a9(this.f18172b, this.f18173c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new a9(this.f18172b, this.f18173c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f18171a;
        if (i11 == 0) {
            vz.r.b(obj);
            b9 b9Var = this.f18172b;
            q2 q2Var = b9Var.f18230c;
            Crash a11 = b9Var.f18229b.a(this.f18173c);
            this.f18171a = 1;
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