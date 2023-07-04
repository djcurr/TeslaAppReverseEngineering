package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import b5.a;
import b5.b;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ShippingMethodViewBinding implements a {
    public final TextView description;
    public final TextView name;
    public final TextView price;
    private final View rootView;
    public final AppCompatImageView selectedIcon;

    private ShippingMethodViewBinding(View view, TextView textView, TextView textView2, TextView textView3, AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.description = textView;
        this.name = textView2;
        this.price = textView3;
        this.selectedIcon = appCompatImageView;
    }

    public static ShippingMethodViewBinding bind(View view) {
        int i11 = R.id.description;
        TextView textView = (TextView) b.a(view, i11);
        if (textView != null) {
            i11 = R.id.name;
            TextView textView2 = (TextView) b.a(view, i11);
            if (textView2 != null) {
                i11 = R.id.price;
                TextView textView3 = (TextView) b.a(view, i11);
                if (textView3 != null) {
                    i11 = R.id.selected_icon;
                    AppCompatImageView appCompatImageView = (AppCompatImageView) b.a(view, i11);
                    if (appCompatImageView != null) {
                        return new ShippingMethodViewBinding(view, textView, textView2, textView3, appCompatImageView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ShippingMethodViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.shipping_method_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}