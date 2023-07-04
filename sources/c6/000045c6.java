package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Pane$PaneRendering;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.headlessoauth.HeadlessOAuthViewModel", f = "HeadlessOAuthViewModel.kt", l = {78, 82}, m = "getOAuthState")
/* loaded from: classes2.dex */
public final class v3 extends kotlin.coroutines.jvm.internal.d {

    /* renamed from: a  reason: collision with root package name */
    public Object f19611a;

    /* renamed from: b  reason: collision with root package name */
    public Object f19612b;

    /* renamed from: c  reason: collision with root package name */
    public /* synthetic */ Object f19613c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ u3 f19614d;

    /* renamed from: e  reason: collision with root package name */
    public int f19615e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(u3 u3Var, zz.d<? super v3> dVar) {
        super(dVar);
        this.f19614d = u3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        this.f19613c = obj;
        this.f19615e |= Integer.MIN_VALUE;
        return u3.a(this.f19614d, (Pane$PaneRendering) null, this);
    }
}