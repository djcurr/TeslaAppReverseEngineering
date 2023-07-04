package com.facebook.animated.gif;

import android.graphics.Bitmap;
import bf.d;

/* loaded from: classes.dex */
public class GifFrame implements d {
    @md.d
    private long mNativeContext;

    @md.d
    GifFrame(long j11) {
        this.mNativeContext = j11;
    }

    @md.d
    private native void nativeDispose();

    @md.d
    private native void nativeFinalize();

    @md.d
    private native int nativeGetDisposalMode();

    @md.d
    private native int nativeGetDurationMs();

    @md.d
    private native int nativeGetHeight();

    @md.d
    private native int nativeGetTransparentPixelColor();

    @md.d
    private native int nativeGetWidth();

    @md.d
    private native int nativeGetXOffset();

    @md.d
    private native int nativeGetYOffset();

    @md.d
    private native boolean nativeHasTransparency();

    @md.d
    private native void nativeRenderFrame(int i11, int i12, Bitmap bitmap);

    @Override // bf.d
    public void a(int i11, int i12, Bitmap bitmap) {
        nativeRenderFrame(i11, i12, bitmap);
    }

    @Override // bf.d
    public int b() {
        return nativeGetXOffset();
    }

    @Override // bf.d
    public int c() {
        return nativeGetYOffset();
    }

    public int d() {
        return nativeGetDisposalMode();
    }

    @Override // bf.d
    public void dispose() {
        nativeDispose();
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // bf.d
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // bf.d
    public int getWidth() {
        return nativeGetWidth();
    }
}