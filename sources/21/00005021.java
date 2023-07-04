package com.stripe.android.link.ui.signup;

import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.stripe.android.link.ui.LinkTermsKt;
import com.stripe.android.ui.core.elements.PhoneNumberController;
import com.stripe.android.ui.core.elements.PhoneNumberElementUIKt;
import h00.p;
import kotlin.jvm.internal.u;
import o1.f;
import p0.e0;
import vz.b0;
import w2.d;
import x2.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class SignUpScreenKt$SignUpBody$3$2$1$1 extends u implements p<i, Integer, b0> {
    final /* synthetic */ int $$dirty;
    final /* synthetic */ PhoneNumberController $phoneNumberController;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SignUpScreenKt$SignUpBody$3$2$1$1(PhoneNumberController phoneNumberController, int i11) {
        super(2);
        this.$phoneNumberController = phoneNumberController;
        this.$$dirty = i11;
    }

    @Override // h00.p
    /* renamed from: invoke */
    public /* bridge */ /* synthetic */ b0 mo160invoke(i iVar, Integer num) {
        invoke(iVar, num.intValue());
        return b0.f54756a;
    }

    public final void invoke(i iVar, int i11) {
        if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
            iVar.G();
            return;
        }
        PhoneNumberElementUIKt.PhoneNumberCollectionSection(true, this.$phoneNumberController, null, true, iVar, (PhoneNumberController.$stable << 3) | 3078 | ((this.$$dirty >> 3) & 112), 4);
        LinkTermsKt.m200LinkTerms5stqomU(p0.u.l(e0.n(f.f42062f1, BitmapDescriptorFactory.HUE_RED, 1, null), BitmapDescriptorFactory.HUE_RED, g.f(8), BitmapDescriptorFactory.HUE_RED, g.f(16), 5, null), d.f55400b.a(), iVar, 6, 0);
    }
}