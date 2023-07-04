package com.google.android.exoplayer2;

import android.os.Handler;
import com.google.android.exoplayer2.drm.f;
import com.google.android.exoplayer2.source.j;
import com.google.android.exoplayer2.source.k;
import di.d1;
import fj.s;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class q0 {

    /* renamed from: d */
    private final d f13738d;

    /* renamed from: e */
    private final k.a f13739e;

    /* renamed from: f */
    private final f.a f13740f;

    /* renamed from: g */
    private final HashMap<c, b> f13741g;

    /* renamed from: h */
    private final Set<c> f13742h;

    /* renamed from: j */
    private boolean f13744j;

    /* renamed from: k */
    private zj.n f13745k;

    /* renamed from: i */
    private fj.s f13743i = new s.a(0);

    /* renamed from: b */
    private final IdentityHashMap<com.google.android.exoplayer2.source.i, c> f13736b = new IdentityHashMap<>();

    /* renamed from: c */
    private final Map<Object, c> f13737c = new HashMap();

    /* renamed from: a */
    private final List<c> f13735a = new ArrayList();

    /* loaded from: classes3.dex */
    public final class a implements com.google.android.exoplayer2.source.k, com.google.android.exoplayer2.drm.f {

        /* renamed from: a */
        private final c f13746a;

        /* renamed from: b */
        private k.a f13747b;

        /* renamed from: c */
        private f.a f13748c;

        public a(c cVar) {
            q0.this = r2;
            this.f13747b = r2.f13739e;
            this.f13748c = r2.f13740f;
            this.f13746a = cVar;
        }

        private boolean a(int i11, j.a aVar) {
            j.a aVar2;
            if (aVar != null) {
                aVar2 = q0.n(this.f13746a, aVar);
                if (aVar2 == null) {
                    return false;
                }
            } else {
                aVar2 = null;
            }
            int r11 = q0.r(this.f13746a, i11);
            k.a aVar3 = this.f13747b;
            if (aVar3.f14122a != r11 || !ak.k0.c(aVar3.f14123b, aVar2)) {
                this.f13747b = q0.this.f13739e.F(r11, aVar2, 0L);
            }
            f.a aVar4 = this.f13748c;
            if (aVar4.f13357a == r11 && ak.k0.c(aVar4.f13358b, aVar2)) {
                return true;
            }
            this.f13748c = q0.this.f13740f.t(r11, aVar2);
            return true;
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void F(int i11, j.a aVar, Exception exc) {
            if (a(i11, aVar)) {
                this.f13748c.l(exc);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void M(int i11, j.a aVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13747b.j(hVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void N(int i11, j.a aVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13747b.E(hVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void Q(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13747b.v(gVar, hVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void R(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13747b.s(gVar, hVar);
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void S(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13748c.h();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void U(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13748c.m();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void a0(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13748c.j();
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void b(int i11, j.a aVar, fj.g gVar, fj.h hVar) {
            if (a(i11, aVar)) {
                this.f13747b.B(gVar, hVar);
            }
        }

        @Override // com.google.android.exoplayer2.source.k
        public void r(int i11, j.a aVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
            if (a(i11, aVar)) {
                this.f13747b.y(gVar, hVar, iOException, z11);
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void v(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13748c.i();
            }
        }

        @Override // com.google.android.exoplayer2.drm.f
        public void w(int i11, j.a aVar) {
            if (a(i11, aVar)) {
                this.f13748c.k();
            }
        }
    }

    /* loaded from: classes3.dex */
    public static final class b {

        /* renamed from: a */
        public final com.google.android.exoplayer2.source.j f13750a;

        /* renamed from: b */
        public final j.b f13751b;

        /* renamed from: c */
        public final com.google.android.exoplayer2.source.k f13752c;

        public b(com.google.android.exoplayer2.source.j jVar, j.b bVar, com.google.android.exoplayer2.source.k kVar) {
            this.f13750a = jVar;
            this.f13751b = bVar;
            this.f13752c = kVar;
        }
    }

    /* loaded from: classes3.dex */
    public static final class c implements o0 {

        /* renamed from: a */
        public final com.google.android.exoplayer2.source.h f13753a;

        /* renamed from: d */
        public int f13756d;

        /* renamed from: e */
        public boolean f13757e;

        /* renamed from: c */
        public final List<j.a> f13755c = new ArrayList();

        /* renamed from: b */
        public final Object f13754b = new Object();

        public c(com.google.android.exoplayer2.source.j jVar, boolean z11) {
            this.f13753a = new com.google.android.exoplayer2.source.h(jVar, z11);
        }

        @Override // com.google.android.exoplayer2.o0
        public Object a() {
            return this.f13754b;
        }

        @Override // com.google.android.exoplayer2.o0
        public z0 b() {
            return this.f13753a.O();
        }

        public void c(int i11) {
            this.f13756d = i11;
            this.f13757e = false;
            this.f13755c.clear();
        }
    }

    /* loaded from: classes3.dex */
    public interface d {
        void c();
    }

    public q0(d dVar, d1 d1Var, Handler handler) {
        this.f13738d = dVar;
        k.a aVar = new k.a();
        this.f13739e = aVar;
        f.a aVar2 = new f.a();
        this.f13740f = aVar2;
        this.f13741g = new HashMap<>();
        this.f13742h = new HashSet();
        if (d1Var != null) {
            aVar.g(handler, d1Var);
            aVar2.g(handler, d1Var);
        }
    }

    private void B(int i11, int i12) {
        for (int i13 = i12 - 1; i13 >= i11; i13--) {
            c remove = this.f13735a.remove(i13);
            this.f13737c.remove(remove.f13754b);
            g(i13, -remove.f13753a.O().p());
            remove.f13757e = true;
            if (this.f13744j) {
                u(remove);
            }
        }
    }

    public static /* synthetic */ void a(q0 q0Var, com.google.android.exoplayer2.source.j jVar, z0 z0Var) {
        q0Var.t(jVar, z0Var);
    }

    private void g(int i11, int i12) {
        while (i11 < this.f13735a.size()) {
            this.f13735a.get(i11).f13756d += i12;
            i11++;
        }
    }

    private void j(c cVar) {
        b bVar = this.f13741g.get(cVar);
        if (bVar != null) {
            bVar.f13750a.l(bVar.f13751b);
        }
    }

    private void k() {
        Iterator<c> it2 = this.f13742h.iterator();
        while (it2.hasNext()) {
            c next = it2.next();
            if (next.f13755c.isEmpty()) {
                j(next);
                it2.remove();
            }
        }
    }

    private void l(c cVar) {
        this.f13742h.add(cVar);
        b bVar = this.f13741g.get(cVar);
        if (bVar != null) {
            bVar.f13750a.h(bVar.f13751b);
        }
    }

    private static Object m(Object obj) {
        return com.google.android.exoplayer2.a.v(obj);
    }

    public static j.a n(c cVar, j.a aVar) {
        for (int i11 = 0; i11 < cVar.f13755c.size(); i11++) {
            if (cVar.f13755c.get(i11).f26306d == aVar.f26306d) {
                return aVar.c(p(cVar, aVar.f26303a));
            }
        }
        return null;
    }

    private static Object o(Object obj) {
        return com.google.android.exoplayer2.a.w(obj);
    }

    private static Object p(c cVar, Object obj) {
        return com.google.android.exoplayer2.a.y(cVar.f13754b, obj);
    }

    public static int r(c cVar, int i11) {
        return i11 + cVar.f13756d;
    }

    public /* synthetic */ void t(com.google.android.exoplayer2.source.j jVar, z0 z0Var) {
        this.f13738d.c();
    }

    private void u(c cVar) {
        if (cVar.f13757e && cVar.f13755c.isEmpty()) {
            b bVar = (b) ak.a.e(this.f13741g.remove(cVar));
            bVar.f13750a.b(bVar.f13751b);
            bVar.f13750a.e(bVar.f13752c);
            this.f13742h.remove(cVar);
        }
    }

    private void x(c cVar) {
        com.google.android.exoplayer2.source.h hVar = cVar.f13753a;
        j.b bVar = new j.b() { // from class: com.google.android.exoplayer2.p0
            @Override // com.google.android.exoplayer2.source.j.b
            public final void a(com.google.android.exoplayer2.source.j jVar, z0 z0Var) {
                q0.a(q0.this, jVar, z0Var);
            }
        };
        a aVar = new a(cVar);
        this.f13741g.put(cVar, new b(hVar, bVar, aVar));
        hVar.d(ak.k0.z(), aVar);
        hVar.o(ak.k0.z(), aVar);
        hVar.a(bVar, this.f13745k);
    }

    public z0 A(int i11, int i12, fj.s sVar) {
        ak.a.a(i11 >= 0 && i11 <= i12 && i12 <= q());
        this.f13743i = sVar;
        B(i11, i12);
        return i();
    }

    public z0 C(List<c> list, fj.s sVar) {
        B(0, this.f13735a.size());
        return f(this.f13735a.size(), list, sVar);
    }

    public z0 D(fj.s sVar) {
        int q11 = q();
        if (sVar.getLength() != q11) {
            sVar = sVar.e().g(0, q11);
        }
        this.f13743i = sVar;
        return i();
    }

    public z0 f(int i11, List<c> list, fj.s sVar) {
        if (!list.isEmpty()) {
            this.f13743i = sVar;
            for (int i12 = i11; i12 < list.size() + i11; i12++) {
                c cVar = list.get(i12 - i11);
                if (i12 > 0) {
                    c cVar2 = this.f13735a.get(i12 - 1);
                    cVar.c(cVar2.f13756d + cVar2.f13753a.O().p());
                } else {
                    cVar.c(0);
                }
                g(i12, cVar.f13753a.O().p());
                this.f13735a.add(i12, cVar);
                this.f13737c.put(cVar.f13754b, cVar);
                if (this.f13744j) {
                    x(cVar);
                    if (this.f13736b.isEmpty()) {
                        this.f13742h.add(cVar);
                    } else {
                        j(cVar);
                    }
                }
            }
        }
        return i();
    }

    public com.google.android.exoplayer2.source.i h(j.a aVar, zj.b bVar, long j11) {
        Object o11 = o(aVar.f26303a);
        j.a c11 = aVar.c(m(aVar.f26303a));
        c cVar = (c) ak.a.e(this.f13737c.get(o11));
        l(cVar);
        cVar.f13755c.add(c11);
        com.google.android.exoplayer2.source.g k11 = cVar.f13753a.k(c11, bVar, j11);
        this.f13736b.put(k11, cVar);
        k();
        return k11;
    }

    public z0 i() {
        if (this.f13735a.isEmpty()) {
            return z0.f14778a;
        }
        int i11 = 0;
        for (int i12 = 0; i12 < this.f13735a.size(); i12++) {
            c cVar = this.f13735a.get(i12);
            cVar.f13756d = i11;
            i11 += cVar.f13753a.O().p();
        }
        return new u0(this.f13735a, this.f13743i);
    }

    public int q() {
        return this.f13735a.size();
    }

    public boolean s() {
        return this.f13744j;
    }

    public z0 v(int i11, int i12, int i13, fj.s sVar) {
        ak.a.a(i11 >= 0 && i11 <= i12 && i12 <= q() && i13 >= 0);
        this.f13743i = sVar;
        if (i11 != i12 && i11 != i13) {
            int min = Math.min(i11, i13);
            int max = Math.max(((i12 - i11) + i13) - 1, i12 - 1);
            int i14 = this.f13735a.get(min).f13756d;
            ak.k0.w0(this.f13735a, i11, i12, i13);
            while (min <= max) {
                c cVar = this.f13735a.get(min);
                cVar.f13756d = i14;
                i14 += cVar.f13753a.O().p();
                min++;
            }
            return i();
        }
        return i();
    }

    public void w(zj.n nVar) {
        ak.a.f(!this.f13744j);
        this.f13745k = nVar;
        for (int i11 = 0; i11 < this.f13735a.size(); i11++) {
            c cVar = this.f13735a.get(i11);
            x(cVar);
            this.f13742h.add(cVar);
        }
        this.f13744j = true;
    }

    public void y() {
        for (b bVar : this.f13741g.values()) {
            try {
                bVar.f13750a.b(bVar.f13751b);
            } catch (RuntimeException e11) {
                ak.o.d("MediaSourceList", "Failed to release child source.", e11);
            }
            bVar.f13750a.e(bVar.f13752c);
        }
        this.f13741g.clear();
        this.f13742h.clear();
        this.f13744j = false;
    }

    public void z(com.google.android.exoplayer2.source.i iVar) {
        c cVar = (c) ak.a.e(this.f13736b.remove(iVar));
        cVar.f13753a.g(iVar);
        cVar.f13755c.remove(((com.google.android.exoplayer2.source.g) iVar).f13947a);
        if (!this.f13736b.isEmpty()) {
            k();
        }
        u(cVar);
    }
}