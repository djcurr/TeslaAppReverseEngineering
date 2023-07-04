package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithWebview$ButtonWithWebviewPane;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithwebview.ButtonWithWebviewViewModel$rendering$1", f = "ButtonWithWebviewViewModel.kt", l = {54}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class t0 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super ButtonWithWebview$ButtonWithWebviewPane.Rendering>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19492a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ s0 f19493b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(s0 s0Var, zz.d<? super t0> dVar) {
        super(2, dVar);
        this.f19493b = s0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new t0(this.f19493b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super ButtonWithWebview$ButtonWithWebviewPane.Rendering> dVar) {
        return new t0(this.f19493b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19492a;
        if (i11 == 0) {
            vz.r.b(obj);
            kotlinx.coroutines.flow.t<ButtonWithWebview$ButtonWithWebviewPane.Rendering> tVar = this.f19493b.f19407l;
            this.f19492a = 1;
            obj = kotlinx.coroutines.flow.g.r(tVar, this);
            if (obj == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        return obj;
    }
}