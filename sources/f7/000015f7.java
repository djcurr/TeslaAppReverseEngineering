package com.facebook.animated.gif;

import android.graphics.Bitmap;
import bf.b;
import bf.c;
import java.nio.ByteBuffer;
import md.d;
import md.k;
import p001if.b;
import yg.a;

@d
/* loaded from: classes.dex */
public class GifImage implements c, cf.c {

    /* renamed from: b  reason: collision with root package name */
    private static volatile boolean f11052b;

    /* renamed from: a  reason: collision with root package name */
    private Bitmap.Config f11053a = null;
    @d
    private long mNativeContext;

    @d
    public GifImage() {
    }

    public static GifImage k(ByteBuffer byteBuffer, b bVar) {
        m();
        byteBuffer.rewind();
        GifImage nativeCreateFromDirectByteBuffer = nativeCreateFromDirectByteBuffer(byteBuffer, bVar.f30362b, bVar.f30366f);
        nativeCreateFromDirectByteBuffer.f11053a = bVar.f30368h;
        return nativeCreateFromDirectByteBuffer;
    }

    public static GifImage l(long j11, int i11, b bVar) {
        m();
        k.b(Boolean.valueOf(j11 != 0));
        GifImage nativeCreateFromNativeMemory = nativeCreateFromNativeMemory(j11, i11, bVar.f30362b, bVar.f30366f);
        nativeCreateFromNativeMemory.f11053a = bVar.f30368h;
        return nativeCreateFromNativeMemory;
    }

    private static synchronized void m() {
        synchronized (GifImage.class) {
            if (!f11052b) {
                f11052b = true;
                a.d("gifimage");
            }
        }
    }

    private static b.EnumC0150b n(int i11) {
        if (i11 == 0) {
            return b.EnumC0150b.DISPOSE_DO_NOT;
        }
        if (i11 == 1) {
            return b.EnumC0150b.DISPOSE_DO_NOT;
        }
        if (i11 == 2) {
            return b.EnumC0150b.DISPOSE_TO_BACKGROUND;
        }
        if (i11 == 3) {
            return b.EnumC0150b.DISPOSE_TO_PREVIOUS;
        }
        return b.EnumC0150b.DISPOSE_DO_NOT;
    }

    @d
    private static native GifImage nativeCreateFromDirectByteBuffer(ByteBuffer byteBuffer, int i11, boolean z11);

    @d
    private static native GifImage nativeCreateFromFileDescriptor(int i11, int i12, boolean z11);

    @d
    private static native GifImage nativeCreateFromNativeMemory(long j11, int i11, int i12, boolean z11);

    @d
    private native void nativeDispose();

    @d
    private native void nativeFinalize();

    @d
    private native int nativeGetDuration();

    @d
    private native GifFrame nativeGetFrame(int i11);

    @d
    private native int nativeGetFrameCount();

    @d
    private native int[] nativeGetFrameDurations();

    @d
    private native int nativeGetHeight();

    @d
    private native int nativeGetLoopCount();

    @d
    private native int nativeGetSizeInBytes();

    @d
    private native int nativeGetWidth();

    @d
    private native boolean nativeIsAnimated();

    @Override // bf.c
    public int a() {
        return nativeGetFrameCount();
    }

    @Override // bf.c
    public int b() {
        int nativeGetLoopCount = nativeGetLoopCount();
        if (nativeGetLoopCount != -1) {
            if (nativeGetLoopCount != 0) {
                return nativeGetLoopCount + 1;
            }
            return 0;
        }
        return 1;
    }

    @Override // bf.c
    public bf.b c(int i11) {
        GifFrame i12 = i(i11);
        try {
            return new bf.b(i11, i12.b(), i12.c(), i12.getWidth(), i12.getHeight(), b.a.BLEND_WITH_PREVIOUS, n(i12.d()));
        } finally {
            i12.dispose();
        }
    }

    @Override // cf.c
    public c d(ByteBuffer byteBuffer, p001if.b bVar) {
        return k(byteBuffer, bVar);
    }

    @Override // cf.c
    public c e(long j11, int i11, p001if.b bVar) {
        return l(j11, i11, bVar);
    }

    @Override // bf.c
    public boolean f() {
        return false;
    }

    protected void finalize() {
        nativeFinalize();
    }

    @Override // bf.c
    public int g() {
        return nativeGetSizeInBytes();
    }

    @Override // bf.c
    public int getHeight() {
        return nativeGetHeight();
    }

    @Override // bf.c
    public int getWidth() {
        return nativeGetWidth();
    }

    @Override // bf.c
    public Bitmap.Config h() {
        return this.f11053a;
    }

    @Override // bf.c
    public int[] j() {
        return nativeGetFrameDurations();
    }

    @Override // bf.c
    /* renamed from: o */
    public GifFrame i(int i11) {
        return nativeGetFrame(i11);
    }

    @d
    GifImage(long j11) {
        this.mNativeContext = j11;
    }
}