package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$readStatusBarColor$2", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class u8 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super String>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t8 f19583a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u8(t8 t8Var, zz.d<? super u8> dVar) {
        super(2, dVar);
        this.f19583a = t8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new u8(this.f19583a, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super String> dVar) {
        return new u8(this.f19583a, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        vz.r.b(obj);
        return this.f19583a.f19514a.b("plaid_status_bar_color");
    }
}