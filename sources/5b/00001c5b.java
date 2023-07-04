package com.google.android.exoplayer2.source;

import ak.k0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.t;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.Arrays;
import ji.x;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public class s {

    /* renamed from: a  reason: collision with root package name */
    private final zj.b f14212a;

    /* renamed from: b  reason: collision with root package name */
    private final int f14213b;

    /* renamed from: c  reason: collision with root package name */
    private final ak.v f14214c;

    /* renamed from: d  reason: collision with root package name */
    private a f14215d;

    /* renamed from: e  reason: collision with root package name */
    private a f14216e;

    /* renamed from: f  reason: collision with root package name */
    private a f14217f;

    /* renamed from: g  reason: collision with root package name */
    private long f14218g;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f14219a;

        /* renamed from: b  reason: collision with root package name */
        public final long f14220b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f14221c;

        /* renamed from: d  reason: collision with root package name */
        public zj.a f14222d;

        /* renamed from: e  reason: collision with root package name */
        public a f14223e;

        public a(long j11, int i11) {
            this.f14219a = j11;
            this.f14220b = j11 + i11;
        }

        public a a() {
            this.f14222d = null;
            a aVar = this.f14223e;
            this.f14223e = null;
            return aVar;
        }

        public void b(zj.a aVar, a aVar2) {
            this.f14222d = aVar;
            this.f14223e = aVar2;
            this.f14221c = true;
        }

        public int c(long j11) {
            return ((int) (j11 - this.f14219a)) + this.f14222d.f60423b;
        }
    }

    public s(zj.b bVar) {
        this.f14212a = bVar;
        int e11 = bVar.e();
        this.f14213b = e11;
        this.f14214c = new ak.v(32);
        a aVar = new a(0L, e11);
        this.f14215d = aVar;
        this.f14216e = aVar;
        this.f14217f = aVar;
    }

    private void a(a aVar) {
        if (aVar.f14221c) {
            a aVar2 = this.f14217f;
            int i11 = (aVar2.f14221c ? 1 : 0) + (((int) (aVar2.f14219a - aVar.f14219a)) / this.f14213b);
            zj.a[] aVarArr = new zj.a[i11];
            for (int i12 = 0; i12 < i11; i12++) {
                aVarArr[i12] = aVar.f14222d;
                aVar = aVar.a();
            }
            this.f14212a.a(aVarArr);
        }
    }

    private static a d(a aVar, long j11) {
        while (j11 >= aVar.f14220b) {
            aVar = aVar.f14223e;
        }
        return aVar;
    }

    private void f(int i11) {
        long j11 = this.f14218g + i11;
        this.f14218g = j11;
        a aVar = this.f14217f;
        if (j11 == aVar.f14220b) {
            this.f14217f = aVar.f14223e;
        }
    }

    private int g(int i11) {
        a aVar = this.f14217f;
        if (!aVar.f14221c) {
            aVar.b(this.f14212a.b(), new a(this.f14217f.f14220b, this.f14213b));
        }
        return Math.min(i11, (int) (this.f14217f.f14220b - this.f14218g));
    }

    private static a h(a aVar, long j11, ByteBuffer byteBuffer, int i11) {
        a d11 = d(aVar, j11);
        while (i11 > 0) {
            int min = Math.min(i11, (int) (d11.f14220b - j11));
            byteBuffer.put(d11.f14222d.f60422a, d11.c(j11), min);
            i11 -= min;
            j11 += min;
            if (j11 == d11.f14220b) {
                d11 = d11.f14223e;
            }
        }
        return d11;
    }

    private static a i(a aVar, long j11, byte[] bArr, int i11) {
        a d11 = d(aVar, j11);
        int i12 = i11;
        while (i12 > 0) {
            int min = Math.min(i12, (int) (d11.f14220b - j11));
            System.arraycopy(d11.f14222d.f60422a, d11.c(j11), bArr, i11 - i12, min);
            i12 -= min;
            j11 += min;
            if (j11 == d11.f14220b) {
                d11 = d11.f14223e;
            }
        }
        return d11;
    }

    private static a j(a aVar, DecoderInputBuffer decoderInputBuffer, t.a aVar2, ak.v vVar) {
        long j11 = aVar2.f14358b;
        int i11 = 1;
        vVar.K(1);
        a i12 = i(aVar, j11, vVar.d(), 1);
        long j12 = j11 + 1;
        byte b11 = vVar.d()[0];
        boolean z11 = (b11 & 128) != 0;
        int i13 = b11 & Byte.MAX_VALUE;
        fi.b bVar = decoderInputBuffer.f13263b;
        byte[] bArr = bVar.f26246a;
        if (bArr == null) {
            bVar.f26246a = new byte[16];
        } else {
            Arrays.fill(bArr, (byte) 0);
        }
        a i14 = i(i12, j12, bVar.f26246a, i13);
        long j13 = j12 + i13;
        if (z11) {
            vVar.K(2);
            i14 = i(i14, j13, vVar.d(), 2);
            j13 += 2;
            i11 = vVar.I();
        }
        int i15 = i11;
        int[] iArr = bVar.f26249d;
        if (iArr == null || iArr.length < i15) {
            iArr = new int[i15];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = bVar.f26250e;
        if (iArr3 == null || iArr3.length < i15) {
            iArr3 = new int[i15];
        }
        int[] iArr4 = iArr3;
        if (z11) {
            int i16 = i15 * 6;
            vVar.K(i16);
            i14 = i(i14, j13, vVar.d(), i16);
            j13 += i16;
            vVar.O(0);
            for (int i17 = 0; i17 < i15; i17++) {
                iArr2[i17] = vVar.I();
                iArr4[i17] = vVar.G();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar2.f14357a - ((int) (j13 - aVar2.f14358b));
        }
        x.a aVar3 = (x.a) k0.j(aVar2.f14359c);
        bVar.c(i15, iArr2, iArr4, aVar3.f33779b, bVar.f26246a, aVar3.f33778a, aVar3.f33780c, aVar3.f33781d);
        long j14 = aVar2.f14358b;
        int i18 = (int) (j13 - j14);
        aVar2.f14358b = j14 + i18;
        aVar2.f14357a -= i18;
        return i14;
    }

    private static a k(a aVar, DecoderInputBuffer decoderInputBuffer, t.a aVar2, ak.v vVar) {
        if (decoderInputBuffer.t()) {
            aVar = j(aVar, decoderInputBuffer, aVar2, vVar);
        }
        if (decoderInputBuffer.i()) {
            vVar.K(4);
            a i11 = i(aVar, aVar2.f14358b, vVar.d(), 4);
            int G = vVar.G();
            aVar2.f14358b += 4;
            aVar2.f14357a -= 4;
            decoderInputBuffer.r(G);
            a h11 = h(i11, aVar2.f14358b, decoderInputBuffer.f13264c, G);
            aVar2.f14358b += G;
            int i12 = aVar2.f14357a - G;
            aVar2.f14357a = i12;
            decoderInputBuffer.w(i12);
            return h(h11, aVar2.f14358b, decoderInputBuffer.f13267f, aVar2.f14357a);
        }
        decoderInputBuffer.r(aVar2.f14357a);
        return h(aVar, aVar2.f14358b, decoderInputBuffer.f13264c, aVar2.f14357a);
    }

    public void b(long j11) {
        a aVar;
        if (j11 == -1) {
            return;
        }
        while (true) {
            aVar = this.f14215d;
            if (j11 < aVar.f14220b) {
                break;
            }
            this.f14212a.d(aVar.f14222d);
            this.f14215d = this.f14215d.a();
        }
        if (this.f14216e.f14219a < aVar.f14219a) {
            this.f14216e = aVar;
        }
    }

    public void c(long j11) {
        this.f14218g = j11;
        if (j11 != 0) {
            a aVar = this.f14215d;
            if (j11 != aVar.f14219a) {
                while (this.f14218g > aVar.f14220b) {
                    aVar = aVar.f14223e;
                }
                a aVar2 = aVar.f14223e;
                a(aVar2);
                a aVar3 = new a(aVar.f14220b, this.f14213b);
                aVar.f14223e = aVar3;
                if (this.f14218g == aVar.f14220b) {
                    aVar = aVar3;
                }
                this.f14217f = aVar;
                if (this.f14216e == aVar2) {
                    this.f14216e = aVar3;
                    return;
                }
                return;
            }
        }
        a(this.f14215d);
        a aVar4 = new a(this.f14218g, this.f14213b);
        this.f14215d = aVar4;
        this.f14216e = aVar4;
        this.f14217f = aVar4;
    }

    public long e() {
        return this.f14218g;
    }

    public void l(DecoderInputBuffer decoderInputBuffer, t.a aVar) {
        this.f14216e = k(this.f14216e, decoderInputBuffer, aVar, this.f14214c);
    }

    public void m() {
        a(this.f14215d);
        a aVar = new a(0L, this.f14213b);
        this.f14215d = aVar;
        this.f14216e = aVar;
        this.f14217f = aVar;
        this.f14218g = 0L;
        this.f14212a.c();
    }

    public void n() {
        this.f14216e = this.f14215d;
    }

    public int o(zj.f fVar, int i11, boolean z11) {
        int g11 = g(i11);
        a aVar = this.f14217f;
        int read = fVar.read(aVar.f14222d.f60422a, aVar.c(this.f14218g), g11);
        if (read != -1) {
            f(read);
            return read;
        } else if (z11) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void p(ak.v vVar, int i11) {
        while (i11 > 0) {
            int g11 = g(i11);
            a aVar = this.f14217f;
            vVar.j(aVar.f14222d.f60422a, aVar.c(this.f14218g), g11);
            i11 -= g11;
            f(g11);
        }
    }
}