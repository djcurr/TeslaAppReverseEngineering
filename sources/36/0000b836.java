package uv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.widget.NestedScrollView;
import tv.l;
import tv.m;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f53722a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f53723b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f53724c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f53725d;

    /* renamed from: e  reason: collision with root package name */
    public final Button f53726e;

    private a(ConstraintLayout constraintLayout, TextView textView, Button button, NestedScrollView nestedScrollView, ImageView imageView, TextView textView2, Button button2) {
        this.f53722a = constraintLayout;
        this.f53723b = textView;
        this.f53724c = button;
        this.f53725d = textView2;
        this.f53726e = button2;
    }

    public static a a(View view) {
        int i11 = l.f52622a;
        TextView textView = (TextView) b5.b.a(view, i11);
        if (textView != null) {
            i11 = l.f52623b;
            Button button = (Button) b5.b.a(view, i11);
            if (button != null) {
                i11 = l.f52624c;
                NestedScrollView nestedScrollView = (NestedScrollView) b5.b.a(view, i11);
                if (nestedScrollView != null) {
                    i11 = l.f52625d;
                    ImageView imageView = (ImageView) b5.b.a(view, i11);
                    if (imageView != null) {
                        i11 = l.f52627f;
                        TextView textView2 = (TextView) b5.b.a(view, i11);
                        if (textView2 != null) {
                            i11 = l.f52628g;
                            Button button2 = (Button) b5.b.a(view, i11);
                            if (button2 != null) {
                                return new a((ConstraintLayout) view, textView, button, nestedScrollView, imageView, textView2, button2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(m.f52629a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f53722a;
    }
}