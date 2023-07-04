package com.plaid.internal;

import android.view.View;
import com.plaid.internal.core.ui_components.PlaidListItemInstitution;

/* loaded from: classes2.dex */
public final class m9 implements b5.a {

    /* renamed from: a  reason: collision with root package name */
    public final PlaidListItemInstitution f19044a;

    /* renamed from: b  reason: collision with root package name */
    public final PlaidListItemInstitution f19045b;

    public m9(PlaidListItemInstitution plaidListItemInstitution, PlaidListItemInstitution plaidListItemInstitution2) {
        this.f19044a = plaidListItemInstitution;
        this.f19045b = plaidListItemInstitution2;
    }

    public PlaidListItemInstitution a() {
        return this.f19044a;
    }

    @Override // b5.a
    public View getRoot() {
        return this.f19044a;
    }
}