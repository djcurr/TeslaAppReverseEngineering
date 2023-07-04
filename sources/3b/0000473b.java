package com.plaid.link.internal;

import android.app.Application;

/* loaded from: classes2.dex */
public interface PlaidComponentProvider<T> {
    T providePlaidComponent(Application application);
}