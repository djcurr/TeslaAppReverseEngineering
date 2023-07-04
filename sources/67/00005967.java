package com.stripe.android.ui.core;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;

/* loaded from: classes6.dex */
final class FieldValuesToParamsMapConverter$Companion$getKeys$2 extends u implements l<String, Boolean> {
    public static final FieldValuesToParamsMapConverter$Companion$getKeys$2 INSTANCE = new FieldValuesToParamsMapConverter$Companion$getKeys$2();

    FieldValuesToParamsMapConverter$Companion$getKeys$2() {
        super(1);
    }

    @Override // h00.l
    public final Boolean invoke(String it2) {
        s.g(it2, "it");
        return Boolean.valueOf(it2.length() == 0);
    }
}