package com.stripe.android.ui.core.elements;

import c1.v1;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.t;
import l2.v;
import n2.a;
import vz.b0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class TextFieldUIKt$TextField$5$1 extends u implements l<v, b0> {
    final /* synthetic */ v1<String> $contentDescription$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$5$1(v1<String> v1Var) {
        super(1);
        this.$contentDescription$delegate = v1Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(v vVar) {
        invoke2(vVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(v semantics) {
        String m488TextField_PwfN4xk$lambda7;
        s.g(semantics, "$this$semantics");
        m488TextField_PwfN4xk$lambda7 = TextFieldUIKt.m488TextField_PwfN4xk$lambda7(this.$contentDescription$delegate);
        t.F(semantics, m488TextField_PwfN4xk$lambda7);
        t.G(semantics, new a("", null, null, 6, null));
    }
}