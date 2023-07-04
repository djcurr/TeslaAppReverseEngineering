package p1;

import android.view.View;
import android.view.autofill.AutofillManager;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class a implements d {

    /* renamed from: a  reason: collision with root package name */
    private final View f45451a;

    /* renamed from: b  reason: collision with root package name */
    private final i f45452b;

    /* renamed from: c  reason: collision with root package name */
    private final AutofillManager f45453c;

    public a(View view, i autofillTree) {
        s.g(view, "view");
        s.g(autofillTree, "autofillTree");
        this.f45451a = view;
        this.f45452b = autofillTree;
        AutofillManager autofillManager = (AutofillManager) view.getContext().getSystemService(AutofillManager.class);
        if (autofillManager != null) {
            this.f45453c = autofillManager;
            view.setImportantForAutofill(1);
            return;
        }
        throw new IllegalStateException("Autofill service could not be located.".toString());
    }

    public final AutofillManager a() {
        return this.f45453c;
    }

    public final i b() {
        return this.f45452b;
    }

    public final View c() {
        return this.f45451a;
    }
}