package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;

/* loaded from: classes2.dex */
public final class ga implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18668a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18669b;

    /* renamed from: c  reason: collision with root package name */
    public final LinearLayout f18670c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18671d;

    /* renamed from: e  reason: collision with root package name */
    public final AppCompatImageView f18672e;

    /* renamed from: f  reason: collision with root package name */
    public final AppCompatImageView f18673f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidPrimaryButton f18674g;

    public ga(LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView, LinearLayout linearLayout3, TextView textView2, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton) {
        this.f18668a = linearLayout;
        this.f18669b = textView;
        this.f18670c = linearLayout3;
        this.f18671d = textView2;
        this.f18672e = appCompatImageView;
        this.f18673f = appCompatImageView2;
        this.f18674g = plaidPrimaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18668a;
    }
}