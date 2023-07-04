package kj;

import ak.i0;
import ak.k0;
import android.net.Uri;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.source.BehindLiveWindowException;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.d;
import com.google.android.exoplayer2.upstream.b;
import com.google.common.collect.w;
import fj.u;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
class f {

    /* renamed from: a  reason: collision with root package name */
    private final h f34688a;

    /* renamed from: b  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f34689b;

    /* renamed from: c  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.a f34690c;

    /* renamed from: d  reason: collision with root package name */
    private final s f34691d;

    /* renamed from: e  reason: collision with root package name */
    private final Uri[] f34692e;

    /* renamed from: f  reason: collision with root package name */
    private final ci.i[] f34693f;

    /* renamed from: g  reason: collision with root package name */
    private final HlsPlaylistTracker f34694g;

    /* renamed from: h  reason: collision with root package name */
    private final u f34695h;

    /* renamed from: i  reason: collision with root package name */
    private final List<ci.i> f34696i;

    /* renamed from: k  reason: collision with root package name */
    private boolean f34698k;

    /* renamed from: m  reason: collision with root package name */
    private IOException f34700m;

    /* renamed from: n  reason: collision with root package name */
    private Uri f34701n;

    /* renamed from: o  reason: collision with root package name */
    private boolean f34702o;

    /* renamed from: p  reason: collision with root package name */
    private xj.g f34703p;

    /* renamed from: r  reason: collision with root package name */
    private boolean f34705r;

    /* renamed from: j  reason: collision with root package name */
    private final kj.e f34697j = new kj.e(4);

    /* renamed from: l  reason: collision with root package name */
    private byte[] f34699l = k0.f482f;

