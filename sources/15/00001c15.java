package com.google.android.exoplayer2.source.dash;

import ak.k0;
import android.util.Pair;
import android.util.SparseArray;
import android.util.SparseIntArray;
import ci.i;
import ci.q;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.drm.g;
import com.google.android.exoplayer2.source.TrackGroup;
import com.google.android.exoplayer2.source.chunk.ChunkSampleStream;
import com.google.android.exoplayer2.source.dash.a;
import com.google.android.exoplayer2.source.dash.e;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.u;
import fj.r;
import fj.v;
import hj.h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import zj.l;
import zj.n;

/* loaded from: classes3.dex */
final class b implements i, u.a<h<com.google.android.exoplayer2.source.dash.a>>, h.b<com.google.android.exoplayer2.source.dash.a> {
    private static final Pattern A = Pattern.compile("CC([1-4])=(.+)");
    private static final Pattern B = Pattern.compile("([1-4])=lang:(\\w+)(,.+)?");

    /* renamed from: a  reason: collision with root package name */
    final int f13865a;

    /* renamed from: b  reason: collision with root package name */
    private final a.InterfaceC0250a f13866b;

    /* renamed from: c  reason: collision with root package name */
    private final n f13867c;

    /* renamed from: d  reason: collision with root package name */
    private final g f13868d;

    /* renamed from: e  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f13869e;

    /* renamed from: f  reason: collision with root package name */
    private final long f13870f;

    /* renamed from: g  reason: collision with root package name */
    private final l f13871g;

    /* renamed from: h  reason: collision with root package name */
    private final zj.b f13872h;

    /* renamed from: i  reason: collision with root package name */
    private final v f13873i;

    /* renamed from: j  reason: collision with root package name */
    private final a[] f13874j;

    /* renamed from: k  reason: collision with root package name */
    private final fj.c f13875k;

    /* renamed from: l  reason: collision with root package name */
    private final e f13876l;

    /* renamed from: n  reason: collision with root package name */
    private final k.a f13878n;

    /* renamed from: o  reason: collision with root package name */
    private final f.a f13879o;

    /* renamed from: p  reason: collision with root package name */
    private i.a f13880p;

    /* renamed from: w  reason: collision with root package name */
    private u f13883w;

    /* renamed from: x  reason: collision with root package name */
    private jj.b f13884x;

    /* renamed from: y  reason: collision with root package name */
    private int f13885y;

    /* renamed from: z  reason: collision with root package name */
    private List<jj.e> f13886z;

