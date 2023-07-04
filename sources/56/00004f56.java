package com.stripe.android.link.repositories;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", l = {96}, m = "startVerification-0E7RQCE")
/* loaded from: classes6.dex */
public final class LinkApiRepository$startVerification$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$startVerification$1(LinkApiRepository linkApiRepository, zz.d<? super LinkApiRepository$startVerification$1> dVar) {
        super(dVar);
        this.this$0 = linkApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo171startVerification0E7RQCE = this.this$0.mo171startVerification0E7RQCE(null, null, this);
        d11 = a00.d.d();
        return mo171startVerification0E7RQCE == d11 ? mo171startVerification0E7RQCE : q.a(mo171startVerification0E7RQCE);
    }
}