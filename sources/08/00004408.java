package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.link.LinkActivityViewModel$onActivityReady$1", f = "LinkActivityViewModel.kt", l = {59, 61}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class h5 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18696a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ fb f18697b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ i5 f18698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h5(fb fbVar, i5 i5Var, zz.d<? super h5> dVar) {
        super(2, dVar);
        this.f18697b = fbVar;
        this.f18698c = i5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new h5(this.f18697b, this.f18698c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new h5(this.f18697b, this.f18698c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f18696a;
        if (i11 == 0) {
            vz.r.b(obj);
            if (this.f18697b == null) {
                p5 a11 = this.f18698c.a();
                this.f18696a = 1;
                if (a11.b(this) == d11) {
                    return d11;
                }
            } else {
                p5 a12 = this.f18698c.a();
                fb fbVar = this.f18697b;
                this.f18696a = 2;
                if (a12.a(fbVar, this) == d11) {
                    return d11;
                }
            }
        } else if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return vz.b0.f54756a;
    }
}