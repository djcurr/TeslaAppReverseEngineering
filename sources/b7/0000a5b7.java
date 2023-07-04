package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class NV21Buffer implements VideoFrame.Buffer {
    private final byte[] data;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int width;

    public NV21Buffer(byte[] bArr, int i11, int i12, Runnable runnable) {
        this.data = bArr;
        this.width = i11;
        this.height = i12;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i11, int i12, int i13, int i14, int i15, int i16, byte[] bArr, int i17, int i18, ByteBuffer byteBuffer, int i19, ByteBuffer byteBuffer2, int i21, ByteBuffer byteBuffer3, int i22);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i15, i16);
        nativeCropAndScale(i11, i12, i13, i14, i15, i16, this.data, this.width, this.height, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
        return allocate;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getWidth() {
        return this.width;
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void release() {
        this.refCountDelegate.release();
    }

    @Override // org.webrtc.VideoFrame.Buffer, org.webrtc.RefCounted
    public void retain() {
        this.refCountDelegate.retain();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.I420Buffer toI420() {
        int i11 = this.width;
        int i12 = this.height;
        return (VideoFrame.I420Buffer) cropAndScale(0, 0, i11, i12, i11, i12);
    }
}