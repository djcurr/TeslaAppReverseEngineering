package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class Stripe3ds2TransactionLayoutBinding implements a {
    public final FragmentContainerView fragmentContainer;
    private final FragmentContainerView rootView;

    private Stripe3ds2TransactionLayoutBinding(FragmentContainerView fragmentContainerView, FragmentContainerView fragmentContainerView2) {
        this.rootView = fragmentContainerView;
        this.fragmentContainer = fragmentContainerView2;
    }

    public static Stripe3ds2TransactionLayoutBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        FragmentContainerView fragmentContainerView = (FragmentContainerView) view;
        return new Stripe3ds2TransactionLayoutBinding(fragmentContainerView, fragmentContainerView);
    }

    public static Stripe3ds2TransactionLayoutBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static Stripe3ds2TransactionLayoutBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_3ds2_transaction_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public FragmentContainerView getRoot() {
        return this.rootView;
    }
}