    /* renamed from: q  reason: collision with root package name */
    private long f34704q = -9223372036854775807L;

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a extends hj.k {

        /* renamed from: l  reason: collision with root package name */
        private byte[] f34706l;

        public a(com.google.android.exoplayer2.upstream.a aVar, com.google.android.exoplayer2.upstream.b bVar, ci.i iVar, int i11, Object obj, byte[] bArr) {
            super(aVar, bVar, 3, iVar, i11, obj, bArr);
        }

        @Override // hj.k
        protected void g(byte[] bArr, int i11) {
            this.f34706l = Arrays.copyOf(bArr, i11);
        }

        public byte[] j() {
            return this.f34706l;
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public hj.e f34707a;

        /* renamed from: b  reason: collision with root package name */
        public boolean f34708b;

        /* renamed from: c  reason: collision with root package name */
        public Uri f34709c;

        public b() {
            a();
        }

        public void a() {
            this.f34707a = null;
            this.f34708b = false;
            this.f34709c = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends hj.b {

        /* renamed from: c  reason: collision with root package name */
        private final List<d.e> f34710c;

        public c(String str, long j11, List<d.e> list) {
            super(0L, list.size() - 1);
            this.f34710c = list;
        }
    }

    /* loaded from: classes3.dex */
    private static final class d extends xj.c {

        /* renamed from: g  reason: collision with root package name */
        private int f34711g;

        public d(u uVar, int[] iArr) {
            super(uVar, iArr);
            this.f34711g = b(uVar.a(iArr[0]));
        }

        @Override // xj.g
        public int a() {
            return this.f34711g;
        }

        @Override // xj.g
        public Object g() {
            return null;
        }

        @Override // xj.g
        public void n(long j11, long j12, long j13, List<? extends hj.m> list, MediaChunkIterator[] mediaChunkIteratorArr) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (t(this.f34711g, elapsedRealtime)) {
                for (int i11 = this.f57474b - 1; i11 >= 0; i11--) {
                    if (!t(i11, elapsedRealtime)) {
                        this.f34711g = i11;
                        return;
                    }
                }
                throw new IllegalStateException();
            }
        }

        @Override // xj.g
        public int q() {
            return 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a  reason: collision with root package name */
        public final d.e f34712a;

        /* renamed from: b  reason: collision with root package name */
        public final long f34713b;

        /* renamed from: c  reason: collision with root package name */
        public final int f34714c;

        /* renamed from: d  reason: collision with root package name */
        public final boolean f34715d;

        public e(d.e eVar, long j11, int i11) {
            this.f34712a = eVar;
            this.f34713b = j11;
            this.f34714c = i11;
            this.f34715d = (eVar instanceof d.b) && ((d.b) eVar).f14101m;
        }
    }

    public f(h hVar, HlsPlaylistTracker hlsPlaylistTracker, Uri[] uriArr, Format[] formatArr, g gVar, zj.n nVar, s sVar, List<ci.i> list) {
        this.f34688a = hVar;
        this.f34694g = hlsPlaylistTracker;
        this.f34692e = uriArr;
        this.f34693f = formatArr;
        this.f34691d = sVar;
        this.f34696i = list;
        com.google.android.exoplayer2.upstream.a a11 = gVar.a(1);
        this.f34689b = a11;
        if (nVar != null) {
            a11.b(nVar);
        }
        this.f34690c = gVar.a(3);
        this.f34695h = new u((ci.i[]) formatArr);
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < uriArr.length; i11++) {
            if ((formatArr[i11].f9198e & 16384) == 0) {
                arrayList.add(Integer.valueOf(i11));
            }
        }
        this.f34703p = new d(this.f34695h, fl.d.k(arrayList));
    }

    private static Uri c(com.google.android.exoplayer2.source.hls.playlist.d dVar, d.e eVar) {
        String str;
        if (eVar == null || (str = eVar.f14112g) == null) {
            return null;
        }
        return i0.d(dVar.f37205a, str);
    }

    private Pair<Long, Integer> e(i iVar, boolean z11, com.google.android.exoplayer2.source.hls.playlist.d dVar, long j11, long j12) {
        List<d.b> list;
        long j13;
        if (iVar != null && !z11) {
            if (iVar.h()) {
                if (iVar.f34721o == -1) {
                    j13 = iVar.g();
                } else {
                    j13 = iVar.f29304j;
                }
                Long valueOf = Long.valueOf(j13);
                int i11 = iVar.f34721o;
                return new Pair<>(valueOf, Integer.valueOf(i11 != -1 ? i11 + 1 : -1));
            }
            return new Pair<>(Long.valueOf(iVar.f29304j), Integer.valueOf(iVar.f34721o));
        }
        long j14 = dVar.f14098s + j11;
        if (iVar != null && !this.f34702o) {
            j12 = iVar.f29260g;
        }
        if (!dVar.f14092m && j12 >= j14) {
            return new Pair<>(Long.valueOf(dVar.f14088i + dVar.f14095p.size()), -1);
        }
        long j15 = j12 - j11;
        int i12 = 0;
        int g11 = k0.g(dVar.f14095p, Long.valueOf(j15), true, !this.f34694g.h() || iVar == null);
        long j16 = g11 + dVar.f14088i;
        if (g11 >= 0) {
            d.C0252d c0252d = dVar.f14095p.get(g11);
            if (j15 < c0252d.f14110e + c0252d.f14108c) {
                list = c0252d.f14105m;
            } else {
                list = dVar.f14096q;
            }
            while (true) {
                if (i12 >= list.size()) {
                    break;
                }
                d.b bVar = list.get(i12);
                if (j15 >= bVar.f14110e + bVar.f14108c) {
                    i12++;
                } else if (bVar.f14100l) {
                    j16 += list == dVar.f14096q ? 1L : 0L;
                    r1 = i12;
                }
            }
        }
        return new Pair<>(Long.valueOf(j16), Integer.valueOf(r1));
    }

    private static e f(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j11, int i11) {
        int i12 = (int) (j11 - dVar.f14088i);
        if (i12 == dVar.f14095p.size()) {
            if (i11 == -1) {
                i11 = 0;
            }
            if (i11 < dVar.f14096q.size()) {
                return new e(dVar.f14096q.get(i11), j11, i11);
            }
            return null;
        }
        d.C0252d c0252d = dVar.f14095p.get(i12);
        if (i11 == -1) {
            return new e(c0252d, j11, -1);
        }
        if (i11 < c0252d.f14105m.size()) {
            return new e(c0252d.f14105m.get(i11), j11, i11);
        }
        int i13 = i12 + 1;
        if (i13 < dVar.f14095p.size()) {
            return new e(dVar.f14095p.get(i13), j11 + 1, -1);
        }
        if (dVar.f14096q.isEmpty()) {
            return null;
        }
        return new e(dVar.f14096q.get(0), j11 + 1, 0);
    }

    static List<d.e> h(com.google.android.exoplayer2.source.hls.playlist.d dVar, long j11, int i11) {
        int i12 = (int) (j11 - dVar.f14088i);
        if (i12 >= 0 && dVar.f14095p.size() >= i12) {
            ArrayList arrayList = new ArrayList();
            if (i12 < dVar.f14095p.size()) {
                if (i11 != -1) {
                    d.C0252d c0252d = dVar.f14095p.get(i12);
                    if (i11 == 0) {
                        arrayList.add(c0252d);
                    } else if (i11 < c0252d.f14105m.size()) {
                        List<d.b> list = c0252d.f14105m;
                        arrayList.addAll(list.subList(i11, list.size()));
                    }
                    i12++;
                }
                List<d.C0252d> list2 = dVar.f14095p;
                arrayList.addAll(list2.subList(i12, list2.size()));
                i11 = 0;
            }
            if (dVar.f14091l != -9223372036854775807L) {
                int i13 = i11 != -1 ? i11 : 0;
                if (i13 < dVar.f14096q.size()) {
                    List<d.b> list3 = dVar.f14096q;
                    arrayList.addAll(list3.subList(i13, list3.size()));
                }
            }
            return Collections.unmodifiableList(arrayList);
        }
        return com.google.common.collect.r.r();
    }

    private hj.e k(Uri uri, int i11) {
        if (uri == null) {
            return null;
        }
        byte[] c11 = this.f34697j.c(uri);
        if (c11 != null) {
            this.f34697j.b(uri, c11);
            return null;
        }
        return new a(this.f34690c, new b.C0259b().i(uri).b(1).a(), this.f34693f[i11], this.f34703p.q(), this.f34703p.g(), this.f34699l);
    }

    private long q(long j11) {
        long j12 = this.f34704q;
        if (j12 != -9223372036854775807L) {
            return j12 - j11;
        }
        return -9223372036854775807L;
    }

    private void u(com.google.android.exoplayer2.source.hls.playlist.d dVar) {
        this.f34704q = dVar.f14092m ? -9223372036854775807L : dVar.e() - this.f34694g.c();
    }

    public hj.n[] a(i iVar, long j11) {
        int i11;
        int b11 = iVar == null ? -1 : this.f34695h.b(iVar.f29257d);
        int length = this.f34703p.length();
        hj.n[] nVarArr = new hj.n[length];
        boolean z11 = false;
        int i12 = 0;
        while (i12 < length) {
            int e11 = this.f34703p.e(i12);
            Uri uri = this.f34692e[e11];
            if (!this.f34694g.g(uri)) {
                nVarArr[i12] = hj.n.f29305a;
                i11 = i12;
            } else {
                com.google.android.exoplayer2.source.hls.playlist.d m11 = this.f34694g.m(uri, z11);
                ak.a.e(m11);
                long c11 = m11.f14085f - this.f34694g.c();
                i11 = i12;
                Pair<Long, Integer> e12 = e(iVar, e11 != b11 ? true : z11, m11, c11, j11);
                nVarArr[i11] = new c(m11.f37205a, c11, h(m11, ((Long) e12.first).longValue(), ((Integer) e12.second).intValue()));
            }
            i12 = i11 + 1;
            z11 = false;
        }
        return nVarArr;
    }

    public int b(i iVar) {
        List<d.b> list;
        if (iVar.f34721o == -1) {
            return 1;
        }
        com.google.android.exoplayer2.source.hls.playlist.d dVar = (com.google.android.exoplayer2.source.hls.playlist.d) ak.a.e(this.f34694g.m(this.f34692e[this.f34695h.b(iVar.f29257d)], false));
        int i11 = (int) (iVar.f29304j - dVar.f14088i);
        if (i11 < 0) {
            return 1;
        }
        if (i11 < dVar.f14095p.size()) {
            list = dVar.f14095p.get(i11).f14105m;
        } else {
            list = dVar.f14096q;
        }
        if (iVar.f34721o >= list.size()) {
            return 2;
        }
        d.b bVar = list.get(iVar.f34721o);
        if (bVar.f14101m) {
            return 0;
        }
        return k0.c(Uri.parse(i0.c(dVar.f37205a, bVar.f14106a)), iVar.f29255b.f14632a) ? 1 : 2;
    }

    public void d(long j11, long j12, List<i> list, boolean z11, b bVar) {
        long j13;
        Uri uri;
        i iVar = list.isEmpty() ? null : (i) w.b(list);
        int b11 = iVar == null ? -1 : this.f34695h.b(iVar.f29257d);
        long j14 = j12 - j11;
        long q11 = q(j11);
        if (iVar != null && !this.f34702o) {
            long d11 = iVar.d();
            j14 = Math.max(0L, j14 - d11);
            if (q11 != -9223372036854775807L) {
                q11 = Math.max(0L, q11 - d11);
            }
        }
        this.f34703p.n(j11, j14, q11, list, a(iVar, j12));
        int o11 = this.f34703p.o();
        boolean z12 = b11 != o11;
        Uri uri2 = this.f34692e[o11];
        if (!this.f34694g.g(uri2)) {
            bVar.f34709c = uri2;
            this.f34705r &= uri2.equals(this.f34701n);
            this.f34701n = uri2;
            return;
        }
        com.google.android.exoplayer2.source.hls.playlist.d m11 = this.f34694g.m(uri2, true);
        ak.a.e(m11);
        this.f34702o = m11.f37207c;
        u(m11);
        long c11 = m11.f14085f - this.f34694g.c();
        Pair<Long, Integer> e11 = e(iVar, z12, m11, c11, j12);
        long longValue = ((Long) e11.first).longValue();
        int intValue = ((Integer) e11.second).intValue();
        if (longValue >= m11.f14088i || iVar == null || !z12) {
            j13 = c11;
            uri = uri2;
            b11 = o11;
        } else {
            Uri uri3 = this.f34692e[b11];
            com.google.android.exoplayer2.source.hls.playlist.d m12 = this.f34694g.m(uri3, true);
            ak.a.e(m12);
            j13 = m12.f14085f - this.f34694g.c();
            Pair<Long, Integer> e12 = e(iVar, false, m12, j13, j12);
            longValue = ((Long) e12.first).longValue();
            intValue = ((Integer) e12.second).intValue();
            uri = uri3;
            m11 = m12;
        }
        if (longValue < m11.f14088i) {
            this.f34700m = new BehindLiveWindowException();
            return;
        }
        e f11 = f(m11, longValue, intValue);
        if (f11 == null) {
            if (!m11.f14092m) {
                bVar.f34709c = uri;
                this.f34705r &= uri.equals(this.f34701n);
                this.f34701n = uri;
                return;
            } else if (!z11 && !m11.f14095p.isEmpty()) {
                f11 = new e((d.e) w.b(m11.f14095p), (m11.f14088i + m11.f14095p.size()) - 1, -1);
            } else {
                bVar.f34708b = true;
                return;
            }
        }
        this.f34705r = false;
        this.f34701n = null;
        Uri c12 = c(m11, f11.f34712a.f14107b);
        hj.e k11 = k(c12, b11);
        bVar.f34707a = k11;
        if (k11 != null) {
            return;
        }
        Uri c13 = c(m11, f11.f34712a);
        hj.e k12 = k(c13, b11);
        bVar.f34707a = k12;
        if (k12 != null) {
            return;
        }
        bVar.f34707a = i.j(this.f34688a, this.f34689b, this.f34693f[b11], j13, m11, f11, uri, this.f34696i, this.f34703p.q(), this.f34703p.g(), this.f34698k, this.f34691d, iVar, this.f34697j.a(c13), this.f34697j.a(c12));
    }

    public int g(long j11, List<? extends hj.m> list) {
        if (this.f34700m == null && this.f34703p.length() >= 2) {
            return this.f34703p.m(j11, list);
        }
        return list.size();
    }

    public u i() {
        return this.f34695h;
    }

    public xj.g j() {
        return this.f34703p;
    }

    public boolean l(hj.e eVar, long j11) {
        xj.g gVar = this.f34703p;
        return gVar.c(gVar.i(this.f34695h.b(eVar.f29257d)), j11);
    }

    public void m() {
        IOException iOException = this.f34700m;
        if (iOException == null) {
            Uri uri = this.f34701n;
            if (uri == null || !this.f34705r) {
                return;
            }
            this.f34694g.b(uri);
            return;
        }
        throw iOException;
    }

    public void n(hj.e eVar) {
        if (eVar instanceof a) {
            a aVar = (a) eVar;
            this.f34699l = aVar.h();
            this.f34697j.b(aVar.f29255b.f14632a, (byte[]) ak.a.e(aVar.j()));
        }
    }

    public boolean o(Uri uri, long j11) {
        int i11;
        int i12 = 0;
        while (true) {
            Uri[] uriArr = this.f34692e;
            if (i12 >= uriArr.length) {
                i12 = -1;
                break;
            } else if (uriArr[i12].equals(uri)) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1 || (i11 = this.f34703p.i(i12)) == -1) {
            return true;
        }
        this.f34705r = uri.equals(this.f34701n) | this.f34705r;
        return j11 == -9223372036854775807L || this.f34703p.c(i11, j11);
    }

    public void p() {
        this.f34700m = null;
    }

    public void r(boolean z11) {
        this.f34698k = z11;
    }

    public void s(xj.g gVar) {
        this.f34703p = gVar;
    }

    public boolean t(long j11, hj.e eVar, List<? extends hj.m> list) {
        if (this.f34700m != null) {
            return false;
        }
        return this.f34703p.k(j11, eVar, list);
    }
}