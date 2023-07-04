package com.stripe.android.ui.core.elements;

import h00.q;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import vz.b0;
import vz.r;
import zz.d;

@f(c = "com.stripe.android.ui.core.elements.PhoneNumberController$rawFieldValue$1", f = "PhoneNumberController.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class PhoneNumberController$rawFieldValue$1 extends l implements q<String, PhoneNumberFormatter, d<? super String>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    public PhoneNumberController$rawFieldValue$1(d<? super PhoneNumberController$rawFieldValue$1> dVar) {
        super(3, dVar);
    }

    @Override // h00.q
    public final Object invoke(String str, PhoneNumberFormatter phoneNumberFormatter, d<? super String> dVar) {
        PhoneNumberController$rawFieldValue$1 phoneNumberController$rawFieldValue$1 = new PhoneNumberController$rawFieldValue$1(dVar);
        phoneNumberController$rawFieldValue$1.L$0 = str;
        phoneNumberController$rawFieldValue$1.L$1 = phoneNumberFormatter;
        return phoneNumberController$rawFieldValue$1.invokeSuspend(b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            return ((PhoneNumberFormatter) this.L$1).toE164Format((String) this.L$0);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}