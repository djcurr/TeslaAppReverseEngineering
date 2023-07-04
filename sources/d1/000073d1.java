package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import gw.j;
import gw.k;

/* loaded from: classes6.dex */
public final class f implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29467a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f29468b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f29469c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29470d;

    private f(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, TextView textView, TextView textView2) {
        this.f29467a = constraintLayout;
        this.f29468b = lottieAnimationView;
        this.f29469c = textView;
        this.f29470d = textView2;
    }

    public static f a(View view) {
        int i11 = j.f28412j;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b5.b.a(view, i11);
        if (lottieAnimationView != null) {
            i11 = j.f28422t;
            TextView textView = (TextView) b5.b.a(view, i11);
            if (textView != null) {
                i11 = j.f28423u;
                TextView textView2 = (TextView) b5.b.a(view, i11);
                if (textView2 != null) {
                    return new f((ConstraintLayout) view, lottieAnimationView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static f c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(k.f28431f, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29467a;
    }
}