package com.stripe.android.core.storage;

/* loaded from: classes2.dex */
public interface Storage {
    boolean clear();

    boolean getBoolean(String str, boolean z11);

    float getFloat(String str, float f11);

    int getInt(String str, int i11);

    long getLong(String str, long j11);

    String getString(String str, String str2);

    boolean remove(String str);

    boolean storeValue(String str, float f11);

    boolean storeValue(String str, int i11);

    boolean storeValue(String str, long j11);

    boolean storeValue(String str, String str2);

    boolean storeValue(String str, boolean z11);
}