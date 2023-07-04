package com.facebook.react.uimanager.events;

import com.facebook.react.bridge.WritableMap;

/* loaded from: classes3.dex */
public interface RCTModernEventEmitter extends RCTEventEmitter {
    void receiveEvent(int i11, int i12, String str, WritableMap writableMap);

    void receiveEvent(int i11, int i12, String str, boolean z11, int i13, WritableMap writableMap, int i14);

    void receiveTouches(j jVar);
}