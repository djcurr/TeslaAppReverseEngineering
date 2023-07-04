package com.google.android.exoplayer2.source.dash;

import ak.k0;
import ak.r;
import ci.i;
import ci.q;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.a;
import hj.f;
import hj.j;
import hj.m;
import hj.o;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import ji.x;
import jj.h;
import xj.g;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
public class c implements com.google.android.exoplayer2.source.dash.a {

    /* renamed from: a  reason: collision with root package name */
    private final l f13894a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f13895b;

    /* renamed from: c  reason: collision with root package name */
    private final int f13896c;

    /* renamed from: d  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f13897d;

    /* renamed from: e  reason: collision with root package name */
    private final long f13898e;

    /* renamed from: f  reason: collision with root package name */
    private final int f13899f;

    /* renamed from: g  reason: collision with root package name */
    private final e.c f13900g;

    /* renamed from: h  reason: collision with root package name */
    protected final b[] f13901h;

    /* renamed from: i  reason: collision with root package name */
    private g f13902i;

    /* renamed from: j  reason: collision with root package name */
    private jj.b f13903j;

    /* renamed from: k  reason: collision with root package name */
    private int f13904k;

    /* renamed from: l  reason: collision with root package name */
    private IOException f13905l;

    /* renamed from: m  reason: collision with root package name */
    private boolean f13906m;

    /* loaded from: classes3.dex */
    public static final class a implements a.InterfaceC0250a {

        /* renamed from: a  reason: collision with root package name */
        private final a.InterfaceC0258a f13907a;

        /* renamed from: b  reason: collision with root package name */
        private final int f13908b;

        public a(a.InterfaceC0258a interfaceC0258a) {
            this(interfaceC0258a, 1);
        }

        @Override // com.google.android.exoplayer2.source.dash.a.InterfaceC0250a
        public com.google.android.exoplayer2.source.dash.a a(l lVar, jj.b bVar, int i11, int[] iArr, g gVar, int i12, long j11, boolean z11, List<i> list, e.c cVar, n nVar) {
            com.google.android.exoplayer2.upstream.a a11 = this.f13907a.a();
            if (nVar != null) {
                a11.b(nVar);
            }
            return new c(lVar, bVar, i11, iArr, gVar, i12, a11, j11, this.f13908b, z11, list, cVar);
        }

        public a(a.InterfaceC0258a interfaceC0258a, int i11) {
            this.f13907a = interfaceC0258a;
            this.f13908b = i11;
        }
    }

