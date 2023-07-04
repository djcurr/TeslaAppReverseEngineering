package ti;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import com.google.android.exoplayer2.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import ji.v;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import ti.i0;

/* loaded from: classes3.dex */
public final class h0 implements ji.h {

    /* renamed from: a */
    private final int f52041a;

    /* renamed from: b */
    private final int f52042b;

    /* renamed from: c */
    private final List<ak.g0> f52043c;

    /* renamed from: d */
    private final ak.v f52044d;

    /* renamed from: e */
    private final SparseIntArray f52045e;

    /* renamed from: f */
    private final i0.c f52046f;

    /* renamed from: g */
    private final SparseArray<i0> f52047g;

    /* renamed from: h */
    private final SparseBooleanArray f52048h;

    /* renamed from: i */
    private final SparseBooleanArray f52049i;

    /* renamed from: j */
    private final f0 f52050j;

    /* renamed from: k */
    private e0 f52051k;

    /* renamed from: l */
    private ji.j f52052l;

    /* renamed from: m */
    private int f52053m;

    /* renamed from: n */
    private boolean f52054n;

    /* renamed from: o */
    private boolean f52055o;

    /* renamed from: p */
    private boolean f52056p;

    /* renamed from: q */
    private i0 f52057q;

    /* renamed from: r */
    private int f52058r;

    /* renamed from: s */
    private int f52059s;

    /* loaded from: classes3.dex */
    public class a implements b0 {

        /* renamed from: a */
        private final ak.u f52060a = new ak.u(new byte[4]);

        public a() {
            h0.this = r2;
        }

        @Override // ti.b0
        public void b(ak.g0 g0Var, ji.j jVar, i0.d dVar) {
        }

        @Override // ti.b0
        public void c(ak.v vVar) {
            if (vVar.C() == 0 && (vVar.C() & 128) != 0) {
                vVar.P(6);
                int a11 = vVar.a() / 4;
                for (int i11 = 0; i11 < a11; i11++) {
                    vVar.i(this.f52060a, 4);
                    int h11 = this.f52060a.h(16);
                    this.f52060a.r(3);
                    if (h11 == 0) {
                        this.f52060a.r(13);
                    } else {
                        int h12 = this.f52060a.h(13);
                        if (h0.this.f52047g.get(h12) == null) {
                            h0.this.f52047g.put(h12, new c0(new b(h12)));
                            h0.k(h0.this);
                        }
                    }
                }
                if (h0.this.f52041a != 2) {
                    h0.this.f52047g.remove(0);
                }
            }
        }
    }

    /* loaded from: classes3.dex */
    private class b implements b0 {

        /* renamed from: a */
        private final ak.u f52062a = new ak.u(new byte[5]);

        /* renamed from: b */
        private final SparseArray<i0> f52063b = new SparseArray<>();

        /* renamed from: c */
        private final SparseIntArray f52064c = new SparseIntArray();

        /* renamed from: d */
        private final int f52065d;

        public b(int i11) {
            h0.this = r2;
            this.f52065d = i11;
        }

        private i0.b a(ak.v vVar, int i11) {
            int e11 = vVar.e();
            int i12 = i11 + e11;
            String str = null;
            int i13 = -1;
            ArrayList arrayList = null;
            while (vVar.e() < i12) {
                int C = vVar.C();
                int e12 = vVar.e() + vVar.C();
                if (e12 > i12) {
                    break;
                }
                if (C == 5) {
                    long E = vVar.E();
                    if (E != 1094921523) {
                        if (E != 1161904947) {
                            if (E != 1094921524) {
                                if (E == 1212503619) {
                                    i13 = 36;
                                }
                            }
                            i13 = 172;
                        }
                        i13 = 135;
                    }
                    i13 = 129;
                } else {
                    if (C != 106) {
                        if (C != 122) {
                            if (C == 127) {
                                if (vVar.C() != 21) {
                                }
                                i13 = 172;
                            } else if (C == 123) {
                                i13 = 138;
                            } else if (C == 10) {
                                str = vVar.z(3).trim();
                            } else if (C == 89) {
                                arrayList = new ArrayList();
                                while (vVar.e() < e12) {
                                    String trim = vVar.z(3).trim();
                                    int C2 = vVar.C();
                                    byte[] bArr = new byte[4];
                                    vVar.j(bArr, 0, 4);
                                    arrayList.add(new i0.a(trim, C2, bArr));
                                }
                                i13 = 89;
                            } else if (C == 111) {
                                i13 = 257;
                            }
                        }
                        i13 = 135;
                    }
                    i13 = 129;
                }
                vVar.P(e12 - vVar.e());
            }
            vVar.O(i12);
            return new i0.b(i13, str, arrayList, Arrays.copyOfRange(vVar.d(), e11, i12));
        }

