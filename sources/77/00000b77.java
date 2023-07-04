package aw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import zv.m0;
import zv.n0;

/* loaded from: classes6.dex */
public final class c implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f7070a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f7071b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f7072c;

    /* renamed from: d  reason: collision with root package name */
    public final ImageView f7073d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f7074e;

    private c(ConstraintLayout constraintLayout, TextView textView, Button button, ImageView imageView, TextView textView2) {
        this.f7070a = constraintLayout;
        this.f7071b = textView;
        this.f7072c = button;
        this.f7073d = imageView;
        this.f7074e = textView2;
    }

    public static c a(View view) {
        int i11 = m0.f61158b;
        TextView textView = (TextView) b5.b.a(view, i11);
        if (textView != null) {
            i11 = m0.f61159c;
            Button button = (Button) b5.b.a(view, i11);
            if (button != null) {
                i11 = m0.f61169m;
                ImageView imageView = (ImageView) b5.b.a(view, i11);
                if (imageView != null) {
                    i11 = m0.f61178v;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new c((ConstraintLayout) view, textView, button, imageView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(n0.f61186e, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7070a;
    }
}