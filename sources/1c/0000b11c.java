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
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f49681a;

    /* renamed from: b  reason: collision with root package name */
    public final EditText f49682b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f49683c;

    /* renamed from: d  reason: collision with root package name */
    public final Button f49684d;

    private b(ConstraintLayout constraintLayout, EditText editText, ConstraintLayout constraintLayout2, TextView textView, Button button) {
        this.f49681a = constraintLayout;
        this.f49682b = editText;
        this.f49683c = textView;
        this.f49684d = button;
    }

    public static b a(View view) {
        int i11 = r.f48653h;
        EditText editText = (EditText) b5.b.a(view, i11);
        if (editText != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = r.f48654i;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null) {
                i11 = r.f48655j;
                Button button = (Button) b5.b.a(view, i11);
                if (button != null) {
                    return new b(constraintLayout, editText, constraintLayout, textView, button);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static b d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48673b, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f49681a;
    }
}