        @Override // ti.b0
        public void b(ak.g0 g0Var, ji.j jVar, i0.d dVar) {
        }

        @Override // ti.b0
        public void c(ak.v vVar) {
            ak.g0 g0Var;
            if (vVar.C() != 2) {
                return;
            }
            if (h0.this.f52041a == 1 || h0.this.f52041a == 2 || h0.this.f52053m == 1) {
                g0Var = (ak.g0) h0.this.f52043c.get(0);
            } else {
                g0Var = new ak.g0(((ak.g0) h0.this.f52043c.get(0)).c());
                h0.this.f52043c.add(g0Var);
            }
            if ((vVar.C() & 128) == 0) {
                return;
            }
            vVar.P(1);
            int I = vVar.I();
            int i11 = 3;
            vVar.P(3);
            vVar.i(this.f52062a, 2);
            this.f52062a.r(3);
            int i12 = 13;
            h0.this.f52059s = this.f52062a.h(13);
            vVar.i(this.f52062a, 2);
            int i13 = 4;
            this.f52062a.r(4);
            vVar.P(this.f52062a.h(12));
            if (h0.this.f52041a == 2 && h0.this.f52057q == null) {
                i0.b bVar = new i0.b(21, null, null, ak.k0.f482f);
                h0 h0Var = h0.this;
                h0Var.f52057q = h0Var.f52046f.a(21, bVar);
                h0.this.f52057q.b(g0Var, h0.this.f52052l, new i0.d(I, 21, PKIFailureInfo.certRevoked));
            }
            this.f52063b.clear();
            this.f52064c.clear();
            int a11 = vVar.a();
            while (a11 > 0) {
                vVar.i(this.f52062a, 5);
                int h11 = this.f52062a.h(8);
                this.f52062a.r(i11);
                int h12 = this.f52062a.h(i12);
                this.f52062a.r(i13);
                int h13 = this.f52062a.h(12);
                i0.b a12 = a(vVar, h13);
                if (h11 == 6 || h11 == 5) {
                    h11 = a12.f52091a;
                }
                a11 -= h13 + 5;
                int i14 = h0.this.f52041a == 2 ? h11 : h12;
                if (!h0.this.f52048h.get(i14)) {
                    i0 a13 = (h0.this.f52041a == 2 && h11 == 21) ? h0.this.f52057q : h0.this.f52046f.a(h11, a12);
                    if (h0.this.f52041a != 2 || h12 < this.f52064c.get(i14, PKIFailureInfo.certRevoked)) {
                        this.f52064c.put(i14, h12);
                        this.f52063b.put(i14, a13);
                    }
                }
                i11 = 3;
                i13 = 4;
                i12 = 13;
            }
            int size = this.f52064c.size();
            for (int i15 = 0; i15 < size; i15++) {
                int keyAt = this.f52064c.keyAt(i15);
                int valueAt = this.f52064c.valueAt(i15);
                h0.this.f52048h.put(keyAt, true);
                h0.this.f52049i.put(valueAt, true);
                i0 valueAt2 = this.f52063b.valueAt(i15);
                if (valueAt2 != null) {
                    if (valueAt2 != h0.this.f52057q) {
                        valueAt2.b(g0Var, h0.this.f52052l, new i0.d(I, keyAt, PKIFailureInfo.certRevoked));
                    }
                    h0.this.f52047g.put(valueAt, valueAt2);
                }
            }
            if (h0.this.f52041a == 2) {
                if (h0.this.f52054n) {
                    return;
                }
                h0.this.f52052l.s();
                h0.this.f52053m = 0;
                h0.this.f52054n = true;
                return;
            }
            h0.this.f52047g.remove(this.f52065d);
            h0 h0Var2 = h0.this;
            h0Var2.f52053m = h0Var2.f52041a == 1 ? 0 : h0.this.f52053m - 1;
            if (h0.this.f52053m == 0) {
                h0.this.f52052l.s();
                h0.this.f52054n = true;
            }
        }
    }

