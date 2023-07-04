package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class StripeVerticalDividerBinding implements a {
    private final View rootView;

    private StripeVerticalDividerBinding(View view) {
        this.rootView = view;
    }

    public static StripeVerticalDividerBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new StripeVerticalDividerBinding(view);
    }

    public static StripeVerticalDividerBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }

    public static StripeVerticalDividerBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_vertical_divider, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }
}