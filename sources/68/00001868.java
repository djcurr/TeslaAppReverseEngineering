package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;

/* loaded from: classes3.dex */
public interface HMRClient extends JavaScriptModule {
    void disable();

    void enable();

    void registerBundle(String str);

    void setup(String str, String str2, String str3, int i11, boolean z11);
}