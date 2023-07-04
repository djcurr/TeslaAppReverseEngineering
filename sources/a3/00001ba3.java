package com.google.android.exoplayer2;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.h;
import com.google.android.exoplayer2.i0;
import com.google.android.exoplayer2.q0;
import com.google.android.exoplayer2.source.i;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.t0;
import com.google.android.exoplayer2.trackselection.ExoTrackSelection;
import com.google.android.exoplayer2.v0;
import com.google.android.exoplayer2.z0;
import com.google.common.collect.r;
import di.d1;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import wi.a;
import xj.m;

/* loaded from: classes3.dex */
public final class g0 implements Handler.Callback, i.a, m.a, q0.d, h.a, t0.a {
    private r0 A;
    private e B;
    private boolean C;
    private boolean E;
    private boolean F;
    private boolean G;
    private boolean H;
    private int K;
    private boolean L;
    private boolean O;
    private boolean P;
    private boolean Q;
    private int R;
    private h T;
    private long Y;

    /* renamed from: a */
    private final v0[] f13440a;

    /* renamed from: b */
    private final ci.n[] f13441b;

    /* renamed from: b1 */
    private int f13442b1;

    /* renamed from: c */
    private final xj.m f13443c;

    /* renamed from: d */
    private final xj.n f13444d;

    /* renamed from: e */
    private final ci.k f13445e;

    /* renamed from: f */
    private final zj.d f13446f;

    /* renamed from: g */
    private final ak.j f13447g;

    /* renamed from: g1 */
    private boolean f13448g1;

    /* renamed from: h */
    private final HandlerThread f13449h;

    /* renamed from: i */
    private final Looper f13450i;

    /* renamed from: j */
    private final z0.c f13451j;

    /* renamed from: k */
    private final z0.b f13452k;

    /* renamed from: l */
    private final long f13453l;

    /* renamed from: m */
    private final boolean f13454m;

    /* renamed from: n */
    private final com.google.android.exoplayer2.h f13455n;

    /* renamed from: o */
    private final ArrayList<d> f13456o;

    /* renamed from: p */
    private final ak.b f13457p;

    /* renamed from: p1 */
    private ExoPlaybackException f13458p1;

    /* renamed from: q */
    private final f f13459q;

    /* renamed from: t */
    private final n0 f13460t;

    /* renamed from: w */
    private final q0 f13461w;

    /* renamed from: x */
    private final h0 f13462x;

    /* renamed from: y */
    private final long f13463y;

    /* renamed from: z */
    private ci.q f13464z;

    /* loaded from: classes3.dex */
    public class a implements v0.a {
        a() {
            g0.this = r1;
        }

        @Override // com.google.android.exoplayer2.v0.a
        public void a() {
            g0.this.f13447g.h(2);
        }

