package com.facebook.react.bridge;

import xf.a;

@a
/* loaded from: classes3.dex */
public interface NativeModule {

    /* loaded from: classes3.dex */
    public interface NativeMethod {
        String getType();

        void invoke(JSInstance jSInstance, ReadableArray readableArray);
    }

    boolean canOverrideExistingModule();

    String getName();

    void initialize();

    void invalidate();

    void onCatalystInstanceDestroy();
}