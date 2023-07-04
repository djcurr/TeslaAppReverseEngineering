package com.plaid.internal;

import com.plaid.internal.core.protos.link.workflow.nodes.panes.Challenge$ChallengePane;
import com.plaid.internal.z0;

@kotlin.coroutines.jvm.internal.f(c = "com.plaid.internal.workflow.panes.challenge.ChallengeViewModel$onChallengeSuccess$1", f = "ChallengeViewModel.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
public final class a1 extends kotlin.coroutines.jvm.internal.l implements h00.p<v20.o0, zz.d<? super vz.b0>, Object> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ z0 f18154a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ String f18155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(z0 z0Var, String str, zz.d<? super a1> dVar) {
        super(2, dVar);
        this.f18154a = z0Var;
        this.f18155b = str;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new a1(this.f18154a, this.f18155b, dVar);
    }

    @Override // h00.p
    public Object invoke(v20.o0 o0Var, zz.d<? super vz.b0> dVar) {
        return new a1(this.f18154a, this.f18155b, dVar).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        vz.r.b(obj);
        z0 z0Var = this.f18154a;
        z0.b bVar = z0.b.f19940a;
        String challengeResponse = this.f18155b;
        kotlin.jvm.internal.s.g(challengeResponse, "challengeResponse");
        Challenge$ChallengePane.Actions.b a11 = Challenge$ChallengePane.Actions.newBuilder().a(Challenge$ChallengePane.Actions.SubmitAction.newBuilder().a(challengeResponse));
        kotlin.jvm.internal.s.f(a11, "newBuilder().setSubmit(C…ponse(challengeResponse))");
        z0.a(z0Var, a11, null, 2);
        return vz.b0.f54756a;
    }
}