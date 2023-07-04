package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidSearchView;

/* loaded from: classes2.dex */
public final class pa implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f19224a;

    /* renamed from: b  reason: collision with root package name */
    public final RecyclerView f19225b;

    /* renamed from: c  reason: collision with root package name */
    public final PlaidSearchView f19226c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f19227d;

    public pa(LinearLayout linearLayout, RecyclerView recyclerView, PlaidSearchView plaidSearchView, PlaidNavigationBar plaidNavigationBar, TextView textView) {
        this.f19224a = linearLayout;
        this.f19225b = recyclerView;
        this.f19226c = plaidSearchView;
        this.f19227d = textView;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19224a;
    }
}