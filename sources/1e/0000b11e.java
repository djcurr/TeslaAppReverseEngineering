package rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import qv.r;
import qv.s;

/* loaded from: classes6.dex */
public final class d implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f49690a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f49691b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f49692c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f49693d;

    private d(ConstraintLayout constraintLayout, EditText editText, ConstraintLayout constraintLayout2, TextView textView, Button button) {
        this.f49690a = constraintLayout;
        this.f49691b = editText;
        this.f49692c = textView;
        this.f49693d = button;
    }

    public static d a(View view) {
        int i11 = r.f48661p;
        EditText editText = (EditText) b5.b.a(view, i11);
        if (editText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = r.f48662q;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null) {
                i11 = r.f48671z;
                Button button = (Button) b5.b.a(view, i11);
                if (button != null) {
                    return new d(constraintLayout, editText, constraintLayout, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static d c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static d d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48675d, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49690a;
    }
}