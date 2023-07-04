package com.facebook.react.fabric;

import com.facebook.react.bridge.NativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

/* loaded from: classes3.dex */
public abstract class c extends a.AbstractC0228a {

    /* renamed from: a  reason: collision with root package name */
    private final NativeModuleCallExceptionHandler f11857a;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public c(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    @Override // com.facebook.react.modules.core.a.AbstractC0228a
    public final void doFrame(long j11) {
        try {
            doFrameGuarded(j11);
        } catch (RuntimeException e11) {
            this.f11857a.handleException(e11);
        }
    }

    protected abstract void doFrameGuarded(long j11);

    protected c(NativeModuleCallExceptionHandler nativeModuleCallExceptionHandler) {
        this.f11857a = nativeModuleCallExceptionHandler;
    }
}