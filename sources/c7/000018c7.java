package com.facebook.react.modules.core;

import com.facebook.react.bridge.WritableArray;

/* loaded from: classes3.dex */
public interface c {
    void callIdleCallbacks(double d11);

    void callTimers(WritableArray writableArray);

    void emitTimeDriftWarning(String str);
}