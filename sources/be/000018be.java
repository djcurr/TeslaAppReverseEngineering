package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;

@xf.a
/* loaded from: classes3.dex */
public interface JSTimers extends JavaScriptModule {
    void callIdleCallbacks(double d11);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}