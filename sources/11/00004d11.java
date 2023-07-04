package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import b5.a;
import b5.b;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class MaskedCardViewBinding implements a {
    public final AppCompatImageView brandIcon;
    public final AppCompatImageView checkIcon;
    public final AppCompatTextView details;
    private final View rootView;

    private MaskedCardViewBinding(View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.brandIcon = appCompatImageView;
        this.checkIcon = appCompatImageView2;
        this.details = appCompatTextView;
    }

    public static MaskedCardViewBinding bind(View view) {
        int i11 = R.id.brand_icon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i11);
        if (appCompatImageView != null) {
            i11 = R.id.check_icon;
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) b.a(view, i11);
            if (appCompatImageView2 != null) {
                i11 = R.id.details;
                AppCompatTextView appCompatTextView = (AppCompatTextView) b.a(view, i11);
                if (appCompatTextView != null) {
                    return new MaskedCardViewBinding(view, appCompatImageView, appCompatImageView2, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static MaskedCardViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.masked_card_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}