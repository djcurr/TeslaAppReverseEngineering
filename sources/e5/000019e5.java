package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactApplicationContext;

@Deprecated
/* loaded from: classes3.dex */
public class s0 {
    /* JADX INFO: Access modifiers changed from: package-private */
    public r0 a(ReactApplicationContext reactApplicationContext, d1 d1Var, com.facebook.react.uimanager.events.d dVar, int i11) {
        com.facebook.systrace.a.c(0L, "UIImplementationProvider.createUIImplementation[3]");
        try {
            return new r0(reactApplicationContext, d1Var, dVar, i11);
        } finally {
            com.facebook.systrace.a.g(0L);
        }
    }
}