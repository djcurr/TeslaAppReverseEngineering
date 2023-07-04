package com.stripe.android.core.storage;

import android.content.Context;
import kotlin.jvm.internal.s;

/* loaded from: classes2.dex */
public final class StorageFactory {
    public static final StorageFactory INSTANCE = new StorageFactory();

    private StorageFactory() {
    }

    public final Storage getStorageInstance(Context context, String purpose) {
        s.g(context, "context");
        s.g(purpose, "purpose");
        Context applicationContext = context.getApplicationContext();
        s.f(applicationContext, "context.applicationContext");
        return new SharedPreferencesStorage(applicationContext, purpose);
    }
}