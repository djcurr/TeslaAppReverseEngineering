package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import b5.a;
import b5.b;
import com.stripe.android.R;

/* loaded from: classes2.dex */
public final class AddPaymentMethodActivityBinding implements a {
    public final LinearLayout root;
    private final ScrollView rootView;

    private AddPaymentMethodActivityBinding(ScrollView scrollView, LinearLayout linearLayout) {
        this.rootView = scrollView;
        this.root = linearLayout;
    }

    public static AddPaymentMethodActivityBinding bind(View view) {
        int i11 = R.id.root;
        LinearLayout linearLayout = (LinearLayout) b.a(view, i11);
        if (linearLayout != null) {
            return new AddPaymentMethodActivityBinding((ScrollView) view, linearLayout);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static AddPaymentMethodActivityBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.add_payment_method_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public ScrollView getRoot() {
        return this.rootView;
    }
}