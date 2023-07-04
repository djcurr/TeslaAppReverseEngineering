package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import b5.a;
import com.stripe.android.R;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class CountryTextViewBinding implements a {
    private final TextView rootView;

    private CountryTextViewBinding(TextView textView) {
        this.rootView = textView;
    }

    public static CountryTextViewBinding bind(View view) {
        Objects.requireNonNull(view, "rootView");
        return new CountryTextViewBinding((TextView) view);
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static CountryTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.country_text_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public TextView getRoot() {
        return this.rootView;
    }
}