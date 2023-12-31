package com.facebook.react.bridge;

/* loaded from: classes3.dex */
public class DefaultNativeModuleCallExceptionHandler implements NativeModuleCallExceptionHandler {
    @Override // com.facebook.react.bridge.NativeModuleCallExceptionHandler
    public void handleException(Exception exc) {
        if (exc instanceof RuntimeException) {
            throw ((RuntimeException) exc);
        }
        throw new RuntimeException(exc);
    }
}