    /* renamed from: com.google.android.exoplayer2.source.dash.c$c  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    protected static final class C0251c extends hj.b {
        public C0251c(b bVar, long j11, long j12, long j13) {
            super(j11, j12);
        }
    }

    public c(l lVar, jj.b bVar, int i11, int[] iArr, g gVar, int i12, com.google.android.exoplayer2.upstream.a aVar, long j11, int i13, boolean z11, List<i> list, e.c cVar) {
        this.f13894a = lVar;
        this.f13903j = bVar;
        this.f13895b = iArr;
        this.f13902i = gVar;
        this.f13896c = i12;
        this.f13897d = aVar;
        this.f13904k = i11;
        this.f13898e = j11;
        this.f13899f = i13;
        this.f13900g = cVar;
        long g11 = bVar.g(i11);
        ArrayList<jj.i> m11 = m();
        this.f13901h = new b[gVar.length()];
        for (int i14 = 0; i14 < this.f13901h.length; i14++) {
            this.f13901h[i14] = new b(g11, i12, m11.get(gVar.e(i14)), z11, list, cVar);
        }
    }

    private long k(long j11, long j12) {
        if (this.f13903j.f33804d) {
            return Math.max(0L, Math.min(l(j11), this.f13901h[0].i(this.f13901h[0].g(j11))) - j12);
        }
        return -9223372036854775807L;
    }

    private long l(long j11) {
        jj.b bVar = this.f13903j;
        long j12 = bVar.f33801a;
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j11 - ci.b.c(j12 + bVar.d(this.f13904k).f33834b);
    }

    private ArrayList<jj.i> m() {
        List<jj.a> list = this.f13903j.d(this.f13904k).f33835c;
        ArrayList<jj.i> arrayList = new ArrayList<>();
        for (int i11 : this.f13895b) {
            arrayList.addAll(list.get(i11).f33797c);
        }
        return arrayList;
    }

    private long n(b bVar, m mVar, long j11, long j12, long j13) {
        if (mVar != null) {
            return mVar.g();
        }
        return k0.s(bVar.j(j11), j12, j13);
    }

    @Override // hj.i
    public void a() {
        IOException iOException = this.f13905l;
        if (iOException == null) {
            this.f13894a.a();
            return;
        }
        throw iOException;
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void b(g gVar) {
        this.f13902i = gVar;
    }

    @Override // hj.i
    public long d(long j11, q qVar) {
        b[] bVarArr;
        for (b bVar : this.f13901h) {
            if (bVar.f13911c != null) {
                long j12 = bVar.j(j11);
                long k11 = bVar.k(j12);
                int h11 = bVar.h();
                return qVar.a(j11, k11, (k11 >= j11 || (h11 != -1 && j12 >= (bVar.f() + ((long) h11)) - 1)) ? k11 : bVar.k(j12 + 1));
            }
        }
        return j11;
    }

    @Override // hj.i
    public void e(long j11, long j12, List<? extends m> list, hj.g gVar) {
        int i11;
        int i12;
        hj.n[] nVarArr;
        long j13;
        c cVar = this;
        if (cVar.f13905l != null) {
            return;
        }
        long j14 = j12 - j11;
        long c11 = ci.b.c(cVar.f13903j.f33801a) + ci.b.c(cVar.f13903j.d(cVar.f13904k).f33834b) + j12;
        e.c cVar2 = cVar.f13900g;
        if (cVar2 == null || !cVar2.h(c11)) {
            long c12 = ci.b.c(k0.Z(cVar.f13898e));
            long l11 = cVar.l(c12);
            boolean z11 = true;
            m mVar = list.isEmpty() ? null : list.get(list.size() - 1);
            int length = cVar.f13902i.length();
            MediaChunkIterator[] mediaChunkIteratorArr = new hj.n[length];
            int i13 = 0;
            while (i13 < length) {
                b bVar = cVar.f13901h[i13];
                if (bVar.f13911c == null) {
                    mediaChunkIteratorArr[i13] = hj.n.f29305a;
                    i11 = i13;
                    i12 = length;
                    nVarArr = mediaChunkIteratorArr;
                    j13 = c12;
                } else {
                    long e11 = bVar.e(c12);
                    long g11 = bVar.g(c12);
                    i11 = i13;
                    i12 = length;
                    nVarArr = mediaChunkIteratorArr;
                    j13 = c12;
                    long n11 = n(bVar, mVar, j12, e11, g11);
                    if (n11 < e11) {
                        nVarArr[i11] = hj.n.f29305a;
                    } else {
                        nVarArr[i11] = new C0251c(bVar, n11, g11, l11);
                    }
                }
                i13 = i11 + 1;
                z11 = true;
                c12 = j13;
                mediaChunkIteratorArr = nVarArr;
                length = i12;
                cVar = this;
            }
            long j15 = c12;
            cVar.f13902i.n(j11, j14, cVar.k(c12, j11), list, mediaChunkIteratorArr);
            b bVar2 = cVar.f13901h[cVar.f13902i.a()];
            f fVar = bVar2.f13909a;
            if (fVar != null) {
                jj.i iVar = bVar2.f13910b;
                h n12 = fVar.d() == null ? iVar.n() : null;
                h m11 = bVar2.f13911c == null ? iVar.m() : null;
                if (n12 != null || m11 != null) {
                    gVar.f29263a = o(bVar2, cVar.f13897d, cVar.f13902i.p(), cVar.f13902i.q(), cVar.f13902i.g(), n12, m11);
                    return;
                }
            }
            long j16 = bVar2.f13912d;
            int i14 = (j16 > (-9223372036854775807L) ? 1 : (j16 == (-9223372036854775807L) ? 0 : -1));
            boolean z12 = i14 != 0;
            if (bVar2.h() == 0) {
                gVar.f29264b = z12;
                return;
            }
            long e12 = bVar2.e(j15);
            long g12 = bVar2.g(j15);
            boolean z13 = z12;
            long n13 = n(bVar2, mVar, j12, e12, g12);
            if (n13 < e12) {
                cVar.f13905l = new BehindLiveWindowException();
                return;
            }
            int i15 = (n13 > g12 ? 1 : (n13 == g12 ? 0 : -1));
            if (i15 <= 0 && (!cVar.f13906m || i15 < 0)) {
                if (z13 && bVar2.k(n13) >= j16) {
                    gVar.f29264b = true;
                    return;
                }
                int min = (int) Math.min(cVar.f13899f, (g12 - n13) + 1);
                if (i14 != 0) {
                    while (min > 1 && bVar2.k((min + n13) - 1) >= j16) {
                        min--;
                    }
                }
                gVar.f29263a = p(bVar2, cVar.f13897d, cVar.f13896c, cVar.f13902i.p(), cVar.f13902i.q(), cVar.f13902i.g(), n13, min, list.isEmpty() ? j12 : -9223372036854775807L, l11);
                return;
            }
            gVar.f29264b = z13;
        }
    }

    @Override // hj.i
    public boolean f(hj.e eVar, boolean z11, Exception exc, long j11) {
        b bVar;
        int h11;
        if (z11) {
            e.c cVar = this.f13900g;
            if (cVar == null || !cVar.j(eVar)) {
                if (!this.f13903j.f33804d && (eVar instanceof m) && (exc instanceof HttpDataSource.InvalidResponseCodeException) && ((HttpDataSource.InvalidResponseCodeException) exc).f14591a == 404 && (h11 = (bVar = this.f13901h[this.f13902i.b(eVar.f29257d)]).h()) != -1 && h11 != 0) {
                    if (((m) eVar).g() > (bVar.f() + h11) - 1) {
                        this.f13906m = true;
                        return true;
                    }
                }
                if (j11 != -9223372036854775807L) {
                    g gVar = this.f13902i;
                    return gVar.c(gVar.b(eVar.f29257d), j11);
                }
                return false;
            }
            return true;
        }
        return false;
    }

    @Override // hj.i
    public void g(hj.e eVar) {
        ji.c b11;
        if (eVar instanceof hj.l) {
            int b12 = this.f13902i.b(((hj.l) eVar).f29257d);
            b bVar = this.f13901h[b12];
            if (bVar.f13911c == null && (b11 = bVar.f13909a.b()) != null) {
                this.f13901h[b12] = bVar.c(new ij.f(b11, bVar.f13910b.f33848c));
            }
        }
        e.c cVar = this.f13900g;
        if (cVar != null) {
            cVar.i(eVar);
        }
    }

    @Override // com.google.android.exoplayer2.source.dash.a
    public void h(jj.b bVar, int i11) {
        try {
            this.f13903j = bVar;
            this.f13904k = i11;
            long g11 = bVar.g(i11);
            ArrayList<jj.i> m11 = m();
            for (int i12 = 0; i12 < this.f13901h.length; i12++) {
                b[] bVarArr = this.f13901h;
                bVarArr[i12] = bVarArr[i12].b(g11, m11.get(this.f13902i.e(i12)));
            }
        } catch (BehindLiveWindowException e11) {
            this.f13905l = e11;
        }
    }

    @Override // hj.i
    public int i(long j11, List<? extends m> list) {
        if (this.f13905l == null && this.f13902i.length() >= 2) {
            return this.f13902i.m(j11, list);
        }
        return list.size();
    }

    @Override // hj.i
    public boolean j(long j11, hj.e eVar, List<? extends m> list) {
        if (this.f13905l != null) {
            return false;
        }
        return this.f13902i.k(j11, eVar, list);
    }

    protected hj.e o(b bVar, com.google.android.exoplayer2.upstream.a aVar, i iVar, int i11, Object obj, h hVar, h hVar2) {
        jj.i iVar2 = bVar.f13910b;
        if (hVar == null || (hVar2 = hVar.a(hVar2, iVar2.f33847b)) != null) {
            hVar = hVar2;
        }
        return new hj.l(aVar, ij.e.a(iVar2, hVar, 0), iVar, i11, obj, bVar.f13909a);
    }

    protected hj.e p(b bVar, com.google.android.exoplayer2.upstream.a aVar, int i11, i iVar, int i12, Object obj, long j11, int i13, long j12, long j13) {
        jj.i iVar2 = bVar.f13910b;
        long k11 = bVar.k(j11);
        h l11 = bVar.l(j11);
        String str = iVar2.f33847b;
        if (bVar.f13909a == null) {
            return new o(aVar, ij.e.a(iVar2, l11, bVar.m(j11, j13) ? 0 : 8), iVar, i12, obj, k11, bVar.i(j11), j11, i11, iVar);
        }
        int i14 = 1;
        int i15 = 1;
        while (i14 < i13) {
            h a11 = l11.a(bVar.l(i14 + j11), str);
            if (a11 == null) {
                break;
            }
            i15++;
            i14++;
            l11 = a11;
        }
        long j14 = (i15 + j11) - 1;
        long i16 = bVar.i(j14);
        long j15 = bVar.f13912d;
        return new j(aVar, ij.e.a(iVar2, l11, bVar.m(j14, j13) ? 0 : 8), iVar, i12, obj, k11, i16, j12, (j15 == -9223372036854775807L || j15 > i16) ? -9223372036854775807L : j15, j11, i15, -iVar2.f33848c, bVar.f13909a);
    }

    @Override // hj.i
    public void release() {
        for (b bVar : this.f13901h) {
            f fVar = bVar.f13909a;
            if (fVar != null) {
                fVar.release();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        final f f13909a;

        /* renamed from: b  reason: collision with root package name */
        public final jj.i f13910b;

