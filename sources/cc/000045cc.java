package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.globalvalues.PlaidClientSideOnlyConfigurationStore$storeFlagSecure$3$1", f = "PlaidClientSideOnlyConfigurationStore.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class v8 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ t8 f19626a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ boolean f19627b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v8(t8 t8Var, boolean z11, zz.d<? super v8> dVar) {
        super(2, dVar);
        this.f19626a = t8Var;
        this.f19627b = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new v8(this.f19626a, this.f19627b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new v8(this.f19626a, this.f19627b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        vz.r.b(obj);
        this.f19626a.f19514a.a("plaid_flag_secure", String.valueOf(this.f19627b));
        return vz.b0.f54756a;
    }
}