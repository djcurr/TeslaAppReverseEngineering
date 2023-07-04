package com.facebook.react.bridge;

/* loaded from: classes3.dex */
public interface WritableMap extends ReadableMap {
    WritableMap copy();

    void merge(ReadableMap readableMap);

    void putArray(String str, ReadableArray readableArray);

    void putBoolean(String str, boolean z11);

    void putDouble(String str, double d11);

    void putInt(String str, int i11);

    void putMap(String str, ReadableMap readableMap);

    void putNull(String str);

    void putString(String str, String str2);
}