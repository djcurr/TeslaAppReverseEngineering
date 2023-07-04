package com.stripe.android.ui.core.elements;

import com.stripe.android.ui.core.forms.FormFieldEntry;
import h00.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.DropdownFieldController$formFieldValue$1", f = "DropdownFieldController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DropdownFieldController$formFieldValue$1 extends l implements q<Boolean, String, d<? super FormFieldEntry>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public DropdownFieldController$formFieldValue$1(d<? super DropdownFieldController$formFieldValue$1> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public /* bridge */ /* synthetic */ Object invoke(Boolean bool, String str, d<? super FormFieldEntry> dVar) {
        return invoke(bool.booleanValue(), str, dVar);
    }

    public final Object invoke(boolean z11, String str, d<? super FormFieldEntry> dVar) {
        DropdownFieldController$formFieldValue$1 dropdownFieldController$formFieldValue$1 = new DropdownFieldController$formFieldValue$1(dVar);
        dropdownFieldController$formFieldValue$1.Z$0 = z11;
        dropdownFieldController$formFieldValue$1.L$0 = str;
        return dropdownFieldController$formFieldValue$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            return new FormFieldEntry((String) this.L$0, this.Z$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}