        /* renamed from: c  reason: collision with root package name */
        public final ij.d f13911c;

        /* renamed from: d  reason: collision with root package name */
        private final long f13912d;

        /* renamed from: e  reason: collision with root package name */
        private final long f13913e;

        b(long j11, int i11, jj.i iVar, boolean z11, List<i> list, x xVar) {
            this(j11, iVar, d(i11, iVar, z11, list, xVar), 0L, iVar.b());
        }

        private static f d(int i11, jj.i iVar, boolean z11, List<i> list, x xVar) {
            ji.h gVar;
            String str = iVar.f33846a.f9204k;
            if (r.r(str)) {
                if (!"application/x-rawcc".equals(str)) {
                    return null;
                }
                gVar = new si.a(iVar.f33846a);
            } else if (r.q(str)) {
                gVar = new oi.e(1);
            } else {
                gVar = new qi.g(z11 ? 4 : 0, null, null, list, xVar);
            }
            return new hj.d(gVar, i11, iVar.f33846a);
        }

        b b(long j11, jj.i iVar) {
            long h11;
            long j12;
            ij.d b11 = this.f13910b.b();
            ij.d b12 = iVar.b();
            if (b11 == null) {
                return new b(j11, iVar, this.f13909a, this.f13913e, b11);
            }
            if (!b11.j()) {
                return new b(j11, iVar, this.f13909a, this.f13913e, b12);
            }
            int i11 = b11.i(j11);
            if (i11 == 0) {
                return new b(j11, iVar, this.f13909a, this.f13913e, b12);
            }
            long k11 = b11.k();
            long c11 = b11.c(k11);
            long j13 = (i11 + k11) - 1;
            long k12 = b12.k();
            long c12 = b12.c(k12);
            long j14 = this.f13913e;
            int i12 = ((b11.c(j13) + b11.d(j13, j11)) > c12 ? 1 : ((b11.c(j13) + b11.d(j13, j11)) == c12 ? 0 : -1));
            if (i12 == 0) {
                j12 = j14 + ((j13 + 1) - k12);
            } else if (i12 < 0) {
                throw new BehindLiveWindowException();
            } else {
                if (c12 < c11) {
                    h11 = j14 - (b12.h(c11, j11) - k11);
                } else {
                    h11 = (b11.h(c12, j11) - k12) + j14;
                }
                j12 = h11;
            }
            return new b(j11, iVar, this.f13909a, j12, b12);
        }

