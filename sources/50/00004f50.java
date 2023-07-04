package com.stripe.android.link.repositories;

import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import vz.q;

/* JADX INFO: Access modifiers changed from: package-private */
@f(c = "com.stripe.android.link.repositories.LinkApiRepository", f = "LinkApiRepository.kt", l = {176}, m = "listPaymentDetails-gIAlu-s")
/* loaded from: classes6.dex */
public final class LinkApiRepository$listPaymentDetails$1 extends d {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LinkApiRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LinkApiRepository$listPaymentDetails$1(LinkApiRepository linkApiRepository, zz.d<? super LinkApiRepository$listPaymentDetails$1> dVar) {
        super(dVar);
        this.this$0 = linkApiRepository;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object d11;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object mo168listPaymentDetailsgIAlus = this.this$0.mo168listPaymentDetailsgIAlus(null, this);
        d11 = a00.d.d();
        return mo168listPaymentDetailsgIAlus == d11 ? mo168listPaymentDetailsgIAlus : q.a(mo168listPaymentDetailsgIAlus);
    }
}