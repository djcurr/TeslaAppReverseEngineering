package rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import qv.r;
import qv.s;

/* loaded from: classes6.dex */
public final class f implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f49698a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f49699b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f49700c;

    private f(ConstraintLayout constraintLayout, EditText editText, ConstraintLayout constraintLayout2, TextView textView) {
        this.f49698a = constraintLayout;
        this.f49699b = editText;
        this.f49700c = textView;
    }

    public static f a(View view) {
        int i11 = r.f48667v;
        EditText editText = (EditText) b5.b.a(view, i11);
        if (editText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = r.f48668w;
            TextView textView = (TextView) b5.b.a(view, i12);
            if (textView != null) {
                return new f(constraintLayout, editText, constraintLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static f c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static f d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48678g, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49698a;
    }
}