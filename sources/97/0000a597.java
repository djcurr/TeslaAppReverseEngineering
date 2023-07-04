package org.webrtc;

import java.nio.ByteBuffer;
import org.webrtc.VideoFrame;

/* loaded from: classes4.dex */
public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private final RefCountDelegate refCountDelegate;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i11, int i12, ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, Runnable runnable) {
        this.width = i11;
        this.height = i12;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i13;
        this.strideU = i14;
        this.strideV = i15;
        this.refCountDelegate = new RefCountDelegate(runnable);
    }

    public static /* synthetic */ void a(ByteBuffer byteBuffer) {
        JniCommon.nativeFreeByteBuffer(byteBuffer);
    }

    public static JavaI420Buffer allocate(int i11, int i12) {
        int i13 = (i12 + 1) / 2;
        int i14 = (i11 + 1) / 2;
        int i15 = i11 * i12;
        int i16 = i15 + 0;
        int i17 = i14 * i13;
        int i18 = i16 + i17;
        final ByteBuffer nativeAllocateByteBuffer = JniCommon.nativeAllocateByteBuffer(i15 + (i14 * 2 * i13));
        ByteBuffer byteBuffer = (ByteBuffer) nativeAllocateByteBuffer.position(0);
        ByteBuffer byteBuffer2 = (ByteBuffer) nativeAllocateByteBuffer.limit(i16);
        ByteBuffer slice = nativeAllocateByteBuffer.slice();
        ByteBuffer byteBuffer3 = (ByteBuffer) nativeAllocateByteBuffer.position(i16);
        ByteBuffer byteBuffer4 = (ByteBuffer) nativeAllocateByteBuffer.limit(i18);
        ByteBuffer slice2 = nativeAllocateByteBuffer.slice();
        ByteBuffer byteBuffer5 = (ByteBuffer) nativeAllocateByteBuffer.position(i18);
        ByteBuffer byteBuffer6 = (ByteBuffer) nativeAllocateByteBuffer.limit(i18 + i17);
        return new JavaI420Buffer(i11, i12, slice, i11, slice2, i14, nativeAllocateByteBuffer.slice(), i14, new Runnable() { // from class: org.webrtc.d0
            @Override // java.lang.Runnable
            public final void run() {
                JavaI420Buffer.a(nativeAllocateByteBuffer);
            }
        });
    }

    private static void checkCapacity(ByteBuffer byteBuffer, int i11, int i12, int i13) {
        int i14 = (i13 * (i12 - 1)) + i11;
        if (byteBuffer.capacity() >= i14) {
            return;
        }
        int capacity = byteBuffer.capacity();
        throw new IllegalArgumentException("Buffer must be at least " + i14 + " bytes, but was " + capacity);
    }

    public static VideoFrame.Buffer cropAndScaleI420(final VideoFrame.I420Buffer i420Buffer, int i11, int i12, int i13, int i14, int i15, int i16) {
        if (i13 == i15 && i14 == i16) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            ByteBuffer byteBuffer = (ByteBuffer) dataY.position(i11 + (i420Buffer.getStrideY() * i12));
            int i17 = i11 / 2;
            int i18 = i12 / 2;
            ByteBuffer byteBuffer2 = (ByteBuffer) dataU.position((i420Buffer.getStrideU() * i18) + i17);
            ByteBuffer byteBuffer3 = (ByteBuffer) dataV.position(i17 + (i18 * i420Buffer.getStrideV()));
            i420Buffer.retain();
            return wrap(i15, i16, dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() { // from class: org.webrtc.e0
                @Override // java.lang.Runnable
                public final void run() {
                    VideoFrame.I420Buffer.this.release();
                }
            });
        }
        JavaI420Buffer allocate = allocate(i15, i16);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i11, i12, i13, i14, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i15, i16);
        return allocate;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i11, ByteBuffer byteBuffer2, int i12, ByteBuffer byteBuffer3, int i13, int i14, int i15, int i16, int i17, ByteBuffer byteBuffer4, int i18, ByteBuffer byteBuffer5, int i19, ByteBuffer byteBuffer6, int i21, int i22, int i23);

    public static JavaI420Buffer wrap(int i11, int i12, ByteBuffer byteBuffer, int i13, ByteBuffer byteBuffer2, int i14, ByteBuffer byteBuffer3, int i15, Runnable runnable) {
        if (byteBuffer != null && byteBuffer2 != null && byteBuffer3 != null) {
            if (byteBuffer.isDirect() && byteBuffer2.isDirect() && byteBuffer3.isDirect()) {
                ByteBuffer slice = byteBuffer.slice();
                ByteBuffer slice2 = byteBuffer2.slice();
                ByteBuffer slice3 = byteBuffer3.slice();
                int i16 = (i11 + 1) / 2;
                int i17 = (i12 + 1) / 2;
                checkCapacity(slice, i11, i12, i13);
                checkCapacity(slice2, i16, i17, i14);
                checkCapacity(slice3, i16, i17, i15);
                return new JavaI420Buffer(i11, i12, slice, i13, slice2, i14, slice3, i15, runnable);
            }
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        }
        throw new IllegalArgumentException("Data buffers cannot be null.");
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public VideoFrame.Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16) {
        return cropAndScaleI420(this, i11, i12, i13, i14, i15, i16);
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    @Override // org.webrtc.VideoFrame.Buffer
    public int getHeight() {
        return this.height;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideU() {
        return this.strideU;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideV() {
        return this.strideV;
    }

    @Override // org.webrtc.VideoFrame.I420Buffer
    public int getStrideY() {
        return this.strideY;
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
        retain();
        return this;
    }
}