package di;

import android.util.SparseArray;
import android.view.Surface;
import com.google.android.exoplayer2.ExoPlaybackException;
import com.google.android.exoplayer2.source.j;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public interface e1 {

    /* loaded from: classes3.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f24042a;

        /* renamed from: b  reason: collision with root package name */
        public final com.google.android.exoplayer2.z0 f24043b;

        /* renamed from: c  reason: collision with root package name */
        public final int f24044c;

        /* renamed from: d  reason: collision with root package name */
        public final j.a f24045d;

        /* renamed from: e  reason: collision with root package name */
        public final long f24046e;

        /* renamed from: f  reason: collision with root package name */
        public final com.google.android.exoplayer2.z0 f24047f;

        /* renamed from: g  reason: collision with root package name */
        public final int f24048g;

        /* renamed from: h  reason: collision with root package name */
        public final j.a f24049h;

        /* renamed from: i  reason: collision with root package name */
        public final long f24050i;

        /* renamed from: j  reason: collision with root package name */
        public final long f24051j;

        public a(long j11, com.google.android.exoplayer2.z0 z0Var, int i11, j.a aVar, long j12, com.google.android.exoplayer2.z0 z0Var2, int i12, j.a aVar2, long j13, long j14) {
            this.f24042a = j11;
            this.f24043b = z0Var;
            this.f24044c = i11;
            this.f24045d = aVar;
            this.f24046e = j12;
            this.f24047f = z0Var2;
            this.f24048g = i12;
            this.f24049h = aVar2;
            this.f24050i = j13;
            this.f24051j = j14;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return this.f24042a == aVar.f24042a && this.f24044c == aVar.f24044c && this.f24046e == aVar.f24046e && this.f24048g == aVar.f24048g && this.f24050i == aVar.f24050i && this.f24051j == aVar.f24051j && com.google.common.base.q.a(this.f24043b, aVar.f24043b) && com.google.common.base.q.a(this.f24045d, aVar.f24045d) && com.google.common.base.q.a(this.f24047f, aVar.f24047f) && com.google.common.base.q.a(this.f24049h, aVar.f24049h);
        }

        public int hashCode() {
            return com.google.common.base.q.b(Long.valueOf(this.f24042a), this.f24043b, Integer.valueOf(this.f24044c), this.f24045d, Long.valueOf(this.f24046e), this.f24047f, Integer.valueOf(this.f24048g), this.f24049h, Long.valueOf(this.f24050i), Long.valueOf(this.f24051j));
        }
    }

    /* loaded from: classes3.dex */
    public static final class b extends ak.s {

        /* renamed from: b  reason: collision with root package name */
        private final SparseArray<a> f24052b = new SparseArray<>(0);

        @Override // ak.s
        public boolean b(int i11) {
            return super.b(i11);
        }

        @Override // ak.s
        public int d(int i11) {
            return super.d(i11);
        }

        public void f(SparseArray<a> sparseArray) {
            this.f24052b.clear();
            for (int i11 = 0; i11 < e(); i11++) {
                int d11 = d(i11);
                this.f24052b.append(d11, (a) ak.a.e(sparseArray.get(d11)));
            }
        }
    }

    default void A(a aVar, fi.d dVar) {
    }

    default void B(a aVar) {
    }

    default void C(a aVar, ci.i iVar, fi.e eVar) {
        k(aVar, iVar);
    }

    default void D(a aVar, int i11, long j11, long j12) {
    }

    default void E(a aVar, int i11) {
    }

    default void F(a aVar, int i11, int i12) {
    }

    default void G(a aVar) {
    }

    default void H(a aVar, fj.g gVar, fj.h hVar) {
    }

    default void I(a aVar, fi.d dVar) {
    }

    default void J(a aVar, int i11) {
    }

    default void K(a aVar) {
    }

    default void L(a aVar, fj.g gVar, fj.h hVar) {
    }

    @Deprecated
    default void M(a aVar, int i11, String str, long j11) {
    }

    default void N(com.google.android.exoplayer2.s0 s0Var, b bVar) {
    }

    default void O(a aVar, String str) {
    }

    default void P(a aVar, ci.i iVar, fi.e eVar) {
        Z(aVar, iVar);
    }

    default void Q(a aVar) {
    }

    default void R(a aVar, boolean z11) {
    }

    default void S(a aVar, int i11) {
    }

    default void T(a aVar, fi.d dVar) {
    }

    default void U(a aVar, float f11) {
    }

    @Deprecated
    default void V(a aVar, int i11, fi.d dVar) {
    }

    default void W(a aVar, fj.h hVar) {
    }

    default void X(a aVar, int i11) {
    }

    default void Y(a aVar, long j11, int i11) {
    }

    @Deprecated
    default void Z(a aVar, ci.i iVar) {
    }

    default void a(a aVar, long j11) {
    }

    default void a0(a aVar, boolean z11) {
    }

    default void b(a aVar, ci.l lVar) {
    }

    default void b0(a aVar, com.google.android.exoplayer2.i0 i0Var, int i11) {
    }

    default void c(a aVar, int i11, long j11) {
    }

    default void c0(a aVar, int i11, long j11, long j12) {
    }

    default void d(a aVar) {
    }

    default void d0(a aVar, boolean z11, int i11) {
    }

    default void e(a aVar, fj.v vVar, xj.k kVar) {
    }

    default void e0(a aVar, ExoPlaybackException exoPlaybackException) {
    }

    default void f(a aVar, boolean z11) {
    }

    @Deprecated
    default void f0(a aVar, boolean z11, int i11) {
    }

    default void g(a aVar, Exception exc) {
    }

    default void g0(a aVar) {
    }

    @Deprecated
    default void h(a aVar, int i11, ci.i iVar) {
    }

    default void h0(a aVar, String str, long j11) {
    }

    default void i(a aVar, Exception exc) {
    }

    default void j(a aVar, wi.a aVar2) {
    }

    @Deprecated
    default void k(a aVar, ci.i iVar) {
    }

    default void l(a aVar, List<wi.a> list) {
    }

    @Deprecated
    default void m(a aVar, boolean z11) {
    }

    default void n(a aVar, boolean z11) {
        m(aVar, z11);
    }

    default void o(a aVar, fj.h hVar) {
    }

    default void p(a aVar, int i11, int i12, int i13, float f11) {
    }

    default void q(a aVar, String str) {
    }

    @Deprecated
    default void r(a aVar) {
    }

    default void s(a aVar, int i11) {
    }

    default void t(a aVar, fi.d dVar) {
    }

    default void u(a aVar, Surface surface) {
    }

    default void v(a aVar, fj.g gVar, fj.h hVar) {
    }

    default void w(a aVar, fj.g gVar, fj.h hVar, IOException iOException, boolean z11) {
    }

    default void x(a aVar, String str, long j11) {
    }

    @Deprecated
    default void y(a aVar, int i11, fi.d dVar) {
    }

    default void z(a aVar) {
    }
}