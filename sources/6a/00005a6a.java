package com.stripe.android.ui.core.elements;

import a2.a;
import a2.b;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.p;
import vz.b0;

/* loaded from: classes6.dex */
final class DropdownFieldUIKt$DropDown$1$1 extends u implements l<p, b0> {
    final /* synthetic */ b $inputModeManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DropdownFieldUIKt$DropDown$1$1(b bVar) {
        super(1);
        this.$inputModeManager = bVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(p pVar) {
        invoke2(pVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(p focusProperties) {
        s.g(focusProperties, "$this$focusProperties");
        focusProperties.a(!a.f(this.$inputModeManager.a(), a.f130b.b()));
    }
}