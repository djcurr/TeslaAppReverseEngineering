package org.webrtc;

import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class JniCommon {
    public static native void nativeAddRef(long j11);

    public static native ByteBuffer nativeAllocateByteBuffer(int i11);

    public static native void nativeFreeByteBuffer(ByteBuffer byteBuffer);

    public static native void nativeReleaseRef(long j11);
}