package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import com.stripe.android.paymentsheet.R;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class FragmentPaymentsheetLoadingBinding implements a {
    private final FrameLayout rootView;

    private FragmentPaymentsheetLoadingBinding(FrameLayout frameLayout) {
        this.rootView = frameLayout;
    }

    public static FragmentPaymentsheetLoadingBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new FragmentPaymentsheetLoadingBinding((FrameLayout) view);
    }

    public static FragmentPaymentsheetLoadingBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaymentsheetLoadingBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_loading, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}