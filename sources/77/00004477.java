package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithTable$ButtonWithTablePane;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithtable.ButtonWithTableViewModel$rendering$1", f = "ButtonWithTableViewModel.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class l0 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super ButtonWithTable$ButtonWithTablePane.Rendering>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18951a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ k0 f18952b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(k0 k0Var, zz.d<? super l0> dVar) {
        super(2, dVar);
        this.f18952b = k0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new l0(this.f18952b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super ButtonWithTable$ButtonWithTablePane.Rendering> dVar) {
        return new l0(this.f18952b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f18951a;
        if (i11 == 0) {
            vz.r.b(obj);
            kotlinx.coroutines.flow.t<ButtonWithTable$ButtonWithTablePane.Rendering> tVar = this.f18952b.f18903k;
            this.f18951a = 1;
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