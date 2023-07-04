package com.plaid.internal;

import android.view.View;
import com.plaid.core.webview.PlaidWebview;

/* loaded from: classes2.dex */
public final class va implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final PlaidWebview f19628a;

    /* renamed from: b  reason: collision with root package name */
    public final PlaidWebview f19629b;

    public va(PlaidWebview plaidWebview, PlaidWebview plaidWebview2) {
        this.f19628a = plaidWebview;
        this.f19629b = plaidWebview2;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19628a;
    }
}