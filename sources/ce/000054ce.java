package com.stripe.android.paymentsheet;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.paymentsheet.ui.LpmSelectorTextKt;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PaymentMethodsUIKt$PaymentMethodUI$lpmTextSelector$1 extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ long $color;
    final /* synthetic */ boolean $isEnabled;
    final /* synthetic */ String $title;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsUIKt$PaymentMethodUI$lpmTextSelector$1(String str, long j11, boolean z11, int i11) {
        super(2);
        this.$title = str;
        this.$color = j11;
        this.$isEnabled = z11;
        this.$$dirty = i11;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return vz.b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        o1.f l11 = p0.u.l(o1.f.f42062f1, x2.g.f(12.0f), x2.g.f(6), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 12, null);
        String str = this.$title;
        long j11 = this.$color;
        boolean z11 = this.$isEnabled;
        int i12 = this.$$dirty;
        LpmSelectorTextKt.m346LpmSelectorTextT042LqI(null, str, j11, l11, z11, iVar, ((i12 >> 3) & 112) | (i12 & 57344), 1);
    }
}