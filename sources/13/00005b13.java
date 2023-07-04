package com.stripe.android.ui.core.elements;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.t;
import l2.v;
import vz.b0;

/* loaded from: classes6.dex */
final class SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$1$1 extends u implements l<v, b0> {
    final /* synthetic */ String $description;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SaveForFutureUseElementUIKt$SaveForFutureUseElementUI$1$1(String str) {
        super(1);
        this.$description = str;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(v vVar) {
        invoke2(vVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(v semantics) {
        s.g(semantics, "$this$semantics");
        t.Q(semantics, SaveForFutureUseElementUIKt.SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG);
        t.P(semantics, this.$description);
    }
}