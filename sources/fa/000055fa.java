package com.stripe.android.paymentsheet.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.compose.ui.platform.ComposeView;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.paymentsheet.R;
import java.util.Objects;

/* loaded from: classes6.dex */
public final class PrimaryButtonBinding implements a {
    public final ImageView confirmedIcon;
    public final CircularProgressIndicator confirmingIcon;
    public final ComposeView label;
    public final ImageView lockIcon;
    private final View rootView;

    private PrimaryButtonBinding(View view, ImageView imageView, CircularProgressIndicator circularProgressIndicator, ComposeView composeView, ImageView imageView2) {
        this.rootView = view;
        this.confirmedIcon = imageView;
        this.confirmingIcon = circularProgressIndicator;
        this.label = composeView;
        this.lockIcon = imageView2;
    }

    public static PrimaryButtonBinding bind(View view) {
        int i11 = R.id.confirmed_icon;
        ImageView imageView = (ImageView) b.a(view, i11);
        if (imageView != null) {
            i11 = R.id.confirming_icon;
            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, i11);
            if (circularProgressIndicator != null) {
                i11 = R.id.label;
                ComposeView composeView = (ComposeView) b.a(view, i11);
                if (composeView != null) {
                    i11 = R.id.lock_icon;
                    ImageView imageView2 = (ImageView) b.a(view, i11);
                    if (imageView2 != null) {
                        return new PrimaryButtonBinding(view, imageView, circularProgressIndicator, composeView, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static PrimaryButtonBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.primary_button, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}