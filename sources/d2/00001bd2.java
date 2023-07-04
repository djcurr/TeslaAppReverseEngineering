package com.google.android.exoplayer2.mediacodec;

import ak.k0;
import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
class c {

    /* renamed from: h  reason: collision with root package name */
    private static final ArrayDeque<b> f13662h = new ArrayDeque<>();

    /* renamed from: i  reason: collision with root package name */
    private static final Object f13663i = new Object();

    /* renamed from: a  reason: collision with root package name */
    private final MediaCodec f13664a;

    /* renamed from: b  reason: collision with root package name */
    private final HandlerThread f13665b;

    /* renamed from: c  reason: collision with root package name */
    private Handler f13666c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicReference<RuntimeException> f13667d;

    /* renamed from: e  reason: collision with root package name */
    private final ak.e f13668e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean f13669f;

    /* renamed from: g  reason: collision with root package name */
    private boolean f13670g;

    /* loaded from: classes3.dex */
    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            c.this.f(message);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static class b {

        /* renamed from: a  reason: collision with root package name */
        public int f13672a;

        /* renamed from: b  reason: collision with root package name */
        public int f13673b;

        /* renamed from: c  reason: collision with root package name */
        public int f13674c;

        /* renamed from: d  reason: collision with root package name */
        public final MediaCodec.CryptoInfo f13675d = new MediaCodec.CryptoInfo();

        /* renamed from: e  reason: collision with root package name */
        public long f13676e;

        /* renamed from: f  reason: collision with root package name */
        public int f13677f;

        b() {
        }

        public void a(int i11, int i12, int i13, long j11, int i14) {
            this.f13672a = i11;
            this.f13673b = i12;
            this.f13674c = i13;
            this.f13676e = j11;
            this.f13677f = i14;
        }
    }

    public c(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z11) {
        this(mediaCodec, handlerThread, z11, new ak.e());
    }

    private void b() {
        this.f13668e.b();
        ((Handler) k0.j(this.f13666c)).obtainMessage(2).sendToTarget();
        this.f13668e.a();
    }

    private static void c(fi.b bVar, MediaCodec.CryptoInfo cryptoInfo) {
        cryptoInfo.numSubSamples = bVar.f26251f;
        cryptoInfo.numBytesOfClearData = e(bVar.f26249d, cryptoInfo.numBytesOfClearData);
        cryptoInfo.numBytesOfEncryptedData = e(bVar.f26250e, cryptoInfo.numBytesOfEncryptedData);
        cryptoInfo.key = (byte[]) ak.a.e(d(bVar.f26247b, cryptoInfo.key));
        cryptoInfo.iv = (byte[]) ak.a.e(d(bVar.f26246a, cryptoInfo.iv));
        cryptoInfo.mode = bVar.f26248c;
        if (k0.f477a >= 24) {
            cryptoInfo.setPattern(new MediaCodec.CryptoInfo.Pattern(bVar.f26252g, bVar.f26253h));
        }
    }

    private static byte[] d(byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }

    private static int[] e(int[] iArr, int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f(Message message) {
        b bVar;
        int i11 = message.what;
        if (i11 == 0) {
            bVar = (b) message.obj;
            g(bVar.f13672a, bVar.f13673b, bVar.f13674c, bVar.f13676e, bVar.f13677f);
        } else if (i11 != 1) {
            if (i11 != 2) {
                q(new IllegalStateException(String.valueOf(message.what)));
            } else {
                this.f13668e.d();
            }
            bVar = null;
        } else {
            bVar = (b) message.obj;
            h(bVar.f13672a, bVar.f13673b, bVar.f13675d, bVar.f13676e, bVar.f13677f);
        }
        if (bVar != null) {
            p(bVar);
        }
    }

    private void g(int i11, int i12, int i13, long j11, int i14) {
        try {
            this.f13664a.queueInputBuffer(i11, i12, i13, j11, i14);
        } catch (RuntimeException e11) {
            q(e11);
        }
    }

    private void h(int i11, int i12, MediaCodec.CryptoInfo cryptoInfo, long j11, int i13) {
        try {
            if (this.f13669f) {
                synchronized (f13663i) {
                    this.f13664a.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
                }
            } else {
                this.f13664a.queueSecureInputBuffer(i11, i12, cryptoInfo, j11, i13);
            }
        } catch (RuntimeException e11) {
            q(e11);
        }
    }

    private void j() {
        ((Handler) k0.j(this.f13666c)).removeCallbacksAndMessages(null);
        b();
        l();
    }

    private static b k() {
        ArrayDeque<b> arrayDeque = f13662h;
        synchronized (arrayDeque) {
            if (arrayDeque.isEmpty()) {
                return new b();
            }
            return arrayDeque.removeFirst();
        }
    }

    private void l() {
        RuntimeException andSet = this.f13667d.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    private static boolean m() {
        String R0 = k0.R0(k0.f479c);
        return R0.contains("samsung") || R0.contains("motorola");
    }

    private static void p(b bVar) {
        ArrayDeque<b> arrayDeque = f13662h;
        synchronized (arrayDeque) {
            arrayDeque.add(bVar);
        }
    }

    public void i() {
        if (this.f13670g) {
            try {
                j();
            } catch (InterruptedException e11) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e11);
            }
        }
    }

    public void n(int i11, int i12, int i13, long j11, int i14) {
        l();
        b k11 = k();
        k11.a(i11, i12, i13, j11, i14);
        ((Handler) k0.j(this.f13666c)).obtainMessage(0, k11).sendToTarget();
    }

    public void o(int i11, int i12, fi.b bVar, long j11, int i13) {
        l();
        b k11 = k();
        k11.a(i11, i12, 0, j11, i13);
        c(bVar, k11.f13675d);
        ((Handler) k0.j(this.f13666c)).obtainMessage(1, k11).sendToTarget();
    }

    void q(RuntimeException runtimeException) {
        this.f13667d.set(runtimeException);
    }

    public void r() {
        if (this.f13670g) {
            i();
            this.f13665b.quit();
        }
        this.f13670g = false;
    }

    public void s() {
        if (this.f13670g) {
            return;
        }
        this.f13665b.start();
        this.f13666c = new a(this.f13665b.getLooper());
        this.f13670g = true;
    }

    public void t() {
        b();
    }

    c(MediaCodec mediaCodec, HandlerThread handlerThread, boolean z11, ak.e eVar) {
        this.f13664a = mediaCodec;
        this.f13665b = handlerThread;
        this.f13668e = eVar;
        this.f13667d = new AtomicReference<>();
        this.f13669f = z11 || m();
    }
}