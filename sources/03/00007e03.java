package kj;

import ak.g0;
import ak.i0;
import ak.k0;
import ak.v;
import android.net.Uri;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.b;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import kj.f;
import wi.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class i extends hj.m {
    private static final AtomicInteger L = new AtomicInteger();
    private final boolean A;
    private final boolean B;
    private j C;
    private q D;
    private int E;
    private boolean F;
    private volatile boolean G;
    private boolean H;
    private com.google.common.collect.r<Integer> I;
    private boolean J;
    private boolean K;

    /* renamed from: k  reason: collision with root package name */
    public final int f34717k;

    /* renamed from: l  reason: collision with root package name */
    public final int f34718l;

    /* renamed from: m  reason: collision with root package name */
    public final Uri f34719m;

    /* renamed from: n  reason: collision with root package name */
    public final boolean f34720n;

    /* renamed from: o  reason: collision with root package name */
    public final int f34721o;

    /* renamed from: p  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f34722p;

    /* renamed from: q  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.b f34723q;

    /* renamed from: r  reason: collision with root package name */
    private final j f34724r;

    /* renamed from: s  reason: collision with root package name */
    private final boolean f34725s;

    /* renamed from: t  reason: collision with root package name */
    private final boolean f34726t;

    /* renamed from: u  reason: collision with root package name */
    private final g0 f34727u;

    /* renamed from: v  reason: collision with root package name */
    private final h f34728v;

    /* renamed from: w  reason: collision with root package name */
    private final List<ci.i> f34729w;

    /* renamed from: x  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.e f34730x;

    /* renamed from: y  reason: collision with root package name */
    private final bj.h f34731y;

    /* renamed from: z  reason: collision with root package name */
    private final v f34732z;

    private i(h hVar, com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, boolean z11, com.google.android.exoplayer2.upstream.a aVar2, com.google.android.exoplayer2.upstream.b bVar2, boolean z12, Uri uri, List<ci.i> list, int i11, Object obj, long j11, long j12, long j13, int i12, boolean z13, int i13, boolean z14, boolean z15, g0 g0Var, com.google.android.exoplayer2.drm.e eVar, j jVar, bj.h hVar2, v vVar, boolean z16) {
        super(aVar, bVar, iVar, i11, obj, j11, j12, j13);
        this.A = z11;
        this.f34721o = i12;
        this.K = z13;
        this.f34718l = i13;
        this.f34723q = bVar2;
        this.f34722p = aVar2;
        this.F = bVar2 != null;
        this.B = z12;
        this.f34719m = uri;
        this.f34725s = z15;
        this.f34727u = g0Var;
        this.f34726t = z14;
        this.f34728v = hVar;
        this.f34729w = list;
        this.f34730x = eVar;
        this.f34724r = jVar;
        this.f34731y = hVar2;
        this.f34732z = vVar;
        this.f34720n = z16;
        this.I = com.google.common.collect.r.r();
        this.f34717k = L.getAndIncrement();
    }

    private static com.google.android.exoplayer2.upstream.a i(com.google.android.exoplayer2.upstream.a aVar, byte[] bArr, byte[] bArr2) {
        if (bArr != null) {
            ak.a.e(bArr2);
            return new a(aVar, bArr, bArr2);
        }
        return aVar;
    }

    public static i j(h hVar, com.google.android.exoplayer2.upstream.a aVar, ci.i iVar, long j11, com.google.android.exoplayer2.source.hls.playlist.d dVar, f.e eVar, Uri uri, List<ci.i> list, int i11, Object obj, boolean z11, s sVar, i iVar2, byte[] bArr, byte[] bArr2) {
        boolean z12;
        com.google.android.exoplayer2.upstream.a aVar2;
        com.google.android.exoplayer2.upstream.b bVar;
        boolean z13;
        int i12;
        bj.h hVar2;
        v vVar;
        j jVar;
        boolean z14;
        j jVar2;
        d.e eVar2 = eVar.f34712a;
        com.google.android.exoplayer2.upstream.b a11 = new b.C0259b().i(i0.d(dVar.f37205a, eVar2.f14106a)).h(eVar2.f14114i).g(eVar2.f14115j).b(eVar.f34715d ? 8 : 0).a();
        boolean z15 = bArr != null;
        com.google.android.exoplayer2.upstream.a i13 = i(aVar, bArr, z15 ? l((String) ak.a.e(eVar2.f14113h)) : null);
        d.C0252d c0252d = eVar2.f14107b;
        if (c0252d != null) {
            boolean z16 = bArr2 != null;
            byte[] l11 = z16 ? l((String) ak.a.e(c0252d.f14113h)) : null;
            z12 = z15;
            bVar = new com.google.android.exoplayer2.upstream.b(i0.d(dVar.f37205a, c0252d.f14106a), c0252d.f14114i, c0252d.f14115j);
            aVar2 = i(aVar, bArr2, l11);
            z13 = z16;
        } else {
            z12 = z15;
            aVar2 = null;
            bVar = null;
            z13 = false;
        }
        long j12 = j11 + eVar2.f14110e;
        long j13 = j12 + eVar2.f14108c;
        int i14 = dVar.f14087h + eVar2.f14109d;
        if (iVar2 != null) {
            boolean z17 = uri.equals(iVar2.f34719m) && iVar2.H;
            bj.h hVar3 = iVar2.f34731y;
            v vVar2 = iVar2.f34732z;
            boolean z18 = !(z17 || (p(eVar, dVar) && j12 >= iVar2.f29261h));
            if (!z17 || iVar2.J) {
                i12 = i14;
            } else {
                i12 = i14;
                if (iVar2.f34718l == i12) {
                    jVar2 = iVar2.C;
                    z14 = z18;
                    jVar = jVar2;
                    hVar2 = hVar3;
                    vVar = vVar2;
                }
            }
            jVar2 = null;
            z14 = z18;
            jVar = jVar2;
            hVar2 = hVar3;
            vVar = vVar2;
        } else {
            i12 = i14;
            hVar2 = new bj.h();
            vVar = new v(10);
            jVar = null;
            z14 = false;
        }
        return new i(hVar, i13, a11, iVar, z12, aVar2, bVar, z13, uri, list, i11, obj, j12, j13, eVar.f34713b, eVar.f34714c, !eVar.f34715d, i12, eVar2.f14116k, z11, sVar.a(i12), eVar2.f14111f, jVar, hVar2, vVar, z14);
    }

    private void k(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, boolean z11) {
        com.google.android.exoplayer2.upstream.b e11;
        long position;
        long j11;
        if (z11) {
            r0 = this.E != 0;
            e11 = bVar;
        } else {
            e11 = bVar.e(this.E);
        }
        try {
            ji.e u11 = u(aVar, e11);
            if (r0) {
                u11.k(this.E);
            }
            do {
                try {
                    if (this.G) {
                        break;
                    }
                } catch (EOFException e12) {
                    if ((this.f29257d.f9198e & 16384) != 0) {
                        this.C.c();
                        position = u11.getPosition();
                        j11 = bVar.f14637f;
                    } else {
                        throw e12;
                    }
                }
            } while (this.C.a(u11));
            position = u11.getPosition();
            j11 = bVar.f14637f;
            this.E = (int) (position - j11);
        } finally {
            k0.n(aVar);
        }
    }

    private static byte[] l(String str) {
        if (k0.R0(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length > 16 ? byteArray.length - 16 : 0;
        System.arraycopy(byteArray, length, bArr, (16 - byteArray.length) + length, byteArray.length - length);
        return bArr;
    }

    private static boolean p(f.e eVar, com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        d.e eVar2 = eVar.f34712a;
        if (eVar2 instanceof d.b) {
            return ((d.b) eVar2).f14100l || (eVar.f34714c == 0 && dVar.f37207c);
        }
        return dVar.f37207c;
    }

    private void r() {
        if (!this.f34725s) {
            try {
                this.f34727u.k();
            } catch (InterruptedException unused) {
                throw new InterruptedIOException();
            }
        } else if (this.f34727u.c() == Long.MAX_VALUE) {
            this.f34727u.h(this.f29260g);
        }
        k(this.f29262i, this.f29255b, this.A);
    }

    private void s() {
        if (this.F) {
            ak.a.e(this.f34722p);
            ak.a.e(this.f34723q);
            k(this.f34722p, this.f34723q, this.B);
            this.E = 0;
            this.F = false;
        }
    }

    private long t(ji.i iVar) {
        iVar.d();
        try {
            this.f34732z.K(10);
            iVar.n(this.f34732z.d(), 0, 10);
        } catch (EOFException unused) {
        }
        if (this.f34732z.F() != 4801587) {
            return -9223372036854775807L;
        }
        this.f34732z.P(3);
        int B = this.f34732z.B();
        int i11 = B + 10;
        if (i11 > this.f34732z.b()) {
            byte[] d11 = this.f34732z.d();
            this.f34732z.K(i11);
            System.arraycopy(d11, 0, this.f34732z.d(), 0, 10);
        }
        iVar.n(this.f34732z.d(), 10, B);
        wi.a e11 = this.f34731y.e(this.f34732z.d(), B);
        if (e11 == null) {
            return -9223372036854775807L;
        }
        int d12 = e11.d();
        for (int i12 = 0; i12 < d12; i12++) {
            a.b c11 = e11.c(i12);
            if (c11 instanceof bj.l) {
                bj.l lVar = (bj.l) c11;
                if ("com.apple.streaming.transportStreamTimestamp".equals(lVar.f7706b)) {
                    System.arraycopy(lVar.f7707c, 0, this.f34732z.d(), 0, 8);
                    this.f34732z.O(0);
                    this.f34732z.N(8);
                    return this.f34732z.v() & 8589934591L;
                }
            }
        }
        return -9223372036854775807L;
    }

    private ji.e u(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar) {
        j a11;
        long j11;
        ji.e eVar = new ji.e(aVar, bVar.f14637f, aVar.i(bVar));
        if (this.C == null) {
            long t11 = t(eVar);
            eVar.d();
            j jVar = this.f34724r;
            if (jVar != null) {
                a11 = jVar.f();
            } else {
                a11 = this.f34728v.a(bVar.f14632a, this.f29257d, this.f34729w, this.f34727u, aVar.c(), eVar);
            }
            this.C = a11;
            if (a11.e()) {
                q qVar = this.D;
                if (t11 != -9223372036854775807L) {
                    j11 = this.f34727u.b(t11);
                } else {
                    j11 = this.f29260g;
                }
                qVar.m0(j11);
            } else {
                this.D.m0(0L);
            }
            this.D.Y();
            this.C.b(this.D);
        }
        this.D.j0(this.f34730x);
        return eVar;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void a() {
        j jVar;
        ak.a.e(this.D);
        if (this.C == null && (jVar = this.f34724r) != null && jVar.d()) {
            this.C = this.f34724r;
            this.F = false;
        }
        s();
        if (this.G) {
            return;
        }
        if (!this.f34726t) {
            r();
        }
        this.H = !this.G;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.e
    public void b() {
        this.G = true;
    }

    @Override // hj.m
    public boolean h() {
        return this.H;
    }

    public int m(int i11) {
        ak.a.f(!this.f34720n);
        if (i11 >= this.I.size()) {
            return 0;
        }
        return this.I.get(i11).intValue();
    }

    public void n(q qVar, com.google.common.collect.r<Integer> rVar) {
        this.D = qVar;
        this.I = rVar;
    }

    public void o() {
        this.J = true;
    }

    public boolean q() {
        return this.K;
    }

    public void v() {
        this.K = true;
    }
}