package com.stripe.android.ui.core.elements;

import h00.q;
import kotlin.coroutines.jvm.internal.b;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.SimpleTextFieldController$visibleError$1", f = "TextFieldController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class SimpleTextFieldController$visibleError$1 extends l implements q<TextFieldState, Boolean, d<? super Boolean>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SimpleTextFieldController$visibleError$1(d<? super SimpleTextFieldController$visibleError$1> dVar) {
        super(3, dVar);
    }

    public final Object invoke(TextFieldState textFieldState, boolean z11, d<? super Boolean> dVar) {
        SimpleTextFieldController$visibleError$1 simpleTextFieldController$visibleError$1 = new SimpleTextFieldController$visibleError$1(dVar);
        simpleTextFieldController$visibleError$1.L$0 = textFieldState;
        simpleTextFieldController$visibleError$1.Z$0 = z11;
        return simpleTextFieldController$visibleError$1.invokeSuspend(b0.f54756a);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(TextFieldState textFieldState, Boolean bool, d<? super Boolean> dVar) {
        return invoke(textFieldState, bool.booleanValue(), dVar);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            return b.a(((TextFieldState) this.L$0).shouldShowError(this.Z$0));
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}