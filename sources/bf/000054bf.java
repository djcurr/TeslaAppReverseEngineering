package com.stripe.android.paymentsheet;

import android.content.SharedPreferences;
import com.stripe.android.paymentsheet.model.SavedSelection;
import java.util.List;
import v20.o0;
import vz.r;

@kotlin.coroutines.jvm.internal.f(c = "com.stripe.android.paymentsheet.DefaultPrefsRepository$getSavedSelection$2", f = "DefaultPrefsRepository.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
final class DefaultPrefsRepository$getSavedSelection$2 extends kotlin.coroutines.jvm.internal.l implements h00.p<o0, zz.d<? super SavedSelection>, Object> {
    final /* synthetic */ boolean $isGooglePayAvailable;
    int label;
    final /* synthetic */ DefaultPrefsRepository this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultPrefsRepository$getSavedSelection$2(DefaultPrefsRepository defaultPrefsRepository, boolean z11, zz.d<? super DefaultPrefsRepository$getSavedSelection$2> dVar) {
        super(2, dVar);
        this.this$0 = defaultPrefsRepository;
        this.$isGooglePayAvailable = z11;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final zz.d<vz.b0> create(Object obj, zz.d<?> dVar) {
        return new DefaultPrefsRepository$getSavedSelection$2(this.this$0, this.$isGooglePayAvailable, dVar);
    }

    @Override // h00.p
    public final Object invoke(o0 o0Var, zz.d<? super SavedSelection> dVar) {
        return ((DefaultPrefsRepository$getSavedSelection$2) create(o0Var, dVar)).invokeSuspend(vz.b0.f54756a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        SharedPreferences prefs;
        String key;
        List E0;
        String str;
        a00.d.d();
        if (this.label == 0) {
            r.b(obj);
            prefs = this.this$0.getPrefs();
            key = this.this$0.getKey();
            SavedSelection.GooglePay googlePay = null;
            String string = prefs.getString(key, null);
            if (string == null) {
                string = "";
            }
            E0 = kotlin.text.w.E0(string, new String[]{":"}, false, 0, 6, null);
            String str2 = (String) wz.u.d0(E0);
            if (kotlin.jvm.internal.s.c(str2, "google_pay")) {
                SavedSelection.GooglePay googlePay2 = SavedSelection.GooglePay.INSTANCE;
                if (this.$isGooglePayAvailable) {
                    googlePay = googlePay2;
                }
            } else if (kotlin.jvm.internal.s.c(str2, "payment_method") && (str = (String) wz.u.e0(E0, 1)) != null) {
                googlePay = new SavedSelection.PaymentMethod(str);
            }
            return googlePay == null ? SavedSelection.None.INSTANCE : googlePay;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}