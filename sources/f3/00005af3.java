package com.stripe.android.ui.core.elements;

import h00.p;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import r1.s;
import v20.o0;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.PhoneNumberElementUIKt$PhoneNumberElementUI$3", f = "PhoneNumberElementUI.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PhoneNumberElementUIKt$PhoneNumberElementUI$3 extends l implements p<o0, d<? super b0>, Object> {
    final /* synthetic */ s $focusRequester;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PhoneNumberElementUIKt$PhoneNumberElementUI$3(s sVar, d<? super PhoneNumberElementUIKt$PhoneNumberElementUI$3> dVar) {
        super(2, dVar);
        this.$focusRequester = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final d<b0> create(Object obj, d<?> dVar) {
        return new PhoneNumberElementUIKt$PhoneNumberElementUI$3(this.$focusRequester, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, d<? super b0> dVar) {
        return ((PhoneNumberElementUIKt$PhoneNumberElementUI$3) create(o0Var, dVar)).invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            this.$focusRequester.c();
            return b0.f54756a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}