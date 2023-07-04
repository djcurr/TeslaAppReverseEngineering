package com.stripe.android.ui.core.elements;

import h00.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.CvcController$error$1", f = "CvcController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class CvcController$error$1 extends l implements q<Boolean, TextFieldState, d<? super FieldError>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CvcController$error$1(d<? super CvcController$error$1> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, TextFieldState textFieldState, d<? super FieldError> dVar) {
        return invoke(bool.booleanValue(), textFieldState, dVar);
    }

    public final Object invoke(boolean z11, TextFieldState textFieldState, d<? super FieldError> dVar) {
        CvcController$error$1 cvcController$error$1 = new CvcController$error$1(dVar);
        cvcController$error$1.Z$0 = z11;
        cvcController$error$1.L$0 = textFieldState;
        return cvcController$error$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            boolean z11 = this.Z$0;
            FieldError error = ((TextFieldState) this.L$0).getError();
            if (error != null && z11) {
                return error;
            }
            return null;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}