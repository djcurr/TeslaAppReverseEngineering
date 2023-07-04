package uv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import tv.l;
import tv.m;

/* loaded from: classes6.dex */
public final class b implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f53727a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f53728b;

    private b(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView) {
        this.f53727a = constraintLayout;
        this.f53728b = lottieAnimationView;
    }

    public static b a(View view) {
        int i11 = l.f52626e;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b5.b.a(view, i11);
        if (lottieAnimationView != null) {
            return new b((ConstraintLayout) view, lottieAnimationView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static b c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(m.f52630b, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f53727a;
    }
}