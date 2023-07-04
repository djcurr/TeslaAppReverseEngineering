package xv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import wv.h0;
import wv.i0;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f57732a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f57733b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f57734c;

    /* renamed from: d  reason: collision with root package name */
    public final View f57735d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f57736e;

    /* renamed from: f  reason: collision with root package name */
    public final TextView f57737f;

    /* renamed from: g  reason: collision with root package name */
    public final Button f57738g;

    /* renamed from: h  reason: collision with root package name */
    public final ImageView f57739h;

    /* renamed from: i  reason: collision with root package name */
    public final View f57740i;

    /* renamed from: j  reason: collision with root package name */
    public final View f57741j;

    private a(ConstraintLayout constraintLayout, Button button, ImageView imageView, View view, TextView textView, TextView textView2, Button button2, ImageView imageView2, View view2, View view3) {
        this.f57732a = constraintLayout;
        this.f57733b = button;
        this.f57734c = imageView;
        this.f57735d = view;
        this.f57736e = textView;
        this.f57737f = textView2;
        this.f57738g = button2;
        this.f57739h = imageView2;
        this.f57740i = view2;
        this.f57741j = view3;
    }

    public static a a(View view) {
        View a11;
        View a12;
        View a13;
        int i11 = h0.f56280a;
        Button button = (Button) b5.b.a(view, i11);
        if (button != null) {
            i11 = h0.f56285f;
            ImageView imageView = (ImageView) b5.b.a(view, i11);
            if (imageView != null && (a11 = b5.b.a(view, (i11 = h0.f56287h))) != null) {
                i11 = h0.f56289j;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    i11 = h0.f56290k;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        i11 = h0.f56299t;
                        Button button2 = (Button) b5.b.a(view, i11);
                        if (button2 != null) {
                            i11 = h0.f56300u;
                            ImageView imageView2 = (ImageView) b5.b.a(view, i11);
                            if (imageView2 != null && (a12 = b5.b.a(view, (i11 = h0.C))) != null && (a13 = b5.b.a(view, (i11 = h0.D))) != null) {
                                return new a((ConstraintLayout) view, button, imageView, a11, textView, textView2, button2, imageView2, a12, a13);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(i0.f56313a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f57732a;
    }
}