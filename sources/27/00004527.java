package com.plaid.internal;

import android.view.View;
import android.webkit.WebView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;

/* loaded from: classes2.dex */
public final class q8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19312a;

    /* renamed from: b  reason: collision with root package name */
    public final WebView f19313b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f19314c;

    /* renamed from: d  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f19315d;

    public q8(LinearLayout linearLayout, WebView webView, TextView textView, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar) {
        this.f19312a = linearLayout;
        this.f19313b = webView;
        this.f19314c = textView;
        this.f19315d = plaidInstitutionHeaderItem;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19312a;
    }
}