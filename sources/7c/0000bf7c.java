package xj;

import ak.k0;
import com.google.android.exoplayer2.source.chunk.MediaChunkIterator;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.e0;
import com.google.common.collect.f0;
import com.google.common.collect.r;
import com.google.common.collect.w;
import fj.u;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import xj.g;

/* loaded from: classes3.dex */
public class a extends c {

    /* renamed from: g  reason: collision with root package name */
    private final zj.d f57451g;

    /* renamed from: h  reason: collision with root package name */
    private final long f57452h;

    /* renamed from: i  reason: collision with root package name */
    private final long f57453i;

    /* renamed from: j  reason: collision with root package name */
    private final long f57454j;

    /* renamed from: k  reason: collision with root package name */
    private final float f57455k;

    /* renamed from: l  reason: collision with root package name */
    private final float f57456l;

    /* renamed from: m  reason: collision with root package name */
    private final r<C1305a> f57457m;

    /* renamed from: n  reason: collision with root package name */
    private final ak.b f57458n;

    /* renamed from: o  reason: collision with root package name */
    private float f57459o;

    /* renamed from: p  reason: collision with root package name */
    private int f57460p;

    /* renamed from: q  reason: collision with root package name */
    private int f57461q;

    /* renamed from: r  reason: collision with root package name */
    private long f57462r;

    /* renamed from: s  reason: collision with root package name */
    private hj.m f57463s;

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: xj.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C1305a {

        /* renamed from: a  reason: collision with root package name */
        public final long f57464a;

        /* renamed from: b  reason: collision with root package name */
        public final long f57465b;

        public C1305a(long j11, long j12) {
            this.f57464a = j11;
            this.f57465b = j12;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof C1305a) {
                C1305a c1305a = (C1305a) obj;
                return this.f57464a == c1305a.f57464a && this.f57465b == c1305a.f57465b;
            }
            return false;
        }

