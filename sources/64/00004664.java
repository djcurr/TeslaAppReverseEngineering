package com.plaid.internal;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.WorkflowViewModel", f = "WorkflowViewModel.kt", l = {151, 151}, m = "getOutputTransition")
/* loaded from: classes2.dex */
public final class yd extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f19910a;

    /* renamed from: b  reason: collision with root package name */
    public /* synthetic */ Object f19911b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ xd f19912c;

    /* renamed from: d  reason: collision with root package name */
    public int f19913d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd(xd xdVar, zz.d<? super yd> dVar) {
        super(dVar);
        this.f19912c = xdVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19911b = obj;
        this.f19913d |= Integer.MIN_VALUE;
        return xd.a(this.f19912c, this);
    }
}