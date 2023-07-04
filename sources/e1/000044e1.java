package com.plaid.internal;

import android.view.View;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;

/* loaded from: classes2.dex */
public final class o8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19168a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19169b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19170c;

    /* renamed from: d  reason: collision with root package name */
    public final ProgressBar f19171d;

    /* renamed from: e  reason: collision with root package name */
    public final ImageView f19172e;

    /* renamed from: f  reason: collision with root package name */
    public final WebView f19173f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidPrimaryButton f19174g;

    /* renamed from: h  reason: collision with root package name */
    public final PlaidSecondaryButton f19175h;

    public o8(LinearLayout linearLayout, TextView textView, LinearLayout linearLayout2, TextView textView2, ProgressBar progressBar, ImageView imageView, PlaidNavigationBar plaidNavigationBar, WebView webView, PlaidPrimaryButton plaidPrimaryButton, PlaidSecondaryButton plaidSecondaryButton) {
        this.f19168a = linearLayout;
        this.f19169b = textView;
        this.f19170c = textView2;
        this.f19171d = progressBar;
        this.f19172e = imageView;
        this.f19173f = webView;
        this.f19174g = plaidPrimaryButton;
        this.f19175h = plaidSecondaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19168a;
    }
}