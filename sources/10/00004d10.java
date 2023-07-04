package com.stripe.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import b5.a;
import b5.b;
import com.stripe.android.R;
import com.stripe.android.view.MaskedCardView;

/* loaded from: classes2.dex */
public final class MaskedCardRowBinding implements a {
    public final MaskedCardView maskedCardItem;
    private final FrameLayout rootView;

    private MaskedCardRowBinding(FrameLayout frameLayout, MaskedCardView maskedCardView) {
        this.rootView = frameLayout;
        this.maskedCardItem = maskedCardView;
    }

    public static MaskedCardRowBinding bind(View view) {
        int i11 = R.id.masked_card_item;
        MaskedCardView maskedCardView = (MaskedCardView) b.a(view, i11);
        if (maskedCardView != null) {
            return new MaskedCardRowBinding((FrameLayout) view, maskedCardView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static MaskedCardRowBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static MaskedCardRowBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.masked_card_row, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public FrameLayout getRoot() {
        return this.rootView;
    }
}