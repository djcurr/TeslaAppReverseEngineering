package ew;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import dw.n;
import dw.o;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f25267a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f25268b;

    /* renamed from: c  reason: collision with root package name */
    public final EditText f25269c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f25270d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f25271e;

    private b(ConstraintLayout constraintLayout, Button button, EditText editText, TextView textView, TextView textView2) {
        this.f25267a = constraintLayout;
        this.f25268b = button;
        this.f25269c = editText;
        this.f25270d = textView;
        this.f25271e = textView2;
    }

    public static b a(View view) {
        int i11 = n.f24344a;
        Button button = (Button) b5.b.a(view, i11);
        if (button != null) {
            i11 = n.f24346c;
            EditText editText = (EditText) b5.b.a(view, i11);
            if (editText != null) {
                i11 = n.f24347d;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    i11 = n.f24348e;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new b((ConstraintLayout) view, button, editText, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(o.f24350b, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f25267a;
    }
}