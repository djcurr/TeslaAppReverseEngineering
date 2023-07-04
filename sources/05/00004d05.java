package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import b5.a;
import b5.b;
import com.stripe.android.R;

/* loaded from: classes2.dex */
public final class BankItemBinding implements a {
    public final AppCompatImageView checkIcon;
    public final AppCompatImageView icon;
    public final AppCompatTextView name;
    private final LinearLayout rootView;

    private BankItemBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkIcon = appCompatImageView;
        this.icon = appCompatImageView2;
        this.name = appCompatTextView;
    }

    public static BankItemBinding bind(View view) {
        int i11 = R.id.check_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = R.id.icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.a(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R.id.name;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.a(view, i11);
                if (appCompatTextView != null) {
                    return new BankItemBinding((LinearLayout) view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static BankItemBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.bank_item, viewGroup, false);
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