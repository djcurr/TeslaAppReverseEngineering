package p1;

import android.util.Log;
import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class g extends AutofillManager.AutofillCallback {

    /* renamed from: a  reason: collision with root package name */
    public static final g f45457a = new g();

    private g() {
    }

    public final void a(a autofill) {
        s.g(autofill, "autofill");
        autofill.a().registerCallback(this);
    }

    public final void b(a autofill) {
        s.g(autofill, "autofill");
        autofill.a().unregisterCallback(this);
    }

    @Override // android.view.autofill.AutofillManager.AutofillCallback
    public void onAutofillEvent(View view, int i11, int i12) {
        s.g(view, "view");
        super.onAutofillEvent(view, i11, i12);
        Log.d("Autofill Status", i12 != 1 ? i12 != 2 ? i12 != 3 ? "Unknown status event." : "Autofill popup isn't shown because autofill is not available.\n\nDid you set up autofill?\n1. Go to Settings > System > Languages&input > Advanced > Autofill Service\n2. Pick a service\n\nDid you add an account?\n1. Go to Settings > System > Languages&input > Advanced\n2. Click on the settings icon next to the Autofill Service\n3. Add your account" : "Autofill popup was hidden." : "Autofill popup was shown.");
    }
}