package aw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import zv.m0;
import zv.n0;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f7054a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f7055b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f7056c;

    /* renamed from: d  reason: collision with root package name */
    public final LottieAnimationView f7057d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f7058e;

    private a(ConstraintLayout constraintLayout, TextView textView, Button button, LottieAnimationView lottieAnimationView, TextView textView2) {
        this.f7054a = constraintLayout;
        this.f7055b = textView;
        this.f7056c = button;
        this.f7057d = lottieAnimationView;
        this.f7058e = textView2;
    }

    public static a a(View view) {
        int i11 = m0.f61158b;
        TextView textView = (TextView) b5.b.a(view, i11);
        if (textView != null) {
            i11 = m0.f61159c;
            Button button = (Button) b5.b.a(view, i11);
            if (button != null) {
                i11 = m0.f61170n;
                LottieAnimationView lottieAnimationView = (LottieAnimationView) b5.b.a(view, i11);
                if (lottieAnimationView != null) {
                    i11 = m0.f61178v;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new a((ConstraintLayout) view, textView, button, lottieAnimationView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(n0.f61182a, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f7054a;
    }
}