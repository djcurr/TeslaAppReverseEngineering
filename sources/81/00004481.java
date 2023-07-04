package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;

/* loaded from: classes2.dex */
public final class l9 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18978a;

    /* renamed from: b  reason: collision with root package name */
    public final PlaidSecondaryButton f18979b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18980c;

    public l9(LinearLayout linearLayout, PlaidSecondaryButton plaidSecondaryButton, TextView textView) {
        this.f18978a = linearLayout;
        this.f18979b = plaidSecondaryButton;
        this.f18980c = textView;
    }

    public LinearLayout a() {
        return this.f18978a;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18978a;
    }
}