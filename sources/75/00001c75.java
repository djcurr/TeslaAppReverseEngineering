package com.google.android.exoplayer2.source;

import ak.k0;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.a;
import com.google.android.exoplayer2.upstream.g;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class v implements i, Loader.b<c> {

    /* renamed from: a  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f14360a;

    /* renamed from: b  reason: collision with root package name */
    private final a.InterfaceC0258a f14361b;

    /* renamed from: c  reason: collision with root package name */
    private final zj.n f14362c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f14363d;

    /* renamed from: e  reason: collision with root package name */
    private final k.a f14364e;

    /* renamed from: f  reason: collision with root package name */
    private final fj.v f14365f;

    /* renamed from: h  reason: collision with root package name */
    private final long f14367h;

    /* renamed from: j  reason: collision with root package name */
    final ci.i f14369j;

    /* renamed from: k  reason: collision with root package name */
    final boolean f14370k;

    /* renamed from: l  reason: collision with root package name */
    boolean f14371l;

    /* renamed from: m  reason: collision with root package name */
    byte[] f14372m;

    /* renamed from: n  reason: collision with root package name */
    int f14373n;

    /* renamed from: g  reason: collision with root package name */
    private final ArrayList<b> f14366g = new ArrayList<>();

    /* renamed from: i  reason: collision with root package name */
    final Loader f14368i = new Loader("Loader:SingleSampleMediaPeriod");

    /* loaded from: classes3.dex */
    private final class b implements fj.r {

        /* renamed from: a  reason: collision with root package name */
        private int f14374a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f14375b;

        private b() {
        }

        private void b() {
            if (this.f14375b) {
                return;
            }
            v.this.f14364e.i(ak.r.l(v.this.f14369j.f9205l), v.this.f14369j, 0, null, 0L);
            this.f14375b = true;
        }

        @Override // fj.r
        public void a() {
            v vVar = v.this;
            if (vVar.f14370k) {
                return;
            }
            vVar.f14368i.a();
        }

        public void c() {
            if (this.f14374a == 2) {
                this.f14374a = 1;
            }
        }

        @Override // fj.r
        public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
            b();
            int i11 = this.f14374a;
            if (i11 == 2) {
                decoderInputBuffer.e(4);
                return -4;
            } else if (!z11 && i11 != 0) {
                v vVar = v.this;
                if (vVar.f14371l) {
                    if (vVar.f14372m != null) {
                        decoderInputBuffer.e(1);
                        decoderInputBuffer.f13266e = 0L;
                        if (decoderInputBuffer.u()) {
                            return -4;
                        }
                        decoderInputBuffer.r(v.this.f14373n);
                        ByteBuffer byteBuffer = decoderInputBuffer.f13264c;
                        v vVar2 = v.this;
                        byteBuffer.put(vVar2.f14372m, 0, vVar2.f14373n);
                    } else {
                        decoderInputBuffer.e(4);
                    }
                    this.f14374a = 2;
                    return -4;
                }
                return -3;
            } else {
                jVar.f9243b = v.this.f14369j;
                this.f14374a = 1;
                return -5;
            }
        }

        @Override // fj.r
        public boolean isReady() {
            return v.this.f14371l;
        }

        @Override // fj.r
        public int p(long j11) {
            b();
            if (j11 <= 0 || this.f14374a == 2) {
                return 0;
            }
            this.f14374a = 2;
            return 1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c implements Loader.e {

        /* renamed from: a  reason: collision with root package name */
        public final long f14377a = fj.g.a();

        /* renamed from: b  reason: collision with root package name */
        public final com.google.android.exoplayer2.upstream.b f14378b;

        /* renamed from: c  reason: collision with root package name */
        private final zj.m f14379c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f14380d;

        public c(com.google.android.exoplayer2.upstream.b bVar, com.google.android.exoplayer2.upstream.a aVar) {
            this.f14378b = bVar;
            this.f14379c = new zj.m(aVar);
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            this.f14379c.r();
            try {
                this.f14379c.i(this.f14378b);
                int i11 = 0;
                while (i11 != -1) {
                    int o11 = (int) this.f14379c.o();
                    byte[] bArr = this.f14380d;
                    if (bArr == null) {
                        this.f14380d = new byte[1024];
                    } else if (o11 == bArr.length) {
                        this.f14380d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    zj.m mVar = this.f14379c;
                    byte[] bArr2 = this.f14380d;
                    i11 = mVar.read(bArr2, o11, bArr2.length - o11);
                }
            } finally {
                k0.n(this.f14379c);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
        }
    }

    public v(com.google.android.exoplayer2.upstream.b bVar, a.InterfaceC0258a interfaceC0258a, zj.n nVar, ci.i iVar, long j11, com.google.android.exoplayer2.upstream.g gVar, k.a aVar, boolean z11) {
        this.f14360a = bVar;
        this.f14361b = interfaceC0258a;
        this.f14362c = nVar;
        this.f14369j = iVar;
        this.f14367h = j11;
        this.f14363d = gVar;
        this.f14364e = aVar;
        this.f14370k = z11;
        this.f14365f = new fj.v(new fj.u(iVar));
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return (this.f14371l || this.f14368i.j()) ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f14368i.j();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        if (this.f14371l || this.f14368i.j() || this.f14368i.i()) {
            return false;
        }
        com.google.android.exoplayer2.upstream.a a11 = this.f14361b.a();
        zj.n nVar = this.f14362c;
        if (nVar != null) {
            a11.b(nVar);
        }
        c cVar = new c(this.f14360a, a11);
        this.f14364e.A(new fj.g(cVar.f14377a, this.f14360a, this.f14368i.n(cVar, this, this.f14363d.d(1))), 1, -1, this.f14369j, 0, null, 0L, this.f14367h);
        return true;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: f */
    public void i(c cVar, long j11, long j12, boolean z11) {
        zj.m mVar = cVar.f14379c;
        fj.g gVar = new fj.g(cVar.f14377a, cVar.f14378b, mVar.p(), mVar.q(), j11, j12, mVar.o());
        this.f14363d.f(cVar.f14377a);
        this.f14364e.r(gVar, 1, -1, null, 0, null, 0L, this.f14367h);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return this.f14371l ? Long.MIN_VALUE : 0L;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        for (int i11 = 0; i11 < this.f14366g.size(); i11++) {
            this.f14366g.get(i11).c();
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        aVar.p(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if (rVarArr[i11] != null && (gVarArr[i11] == null || !zArr[i11])) {
                this.f14366g.remove(rVarArr[i11]);
                rVarArr[i11] = null;
            }
            if (rVarArr[i11] == null && gVarArr[i11] != null) {
                b bVar = new b();
                this.f14366g.add(bVar);
                rVarArr[i11] = bVar;
                zArr2[i11] = true;
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: p */
    public void j(c cVar, long j11, long j12) {
        this.f14373n = (int) cVar.f14379c.o();
        this.f14372m = (byte[]) ak.a.e(cVar.f14380d);
        this.f14371l = true;
        zj.m mVar = cVar.f14379c;
        fj.g gVar = new fj.g(cVar.f14377a, cVar.f14378b, mVar.p(), mVar.q(), j11, j12, this.f14373n);
        this.f14363d.f(cVar.f14377a);
        this.f14364e.u(gVar, 1, -1, this.f14369j, 0, null, 0L, this.f14367h);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: q */
    public Loader.c n(c cVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVar2;
        zj.m mVar = cVar.f14379c;
        fj.g gVar = new fj.g(cVar.f14377a, cVar.f14378b, mVar.p(), mVar.q(), j11, j12, mVar.o());
        long a11 = this.f14363d.a(new g.a(gVar, new fj.h(1, -1, this.f14369j, 0, null, 0L, ci.b.d(this.f14367h)), iOException, i11));
        int i12 = (a11 > (-9223372036854775807L) ? 1 : (a11 == (-9223372036854775807L) ? 0 : -1));
        boolean z11 = i12 == 0 || i11 >= this.f14363d.d(1);
        if (this.f14370k && z11) {
            ak.o.i("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f14371l = true;
            cVar2 = Loader.f14597e;
        } else if (i12 != 0) {
            cVar2 = Loader.h(false, a11);
        } else {
            cVar2 = Loader.f14598f;
        }
        Loader.c cVar3 = cVar2;
        boolean z12 = !cVar3.c();
        this.f14364e.w(gVar, 1, -1, this.f14369j, 0, null, 0L, this.f14367h, iOException, z12);
        if (z12) {
            this.f14363d.f(cVar.f14377a);
        }
        return cVar3;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
    }

    public void s() {
        this.f14368i.l();
    }

    @Override // com.google.android.exoplayer2.source.i
    public fj.v t() {
        return this.f14365f;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
    }
}