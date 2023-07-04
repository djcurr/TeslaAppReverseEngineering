package hw;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.lottie.LottieAnimationView;
import gw.j;
import gw.k;

/* loaded from: classes6.dex */
public final class d implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final ConstraintLayout f29457a;

    /* renamed from: b  reason: collision with root package name */
    public final LottieAnimationView f29458b;

    /* renamed from: c  reason: collision with root package name */
    public final Button f29459c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f29460d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f29461e;

    private d(ConstraintLayout constraintLayout, LottieAnimationView lottieAnimationView, Button button, TextView textView, TextView textView2) {
        this.f29457a = constraintLayout;
        this.f29458b = lottieAnimationView;
        this.f29459c = button;
        this.f29460d = textView;
        this.f29461e = textView2;
    }

    public static d a(View view) {
        int i11 = j.f28411i;
        LottieAnimationView lottieAnimationView = (LottieAnimationView) b5.b.a(view, i11);
        if (lottieAnimationView != null) {
            i11 = j.f28417o;
            Button button = (Button) b5.b.a(view, i11);
            if (button != null) {
                i11 = j.f28420r;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    i11 = j.f28421s;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new d((ConstraintLayout) view, lottieAnimationView, button, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static d c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(k.f28429d, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public ConstraintLayout getRoot() {
        return this.f29457a;
    }
}