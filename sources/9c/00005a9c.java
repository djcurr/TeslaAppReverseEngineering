package com.stripe.android.ui.core.elements;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import kotlin.text.g;
import kotlin.text.y;

/* loaded from: classes6.dex */
final class IbanConfig$isIbanValid$1 extends u implements l<g, CharSequence> {
    public static final IbanConfig$isIbanValid$1 INSTANCE = new IbanConfig$isIbanValid$1();

    IbanConfig$isIbanValid$1() {
        super(1);
    }

    @Override // h00.l
    public final CharSequence invoke(g it2) {
        char f12;
        s.g(it2, "it");
        f12 = y.f1(it2.getValue());
        return String.valueOf((f12 - 'A') + 10);
    }
}