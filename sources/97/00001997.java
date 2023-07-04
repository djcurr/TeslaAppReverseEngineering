package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* loaded from: classes3.dex */
public abstract class f extends a.AbstractC0228a {
    private final ReactContext mReactContext;

    /* JADX INFO: Access modifiers changed from: protected */
    public f(ReactContext reactContext) {
        this.mReactContext = reactContext;
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0228a
    public final void doFrame(long j11) {
        try {
            doFrameGuarded(j11);
        } catch (RuntimeException e11) {
            this.mReactContext.handleException(e11);
        }
    }

    protected abstract void doFrameGuarded(long j11);
}