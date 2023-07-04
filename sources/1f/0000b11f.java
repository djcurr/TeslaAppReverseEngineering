package rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import qv.r;
import qv.s;

/* loaded from: classes6.dex */
public final class e implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f49694a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f49695b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f49696c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f49697d;

    private e(ConstraintLayout constraintLayout, EditText editText, EditText editText2, Guideline guideline, ConstraintLayout constraintLayout2, TextView textView) {
        this.f49694a = constraintLayout;
        this.f49695b = editText;
        this.f49696c = editText2;
        this.f49697d = textView;
    }

    public static e a(View view) {
        int i11 = r.f48658m;
        EditText editText = (EditText) b5.b.a(view, i11);
        if (editText != null) {
            i11 = r.f48663r;
            EditText editText2 = (EditText) b5.b.a(view, i11);
            if (editText2 != null) {
                i11 = r.f48665t;
                Guideline guideline = (Guideline) b5.b.a(view, i11);
                if (guideline != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    i11 = r.f48666u;
                    TextView textView = (TextView) b5.b.a(view, i11);
                    if (textView != null) {
                        return new e(constraintLayout, editText, editText2, guideline, constraintLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static e c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static e d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48677f, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49694a;
    }
}