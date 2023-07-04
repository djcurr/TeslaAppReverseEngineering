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
public final class GooglePayRowBinding implements a {
    public final AppCompatImageView checkIcon;
    public final AppCompatTextView label;
    private final LinearLayout rootView;

    private GooglePayRowBinding(LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView) {
        this.rootView = linearLayout;
        this.checkIcon = appCompatImageView;
        this.label = appCompatTextView;
    }

    public static GooglePayRowBinding bind(View view) {
        int i11 = R.id.check_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = R.id.label;
            AppCompatTextView appCompatTextView = (AppCompatTextView) b.a(view, i11);
            if (appCompatTextView != null) {
                return new GooglePayRowBinding((LinearLayout) view, appCompatImageView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static GooglePayRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static GooglePayRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.google_pay_row, viewGroup, false);
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