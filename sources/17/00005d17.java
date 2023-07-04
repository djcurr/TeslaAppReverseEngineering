package com.stripe.android.view;

import com.stripe.android.core.model.Country;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class ShippingInfoWidget$initView$1 extends kotlin.jvm.internal.p implements h00.l<Country, vz.b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ShippingInfoWidget$initView$1(Object obj) {
        super(1, obj, ShippingInfoWidget.class, "updateConfigForCountry", "updateConfigForCountry(Lcom/stripe/android/core/model/Country;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ vz.b0 invoke(Country country) {
        invoke2(country);
        return vz.b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Country p02) {
        kotlin.jvm.internal.s.g(p02, "p0");
        ((ShippingInfoWidget) this.receiver).updateConfigForCountry(p02);
    }
}