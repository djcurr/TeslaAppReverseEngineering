package com.google.android.exoplayer2.audio;

import ak.k0;
import com.google.android.exoplayer2.audio.AudioProcessor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class i extends d {

    /* renamed from: i  reason: collision with root package name */
    private final long f13155i;

    /* renamed from: j  reason: collision with root package name */
    private final long f13156j;

    /* renamed from: k  reason: collision with root package name */
    private final short f13157k;

    /* renamed from: l  reason: collision with root package name */
    private int f13158l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13159m;

    /* renamed from: n  reason: collision with root package name */
    private byte[] f13160n;

    /* renamed from: o  reason: collision with root package name */
    private byte[] f13161o;

    /* renamed from: p  reason: collision with root package name */
    private int f13162p;

    /* renamed from: q  reason: collision with root package name */
    private int f13163q;

    /* renamed from: r  reason: collision with root package name */
    private int f13164r;

    /* renamed from: s  reason: collision with root package name */
    private boolean f13165s;

    /* renamed from: t  reason: collision with root package name */
    private long f13166t;

    public i() {
        this(150000L, 20000L, (short) 1024);
    }

    private int m(long j11) {
        return (int) ((j11 * this.f13141b.f13040a) / 1000000);
    }

    private int n(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        while (true) {
            limit -= 2;
            if (limit >= byteBuffer.position()) {
                if (Math.abs((int) byteBuffer.getShort(limit)) > this.f13157k) {
                    int i11 = this.f13158l;
                    return ((limit / i11) * i11) + i11;
                }
            } else {
                return byteBuffer.position();
            }
        }
    }

    private int o(ByteBuffer byteBuffer) {
        for (int position = byteBuffer.position(); position < byteBuffer.limit(); position += 2) {
            if (Math.abs((int) byteBuffer.getShort(position)) > this.f13157k) {
                int i11 = this.f13158l;
                return i11 * (position / i11);
            }
        }
        return byteBuffer.limit();
    }

    private void q(ByteBuffer byteBuffer) {
        int remaining = byteBuffer.remaining();
        l(remaining).put(byteBuffer).flip();
        if (remaining > 0) {
            this.f13165s = true;
        }
    }

    private void r(byte[] bArr, int i11) {
        l(i11).put(bArr, 0, i11).flip();
        if (i11 > 0) {
            this.f13165s = true;
        }
    }

    private void s(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o11 = o(byteBuffer);
        int position = o11 - byteBuffer.position();
        byte[] bArr = this.f13160n;
        int length = bArr.length;
        int i11 = this.f13163q;
        int i12 = length - i11;
        if (o11 < limit && position < i12) {
            r(bArr, i11);
            this.f13163q = 0;
            this.f13162p = 0;
            return;
        }
        int min = Math.min(position, i12);
        byteBuffer.limit(byteBuffer.position() + min);
        byteBuffer.get(this.f13160n, this.f13163q, min);
        int i13 = this.f13163q + min;
        this.f13163q = i13;
        byte[] bArr2 = this.f13160n;
        if (i13 == bArr2.length) {
            if (this.f13165s) {
                r(bArr2, this.f13164r);
                this.f13166t += (this.f13163q - (this.f13164r * 2)) / this.f13158l;
            } else {
                this.f13166t += (i13 - this.f13164r) / this.f13158l;
            }
            w(byteBuffer, this.f13160n, this.f13163q);
            this.f13163q = 0;
            this.f13162p = 2;
        }
        byteBuffer.limit(limit);
    }

    private void t(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        byteBuffer.limit(Math.min(limit, byteBuffer.position() + this.f13160n.length));
        int n11 = n(byteBuffer);
        if (n11 == byteBuffer.position()) {
            this.f13162p = 1;
        } else {
            byteBuffer.limit(n11);
            q(byteBuffer);
        }
        byteBuffer.limit(limit);
    }

    private void u(ByteBuffer byteBuffer) {
        int limit = byteBuffer.limit();
        int o11 = o(byteBuffer);
        byteBuffer.limit(o11);
        this.f13166t += byteBuffer.remaining() / this.f13158l;
        w(byteBuffer, this.f13161o, this.f13164r);
        if (o11 < limit) {
            r(this.f13161o, this.f13164r);
            this.f13162p = 0;
            byteBuffer.limit(limit);
        }
    }

    private void w(ByteBuffer byteBuffer, byte[] bArr, int i11) {
        int min = Math.min(byteBuffer.remaining(), this.f13164r);
        int i12 = this.f13164r - min;
        System.arraycopy(bArr, i11 - i12, this.f13161o, 0, i12);
        byteBuffer.position(byteBuffer.limit() - min);
        byteBuffer.get(this.f13161o, i12, min);
    }

    @Override // com.google.android.exoplayer2.audio.d, com.google.android.exoplayer2.audio.AudioProcessor
    public boolean a() {
        return this.f13159m;
    }

    @Override // com.google.android.exoplayer2.audio.AudioProcessor
    public void d(ByteBuffer byteBuffer) {
        while (byteBuffer.hasRemaining() && !g()) {
            int i11 = this.f13162p;
            if (i11 == 0) {
                t(byteBuffer);
            } else if (i11 == 1) {
                s(byteBuffer);
            } else if (i11 == 2) {
                u(byteBuffer);
            } else {
                throw new IllegalStateException();
            }
        }
    }

    @Override // com.google.android.exoplayer2.audio.d
    public AudioProcessor.a h(AudioProcessor.a aVar) {
        if (aVar.f13042c == 2) {
            return this.f13159m ? aVar : AudioProcessor.a.f13039e;
        }
        throw new AudioProcessor.UnhandledAudioFormatException(aVar);
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void i() {
        if (this.f13159m) {
            this.f13158l = this.f13141b.f13043d;
            int m11 = m(this.f13155i) * this.f13158l;
            if (this.f13160n.length != m11) {
                this.f13160n = new byte[m11];
            }
            int m12 = m(this.f13156j) * this.f13158l;
            this.f13164r = m12;
            if (this.f13161o.length != m12) {
                this.f13161o = new byte[m12];
            }
        }
        this.f13162p = 0;
        this.f13166t = 0L;
        this.f13163q = 0;
        this.f13165s = false;
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void j() {
        int i11 = this.f13163q;
        if (i11 > 0) {
            r(this.f13160n, i11);
        }
        if (this.f13165s) {
            return;
        }
        this.f13166t += this.f13164r / this.f13158l;
    }

    @Override // com.google.android.exoplayer2.audio.d
    protected void k() {
        this.f13159m = false;
        this.f13164r = 0;
        byte[] bArr = k0.f482f;
        this.f13160n = bArr;
        this.f13161o = bArr;
    }

    public long p() {
        return this.f13166t;
    }

    public void v(boolean z11) {
        this.f13159m = z11;
    }

    public i(long j11, long j12, short s11) {
        ak.a.a(j12 <= j11);
        this.f13155i = j11;
        this.f13156j = j12;
        this.f13157k = s11;
        byte[] bArr = k0.f482f;
        this.f13160n = bArr;
        this.f13161o = bArr;
    }
}