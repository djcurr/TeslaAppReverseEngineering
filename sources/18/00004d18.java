package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import b5.a;
import b5.b;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class ShippingMethodWidgetBinding implements a {
    private final View rootView;
    public final RecyclerView shippingMethods;

    private ShippingMethodWidgetBinding(View view, RecyclerView recyclerView) {
        this.rootView = view;
        this.shippingMethods = recyclerView;
    }

    public static ShippingMethodWidgetBinding bind(View view) {
        int i11 = R.id.shipping_methods;
        RecyclerView recyclerView = (RecyclerView) b.a(view, i11);
        if (recyclerView != null) {
            return new ShippingMethodWidgetBinding(view, recyclerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ShippingMethodWidgetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.shipping_method_widget, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}