        b c(ij.d dVar) {
            return new b(this.f13912d, this.f13910b, this.f13909a, this.f13913e, dVar);
        }

        public long e(long j11) {
            return this.f13911c.e(this.f13912d, j11) + this.f13913e;
        }

        public long f() {
            return this.f13911c.k() + this.f13913e;
        }

        public long g(long j11) {
            return (e(j11) + this.f13911c.l(this.f13912d, j11)) - 1;
        }

        public int h() {
            return this.f13911c.i(this.f13912d);
        }

        public long i(long j11) {
            return k(j11) + this.f13911c.d(j11 - this.f13913e, this.f13912d);
        }

        public long j(long j11) {
            return this.f13911c.h(j11, this.f13912d) + this.f13913e;
        }

        public long k(long j11) {
            return this.f13911c.c(j11 - this.f13913e);
        }

        public h l(long j11) {
            return this.f13911c.g(j11 - this.f13913e);
        }

        public boolean m(long j11, long j12) {
            return j12 == -9223372036854775807L || i(j11) <= j12;
        }

        private b(long j11, jj.i iVar, f fVar, long j12, ij.d dVar) {
            this.f13912d = j11;
            this.f13910b = iVar;
            this.f13913e = j12;
            this.f13909a = fVar;
            this.f13911c = dVar;
        }
    }
}