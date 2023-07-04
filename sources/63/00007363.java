package hj;

import ak.k0;
import android.os.Looper;
import ci.q;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.k;
import com.google.android.exoplayer2.source.t;
import com.google.android.exoplayer2.source.u;
import com.google.android.exoplayer2.upstream.Loader;
import fj.r;
import hj.i;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public class h<T extends i> implements r, u, Loader.b<e>, Loader.f {
    boolean A;

    /* renamed from: a  reason: collision with root package name */
    public final int f29265a;

    /* renamed from: b  reason: collision with root package name */
    private final int[] f29266b;

    /* renamed from: c  reason: collision with root package name */
    private final ci.i[] f29267c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean[] f29268d;

    /* renamed from: e  reason: collision with root package name */
    private final T f29269e;

    /* renamed from: f  reason: collision with root package name */
    private final u.a<h<T>> f29270f;

    /* renamed from: g  reason: collision with root package name */
    private final k.a f29271g;

    /* renamed from: h  reason: collision with root package name */
    private final com.google.android.exoplayer2.upstream.g f29272h;

    /* renamed from: i  reason: collision with root package name */
    private final Loader f29273i;

    /* renamed from: j  reason: collision with root package name */
    private final g f29274j;

    /* renamed from: k  reason: collision with root package name */
    private final ArrayList<hj.a> f29275k;

    /* renamed from: l  reason: collision with root package name */
    private final List<hj.a> f29276l;

    /* renamed from: m  reason: collision with root package name */
    private final t f29277m;

    /* renamed from: n  reason: collision with root package name */
    private final t[] f29278n;

    /* renamed from: o  reason: collision with root package name */
    private final c f29279o;

    /* renamed from: p  reason: collision with root package name */
    private e f29280p;

    /* renamed from: q  reason: collision with root package name */
    private ci.i f29281q;

    /* renamed from: t  reason: collision with root package name */
    private b<T> f29282t;

    /* renamed from: w  reason: collision with root package name */
    private long f29283w;

    /* renamed from: x  reason: collision with root package name */
    private long f29284x;

    /* renamed from: y  reason: collision with root package name */
    private int f29285y;

    /* renamed from: z  reason: collision with root package name */
    private hj.a f29286z;

    /* loaded from: classes3.dex */
    public final class a implements r {

        /* renamed from: a  reason: collision with root package name */
        public final h<T> f29287a;

        /* renamed from: b  reason: collision with root package name */
        private final t f29288b;

        /* renamed from: c  reason: collision with root package name */
        private final int f29289c;

        /* renamed from: d  reason: collision with root package name */
        private boolean f29290d;

        public a(h<T> hVar, t tVar, int i11) {
            this.f29287a = hVar;
            this.f29288b = tVar;
            this.f29289c = i11;
        }

        private void b() {
            if (this.f29290d) {
                return;
            }
            h.this.f29271g.i(h.this.f29266b[this.f29289c], h.this.f29267c[this.f29289c], 0, null, h.this.f29284x);
            this.f29290d = true;
        }

        @Override // fj.r
        public void a() {
        }

        public void c() {
            ak.a.f(h.this.f29268d[this.f29289c]);
            h.this.f29268d[this.f29289c] = false;
        }

        @Override // fj.r
        public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
            if (h.this.H()) {
                return -3;
            }
            if (h.this.f29286z == null || h.this.f29286z.i(this.f29289c + 1) > this.f29288b.B()) {
                b();
                return this.f29288b.Q(jVar, decoderInputBuffer, z11, h.this.A);
            }
            return -3;
        }

        @Override // fj.r
        public boolean isReady() {
            return !h.this.H() && this.f29288b.J(h.this.A);
        }

        @Override // fj.r
        public int p(long j11) {
            if (h.this.H()) {
                return 0;
            }
            int D = this.f29288b.D(j11, h.this.A);
            if (h.this.f29286z != null) {
                D = Math.min(D, h.this.f29286z.i(this.f29289c + 1) - this.f29288b.B());
            }
            this.f29288b.c0(D);
            if (D > 0) {
                b();
            }
            return D;
        }
    }

    /* loaded from: classes3.dex */
    public interface b<T extends i> {
        void f(h<T> hVar);
    }

    public h(int i11, int[] iArr, Format[] formatArr, T t11, u.a<h<T>> aVar, zj.b bVar, long j11, com.google.android.exoplayer2.drm.g gVar, f.a aVar2, com.google.android.exoplayer2.upstream.g gVar2, k.a aVar3) {
        this.f29265a = i11;
        int i12 = 0;
        iArr = iArr == null ? new int[0] : iArr;
        this.f29266b = iArr;
        this.f29267c = formatArr == null ? new ci.i[0] : formatArr;
        this.f29269e = t11;
        this.f29270f = aVar;
        this.f29271g = aVar3;
        this.f29272h = gVar2;
        this.f29273i = new Loader("Loader:ChunkSampleStream");
        this.f29274j = new g();
        ArrayList<hj.a> arrayList = new ArrayList<>();
        this.f29275k = arrayList;
        this.f29276l = Collections.unmodifiableList(arrayList);
        int length = iArr.length;
        this.f29278n = new t[length];
        this.f29268d = new boolean[length];
        int i13 = length + 1;
        int[] iArr2 = new int[i13];
        t[] tVarArr = new t[i13];
        t j12 = t.j(bVar, (Looper) ak.a.e(Looper.myLooper()), gVar, aVar2);
        this.f29277m = j12;
        iArr2[0] = i11;
        tVarArr[0] = j12;
        while (i12 < length) {
            t k11 = t.k(bVar);
            this.f29278n[i12] = k11;
            int i14 = i12 + 1;
            tVarArr[i14] = k11;
            iArr2[i14] = this.f29266b[i12];
            i12 = i14;
        }
        this.f29279o = new c(iArr2, tVarArr);
        this.f29283w = j11;
        this.f29284x = j11;
    }

    private void A(int i11) {
        int min = Math.min(N(i11, 0), this.f29285y);
        if (min > 0) {
            k0.H0(this.f29275k, 0, min);
            this.f29285y -= min;
        }
    }

    private void B(int i11) {
        ak.a.f(!this.f29273i.j());
        int size = this.f29275k.size();
        while (true) {
            if (i11 >= size) {
                i11 = -1;
                break;
            } else if (!F(i11)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 == -1) {
            return;
        }
        long j11 = E().f29261h;
        hj.a C = C(i11);
        if (this.f29275k.isEmpty()) {
            this.f29283w = this.f29284x;
        }
        this.A = false;
        this.f29271g.D(this.f29265a, C.f29260g, j11);
    }

    private hj.a C(int i11) {
        hj.a aVar = this.f29275k.get(i11);
        ArrayList<hj.a> arrayList = this.f29275k;
        k0.H0(arrayList, i11, arrayList.size());
        this.f29285y = Math.max(this.f29285y, this.f29275k.size());
        int i12 = 0;
        this.f29277m.t(aVar.i(0));
        while (true) {
            t[] tVarArr = this.f29278n;
            if (i12 >= tVarArr.length) {
                return aVar;
            }
            t tVar = tVarArr[i12];
            i12++;
            tVar.t(aVar.i(i12));
        }
    }

    private hj.a E() {
        ArrayList<hj.a> arrayList = this.f29275k;
        return arrayList.get(arrayList.size() - 1);
    }

    private boolean F(int i11) {
        int B;
        hj.a aVar = this.f29275k.get(i11);
        if (this.f29277m.B() > aVar.i(0)) {
            return true;
        }
        int i12 = 0;
        do {
            t[] tVarArr = this.f29278n;
            if (i12 >= tVarArr.length) {
                return false;
            }
            B = tVarArr[i12].B();
            i12++;
        } while (B <= aVar.i(i12));
        return true;
    }

    private boolean G(e eVar) {
        return eVar instanceof hj.a;
    }

    private void I() {
        int N = N(this.f29277m.B(), this.f29285y - 1);
        while (true) {
            int i11 = this.f29285y;
            if (i11 > N) {
                return;
            }
            this.f29285y = i11 + 1;
            J(i11);
        }
    }

    private void J(int i11) {
        hj.a aVar = this.f29275k.get(i11);
        ci.i iVar = aVar.f29257d;
        if (!iVar.equals(this.f29281q)) {
            this.f29271g.i(this.f29265a, iVar, aVar.f29258e, aVar.f29259f, aVar.f29260g);
        }
        this.f29281q = iVar;
    }

    private int N(int i11, int i12) {
        do {
            i12++;
            if (i12 >= this.f29275k.size()) {
                return this.f29275k.size() - 1;
            }
        } while (this.f29275k.get(i12).i(0) <= i11);
        return i12 - 1;
    }

    private void Q() {
        this.f29277m.T();
        for (t tVar : this.f29278n) {
            tVar.T();
        }
    }

    public T D() {
        return this.f29269e;
    }

    boolean H() {
        return this.f29283w != -9223372036854775807L;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: K */
    public void i(e eVar, long j11, long j12, boolean z11) {
        this.f29280p = null;
        this.f29286z = null;
        fj.g gVar = new fj.g(eVar.f29254a, eVar.f29255b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f29272h.f(eVar.f29254a);
        this.f29271g.r(gVar, eVar.f29256c, this.f29265a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
        if (z11) {
            return;
        }
        if (H()) {
            Q();
        } else if (G(eVar)) {
            C(this.f29275k.size() - 1);
            if (this.f29275k.isEmpty()) {
                this.f29283w = this.f29284x;
            }
        }
        this.f29270f.j(this);
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: L */
    public void j(e eVar, long j11, long j12) {
        this.f29280p = null;
        this.f29269e.g(eVar);
        fj.g gVar = new fj.g(eVar.f29254a, eVar.f29255b, eVar.f(), eVar.e(), j11, j12, eVar.c());
        this.f29272h.f(eVar.f29254a);
        this.f29271g.u(gVar, eVar.f29256c, this.f29265a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
        this.f29270f.j(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0101  */
    @Override // com.google.android.exoplayer2.upstream.Loader.b
    /* renamed from: M */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.google.android.exoplayer2.upstream.Loader.c n(hj.e r37, long r38, long r40, java.io.IOException r42, int r43) {
        /*
            Method dump skipped, instructions count: 273
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: hj.h.n(hj.e, long, long, java.io.IOException, int):com.google.android.exoplayer2.upstream.Loader$c");
    }

    public void O() {
        P(null);
    }

    public void P(b<T> bVar) {
        this.f29282t = bVar;
        this.f29277m.P();
        for (t tVar : this.f29278n) {
            tVar.P();
        }
        this.f29273i.m(this);
    }

    public void R(long j11) {
        boolean X;
        this.f29284x = j11;
        if (H()) {
            this.f29283w = j11;
            return;
        }
        hj.a aVar = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i12 >= this.f29275k.size()) {
                break;
            }
            hj.a aVar2 = this.f29275k.get(i12);
            int i13 = (aVar2.f29260g > j11 ? 1 : (aVar2.f29260g == j11 ? 0 : -1));
            if (i13 == 0 && aVar2.f29230k == -9223372036854775807L) {
                aVar = aVar2;
                break;
            } else if (i13 > 0) {
                break;
            } else {
                i12++;
            }
        }
        if (aVar != null) {
            X = this.f29277m.W(aVar.i(0));
        } else {
            X = this.f29277m.X(j11, j11 < b());
        }
        if (X) {
            this.f29285y = N(this.f29277m.B(), 0);
            t[] tVarArr = this.f29278n;
            int length = tVarArr.length;
            while (i11 < length) {
                tVarArr[i11].X(j11, true);
                i11++;
            }
            return;
        }
        this.f29283w = j11;
        this.A = false;
        this.f29275k.clear();
        this.f29285y = 0;
        if (this.f29273i.j()) {
            this.f29277m.q();
            t[] tVarArr2 = this.f29278n;
            int length2 = tVarArr2.length;
            while (i11 < length2) {
                tVarArr2[i11].q();
                i11++;
            }
            this.f29273i.f();
            return;
        }
        this.f29273i.g();
        Q();
    }

    public h<T>.a S(long j11, int i11) {
        for (int i12 = 0; i12 < this.f29278n.length; i12++) {
            if (this.f29266b[i12] == i11) {
                ak.a.f(!this.f29268d[i12]);
                this.f29268d[i12] = true;
                this.f29278n[i12].X(j11, true);
                return new a(this, this.f29278n[i12], i12);
            }
        }
        throw new IllegalStateException();
    }

    @Override // fj.r
    public void a() {
        this.f29273i.a();
        this.f29277m.L();
        if (this.f29273i.j()) {
            return;
        }
        this.f29269e.a();
    }

    @Override // com.google.android.exoplayer2.source.u
    public long b() {
        if (H()) {
            return this.f29283w;
        }
        if (this.A) {
            return Long.MIN_VALUE;
        }
        return E().f29261h;
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean c() {
        return this.f29273i.j();
    }

    public long d(long j11, q qVar) {
        return this.f29269e.d(j11, qVar);
    }

    @Override // com.google.android.exoplayer2.source.u
    public boolean e(long j11) {
        List<hj.a> list;
        long j12;
        if (this.A || this.f29273i.j() || this.f29273i.i()) {
            return false;
        }
        boolean H = H();
        if (H) {
            list = Collections.emptyList();
            j12 = this.f29283w;
        } else {
            list = this.f29276l;
            j12 = E().f29261h;
        }
        this.f29269e.e(j11, j12, list, this.f29274j);
        g gVar = this.f29274j;
        boolean z11 = gVar.f29264b;
        e eVar = gVar.f29263a;
        gVar.a();
        if (z11) {
            this.f29283w = -9223372036854775807L;
            this.A = true;
            return true;
        } else if (eVar == null) {
            return false;
        } else {
            this.f29280p = eVar;
            if (G(eVar)) {
                hj.a aVar = (hj.a) eVar;
                if (H) {
                    long j13 = aVar.f29260g;
                    long j14 = this.f29283w;
                    if (j13 != j14) {
                        this.f29277m.Z(j14);
                        for (t tVar : this.f29278n) {
                            tVar.Z(this.f29283w);
                        }
                    }
                    this.f29283w = -9223372036854775807L;
                }
                aVar.k(this.f29279o);
                this.f29275k.add(aVar);
            } else if (eVar instanceof l) {
                ((l) eVar).g(this.f29279o);
            }
            this.f29271g.A(new fj.g(eVar.f29254a, eVar.f29255b, this.f29273i.n(eVar, this, this.f29272h.d(eVar.f29256c))), eVar.f29256c, this.f29265a, eVar.f29257d, eVar.f29258e, eVar.f29259f, eVar.f29260g, eVar.f29261h);
            return true;
        }
    }

    @Override // fj.r
    public int f(ci.j jVar, DecoderInputBuffer decoderInputBuffer, boolean z11) {
        if (H()) {
            return -3;
        }
        hj.a aVar = this.f29286z;
        if (aVar == null || aVar.i(0) > this.f29277m.B()) {
            I();
            return this.f29277m.Q(jVar, decoderInputBuffer, z11, this.A);
        }
        return -3;
    }

    @Override // com.google.android.exoplayer2.source.u
    public long g() {
        if (this.A) {
            return Long.MIN_VALUE;
        }
        if (H()) {
            return this.f29283w;
        }
        long j11 = this.f29284x;
        hj.a E = E();
        if (!E.h()) {
            if (this.f29275k.size() > 1) {
                ArrayList<hj.a> arrayList = this.f29275k;
                E = arrayList.get(arrayList.size() - 2);
            } else {
                E = null;
            }
        }
        if (E != null) {
            j11 = Math.max(j11, E.f29261h);
        }
        return Math.max(j11, this.f29277m.y());
    }

    @Override // com.google.android.exoplayer2.source.u
    public void h(long j11) {
        if (this.f29273i.i() || H()) {
            return;
        }
        if (this.f29273i.j()) {
            e eVar = (e) ak.a.e(this.f29280p);
            if (!(G(eVar) && F(this.f29275k.size() - 1)) && this.f29269e.j(j11, eVar, this.f29276l)) {
                this.f29273i.f();
                if (G(eVar)) {
                    this.f29286z = (hj.a) eVar;
                    return;
                }
                return;
            }
            return;
        }
        int i11 = this.f29269e.i(j11, this.f29276l);
        if (i11 < this.f29275k.size()) {
            B(i11);
        }
    }

    @Override // fj.r
    public boolean isReady() {
        return !H() && this.f29277m.J(this.A);
    }

    @Override // fj.r
    public int p(long j11) {
        if (H()) {
            return 0;
        }
        int D = this.f29277m.D(j11, this.A);
        hj.a aVar = this.f29286z;
        if (aVar != null) {
            D = Math.min(D, aVar.i(0) - this.f29277m.B());
        }
        this.f29277m.c0(D);
        I();
        return D;
    }

    @Override // com.google.android.exoplayer2.upstream.Loader.f
    public void q() {
        this.f29277m.R();
        for (t tVar : this.f29278n) {
            tVar.R();
        }
        this.f29269e.release();
        b<T> bVar = this.f29282t;
        if (bVar != null) {
            bVar.f(this);
        }
    }

    public void u(long j11, boolean z11) {
        if (H()) {
            return;
        }
        int w11 = this.f29277m.w();
        this.f29277m.p(j11, z11, true);
        int w12 = this.f29277m.w();
        if (w12 > w11) {
            long x11 = this.f29277m.x();
            int i11 = 0;
            while (true) {
                t[] tVarArr = this.f29278n;
                if (i11 >= tVarArr.length) {
                    break;
                }
                tVarArr[i11].p(x11, z11, this.f29268d[i11]);
                i11++;
            }
        }
        A(w12);
    }
}