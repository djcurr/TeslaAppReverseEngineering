package kj;

import ak.k0;
import android.net.Uri;
import android.text.TextUtils;
import ci.i;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker;
import com.google.android.exoplayer2.source.hls.playlist.c;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.u;
import fj.v;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import kj.q;

/* loaded from: classes3.dex */
public final class k implements com.google.android.exoplayer2.source.i, q.b, HlsPlaylistTracker.b {

    /* renamed from: a  reason: collision with root package name */
    private final h f34733a;

    /* renamed from: b  reason: collision with root package name */
    private final HlsPlaylistTracker f34734b;

    /* renamed from: c  reason: collision with root package name */
    private final g f34735c;

    /* renamed from: d  reason: collision with root package name */
    private final zj.n f34736d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.exoplayer2.drm.g f34737e;

    /* renamed from: f  reason: collision with root package name */
    private final f.a f34738f;

    /* renamed from: g  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f34739g;

    /* renamed from: h  reason: collision with root package name */
    private final k.a f34740h;

    /* renamed from: i  reason: collision with root package name */
    private final zj.b f34741i;

    /* renamed from: l  reason: collision with root package name */
    private final fj.c f34744l;

    /* renamed from: m  reason: collision with root package name */
    private final boolean f34745m;

    /* renamed from: n  reason: collision with root package name */
    private final int f34746n;

    /* renamed from: o  reason: collision with root package name */
    private final boolean f34747o;

    /* renamed from: p  reason: collision with root package name */
    private i.a f34748p;

    /* renamed from: q  reason: collision with root package name */
    private int f34749q;

    /* renamed from: t  reason: collision with root package name */
    private v f34750t;

    /* renamed from: y  reason: collision with root package name */
    private u f34753y;

    /* renamed from: j  reason: collision with root package name */
    private final IdentityHashMap<fj.r, Integer> f34742j = new IdentityHashMap<>();

    /* renamed from: k  reason: collision with root package name */
    private final s f34743k = new s();

    /* renamed from: w  reason: collision with root package name */
    private q[] f34751w = new q[0];

    /* renamed from: x  reason: collision with root package name */
    private q[] f34752x = new q[0];

    public k(h hVar, HlsPlaylistTracker hlsPlaylistTracker, g gVar, zj.n nVar, com.google.android.exoplayer2.drm.g gVar2, f.a aVar, com.google.android.exoplayer2.upstream.g gVar3, k.a aVar2, zj.b bVar, fj.c cVar, boolean z11, int i11, boolean z12) {
        this.f34733a = hVar;
        this.f34734b = hlsPlaylistTracker;
        this.f34735c = gVar;
        this.f34736d = nVar;
        this.f34737e = gVar2;
        this.f34738f = aVar;
        this.f34739g = gVar3;
        this.f34740h = aVar2;
        this.f34741i = bVar;
        this.f34744l = cVar;
        this.f34745m = z11;
        this.f34746n = i11;
        this.f34747o = z12;
        this.f34753y = cVar.a(new u[0]);
    }

