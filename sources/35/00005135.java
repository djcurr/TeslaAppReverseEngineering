package com.stripe.android.model;

import com.stripe.android.model.KlarnaSourceParams;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class KlarnaSourceParams$toParamMap$2$2 extends u implements l<KlarnaSourceParams.CustomPaymentMethods, CharSequence> {
    public static final KlarnaSourceParams$toParamMap$2$2 INSTANCE = new KlarnaSourceParams$toParamMap$2$2();

    KlarnaSourceParams$toParamMap$2$2() {
        super(1);
    }

    @Override // h00.l
    public final CharSequence invoke(KlarnaSourceParams.CustomPaymentMethods it2) {
        s.g(it2, "it");
        return it2.getCode$payments_core_release();
    }
}