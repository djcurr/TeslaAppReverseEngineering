package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.ButtonWithAccordion$ButtonWithAccordionPane;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.buttonwithaccordion.ButtonWithAccordionViewModel$rendering$1", f = "ButtonWithAccordionViewModel.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a0 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super ButtonWithAccordion$ButtonWithAccordionPane.Rendering>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f18152a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ z f18153b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(z zVar, zz.d<? super a0> dVar) {
        super(2, dVar);
        this.f18153b = zVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new a0(this.f18153b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super ButtonWithAccordion$ButtonWithAccordionPane.Rendering> dVar) {
        return new a0(this.f18153b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f18152a;
        if (i11 == 0) {
            vz.r.b(obj);
            kotlinx.coroutines.flow.t<ButtonWithAccordion$ButtonWithAccordionPane.Rendering> tVar = this.f18153b.f19914h;
            this.f18152a = 1;
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