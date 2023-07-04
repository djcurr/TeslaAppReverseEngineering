package com.google.android.exoplayer2.audio;

import ak.k0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

/* loaded from: classes3.dex */
public final class k implements AudioProcessor {

    /* renamed from: b  reason: collision with root package name */
    private int f13189b;

    /* renamed from: c  reason: collision with root package name */
    private float f13190c = 1.0f;

    /* renamed from: d  reason: collision with root package name */
    private float f13191d = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    private AudioProcessor.a f13192e;

    /* renamed from: f  reason: collision with root package name */
    private AudioProcessor.a f13193f;

    /* renamed from: g  reason: collision with root package name */
    private AudioProcessor.a f13194g;

    /* renamed from: h  reason: collision with root package name */
    private AudioProcessor.a f13195h;

    /* renamed from: i  reason: collision with root package name */
    private boolean f13196i;

    /* renamed from: j  reason: collision with root package name */
    private j f13197j;

    /* renamed from: k  reason: collision with root package name */
    private ByteBuffer f13198k;

    /* renamed from: l  reason: collision with root package name */
    private ShortBuffer f13199l;

    /* renamed from: m  reason: collision with root package name */
    private ByteBuffer f13200m;

    /* renamed from: n  reason: collision with root package name */
    private long f13201n;

    /* renamed from: o  reason: collision with root package name */
    private long f13202o;

    /* renamed from: p  reason: collision with root package name */
    private boolean f13203p;

    public k() {
        AudioProcessor.a aVar = AudioProcessor.a.f13039e;
        this.f13192e = aVar;
        this.f13193f = aVar;
        this.f13194g = aVar;
        this.f13195h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f13038a;
        this.f13198k = byteBuffer;
        this.f13199l = byteBuffer.asShortBuffer();
        this.f13200m = byteBuffer;
        this.f13189b = -1;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f13193f.f13040a != -1 && (Math.abs(this.f13190c - 1.0f) >= 1.0E-4f || Math.abs(this.f13191d - 1.0f) >= 1.0E-4f || this.f13193f.f13040a != this.f13192e.f13040a);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public ByteBuffer b() {
        int k11;
        j jVar = this.f13197j;
        if (jVar != null && (k11 = jVar.k()) > 0) {
            if (this.f13198k.capacity() < k11) {
                ByteBuffer order = ByteBuffer.allocateDirect(k11).order(ByteOrder.nativeOrder());
                this.f13198k = order;
                this.f13199l = order.asShortBuffer();
            } else {
                this.f13198k.clear();
                this.f13199l.clear();
            }
            jVar.j(this.f13199l);
            this.f13202o += k11;
            this.f13198k.limit(k11);
            this.f13200m = this.f13198k;
        }
        ByteBuffer byteBuffer = this.f13200m;
        this.f13200m = AudioProcessor.f13038a;
        return byteBuffer;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public boolean c() {
        j jVar;
        return this.f13203p && ((jVar = this.f13197j) == null || jVar.k() == 0);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        if (byteBuffer.hasRemaining()) {
            ShortBuffer asShortBuffer = byteBuffer.asShortBuffer();
            int remaining = byteBuffer.remaining();
            this.f13201n += remaining;
            ((j) ak.a.e(this.f13197j)).t(asShortBuffer);
            byteBuffer.position(byteBuffer.position() + remaining);
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public AudioProcessor.a e(AudioProcessor.a aVar) {
        if (aVar.f13042c == 2) {
            int i11 = this.f13189b;
            if (i11 == -1) {
                i11 = aVar.f13040a;
            }
            this.f13192e = aVar;
            AudioProcessor.a aVar2 = new AudioProcessor.a(i11, aVar.f13041b, 2);
            this.f13193f = aVar2;
            this.f13196i = true;
            return aVar2;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void f() {
        j jVar = this.f13197j;
        if (jVar != null) {
            jVar.s();
        }
        this.f13203p = true;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void flush() {
        if (a()) {
            AudioProcessor.a aVar = this.f13192e;
            this.f13194g = aVar;
            AudioProcessor.a aVar2 = this.f13193f;
            this.f13195h = aVar2;
            if (this.f13196i) {
                this.f13197j = new j(aVar.f13040a, aVar.f13041b, this.f13190c, this.f13191d, aVar2.f13040a);
            } else {
                j jVar = this.f13197j;
                if (jVar != null) {
                    jVar.i();
                }
            }
        }
        this.f13200m = AudioProcessor.f13038a;
        this.f13201n = 0L;
        this.f13202o = 0L;
        this.f13203p = false;
    }

    public long g(long j11) {
        if (this.f13202o >= 1024) {
            long l11 = this.f13201n - ((j) ak.a.e(this.f13197j)).l();
            int i11 = this.f13195h.f13040a;
            int i12 = this.f13194g.f13040a;
            if (i11 == i12) {
                return k0.I0(j11, l11, this.f13202o);
            }
            return k0.I0(j11, l11 * i11, this.f13202o * i12);
        }
        return (long) (this.f13190c * j11);
    }

    public void h(float f11) {
        if (this.f13191d != f11) {
            this.f13191d = f11;
            this.f13196i = true;
        }
    }

    public void i(float f11) {
        if (this.f13190c != f11) {
            this.f13190c = f11;
            this.f13196i = true;
        }
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void reset() {
        this.f13190c = 1.0f;
        this.f13191d = 1.0f;
        AudioProcessor.a aVar = AudioProcessor.a.f13039e;
        this.f13192e = aVar;
        this.f13193f = aVar;
        this.f13194g = aVar;
        this.f13195h = aVar;
        ByteBuffer byteBuffer = AudioProcessor.f13038a;
        this.f13198k = byteBuffer;
        this.f13199l = byteBuffer.asShortBuffer();
        this.f13200m = byteBuffer;
        this.f13189b = -1;
        this.f13196i = false;
        this.f13197j = null;
        this.f13201n = 0L;
        this.f13202o = 0L;
        this.f13203p = false;
    }
}