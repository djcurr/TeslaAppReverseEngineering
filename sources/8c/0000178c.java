package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes3.dex */
abstract class d {

    /* renamed from: a  reason: collision with root package name */
    boolean f11719a = false;

    /* renamed from: b  reason: collision with root package name */
    s f11720b;

    /* renamed from: c  reason: collision with root package name */
    Callback f11721c;

    /* renamed from: d  reason: collision with root package name */
    int f11722d;

    public void a(ReadableMap readableMap) {
        throw new JSApplicationCausedNativeException("Animation config for " + getClass().getSimpleName() + " cannot be reset");
    }

    public abstract void b(long j11);
}