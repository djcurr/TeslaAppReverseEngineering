package com.stripe.android.financialconnections.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import b5.a;
import b5.b;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.financialconnections.R;

/* loaded from: classes2.dex */
public final class ActivityFinancialconnectionsSheetBinding implements a {
    private final ConstraintLayout rootView;
    public final CircularProgressIndicator spinner;

    private ActivityFinancialconnectionsSheetBinding(ConstraintLayout constraintLayout, CircularProgressIndicator circularProgressIndicator) {
        this.rootView = constraintLayout;
        this.spinner = circularProgressIndicator;
    }

    public static ActivityFinancialconnectionsSheetBinding bind(View view) {
        int i11 = R.id.spinner;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) b.a(view, i11);
        if (circularProgressIndicator != null) {
            return new ActivityFinancialconnectionsSheetBinding((ConstraintLayout) view, circularProgressIndicator);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    public static ActivityFinancialconnectionsSheetBinding inflate(LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    public static ActivityFinancialconnectionsSheetBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.activity_financialconnections_sheet, viewGroup, false);
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