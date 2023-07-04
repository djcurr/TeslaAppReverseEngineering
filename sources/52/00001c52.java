package com.google.android.exoplayer2.source;

import ak.k0;
import android.net.Uri;
import android.os.Handler;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import ci.i;
import com.google.android.exoplayer2.ParserException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.f;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.upstream.Loader;
import com.google.android.exoplayer2.upstream.b;
import com.google.android.exoplayer2.upstream.g;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import ji.v;
import ji.x;

/* loaded from: classes3.dex */
public final class q implements i, ji.j, Loader.b<a>, Loader.f, t.b {

    /* renamed from: g1 */
    private static final Map<String, String> f14145g1 = K();

    /* renamed from: p1 */
    private static final ci.i f14146p1 = new i.b().S("icy").e0("application/x-icy").E();
    private boolean A;
    private e B;
    private ji.v C;
    private boolean F;
    private boolean H;
    private boolean K;
    private int L;
    private long P;
    private boolean R;
    private int T;
    private boolean Y;

    /* renamed from: a */
    private final Uri f14147a;

    /* renamed from: b */
    private final com.google.android.exoplayer2.upstream.a f14148b;

    /* renamed from: b1 */
    private boolean f14149b1;

    /* renamed from: c */
    private final com.google.android.exoplayer2.drm.g f14150c;

    /* renamed from: d */
    private final com.google.android.exoplayer2.upstream.g f14151d;

    /* renamed from: e */
    private final k.a f14152e;

    /* renamed from: f */
    private final f.a f14153f;

    /* renamed from: g */
    private final b f14154g;

    /* renamed from: h */
    private final zj.b f14155h;

    /* renamed from: i */
    private final String f14156i;

    /* renamed from: j */
    private final long f14157j;

    /* renamed from: l */
    private final m f14159l;

    /* renamed from: q */
    private i.a f14164q;

    /* renamed from: t */
    private aj.b f14165t;

    /* renamed from: y */
    private boolean f14168y;

    /* renamed from: z */
    private boolean f14169z;

    /* renamed from: k */
    private final Loader f14158k = new Loader("Loader:ProgressiveMediaPeriod");

    /* renamed from: m */
    private final ak.e f14160m = new ak.e();

    /* renamed from: n */
    private final Runnable f14161n = new Runnable() { // from class: com.google.android.exoplayer2.source.n
        {
            q.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q.v(q.this);
        }
    };

    /* renamed from: o */
    private final Runnable f14162o = new Runnable() { // from class: com.google.android.exoplayer2.source.o
        {
            q.this = this;
        }

        @Override // java.lang.Runnable
        public final void run() {
            q.x(q.this);
        }
    };

    /* renamed from: p */
    private final Handler f14163p = k0.x();

    /* renamed from: x */
    private d[] f14167x = new d[0];

    /* renamed from: w */
    private t[] f14166w = new t[0];
    private long Q = -9223372036854775807L;
    private long O = -1;
    private long E = -9223372036854775807L;
    private int G = 1;

    /* loaded from: classes3.dex */
    public final class a implements Loader.e, f.a {

        /* renamed from: b */
        private final Uri f14171b;

        /* renamed from: c */
        private final zj.m f14172c;

        /* renamed from: d */
        private final m f14173d;

        /* renamed from: e */
        private final ji.j f14174e;

        /* renamed from: f */
        private final ak.e f14175f;

        /* renamed from: h */
        private volatile boolean f14177h;

        /* renamed from: j */
        private long f14179j;

        /* renamed from: m */
        private x f14182m;

        /* renamed from: n */
        private boolean f14183n;

        /* renamed from: g */
        private final ji.u f14176g = new ji.u();

        /* renamed from: i */
        private boolean f14178i = true;

        /* renamed from: l */
        private long f14181l = -1;

        /* renamed from: a */
        private final long f14170a = fj.g.a();

        /* renamed from: k */
        private com.google.android.exoplayer2.upstream.b f14180k = j(0);

        public a(Uri uri, com.google.android.exoplayer2.upstream.a aVar, m mVar, ji.j jVar, ak.e eVar) {
            q.this = r1;
            this.f14171b = uri;
            this.f14172c = new zj.m(aVar);
            this.f14173d = mVar;
            this.f14174e = jVar;
            this.f14175f = eVar;
        }

