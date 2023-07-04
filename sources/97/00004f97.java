package com.stripe.android.link.ui.cardedit;

import h00.a;
import h00.l;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class CardEditScreenKt$CardEditBody$4$2$1 extends u implements a<b0> {
    final /* synthetic */ l<Boolean, b0> $onSetAsDefaultClick;
    final /* synthetic */ boolean $setAsDefaultChecked;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CardEditScreenKt$CardEditBody$4$2$1(l<? super Boolean, b0> lVar, boolean z11) {
        super(0);
        this.$onSetAsDefaultClick = lVar;
        this.$setAsDefaultChecked = z11;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onSetAsDefaultClick.invoke(Boolean.valueOf(!this.$setAsDefaultChecked));
    }
}