        public int hashCode() {
            return (((int) this.f57464a) * 31) + ((int) this.f57465b);
        }
    }

    /* loaded from: classes3.dex */
    public static class b implements g.b {

        /* renamed from: a  reason: collision with root package name */
        private final int f57466a;

        /* renamed from: b  reason: collision with root package name */
        private final int f57467b;

        /* renamed from: c  reason: collision with root package name */
        private final int f57468c;

        /* renamed from: d  reason: collision with root package name */
        private final float f57469d;

        /* renamed from: e  reason: collision with root package name */
        private final float f57470e;

        /* renamed from: f  reason: collision with root package name */
        private final ak.b f57471f;

        public b() {
            this(10000, 25000, 25000, 0.7f, 0.75f, ak.b.f439a);
        }

        @Override // xj.g.b
        public final g[] a(g.a[] aVarArr, zj.d dVar, j.a aVar, z0 z0Var) {
            g b11;
            r z11 = a.z(aVarArr);
            g[] gVarArr = new g[aVarArr.length];
            for (int i11 = 0; i11 < aVarArr.length; i11++) {
                g.a aVar2 = aVarArr[i11];
                if (aVar2 != null) {
                    int[] iArr = aVar2.f57559b;
                    if (iArr.length != 0) {
                        if (iArr.length == 1) {
                            b11 = new h(aVar2.f57558a, iArr[0], aVar2.f57560c, aVar2.f57561d);
                        } else {
                            b11 = b(aVar2.f57558a, dVar, iArr, (r) z11.get(i11));
                        }
                        gVarArr[i11] = b11;
                    }
                }
            }
            return gVarArr;
        }

        protected a b(u uVar, zj.d dVar, int[] iArr, r<C1305a> rVar) {
            return new a(uVar, iArr, dVar, this.f57466a, this.f57467b, this.f57468c, this.f57469d, this.f57470e, rVar, this.f57471f);
        }

        public b(int i11, int i12, int i13, float f11, float f12, ak.b bVar) {
            this.f57466a = i11;
            this.f57467b = i12;
            this.f57468c = i13;
            this.f57469d = f11;
            this.f57470e = f12;
            this.f57471f = bVar;
        }
    }

    protected a(u uVar, int[] iArr, zj.d dVar, long j11, long j12, long j13, float f11, float f12, List<C1305a> list, ak.b bVar) {
        super(uVar, iArr);
        this.f57451g = dVar;
        this.f57452h = j11 * 1000;
        this.f57453i = j12 * 1000;
        this.f57454j = j13 * 1000;
        this.f57455k = f11;
        this.f57456l = f12;
        this.f57457m = r.o(list);
        this.f57458n = bVar;
        this.f57459o = 1.0f;
        this.f57461q = 0;
        this.f57462r = -9223372036854775807L;
    }

    private long A() {
        long j11;
        long e11 = ((float) this.f57451g.e()) * this.f57455k;
        if (this.f57457m.isEmpty()) {
            return e11;
        }
        int i11 = 1;
        while (i11 < this.f57457m.size() - 1 && this.f57457m.get(i11).f57464a < e11) {
            i11++;
        }
        C1305a c1305a = this.f57457m.get(i11 - 1);
        C1305a c1305a2 = this.f57457m.get(i11);
        long j12 = c1305a.f57464a;
        float f11 = ((float) (e11 - j12)) / ((float) (c1305a2.f57464a - j12));
        return c1305a.f57465b + (f11 * ((float) (c1305a2.f57465b - j11)));
    }

    private static long[][] C(g.a[] aVarArr) {
        int[] iArr;
        long[][] jArr = new long[aVarArr.length];
        for (int i11 = 0; i11 < aVarArr.length; i11++) {
            g.a aVar = aVarArr[i11];
            if (aVar == null) {
                jArr[i11] = new long[0];
            } else {
                jArr[i11] = new long[aVar.f57559b.length];
                int i12 = 0;
                while (true) {
                    if (i12 >= aVar.f57559b.length) {
                        break;
                    }
                    jArr[i11][i12] = aVar.f57558a.a(iArr[i12]).f9201h;
                    i12++;
                }
                Arrays.sort(jArr[i11]);
            }
        }
        return jArr;
    }

    private static r<Integer> D(long[][] jArr) {
        e0 e11 = f0.c().a().e();
        for (int i11 = 0; i11 < jArr.length; i11++) {
            if (jArr[i11].length > 1) {
                int length = jArr[i11].length;
                double[] dArr = new double[length];
                int i12 = 0;
                while (true) {
                    double d11 = 0.0d;
                    if (i12 >= jArr[i11].length) {
                        break;
                    }
                    if (jArr[i11][i12] != -1) {
                        d11 = Math.log(jArr[i11][i12]);
                    }
                    dArr[i12] = d11;
                    i12++;
                }
                int i13 = length - 1;
                double d12 = dArr[i13] - dArr[0];
                int i14 = 0;
                while (i14 < i13) {
                    double d13 = dArr[i14];
                    i14++;
                    e11.put(Double.valueOf(d12 == 0.0d ? 1.0d : (((d13 + dArr[i14]) * 0.5d) - dArr[0]) / d12), Integer.valueOf(i11));
                }
            }
        }
        return r.o(e11.values());
    }

    private long E(long j11) {
        if (j11 != -9223372036854775807L && j11 <= this.f57452h) {
            return ((float) j11) * this.f57456l;
        }
        return this.f57452h;
    }

    private static void w(List<r.a<C1305a>> list, long[] jArr) {
        long j11 = 0;
        for (long j12 : jArr) {
            j11 += j12;
        }
        for (int i11 = 0; i11 < list.size(); i11++) {
            r.a<C1305a> aVar = list.get(i11);
            if (aVar != null) {
                aVar.d(new C1305a(j11, jArr[i11]));
            }
        }
    }

    private int y(long j11) {
        long A = A();
        int i11 = 0;
        for (int i12 = 0; i12 < this.f57474b; i12++) {
            if (j11 == Long.MIN_VALUE || !t(i12, j11)) {
                ci.i d11 = d(i12);
                if (x(d11, d11.f9201h, this.f57459o, A)) {
                    return i12;
                }
                i11 = i12;
            }
        }
        return i11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static r<r<C1305a>> z(ExoTrackSelection.Definition[] definitionArr) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < definitionArr.length; i11++) {
            if (definitionArr[i11] != null && definitionArr[i11].f57559b.length > 1) {
                r.a m11 = r.m();
                m11.d(new C1305a(0L, 0L));
                arrayList.add(m11);
            } else {
                arrayList.add(null);
            }
        }
        long[][] C = C(definitionArr);
        int[] iArr = new int[C.length];
        long[] jArr = new long[C.length];
        for (int i12 = 0; i12 < C.length; i12++) {
            jArr[i12] = C[i12].length == 0 ? 0L : C[i12][0];
        }
        w(arrayList, jArr);
        r<Integer> D = D(C);
        for (int i13 = 0; i13 < D.size(); i13++) {
            int intValue = D.get(i13).intValue();
            int i14 = iArr[intValue] + 1;
            iArr[intValue] = i14;
            jArr[intValue] = C[intValue][i14];
            w(arrayList, jArr);
        }
        for (int i15 = 0; i15 < definitionArr.length; i15++) {
            if (arrayList.get(i15) != null) {
                jArr[i15] = jArr[i15] * 2;
            }
        }
        w(arrayList, jArr);
        r.a m12 = r.m();
        for (int i16 = 0; i16 < arrayList.size(); i16++) {
            r.a aVar = (r.a) arrayList.get(i16);
            m12.d(aVar == null ? r.r() : aVar.e());
        }
        return m12.e();
    }

    protected long B() {
        return this.f57454j;
    }

    protected boolean F(long j11, List<? extends hj.m> list) {
        long j12 = this.f57462r;
        return j12 == -9223372036854775807L || j11 - j12 >= 1000 || !(list.isEmpty() || ((hj.m) w.b(list)).equals(this.f57463s));
    }

    @Override // xj.g
    public int a() {
        return this.f57460p;
    }

    @Override // xj.c, xj.g
    public void disable() {
        this.f57463s = null;
    }

    @Override // xj.c, xj.g
    public void enable() {
        this.f57462r = -9223372036854775807L;
        this.f57463s = null;
    }

    @Override // xj.c, xj.g
    public void f(float f11) {
        this.f57459o = f11;
    }

    @Override // xj.g
    public Object g() {
        return null;
    }

    @Override // xj.c, xj.g
    public int m(long j11, List<? extends hj.m> list) {
        int i11;
        int i12;
        long elapsedRealtime = this.f57458n.elapsedRealtime();
        if (!F(elapsedRealtime, list)) {
            return list.size();
        }
        this.f57462r = elapsedRealtime;
        this.f57463s = list.isEmpty() ? null : (hj.m) w.b(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long d02 = k0.d0(list.get(size - 1).f29260g - j11, this.f57459o);
        long B = B();
        if (d02 < B) {
            return size;
        }
        ci.i d11 = d(y(elapsedRealtime));
        for (int i13 = 0; i13 < size; i13++) {
            hj.m mVar = list.get(i13);
            ci.i iVar = mVar.f29257d;
            if (k0.d0(mVar.f29260g - j11, this.f57459o) >= B && iVar.f9201h < d11.f9201h && (i11 = iVar.f9211t) != -1 && i11 < 720 && (i12 = iVar.f9210q) != -1 && i12 < 1280 && i11 < d11.f9211t) {
                return i13;
            }
        }
        return size;
    }

    @Override // xj.g
    public void n(long j11, long j12, long j13, List<? extends hj.m> list, MediaChunkIterator[] mediaChunkIteratorArr) {
        long elapsedRealtime = this.f57458n.elapsedRealtime();
        int i11 = this.f57461q;
        if (i11 == 0) {
            this.f57461q = 1;
            this.f57460p = y(elapsedRealtime);
            return;
        }
        int i12 = this.f57460p;
        int b11 = list.isEmpty() ? -1 : b(((hj.m) w.b(list)).f29257d);
        if (b11 != -1) {
            i11 = ((hj.m) w.b(list)).f29258e;
            i12 = b11;
        }
        int y11 = y(elapsedRealtime);
        if (!t(i12, elapsedRealtime)) {
            ci.i d11 = d(i12);
            ci.i d12 = d(y11);
            if ((d12.f9201h > d11.f9201h && j12 < E(j13)) || (d12.f9201h < d11.f9201h && j12 >= this.f57453i)) {
                y11 = i12;
            }
        }
        if (y11 != i12) {
            i11 = 3;
        }
        this.f57461q = i11;
        this.f57460p = y11;
    }

    @Override // xj.g
    public int q() {
        return this.f57461q;
    }

    protected boolean x(ci.i iVar, int i11, float f11, long j11) {
        return ((long) Math.round(((float) i11) * f11)) <= j11;
    }
}