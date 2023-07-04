package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Oauth$OAuthPane;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.oauth.OAuthViewModel$initiateOAuth$1", f = "OAuthViewModel.kt", l = {109}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class n7 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public int f19065a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ m7 f19066b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Oauth$OAuthPane.Rendering f19067c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n7(m7 m7Var, Oauth$OAuthPane.Rendering rendering, zz.d<? super n7> dVar) {
        super(2, dVar);
        this.f19066b = m7Var;
        this.f19067c = rendering;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new n7(this.f19066b, this.f19067c, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new n7(this.f19066b, this.f19067c, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        d11 = a00.d.d();
        int i11 = this.f19065a;
        if (i11 == 0) {
            vz.r.b(obj);
            w6 c11 = this.f19066b.c();
            String str = this.f19066b.f19839a.f19649b;
            String loginUri = this.f19067c.getLoginUri();
            kotlin.jvm.internal.s.f(loginUri, "rendering.loginUri");
            this.f19065a = 1;
            if (c11.a(str, "login_url", loginUri, this) == d11) {
                return d11;
            }
        } else if (i11 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            vz.r.b(obj);
        }
        p5 b11 = this.f19066b.b();
        String loginUri2 = this.f19067c.getLoginUri();
        kotlin.jvm.internal.s.f(loginUri2, "rendering.loginUri");
        b11.a(loginUri2);
        return vz.b0.f54756a;
    }
}