        private com.google.android.exoplayer2.upstream.b j(long j11) {
            return new b.C0259b().i(this.f14171b).h(j11).f(q.this.f14156i).b(6).e(q.f14145g1).a();
        }

        public void k(long j11, long j12) {
            this.f14176g.f33770a = j11;
            this.f14179j = j12;
            this.f14178i = true;
            this.f14183n = false;
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void a() {
            int i11 = 0;
            while (i11 == 0 && !this.f14177h) {
                try {
                    long j11 = this.f14176g.f33770a;
                    com.google.android.exoplayer2.upstream.b j12 = j(j11);
                    this.f14180k = j12;
                    long i12 = this.f14172c.i(j12);
                    this.f14181l = i12;
                    if (i12 != -1) {
                        this.f14181l = i12 + j11;
                    }
                    q.this.f14165t = aj.b.a(this.f14172c.c());
                    zj.f fVar = this.f14172c;
                    if (q.this.f14165t != null && q.this.f14165t.f423f != -1) {
                        fVar = new f(this.f14172c, q.this.f14165t.f423f, this);
                        x N = q.this.N();
                        this.f14182m = N;
                        N.d(q.f14146p1);
                    }
                    long j13 = j11;
                    this.f14173d.d(fVar, this.f14171b, this.f14172c.c(), j11, this.f14181l, this.f14174e);
                    if (q.this.f14165t != null) {
                        this.f14173d.b();
                    }
                    if (this.f14178i) {
                        this.f14173d.a(j13, this.f14179j);
                        this.f14178i = false;
                    }
                    while (true) {
                        long j14 = j13;
                        while (i11 == 0 && !this.f14177h) {
                            try {
                                this.f14175f.a();
                                i11 = this.f14173d.e(this.f14176g);
                                j13 = this.f14173d.c();
                                if (j13 > q.this.f14157j + j14) {
                                    break;
                                }
                            } catch (InterruptedException unused) {
                                throw new InterruptedIOException();
                            }
                        }
                        this.f14175f.b();
                        q.this.f14163p.post(q.this.f14162o);
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (this.f14173d.c() != -1) {
                        this.f14176g.f33770a = this.f14173d.c();
                    }
                    k0.n(this.f14172c);
                } catch (Throwable th2) {
                    if (i11 != 1 && this.f14173d.c() != -1) {
                        this.f14176g.f33770a = this.f14173d.c();
                    }
                    k0.n(this.f14172c);
                    throw th2;
                }
            }
        }

        @Override // com.google.android.exoplayer2.upstream.Loader.e
        public void b() {
            this.f14177h = true;
        }

        @Override // com.google.android.exoplayer2.source.f.a
        public void c(ak.v vVar) {
            long max = !this.f14183n ? this.f14179j : Math.max(q.this.M(), this.f14179j);
            int a11 = vVar.a();
            x xVar = (x) ak.a.e(this.f14182m);
            xVar.e(vVar, a11);
            xVar.f(max, 1, a11, 0, null);
            this.f14183n = true;
        }
    }

    /* loaded from: classes3.dex */
    public interface b {
        void m(long j11, boolean z11, boolean z12);
    }

    /* loaded from: classes3.dex */
    private final class c implements fj.r {

        /* renamed from: a */
        private final int f14185a;

        public c(int i11) {
            q.this = r1;
            this.f14185a = i11;
        }

        @Override // fj.r
        public void a() {
            q.this.W(this.f14185a);
        }

        @Override // fj.r
        public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
            return q.this.b0(this.f14185a, jVar, decoderInputBuffer, z11);
        }

        @Override // fj.r
        public boolean isReady() {
            return q.this.P(this.f14185a);
        }

        @Override // fj.r
        public int p(long j11) {
            return q.this.f0(this.f14185a, j11);
        }
    }

    /* loaded from: classes3.dex */
    public static final class d {

        /* renamed from: a */
        public final int f14187a;

        /* renamed from: b */
        public final boolean f14188b;

        public d(int i11, boolean z11) {
            this.f14187a = i11;
            this.f14188b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f14187a == dVar.f14187a && this.f14188b == dVar.f14188b;
        }

        public int hashCode() {
            return (this.f14187a * 31) + (this.f14188b ? 1 : 0);
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a */
        public final fj.v f14189a;

        /* renamed from: b */
        public final boolean[] f14190b;

        /* renamed from: c */
        public final boolean[] f14191c;

        /* renamed from: d */
        public final boolean[] f14192d;

        public e(fj.v vVar, boolean[] zArr) {
            this.f14189a = vVar;
            this.f14190b = zArr;
            int i11 = vVar.f26354a;
            this.f14191c = new boolean[i11];
            this.f14192d = new boolean[i11];
        }
    }

