package com.stripe.android.ui.core.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentContainerView;
import b5.a;
import b5.b;
import com.stripe.android.ui.core.R;

/* loaded from: classes6.dex */
public final class ActivityCardScanBinding implements a {
    public final FragmentContainerView fragmentContainer;
    private final ConstraintLayout rootView;

    private ActivityCardScanBinding(ConstraintLayout constraintLayout, FragmentContainerView fragmentContainerView) {
        this.rootView = constraintLayout;
        this.fragmentContainer = fragmentContainerView;
    }

    public static ActivityCardScanBinding bind(View view) {
        int i11 = R.id.fragment_container;
        FragmentContainerView fragmentContainerView = (FragmentContainerView) b.a(view, i11);
        if (fragmentContainerView != null) {
            return new ActivityCardScanBinding((ConstraintLayout) view, fragmentContainerView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ActivityCardScanBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityCardScanBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.activity_card_scan, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // b5.a
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}