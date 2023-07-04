package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import yg.a;

@DoNotStrip
/* loaded from: classes3.dex */
public class ThreadScopeSupport {
    static {
        a.d("fbjni");
    }

    @DoNotStrip
    private static void runStdFunction(long j11) {
        runStdFunctionImpl(j11);
    }

    private static native void runStdFunctionImpl(long j11);
}