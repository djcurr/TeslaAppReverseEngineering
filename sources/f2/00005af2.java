package com.stripe.android.ui.core.elements;

import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.c;
import r1.g;
import vz.b0;
import w0.t;

/* loaded from: classes6.dex */
final class PhoneNumberElementUIKt$PhoneNumberElementUI$2$6 extends u implements l<t, b0> {
    final /* synthetic */ g $focusManager;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$2$6(g gVar) {
        super(1);
        this.$focusManager = gVar;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ b0 invoke(t tVar) {
        invoke2(tVar);
        return b0.f54756a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(t $receiver) {
        s.g($receiver, "$this$$receiver");
        this.$focusManager.a(c.f48976b.d());
    }
}