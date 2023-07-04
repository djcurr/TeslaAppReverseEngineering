package com.plaid.internal;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidSecondaryButton;

/* loaded from: classes2.dex */
public final class n8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19068a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f19069b;

    /* renamed from: c  reason: collision with root package name */
    public final ImageView f19070c;

    /* renamed from: d  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f19071d;

    /* renamed from: e  reason: collision with root package name */
    public final PlaidPrimaryButton f19072e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidSecondaryButton f19073f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f19074g;

    /* renamed from: h  reason: collision with root package name */
    public final TextView f19075h;

    public n8(LinearLayout linearLayout, TextView textView, ImageView imageView, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, LinearLayout linearLayout2, PlaidSecondaryButton plaidSecondaryButton, LinearLayout linearLayout3, TextView textView2) {
        this.f19068a = linearLayout;
        this.f19069b = textView;
        this.f19070c = imageView;
        this.f19071d = plaidInstitutionHeaderItem;
        this.f19072e = plaidPrimaryButton;
        this.f19073f = plaidSecondaryButton;
        this.f19074g = linearLayout3;
        this.f19075h = textView2;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19068a;
    }
}