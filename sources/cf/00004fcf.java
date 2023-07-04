package com.stripe.android.link.ui.forms;

import c1.e1;
import c1.i;
import kotlin.jvm.internal.s;
import kotlinx.coroutines.flow.e;

/* loaded from: classes6.dex */
public final class FormUIKt {
    public static final void Form(FormController formController, e<Boolean> enabledFlow, i iVar, int i11) {
        s.g(formController, "formController");
        s.g(enabledFlow, "enabledFlow");
        i h11 = iVar.h(1987316573);
        com.stripe.android.ui.core.FormUIKt.FormUI(formController.getHiddenIdentifiers$link_release(), enabledFlow, formController.getElements$link_release(), formController.getLastTextFieldIdentifier(), ComposableSingletons$FormUIKt.INSTANCE.m212getLambda1$link_release(), h11, 29256);
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new FormUIKt$Form$1(formController, enabledFlow, i11));
    }
}