    static {
        g0 g0Var = new ji.l() { // from class: ti.g0
            @Override // ji.l
            public final ji.h[] b() {
                return h0.c();
            }
        };
    }

    public h0() {
        this(0);
    }

    public static /* synthetic */ ji.h[] c() {
        return w();
    }

    static /* synthetic */ int k(h0 h0Var) {
        int i11 = h0Var.f52053m;
        h0Var.f52053m = i11 + 1;
        return i11;
    }

    private boolean u(ji.i iVar) {
        byte[] d11 = this.f52044d.d();
        if (9400 - this.f52044d.e() < 188) {
            int a11 = this.f52044d.a();
            if (a11 > 0) {
                System.arraycopy(d11, this.f52044d.e(), d11, 0, a11);
            }
            this.f52044d.M(d11, a11);
        }
        while (this.f52044d.a() < 188) {
            int f11 = this.f52044d.f();
            int read = iVar.read(d11, f11, 9400 - f11);
            if (read == -1) {
                return false;
            }
            this.f52044d.N(f11 + read);
        }
        return true;
    }

    private int v() {
        int e11 = this.f52044d.e();
        int f11 = this.f52044d.f();
        int a11 = j0.a(this.f52044d.d(), e11, f11);
        this.f52044d.O(a11);
        int i11 = a11 + 188;
        if (i11 > f11) {
            int i12 = this.f52058r + (a11 - e11);
            this.f52058r = i12;
            if (this.f52041a == 2 && i12 > 376) {
                throw new ParserException("Cannot find sync byte. Most likely not a Transport Stream.");
            }
        } else {
            this.f52058r = 0;
        }
        return i11;
    }

    public static /* synthetic */ ji.h[] w() {
        return new ji.h[]{new h0()};
    }

    private void x(long j11) {
        if (this.f52055o) {
            return;
        }
        this.f52055o = true;
        if (this.f52050j.b() != -9223372036854775807L) {
            e0 e0Var = new e0(this.f52050j.c(), this.f52050j.b(), j11, this.f52059s, this.f52042b);
            this.f52051k = e0Var;
            this.f52052l.p(e0Var.b());
            return;
        }
        this.f52052l.p(new v.b(this.f52050j.b()));
    }

