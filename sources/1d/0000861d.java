package m20;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.m0;

/* loaded from: classes5.dex */
public interface o extends r {

    /* loaded from: classes5.dex */
    public static final class a {
        public static List<j> a(o oVar, j receiver, m constructor) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(constructor, "constructor");
            return null;
        }

        public static l b(o oVar, k receiver, int i11) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return oVar.J((i) receiver, i11);
            }
            if (receiver instanceof m20.a) {
                l lVar = ((m20.a) receiver).get(i11);
                kotlin.jvm.internal.s.f(lVar, "get(index)");
                return lVar;
            }
            throw new IllegalStateException(("unknown type argument list type: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static l c(o oVar, j receiver, int i11) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            boolean z11 = false;
            if (i11 >= 0 && i11 < oVar.Y(receiver)) {
                z11 = true;
            }
            if (z11) {
                return oVar.J(receiver, i11);
            }
            return null;
        }

        public static boolean d(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return oVar.i0(oVar.U(receiver)) != oVar.i0(oVar.Q(receiver));
        }

        public static boolean e(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            j a11 = oVar.a(receiver);
            return (a11 == null ? null : oVar.f(a11)) != null;
        }

        public static boolean f(o oVar, j receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return oVar.s(oVar.d(receiver));
        }

        public static boolean g(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            j a11 = oVar.a(receiver);
            return (a11 == null ? null : oVar.T(a11)) != null;
        }

        public static boolean h(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            g l02 = oVar.l0(receiver);
            return (l02 == null ? null : oVar.c0(l02)) != null;
        }

        public static boolean i(o oVar, j receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return oVar.p0(oVar.d(receiver));
        }

        public static boolean j(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return (receiver instanceof j) && oVar.i0((j) receiver);
        }

        public static boolean k(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return oVar.E(oVar.j(receiver)) && !oVar.C(receiver);
        }

        public static j l(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            g l02 = oVar.l0(receiver);
            if (l02 == null) {
                j a11 = oVar.a(receiver);
                kotlin.jvm.internal.s.e(a11);
                return a11;
            }
            return oVar.c(l02);
        }

        public static int m(o oVar, k receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return oVar.Y((i) receiver);
            }
            if (receiver instanceof m20.a) {
                return ((m20.a) receiver).size();
            }
            throw new IllegalStateException(("unknown type argument list type: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m n(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            j a11 = oVar.a(receiver);
            if (a11 == null) {
                a11 = oVar.U(receiver);
            }
            return oVar.d(a11);
        }

        public static j o(o oVar, i receiver) {
            kotlin.jvm.internal.s.g(oVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            g l02 = oVar.l0(receiver);
            if (l02 == null) {
                j a11 = oVar.a(receiver);
                kotlin.jvm.internal.s.e(a11);
                return a11;
            }
            return oVar.b(l02);
        }
    }

    boolean A(i iVar);

    int B(m mVar);

    boolean C(i iVar);

    List<j> D(j jVar, m mVar);

    boolean E(m mVar);

    boolean F(m mVar);

    boolean G(i iVar);

    l H(j jVar, int i11);

    n I(s sVar);

    l J(i iVar, int i11);

    int K(k kVar);

    boolean L(m mVar);

    boolean M(j jVar);

    boolean N(j jVar);

    boolean O(j jVar);

    Collection<i> P(m mVar);

    j Q(i iVar);

    l S(k kVar, int i11);

    e T(j jVar);

    j U(i iVar);

    boolean V(j jVar);

    boolean W(i iVar);

    int Y(i iVar);

    i Z(i iVar, boolean z11);

    j a(i iVar);

    boolean a0(i iVar);

    j b(g gVar);

    i b0(l lVar);

    j c(g gVar);

    f c0(g gVar);

    m d(j jVar);

    boolean d0(d dVar);

    boolean e(j jVar);

    boolean e0(m mVar);

    d f(j jVar);

    boolean f0(m mVar);

    j g(j jVar, boolean z11);

    k g0(j jVar);

    t h(n nVar);

    i h0(List<? extends i> list);

    boolean i0(j jVar);

    m j(i iVar);

    boolean k(i iVar);

    boolean l(d dVar);

    g l0(i iVar);

    boolean m(i iVar);

    c m0(d dVar);

    l n(c cVar);

    b n0(d dVar);

    boolean o(n nVar, m mVar);

    boolean p(l lVar);

    boolean p0(m mVar);

    j q(e eVar);

    Collection<i> q0(j jVar);

    t r(l lVar);

    i r0(i iVar);

    boolean s(m mVar);

    boolean t(i iVar);

    n t0(m mVar);

    boolean u(m mVar, m mVar2);

    boolean v(j jVar);

    n v0(m mVar, int i11);

    j w(j jVar, b bVar);

    i x0(d dVar);

    l z(i iVar);
}