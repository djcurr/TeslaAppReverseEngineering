package com.stripe.android.link.ui.cardedit;

import kotlin.jvm.internal.a;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public /* synthetic */ class CardEditScreenKt$CardEditBody$2$3 extends a implements h00.a<b0> {
    /* JADX INFO: Access modifiers changed from: package-private */
    public CardEditScreenKt$CardEditBody$2$3(Object obj) {
        super(0, obj, CardEditViewModel.class, "dismiss", "dismiss(Lcom/stripe/android/link/ui/cardedit/CardEditViewModel$Result;)V", 0);
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        CardEditViewModel.dismiss$default((CardEditViewModel) this.receiver, null, 1, null);
    }
}