    private void y() {
        this.f52048h.clear();
        this.f52047g.clear();
        SparseArray<i0> b11 = this.f52046f.b();
        int size = b11.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.f52047g.put(b11.keyAt(i11), b11.valueAt(i11));
        }
        this.f52047g.put(0, new c0(new a()));
        this.f52057q = null;
    }

    private boolean z(int i11) {
        return this.f52041a == 2 || this.f52054n || !this.f52049i.get(i11, false);
    }

    @Override // ji.h
    public void a(long j11, long j12) {
        e0 e0Var;
        ak.a.f(this.f52041a != 2);
        int size = this.f52043c.size();
        for (int i11 = 0; i11 < size; i11++) {
            ak.g0 g0Var = this.f52043c.get(i11);
            if ((g0Var.e() == -9223372036854775807L) || (g0Var.e() != 0 && g0Var.c() != j12)) {
                g0Var.g();
                g0Var.h(j12);
            }
        }
        if (j12 != 0 && (e0Var = this.f52051k) != null) {
            e0Var.h(j12);
        }
        this.f52044d.K(0);
        this.f52045e.clear();
        for (int i12 = 0; i12 < this.f52047g.size(); i12++) {
            this.f52047g.valueAt(i12).a();
        }
        this.f52058r = 0;
    }

    @Override // ji.h
    public void b(ji.j jVar) {
        this.f52052l = jVar;
    }

    @Override // ji.h
    public boolean d(ji.i iVar) {
        boolean z11;
        byte[] d11 = this.f52044d.d();
        iVar.n(d11, 0, 940);
        for (int i11 = 0; i11 < 188; i11++) {
            int i12 = 0;
            while (true) {
                if (i12 >= 5) {
                    z11 = true;
                    break;
                } else if (d11[(i12 * 188) + i11] != 71) {
                    z11 = false;
                    break;
                } else {
                    i12++;
                }
            }
            if (z11) {
                iVar.k(i11);
                return true;
            }
        }
        return false;
    }

    @Override // ji.h
    public int e(ji.i iVar, ji.u uVar) {
        long length = iVar.getLength();
        if (this.f52054n) {
            if (((length == -1 || this.f52041a == 2) ? false : true) && !this.f52050j.d()) {
                return this.f52050j.e(iVar, uVar, this.f52059s);
            }
            x(length);
            if (this.f52056p) {
                this.f52056p = false;
                a(0L, 0L);
                if (iVar.getPosition() != 0) {
                    uVar.f33770a = 0L;
                    return 1;
                }
            }
            e0 e0Var = this.f52051k;
            if (e0Var != null && e0Var.d()) {
                return this.f52051k.c(iVar, uVar);
            }
        }
        if (u(iVar)) {
            int v11 = v();
            int f11 = this.f52044d.f();
            if (v11 > f11) {
                return 0;
            }
            int m11 = this.f52044d.m();
            if ((8388608 & m11) != 0) {
                this.f52044d.O(v11);
                return 0;
            }
            int i11 = ((4194304 & m11) != 0 ? 1 : 0) | 0;
            int i12 = (2096896 & m11) >> 8;
            boolean z11 = (m11 & 32) != 0;
            i0 i0Var = (m11 & 16) != 0 ? this.f52047g.get(i12) : null;
            if (i0Var == null) {
                this.f52044d.O(v11);
                return 0;
            }
            if (this.f52041a != 2) {
                int i13 = m11 & 15;
                int i14 = this.f52045e.get(i12, i13 - 1);
                this.f52045e.put(i12, i13);
                if (i14 == i13) {
                    this.f52044d.O(v11);
                    return 0;
                } else if (i13 != ((i14 + 1) & 15)) {
                    i0Var.a();
                }
            }
            if (z11) {
                int C = this.f52044d.C();
                i11 |= (this.f52044d.C() & 64) != 0 ? 2 : 0;
                this.f52044d.P(C - 1);
            }
            boolean z12 = this.f52054n;
            if (z(i12)) {
                this.f52044d.N(v11);
                i0Var.c(this.f52044d, i11);
                this.f52044d.N(f11);
            }
            if (this.f52041a != 2 && !z12 && this.f52054n && length != -1) {
                this.f52056p = true;
            }
            this.f52044d.O(v11);
            return 0;
        }
        return -1;
    }

    @Override // ji.h
    public void release() {
    }

    public h0(int i11) {
        this(1, i11, 112800);
    }

    public h0(int i11, int i12, int i13) {
        this(i11, new ak.g0(0L), new j(i12), i13);
    }

    public h0(int i11, ak.g0 g0Var, i0.c cVar) {
        this(i11, g0Var, cVar, 112800);
    }

    public h0(int i11, ak.g0 g0Var, i0.c cVar, int i12) {
        this.f52046f = (i0.c) ak.a.e(cVar);
        this.f52042b = i12;
        this.f52041a = i11;
        if (i11 != 1 && i11 != 2) {
            ArrayList arrayList = new ArrayList();
            this.f52043c = arrayList;
            arrayList.add(g0Var);
        } else {
            this.f52043c = Collections.singletonList(g0Var);
        }
        this.f52044d = new ak.v(new byte[9400], 0);
        this.f52048h = new SparseBooleanArray();
        this.f52049i = new SparseBooleanArray();
        this.f52047g = new SparseArray<>();
        this.f52045e = new SparseIntArray();
        this.f52050j = new f0(i12);
        this.f52059s = -1;
        y();
    }
}