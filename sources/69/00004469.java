package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;

/* loaded from: classes2.dex */
public final class k8 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18930a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18931b;

    /* renamed from: c  reason: collision with root package name */
    public final RecyclerView f18932c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18933d;

    /* renamed from: e  reason: collision with root package name */
    public final TextView f18934e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18935f;

    public k8(LinearLayout linearLayout, TextView textView, RecyclerView recyclerView, TextView textView2, TextView textView3, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar) {
        this.f18930a = linearLayout;
        this.f18931b = textView;
        this.f18932c = recyclerView;
        this.f18933d = textView2;
        this.f18934e = textView3;
        this.f18935f = plaidInstitutionHeaderItem;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18930a;
    }
}