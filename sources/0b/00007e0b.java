package kj;

import ak.k0;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.util.SparseIntArray;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.upstream.HttpDataSource;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.g;
import com.google.common.collect.r;
import com.google.common.collect.w;
import fj.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import ji.x;
import kj.f;
import wi.a;

/* loaded from: classes3.dex */
public final class q implements Loader.b<hj.e>, Loader.f, u, ji.j, t.b {
    private static final Set<Integer> Q2 = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 5)));
    private Set<Integer> A;
    private SparseIntArray B;
    private x C;
    private int E;
    private int F;
    private boolean G;
    private boolean H;
    private int K;
    private ci.i L;
    private ci.i O;
    private boolean P;
    private v Q;
    private boolean Q1;
    private Set<fj.u> R;
    private int[] T;
    private boolean V1;
    private int Y;

    /* renamed from: a */
    private final int f34761a;

    /* renamed from: b */
    private final b f34762b;

    /* renamed from: b1 */
    private boolean f34763b1;

    /* renamed from: b2 */
    private boolean f34764b2;

    /* renamed from: c */
    private final f f34765c;

    /* renamed from: d */
    private final zj.b f34766d;

    /* renamed from: e */
    private final ci.i f34767e;

    /* renamed from: f */
    private final com.google.android.exoplayer2.drm.g f34768f;

    /* renamed from: g */
    private final f.a f34769g;

    /* renamed from: g1 */
    private boolean[] f34770g1;

    /* renamed from: g2 */
    private boolean f34771g2;

    /* renamed from: h */
    private final com.google.android.exoplayer2.upstream.g f34772h;

    /* renamed from: j */
    private final k.a f34774j;

    /* renamed from: k */
    private final int f34775k;

    /* renamed from: m */
    private final ArrayList<i> f34777m;

    /* renamed from: n */
    private final List<i> f34778n;

    /* renamed from: o */
    private final Runnable f34779o;

    /* renamed from: p */
    private final Runnable f34780p;

    /* renamed from: p1 */
    private boolean[] f34781p1;

    /* renamed from: p2 */
    private long f34782p2;

    /* renamed from: q */
    private final Handler f34783q;

    /* renamed from: t */
    private final ArrayList<m> f34784t;

    /* renamed from: w */
    private final Map<String, com.google.android.exoplayer2.drm.e> f34785w;

    /* renamed from: x */
    private hj.e f34786x;

    /* renamed from: x1 */
    private long f34787x1;

    /* renamed from: x2 */
    private com.google.android.exoplayer2.drm.e f34788x2;

    /* renamed from: y */
    private d[] f34789y;

    /* renamed from: y1 */
    private long f34790y1;

    /* renamed from: y2 */
    private i f34791y2;

    /* renamed from: i */
    private final Loader f34773i = new Loader("Loader:HlsSampleStreamWrapper");

    /* renamed from: l */
    private final f.b f34776l = new f.b();

    /* renamed from: z */
    private int[] f34792z = new int[0];

    /* loaded from: classes3.dex */
    public interface b extends u.a<q> {
        void a();

        void n(Uri uri);
    }

    /* loaded from: classes3.dex */
    private static class c implements x {

        /* renamed from: g */
        private static final ci.i f34793g = new i.b().e0("application/id3").E();

        /* renamed from: h */
        private static final ci.i f34794h = new i.b().e0("application/x-emsg").E();

        /* renamed from: a */
        private final yi.b f34795a = new yi.b();

        /* renamed from: b */
        private final x f34796b;

        /* renamed from: c */
        private final ci.i f34797c;

        /* renamed from: d */
        private ci.i f34798d;

        /* renamed from: e */
        private byte[] f34799e;

        /* renamed from: f */
        private int f34800f;

        public c(x xVar, int i11) {
            this.f34796b = xVar;
            if (i11 == 1) {
                this.f34797c = f34793g;
            } else if (i11 == 3) {
                this.f34797c = f34794h;
            } else {
                StringBuilder sb2 = new StringBuilder(33);
                sb2.append("Unknown metadataType: ");
                sb2.append(i11);
                throw new IllegalArgumentException(sb2.toString());
            }
            this.f34799e = new byte[0];
            this.f34800f = 0;
        }

        private boolean g(yi.a aVar) {
            ci.i D = aVar.D();
            return D != null && k0.c(this.f34797c.f9205l, D.f9205l);
        }

        private void h(int i11) {
            byte[] bArr = this.f34799e;
            if (bArr.length < i11) {
                this.f34799e = Arrays.copyOf(bArr, i11 + (i11 / 2));
            }
        }

        private ak.v i(int i11, int i12) {
            int i13 = this.f34800f - i12;
            ak.v vVar = new ak.v(Arrays.copyOfRange(this.f34799e, i13 - i11, i13));
            byte[] bArr = this.f34799e;
            System.arraycopy(bArr, i13, bArr, 0, i12);
            this.f34800f = i12;
            return vVar;
        }

        @Override // ji.x
        public int b(zj.f fVar, int i11, boolean z11, int i12) {
            h(this.f34800f + i11);
            int read = fVar.read(this.f34799e, this.f34800f, i11);
            if (read != -1) {
                this.f34800f += read;
                return read;
            } else if (z11) {
                return -1;
            } else {
                throw new EOFException();
            }
        }

        @Override // ji.x
        public void c(ak.v vVar, int i11, int i12) {
            h(this.f34800f + i11);
            vVar.j(this.f34799e, this.f34800f, i11);
            this.f34800f += i11;
        }

        @Override // ji.x
        public void d(ci.i iVar) {
            this.f34798d = iVar;
            this.f34796b.d(this.f34797c);
        }

        @Override // ji.x
        public void f(long j11, int i11, int i12, int i13, x.a aVar) {
            ak.a.e(this.f34798d);
            ak.v i14 = i(i12, i13);
            if (!k0.c(this.f34798d.f9205l, this.f34797c.f9205l)) {
                if ("application/x-emsg".equals(this.f34798d.f9205l)) {
                    yi.a c11 = this.f34795a.c(i14);
                    if (!g(c11)) {
                        ak.o.h("EmsgUnwrappingTrackOutput", String.format("Ignoring EMSG. Expected it to contain wrapped %s but actual wrapped format: %s", this.f34797c.f9205l, c11.D()));
                        return;
                    }
                    i14 = new ak.v((byte[]) ak.a.e(c11.D1()));
                } else {
                    String valueOf = String.valueOf(this.f34798d.f9205l);
                    ak.o.h("EmsgUnwrappingTrackOutput", valueOf.length() != 0 ? "Ignoring sample for unsupported format: ".concat(valueOf) : new String("Ignoring sample for unsupported format: "));
                    return;
                }
            }
            int a11 = i14.a();
            this.f34796b.e(i14, a11);
            this.f34796b.f(j11, i11, a11, i13, aVar);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d extends com.google.android.exoplayer2.source.t {
        private final Map<String, com.google.android.exoplayer2.drm.e> J;
        private com.google.android.exoplayer2.drm.e K;

        private wi.a f0(wi.a aVar) {
            if (aVar == null) {
                return null;
            }
            int d11 = aVar.d();
            int i11 = 0;
            int i12 = 0;
            while (true) {
                if (i12 >= d11) {
                    i12 = -1;
                    break;
                }
                a.b c11 = aVar.c(i12);
                if ((c11 instanceof bj.l) && "com.apple.streaming.transportStreamTimestamp".equals(((bj.l) c11).f7706b)) {
                    break;
                }
                i12++;
            }
            if (i12 == -1) {
                return aVar;
            }
            if (d11 == 1) {
                return null;
            }
            a.b[] bVarArr = new a.b[d11 - 1];
            while (i11 < d11) {
                if (i11 != i12) {
                    bVarArr[i11 < i12 ? i11 : i11 - 1] = aVar.c(i11);
                }
                i11++;
            }
            return new wi.a(bVarArr);
        }

        @Override // com.google.android.exoplayer2.source.t, ji.x
        public void f(long j11, int i11, int i12, int i13, x.a aVar) {
            super.f(j11, i11, i12, i13, aVar);
        }

        public void g0(com.google.android.exoplayer2.drm.e eVar) {
            this.K = eVar;
            H();
        }

        public void h0(i iVar) {
            d0(iVar.f34717k);
        }

        @Override // com.google.android.exoplayer2.source.t
        public ci.i v(ci.i iVar) {
            com.google.android.exoplayer2.drm.e eVar;
            com.google.android.exoplayer2.drm.e eVar2 = this.K;
            if (eVar2 == null) {
                eVar2 = iVar.f9208o;
            }
            if (eVar2 != null && (eVar = this.J.get(eVar2.f13350c)) != null) {
                eVar2 = eVar;
            }
            wi.a f02 = f0(iVar.f9203j);
            if (eVar2 != iVar.f9208o || f02 != iVar.f9203j) {
                iVar = iVar.a().L(eVar2).X(f02).E();
            }
            return super.v(iVar);
        }

        private d(zj.b bVar, Looper looper, com.google.android.exoplayer2.drm.g gVar, f.a aVar, Map<String, com.google.android.exoplayer2.drm.e> map) {
            super(bVar, looper, gVar, aVar);
            this.J = map;
        }
    }

    public q(int i11, b bVar, f fVar, Map<String, com.google.android.exoplayer2.drm.e> map, zj.b bVar2, long j11, ci.i iVar, com.google.android.exoplayer2.drm.g gVar, f.a aVar, com.google.android.exoplayer2.upstream.g gVar2, k.a aVar2, int i12) {
        this.f34761a = i11;
        this.f34762b = bVar;
        this.f34765c = fVar;
        this.f34785w = map;
        this.f34766d = bVar2;
        this.f34767e = iVar;
        this.f34768f = gVar;
        this.f34769g = aVar;
        this.f34772h = gVar2;
        this.f34774j = aVar2;
        this.f34775k = i12;
        Set<Integer> set = Q2;
        this.A = new HashSet(set.size());
        this.B = new SparseIntArray(set.size());
        this.f34789y = new d[0];
        this.f34781p1 = new boolean[0];
        this.f34770g1 = new boolean[0];
        ArrayList<i> arrayList = new ArrayList<>();
        this.f34777m = arrayList;
        this.f34778n = Collections.unmodifiableList(arrayList);
        this.f34784t = new ArrayList<>();
        this.f34779o = new Runnable() { // from class: kj.p
            {
                q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q.w(q.this);
            }
        };
        this.f34780p = new Runnable() { // from class: kj.o
            {
                q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q.v(q.this);
            }
        };
        this.f34783q = k0.x();
        this.f34787x1 = j11;
        this.f34790y1 = j11;
    }

    private boolean A(int i11) {
        for (int i12 = i11; i12 < this.f34777m.size(); i12++) {
            if (this.f34777m.get(i12).f34720n) {
                return false;
            }
        }
        i iVar = this.f34777m.get(i11);
        for (int i13 = 0; i13 < this.f34789y.length; i13++) {
            if (this.f34789y[i13].B() > iVar.m(i13)) {
                return false;
            }
        }
        return true;
    }

    private static ji.g C(int i11, int i12) {
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("Unmapped track with id ");
        sb2.append(i11);
        sb2.append(" of type ");
        sb2.append(i12);
        ak.o.h("HlsSampleStreamWrapper", sb2.toString());
        return new ji.g();
    }

    private com.google.android.exoplayer2.source.t D(int i11, int i12) {
        int length = this.f34789y.length;
        boolean z11 = true;
        if (i12 != 1 && i12 != 2) {
            z11 = false;
        }
        d dVar = new d(this.f34766d, this.f34783q.getLooper(), this.f34768f, this.f34769g, this.f34785w);
        if (z11) {
            dVar.g0(this.f34788x2);
        }
        dVar.Y(this.f34782p2);
        i iVar = this.f34791y2;
        if (iVar != null) {
            dVar.h0(iVar);
        }
        dVar.b0(this);
        int i13 = length + 1;
        int[] copyOf = Arrays.copyOf(this.f34792z, i13);
        this.f34792z = copyOf;
        copyOf[length] = i11;
        this.f34789y = (d[]) k0.z0(this.f34789y, dVar);
        boolean[] copyOf2 = Arrays.copyOf(this.f34781p1, i13);
        this.f34781p1 = copyOf2;
        copyOf2[length] = z11;
        this.f34763b1 = copyOf2[length] | this.f34763b1;
        this.A.add(Integer.valueOf(i12));
        this.B.append(i12, length);
        if (M(i12) > M(this.E)) {
            this.F = length;
            this.E = i12;
        }
        this.f34770g1 = Arrays.copyOf(this.f34770g1, i13);
        return dVar;
    }

    private v E(fj.u[] uVarArr) {
        for (int i11 = 0; i11 < uVarArr.length; i11++) {
            fj.u uVar = uVarArr[i11];
            ci.i[] iVarArr = new ci.i[uVar.f26350a];
            for (int i12 = 0; i12 < uVar.f26350a; i12++) {
                ci.i a11 = uVar.a(i12);
                iVarArr[i12] = a11.b(this.f34768f.c(a11));
            }
            uVarArr[i11] = new fj.u(iVarArr);
        }
        return new v(uVarArr);
    }

    private static ci.i F(ci.i iVar, ci.i iVar2, boolean z11) {
        String d11;
        String str;
        if (iVar == null) {
            return iVar2;
        }
        int l11 = ak.r.l(iVar2.f9205l);
        if (k0.J(iVar.f9202i, l11) == 1) {
            d11 = k0.K(iVar.f9202i, l11);
            str = ak.r.g(d11);
        } else {
            d11 = ak.r.d(iVar.f9202i, iVar2.f9205l);
            str = iVar2.f9205l;
        }
        i.b Q = iVar2.a().S(iVar.f9194a).U(iVar.f9195b).V(iVar.f9196c).g0(iVar.f9197d).c0(iVar.f9198e).G(z11 ? iVar.f9199f : -1).Z(z11 ? iVar.f9200g : -1).I(d11).j0(iVar.f9210q).Q(iVar.f9211t);
        if (str != null) {
            Q.e0(str);
        }
        int i11 = iVar.C;
        if (i11 != -1) {
            Q.H(i11);
        }
        wi.a aVar = iVar.f9203j;
        if (aVar != null) {
            wi.a aVar2 = iVar2.f9203j;
            if (aVar2 != null) {
                aVar = aVar2.b(aVar);
            }
            Q.X(aVar);
        }
        return Q.E();
    }

    private void G(int i11) {
        ak.a.f(!this.f34773i.j());
        while (true) {
            if (i11 >= this.f34777m.size()) {
                i11 = -1;
                break;
            } else if (A(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = K().f29261h;
        i H = H(i11);
        if (this.f34777m.isEmpty()) {
            this.f34790y1 = this.f34787x1;
        } else {
            ((i) w.b(this.f34777m)).o();
        }
        this.f34764b2 = false;
        this.f34774j.D(this.E, H.f29260g, j11);
    }

    private i H(int i11) {
        i iVar = this.f34777m.get(i11);
        ArrayList<i> arrayList = this.f34777m;
        k0.H0(arrayList, i11, arrayList.size());
        for (int i12 = 0; i12 < this.f34789y.length; i12++) {
            this.f34789y[i12].t(iVar.m(i12));
        }
        return iVar;
    }

    private boolean I(i iVar) {
        int i11 = iVar.f34717k;
        int length = this.f34789y.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f34770g1[i12] && this.f34789y[i12].O() == i11) {
                return false;
            }
        }
        return true;
    }

    private static boolean J(ci.i iVar, ci.i iVar2) {
        String str = iVar.f9205l;
        String str2 = iVar2.f9205l;
        int l11 = ak.r.l(str);
        if (l11 != 3) {
            return l11 == ak.r.l(str2);
        } else if (k0.c(str, str2)) {
            return !("application/cea-608".equals(str) || "application/cea-708".equals(str)) || iVar.K == iVar2.K;
        } else {
            return false;
        }
    }

    private i K() {
        ArrayList<i> arrayList = this.f34777m;
        return arrayList.get(arrayList.size() - 1);
    }

    private x L(int i11, int i12) {
        ak.a.a(Q2.contains(Integer.valueOf(i12)));
        int i13 = this.B.get(i12, -1);
        if (i13 == -1) {
            return null;
        }
        if (this.A.add(Integer.valueOf(i12))) {
            this.f34792z[i13] = i11;
        }
        if (this.f34792z[i13] == i11) {
            return this.f34789y[i13];
        }
        return C(i11, i12);
    }

    private static int M(int i11) {
        if (i11 != 1) {
            if (i11 != 2) {
                return i11 != 3 ? 0 : 1;
            }
            return 3;
        }
        return 2;
    }

    private void N(i iVar) {
        d[] dVarArr;
        this.f34791y2 = iVar;
        this.L = iVar.f29257d;
        this.f34790y1 = -9223372036854775807L;
        this.f34777m.add(iVar);
        r.a m11 = com.google.common.collect.r.m();
        for (d dVar : this.f34789y) {
            m11.d(Integer.valueOf(dVar.F()));
        }
        iVar.n(this, m11.e());
        for (d dVar2 : this.f34789y) {
            dVar2.h0(iVar);
            if (iVar.f34720n) {
                dVar2.e0();
            }
        }
    }

    private static boolean O(hj.e eVar) {
        return eVar instanceof i;
    }

    private boolean P() {
        return this.f34790y1 != -9223372036854775807L;
    }

    private void R() {
        int i11 = this.Q.f26354a;
        int[] iArr = new int[i11];
        this.T = iArr;
        Arrays.fill(iArr, -1);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = 0;
            while (true) {
                d[] dVarArr = this.f34789y;
                if (i13 >= dVarArr.length) {
                    break;
                } else if (J((ci.i) ak.a.h(dVarArr[i13].E()), this.Q.a(i12).a(0))) {
                    this.T[i12] = i13;
                    break;
                } else {
                    i13++;
                }
            }
        }
        Iterator<m> it2 = this.f34784t.iterator();
        while (it2.hasNext()) {
            it2.next().b();
        }
    }

    public void S() {
        if (!this.P && this.T == null && this.G) {
            for (d dVar : this.f34789y) {
                if (dVar.E() == null) {
                    return;
                }
            }
            if (this.Q != null) {
                R();
                return;
            }
            z();
            k0();
            this.f34762b.a();
        }
    }

    public void b0() {
        this.G = true;
        S();
    }

    private void f0() {
        for (d dVar : this.f34789y) {
            dVar.U(this.Q1);
        }
        this.Q1 = false;
    }

    private boolean g0(long j11) {
        int length = this.f34789y.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f34789y[i11].X(j11, false) && (this.f34781p1[i11] || !this.f34763b1)) {
                return false;
            }
        }
        return true;
    }

    private void k0() {
        this.H = true;
    }

    private void p0(fj.r[] rVarArr) {
        this.f34784t.clear();
        for (fj.r rVar : rVarArr) {
            if (rVar != null) {
                this.f34784t.add((m) rVar);
            }
        }
    }

    public static /* synthetic */ void v(q qVar) {
        qVar.b0();
    }

    public static /* synthetic */ void w(q qVar) {
        qVar.S();
    }

    private void x() {
        ak.a.f(this.H);
        ak.a.e(this.Q);
        ak.a.e(this.R);
    }

    private void z() {
        int length = this.f34789y.length;
        int i11 = 7;
        int i12 = -1;
        int i13 = 0;
        while (true) {
            int i14 = 2;
            if (i13 >= length) {
                break;
            }
            String str = ((ci.i) ak.a.h(this.f34789y[i13].E())).f9205l;
            if (!ak.r.s(str)) {
                if (ak.r.p(str)) {
                    i14 = 1;
                } else {
                    i14 = ak.r.r(str) ? 3 : 7;
                }
            }
            if (M(i14) > M(i11)) {
                i12 = i13;
                i11 = i14;
            } else if (i14 == i11 && i12 != -1) {
                i12 = -1;
            }
            i13++;
        }
        fj.u i15 = this.f34765c.i();
        int i16 = i15.f26350a;
        this.Y = -1;
        this.T = new int[length];
        for (int i17 = 0; i17 < length; i17++) {
            this.T[i17] = i17;
        }
        fj.u[] uVarArr = new fj.u[length];
        for (int i18 = 0; i18 < length; i18++) {
            ci.i iVar = (ci.i) ak.a.h(this.f34789y[i18].E());
            if (i18 == i12) {
                ci.i[] iVarArr = new ci.i[i16];
                if (i16 == 1) {
                    iVarArr[0] = iVar.f(i15.a(0));
                } else {
                    for (int i19 = 0; i19 < i16; i19++) {
                        iVarArr[i19] = F(i15.a(i19), iVar, true);
                    }
                }
                uVarArr[i18] = new fj.u(iVarArr);
                this.Y = i18;
            } else {
                uVarArr[i18] = new fj.u(F((i11 == 2 && ak.r.p(iVar.f9205l)) ? this.f34767e : null, iVar, false));
            }
        }
        this.Q = E(uVarArr);
        ak.a.f(this.R == null);
        this.R = Collections.emptySet();
    }

    public void B() {
        if (this.H) {
            return;
        }
        e(this.f34787x1);
    }

    public boolean Q(int i11) {
        return !P() && this.f34789y[i11].J(this.f34764b2);
    }

    public void T() {
        this.f34773i.a();
        this.f34765c.m();
    }

    public void U(int i11) {
        T();
        this.f34789y[i11].L();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: V */
    public void i(hj.e eVar, long j11, long j12, boolean z11) {
        this.f34786x = null;
        fj.g gVar = new fj.g(eVar.f29254a, eVar.f29255b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f34772h.f(eVar.f29254a);
        this.f34774j.r(gVar, eVar.f29256c, this.f34761a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
        if (z11) {
            return;
        }
        if (P() || this.K == 0) {
            f0();
        }
        if (this.K > 0) {
            this.f34762b.j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: W */
    public void j(hj.e eVar, long j11, long j12) {
        this.f34786x = null;
        this.f34765c.n(eVar);
        fj.g gVar = new fj.g(eVar.f29254a, eVar.f29255b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f34772h.f(eVar.f29254a);
        this.f34774j.u(gVar, eVar.f29256c, this.f34761a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
        if (!this.H) {
            e(this.f34787x1);
        } else {
            this.f34762b.j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: X */
    public Loader.c n(hj.e eVar, long j11, long j12, IOException iOException, int i11) {
        Loader.c cVar;
        int i12;
        boolean O = O(eVar);
        if (O && !((i) eVar).q() && (iOException instanceof HttpDataSource.InvalidResponseCodeException) && ((i12 = ((HttpDataSource.InvalidResponseCodeException) iOException).f14591a) == 410 || i12 == 404)) {
            return Loader.f14596d;
        }
        long c11 = eVar.c();
        fj.g gVar = new fj.g(eVar.f29254a, eVar.f29255b, eVar.f(), eVar.e(), j11, j12, c11);
        g.a aVar = new g.a(gVar, new fj.h(eVar.f29256c, this.f34761a, eVar.f29257d, eVar.f29258e, eVar.f29259f, ci.b.d(eVar.f29260g), ci.b.d(eVar.f29261h)), iOException, i11);
        long c12 = this.f34772h.c(aVar);
        boolean l11 = c12 != -9223372036854775807L ? this.f34765c.l(eVar, c12) : false;
        if (l11) {
            if (O && c11 == 0) {
                ArrayList<i> arrayList = this.f34777m;
                ak.a.f(arrayList.remove(arrayList.size() - 1) == eVar);
                if (this.f34777m.isEmpty()) {
                    this.f34790y1 = this.f34787x1;
                } else {
                    ((i) w.b(this.f34777m)).o();
                }
            }
            cVar = Loader.f14597e;
        } else {
            long a11 = this.f34772h.a(aVar);
            if (a11 != -9223372036854775807L) {
                cVar = Loader.h(false, a11);
            } else {
                cVar = Loader.f14598f;
            }
        }
        Loader.c cVar2 = cVar;
        boolean z11 = !cVar2.c();
        this.f34774j.w(gVar, eVar.f29256c, this.f34761a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h, iOException, z11);
        if (z11) {
            this.f34786x = null;
            this.f34772h.f(eVar.f29254a);
        }
        if (l11) {
            if (!this.H) {
                e(this.f34787x1);
            } else {
                this.f34762b.j(this);
            }
        }
        return cVar2;
    }

    public void Y() {
        this.A.clear();
    }

    public boolean Z(Uri uri, long j11) {
        return this.f34765c.o(uri, j11);
    }

    @Override // com.google.android.exoplayer2.source.t.b
    public void a(ci.i iVar) {
        this.f34783q.post(this.f34779o);
    }

    public void a0() {
        if (this.f34777m.isEmpty()) {
            return;
        }
        i iVar = (i) w.b(this.f34777m);
        int b11 = this.f34765c.b(iVar);
        if (b11 == 1) {
            iVar.v();
        } else if (b11 == 2 && !this.f34764b2 && this.f34773i.j()) {
            this.f34773i.f();
        }
    }

    @Override // com.google.android.exoplayer2.source.u
    public long b() {
        if (P()) {
            return this.f34790y1;
        }
        if (this.f34764b2) {
            return Long.MIN_VALUE;
        }
        return K().f29261h;
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f34773i.j();
    }

    public void c0(fj.u[] uVarArr, int i11, int... iArr) {
        this.Q = E(uVarArr);
        this.R = new HashSet();
        for (int i12 : iArr) {
            this.R.add(this.Q.a(i12));
        }
        this.Y = i11;
        Handler handler = this.f34783q;
        final b bVar = this.f34762b;
        Objects.requireNonNull(bVar);
        handler.post(new Runnable() { // from class: kj.n
            @Override // java.lang.Runnable
            public final void run() {
                bVar.a();
            }
        });
        k0();
    }

    public int d0(int i11, ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        ci.i iVar;
        if (P()) {
            return -3;
        }
        int i12 = 0;
        if (!this.f34777m.isEmpty()) {
            int i13 = 0;
            while (i13 < this.f34777m.size() - 1 && I(this.f34777m.get(i13))) {
                i13++;
            }
            k0.H0(this.f34777m, 0, i13);
            i iVar2 = this.f34777m.get(0);
            ci.i iVar3 = iVar2.f29257d;
            if (!iVar3.equals(this.O)) {
                this.f34774j.i(this.f34761a, iVar3, iVar2.f29258e, iVar2.f29259f, iVar2.f29260g);
            }
            this.O = iVar3;
        }
        if (this.f34777m.isEmpty() || this.f34777m.get(0).q()) {
            int Q = this.f34789y[i11].Q(jVar, decoderInputBuffer, z11, this.f34764b2);
            if (Q == -5) {
                ci.i iVar4 = (ci.i) ak.a.e(jVar.f9243b);
                if (i11 == this.F) {
                    int O = this.f34789y[i11].O();
                    while (i12 < this.f34777m.size() && this.f34777m.get(i12).f34717k != O) {
                        i12++;
                    }
                    if (i12 < this.f34777m.size()) {
                        iVar = this.f34777m.get(i12).f29257d;
                    } else {
                        iVar = (ci.i) ak.a.e(this.L);
                    }
                    iVar4 = iVar4.f(iVar);
                }
                jVar.f9243b = iVar4;
            }
            return Q;
        }
        return -3;
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        List<i> list;
        long max;
        if (this.f34764b2 || this.f34773i.j() || this.f34773i.i()) {
            return false;
        }
        if (P()) {
            list = Collections.emptyList();
            max = this.f34790y1;
            for (d dVar : this.f34789y) {
                dVar.Z(this.f34790y1);
            }
        } else {
            list = this.f34778n;
            i K = K();
            if (K.h()) {
                max = K.f29261h;
            } else {
                max = Math.max(this.f34787x1, K.f29260g);
            }
        }
        List<i> list2 = list;
        this.f34765c.d(j11, max, list2, this.H || !list2.isEmpty(), this.f34776l);
        f.b bVar = this.f34776l;
        boolean z11 = bVar.f34708b;
        hj.e eVar = bVar.f34707a;
        Uri uri = bVar.f34709c;
        bVar.a();
        if (z11) {
            this.f34790y1 = -9223372036854775807L;
            this.f34764b2 = true;
            return true;
        } else if (eVar == null) {
            if (uri != null) {
                this.f34762b.n(uri);
            }
            return false;
        } else {
            if (O(eVar)) {
                N((i) eVar);
            }
            this.f34786x = eVar;
            this.f34774j.A(new fj.g(eVar.f29254a, eVar.f29255b, this.f34773i.n(eVar, this, this.f34772h.d(eVar.f29256c))), eVar.f29256c, this.f34761a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
            return true;
        }
    }

    public void e0() {
        if (this.H) {
            for (d dVar : this.f34789y) {
                dVar.P();
            }
        }
        this.f34773i.m(this);
        this.f34783q.removeCallbacksAndMessages(null);
        this.P = true;
        this.f34784t.clear();
    }

    @Override // ji.j
    public x f(int i11, int i12) {
        x xVar;
        if (!Q2.contains(Integer.valueOf(i12))) {
            int i13 = 0;
            while (true) {
                x[] xVarArr = this.f34789y;
                if (i13 >= xVarArr.length) {
                    xVar = null;
                    break;
                } else if (this.f34792z[i13] == i11) {
                    xVar = xVarArr[i13];
                    break;
                } else {
                    i13++;
                }
            }
        } else {
            xVar = L(i11, i12);
        }
        if (xVar == null) {
            if (this.f34771g2) {
                return C(i11, i12);
            }
            xVar = D(i11, i12);
        }
        if (i12 == 5) {
            if (this.C == null) {
                this.C = new c(xVar, this.f34775k);
            }
            return this.C;
        }
        return xVar;
    }

    @Override // com.google.android.exoplayer2.source.u
    public long g() {
        ArrayList<i> arrayList;
        if (this.f34764b2) {
            return Long.MIN_VALUE;
        }
        if (P()) {
            return this.f34790y1;
        }
        long j11 = this.f34787x1;
        i K = K();
        if (!K.h()) {
            K = this.f34777m.size() > 1 ? this.f34777m.get(arrayList.size() - 2) : null;
        }
        if (K != null) {
            j11 = Math.max(j11, K.f29261h);
        }
        if (this.G) {
            for (d dVar : this.f34789y) {
                j11 = Math.max(j11, dVar.y());
            }
        }
        return j11;
    }

    @Override // com.google.android.exoplayer2.source.u
    public void h(long j11) {
        if (this.f34773i.i() || P()) {
            return;
        }
        if (this.f34773i.j()) {
            ak.a.e(this.f34786x);
            if (this.f34765c.t(j11, this.f34786x, this.f34778n)) {
                this.f34773i.f();
                return;
            }
            return;
        }
        int size = this.f34778n.size();
        while (size > 0 && this.f34765c.b(this.f34778n.get(size - 1)) == 2) {
            size--;
        }
        if (size < this.f34778n.size()) {
            G(size);
        }
        int g11 = this.f34765c.g(j11, this.f34778n);
        if (g11 < this.f34777m.size()) {
            G(g11);
        }
    }

    public boolean h0(long j11, boolean z11) {
        this.f34787x1 = j11;
        if (P()) {
            this.f34790y1 = j11;
            return true;
        }
        if (this.G && !z11 && g0(j11)) {
            return false;
        }
        this.f34790y1 = j11;
        this.f34764b2 = false;
        this.f34777m.clear();
        if (this.f34773i.j()) {
            if (this.G) {
                for (d dVar : this.f34789y) {
                    dVar.q();
                }
            }
            this.f34773i.f();
        } else {
            this.f34773i.g();
            f0();
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:170:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0131  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean i0(xj.g[] r20, boolean[] r21, fj.r[] r22, boolean[] r23, long r24, boolean r26) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kj.q.i0(xj.g[], boolean[], fj.r[], boolean[], long, boolean):boolean");
    }

    public void j0(com.google.android.exoplayer2.drm.e eVar) {
        if (k0.c(this.f34788x2, eVar)) {
            return;
        }
        this.f34788x2 = eVar;
        int i11 = 0;
        while (true) {
            d[] dVarArr = this.f34789y;
            if (i11 >= dVarArr.length) {
                return;
            }
            if (this.f34781p1[i11]) {
                dVarArr[i11].g0(eVar);
            }
            i11++;
        }
    }

    public void l0(boolean z11) {
        this.f34765c.r(z11);
    }

    public void m0(long j11) {
        if (this.f34782p2 != j11) {
            this.f34782p2 = j11;
            for (d dVar : this.f34789y) {
                dVar.Y(j11);
            }
        }
    }

    public int n0(int i11, long j11) {
        int i12 = 0;
        if (P()) {
            return 0;
        }
        d dVar = this.f34789y[i11];
        int D = dVar.D(j11, this.f34764b2);
        int B = dVar.B();
        while (true) {
            if (i12 >= this.f34777m.size()) {
                break;
            }
            i iVar = this.f34777m.get(i12);
            int m11 = this.f34777m.get(i12).m(i11);
            if (B + D <= m11) {
                break;
            } else if (!iVar.q()) {
                D = m11 - B;
                break;
            } else {
                i12++;
            }
        }
        dVar.c0(D);
        return D;
    }

    public void o0(int i11) {
        x();
        ak.a.e(this.T);
        int i12 = this.T[i11];
        ak.a.f(this.f34770g1[i12]);
        this.f34770g1[i12] = false;
    }

    @Override // ji.j
    public void p(ji.v vVar) {
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        for (d dVar : this.f34789y) {
            dVar.R();
        }
    }

    public void r() {
        T();
        if (this.f34764b2 && !this.H) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // ji.j
    public void s() {
        this.f34771g2 = true;
        this.f34783q.post(this.f34780p);
    }

    public v t() {
        x();
        return this.Q;
    }

    public void u(long j11, boolean z11) {
        if (!this.G || P()) {
            return;
        }
        int length = this.f34789y.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f34789y[i11].p(j11, z11, this.f34770g1[i11]);
        }
    }

    public int y(int i11) {
        x();
        ak.a.e(this.T);
        int i12 = this.T[i11];
        if (i12 == -1) {
            return this.R.contains(this.Q.a(i11)) ? -3 : -2;
        }
        boolean[] zArr = this.f34770g1;
        if (zArr[i12]) {
            return -2;
        }
        zArr[i12] = true;
        return i12;
    }
}