        @Override // com.google.android.exoplayer2.v0.a
        public void b(long j11) {
            if (j11 >= 2000) {
                g0.this.P = true;
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        private final List<q0.c> f13466a;

        /* renamed from: b */
        private final fj.s f13467b;

        /* renamed from: c */
        private final int f13468c;

        /* renamed from: d */
        private final long f13469d;

        /* synthetic */ b(List list, fj.s sVar, int i11, long j11, a aVar) {
            this(list, sVar, i11, j11);
        }

        private b(List<q0.c> list, fj.s sVar, int i11, long j11) {
            this.f13466a = list;
            this.f13467b = sVar;
            this.f13468c = i11;
            this.f13469d = j11;
        }
    }

    /* loaded from: classes3.dex */
    public static class c {

        /* renamed from: a */
        public final int f13470a;

        /* renamed from: b */
        public final int f13471b;

        /* renamed from: c */
        public final int f13472c;

        /* renamed from: d */
        public final fj.s f13473d;
    }

    /* loaded from: classes3.dex */
    public static final class d implements Comparable<d> {

        /* renamed from: a */
        public final t0 f13474a;

        /* renamed from: b */
        public int f13475b;

        /* renamed from: c */
        public long f13476c;

        /* renamed from: d */
        public Object f13477d;

        public d(t0 t0Var) {
            this.f13474a = t0Var;
        }

        @Override // java.lang.Comparable
        /* renamed from: a */
        public int compareTo(d dVar) {
            Object obj = this.f13477d;
            if ((obj == null) != (dVar.f13477d == null)) {
                return obj != null ? -1 : 1;
            } else if (obj == null) {
                return 0;
            } else {
                int i11 = this.f13475b - dVar.f13475b;
                return i11 != 0 ? i11 : ak.k0.p(this.f13476c, dVar.f13476c);
            }
        }

        public void b(int i11, long j11, Object obj) {
            this.f13475b = i11;
            this.f13476c = j11;
            this.f13477d = obj;
        }
    }

    /* loaded from: classes3.dex */
    public static final class e {

        /* renamed from: a */
        private boolean f13478a;

        /* renamed from: b */
        public r0 f13479b;

        /* renamed from: c */
        public int f13480c;

        /* renamed from: d */
        public boolean f13481d;

        /* renamed from: e */
        public int f13482e;

        /* renamed from: f */
        public boolean f13483f;

        /* renamed from: g */
        public int f13484g;

        public e(r0 r0Var) {
            this.f13479b = r0Var;
        }

        public void b(int i11) {
            this.f13478a |= i11 > 0;
            this.f13480c += i11;
        }

        public void c(int i11) {
            this.f13478a = true;
            this.f13483f = true;
            this.f13484g = i11;
        }

        public void d(r0 r0Var) {
            this.f13478a |= this.f13479b != r0Var;
            this.f13479b = r0Var;
        }

        public void e(int i11) {
            if (this.f13481d && this.f13482e != 4) {
                ak.a.a(i11 == 4);
                return;
            }
            this.f13478a = true;
            this.f13481d = true;
            this.f13482e = i11;
        }
    }

    /* loaded from: classes3.dex */
    public interface f {
        void a(e eVar);
    }

    /* loaded from: classes3.dex */
    public static final class g {

        /* renamed from: a */
        public final j.a f13485a;

        /* renamed from: b */
        public final long f13486b;

        /* renamed from: c */
        public final long f13487c;

        /* renamed from: d */
        public final boolean f13488d;

        /* renamed from: e */
        public final boolean f13489e;

        /* renamed from: f */
        public final boolean f13490f;

        public g(j.a aVar, long j11, long j12, boolean z11, boolean z12, boolean z13) {
            this.f13485a = aVar;
            this.f13486b = j11;
            this.f13487c = j12;
            this.f13488d = z11;
            this.f13489e = z12;
            this.f13490f = z13;
        }
    }

    /* loaded from: classes3.dex */
    public static final class h {

        /* renamed from: a */
        public final z0 f13491a;

        /* renamed from: b */
        public final int f13492b;

        /* renamed from: c */
        public final long f13493c;

        public h(z0 z0Var, int i11, long j11) {
            this.f13491a = z0Var;
            this.f13492b = i11;
            this.f13493c = j11;
        }
    }

    public g0(v0[] v0VarArr, xj.m mVar, xj.n nVar, ci.k kVar, zj.d dVar, int i11, boolean z11, d1 d1Var, ci.q qVar, h0 h0Var, long j11, boolean z12, Looper looper, ak.b bVar, f fVar) {
        this.f13459q = fVar;
        this.f13440a = v0VarArr;
        this.f13443c = mVar;
        this.f13444d = nVar;
        this.f13445e = kVar;
        this.f13446f = dVar;
        this.K = i11;
        this.L = z11;
        this.f13464z = qVar;
        this.f13462x = h0Var;
        this.f13463y = j11;
        this.E = z12;
        this.f13457p = bVar;
        this.f13453l = kVar.c();
        this.f13454m = kVar.b();
        r0 k11 = r0.k(nVar);
        this.A = k11;
        this.B = new e(k11);
        this.f13441b = new ci.n[v0VarArr.length];
        for (int i12 = 0; i12 < v0VarArr.length; i12++) {
            v0VarArr[i12].setIndex(i12);
            this.f13441b[i12] = v0VarArr[i12].q();
        }
        this.f13455n = new com.google.android.exoplayer2.h(this, bVar);
        this.f13456o = new ArrayList<>();
        this.f13451j = new z0.c();
        this.f13452k = new z0.b();
        mVar.b(this, dVar);
        this.f13448g1 = true;
        Handler handler = new Handler(looper);
        this.f13460t = new n0(d1Var, handler);
        this.f13461w = new q0(this, d1Var, handler);
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:Playback", -16);
        this.f13449h = handlerThread;
        handlerThread.start();
        Looper looper2 = handlerThread.getLooper();
        this.f13450i = looper2;
        this.f13447g = bVar.b(looper2, this);
    }

    private Pair<j.a, Long> A(z0 z0Var) {
        if (z0Var.q()) {
            return Pair.create(r0.l(), 0L);
        }
        Pair<Object, Long> j11 = z0Var.j(this.f13451j, this.f13452k, z0Var.a(this.L), -9223372036854775807L);
        j.a z11 = this.f13460t.z(z0Var, j11.first, 0L);
        long longValue = ((Long) j11.second).longValue();
        if (z11.b()) {
            z0Var.h(z11.f26303a, this.f13452k);
            longValue = z11.f26305c == this.f13452k.i(z11.f26304b) ? this.f13452k.g() : 0L;
        }
        return Pair.create(z11, Long.valueOf(longValue));
    }

    private long A0(j.a aVar, long j11, boolean z11) {
        return B0(aVar, j11, this.f13460t.o() != this.f13460t.p(), z11);
    }

    private long B0(j.a aVar, long j11, boolean z11, boolean z12) {
        f1();
        this.G = false;
        if (z12 || this.A.f13763d == 3) {
            V0(2);
        }
        k0 o11 = this.f13460t.o();
        k0 k0Var = o11;
        while (k0Var != null && !aVar.equals(k0Var.f13575f.f13586a)) {
            k0Var = k0Var.j();
        }
        if (z11 || o11 != k0Var || (k0Var != null && k0Var.z(j11) < 0)) {
            for (v0 v0Var : this.f13440a) {
                o(v0Var);
            }
            if (k0Var != null) {
                while (this.f13460t.o() != k0Var) {
                    this.f13460t.b();
                }
                this.f13460t.y(k0Var);
                k0Var.x(0L);
                s();
            }
        }
        if (k0Var != null) {
            this.f13460t.y(k0Var);
            if (!k0Var.f13573d) {
                k0Var.f13575f = k0Var.f13575f.b(j11);
            } else {
                long j12 = k0Var.f13575f.f13590e;
                if (j12 != -9223372036854775807L && j11 >= j12) {
                    j11 = Math.max(0L, j12 - 1);
                }
                if (k0Var.f13574e) {
                    long k11 = k0Var.f13570a.k(j11);
                    k0Var.f13570a.u(k11 - this.f13453l, this.f13454m);
                    j11 = k11;
                }
            }
            p0(j11);
            R();
        } else {
            this.f13460t.f();
            p0(j11);
        }
        F(false);
        this.f13447g.h(2);
        return j11;
    }

    private long C() {
        return D(this.A.f13775p);
    }

    private void C0(t0 t0Var) {
        if (t0Var.e() == -9223372036854775807L) {
            D0(t0Var);
        } else if (this.A.f13760a.q()) {
            this.f13456o.add(new d(t0Var));
        } else {
            d dVar = new d(t0Var);
            z0 z0Var = this.A.f13760a;
            if (r0(dVar, z0Var, z0Var, this.K, this.L, this.f13451j, this.f13452k)) {
                this.f13456o.add(dVar);
                Collections.sort(this.f13456o);
                return;
            }
            t0Var.k(false);
        }
    }

    private long D(long j11) {
        k0 j12 = this.f13460t.j();
        if (j12 == null) {
            return 0L;
        }
        return Math.max(0L, j11 - j12.y(this.Y));
    }

    private void D0(t0 t0Var) {
        if (t0Var.c() == this.f13450i) {
            m(t0Var);
            int i11 = this.A.f13763d;
            if (i11 == 3 || i11 == 2) {
                this.f13447g.h(2);
                return;
            }
            return;
        }
        this.f13447g.d(15, t0Var).sendToTarget();
    }

    private void E(com.google.android.exoplayer2.source.i iVar) {
        if (this.f13460t.u(iVar)) {
            this.f13460t.x(this.Y);
            R();
        }
    }

    private void E0(final t0 t0Var) {
        Looper c11 = t0Var.c();
        if (!c11.getThread().isAlive()) {
            ak.o.h("TAG", "Trying to send message on a dead thread.");
            t0Var.k(false);
            return;
        }
        this.f13457p.b(c11, null).g(new Runnable() { // from class: com.google.android.exoplayer2.f0
            {
                g0.this = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                g0.g(g0.this, t0Var);
            }
        });
    }

    private void F(boolean z11) {
        long i11;
        k0 j11 = this.f13460t.j();
        j.a aVar = j11 == null ? this.A.f13761b : j11.f13575f.f13586a;
        boolean z12 = !this.A.f13769j.equals(aVar);
        if (z12) {
            this.A = this.A.b(aVar);
        }
        r0 r0Var = this.A;
        if (j11 == null) {
            i11 = r0Var.f13777r;
        } else {
            i11 = j11.i();
        }
        r0Var.f13775p = i11;
        this.A.f13776q = C();
        if ((z12 || z11) && j11 != null && j11.f13573d) {
            i1(j11.n(), j11.o());
        }
    }

    private void F0() {
        v0[] v0VarArr;
        for (v0 v0Var : this.f13440a) {
            if (v0Var.f() != null) {
                v0Var.h();
            }
        }
    }

    private void G(z0 z0Var) {
        h hVar;
        g t02 = t0(z0Var, this.A, this.T, this.f13460t, this.K, this.L, this.f13451j, this.f13452k);
        j.a aVar = t02.f13485a;
        long j11 = t02.f13487c;
        boolean z11 = t02.f13488d;
        long j12 = t02.f13486b;
        boolean z12 = (this.A.f13761b.equals(aVar) && j12 == this.A.f13777r) ? false : true;
        try {
            if (t02.f13489e) {
                if (this.A.f13763d != 1) {
                    V0(4);
                }
                n0(false, false, false, true);
            }
        } catch (Throwable th2) {
            th = th2;
            hVar = null;
        }
        try {
            if (!z12) {
                if (!this.f13460t.E(z0Var, this.Y, z())) {
                    y0(false);
                }
            } else if (!z0Var.q()) {
                for (k0 o11 = this.f13460t.o(); o11 != null; o11 = o11.j()) {
                    if (o11.f13575f.f13586a.equals(aVar)) {
                        o11.f13575f = this.f13460t.q(z0Var, o11.f13575f);
                    }
                }
                j12 = A0(aVar, j12, z11);
            }
            r0 r0Var = this.A;
            h1(z0Var, aVar, r0Var.f13760a, r0Var.f13761b, t02.f13490f ? j12 : -9223372036854775807L);
            if (z12 || j11 != this.A.f13762c) {
                this.A = K(aVar, j12, j11);
            }
            o0();
            s0(z0Var, this.A.f13760a);
            this.A = this.A.j(z0Var);
            if (!z0Var.q()) {
                this.T = null;
            }
            F(false);
        } catch (Throwable th3) {
            th = th3;
            hVar = null;
            r0 r0Var2 = this.A;
            h hVar2 = hVar;
            h1(z0Var, aVar, r0Var2.f13760a, r0Var2.f13761b, t02.f13490f ? j12 : -9223372036854775807L);
            if (z12 || j11 != this.A.f13762c) {
                this.A = K(aVar, j12, j11);
            }
            o0();
            s0(z0Var, this.A.f13760a);
            this.A = this.A.j(z0Var);
            if (!z0Var.q()) {
                this.T = hVar2;
            }
            F(false);
            throw th;
        }
    }

    private void G0(boolean z11, AtomicBoolean atomicBoolean) {
        v0[] v0VarArr;
        if (this.O != z11) {
            this.O = z11;
            if (!z11) {
                for (v0 v0Var : this.f13440a) {
                    if (!N(v0Var)) {
                        v0Var.reset();
                    }
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private void H(com.google.android.exoplayer2.source.i iVar) {
        if (this.f13460t.u(iVar)) {
            k0 j11 = this.f13460t.j();
            j11.p(this.f13455n.b().f9245a, this.A.f13760a);
            i1(j11.n(), j11.o());
            if (j11 == this.f13460t.o()) {
                p0(j11.f13575f.f13587b);
                s();
                r0 r0Var = this.A;
                this.A = K(r0Var.f13761b, j11.f13575f.f13587b, r0Var.f13762c);
            }
            R();
        }
    }

    private void H0(b bVar) {
        this.B.b(1);
        if (bVar.f13468c != -1) {
            this.T = new h(new u0(bVar.f13466a, bVar.f13467b), bVar.f13468c, bVar.f13469d);
        }
        G(this.f13461w.C(bVar.f13466a, bVar.f13467b));
    }

    private void I(ci.l lVar, float f11, boolean z11, boolean z12) {
        v0[] v0VarArr;
        if (z11) {
            if (z12) {
                this.B.b(1);
            }
            this.A = this.A.g(lVar);
        }
        l1(lVar.f9245a);
        for (v0 v0Var : this.f13440a) {
            if (v0Var != null) {
                v0Var.t(f11, lVar.f9245a);
            }
        }
    }

    private void J(ci.l lVar, boolean z11) {
        I(lVar, lVar.f9245a, true, z11);
    }

    private void J0(boolean z11) {
        if (z11 == this.Q) {
            return;
        }
        this.Q = z11;
        r0 r0Var = this.A;
        int i11 = r0Var.f13763d;
        if (!z11 && i11 != 4 && i11 != 1) {
            this.f13447g.h(2);
        } else {
            this.A = r0Var.d(z11);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private r0 K(j.a aVar, long j11, long j12) {
        List list;
        fj.v vVar;
        xj.n nVar;
        fj.v n11;
        xj.n o11;
        this.f13448g1 = (!this.f13448g1 && j11 == this.A.f13777r && aVar.equals(this.A.f13761b)) ? false : true;
        o0();
        r0 r0Var = this.A;
        fj.v vVar2 = r0Var.f13766g;
        xj.n nVar2 = r0Var.f13767h;
        List list2 = r0Var.f13768i;
        if (this.f13461w.s()) {
            k0 o12 = this.f13460t.o();
            if (o12 == null) {
                n11 = fj.v.f26353d;
            } else {
                n11 = o12.n();
            }
            if (o12 == null) {
                o11 = this.f13444d;
            } else {
                o11 = o12.o();
            }
            List v11 = v(o11.f57590c);
            if (o12 != null) {
                l0 l0Var = o12.f13575f;
                if (l0Var.f13588c != j12) {
                    o12.f13575f = l0Var.a(j12);
                }
            }
            vVar = n11;
            nVar = o11;
            list = v11;
        } else if (aVar.equals(this.A.f13761b)) {
            list = list2;
            vVar = vVar2;
            nVar = nVar2;
        } else {
            vVar = fj.v.f26353d;
            nVar = this.f13444d;
            list = com.google.common.collect.r.r();
        }
        return this.A.c(aVar, j11, j12, C(), vVar, nVar, list);
    }

    private void K0(boolean z11) {
        this.E = z11;
        o0();
        if (!this.F || this.f13460t.p() == this.f13460t.o()) {
            return;
        }
        y0(true);
        F(false);
    }

    private boolean L() {
        k0 p11 = this.f13460t.p();
        if (p11.f13573d) {
            int i11 = 0;
            while (true) {
                v0[] v0VarArr = this.f13440a;
                if (i11 >= v0VarArr.length) {
                    return true;
                }
                v0 v0Var = v0VarArr[i11];
                fj.r rVar = p11.f13572c[i11];
                if (v0Var.f() != rVar || (rVar != null && !v0Var.g())) {
                    break;
                }
                i11++;
            }
            return false;
        }
        return false;
    }

    private boolean M() {
        k0 j11 = this.f13460t.j();
        return (j11 == null || j11.k() == Long.MIN_VALUE) ? false : true;
    }

    private void M0(boolean z11, int i11, boolean z12, int i12) {
        this.B.b(z12 ? 1 : 0);
        this.B.c(i12);
        this.A = this.A.e(z11, i11);
        this.G = false;
        c0(z11);
        if (!Y0()) {
            f1();
            k1();
            return;
        }
        int i13 = this.A.f13763d;
        if (i13 == 3) {
            c1();
            this.f13447g.h(2);
        } else if (i13 == 2) {
            this.f13447g.h(2);
        }
    }

    private static boolean N(v0 v0Var) {
        return v0Var.getState() != 0;
    }

    private boolean O() {
        k0 o11 = this.f13460t.o();
        long j11 = o11.f13575f.f13590e;
        return o11.f13573d && (j11 == -9223372036854775807L || this.A.f13777r < j11 || !Y0());
    }

    private void O0(ci.l lVar) {
        this.f13455n.e(lVar);
        J(this.f13455n.b(), true);
    }

    public /* synthetic */ Boolean P() {
        return Boolean.valueOf(this.C);
    }

    public /* synthetic */ void Q(t0 t0Var) {
        try {
            m(t0Var);
        } catch (ExoPlaybackException e11) {
            ak.o.d("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e11);
            throw new RuntimeException(e11);
        }
    }

    private void Q0(int i11) {
        this.K = i11;
        if (!this.f13460t.F(this.A.f13760a, i11)) {
            y0(true);
        }
        F(false);
    }

    private void R() {
        boolean X0 = X0();
        this.H = X0;
        if (X0) {
            this.f13460t.j().d(this.Y);
        }
        g1();
    }

    private void R0(ci.q qVar) {
        this.f13464z = qVar;
    }

    private void S() {
        this.B.d(this.A);
        if (this.B.f13478a) {
            this.f13459q.a(this.B);
            this.B = new e(this.A);
        }
    }

    private boolean T(long j11, long j12) {
        if (this.Q && this.P) {
            return false;
        }
        w0(j11, j12);
        return true;
    }

    private void T0(boolean z11) {
        this.L = z11;
        if (!this.f13460t.G(this.A.f13760a, z11)) {
            y0(true);
        }
        F(false);
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0090 A[LOOP:1: B:121:0x0074->B:131:0x0090, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0073 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x00dc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:107:0x0044 -> B:108:0x0045). Please submit an issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:120:0x0073 -> B:121:0x0074). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void U(long r8, long r10) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g0.U(long, long):void");
    }

    private void U0(fj.s sVar) {
        this.B.b(1);
        G(this.f13461w.D(sVar));
    }

    private void V() {
        l0 n11;
        this.f13460t.x(this.Y);
        if (this.f13460t.C() && (n11 = this.f13460t.n(this.Y, this.A)) != null) {
            k0 g11 = this.f13460t.g(this.f13441b, this.f13443c, this.f13445e.e(), this.f13461w, n11, this.f13444d);
            g11.f13570a.m(this, n11.f13587b);
            if (this.f13460t.o() == g11) {
                p0(g11.m());
            }
            F(false);
        }
        if (this.H) {
            this.H = M();
            g1();
            return;
        }
        R();
    }

    private void V0(int i11) {
        r0 r0Var = this.A;
        if (r0Var.f13763d != i11) {
            this.A = r0Var.h(i11);
        }
    }

    private void W() {
        boolean z11 = false;
        while (W0()) {
            if (z11) {
                S();
            }
            k0 o11 = this.f13460t.o();
            k0 b11 = this.f13460t.b();
            l0 l0Var = b11.f13575f;
            this.A = K(l0Var.f13586a, l0Var.f13587b, l0Var.f13588c);
            this.B.e(o11.f13575f.f13591f ? 0 : 3);
            z0 z0Var = this.A.f13760a;
            h1(z0Var, b11.f13575f.f13586a, z0Var, o11.f13575f.f13586a, -9223372036854775807L);
            o0();
            k1();
            z11 = true;
        }
    }

    private boolean W0() {
        k0 o11;
        k0 j11;
        return Y0() && !this.F && (o11 = this.f13460t.o()) != null && (j11 = o11.j()) != null && this.Y >= j11.m() && j11.f13576g;
    }

    private void X() {
        k0 p11 = this.f13460t.p();
        if (p11 == null) {
            return;
        }
        int i11 = 0;
        if (p11.j() != null && !this.F) {
            if (L()) {
                if (p11.j().f13573d || this.Y >= p11.j().m()) {
                    xj.n o11 = p11.o();
                    k0 c11 = this.f13460t.c();
                    xj.n o12 = c11.o();
                    if (c11.f13573d && c11.f13570a.l() != -9223372036854775807L) {
                        F0();
                        return;
                    }
                    for (int i12 = 0; i12 < this.f13440a.length; i12++) {
                        boolean c12 = o11.c(i12);
                        boolean c13 = o12.c(i12);
                        if (c12 && !this.f13440a[i12].o()) {
                            boolean z11 = this.f13441b[i12].d() == 7;
                            ci.o oVar = o11.f57589b[i12];
                            ci.o oVar2 = o12.f57589b[i12];
                            if (!c13 || !oVar2.equals(oVar) || z11) {
                                this.f13440a[i12].h();
                            }
                        }
                    }
                }
            }
        } else if (p11.f13575f.f13593h || this.F) {
            while (true) {
                v0[] v0VarArr = this.f13440a;
                if (i11 >= v0VarArr.length) {
                    return;
                }
                v0 v0Var = v0VarArr[i11];
                fj.r rVar = p11.f13572c[i11];
                if (rVar != null && v0Var.f() == rVar && v0Var.g()) {
                    v0Var.h();
                }
                i11++;
            }
        }
    }

    private boolean X0() {
        long y11;
        if (M()) {
            k0 j11 = this.f13460t.j();
            long D = D(j11.k());
            if (j11 == this.f13460t.o()) {
                y11 = j11.y(this.Y);
            } else {
                y11 = j11.y(this.Y) - j11.f13575f.f13587b;
            }
            return this.f13445e.i(y11, D, this.f13455n.b().f9245a);
        }
        return false;
    }

    private void Y() {
        k0 p11 = this.f13460t.p();
        if (p11 == null || this.f13460t.o() == p11 || p11.f13576g || !l0()) {
            return;
        }
        s();
    }

    private boolean Y0() {
        r0 r0Var = this.A;
        return r0Var.f13770k && r0Var.f13771l == 0;
    }

    private void Z() {
        G(this.f13461w.i());
    }

    private boolean Z0(boolean z11) {
        if (this.R == 0) {
            return O();
        }
        if (z11) {
            r0 r0Var = this.A;
            if (r0Var.f13765f) {
                long c11 = a1(r0Var.f13760a, this.f13460t.o().f13575f.f13586a) ? this.f13462x.c() : -9223372036854775807L;
                k0 j11 = this.f13460t.j();
                return (j11.q() && j11.f13575f.f13593h) || (j11.f13575f.f13586a.b() && !j11.f13573d) || this.f13445e.d(C(), this.f13455n.b().f9245a, this.G, c11);
            }
            return true;
        }
        return false;
    }

    private void a0(c cVar) {
        this.B.b(1);
        G(this.f13461w.v(cVar.f13470a, cVar.f13471b, cVar.f13472c, cVar.f13473d));
    }

    private boolean a1(z0 z0Var, j.a aVar) {
        if (aVar.b() || z0Var.q()) {
            return false;
        }
        z0Var.n(z0Var.h(aVar.f26303a, this.f13452k).f14781c, this.f13451j);
        if (this.f13451j.f()) {
            z0.c cVar = this.f13451j;
            return cVar.f14795i && cVar.f14792f != -9223372036854775807L;
        }
        return false;
    }

    private void b0() {
        xj.g[] gVarArr;
        for (k0 o11 = this.f13460t.o(); o11 != null; o11 = o11.j()) {
            for (xj.g gVar : o11.o().f57590c) {
                if (gVar != null) {
                    gVar.h();
                }
            }
        }
    }

    private static boolean b1(r0 r0Var, z0.b bVar, z0.c cVar) {
        j.a aVar = r0Var.f13761b;
        z0 z0Var = r0Var.f13760a;
        return aVar.b() || z0Var.q() || z0Var.n(z0Var.h(aVar.f26303a, bVar).f14781c, cVar).f14798l;
    }

    private void c0(boolean z11) {
        xj.g[] gVarArr;
        for (k0 o11 = this.f13460t.o(); o11 != null; o11 = o11.j()) {
            for (xj.g gVar : o11.o().f57590c) {
                if (gVar != null) {
                    gVar.l(z11);
                }
            }
        }
    }

    private void c1() {
        v0[] v0VarArr;
        this.G = false;
        this.f13455n.g();
        for (v0 v0Var : this.f13440a) {
            if (N(v0Var)) {
                v0Var.start();
            }
        }
    }

    private void d0() {
        xj.g[] gVarArr;
        for (k0 o11 = this.f13460t.o(); o11 != null; o11 = o11.j()) {
            for (xj.g gVar : o11.o().f57590c) {
                if (gVar != null) {
                    gVar.r();
                }
            }
        }
    }

    private void e1(boolean z11, boolean z12) {
        n0(z11 || !this.O, false, true, false);
        this.B.b(z12 ? 1 : 0);
        this.f13445e.f();
        V0(1);
    }

    public static /* synthetic */ Boolean f(g0 g0Var) {
        return g0Var.P();
    }

    private void f1() {
        v0[] v0VarArr;
        this.f13455n.h();
        for (v0 v0Var : this.f13440a) {
            if (N(v0Var)) {
                u(v0Var);
            }
        }
    }

    public static /* synthetic */ void g(g0 g0Var, t0 t0Var) {
        g0Var.Q(t0Var);
    }

    private void g0() {
        this.B.b(1);
        n0(false, false, false, true);
        this.f13445e.a();
        V0(this.A.f13760a.q() ? 4 : 2);
        this.f13461w.w(this.f13446f.d());
        this.f13447g.h(2);
    }

    private void g1() {
        k0 j11 = this.f13460t.j();
        boolean z11 = this.H || (j11 != null && j11.f13570a.c());
        r0 r0Var = this.A;
        if (z11 != r0Var.f13765f) {
            this.A = r0Var.a(z11);
        }
    }

    private void h1(z0 z0Var, j.a aVar, z0 z0Var2, j.a aVar2, long j11) {
        if (z0Var.q() || !a1(z0Var, aVar)) {
            return;
        }
        z0Var.n(z0Var.h(aVar.f26303a, this.f13452k).f14781c, this.f13451j);
        this.f13462x.a((i0.f) ak.k0.j(this.f13451j.f14797k));
        if (j11 != -9223372036854775807L) {
            this.f13462x.e(y(z0Var, aVar.f26303a, j11));
            return;
        }
        if (ak.k0.c(z0Var2.q() ? null : z0Var2.n(z0Var2.h(aVar2.f26303a, this.f13452k).f14781c, this.f13451j).f14787a, this.f13451j.f14787a)) {
            return;
        }
        this.f13462x.e(-9223372036854775807L);
    }

    private void i0() {
        n0(true, false, true, false);
        this.f13445e.h();
        V0(1);
        this.f13449h.quit();
        synchronized (this) {
            this.C = true;
            notifyAll();
        }
    }

    private void i1(fj.v vVar, xj.n nVar) {
        this.f13445e.g(this.f13440a, vVar, nVar.f57590c);
    }

    private void j0(int i11, int i12, fj.s sVar) {
        this.B.b(1);
        G(this.f13461w.A(i11, i12, sVar));
    }

    private void j1() {
        if (this.A.f13760a.q() || !this.f13461w.s()) {
            return;
        }
        V();
        X();
        Y();
        W();
    }

    private void k(b bVar, int i11) {
        this.B.b(1);
        q0 q0Var = this.f13461w;
        if (i11 == -1) {
            i11 = q0Var.q();
        }
        G(q0Var.f(i11, bVar.f13466a, bVar.f13467b));
    }

    private void k1() {
        k0 o11 = this.f13460t.o();
        if (o11 == null) {
            return;
        }
        long l11 = o11.f13573d ? o11.f13570a.l() : -9223372036854775807L;
        if (l11 != -9223372036854775807L) {
            p0(l11);
            if (l11 != this.A.f13777r) {
                r0 r0Var = this.A;
                this.A = K(r0Var.f13761b, l11, r0Var.f13762c);
                this.B.e(4);
            }
        } else {
            long i11 = this.f13455n.i(o11 != this.f13460t.p());
            this.Y = i11;
            long y11 = o11.y(i11);
            U(this.A.f13777r, y11);
            this.A.f13777r = y11;
        }
        this.A.f13775p = this.f13460t.j().i();
        this.A.f13776q = C();
        r0 r0Var2 = this.A;
        if (r0Var2.f13770k && r0Var2.f13763d == 3 && a1(r0Var2.f13760a, r0Var2.f13761b) && this.A.f13772m.f9245a == 1.0f) {
            float b11 = this.f13462x.b(w(), C());
            if (this.f13455n.b().f9245a != b11) {
                this.f13455n.e(this.A.f13772m.b(b11));
                I(this.A.f13772m, this.f13455n.b().f9245a, false, false);
            }
        }
    }

    private void l(ExoPlaybackException exoPlaybackException) {
        ak.a.a(exoPlaybackException.f13028h && exoPlaybackException.f13021a == 1);
        try {
            y0(true);
        } catch (Exception e11) {
            exoPlaybackException.addSuppressed(e11);
            throw exoPlaybackException;
        }
    }

    private boolean l0() {
        k0 p11 = this.f13460t.p();
        xj.n o11 = p11.o();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            v0[] v0VarArr = this.f13440a;
            if (i11 >= v0VarArr.length) {
                return !z11;
            }
            v0 v0Var = v0VarArr[i11];
            if (N(v0Var)) {
                boolean z12 = v0Var.f() != p11.f13572c[i11];
                if (!o11.c(i11) || z12) {
                    if (!v0Var.o()) {
                        v0Var.j(x(o11.f57590c[i11]), p11.f13572c[i11], p11.m(), p11.l());
                    } else if (v0Var.c()) {
                        o(v0Var);
                    } else {
                        z11 = true;
                    }
                }
            }
            i11++;
        }
    }

    private void l1(float f11) {
        xj.g[] gVarArr;
        for (k0 o11 = this.f13460t.o(); o11 != null; o11 = o11.j()) {
            for (xj.g gVar : o11.o().f57590c) {
                if (gVar != null) {
                    gVar.f(f11);
                }
            }
        }
    }

    private void m(t0 t0Var) {
        if (t0Var.j()) {
            return;
        }
        try {
            t0Var.f().m(t0Var.h(), t0Var.d());
        } finally {
            t0Var.k(true);
        }
    }

    private void m0() {
        float f11 = this.f13455n.b().f9245a;
        k0 p11 = this.f13460t.p();
        boolean z11 = true;
        for (k0 o11 = this.f13460t.o(); o11 != null && o11.f13573d; o11 = o11.j()) {
            xj.n v11 = o11.v(f11, this.A.f13760a);
            int i11 = 0;
            if (!v11.a(o11.o())) {
                if (z11) {
                    k0 o12 = this.f13460t.o();
                    boolean y11 = this.f13460t.y(o12);
                    boolean[] zArr = new boolean[this.f13440a.length];
                    long b11 = o12.b(v11, this.A.f13777r, y11, zArr);
                    r0 r0Var = this.A;
                    r0 K = K(r0Var.f13761b, b11, r0Var.f13762c);
                    this.A = K;
                    if (K.f13763d != 4 && b11 != K.f13777r) {
                        this.B.e(4);
                        p0(b11);
                    }
                    boolean[] zArr2 = new boolean[this.f13440a.length];
                    while (true) {
                        v0[] v0VarArr = this.f13440a;
                        if (i11 >= v0VarArr.length) {
                            break;
                        }
                        v0 v0Var = v0VarArr[i11];
                        zArr2[i11] = N(v0Var);
                        fj.r rVar = o12.f13572c[i11];
                        if (zArr2[i11]) {
                            if (rVar != v0Var.f()) {
                                o(v0Var);
                            } else if (zArr[i11]) {
                                v0Var.x(this.Y);
                            }
                        }
                        i11++;
                    }
                    t(zArr2);
                } else {
                    this.f13460t.y(o11);
                    if (o11.f13573d) {
                        o11.a(v11, Math.max(o11.f13575f.f13587b, o11.y(this.Y)), false);
                    }
                }
                F(true);
                if (this.A.f13763d != 4) {
                    R();
                    k1();
                    this.f13447g.h(2);
                    return;
                }
                return;
            }
            if (o11 == p11) {
                z11 = false;
            }
        }
    }

    private synchronized void m1(com.google.common.base.a0<Boolean> a0Var, long j11) {
        long elapsedRealtime = this.f13457p.elapsedRealtime() + j11;
        boolean z11 = false;
        while (!a0Var.get().booleanValue() && j11 > 0) {
            try {
                wait(j11);
            } catch (InterruptedException unused) {
                z11 = true;
            }
            j11 = elapsedRealtime - this.f13457p.elapsedRealtime();
        }
        if (z11) {
            Thread.currentThread().interrupt();
        }
    }

    private void n0(boolean z11, boolean z12, boolean z13, boolean z14) {
        long j11;
        j.a aVar;
        long j12;
        long j13;
        boolean z15;
        this.f13447g.j(2);
        this.G = false;
        this.f13455n.h();
        this.Y = 0L;
        for (v0 v0Var : this.f13440a) {
            try {
                o(v0Var);
            } catch (ExoPlaybackException | RuntimeException e11) {
                ak.o.d("ExoPlayerImplInternal", "Disable failed.", e11);
            }
        }
        if (z11) {
            for (v0 v0Var2 : this.f13440a) {
                try {
                    v0Var2.reset();
                } catch (RuntimeException e12) {
                    ak.o.d("ExoPlayerImplInternal", "Reset failed.", e12);
                }
            }
        }
        this.R = 0;
        r0 r0Var = this.A;
        j.a aVar2 = r0Var.f13761b;
        long j14 = r0Var.f13777r;
        if (b1(this.A, this.f13452k, this.f13451j)) {
            j11 = this.A.f13762c;
        } else {
            j11 = this.A.f13777r;
        }
        if (z12) {
            this.T = null;
            Pair<j.a, Long> A = A(this.A.f13760a);
            j.a aVar3 = (j.a) A.first;
            long longValue = ((Long) A.second).longValue();
            z15 = !aVar3.equals(this.A.f13761b);
            aVar = aVar3;
            j12 = longValue;
            j13 = -9223372036854775807L;
        } else {
            aVar = aVar2;
            j12 = j14;
            j13 = j11;
            z15 = false;
        }
        this.f13460t.f();
        this.H = false;
        r0 r0Var2 = this.A;
        z0 z0Var = r0Var2.f13760a;
        int i11 = r0Var2.f13763d;
        ExoPlaybackException exoPlaybackException = z14 ? null : r0Var2.f13764e;
        fj.v vVar = z15 ? fj.v.f26353d : r0Var2.f13766g;
        xj.n nVar = z15 ? this.f13444d : r0Var2.f13767h;
        List r11 = z15 ? com.google.common.collect.r.r() : r0Var2.f13768i;
        r0 r0Var3 = this.A;
        this.A = new r0(z0Var, aVar, j13, i11, exoPlaybackException, false, vVar, nVar, r11, aVar, r0Var3.f13770k, r0Var3.f13771l, r0Var3.f13772m, j12, 0L, j12, this.Q, false);
        if (z13) {
            this.f13461w.y();
        }
        this.f13458p1 = null;
    }

    private void o(v0 v0Var) {
        if (N(v0Var)) {
            this.f13455n.a(v0Var);
            u(v0Var);
            v0Var.disable();
            this.R--;
        }
    }

    private void o0() {
        k0 o11 = this.f13460t.o();
        this.F = o11 != null && o11.f13575f.f13592g && this.E;
    }

    private void p0(long j11) {
        v0[] v0VarArr;
        k0 o11 = this.f13460t.o();
        if (o11 != null) {
            j11 = o11.z(j11);
        }
        this.Y = j11;
        this.f13455n.d(j11);
        for (v0 v0Var : this.f13440a) {
            if (N(v0Var)) {
                v0Var.x(this.Y);
            }
        }
        b0();
    }

    private void q() {
        boolean z11;
        boolean z12;
        int i11;
        boolean z13;
        long a11 = this.f13457p.a();
        j1();
        int i12 = this.A.f13763d;
        if (i12 != 1 && i12 != 4) {
            k0 o11 = this.f13460t.o();
            if (o11 == null) {
                w0(a11, 10L);
                return;
            }
            ak.h0.a("doSomeWork");
            k1();
            if (o11.f13573d) {
                long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
                o11.f13570a.u(this.A.f13777r - this.f13453l, this.f13454m);
                z11 = true;
                z12 = true;
                int i13 = 0;
                while (true) {
                    v0[] v0VarArr = this.f13440a;
                    if (i13 >= v0VarArr.length) {
                        break;
                    }
                    v0 v0Var = v0VarArr[i13];
                    if (N(v0Var)) {
                        v0Var.v(this.Y, elapsedRealtime);
                        z11 = z11 && v0Var.c();
                        boolean z14 = o11.f13572c[i13] != v0Var.f();
                        boolean z15 = z14 || (!z14 && v0Var.g()) || v0Var.isReady() || v0Var.c();
                        z12 = z12 && z15;
                        if (!z15) {
                            v0Var.n();
                        }
                    }
                    i13++;
                }
            } else {
                o11.f13570a.r();
                z11 = true;
                z12 = true;
            }
            long j11 = o11.f13575f.f13590e;
            boolean z16 = z11 && o11.f13573d && (j11 == -9223372036854775807L || j11 <= this.A.f13777r);
            if (z16 && this.F) {
                this.F = false;
                M0(false, this.A.f13771l, false, 5);
            }
            if (z16 && o11.f13575f.f13593h) {
                V0(4);
                f1();
            } else if (this.A.f13763d == 2 && Z0(z12)) {
                V0(3);
                this.f13458p1 = null;
                if (Y0()) {
                    c1();
                }
            } else if (this.A.f13763d == 3 && (this.R != 0 ? !z12 : !O())) {
                this.G = Y0();
                V0(2);
                if (this.G) {
                    d0();
                    this.f13462x.d();
                }
                f1();
            }
            if (this.A.f13763d == 2) {
                int i14 = 0;
                while (true) {
                    v0[] v0VarArr2 = this.f13440a;
                    if (i14 >= v0VarArr2.length) {
                        break;
                    }
                    if (N(v0VarArr2[i14]) && this.f13440a[i14].f() == o11.f13572c[i14]) {
                        this.f13440a[i14].n();
                    }
                    i14++;
                }
                r0 r0Var = this.A;
                if (!r0Var.f13765f && r0Var.f13776q < 500000 && M()) {
                    throw new IllegalStateException("Playback stuck buffering and not loading");
                }
            }
            boolean z17 = this.Q;
            r0 r0Var2 = this.A;
            if (z17 != r0Var2.f13773n) {
                this.A = r0Var2.d(z17);
            }
            if ((Y0() && this.A.f13763d == 3) || (i11 = this.A.f13763d) == 2) {
                z13 = !T(a11, 10L);
            } else {
                if (this.R != 0 && i11 != 4) {
                    w0(a11, 1000L);
                } else {
                    this.f13447g.j(2);
                }
                z13 = false;
            }
            r0 r0Var3 = this.A;
            if (r0Var3.f13774o != z13) {
                this.A = r0Var3.i(z13);
            }
            this.P = false;
            ak.h0.c();
            return;
        }
        this.f13447g.j(2);
    }

    private static void q0(z0 z0Var, d dVar, z0.c cVar, z0.b bVar) {
        int i11 = z0Var.n(z0Var.h(dVar.f13477d, bVar).f14781c, cVar).f14800n;
        Object obj = z0Var.g(i11, bVar, true).f14780b;
        long j11 = bVar.f14782d;
        dVar.b(i11, j11 != -9223372036854775807L ? j11 - 1 : Long.MAX_VALUE, obj);
    }

    private void r(int i11, boolean z11) {
        v0 v0Var = this.f13440a[i11];
        if (N(v0Var)) {
            return;
        }
        k0 p11 = this.f13460t.p();
        boolean z12 = p11 == this.f13460t.o();
        xj.n o11 = p11.o();
        ci.o oVar = o11.f57589b[i11];
        ci.i[] x11 = x(o11.f57590c[i11]);
        boolean z13 = Y0() && this.A.f13763d == 3;
        boolean z14 = !z11 && z13;
        this.R++;
        v0Var.p(oVar, x11, p11.f13572c[i11], this.Y, z14, z12, p11.m(), p11.l());
        v0Var.m(103, new a());
        this.f13455n.c(v0Var);
        if (z13) {
            v0Var.start();
        }
    }

    private static boolean r0(d dVar, z0 z0Var, z0 z0Var2, int i11, boolean z11, z0.c cVar, z0.b bVar) {
        Object obj = dVar.f13477d;
        if (obj == null) {
            Pair<Object, Long> u02 = u0(z0Var, new h(dVar.f13474a.g(), dVar.f13474a.i(), dVar.f13474a.e() == Long.MIN_VALUE ? -9223372036854775807L : ci.b.c(dVar.f13474a.e())), false, i11, z11, cVar, bVar);
            if (u02 == null) {
                return false;
            }
            dVar.b(z0Var.b(u02.first), ((Long) u02.second).longValue(), u02.first);
            if (dVar.f13474a.e() == Long.MIN_VALUE) {
                q0(z0Var, dVar, cVar, bVar);
            }
            return true;
        }
        int b11 = z0Var.b(obj);
        if (b11 == -1) {
            return false;
        }
        if (dVar.f13474a.e() == Long.MIN_VALUE) {
            q0(z0Var, dVar, cVar, bVar);
            return true;
        }
        dVar.f13475b = b11;
        z0Var2.h(dVar.f13477d, bVar);
        if (z0Var2.n(bVar.f14781c, cVar).f14798l) {
            Pair<Object, Long> j11 = z0Var.j(cVar, bVar, z0Var.h(dVar.f13477d, bVar).f14781c, dVar.f13476c + bVar.l());
            dVar.b(z0Var.b(j11.first), ((Long) j11.second).longValue(), j11.first);
        }
        return true;
    }

    private void s() {
        t(new boolean[this.f13440a.length]);
    }

    private void s0(z0 z0Var, z0 z0Var2) {
        if (z0Var.q() && z0Var2.q()) {
            return;
        }
        for (int size = this.f13456o.size() - 1; size >= 0; size--) {
            if (!r0(this.f13456o.get(size), z0Var, z0Var2, this.K, this.L, this.f13451j, this.f13452k)) {
                this.f13456o.get(size).f13474a.k(false);
                this.f13456o.remove(size);
            }
        }
        Collections.sort(this.f13456o);
    }

    private void t(boolean[] zArr) {
        k0 p11 = this.f13460t.p();
        xj.n o11 = p11.o();
        for (int i11 = 0; i11 < this.f13440a.length; i11++) {
            if (!o11.c(i11)) {
                this.f13440a[i11].reset();
            }
        }
        for (int i12 = 0; i12 < this.f13440a.length; i12++) {
            if (o11.c(i12)) {
                r(i12, zArr[i12]);
            }
        }
        p11.f13576g = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x016e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static com.google.android.exoplayer2.g0.g t0(com.google.android.exoplayer2.z0 r21, com.google.android.exoplayer2.r0 r22, com.google.android.exoplayer2.g0.h r23, com.google.android.exoplayer2.n0 r24, int r25, boolean r26, com.google.android.exoplayer2.z0.c r27, com.google.android.exoplayer2.z0.b r28) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g0.t0(com.google.android.exoplayer2.z0, com.google.android.exoplayer2.r0, com.google.android.exoplayer2.g0$h, com.google.android.exoplayer2.n0, int, boolean, com.google.android.exoplayer2.z0$c, com.google.android.exoplayer2.z0$b):com.google.android.exoplayer2.g0$g");
    }

    private void u(v0 v0Var) {
        if (v0Var.getState() == 2) {
            v0Var.stop();
        }
    }

    private static Pair<Object, Long> u0(z0 z0Var, h hVar, boolean z11, int i11, boolean z12, z0.c cVar, z0.b bVar) {
        Pair<Object, Long> j11;
        Object v02;
        z0 z0Var2 = hVar.f13491a;
        if (z0Var.q()) {
            return null;
        }
        z0 z0Var3 = z0Var2.q() ? z0Var : z0Var2;
        try {
            j11 = z0Var3.j(cVar, bVar, hVar.f13492b, hVar.f13493c);
        } catch (IndexOutOfBoundsException unused) {
        }
        if (z0Var.equals(z0Var3)) {
            return j11;
        }
        if (z0Var.b(j11.first) != -1) {
            z0Var3.h(j11.first, bVar);
            return z0Var3.n(bVar.f14781c, cVar).f14798l ? z0Var.j(cVar, bVar, z0Var.h(j11.first, bVar).f14781c, hVar.f13493c) : j11;
        }
        if (z11 && (v02 = v0(cVar, bVar, i11, z12, j11.first, z0Var3, z0Var)) != null) {
            return z0Var.j(cVar, bVar, z0Var.h(v02, bVar).f14781c, -9223372036854775807L);
        }
        return null;
    }

    private com.google.common.collect.r<wi.a> v(ExoTrackSelection[] exoTrackSelectionArr) {
        r.a aVar = new r.a();
        boolean z11 = false;
        for (ExoTrackSelection exoTrackSelection : exoTrackSelectionArr) {
            if (exoTrackSelection != null) {
                wi.a aVar2 = exoTrackSelection.d(0).f9203j;
                if (aVar2 == null) {
                    aVar.d(new wi.a(new a.b[0]));
                } else {
                    aVar.d(aVar2);
                    z11 = true;
                }
            }
        }
        return z11 ? aVar.e() : com.google.common.collect.r.r();
    }

    public static Object v0(z0.c cVar, z0.b bVar, int i11, boolean z11, Object obj, z0 z0Var, z0 z0Var2) {
        int b11 = z0Var.b(obj);
        int i12 = z0Var.i();
        int i13 = b11;
        int i14 = -1;
        for (int i15 = 0; i15 < i12 && i14 == -1; i15++) {
            i13 = z0Var.d(i13, bVar, cVar, i11, z11);
            if (i13 == -1) {
                break;
            }
            i14 = z0Var2.b(z0Var.m(i13));
        }
        if (i14 == -1) {
            return null;
        }
        return z0Var2.m(i14);
    }

    private long w() {
        r0 r0Var = this.A;
        return y(r0Var.f13760a, r0Var.f13761b.f26303a, r0Var.f13777r);
    }

    private void w0(long j11, long j12) {
        this.f13447g.j(2);
        this.f13447g.i(2, j11 + j12);
    }

    private static ci.i[] x(xj.g gVar) {
        int length = gVar != null ? gVar.length() : 0;
        ci.i[] iVarArr = new ci.i[length];
        for (int i11 = 0; i11 < length; i11++) {
            iVarArr[i11] = gVar.d(i11);
        }
        return iVarArr;
    }

    private long y(z0 z0Var, Object obj, long j11) {
        z0Var.n(z0Var.h(obj, this.f13452k).f14781c, this.f13451j);
        z0.c cVar = this.f13451j;
        if (cVar.f14792f != -9223372036854775807L && cVar.f()) {
            z0.c cVar2 = this.f13451j;
            if (cVar2.f14795i) {
                return ci.b.c(cVar2.a() - this.f13451j.f14792f) - (j11 + this.f13452k.l());
            }
        }
        return -9223372036854775807L;
    }

    private void y0(boolean z11) {
        j.a aVar = this.f13460t.o().f13575f.f13586a;
        long B0 = B0(aVar, this.A.f13777r, true, false);
        if (B0 != this.A.f13777r) {
            this.A = K(aVar, B0, this.A.f13762c);
            if (z11) {
                this.B.e(4);
            }
        }
    }

    private long z() {
        k0 p11 = this.f13460t.p();
        if (p11 == null) {
            return 0L;
        }
        long l11 = p11.l();
        if (!p11.f13573d) {
            return l11;
        }
        int i11 = 0;
        while (true) {
            v0[] v0VarArr = this.f13440a;
            if (i11 >= v0VarArr.length) {
                return l11;
            }
            if (N(v0VarArr[i11]) && this.f13440a[i11].f() == p11.f13572c[i11]) {
                long w11 = this.f13440a[i11].w();
                if (w11 == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                l11 = Math.max(w11, l11);
            }
            i11++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:158:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void z0(com.google.android.exoplayer2.g0.h r19) {
        /*
            Method dump skipped, instructions count: 359
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.g0.z0(com.google.android.exoplayer2.g0$h):void");
    }

    public Looper B() {
        return this.f13450i;
    }

    public void I0(List<q0.c> list, int i11, long j11, fj.s sVar) {
        this.f13447g.d(17, new b(list, sVar, i11, j11, null)).sendToTarget();
    }

    public void L0(boolean z11, int i11) {
        this.f13447g.f(1, z11 ? 1 : 0, i11).sendToTarget();
    }

    public void N0(ci.l lVar) {
        this.f13447g.d(4, lVar).sendToTarget();
    }

    public void P0(int i11) {
        this.f13447g.f(11, i11, 0).sendToTarget();
    }

    public void S0(boolean z11) {
        this.f13447g.f(12, z11 ? 1 : 0, 0).sendToTarget();
    }

    @Override // xj.m.a
    public void b() {
        this.f13447g.h(10);
    }

    @Override // com.google.android.exoplayer2.q0.d
    public void c() {
        this.f13447g.h(22);
    }

    @Override // com.google.android.exoplayer2.t0.a
    public synchronized void d(t0 t0Var) {
        if (!this.C && this.f13449h.isAlive()) {
            this.f13447g.d(14, t0Var).sendToTarget();
            return;
        }
        ak.o.h("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        t0Var.k(false);
    }

    public void d1() {
        this.f13447g.a(6).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.h.a
    public void e(ci.l lVar) {
        this.f13447g.d(16, lVar).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.u.a
    /* renamed from: e0 */
    public void j(com.google.android.exoplayer2.source.i iVar) {
        this.f13447g.d(9, iVar).sendToTarget();
    }

    public void f0() {
        this.f13447g.a(0).sendToTarget();
    }

    public synchronized boolean h0() {
        if (!this.C && this.f13449h.isAlive()) {
            this.f13447g.h(7);
            m1(new com.google.common.base.a0() { // from class: com.google.android.exoplayer2.e0
                {
                    g0.this = this;
                }

                @Override // com.google.common.base.a0
                public final Object get() {
                    return g0.f(g0.this);
                }
            }, this.f13463y);
            return this.C;
        }
        return true;
    }

    @Override // android.os.Handler.Callback
    public boolean handleMessage(Message message) {
        k0 p11;
        try {
            switch (message.what) {
                case 0:
                    g0();
                    break;
                case 1:
                    M0(message.arg1 != 0, message.arg2, true, 1);
                    break;
                case 2:
                    q();
                    break;
                case 3:
                    z0((h) message.obj);
                    break;
                case 4:
                    O0((ci.l) message.obj);
                    break;
                case 5:
                    R0((ci.q) message.obj);
                    break;
                case 6:
                    e1(false, true);
                    break;
                case 7:
                    i0();
                    return true;
                case 8:
                    H((com.google.android.exoplayer2.source.i) message.obj);
                    break;
                case 9:
                    E((com.google.android.exoplayer2.source.i) message.obj);
                    break;
                case 10:
                    m0();
                    break;
                case 11:
                    Q0(message.arg1);
                    break;
                case 12:
                    T0(message.arg1 != 0);
                    break;
                case 13:
                    G0(message.arg1 != 0, (AtomicBoolean) message.obj);
                    break;
                case 14:
                    C0((t0) message.obj);
                    break;
                case 15:
                    E0((t0) message.obj);
                    break;
                case 16:
                    J((ci.l) message.obj, false);
                    break;
                case 17:
                    H0((b) message.obj);
                    break;
                case 18:
                    k((b) message.obj, message.arg1);
                    break;
                case 19:
                    a0((c) message.obj);
                    break;
                case 20:
                    j0(message.arg1, message.arg2, (fj.s) message.obj);
                    break;
                case 21:
                    U0((fj.s) message.obj);
                    break;
                case 22:
                    Z();
                    break;
                case 23:
                    K0(message.arg1 != 0);
                    break;
                case 24:
                    J0(message.arg1 == 1);
                    break;
                case 25:
                    l((ExoPlaybackException) message.obj);
                    break;
                default:
                    return false;
            }
            S();
        } catch (ExoPlaybackException e11) {
            e = e11;
            if (e.f13021a == 1 && (p11 = this.f13460t.p()) != null) {
                e = e.a(p11.f13575f.f13586a);
            }
            if (e.f13028h && this.f13458p1 == null) {
                ak.o.i("ExoPlayerImplInternal", "Recoverable playback error", e);
                this.f13458p1 = e;
                Message d11 = this.f13447g.d(25, e);
                d11.getTarget().sendMessageAtFrontOfQueue(d11);
            } else {
                ExoPlaybackException exoPlaybackException = this.f13458p1;
                if (exoPlaybackException != null) {
                    e.addSuppressed(exoPlaybackException);
                    this.f13458p1 = null;
                }
                ak.o.d("ExoPlayerImplInternal", "Playback error", e);
                e1(true, false);
                this.A = this.A.f(e);
            }
            S();
        } catch (IOException e12) {
            ExoPlaybackException d12 = ExoPlaybackException.d(e12);
            k0 o11 = this.f13460t.o();
            if (o11 != null) {
                d12 = d12.a(o11.f13575f.f13586a);
            }
            ak.o.d("ExoPlayerImplInternal", "Playback error", d12);
            e1(false, false);
            this.A = this.A.f(d12);
            S();
        } catch (RuntimeException e13) {
            ExoPlaybackException e14 = ExoPlaybackException.e(e13);
            ak.o.d("ExoPlayerImplInternal", "Playback error", e14);
            e1(true, false);
            this.A = this.A.f(e14);
            S();
        }
        return true;
    }

    public void k0(int i11, int i12, fj.s sVar) {
        this.f13447g.c(20, i11, i12, sVar).sendToTarget();
    }

    @Override // com.google.android.exoplayer2.source.i.a
    public void p(com.google.android.exoplayer2.source.i iVar) {
        this.f13447g.d(8, iVar).sendToTarget();
    }

    public void x0(z0 z0Var, int i11, long j11) {
        this.f13447g.d(3, new h(z0Var, i11, j11)).sendToTarget();
    }
}