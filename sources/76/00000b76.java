package aw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import androidx.recyclerview.widget.RecyclerView;
import zv.m0;
import zv.n0;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f7059a;

    /* renamed from: b  reason: collision with root package name */
    public final ImageView f7060b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f7061c;

    /* renamed from: d  reason: collision with root package name */
    public final View f7062d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f7063e;

    /* renamed from: f  reason: collision with root package name */
    public final NestedScrollView f7064f;

    /* renamed from: g  reason: collision with root package name */
    public final RecyclerView f7065g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f7066h;

    /* renamed from: i  reason: collision with root package name */
    public final TextView f7067i;

    /* renamed from: j  reason: collision with root package name */
    public final TextView f7068j;

    /* renamed from: k  reason: collision with root package name */
    public final View f7069k;

    private b(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, Button button, NestedScrollView nestedScrollView, RecyclerView recyclerView, TextView textView2, TextView textView3, TextView textView4, View view2) {
        this.f7059a = constraintLayout;
        this.f7060b = imageView;
        this.f7061c = textView;
        this.f7062d = view;
        this.f7063e = button;
        this.f7064f = nestedScrollView;
        this.f7065g = recyclerView;
        this.f7066h = textView2;
        this.f7067i = textView3;
        this.f7068j = textView4;
        this.f7069k = view2;
    }

    public static b a(View view) {
        View a11;
        View a12;
        int i11 = m0.f61162f;
        ImageView imageView = (ImageView) b5.b.a(view, i11);
        if (imageView != null) {
            i11 = m0.f61163g;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null && (a11 = b5.b.a(view, (i11 = m0.f61164h))) != null) {
                i11 = m0.f61165i;
                Button button = (Button) b5.b.a(view, i11);
                if (button != null) {
                    i11 = m0.f61171o;
                    NestedScrollView nestedScrollView = (NestedScrollView) b5.b.a(view, i11);
                    if (nestedScrollView != null) {
                        i11 = m0.f61172p;
                        RecyclerView recyclerView = (RecyclerView) b5.b.a(view, i11);
                        if (recyclerView != null) {
                            i11 = m0.f61173q;
                            TextView textView2 = (TextView) b5.b.a(view, i11);
                            if (textView2 != null) {
                                i11 = m0.f61174r;
                                TextView textView3 = (TextView) b5.b.a(view, i11);
                                if (textView3 != null) {
                                    i11 = m0.f61175s;
                                    TextView textView4 = (TextView) b5.b.a(view, i11);
                                    if (textView4 != null && (a12 = b5.b.a(view, (i11 = m0.f61179w))) != null) {
                                        return new b((ConstraintLayout) view, imageView, textView, a11, button, nestedScrollView, recyclerView, textView2, textView3, textView4, a12);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(n0.f61185d, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7059a;
    }
}