package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b5.a;
import b5.b;
import com.stripe.android.paymentsheet.R;

/* loaded from: classes6.dex */
public final class FragmentPaymentsheetPaymentMethodsListBinding implements a {
    public final RecyclerView recycler;
    private final LinearLayout rootView;

    private FragmentPaymentsheetPaymentMethodsListBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.recycler = recyclerView;
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding bind(View view) {
        int i11 = R.id.recycler;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i11);
        if (recyclerView != null) {
            return new FragmentPaymentsheetPaymentMethodsListBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static FragmentPaymentsheetPaymentMethodsListBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fragment_paymentsheet_payment_methods_list, viewGroup, false);
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