    /* renamed from: q  reason: collision with root package name */
    private ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] f13881q = F(0);

    /* renamed from: t  reason: collision with root package name */
    private d[] f13882t = new d[0];

    /* renamed from: m  reason: collision with root package name */
    private final IdentityHashMap<h<com.google.android.exoplayer2.source.dash.a>, e.c> f13877m = new IdentityHashMap<>();

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int[] f13887a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13888b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13889c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13890d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13891e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13892f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13893g;

        private a(int i11, int i12, int[] iArr, int i13, int i14, int i15, int i16) {
            this.f13888b = i11;
            this.f13887a = iArr;
            this.f13889c = i12;
            this.f13891e = i13;
            this.f13892f = i14;
            this.f13893g = i15;
            this.f13890d = i16;
        }

        public static a a(int[] iArr, int i11) {
            return new a(3, 1, iArr, i11, -1, -1, -1);
        }

        public static a b(int[] iArr, int i11) {
            return new a(5, 1, iArr, i11, -1, -1, -1);
        }

        public static a c(int i11) {
            return new a(5, 2, new int[0], -1, -1, -1, i11);
        }

        public static a d(int i11, int[] iArr, int i12, int i13, int i14) {
            return new a(i11, 0, iArr, i12, i13, i14, -1);
        }
    }

    public b(int i11, jj.b bVar, int i12, a.InterfaceC0250a interfaceC0250a, n nVar, g gVar, f.a aVar, com.google.android.exoplayer2.upstream.g gVar2, k.a aVar2, long j11, l lVar, zj.b bVar2, fj.c cVar, e.b bVar3) {
        this.f13865a = i11;
        this.f13884x = bVar;
        this.f13885y = i12;
        this.f13866b = interfaceC0250a;
        this.f13867c = nVar;
        this.f13868d = gVar;
        this.f13879o = aVar;
        this.f13869e = gVar2;
        this.f13878n = aVar2;
        this.f13870f = j11;
        this.f13871g = lVar;
        this.f13872h = bVar2;
        this.f13875k = cVar;
        this.f13876l = new e(bVar, bVar3, bVar2);
        this.f13883w = cVar.a(this.f13881q);
        jj.f d11 = bVar.d(i12);
        List<jj.e> list = d11.f33836d;
        this.f13886z = list;
        Pair<v, a[]> v11 = v(gVar, d11.f33835c, list);
        this.f13873i = (v) v11.first;
        this.f13874j = (a[]) v11.second;
    }

    private static int[][] A(List<jj.a> list) {
        int i11;
        jj.d w11;
        int size = list.size();
        SparseIntArray sparseIntArray = new SparseIntArray(size);
        ArrayList arrayList = new ArrayList(size);
        SparseArray sparseArray = new SparseArray(size);
        for (int i12 = 0; i12 < size; i12++) {
            sparseIntArray.put(list.get(i12).f33795a, i12);
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(Integer.valueOf(i12));
            arrayList.add(arrayList2);
            sparseArray.put(i12, arrayList2);
        }
        for (int i13 = 0; i13 < size; i13++) {
            jj.a aVar = list.get(i13);
            jj.d y11 = y(aVar.f33799e);
            if (y11 == null) {
                y11 = y(aVar.f33800f);
            }
            if (y11 == null || (i11 = sparseIntArray.get(Integer.parseInt(y11.f33827b), -1)) == -1) {
                i11 = i13;
            }
            if (i11 == i13 && (w11 = w(aVar.f33800f)) != null) {
                for (String str : k0.L0(w11.f33827b, ",")) {
                    int i14 = sparseIntArray.get(Integer.parseInt(str), -1);
                    if (i14 != -1) {
                        i11 = Math.min(i11, i14);
                    }
                }
            }
            if (i11 != i13) {
                List list2 = (List) sparseArray.get(i13);
                List list3 = (List) sparseArray.get(i11);
                list3.addAll(list2);
                sparseArray.put(i13, list3);
                arrayList.remove(list2);
            }
        }
        int size2 = arrayList.size();
        int[][] iArr = new int[size2];
        for (int i15 = 0; i15 < size2; i15++) {
            iArr[i15] = fl.d.k((Collection) arrayList.get(i15));
            Arrays.sort(iArr[i15]);
        }
        return iArr;
    }

    private int B(int i11, int[] iArr) {
        int i12 = iArr[i11];
        if (i12 == -1) {
            return -1;
        }
        int i13 = this.f13874j[i12].f13891e;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            int i15 = iArr[i14];
            if (i15 == i13 && this.f13874j[i15].f13889c == 0) {
                return i14;
            }
        }
        return -1;
    }

    private int[] C(xj.g[] gVarArr) {
        int[] iArr = new int[gVarArr.length];
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if (gVarArr[i11] != null) {
                iArr[i11] = this.f13873i.b(gVarArr[i11].j());
            } else {
                iArr[i11] = -1;
            }
        }
        return iArr;
    }

    private static boolean D(List<jj.a> list, int[] iArr) {
        for (int i11 : iArr) {
            List<jj.i> list2 = list.get(i11).f33797c;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                if (!list2.get(i12).f33849d.isEmpty()) {
                    return true;
                }
            }
        }
        return false;
    }

    private static int E(int i11, List<jj.a> list, int[][] iArr, boolean[] zArr, Format[][] formatArr) {
        int i12 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            if (D(list, iArr[i13])) {
                zArr[i13] = true;
                i12++;
            }
            formatArr[i13] = z(list, iArr[i13]);
            if (formatArr[i13].length != 0) {
                i12++;
            }
        }
        return i12;
    }

    private static ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] F(int i11) {
        return new h[i11];
    }

    private static ci.i[] H(jj.d dVar, Pattern pattern, ci.i iVar) {
        String str = dVar.f33827b;
        if (str == null) {
            return new ci.i[]{iVar};
        }
        String[] L0 = k0.L0(str, ";");
        ci.i[] iVarArr = new ci.i[L0.length];
        for (int i11 = 0; i11 < L0.length; i11++) {
            Matcher matcher = pattern.matcher(L0[i11]);
            if (!matcher.matches()) {
                return new ci.i[]{iVar};
            }
            int parseInt = Integer.parseInt(matcher.group(1));
            i.b a11 = iVar.a();
            String str2 = iVar.f9194a;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 12);
            sb2.append(str2);
            sb2.append(":");
            sb2.append(parseInt);
            iVarArr[i11] = a11.S(sb2.toString()).F(parseInt).V(matcher.group(2)).E();
        }
        return iVarArr;
    }

    private void J(xj.g[] gVarArr, boolean[] zArr, r[] rVarArr) {
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if (gVarArr[i11] == null || !zArr[i11]) {
                if (rVarArr[i11] instanceof h) {
                    ((h) rVarArr[i11]).P(this);
                } else if (rVarArr[i11] instanceof h.a) {
                    ((h.a) rVarArr[i11]).c();
                }
                rVarArr[i11] = null;
            }
        }
    }

    private void K(xj.g[] gVarArr, r[] rVarArr, int[] iArr) {
        boolean z11;
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            if ((rVarArr[i11] instanceof fj.e) || (rVarArr[i11] instanceof h.a)) {
                int B2 = B(i11, iArr);
                if (B2 == -1) {
                    z11 = rVarArr[i11] instanceof fj.e;
                } else {
                    z11 = (rVarArr[i11] instanceof h.a) && ((h.a) rVarArr[i11]).f29287a == rVarArr[B2];
                }
                if (!z11) {
                    if (rVarArr[i11] instanceof h.a) {
                        ((h.a) rVarArr[i11]).c();
                    }
                    rVarArr[i11] = null;
                }
            }
        }
    }

    private void L(xj.g[] gVarArr, r[] rVarArr, boolean[] zArr, long j11, int[] iArr) {
        for (int i11 = 0; i11 < gVarArr.length; i11++) {
            xj.g gVar = gVarArr[i11];
            if (gVar != null) {
                if (rVarArr[i11] == null) {
                    zArr[i11] = true;
                    a aVar = this.f13874j[iArr[i11]];
                    int i12 = aVar.f13889c;
                    if (i12 == 0) {
                        rVarArr[i11] = s(aVar, gVar, j11);
                    } else if (i12 == 2) {
                        rVarArr[i11] = new d(this.f13886z.get(aVar.f13890d), gVar.j().a(0), this.f13884x.f33804d);
                    }
                } else if (rVarArr[i11] instanceof h) {
                    ((com.google.android.exoplayer2.source.dash.a) ((h) rVarArr[i11]).D()).b(gVar);
                }
            }
        }
        for (int i13 = 0; i13 < gVarArr.length; i13++) {
            if (rVarArr[i13] == null && gVarArr[i13] != null) {
                a aVar2 = this.f13874j[iArr[i13]];
                if (aVar2.f13889c == 1) {
                    int B2 = B(i13, iArr);
                    if (B2 == -1) {
                        rVarArr[i13] = new fj.e();
                    } else {
                        rVarArr[i13] = ((h) rVarArr[B2]).S(j11, aVar2.f13888b);
                    }
                }
            }
        }
    }

    private static void i(List<jj.e> list, TrackGroup[] trackGroupArr, a[] aVarArr, int i11) {
        int i12 = 0;
        while (i12 < list.size()) {
            trackGroupArr[i11] = new fj.u(new i.b().S(list.get(i12).a()).e0("application/x-emsg").E());
            aVarArr[i11] = a.c(i12);
            i12++;
            i11++;
        }
    }

    private static int q(g gVar, List<jj.a> list, int[][] iArr, int i11, boolean[] zArr, Format[][] formatArr, TrackGroup[] trackGroupArr, a[] aVarArr) {
        int i12;
        int i13;
        int i14 = 0;
        int i15 = 0;
        while (i14 < i11) {
            int[] iArr2 = iArr[i14];
            ArrayList arrayList = new ArrayList();
            for (int i16 : iArr2) {
                arrayList.addAll(list.get(i16).f33797c);
            }
            int size = arrayList.size();
            ci.i[] iVarArr = new ci.i[size];
            for (int i17 = 0; i17 < size; i17++) {
                ci.i iVar = ((jj.i) arrayList.get(i17)).f33846a;
                iVarArr[i17] = iVar.b(gVar.c(iVar));
            }
            jj.a aVar = list.get(iArr2[0]);
            int i18 = i15 + 1;
            if (zArr[i14]) {
                i12 = i18 + 1;
            } else {
                i12 = i18;
                i18 = -1;
            }
            if (formatArr[i14].length != 0) {
                i13 = i12 + 1;
            } else {
                i13 = i12;
                i12 = -1;
            }
            trackGroupArr[i15] = new fj.u(iVarArr);
            aVarArr[i15] = a.d(aVar.f33796b, iArr2, i15, i18, i12);
            if (i18 != -1) {
                i.b bVar = new i.b();
                int i19 = aVar.f33795a;
                StringBuilder sb2 = new StringBuilder(16);
                sb2.append(i19);
                sb2.append(":emsg");
                trackGroupArr[i18] = new fj.u(bVar.S(sb2.toString()).e0("application/x-emsg").E());
                aVarArr[i18] = a.b(iArr2, i15);
            }
            if (i12 != -1) {
                trackGroupArr[i12] = new fj.u((ci.i[]) formatArr[i14]);
                aVarArr[i12] = a.a(iArr2, i15);
            }
            i14++;
            i15 = i13;
        }
        return i15;
    }

    private h<com.google.android.exoplayer2.source.dash.a> s(a aVar, xj.g gVar, long j11) {
        int i11;
        fj.u uVar;
        fj.u uVar2;
        int i12;
        int i13 = aVar.f13892f;
        boolean z11 = i13 != -1;
        e.c cVar = null;
        if (z11) {
            uVar = this.f13873i.a(i13);
            i11 = 1;
        } else {
            i11 = 0;
            uVar = null;
        }
        int i14 = aVar.f13893g;
        boolean z12 = i14 != -1;
        if (z12) {
            uVar2 = this.f13873i.a(i14);
            i11 += uVar2.f26350a;
        } else {
            uVar2 = null;
        }
        ci.i[] iVarArr = new ci.i[i11];
        int[] iArr = new int[i11];
        if (z11) {
            iVarArr[0] = uVar.a(0);
            iArr[0] = 5;
            i12 = 1;
        } else {
            i12 = 0;
        }
        ArrayList arrayList = new ArrayList();
        if (z12) {
            for (int i15 = 0; i15 < uVar2.f26350a; i15++) {
                iVarArr[i12] = uVar2.a(i15);
                iArr[i12] = 3;
                arrayList.add(iVarArr[i12]);
                i12++;
            }
        }
        if (this.f13884x.f33804d && z11) {
            cVar = this.f13876l.k();
        }
        e.c cVar2 = cVar;
        h<com.google.android.exoplayer2.source.dash.a> hVar = new h<>(aVar.f13888b, iArr, iVarArr, this.f13866b.a(this.f13871g, this.f13884x, this.f13885y, aVar.f13887a, gVar, aVar.f13888b, this.f13870f, z11, arrayList, cVar2, this.f13867c), this, this.f13872h, j11, this.f13868d, this.f13879o, this.f13869e, this.f13878n);
        synchronized (this) {
            this.f13877m.put(hVar, cVar2);
        }
        return hVar;
    }

    private static Pair<v, a[]> v(g gVar, List<jj.a> list, List<jj.e> list2) {
        int[][] A2 = A(list);
        int length = A2.length;
        boolean[] zArr = new boolean[length];
        ci.i[][] iVarArr = new ci.i[length];
        int E = E(length, list, A2, zArr, iVarArr) + length + list2.size();
        fj.u[] uVarArr = new fj.u[E];
        a[] aVarArr = new a[E];
        i(list2, uVarArr, aVarArr, q(gVar, list, A2, length, zArr, iVarArr, uVarArr, aVarArr));
        return Pair.create(new v(uVarArr), aVarArr);
    }

    private static jj.d w(List<jj.d> list) {
        return x(list, "urn:mpeg:dash:adaptation-set-switching:2016");
    }

    private static jj.d x(List<jj.d> list, String str) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            jj.d dVar = list.get(i11);
            if (str.equals(dVar.f33826a)) {
                return dVar;
            }
        }
        return null;
    }

    private static jj.d y(List<jj.d> list) {
        return x(list, "http://dashif.org/guidelines/trickmode");
    }

    private static Format[] z(List<jj.a> list, int[] iArr) {
        for (int i11 : iArr) {
            jj.a aVar = list.get(i11);
            List<jj.d> list2 = list.get(i11).f33798d;
            for (int i12 = 0; i12 < list2.size(); i12++) {
                jj.d dVar = list2.get(i12);
                if ("urn:scte:dash:cc:cea-608:2015".equals(dVar.f33826a)) {
                    i.b e02 = new i.b().e0("application/cea-608");
                    int i13 = aVar.f33795a;
                    StringBuilder sb2 = new StringBuilder(18);
                    sb2.append(i13);
                    sb2.append(":cea608");
                    return H(dVar, A, e02.S(sb2.toString()).E());
                } else if ("urn:scte:dash:cc:cea-708:2015".equals(dVar.f33826a)) {
                    i.b e03 = new i.b().e0("application/cea-708");
                    int i14 = aVar.f33795a;
                    StringBuilder sb3 = new StringBuilder(18);
                    sb3.append(i14);
                    sb3.append(":cea708");
                    return H(dVar, B, e03.S(sb3.toString()).E());
                }
            }
        }
        return new ci.i[0];
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: G */
    public void j(h<com.google.android.exoplayer2.source.dash.a> hVar) {
        this.f13880p.j(this);
    }

    public void I() {
        this.f13876l.o();
        for (h hVar : this.f13881q) {
            hVar.P(this);
        }
        this.f13880p = null;
    }

    public void M(jj.b bVar, int i11) {
        d[] dVarArr;
        this.f13884x = bVar;
        this.f13885y = i11;
        this.f13876l.q(bVar);
        h[] hVarArr = this.f13881q;
        if (hVarArr != null) {
            for (h hVar : hVarArr) {
                ((com.google.android.exoplayer2.source.dash.a) hVar.D()).h(bVar, i11);
            }
            this.f13880p.j(this);
        }
        this.f13886z = bVar.d(i11).f33836d;
        for (d dVar : this.f13882t) {
            Iterator<jj.e> it2 = this.f13886z.iterator();
            while (true) {
                if (it2.hasNext()) {
                    jj.e next = it2.next();
                    if (next.a().equals(dVar.b())) {
                        boolean z11 = true;
                        dVar.d(next, (bVar.f33804d && i11 == bVar.e() - 1) ? false : false);
                    }
                }
            }
        }
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        return this.f13883w.b();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f13883w.c();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, q qVar) {
        h[] hVarArr;
        for (h hVar : this.f13881q) {
            if (hVar.f29265a == 2) {
                return hVar.d(j11, qVar);
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        return this.f13883w.e(j11);
    }

    @Override // hj.h.b
    public synchronized void f(h<com.google.android.exoplayer2.source.dash.a> hVar) {
        e.c remove = this.f13877m.remove(hVar);
        if (remove != null) {
            remove.n();
        }
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        return this.f13883w.g();
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
        this.f13883w.h(j11);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        for (h hVar : this.f13881q) {
            hVar.R(j11);
        }
        for (d dVar : this.f13882t) {
            dVar.c(j11);
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f13880p = aVar;
        aVar.p(this);
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, r[] rVarArr, boolean[] zArr2, long j11) {
        int[] C = C(gVarArr);
        J(gVarArr, zArr, rVarArr);
        K(gVarArr, rVarArr, C);
        L(gVarArr, rVarArr, zArr2, j11, C);
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (r rVar : rVarArr) {
            if (rVar instanceof h) {
                arrayList.add((h) rVar);
            } else if (rVar instanceof d) {
                arrayList2.add((d) rVar);
            }
        }
        ChunkSampleStream<com.google.android.exoplayer2.source.dash.a>[] F = F(arrayList.size());
        this.f13881q = F;
        arrayList.toArray(F);
        d[] dVarArr = new d[arrayList2.size()];
        this.f13882t = dVarArr;
        arrayList2.toArray(dVarArr);
        this.f13883w = this.f13875k.a(this.f13881q);
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        this.f13871g.a();
    }

    @Override // com.google.android.exoplayer2.source.i
    public v t() {
        return this.f13873i;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        for (h hVar : this.f13881q) {
            hVar.u(j11, z11);
        }
    }
}