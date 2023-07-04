package com.stripe.android.paymentsheet;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import z2.a0;
import z2.u;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapterKt$PaymentOptionUi$2$3$1 extends kotlin.jvm.internal.u implements h00.l<z2.d, vz.b0> {
    final /* synthetic */ z2.e $card;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentOptionsAdapterKt$PaymentOptionUi$2$3$1(z2.e eVar) {
        super(1);
        this.$card = eVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(z2.d dVar) {
        invoke2(dVar);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(z2.d constrainAs) {
        kotlin.jvm.internal.s.g(constrainAs, "$this$constrainAs");
        u.a.a(constrainAs.e(), this.$card.a(), x2.g.f(-18), BitmapDescriptorFactory.HUE_RED, 4, null);
        a0.a.a(constrainAs.b(), this.$card.b(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
    }
}