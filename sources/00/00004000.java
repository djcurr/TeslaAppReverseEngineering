package com.plaid.internal;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.plaid.internal.core.ui_components.PlaidInput;
import com.plaid.internal.core.ui_components.PlaidInstitutionHeaderItem;
import com.plaid.internal.core.ui_components.PlaidNavigationBar;
import com.plaid.internal.core.ui_components.PlaidPrimaryButton;
import com.plaid.internal.core.ui_components.PlaidTertiaryButton;

/* loaded from: classes2.dex */
public final class c9 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final LinearLayout f18250a;

    /* renamed from: b  reason: collision with root package name */
    public final TextView f18251b;

    /* renamed from: c  reason: collision with root package name */
    public final TextView f18252c;

    /* renamed from: d  reason: collision with root package name */
    public final TextView f18253d;

    /* renamed from: e  reason: collision with root package name */
    public final PlaidInput f18254e;

    /* renamed from: f  reason: collision with root package name */
    public final PlaidInput f18255f;

    /* renamed from: g  reason: collision with root package name */
    public final PlaidInput f18256g;

    /* renamed from: h  reason: collision with root package name */
    public final LinearLayout f18257h;

    /* renamed from: i  reason: collision with root package name */
    public final PlaidInstitutionHeaderItem f18258i;

    /* renamed from: j  reason: collision with root package name */
    public final PlaidPrimaryButton f18259j;

    /* renamed from: k  reason: collision with root package name */
    public final LinearLayout f18260k;

    /* renamed from: l  reason: collision with root package name */
    public final PlaidTertiaryButton f18261l;

    public c9(LinearLayout linearLayout, TextView textView, TextView textView2, TextView textView3, PlaidInput plaidInput, PlaidInput plaidInput2, PlaidInput plaidInput3, LinearLayout linearLayout2, PlaidInstitutionHeaderItem plaidInstitutionHeaderItem, PlaidNavigationBar plaidNavigationBar, PlaidPrimaryButton plaidPrimaryButton, LinearLayout linearLayout3, PlaidTertiaryButton plaidTertiaryButton) {
        this.f18250a = linearLayout;
        this.f18251b = textView;
        this.f18252c = textView2;
        this.f18253d = textView3;
        this.f18254e = plaidInput;
        this.f18255f = plaidInput2;
        this.f18256g = plaidInput3;
        this.f18257h = linearLayout2;
        this.f18258i = plaidInstitutionHeaderItem;
        this.f18259j = plaidPrimaryButton;
        this.f18260k = linearLayout3;
        this.f18261l = plaidTertiaryButton;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f18250a;
    }
}