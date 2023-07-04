package com.google.android.exoplayer2.source;

import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;

/* loaded from: classes3.dex */
final class l implements i, i.a {

    /* renamed from: a  reason: collision with root package name */
    private final i[] f14128a;

    /* renamed from: c  reason: collision with root package name */
    private final fj.c f14130c;

    /* renamed from: e  reason: collision with root package name */
    private i.a f14132e;

    /* renamed from: f  reason: collision with root package name */
    private fj.v f14133f;

    /* renamed from: h  reason: collision with root package name */
    private u f14135h;

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<i> f14131d = new ArrayList<>();

    /* renamed from: b  reason: collision with root package name */
    private final IdentityHashMap<fj.r, Integer> f14129b = new IdentityHashMap<>();

    /* renamed from: g  reason: collision with root package name */
    private i[] f14134g = new i[0];

    /* loaded from: classes3.dex */
    private static final class a implements i, i.a {

        /* renamed from: a  reason: collision with root package name */
        private final i f14136a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14137b;

        /* renamed from: c  reason: collision with root package name */
        private i.a f14138c;

        public a(i iVar, long j11) {
            this.f14136a = iVar;
            this.f14137b = j11;
        }

        @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
        public long b() {
            long b11 = this.f14136a.b();
            if (b11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f14137b + b11;
        }

        @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
        public boolean c() {
            return this.f14136a.c();
        }

        @Override // com.google.android.exoplayer2.source.i
        public long d(long j11, ci.q qVar) {
            return this.f14136a.d(j11 - this.f14137b, qVar) + this.f14137b;
        }

        @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
        public boolean e(long j11) {
            return this.f14136a.e(j11 - this.f14137b);
        }

        @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
        public long g() {
            long g11 = this.f14136a.g();
            if (g11 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            return this.f14137b + g11;
        }

        @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
        public void h(long j11) {
            this.f14136a.h(j11 - this.f14137b);
        }

        @Override // com.google.android.exoplayer2.source.u.a
        /* renamed from: i */
        public void j(i iVar) {
            ((i.a) ak.a.e(this.f14138c)).j(this);
        }

        @Override // com.google.android.exoplayer2.source.i
        public long k(long j11) {
            return this.f14136a.k(j11 - this.f14137b) + this.f14137b;
        }

        @Override // com.google.android.exoplayer2.source.i
        public long l() {
            long l11 = this.f14136a.l();
            if (l11 == -9223372036854775807L) {
                return -9223372036854775807L;
            }
            return this.f14137b + l11;
        }

        @Override // com.google.android.exoplayer2.source.i
        public void m(i.a aVar, long j11) {
            this.f14138c = aVar;
            this.f14136a.m(this, j11 - this.f14137b);
        }

        @Override // com.google.android.exoplayer2.source.i
        public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
            fj.r[] rVarArr2 = new fj.r[rVarArr.length];
            int i11 = 0;
            while (true) {
                fj.r rVar = null;
                if (i11 >= rVarArr.length) {
                    break;
                }
                b bVar = (b) rVarArr[i11];
                if (bVar != null) {
                    rVar = bVar.b();
                }
                rVarArr2[i11] = rVar;
                i11++;
            }
            long o11 = this.f14136a.o(gVarArr, zArr, rVarArr2, zArr2, j11 - this.f14137b);
            for (int i12 = 0; i12 < rVarArr.length; i12++) {
                fj.r rVar2 = rVarArr2[i12];
                if (rVar2 == null) {
                    rVarArr[i12] = null;
                } else if (rVarArr[i12] == null || ((b) rVarArr[i12]).b() != rVar2) {
                    rVarArr[i12] = new b(rVar2, this.f14137b);
                }
            }
            return o11 + this.f14137b;
        }

        @Override // com.google.android.exoplayer2.source.i.a
        public void p(i iVar) {
            ((i.a) ak.a.e(this.f14138c)).p(this);
        }

        @Override // com.google.android.exoplayer2.source.i
        public void r() {
            this.f14136a.r();
        }

        @Override // com.google.android.exoplayer2.source.i
        public fj.v t() {
            return this.f14136a.t();
        }

        @Override // com.google.android.exoplayer2.source.i
        public void u(long j11, boolean z11) {
            this.f14136a.u(j11 - this.f14137b, z11);
        }
    }

    /* loaded from: classes3.dex */
    private static final class b implements fj.r {

        /* renamed from: a  reason: collision with root package name */
        private final fj.r f14139a;

        /* renamed from: b  reason: collision with root package name */
        private final long f14140b;

        public b(fj.r rVar, long j11) {
            this.f14139a = rVar;
            this.f14140b = j11;
        }

        @Override // fj.r
        public void a() {
            this.f14139a.a();
        }

        public fj.r b() {
            return this.f14139a;
        }

        @Override // fj.r
        public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
            int f11 = this.f14139a.f(jVar, decoderInputBuffer, z11);
            if (f11 == -4) {
                decoderInputBuffer.f13266e = Math.max(0L, decoderInputBuffer.f13266e + this.f14140b);
            }
            return f11;
        }

        @Override // fj.r
        public boolean isReady() {
            return this.f14139a.isReady();
        }

        @Override // fj.r
        public int p(long j11) {
            return this.f14139a.p(j11 - this.f14140b);
        }
    }

