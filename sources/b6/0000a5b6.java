package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class NV12Buffer implements VideoFrame.Buffer {
    private final ByteBuffer buffer;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int sliceHeight;
    private final int stride;
    private final int width;

    public NV12Buffer(int i11, int i12, int i13, int i14, ByteBuffer byteBuffer, Runnable runnable) {
        this.width = i11;
        this.height = i12;
        this.stride = i13;
        this.sliceHeight = i14;
        this.buffer = byteBuffer;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    private static native void nativeCropAndScale(int i11, int i12, int i13, int i14, int i15, int i16, ByteBuffer byteBuffer, int i17, int i18, int i19, int i21, ByteBuffer byteBuffer2, int i22, ByteBuffer byteBuffer3, int i23, ByteBuffer byteBuffer4, int i24);

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16) {
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i15, i16);
        nativeCropAndScale(i11, i12, i13, i14, i15, i16, this.buffer, this.width, this.height, this.stride, this.sliceHeight, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV());
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