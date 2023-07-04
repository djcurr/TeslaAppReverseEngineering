package p1;

import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import android.view.autofill.AutofillValue;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f45456a = new f();

    private f() {
    }

    public final AutofillId a(ViewStructure structure) {
        s.g(structure, "structure");
        return structure.getAutofillId();
    }

    public final boolean b(AutofillValue value) {
        s.g(value, "value");
        return value.isDate();
    }

    public final boolean c(AutofillValue value) {
        s.g(value, "value");
        return value.isList();
    }

    public final boolean d(AutofillValue value) {
        s.g(value, "value");
        return value.isText();
    }

    public final boolean e(AutofillValue value) {
        s.g(value, "value");
        return value.isToggle();
    }

    public final void f(ViewStructure structure, String[] hints) {
        s.g(structure, "structure");
        s.g(hints, "hints");
        structure.setAutofillHints(hints);
    }

    public final void g(ViewStructure structure, AutofillId parent, int i11) {
        s.g(structure, "structure");
        s.g(parent, "parent");
        structure.setAutofillId(parent, i11);
    }

    public final void h(ViewStructure structure, int i11) {
        s.g(structure, "structure");
        structure.setAutofillType(i11);
    }

    public final CharSequence i(AutofillValue value) {
        s.g(value, "value");
        CharSequence textValue = value.getTextValue();
        s.f(textValue, "value.textValue");
        return textValue;
    }
}