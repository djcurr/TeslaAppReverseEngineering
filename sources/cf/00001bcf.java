package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Surface;
import com.google.android.exoplayer2.mediacodec.b;
import com.google.android.exoplayer2.mediacodec.h;
import com.google.common.base.a0;
import java.nio.ByteBuffer;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class b implements h {

    /* renamed from: a */
    private final MediaCodec f13652a;

    /* renamed from: b */
    private final e f13653b;

    /* renamed from: c */
    private final c f13654c;

    /* renamed from: d */
    private final boolean f13655d;

    /* renamed from: e */
    private boolean f13656e;

    /* renamed from: f */
    private int f13657f;

    /* renamed from: com.google.android.exoplayer2.mediacodec.b$b */
    /* loaded from: classes3.dex */
    public static final class C0249b implements h.a {

        /* renamed from: b */
        private final a0<HandlerThread> f13658b;

        /* renamed from: c */
        private final a0<HandlerThread> f13659c;

        /* renamed from: d */
        private final boolean f13660d;

        /* renamed from: e */
        private final boolean f13661e;

        public C0249b(final int i11, boolean z11, boolean z12) {
            this(new a0() { // from class: vi.b
                @Override // com.google.common.base.a0
                public final Object get() {
                    return b.C0249b.b(i11);
                }
            }, new a0() { // from class: vi.c
                @Override // com.google.common.base.a0
                public final Object get() {
                    return b.C0249b.c(i11);
                }
            }, z11, z12);
        }

        public static /* synthetic */ HandlerThread b(int i11) {
            return e(i11);
        }

        public static /* synthetic */ HandlerThread c(int i11) {
            return f(i11);
        }

        public static /* synthetic */ HandlerThread e(int i11) {
            return new HandlerThread(b.k(i11));
        }

        public static /* synthetic */ HandlerThread f(int i11) {
            return new HandlerThread(b.l(i11));
        }

        @Override // com.google.android.exoplayer2.mediacodec.h.a
        /* renamed from: d */
        public b a(MediaCodec mediaCodec) {
            return new b(mediaCodec, this.f13658b.get(), this.f13659c.get(), this.f13660d, this.f13661e);
        }

        C0249b(a0<HandlerThread> a0Var, a0<HandlerThread> a0Var2, boolean z11, boolean z12) {
            this.f13658b = a0Var;
            this.f13659c = a0Var2;
            this.f13660d = z11;
            this.f13661e = z12;
        }
    }

    public static /* synthetic */ void h(b bVar, h.b bVar2, MediaCodec mediaCodec, long j11, long j12) {
        bVar.n(bVar2, mediaCodec, j11, j12);
    }

    public static String k(int i11) {
        return m(i11, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    public static String l(int i11) {
        return m(i11, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String m(int i11, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i11 == 1) {
            sb2.append("Audio");
        } else if (i11 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i11);
            sb2.append(")");
        }
        return sb2.toString();
    }

    public /* synthetic */ void n(h.b bVar, MediaCodec mediaCodec, long j11, long j12) {
        bVar.a(this, j11, j12);
    }

    private void o() {
        if (this.f13655d) {
            try {
                this.f13654c.t();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void a(final h.b bVar, Handler handler) {
        o();
        this.f13652a.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            {
                b.this = this;
            }

            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j11, long j12) {
                b.h(b.this, bVar, mediaCodec, j11, j12);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void b(int i11) {
        o();
        this.f13652a.setVideoScalingMode(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void c(Surface surface) {
        o();
        this.f13652a.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void configure(MediaFormat mediaFormat, Surface surface, MediaCrypto mediaCrypto, int i11) {
        this.f13653b.h(this.f13652a);
        this.f13652a.configure(mediaFormat, surface, mediaCrypto, i11);
        this.f13657f = 1;
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void d(int i11, int i12, fi.b bVar, long j11, int i13) {
        this.f13654c.o(i11, i12, bVar, j11, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void e(int i11, long j11) {
        this.f13652a.releaseOutputBuffer(i11, j11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public int f() {
        return this.f13653b.c();
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void flush() {
        this.f13654c.i();
        this.f13652a.flush();
        e eVar = this.f13653b;
        final MediaCodec mediaCodec = this.f13652a;
        Objects.requireNonNull(mediaCodec);
        eVar.e(new Runnable() { // from class: vi.a
            @Override // java.lang.Runnable
            public final void run() {
                mediaCodec.start();
            }
        });
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public int g(MediaCodec.BufferInfo bufferInfo) {
        return this.f13653b.d(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public ByteBuffer getInputBuffer(int i11) {
        return this.f13652a.getInputBuffer(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public ByteBuffer getOutputBuffer(int i11) {
        return this.f13652a.getOutputBuffer(i11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public MediaFormat getOutputFormat() {
        return this.f13653b.g();
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void queueInputBuffer(int i11, int i12, int i13, long j11, int i14) {
        this.f13654c.n(i11, i12, i13, j11, i14);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void release() {
        try {
            if (this.f13657f == 2) {
                this.f13654c.r();
            }
            int i11 = this.f13657f;
            if (i11 == 1 || i11 == 2) {
                this.f13653b.q();
            }
            this.f13657f = 3;
        } finally {
            if (!this.f13656e) {
                this.f13652a.release();
                this.f13656e = true;
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void releaseOutputBuffer(int i11, boolean z11) {
        this.f13652a.releaseOutputBuffer(i11, z11);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void setParameters(Bundle bundle) {
        o();
        this.f13652a.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.h
    public void start() {
        this.f13654c.s();
        this.f13652a.start();
        this.f13657f = 2;
    }

    private b(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z11, boolean z12) {
        this.f13652a = mediaCodec;
        this.f13653b = new e(handlerThread);
        this.f13654c = new c(mediaCodec, handlerThread2, z11);
        this.f13655d = z12;
        this.f13657f = 0;
    }
}