    public q(Uri uri, com.google.android.exoplayer2.upstream.a aVar, ji.l lVar, com.google.android.exoplayer2.drm.g gVar, f.a aVar2, com.google.android.exoplayer2.upstream.g gVar2, k.a aVar3, b bVar, zj.b bVar2, String str, int i11) {
        this.f14147a = uri;
        this.f14148b = aVar;
        this.f14150c = gVar;
        this.f14153f = aVar2;
        this.f14151d = gVar2;
        this.f14152e = aVar3;
        this.f14154g = bVar;
        this.f14155h = bVar2;
        this.f14156i = str;
        this.f14157j = i11;
        this.f14159l = new com.google.android.exoplayer2.source.b(lVar);
    }

    private void H() {
        ak.a.f(this.f14169z);
        ak.a.e(this.B);
        ak.a.e(this.C);
    }

    private boolean I(a aVar, int i11) {
        ji.v vVar;
        if (this.O == -1 && ((vVar = this.C) == null || vVar.i() == -9223372036854775807L)) {
            if (this.f14169z && !h0()) {
                this.R = true;
                return false;
            }
            this.K = this.f14169z;
            this.P = 0L;
            this.T = 0;
            for (t tVar : this.f14166w) {
                tVar.T();
            }
            aVar.k(0L, 0L);
            return true;
        }
        this.T = i11;
        return true;
    }

    private void J(a aVar) {
        if (this.O == -1) {
            this.O = aVar.f14181l;
        }
    }

    private static Map<String, String> K() {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(hashMap);
    }

    private int L() {
        int i11 = 0;
        for (t tVar : this.f14166w) {
            i11 += tVar.F();
        }
        return i11;
    }

    public long M() {
        long j11 = Long.MIN_VALUE;
        for (t tVar : this.f14166w) {
            j11 = Math.max(j11, tVar.y());
        }
        return j11;
    }

    private boolean O() {
        return this.Q != -9223372036854775807L;
    }

    public /* synthetic */ void Q() {
        if (this.f14149b1) {
            return;
        }
        ((i.a) ak.a.e(this.f14164q)).j(this);
    }

    public void S() {
        wi.a a11;
        if (this.f14149b1 || this.f14169z || !this.f14168y || this.C == null) {
            return;
        }
        for (t tVar : this.f14166w) {
            if (tVar.E() == null) {
                return;
            }
        }
        this.f14160m.b();
        int length = this.f14166w.length;
        fj.u[] uVarArr = new fj.u[length];
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            ci.i iVar = (ci.i) ak.a.e(this.f14166w[i11].E());
            String str = iVar.f9205l;
            boolean p11 = ak.r.p(str);
            boolean z11 = p11 || ak.r.s(str);
            zArr[i11] = z11;
            this.A = z11 | this.A;
            aj.b bVar = this.f14165t;
            if (bVar != null) {
                if (p11 || this.f14167x[i11].f14188b) {
                    wi.a aVar = iVar.f9203j;
                    if (aVar == null) {
                        a11 = new wi.a(bVar);
                    } else {
                        a11 = aVar.a(bVar);
                    }
                    iVar = iVar.a().X(a11).E();
                }
                if (p11 && iVar.f9199f == -1 && iVar.f9200g == -1 && bVar.f418a != -1) {
                    iVar = iVar.a().G(bVar.f418a).E();
                }
            }
            uVarArr[i11] = new fj.u(iVar.b(this.f14150c.c(iVar)));
        }
        this.B = new e(new fj.v(uVarArr), zArr);
        this.f14169z = true;
        ((i.a) ak.a.e(this.f14164q)).p(this);
    }

    private void T(int i11) {
        H();
        e eVar = this.B;
        boolean[] zArr = eVar.f14192d;
        if (zArr[i11]) {
            return;
        }
        ci.i a11 = eVar.f14189a.a(i11).a(0);
        this.f14152e.i(ak.r.l(a11.f9205l), a11, 0, null, this.P);
        zArr[i11] = true;
    }