    public l(fj.c cVar, long[] jArr, i... iVarArr) {
        this.f14130c = cVar;
        this.f14128a = iVarArr;
        this.f14135h = cVar.a(new u[0]);
        for (int i11 = 0; i11 < iVarArr.length; i11++) {
            if (jArr[i11] != 0) {
                this.f14128a[i11] = new a(iVarArr[i11], jArr[i11]);
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return this.f14135h.b();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f14135h.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        i[] iVarArr = this.f14134g;
        return (iVarArr.length > 0 ? iVarArr[0] : this.f14128a[0]).d(j11, qVar);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        if (!this.f14131d.isEmpty()) {
            int size = this.f14131d.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.f14131d.get(i11).e(j11);
            }
            return false;
        }
        return this.f14135h.e(j11);
    }

    public i f(int i11) {
        i[] iVarArr = this.f14128a;
        if (iVarArr[i11] instanceof a) {
            return ((a) iVarArr[i11]).f14136a;
        }
        return iVarArr[i11];
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return this.f14135h.g();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        this.f14135h.h(j11);
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: i */
    public void j(i iVar) {
        ((i.a) ak.a.e(this.f14132e)).j(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        long k11 = this.f14134g[0].k(j11);
        int i11 = 1;
        while (true) {
            i[] iVarArr = this.f14134g;
            if (i11 >= iVarArr.length) {
                return k11;
            }
            if (iVarArr[i11].k(k11) != k11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i11++;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        i[] iVarArr;
        i[] iVarArr2;
        long j11 = -9223372036854775807L;
        for (i iVar : this.f14134g) {
            long l11 = iVar.l();
            if (l11 != -9223372036854775807L) {
                if (j11 == -9223372036854775807L) {
                    for (i iVar2 : this.f14134g) {
                        if (iVar2 == iVar) {
                            break;
                        } else if (iVar2.k(l11) != l11) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j11 = l11;
                } else if (l11 != j11) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j11 != -9223372036854775807L && iVar.k(j11) != j11) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f14132e = aVar;
        Collections.addAll(this.f14131d, this.f14128a);
        for (i iVar : this.f14128a) {
            iVar.m(this, j11);
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
        int[] iArr = new int[gVarArr.length];
        int[] iArr2 = new int[gVarArr.length];
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            Integer num = rVarArr[i11] == null ? null : this.f14129b.get(rVarArr[i11]);
            iArr[i11] = num == null ? -1 : num.intValue();
            iArr2[i11] = -1;
            if (gVarArr[i11] != null) {
                fj.u j12 = gVarArr[i11].j();
                int i12 = 0;
                while (true) {
                    i[] iVarArr = this.f14128a;
                    if (i12 >= iVarArr.length) {
                        break;
                    } else if (iVarArr[i12].t().b(j12) != -1) {
                        iArr2[i11] = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        this.f14129b.clear();
        int length = gVarArr.length;
        fj.r[] rVarArr2 = new fj.r[length];
        fj.r[] rVarArr3 = new fj.r[gVarArr.length];
        xj.g[] gVarArr2 = new xj.g[gVarArr.length];
        ArrayList arrayList = new ArrayList(this.f14128a.length);
        long j13 = j11;
        int i13 = 0;
        while (i13 < this.f14128a.length) {
            for (int i14 = 0; i14 < gVarArr.length; i14++) {
                rVarArr3[i14] = iArr[i14] == i13 ? rVarArr[i14] : null;
                gVarArr2[i14] = iArr2[i14] == i13 ? gVarArr[i14] : null;
            }
            int i15 = i13;
            ArrayList arrayList2 = arrayList;
            xj.g[] gVarArr3 = gVarArr2;
            long o11 = this.f14128a[i13].o(gVarArr2, zArr, rVarArr3, zArr2, j13);
            if (i15 == 0) {
                j13 = o11;
            } else if (o11 != j13) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z11 = false;
            for (int i16 = 0; i16 < gVarArr.length; i16++) {
                if (iArr2[i16] == i15) {
                    rVarArr2[i16] = rVarArr3[i16];
                    this.f14129b.put((fj.r) ak.a.e(rVarArr3[i16]), Integer.valueOf(i15));
                    z11 = true;
                } else if (iArr[i16] == i15) {
                    ak.a.f(rVarArr3[i16] == null);
                }
            }
            if (z11) {
                arrayList2.add(this.f14128a[i15]);
            }
            i13 = i15 + 1;
            arrayList = arrayList2;
            gVarArr2 = gVarArr3;
        }
        System.arraycopy(rVarArr2, 0, rVarArr, 0, length);
        i[] iVarArr2 = (i[]) arrayList.toArray(new i[0]);
        this.f14134g = iVarArr2;
        this.f14135h = this.f14130c.a(iVarArr2);
        return j13;
    }

    @Override // com.google.android.exoplayer2.source.i.a
    public void p(i iVar) {
        this.f14131d.remove(iVar);
        if (this.f14131d.isEmpty()) {
            int i11 = 0;
            for (i iVar2 : this.f14128a) {
                i11 += iVar2.t().f26354a;
            }
            fj.u[] uVarArr = new fj.u[i11];
            int i12 = 0;
            for (i iVar3 : this.f14128a) {
                fj.v t11 = iVar3.t();
                int i13 = t11.f26354a;
                int i14 = 0;
                while (i14 < i13) {
                    uVarArr[i12] = t11.a(i14);
                    i14++;
                    i12++;
                }
            }
            this.f14133f = new fj.v(uVarArr);
            ((i.a) ak.a.e(this.f14132e)).p(this);
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        for (i iVar : this.f14128a) {
            iVar.r();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public fj.v t() {
        return (fj.v) ak.a.e(this.f14133f);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        for (i iVar : this.f14134g) {
            iVar.u(j11, z11);
        }
    }
}