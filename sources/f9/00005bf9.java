package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;

/* loaded from: classes6.dex */
public final class AddPaymentMethodRowView extends FrameLayout {
    private final AppCompatTextView label;
    private final AddPaymentMethodRowBinding viewBinding;

    private AddPaymentMethodRowView(Context context) {
        super(context);
        AddPaymentMethodRowBinding inflate = AddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), this, true);
        kotlin.jvm.internal.s.f(inflate, "inflate(\n        LayoutI… this,\n        true\n    )");
        this.viewBinding = inflate;
        AppCompatTextView appCompatTextView = inflate.label;
        kotlin.jvm.internal.s.f(appCompatTextView, "viewBinding.label");
        this.label = appCompatTextView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setFocusable(true);
        setClickable(true);
    }

    public final AppCompatTextView getLabel$payments_core_release() {
        return this.label;
    }
}