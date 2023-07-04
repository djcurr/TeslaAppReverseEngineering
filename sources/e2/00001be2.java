package com.google.android.exoplayer2.mediacodec;

import ak.k0;
import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.android.exoplayer2.mediacodec.o;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class o implements h {

    /* renamed from: a */
    private final MediaCodec f13712a;

    /* renamed from: b */
    private ByteBuffer[] f13713b;

    /* renamed from: c */
    private ByteBuffer[] f13714c;

    /* loaded from: classes3.dex */
    public static final class b implements h.a {
        @Override // com.google.android.exoplayer2.mediacodec.h.a
        public h a(MediaCodec mediaCodec) {
            return new o(mediaCodec);
        }
    }

    public /* synthetic */ void i(h.b bVar, MediaCodec mediaCodec, long j11, long j12) {
        bVar.a(this, j11, j12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void a(final h.b bVar, Handler handler) {
        this.f13712a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: vi.f
            {
                o.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                o.this.i(bVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void b(int i11) {
        this.f13712a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void c(Surface surface) {
        this.f13712a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        this.f13712a.configure(mediaFormat, surface, mediaCrypto, i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void d(int i11, int i12, fi.b bVar, long j11, int i13) {
        this.f13712a.queueSecureInputBuffer(i11, i12, bVar.a(), j11, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void e(int i11, long j11) {
        this.f13712a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public int f() {
        return this.f13712a.dequeueInputBuffer(0L);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void flush() {
        this.f13712a.flush();
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public int g(MediaCodec.BufferInfo bufferInfo) {
        int dequeueOutputBuffer;
        do {
            dequeueOutputBuffer = this.f13712a.dequeueOutputBuffer(bufferInfo, 0L);
            if (dequeueOutputBuffer == -3 && k0.f477a < 21) {
                this.f13714c = this.f13712a.getOutputBuffers();
                continue;
            }
        } while (dequeueOutputBuffer == -3);
        return dequeueOutputBuffer;
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public ByteBuffer getInputBuffer(int i11) {
        if (k0.f477a >= 21) {
            return this.f13712a.getInputBuffer(i11);
        }
        return ((ByteBuffer[]) k0.j(this.f13713b))[i11];
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public ByteBuffer getOutputBuffer(int i11) {
        if (k0.f477a >= 21) {
            return this.f13712a.getOutputBuffer(i11);
        }
        return ((ByteBuffer[]) k0.j(this.f13714c))[i11];
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public MediaFormat getOutputFormat() {
        return this.f13712a.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f13712a.queueInputBuffer(i11, i12, i13, j11, i14);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void release() {
        this.f13713b = null;
        this.f13714c = null;
        this.f13712a.release();
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f13712a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void setParameters(Bundle bundle) {
        this.f13712a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void start() {
        this.f13712a.start();
        if (k0.f477a < 21) {
            this.f13713b = this.f13712a.getInputBuffers();
            this.f13714c = this.f13712a.getOutputBuffers();
        }
    }

    private o(MediaCodec mediaCodec) {
        this.f13712a = mediaCodec;
    }
}