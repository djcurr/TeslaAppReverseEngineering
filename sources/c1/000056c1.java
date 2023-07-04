package com.stripe.android.paymentsheet.model;

import android.os.Parcelable;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes6.dex */
public abstract class ClientSecret implements Parcelable {
    private ClientSecret() {
    }

    public /* synthetic */ ClientSecret(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public abstract String getValue();

    public abstract void validate();
}