package rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import qv.r;
import qv.s;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f49674a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f49675b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f49676c;

    /* renamed from: d  reason: collision with root package name */
    public final EditText f49677d;

    /* renamed from: e  reason: collision with root package name */
    public final EditText f49678e;

    /* renamed from: f  reason: collision with root package name */
    public final EditText f49679f;

    /* renamed from: g  reason: collision with root package name */
    public final Spinner f49680g;

    private a(ConstraintLayout constraintLayout, EditText editText, ConstraintLayout constraintLayout2, TextView textView, EditText editText2, EditText editText3, EditText editText4, Spinner spinner) {
        this.f49674a = constraintLayout;
        this.f49675b = editText;
        this.f49676c = textView;
        this.f49677d = editText2;
        this.f49678e = editText3;
        this.f49679f = editText4;
        this.f49680g = spinner;
    }

    public static a a(View view) {
        int i11 = r.f48646a;
        EditText editText = (EditText) b5.b.a(view, i11);
        if (editText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = r.f48647b;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null) {
                i11 = r.f48648c;
                EditText editText2 = (EditText) b5.b.a(view, i11);
                if (editText2 != null) {
                    i11 = r.f48649d;
                    EditText editText3 = (EditText) b5.b.a(view, i11);
                    if (editText3 != null) {
                        i11 = r.f48650e;
                        EditText editText4 = (EditText) b5.b.a(view, i11);
                        if (editText4 != null) {
                            i11 = r.f48651f;
                            Spinner spinner = (Spinner) b5.b.a(view, i11);
                            if (spinner != null) {
                                return new a(constraintLayout, editText, constraintLayout, textView, editText2, editText3, editText4, spinner);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static a d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48672a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49674a;
    }
}