package com.stripe.android.ui.core.elements;

import h00.l;
import kotlin.jvm.internal.p;
import kotlin.jvm.internal.s;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class PhoneNumberElementUIKt$PhoneNumberElementUI$2$1 extends p implements l<String, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2$1(Object obj) {
        super(1, obj, PhoneNumberController.class, "onValueChange", "onValueChange(Ljava/lang/String;)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(String str) {
        invoke2(str);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(String p02) {
        s.g(p02, "p0");
        ((PhoneNumberController) this.receiver).onValueChange(p02);
    }
}