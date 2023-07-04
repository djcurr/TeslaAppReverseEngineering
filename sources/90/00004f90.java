package com.stripe.android.link.ui.cardedit;

import h00.l;
import kotlin.jvm.internal.p;
import vz.b0;

/* loaded from: classes6.dex */
/* synthetic */ class CardEditScreenKt$CardEditBody$2$1 extends p implements l<Boolean, b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CardEditScreenKt$CardEditBody$2$1(Object obj) {
        super(1, obj, CardEditViewModel.class, "setAsDefault", "setAsDefault(Z)V", 0);
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return b0.f54756a;
    }

    public final void invoke(boolean z11) {
        ((CardEditViewModel) this.receiver).setAsDefault(z11);
    }
}