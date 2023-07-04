package org.webrtc;

import android.graphics.Matrix;
import java.nio.ByteBuffer;
import org.spongycastle.crypto.tls.CipherSuite;

/* loaded from: classes4.dex */
public class VideoFrame implements RefCounted {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    /* loaded from: classes4.dex */
    public interface Buffer extends RefCounted {
        @CalledByNative("Buffer")
        Buffer cropAndScale(int i11, int i12, int i13, int i14, int i15, int i16);

        @CalledByNative("Buffer")
        default int getBufferType() {
            return 0;
        }

        @CalledByNative("Buffer")
        int getHeight();

        @CalledByNative("Buffer")
        int getWidth();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void release();

        @Override // org.webrtc.RefCounted
        @CalledByNative("Buffer")
        void retain();

        @CalledByNative("Buffer")
        I420Buffer toI420();
    }

    /* loaded from: classes4.dex */
    public interface I420Buffer extends Buffer {
        @Override // org.webrtc.VideoFrame.Buffer
        default int getBufferType() {
            return 1;
        }

        @CalledByNative("I420Buffer")
        ByteBuffer getDataU();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataV();

        @CalledByNative("I420Buffer")
        ByteBuffer getDataY();

        @CalledByNative("I420Buffer")
        int getStrideU();

        @CalledByNative("I420Buffer")
        int getStrideV();

        @CalledByNative("I420Buffer")
        int getStrideY();
    }

    /* loaded from: classes4.dex */
    public interface TextureBuffer extends Buffer {

        /* loaded from: classes4.dex */
        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            Type(int i11) {
                this.glTarget = i11;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        int getTextureId();

        Matrix getTransformMatrix();

        Type getType();
    }

    @CalledByNative
    public VideoFrame(Buffer buffer, int i11, long j11) {
        if (buffer != null) {
            if (i11 % 90 == 0) {
                this.buffer = buffer;
                this.rotation = i11;
                this.timestampNs = j11;
                return;
            }
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
        throw new IllegalArgumentException("buffer not allowed to be null");
    }

    @CalledByNative
    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        if (this.rotation % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256 == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    @CalledByNative
    public int getRotation() {
        return this.rotation;
    }

    @CalledByNative
    public long getTimestampNs() {
        return this.timestampNs;
    }

    @Override // org.webrtc.RefCounted
    @CalledByNative
    public void release() {
        this.buffer.release();
    }

    @Override // org.webrtc.RefCounted
    public void retain() {
        this.buffer.retain();
    }
}