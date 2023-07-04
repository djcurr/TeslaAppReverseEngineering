package rv;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Guideline;
import androidx.core.widget.NestedScrollView;
import qv.r;
import qv.s;

/* loaded from: classes6.dex */
public final class c implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final NestedScrollView f49685a;

    /* renamed from: b  reason: collision with root package name */
    public final Button f49686b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f49687c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f49688d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f49689e;

    private c(NestedScrollView nestedScrollView, Button button, LinearLayout linearLayout, TextView textView, Guideline guideline, Guideline guideline2, NestedScrollView nestedScrollView2, TextView textView2) {
        this.f49685a = nestedScrollView;
        this.f49686b = button;
        this.f49687c = linearLayout;
        this.f49688d = textView;
        this.f49689e = textView2;
    }

    public static c a(View view) {
        int i11 = r.f48656k;
        Button button = (Button) b5.b.a(view, i11);
        if (button != null) {
            i11 = r.f48659n;
            LinearLayout linearLayout = (LinearLayout) b5.b.a(view, i11);
            if (linearLayout != null) {
                i11 = r.f48660o;
                TextView textView = (TextView) b5.b.a(view, i11);
                if (textView != null) {
                    i11 = r.f48664s;
                    Guideline guideline = (Guideline) b5.b.a(view, i11);
                    if (guideline != null) {
                        i11 = r.f48669x;
                        Guideline guideline2 = (Guideline) b5.b.a(view, i11);
                        if (guideline2 != null) {
                            NestedScrollView nestedScrollView = (NestedScrollView) view;
                            i11 = r.f48670y;
                            TextView textView2 = (TextView) b5.b.a(view, i11);
                            if (textView2 != null) {
                                return new c(nestedScrollView, button, linearLayout, textView, guideline, guideline2, nestedScrollView, textView2);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static c c(LayoutInflater layoutInflater) {
        return d(layoutInflater, null, false);
    }

    public static c d(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(s.f48674c, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public NestedScrollView getRoot() {
        return this.f49685a;
    }
}