package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import gw.j;
import gw.k;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29450a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f29451b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f29452c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29453d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29454e;

    private b(ConstraintLayout constraintLayout, Button button, ImageView imageView, TextView textView, TextView textView2) {
        this.f29450a = constraintLayout;
        this.f29451b = button;
        this.f29452c = imageView;
        this.f29453d = textView;
        this.f29454e = textView2;
    }

    public static b a(View view) {
        int i11 = j.f28403a;
        Button button = (Button) b5.b.a(view, i11);
        if (button != null) {
            i11 = j.f28410h;
            ImageView imageView = (ImageView) b5.b.a(view, i11);
            if (imageView != null) {
                i11 = j.f28418p;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    i11 = j.f28419q;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new b((ConstraintLayout) view, button, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(k.f28427b, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29450a;
    }
}