package com.stripe.android.paymentsheet;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import z2.a0;
import z2.u;

/* loaded from: classes6.dex */
final class PaymentOptionsAdapterKt$PaymentOptionUi$2$1 extends kotlin.jvm.internal.u implements h00.l<z2.d, vz.b0> {
    public static final PaymentOptionsAdapterKt$PaymentOptionUi$2$1 INSTANCE = new PaymentOptionsAdapterKt$PaymentOptionUi$2$1();

    PaymentOptionsAdapterKt$PaymentOptionUi$2$1() {
        super(1);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(z2.d dVar) {
        invoke2(dVar);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(z2.d constrainAs) {
        kotlin.jvm.internal.s.g(constrainAs, "$this$constrainAs");
        u.a.a(constrainAs.e(), constrainAs.c().e(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
        a0.a.a(constrainAs.d(), constrainAs.c().d(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
        a0.a.a(constrainAs.b(), constrainAs.c().b(), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 6, null);
    }
}