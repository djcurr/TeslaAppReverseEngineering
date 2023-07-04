package com.facebook.react.bridge;

/* loaded from: classes3.dex */
public interface WritableArray extends ReadableArray {
    void pushArray(ReadableArray readableArray);

    void pushBoolean(boolean z11);

    void pushDouble(double d11);

    void pushInt(int i11);

    void pushMap(ReadableMap readableMap);

    void pushNull();

    void pushString(String str);
}