package xu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import wu.b;
import wu.c;

/* loaded from: classes6.dex */
public final class a implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    private final FrameLayout f57727a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f57728b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f57729c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f57730d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f57731e;

    private a(FrameLayout frameLayout, TextView textView, ImageView imageView, ProgressBar progressBar, TextView textView2) {
        this.f57727a = frameLayout;
        this.f57728b = textView;
        this.f57729c = imageView;
        this.f57730d = progressBar;
        this.f57731e = textView2;
    }

    public static a a(View view) {
        int i11 = b.f56181a;
        TextView textView = (TextView) b5.b.a(view, i11);
        if (textView != null) {
            i11 = b.f56182b;
            ImageView imageView = (ImageView) b5.b.a(view, i11);
            if (imageView != null) {
                i11 = b.f56183c;
                ProgressBar progressBar = (ProgressBar) b5.b.a(view, i11);
                if (progressBar != null) {
                    i11 = b.f56184d;
                    TextView textView2 = (TextView) b5.b.a(view, i11);
                    if (textView2 != null) {
                        return new a((FrameLayout) view, textView, imageView, progressBar, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static a c(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(c.share_popup, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return a(inflate);
    }

    @Override // b5.a
    /* renamed from: b */
    public FrameLayout getRoot() {
        return this.f57727a;
    }
}