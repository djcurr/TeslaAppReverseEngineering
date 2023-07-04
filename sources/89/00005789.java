package com.stripe.android.paymentsheet.ui;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.ui.core.elements.H4TextKt;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class BaseSheetActivity$setupHeader$1$1$1$1 extends u implements h00.p<c1.i, Integer, b0> {
    final /* synthetic */ String $it;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseSheetActivity$setupHeader$1$1$1$1(String str) {
        super(2);
        this.$it = str;
    }

    @Override // h00.p
    public /* bridge */ /* synthetic */ b0 invoke(c1.i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(c1.i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
        } else {
            H4TextKt.H4Text(this.$it, p0.u.l(o1.f.f42062f1, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, x2.g.f(2), 7, null), iVar, 48, 0);
        }
    }
}