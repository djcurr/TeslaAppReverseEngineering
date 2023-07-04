package com.stripe.android.ui.core.elements;

import h00.a;
import kotlin.jvm.internal.u;
import vz.b0;

/* loaded from: classes6.dex */
final class DropdownFieldUIKt$DropdownMenuItem$2$1 extends u implements a<b0> {
    final /* synthetic */ a<b0> $onClick;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropdownMenuItem$2$1(a<b0> aVar) {
        super(0);
        this.$onClick = aVar;
    }

    @Override // h00.a
    public /* bridge */ /* synthetic */ b0 invoke() {
        invoke2();
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2() {
        this.$onClick.invoke();
    }
}