    private void U(int i11) {
        H();
        boolean[] zArr = this.B.f14190b;
        if (this.R && zArr[i11]) {
            if (this.f14166w[i11].J(false)) {
                return;
            }
            this.Q = 0L;
            this.R = false;
            this.K = true;
            this.P = 0L;
            this.T = 0;
            for (t tVar : this.f14166w) {
                tVar.T();
            }
            ((i.a) ak.a.e(this.f14164q)).j(this);
        }
    }

    private x a0(d dVar) {
        int length = this.f14166w.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (dVar.equals(this.f14167x[i11])) {
                return this.f14166w[i11];
            }
        }
        t j11 = t.j(this.f14155h, this.f14163p.getLooper(), this.f14150c, this.f14153f);
        j11.b0(this);
        int i12 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f14167x, i12);
        dVarArr[length] = dVar;
        this.f14167x = (d[]) k0.k(dVarArr);
        t[] tVarArr = (t[]) Arrays.copyOf(this.f14166w, i12);
        tVarArr[length] = j11;
        this.f14166w = (t[]) k0.k(tVarArr);
        return j11;
    }

    private boolean d0(boolean[] zArr, long j11) {
        int length = this.f14166w.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (!this.f14166w[i11].X(j11, false) && (zArr[i11] || !this.A)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e0 */
    public void R(ji.v vVar) {
        this.C = this.f14165t == null ? vVar : new v.b(-9223372036854775807L);
        this.E = vVar.i();
        boolean z11 = this.O == -1 && vVar.i() == -9223372036854775807L;
        this.F = z11;
        this.G = z11 ? 7 : 1;
        this.f14154g.m(this.E, vVar.h(), this.F);
        if (this.f14169z) {
            return;
        }
        S();
    }

    private void g0() {
        a aVar = new a(this.f14147a, this.f14148b, this.f14159l, this, this.f14160m);
        if (this.f14169z) {
            ak.a.f(O());
            long j11 = this.E;
            if (j11 == -9223372036854775807L || this.Q <= j11) {
                aVar.k(((ji.v) ak.a.e(this.C)).f(this.Q).f33771a.f33777b, this.Q);
                for (t tVar : this.f14166w) {
                    tVar.Z(this.Q);
                }
                this.Q = -9223372036854775807L;
            } else {
                this.Y = true;
                this.Q = -9223372036854775807L;
                return;
            }
        }
        this.T = L();
        this.f14152e.A(new fj.g(aVar.f14170a, aVar.f14180k, this.f14158k.n(aVar, this, this.f14151d.d(this.G))), 1, -1, null, 0, null, aVar.f14179j, this.E);
    }

    private boolean h0() {
        return this.K || O();
    }

    public static /* synthetic */ void v(q qVar) {
        qVar.S();
    }

    public static /* synthetic */ void w(q qVar, ji.v vVar) {
        qVar.R(vVar);
    }

    public static /* synthetic */ void x(q qVar) {
        qVar.Q();
    }

    x N() {
        return a0(new d(0, true));
    }

    boolean P(int i11) {
        return !h0() && this.f14166w[i11].J(this.Y);
    }

    void V() {
        this.f14158k.k(this.f14151d.d(this.G));
    }

    void W(int i11) {
        this.f14166w[i11].L();
        V();
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: X */
    public void i(a aVar, long j11, long j12, boolean z11) {
        zj.m mVar = aVar.f14172c;
        fj.g gVar = new fj.g(aVar.f14170a, aVar.f14180k, mVar.p(), mVar.q(), j11, j12, mVar.o());
        this.f14151d.f(aVar.f14170a);
        this.f14152e.r(gVar, 1, -1, null, 0, null, aVar.f14179j, this.E);
        if (z11) {
            return;
        }
        J(aVar);
        for (t tVar : this.f14166w) {
            tVar.T();
        }
        if (this.L > 0) {
            ((i.a) ak.a.e(this.f14164q)).j(this);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: Y */
    public void j(a aVar, long j11, long j12) {
        ji.v vVar;
        if (this.E == -9223372036854775807L && (vVar = this.C) != null) {
            boolean h11 = vVar.h();
            long M = M();
            long j13 = M == Long.MIN_VALUE ? 0L : M + AbstractComponentTracker.LINGERING_TIMEOUT;
            this.E = j13;
            this.f14154g.m(j13, h11, this.F);
        }
        zj.m mVar = aVar.f14172c;
        fj.g gVar = new fj.g(aVar.f14170a, aVar.f14180k, mVar.p(), mVar.q(), j11, j12, mVar.o());
        this.f14151d.f(aVar.f14170a);
        this.f14152e.u(gVar, 1, -1, null, 0, null, aVar.f14179j, this.E);
        J(aVar);
        this.Y = true;
        ((i.a) ak.a.e(this.f14164q)).j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: Z */
    public Loader.c n(a aVar, long j11, long j12, IOException iOException, int i11) {
        boolean z11;
        a aVar2;
        Loader.c cVar;
        J(aVar);
        zj.m mVar = aVar.f14172c;
        fj.g gVar = new fj.g(aVar.f14170a, aVar.f14180k, mVar.p(), mVar.q(), j11, j12, mVar.o());
        long a11 = this.f14151d.a(new g.a(gVar, new fj.h(1, -1, null, 0, null, ci.b.d(aVar.f14179j), ci.b.d(this.E)), iOException, i11));
        if (a11 == -9223372036854775807L) {
            cVar = Loader.f14598f;
        } else {
            int L = L();
            if (L > this.T) {
                aVar2 = aVar;
                z11 = true;
            } else {
                z11 = false;
                aVar2 = aVar;
            }
            if (I(aVar2, L)) {
                cVar = Loader.h(z11, a11);
            } else {
                cVar = Loader.f14597e;
            }
        }
        boolean z12 = !cVar.c();
        this.f14152e.w(gVar, 1, -1, null, 0, null, aVar.f14179j, this.E, iOException, z12);
        if (z12) {
            this.f14151d.f(aVar.f14170a);
        }
        return cVar;
    }

    @Override // com.google.android.exoplayer2.source.t.b
    public void a(ci.i iVar) {
        this.f14163p.post(this.f14161n);
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long b() {
        if (this.L == 0) {
            return Long.MIN_VALUE;
        }
        return g();
    }

    int b0(int i11, ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        if (h0()) {
            return -3;
        }
        T(i11);
        int Q = this.f14166w[i11].Q(jVar, decoderInputBuffer, z11, this.Y);
        if (Q == -3) {
            U(i11);
        }
        return Q;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f14158k.j() && this.f14160m.c();
    }

    public void c0() {
        if (this.f14169z) {
            for (t tVar : this.f14166w) {
                tVar.P();
            }
        }
        this.f14158k.m(this);
        this.f14163p.removeCallbacksAndMessages(null);
        this.f14164q = null;
        this.f14149b1 = true;
    }

    @Override // com.google.android.exoplayer2.source.i
    public long d(long j11, ci.q qVar) {
        H();
        if (this.C.h()) {
            v.a f11 = this.C.f(j11);
            return qVar.a(j11, f11.f33771a.f33776a, f11.f33772b.f33776a);
        }
        return 0L;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        if (this.Y || this.f14158k.i() || this.R) {
            return false;
        }
        if (this.f14169z && this.L == 0) {
            return false;
        }
        boolean d11 = this.f14160m.d();
        if (this.f14158k.j()) {
            return d11;
        }
        g0();
        return true;
    }

    @Override // ji.j
    public x f(int i11, int i12) {
        return a0(new d(i11, false));
    }

    int f0(int i11, long j11) {
        if (h0()) {
            return 0;
        }
        T(i11);
        t tVar = this.f14166w[i11];
        int D = tVar.D(j11, this.Y);
        tVar.c0(D);
        if (D == 0) {
            U(i11);
        }
        return D;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public long g() {
        long j11;
        H();
        boolean[] zArr = this.B.f14190b;
        if (this.Y) {
            return Long.MIN_VALUE;
        }
        if (O()) {
            return this.Q;
        }
        if (this.A) {
            int length = this.f14166w.length;
            j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                if (zArr[i11] && !this.f14166w[i11].I()) {
                    j11 = Math.min(j11, this.f14166w[i11].y());
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = M();
        }
        return j11 == Long.MIN_VALUE ? this.P : j11;
    }

    @Override // com.google.android.exoplayer2.source.i, com.google.android.exoplayer2.source.u
    public void h(long j11) {
    }

    @Override // com.google.android.exoplayer2.source.i
    public long k(long j11) {
        H();
        boolean[] zArr = this.B.f14190b;
        if (!this.C.h()) {
            j11 = 0;
        }
        int i11 = 0;
        this.K = false;
        this.P = j11;
        if (O()) {
            this.Q = j11;
            return j11;
        } else if (this.G == 7 || !d0(zArr, j11)) {
            this.R = false;
            this.Q = j11;
            this.Y = false;
            if (this.f14158k.j()) {
                t[] tVarArr = this.f14166w;
                int length = tVarArr.length;
                while (i11 < length) {
                    tVarArr[i11].q();
                    i11++;
                }
                this.f14158k.f();
            } else {
                this.f14158k.g();
                t[] tVarArr2 = this.f14166w;
                int length2 = tVarArr2.length;
                while (i11 < length2) {
                    tVarArr2[i11].T();
                    i11++;
                }
            }
            return j11;
        } else {
            return j11;
        }
    }

    @Override // com.google.android.exoplayer2.source.i
    public long l() {
        if (this.K) {
            if (this.Y || L() > this.T) {
                this.K = false;
                return this.P;
            }
            return -9223372036854775807L;
        }
        return -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void m(i.a aVar, long j11) {
        this.f14164q = aVar;
        this.f14160m.d();
        g0();
    }

    @Override // com.google.android.exoplayer2.source.i
    public long o(xj.g[] gVarArr, boolean[] zArr, fj.r[] rVarArr, boolean[] zArr2, long j11) {
        H();
        e eVar = this.B;
        fj.v vVar = eVar.f14189a;
        boolean[] zArr3 = eVar.f14191c;
        int i11 = this.L;
        int i12 = 0;
        for (int i13 = 0; i13 < gVarArr.length; i13++) {
            if (rVarArr[i13] != null && (gVarArr[i13] == null || !zArr[i13])) {
                int i14 = ((c) rVarArr[i13]).f14185a;
                ak.a.f(zArr3[i14]);
                this.L--;
                zArr3[i14] = false;
                rVarArr[i13] = null;
            }
        }
        boolean z11 = !this.H ? j11 == 0 : i11 != 0;
        for (int i15 = 0; i15 < gVarArr.length; i15++) {
            if (rVarArr[i15] == null && gVarArr[i15] != null) {
                xj.g gVar = gVarArr[i15];
                ak.a.f(gVar.length() == 1);
                ak.a.f(gVar.e(0) == 0);
                int b11 = vVar.b(gVar.j());
                ak.a.f(!zArr3[b11]);
                this.L++;
                zArr3[b11] = true;
                rVarArr[i15] = new c(b11);
                zArr2[i15] = true;
                if (!z11) {
                    t tVar = this.f14166w[b11];
                    z11 = (tVar.X(j11, true) || tVar.B() == 0) ? false : true;
                }
            }
        }
        if (this.L == 0) {
            this.R = false;
            this.K = false;
            if (this.f14158k.j()) {
                t[] tVarArr = this.f14166w;
                int length = tVarArr.length;
                while (i12 < length) {
                    tVarArr[i12].q();
                    i12++;
                }
                this.f14158k.f();
            } else {
                t[] tVarArr2 = this.f14166w;
                int length2 = tVarArr2.length;
                while (i12 < length2) {
                    tVarArr2[i12].T();
                    i12++;
                }
            }
        } else if (z11) {
            j11 = k(j11);
            while (i12 < rVarArr.length) {
                if (rVarArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.H = true;
        return j11;
    }

    @Override // ji.j
    public void p(final ji.v vVar) {
        this.f14163p.post(new Runnable() { // from class: com.google.android.exoplayer2.source.p
            {
                q.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                q.w(q.this, vVar);
            }
        });
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        for (t tVar : this.f14166w) {
            tVar.R();
        }
        this.f14159l.release();
    }

    @Override // com.google.android.exoplayer2.source.i
    public void r() {
        V();
        if (this.Y && !this.f14169z) {
            throw new ParserException("Loading finished before preparation is complete.");
        }
    }

    @Override // ji.j
    public void s() {
        this.f14168y = true;
        this.f14163p.post(this.f14161n);
    }

    @Override // com.google.android.exoplayer2.source.i
    public fj.v t() {
        H();
        return this.B.f14189a;
    }

    @Override // com.google.android.exoplayer2.source.i
    public void u(long j11, boolean z11) {
        H();
        if (O()) {
            return;
        }
        boolean[] zArr = this.B.f14191c;
        int length = this.f14166w.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f14166w[i11].p(j11, z11, zArr[i11]);
        }
    }
}