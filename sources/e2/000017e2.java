package com.facebook.react.bridge;

import com.facebook.react.bridge.JSIModule;

/* loaded from: classes3.dex */
public interface JSIModuleProvider<T extends JSIModule> {
    T get();
}