package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import gw.j;
import gw.k;

/* loaded from: classes6.dex */
public final class c implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29455a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f29456b;

    private c(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView) {
        this.f29455a = constraintLayout;
        this.f29456b = lottieAnimationView;
    }

    public static c a(View view) {
        int i11 = j.f28412j;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b5.b.a(view, i11);
        if (lottieAnimationView != null) {
            return new c((ConstraintLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static c c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(k.f28428c, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29455a;
    }
}