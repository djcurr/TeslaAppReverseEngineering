package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import b5.a;
import b5.b;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CardWidgetProgressViewBinding implements a {
    public final ProgressBar cardLoading;
    private final View rootView;

    private CardWidgetProgressViewBinding(View view, ProgressBar progressBar) {
        this.rootView = view;
        this.cardLoading = progressBar;
    }

    public static CardWidgetProgressViewBinding bind(View view) {
        int i11 = R.id.card_loading;
        ProgressBar progressBar = (ProgressBar) b.a(view, i11);
        if (progressBar != null) {
            return new CardWidgetProgressViewBinding(view, progressBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static CardWidgetProgressViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        Objects.requireNonNull(viewGroup, "parent");
        layoutInflater.inflate(R.layout.card_widget_progress_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // b5.a
    public View getRoot() {
        return this.rootView;
    }
}