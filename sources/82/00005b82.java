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
public final class TextFieldUIKt$TextField$3 extends u implements l<b, Boolean> {
    final /* synthetic */ g $focusManager;
    final /* synthetic */ v1<String> $value$delegate;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextFieldUIKt$TextField$3(g gVar, v1<String> v1Var) {
        super(1);
        this.$focusManager = gVar;
        this.$value$delegate = v1Var;
    }

    @Override // h00.l
    public /* bridge */ /* synthetic */ Boolean invoke(b bVar) {
        return m497invokeZmokQxo(bVar.f());
    }

    /* renamed from: invoke-ZmokQxo  reason: not valid java name */
    public final Boolean m497invokeZmokQxo(KeyEvent event) {
        String m484TextField_PwfN4xk$lambda3;
        s.g(event, "event");
        boolean z11 = true;
        if (c.e(d.b(event), c.f7345a.a()) && event.getKeyCode() == 67) {
            m484TextField_PwfN4xk$lambda3 = TextFieldUIKt.m484TextField_PwfN4xk$lambda3(this.$value$delegate);
            if (m484TextField_PwfN4xk$lambda3.length() == 0) {
                this.$focusManager.a(r1.c.f48976b.f());
                return Boolean.valueOf(z11);
            }
        }
        z11 = false;
        return Boolean.valueOf(z11);
    }
}