    private void q(long j11, List<c.a> list, List<q> list2, List<int[]> list3, Map<String, com.google.android.exoplayer2.drm.e> map) {
        ArrayList arrayList = new ArrayList(list.size());
        ArrayList arrayList2 = new ArrayList(list.size());
        ArrayList arrayList3 = new ArrayList(list.size());
        HashSet hashSet = new HashSet();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11).f14076c;
            if (hashSet.add(str)) {
                arrayList.clear();
                arrayList2.clear();
                arrayList3.clear();
                boolean z11 = true;
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (k0.c(str, list.get(i12).f14076c)) {
                        c.a aVar = list.get(i12);
                        arrayList3.add(Integer.valueOf(i12));
                        arrayList.add(aVar.f14074a);
                        arrayList2.add(aVar.f14075b);
                        z11 &= k0.J(aVar.f14075b.f9202i, 1) == 1;
                    }
                }
                q w11 = w(1, (Uri[]) arrayList.toArray((Uri[]) k0.k(new Uri[0])), (ci.i[]) arrayList2.toArray(new ci.i[0]), null, Collections.emptyList(), map, j11);
                list3.add(fl.d.k(arrayList3));
                list2.add(w11);
                if (this.f34745m && z11) {
                    w11.c0(new fj.u[]{new fj.u((ci.i[]) arrayList2.toArray(new ci.i[0]))}, 0, new int[0]);
                }
            }
        }
    }

    private void s(com.google.android.exoplayer2.source.hls.playlist.c cVar, long j11, List<q> list, List<int[]> list2, Map<String, com.google.android.exoplayer2.drm.e> map) {
        boolean z11;
        boolean z12;
        int size = cVar.f14065e.size();
        int[] iArr = new int[size];
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < cVar.f14065e.size(); i13++) {
            ci.i iVar = cVar.f14065e.get(i13).f14078b;
            if (iVar.f9211t <= 0 && k0.K(iVar.f9202i, 2) == null) {
                if (k0.K(iVar.f9202i, 1) != null) {
                    iArr[i13] = 1;
                    i12++;
                } else {
                    iArr[i13] = -1;
                }
            } else {
                iArr[i13] = 2;
                i11++;
            }
        }
        if (i11 > 0) {
            size = i11;
            z11 = true;
            z12 = false;
        } else if (i12 < size) {
            size -= i12;
            z11 = false;
            z12 = true;
        } else {
            z11 = false;
            z12 = false;
        }
        Uri[] uriArr = new Uri[size];
        ci.i[] iVarArr = new ci.i[size];
        int[] iArr2 = new int[size];
        int i14 = 0;
        for (int i15 = 0; i15 < cVar.f14065e.size(); i15++) {
            if ((!z11 || iArr[i15] == 2) && (!z12 || iArr[i15] != 1)) {
                c.b bVar = cVar.f14065e.get(i15);
                uriArr[i14] = bVar.f14077a;
                iVarArr[i14] = bVar.f14078b;
                iArr2[i14] = i15;
                i14++;
            }
        }
        String str = iVarArr[0].f9202i;
        int J = k0.J(str, 2);
        int J2 = k0.J(str, 1);
        boolean z13 = J2 <= 1 && J <= 1 && J2 + J > 0;
        q w11 = w(0, uriArr, iVarArr, cVar.f14070j, cVar.f14071k, map, j11);
        list.add(w11);
        list2.add(iArr2);
        if (this.f34745m && z13) {
            ArrayList arrayList = new ArrayList();
            if (J > 0) {
                ci.i[] iVarArr2 = new ci.i[size];
                for (int i16 = 0; i16 < size; i16++) {
                    iVarArr2[i16] = z(iVarArr[i16]);
                }
                arrayList.add(new fj.u(iVarArr2));
                if (J2 > 0 && (cVar.f14070j != null || cVar.f14067g.isEmpty())) {
                    arrayList.add(new fj.u(x(iVarArr[0], cVar.f14070j, false)));
                }
                List<ci.i> list3 = cVar.f14071k;
                if (list3 != null) {
                    for (int i17 = 0; i17 < list3.size(); i17++) {
                        arrayList.add(new fj.u(list3.get(i17)));
                    }
                }
            } else {
                ci.i[] iVarArr3 = new ci.i[size];
                for (int i18 = 0; i18 < size; i18++) {
                    iVarArr3[i18] = x(iVarArr[i18], cVar.f14070j, true);
                }
                arrayList.add(new fj.u(iVarArr3));
            }
            fj.u uVar = new fj.u(new i.b().S("ID3").e0("application/id3").E());
            arrayList.add(uVar);
            w11.c0((fj.u[]) arrayList.toArray(new fj.u[0]), 0, arrayList.indexOf(uVar));
        }
    }

    private void v(long j11) {
        Map<String, com.google.android.exoplayer2.drm.e> emptyMap;
        com.google.android.exoplayer2.source.hls.playlist.c cVar = (com.google.android.exoplayer2.source.hls.playlist.c) ak.a.e(this.f34734b.d());
        if (this.f34747o) {
            emptyMap = y(cVar.f14073m);
        } else {
            emptyMap = Collections.emptyMap();
        }
        Map<String, com.google.android.exoplayer2.drm.e> map = emptyMap;
        boolean z11 = !cVar.f14065e.isEmpty();
        List<c.a> list = cVar.f14067g;
        List<c.a> list2 = cVar.f14068h;
        this.f34749q = 0;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        if (z11) {
            s(cVar, j11, arrayList, arrayList2, map);
        }
        q(j11, list, arrayList, arrayList2, map);
        int i11 = 0;
        while (i11 < list2.size()) {
            c.a aVar = list2.get(i11);
            int i12 = i11;
            q w11 = w(3, new Uri[]{aVar.f14074a}, new ci.i[]{aVar.f14075b}, null, Collections.emptyList(), map, j11);
            arrayList2.add(new int[]{i12});
            arrayList.add(w11);
            w11.c0(new fj.u[]{new fj.u(aVar.f14075b)}, 0, new int[0]);
            i11 = i12 + 1;
        }
        this.f34751w = (q[]) arrayList.toArray(new q[0]);
        int[][] iArr = (int[][]) arrayList2.toArray(new int[0]);
        q[] qVarArr = this.f34751w;
        this.f34749q = qVarArr.length;
        qVarArr[0].l0(true);
        for (q qVar : this.f34751w) {
            qVar.B();
        }
        this.f34752x = this.f34751w;
    }

    private q w(int i11, Uri[] uriArr, Format[] formatArr, ci.i iVar, List<ci.i> list, Map<String, com.google.android.exoplayer2.drm.e> map, long j11) {
        return new q(i11, this, new f(this.f34733a, this.f34734b, uriArr, formatArr, this.f34735c, this.f34736d, this.f34743k, list), map, this.f34741i, j11, iVar, this.f34737e, this.f34738f, this.f34739g, this.f34740h, this.f34746n);
    }

    private static ci.i x(ci.i iVar, ci.i iVar2, boolean z11) {
        String str;
        int i11;
        int i12;
        String str2;
        String str3;
        wi.a aVar;
        int i13;
        if (iVar2 != null) {
            str2 = iVar2.f9202i;
            aVar = iVar2.f9203j;
            int i14 = iVar2.C;
            i11 = iVar2.f9197d;
            int i15 = iVar2.f9198e;
            String str4 = iVar2.f9196c;
            str3 = iVar2.f9195b;
            i12 = i14;
            i13 = i15;
            str = str4;
        } else {
            String K = k0.K(iVar.f9202i, 1);
            wi.a aVar2 = iVar.f9203j;
            if (z11) {
                int i16 = iVar.C;
                int i17 = iVar.f9197d;
                int i18 = iVar.f9198e;
                str = iVar.f9196c;
                str2 = K;
                str3 = iVar.f9195b;
                i12 = i16;
                i11 = i17;
                aVar = aVar2;
                i13 = i18;
            } else {
                str = null;
                i11 = 0;
                i12 = -1;
                str2 = K;
                str3 = null;
                aVar = aVar2;
                i13 = 0;
            }
        }
        return new i.b().S(iVar.f9194a).U(str3).K(iVar.f9204k).e0(ak.r.g(str2)).I(str2).X(aVar).G(z11 ? iVar.f9199f : -1).Z(z11 ? iVar.f9200g : -1).H(i12).g0(i11).c0(i13).V(str).E();
    }

    private static Map<String, com.google.android.exoplayer2.drm.e> y(List<com.google.android.exoplayer2.drm.e> list) {
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        int i11 = 0;
        while (i11 < arrayList.size()) {
            com.google.android.exoplayer2.drm.e eVar = list.get(i11);
            String str = eVar.f13350c;
            i11++;
            int i12 = i11;
            while (i12 < arrayList.size()) {
                com.google.android.exoplayer2.drm.e eVar2 = (com.google.android.exoplayer2.drm.e) arrayList.get(i12);
                if (TextUtils.equals(eVar2.f13350c, str)) {
                    eVar = eVar.i(eVar2);
                    arrayList.remove(i12);
                } else {
                    i12++;
                }
            }
            hashMap.put(str, eVar);
        }
        return hashMap;
    }

    private static ci.i z(ci.i iVar) {
        String K = k0.K(iVar.f9202i, 2);
        return new i.b().S(iVar.f9194a).U(iVar.f9195b).K(iVar.f9204k).e0(ak.r.g(K)).I(K).X(iVar.f9203j).G(iVar.f9199f).Z(iVar.f9200g).j0(iVar.f9210q).Q(iVar.f9211t).P(iVar.f9212w).g0(iVar.f9197d).c0(iVar.f9198e).E();
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: A */
    public void j(q qVar) {
        this.f34748p.j(this);
    }

    public void B() {
        this.f34734b.a(this);
        for (q qVar : this.f34751w) {
            qVar.e0();
        }
        this.f34748p = null;
    }

    @Override // kj.q.b
    public void a() {
        q[] qVarArr;
        int i11 = this.f34749q - 1;
        this.f34749q = i11;
        if (i11 > 0) {
            return;
        }
        int i12 = 0;
        for (q qVar : this.f34751w) {
            i12 += qVar.t().f26354a;
        }
        fj.u[] uVarArr = new fj.u[i12];
        int i13 = 0;
        for (q qVar2 : this.f34751w) {
            int i14 = qVar2.t().f26354a;
            int i15 = 0;
            while (i15 < i14) {
                uVarArr[i13] = qVar2.t().a(i15);
                i15++;
                i13++;
            }
        }
        this.f34750t = new v(uVarArr);
        this.f34748p.p(this);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return this.f34753y.b();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f34753y.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        if (this.f34750t == null) {
            for (q qVar : this.f34751w) {
                qVar.B();
            }
            return false;
        }
        return this.f34753y.e(j11);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public void f() {
        for (q qVar : this.f34751w) {
            qVar.a0();
        }
        this.f34748p.j(this);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return this.f34753y.g();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        this.f34753y.h(j11);
    }

    @Override // com.google.android.exoplayer2.source.hls.playlist.HlsPlaylistTracker.b
    public boolean i(Uri uri, long j11) {
        boolean z11 = true;
        for (q qVar : this.f34751w) {
            z11 &= qVar.Z(uri, j11);
        }
        this.f34748p.j(this);
        return z11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        q[] qVarArr = this.f34752x;
        if (qVarArr.length > 0) {
            boolean h02 = qVarArr[0].h0(j11, false);
            int i11 = 1;
            while (true) {
                q[] qVarArr2 = this.f34752x;
                if (i11 >= qVarArr2.length) {
                    break;
                }
                qVarArr2[i11].h0(j11, h02);
                i11++;
            }
            if (h02) {
                this.f34743k.b();
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f34748p = aVar;
        this.f34734b.f(this);
        v(j11);
    }

    @Override // kj.q.b
    public void n(Uri uri) {
        this.f34734b.e(uri);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
        fj.r[] rVarArr2 = rVarArr;
        int[] iArr = new int[gVarArr.length];
        int[] iArr2 = new int[gVarArr.length];
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            iArr[i11] = rVarArr2[i11] == null ? -1 : this.f34742j.get(rVarArr2[i11]).intValue();
            iArr2[i11] = -1;
            if (gVarArr[i11] != null) {
                fj.u j12 = gVarArr[i11].j();
                int i12 = 0;
                while (true) {
                    q[] qVarArr = this.f34751w;
                    if (i12 >= qVarArr.length) {
                        break;
                    } else if (qVarArr[i12].t().b(j12) != -1) {
                        iArr2[i11] = i12;
                        break;
                    } else {
                        i12++;
                    }
                }
            }
        }
        this.f34742j.clear();
        int length = gVarArr.length;
        fj.r[] rVarArr3 = new fj.r[length];
        fj.r[] rVarArr4 = new fj.r[gVarArr.length];
        xj.g[] gVarArr2 = new xj.g[gVarArr.length];
        q[] qVarArr2 = new q[this.f34751w.length];
        int i13 = 0;
        int i14 = 0;
        boolean z11 = false;
        while (i14 < this.f34751w.length) {
            for (int i15 = 0; i15 < gVarArr.length; i15++) {
                xj.g gVar = null;
                rVarArr4[i15] = iArr[i15] == i14 ? rVarArr2[i15] : null;
                if (iArr2[i15] == i14) {
                    gVar = gVarArr[i15];
                }
                gVarArr2[i15] = gVar;
            }
            q qVar = this.f34751w[i14];
            int i16 = i13;
            int i17 = length;
            int i18 = i14;
            xj.g[] gVarArr3 = gVarArr2;
            q[] qVarArr3 = qVarArr2;
            boolean i02 = qVar.i0(gVarArr2, zArr, rVarArr4, zArr2, j11, z11);
            int i19 = 0;
            boolean z12 = false;
            while (true) {
                if (i19 >= gVarArr.length) {
                    break;
                }
                fj.r rVar = rVarArr4[i19];
                if (iArr2[i19] == i18) {
                    ak.a.e(rVar);
                    rVarArr3[i19] = rVar;
                    this.f34742j.put(rVar, Integer.valueOf(i18));
                    z12 = true;
                } else if (iArr[i19] == i18) {
                    ak.a.f(rVar == null);
                }
                i19++;
            }
            if (z12) {
                qVarArr3[i16] = qVar;
                i13 = i16 + 1;
                if (i16 == 0) {
                    qVar.l0(true);
                    if (!i02) {
                        q[] qVarArr4 = this.f34752x;
                        if (qVarArr4.length != 0) {
                            if (qVar == qVarArr4[0]) {
                            }
                            this.f34743k.b();
                            z11 = true;
                        }
                    }
                    this.f34743k.b();
                    z11 = true;
                } else {
                    qVar.l0(false);
                }
            } else {
                i13 = i16;
            }
            i14 = i18 + 1;
            qVarArr2 = qVarArr3;
            length = i17;
            gVarArr2 = gVarArr3;
            rVarArr2 = rVarArr;
        }
        System.arraycopy(rVarArr3, 0, rVarArr2, 0, length);
        q[] qVarArr5 = (q[]) k0.B0(qVarArr2, i13);
        this.f34752x = qVarArr5;
        this.f34753y = this.f34744l.a(qVarArr5);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        for (q qVar : this.f34751w) {
            qVar.r();
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public v t() {
        return (v) ak.a.e(this.f34750t);
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        for (q qVar : this.f34752x) {
            qVar.u(j11, z11);
        }
    }
}