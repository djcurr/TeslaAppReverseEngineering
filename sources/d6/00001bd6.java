package com.google.android.exoplayer2.mediacodec;

import ak.k0;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import android.os.HandlerThread;
import java.util.ArrayDeque;

/* loaded from: classes3.dex */
public final class e extends MediaCodec.Callback {

    /* renamed from: b */
    private final HandlerThread f13681b;

    /* renamed from: c */
    private Handler f13682c;

    /* renamed from: h */
    private MediaFormat f13687h;

    /* renamed from: i */
    private MediaFormat f13688i;

    /* renamed from: j */
    private MediaCodec.CodecException f13689j;

    /* renamed from: k */
    private long f13690k;

    /* renamed from: l */
    private boolean f13691l;

    /* renamed from: m */
    private IllegalStateException f13692m;

    /* renamed from: a */
    private final Object f13680a = new Object();

    /* renamed from: d */
    private final ak.k f13683d = new ak.k();

    /* renamed from: e */
    private final ak.k f13684e = new ak.k();

    /* renamed from: f */
    private final ArrayDeque<MediaCodec.BufferInfo> f13685f = new ArrayDeque<>();

    /* renamed from: g */
    private final ArrayDeque<MediaFormat> f13686g = new ArrayDeque<>();

    public e(HandlerThread handlerThread) {
        this.f13681b = handlerThread;
    }

    public static /* synthetic */ void a(e eVar, Runnable runnable) {
        eVar.j(runnable);
    }

    private void b(MediaFormat mediaFormat) {
        this.f13684e.a(-2);
        this.f13686g.add(mediaFormat);
    }

    private void f() {
        if (!this.f13686g.isEmpty()) {
            this.f13688i = this.f13686g.getLast();
        }
        this.f13683d.b();
        this.f13684e.b();
        this.f13685f.clear();
        this.f13686g.clear();
        this.f13689j = null;
    }

    private boolean i() {
        return this.f13690k > 0 || this.f13691l;
    }

    private void k() {
        l();
        m();
    }

    private void l() {
        IllegalStateException illegalStateException = this.f13692m;
        if (illegalStateException == null) {
            return;
        }
        this.f13692m = null;
        throw illegalStateException;
    }

    private void m() {
        MediaCodec.CodecException codecException = this.f13689j;
        if (codecException == null) {
            return;
        }
        this.f13689j = null;
        throw codecException;
    }

    /* renamed from: n */
    public void j(Runnable runnable) {
        synchronized (this.f13680a) {
            o(runnable);
        }
    }

    private void o(Runnable runnable) {
        if (this.f13691l) {
            return;
        }
        long j11 = this.f13690k - 1;
        this.f13690k = j11;
        if (j11 > 0) {
            return;
        }
        if (j11 < 0) {
            p(new IllegalStateException());
            return;
        }
        f();
        try {
            runnable.run();
        } catch (IllegalStateException e11) {
            p(e11);
        } catch (Exception e12) {
            p(new IllegalStateException(e12));
        }
    }

    private void p(IllegalStateException illegalStateException) {
        synchronized (this.f13680a) {
            this.f13692m = illegalStateException;
        }
    }

    public int c() {
        synchronized (this.f13680a) {
            int i11 = -1;
            if (i()) {
                return -1;
            }
            k();
            if (!this.f13683d.d()) {
                i11 = this.f13683d.e();
            }
            return i11;
        }
    }

    public int d(MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13680a) {
            if (i()) {
                return -1;
            }
            k();
            if (this.f13684e.d()) {
                return -1;
            }
            int e11 = this.f13684e.e();
            if (e11 >= 0) {
                ak.a.h(this.f13687h);
                MediaCodec.BufferInfo remove = this.f13685f.remove();
                bufferInfo.set(remove.offset, remove.size, remove.presentationTimeUs, remove.flags);
            } else if (e11 == -2) {
                this.f13687h = this.f13686g.remove();
            }
            return e11;
        }
    }

    public void e(final Runnable runnable) {
        synchronized (this.f13680a) {
            this.f13690k++;
            ((Handler) k0.j(this.f13682c)).post(new Runnable() { // from class: com.google.android.exoplayer2.mediacodec.d
                {
                    e.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    e.a(e.this, runnable);
                }
            });
        }
    }

    public MediaFormat g() {
        MediaFormat mediaFormat;
        synchronized (this.f13680a) {
            mediaFormat = this.f13687h;
            if (mediaFormat == null) {
                throw new IllegalStateException();
            }
        }
        return mediaFormat;
    }

    public void h(MediaCodec mediaCodec) {
        ak.a.f(this.f13682c == null);
        this.f13681b.start();
        Handler handler = new Handler(this.f13681b.getLooper());
        mediaCodec.setCallback(this, handler);
        this.f13682c = handler;
    }

    @Override // android.media.MediaCodec.Callback
    public void onError(MediaCodec mediaCodec, MediaCodec.CodecException codecException) {
        synchronized (this.f13680a) {
            this.f13689j = codecException;
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onInputBufferAvailable(MediaCodec mediaCodec, int i11) {
        synchronized (this.f13680a) {
            this.f13683d.a(i11);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputBufferAvailable(MediaCodec mediaCodec, int i11, MediaCodec.BufferInfo bufferInfo) {
        synchronized (this.f13680a) {
            MediaFormat mediaFormat = this.f13688i;
            if (mediaFormat != null) {
                b(mediaFormat);
                this.f13688i = null;
            }
            this.f13684e.a(i11);
            this.f13685f.add(bufferInfo);
        }
    }

    @Override // android.media.MediaCodec.Callback
    public void onOutputFormatChanged(MediaCodec mediaCodec, MediaFormat mediaFormat) {
        synchronized (this.f13680a) {
            b(mediaFormat);
            this.f13688i = null;
        }
    }

    public void q() {
        synchronized (this.f13680a) {
            this.f13691l = true;
            this.f13681b.quit();
            f();
        }
    }
}