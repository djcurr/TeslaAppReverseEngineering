package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReadableArray;
import com.swmansion.reanimated.layoutReanimation.ReanimatedNativeHierarchyManager;

/* loaded from: classes3.dex */
public class h0 extends r0 {
    public h0(ReactApplicationContext reactApplicationContext, d1 d1Var, com.facebook.react.uimanager.events.d dVar, int i11) {
        super(reactApplicationContext, d1Var, new y0(reactApplicationContext, new ReanimatedNativeHierarchyManager(d1Var, reactApplicationContext), i11), dVar);
    }

    @Override // com.facebook.react.uimanager.r0
    public void u(int i11, ReadableArray readableArray, ReadableArray readableArray2, ReadableArray readableArray3, ReadableArray readableArray4, ReadableArray readableArray5) {
        super.u(i11, readableArray, readableArray2, readableArray3, readableArray4, readableArray5);
    }
}