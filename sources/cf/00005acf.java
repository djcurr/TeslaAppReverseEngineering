package com.stripe.android.ui.core.elements;

import android.view.KeyEvent;
import b2.b;
import b2.c;
import b2.d;
import c1.v1;
import h00.l;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import r1.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes6.dex */
public final class OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$2 extends u implements l<b, Boolean> {
    final /* synthetic */ OTPElement $element;
    final /* synthetic */ g $focusManager;
    final /* synthetic */ int $index;
    final /* synthetic */ v1<String> $value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OTPElementUIKt$OTPElementUI$1$1$1$textFieldModifier$2(int i11, g gVar, OTPElement oTPElement, v1<String> v1Var) {
        super(1);
        this.$index = i11;
        this.$focusManager = gVar;
        this.$element = oTPElement;
        this.$value$delegate = v1Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ Boolean invoke(b bVar) {
        return m454invokeZmokQxo(bVar.f());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m454invokeZmokQxo(KeyEvent event) {
        String m453invoke$lambda0;
        s.g(event, "event");
        if (this.$index != 0 && c.e(d.b(event), c.f7345a.a()) && event.getKeyCode() == 67) {
            m453invoke$lambda0 = OTPElementUIKt$OTPElementUI$1$1$1.m453invoke$lambda0(this.$value$delegate);
            if (m453invoke$lambda0.length() == 0) {
                this.$focusManager.a(r1.c.f48976b.f());
                this.$element.getController().onValueChanged(this.$index - 1, "");
                return Boolean.TRUE;
            }
        }
        return Boolean.FALSE;
    }
}