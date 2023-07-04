package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import b5.a;
import b5.b;
import com.stripe.android.R;

/* loaded from: classes2.dex */
public final class BankListPaymentMethodBinding implements a {
    public final RecyclerView bankList;
    private final LinearLayout rootView;

    private BankListPaymentMethodBinding(LinearLayout linearLayout, RecyclerView recyclerView) {
        this.rootView = linearLayout;
        this.bankList = recyclerView;
    }

    public static BankListPaymentMethodBinding bind(View view) {
        int i11 = R.id.bank_list;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i11);
        if (recyclerView != null) {
            return new BankListPaymentMethodBinding((LinearLayout) view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static BankListPaymentMethodBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BankListPaymentMethodBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.bank_list_payment_method, viewGroup, false);
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