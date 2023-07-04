package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.stripe3ds2.R;

/* loaded from: classes6.dex */
public final class StripeProgressViewLayoutBinding implements a {
    public final ImageView brandLogo;
    public final CircularProgressIndicator progressBar;
    private final LinearLayout rootView;

    private StripeProgressViewLayoutBinding(LinearLayout linearLayout, ImageView imageView, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = linearLayout;
        this.brandLogo = imageView;
        this.progressBar = circularProgressIndicator;
    }

    public static StripeProgressViewLayoutBinding bind(View view) {
        int i11 = R.id.brand_logo;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = R.id.progress_bar;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, i11);
            if (circularProgressIndicator != null) {
                return new StripeProgressViewLayoutBinding((LinearLayout) view, imageView, circularProgressIndicator);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeProgressViewLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_progress_view_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public LinearLayout getRoot() {
        return this.rootView;
    }
}