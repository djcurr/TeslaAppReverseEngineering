package com.stripe.android.ui.core.elements;

import c1.o0;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.w;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class PhoneNumberElementUIKt$PhoneNumberElementUI$1$1 extends u implements l<w, b0> {
    final /* synthetic */ o0<Boolean> $hasFocus$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$1$1(o0<Boolean> o0Var) {
        super(1);
        this.$hasFocus$delegate = o0Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(w wVar) {
        invoke2(wVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(w focusState) {
        s.g(focusState, "focusState");
        PhoneNumberElementUIKt.m457PhoneNumberElementUI$lambda12(this.$hasFocus$delegate, focusState.getHasFocus());
    }
}