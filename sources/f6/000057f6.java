package com.stripe.android.stripe3ds2.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import b5.a;
import b5.b;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.R;

/* loaded from: classes6.dex */
public final class StripeChallengeZoneTextViewBinding implements a {
    public final TextInputLayout label;
    private final TextInputLayout rootView;
    public final TextInputEditText textEntry;

    private StripeChallengeZoneTextViewBinding(TextInputLayout textInputLayout, TextInputLayout textInputLayout2, TextInputEditText textInputEditText) {
        this.rootView = textInputLayout;
        this.label = textInputLayout2;
        this.textEntry = textInputEditText;
    }

    public static StripeChallengeZoneTextViewBinding bind(View view) {
        TextInputLayout textInputLayout = (TextInputLayout) view;
        int i11 = R.id.text_entry;
        TextInputEditText textInputEditText = (TextInputEditText) b.a(view, i11);
        if (textInputEditText != null) {
            return new StripeChallengeZoneTextViewBinding(textInputLayout, textInputLayout, textInputEditText);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static StripeChallengeZoneTextViewBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.stripe_challenge_zone_text_view, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public TextInputLayout getRoot() {
        return this.rootView;
    }
}