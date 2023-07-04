package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;

/* loaded from: classes2.dex */
public final class h9 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18699a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f18700b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18701c;

    /* renamed from: d  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18702d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18703e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidPrimaryButton f18704f;

    /* renamed from: g  reason: collision with root package name */
    public final LinearLayout f18705g;

    public h9(LinearLayout linearLayout, RecyclerView recyclerView, TextView textView, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, TextView textView2, LinearLayout linearLayout2, PlaidPrimaryButton plaidPrimaryButton, LinearLayout linearLayout3) {
        this.f18699a = linearLayout;
        this.f18700b = recyclerView;
        this.f18701c = textView;
        this.f18702d = plaidInstitutionHeaderItem;
        this.f18703e = textView2;
        this.f18704f = plaidPrimaryButton;
        this.f18705g = linearLayout3;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18699a;
    }
}