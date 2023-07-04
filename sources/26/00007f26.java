package kotlin.reflect.jvm.internal.impl.types.checker;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import k20.c0;
import k20.d0;
import k20.e0;
import k20.e1;
import k20.f0;
import k20.f1;
import k20.j1;
import k20.k0;
import k20.k1;
import k20.w0;
import k20.y0;
import kotlin.jvm.internal.m0;
import m20.q;
import t00.k;
import w00.r0;
import w00.s0;

/* loaded from: classes5.dex */
public interface c extends e1, m20.q {

    /* loaded from: classes5.dex */
    public static final class a {
        public static m20.t A(c cVar, m20.n receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof s0) {
                k1 k11 = ((s0) receiver).k();
                kotlin.jvm.internal.s.f(k11, "this.variance");
                return m20.p.a(k11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean B(c cVar, m20.i receiver, u10.c fqName) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(fqName, "fqName");
            if (receiver instanceof d0) {
                return ((d0) receiver).getAnnotations().b1(fqName);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean C(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.d(cVar, receiver);
        }

        public static boolean D(c cVar, m20.n receiver, m20.m mVar) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof s0) {
                if (mVar == null ? true : mVar instanceof w0) {
                    return n20.a.l((s0) receiver, (w0) mVar, null, 4, null);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean E(c cVar, m20.j a11, m20.j b11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(a11, "a");
            kotlin.jvm.internal.s.g(b11, "b");
            if (a11 instanceof k0) {
                if (b11 instanceof k0) {
                    return ((k0) a11).G0() == ((k0) b11).G0();
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + b11 + ", " + m0.b(b11.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + a11 + ", " + m0.b(a11.getClass())).toString());
        }

        public static m20.i F(c cVar, List<? extends m20.i> types) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(types, "types");
            return e.a(types);
        }

        public static boolean G(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return t00.h.u0((w0) receiver, k.a.f51324b);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean H(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.e(cVar, receiver);
        }

        public static boolean I(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.f(cVar, receiver);
        }

        public static boolean J(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return ((w0) receiver).n() instanceof w00.c;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean K(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                w00.c cVar2 = n11 instanceof w00.c ? (w00.c) n11 : null;
                return (cVar2 == null || !w00.v.a(cVar2) || cVar2.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.ENUM_ENTRY || cVar2.getKind() == kotlin.reflect.jvm.internal.impl.descriptors.c.ANNOTATION_CLASS) ? false : true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean L(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.g(cVar, receiver);
        }

        public static boolean M(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return ((w0) receiver).o();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean N(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.h(cVar, receiver);
        }

        public static boolean O(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return f0.a((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean P(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                w00.c cVar2 = n11 instanceof w00.c ? (w00.c) n11 : null;
                return cVar2 != null && w10.f.b(cVar2);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean Q(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.i(cVar, receiver);
        }

        public static boolean R(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return receiver instanceof y10.n;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean S(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return receiver instanceof c0;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean T(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.j(cVar, receiver);
        }

        public static boolean U(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                return ((k0) receiver).I0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean V(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.k(cVar, receiver);
        }

        public static boolean W(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return t00.h.u0((w0) receiver, k.a.f51326c);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean X(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return f1.m((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean Y(c cVar, m20.d receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return receiver instanceof x10.a;
        }

        public static boolean Z(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return t00.h.q0((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean a(c cVar, m20.m c12, m20.m c22) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(c12, "c1");
            kotlin.jvm.internal.s.g(c22, "c2");
            if (c12 instanceof w0) {
                if (c22 instanceof w0) {
                    return kotlin.jvm.internal.s.c(c12, c22);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c22 + ", " + m0.b(c22.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + c12 + ", " + m0.b(c12.getClass())).toString());
        }

        public static boolean a0(c cVar, m20.d receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return ((j) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static int b(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return ((d0) receiver).G0().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean b0(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                if (!f0.a((d0) receiver)) {
                    k0 k0Var = (k0) receiver;
                    if (!(k0Var.H0().n() instanceof r0) && (k0Var.H0().n() != null || (receiver instanceof x10.a) || (receiver instanceof j) || (receiver instanceof k20.m) || (k0Var.H0() instanceof y10.n) || c0(cVar, receiver))) {
                        return true;
                    }
                }
                return false;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.k c(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                return (m20.k) receiver;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        private static boolean c0(c cVar, m20.j jVar) {
            return (jVar instanceof k20.m0) && cVar.e(((k20.m0) jVar).getOrigin());
        }

        public static m20.d d(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                if (receiver instanceof k20.m0) {
                    return cVar.f(((k20.m0) receiver).getOrigin());
                }
                if (receiver instanceof j) {
                    return (j) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean d0(c cVar, m20.l receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.e e(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                if (receiver instanceof k20.m) {
                    return (k20.m) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean e0(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                if (!(receiver instanceof k20.e)) {
                    if (!((receiver instanceof k20.m) && (((k20.m) receiver).T0() instanceof k20.e))) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.f f(c cVar, m20.g receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k20.x) {
                if (receiver instanceof k20.s) {
                    return (k20.s) receiver;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean f0(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                if (!(receiver instanceof k20.r0)) {
                    if (!((receiver instanceof k20.m) && (((k20.m) receiver).T0() instanceof k20.r0))) {
                        return false;
                    }
                }
                return true;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.g g(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                j1 K0 = ((d0) receiver).K0();
                if (K0 instanceof k20.x) {
                    return (k20.x) K0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static boolean g0(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                return n11 != null && t00.h.z0(n11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j h(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                j1 K0 = ((d0) receiver).K0();
                if (K0 instanceof k0) {
                    return (k0) K0;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j h0(c cVar, m20.g receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k20.x) {
                return ((k20.x) receiver).P0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.l i(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return n20.a.a((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j i0(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.l(cVar, receiver);
        }

        public static m20.j j(c cVar, m20.j type, m20.b status) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(type, "type");
            kotlin.jvm.internal.s.g(status, "status");
            if (type instanceof k0) {
                return l.b((k0) type, status);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + type + ", " + m0.b(type.getClass())).toString());
        }

        public static m20.i j0(c cVar, m20.d receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return ((j) receiver).S0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.b k(c cVar, m20.d receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return ((j) receiver).Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.i k0(c cVar, m20.i receiver) {
            j1 b11;
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j1) {
                b11 = d.b((j1) receiver);
                return b11;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.i l(c cVar, m20.j lowerBound, m20.j upperBound) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(lowerBound, "lowerBound");
            kotlin.jvm.internal.s.g(upperBound, "upperBound");
            if (lowerBound instanceof k0) {
                if (upperBound instanceof k0) {
                    return e0.d((k0) lowerBound, (k0) upperBound);
                }
                throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + m0.b(cVar.getClass())).toString());
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + cVar + ", " + m0.b(cVar.getClass())).toString());
        }

        public static m20.i l0(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return e1.a.a(cVar, receiver);
        }

        public static List<m20.j> m(c cVar, m20.j receiver, m20.m constructor) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            kotlin.jvm.internal.s.g(constructor, "constructor");
            return q.a.a(cVar, receiver, constructor);
        }

        public static k20.g m0(c cVar, boolean z11, boolean z12) {
            kotlin.jvm.internal.s.g(cVar, "this");
            return new kotlin.reflect.jvm.internal.impl.types.checker.a(z11, z12, false, null, null, cVar, 28, null);
        }

        public static m20.l n(c cVar, m20.k receiver, int i11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.b(cVar, receiver, i11);
        }

        public static m20.j n0(c cVar, m20.e receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k20.m) {
                return ((k20.m) receiver).T0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.l o(c cVar, m20.i receiver, int i11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return ((d0) receiver).G0().get(i11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static int o0(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                return ((w0) receiver).getParameters().size();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.l p(c cVar, m20.j receiver, int i11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.c(cVar, receiver, i11);
        }

        public static Collection<m20.i> p0(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            m20.m d11 = cVar.d(receiver);
            if (d11 instanceof y10.n) {
                return ((y10.n) d11).f();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static u10.d q(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                Objects.requireNonNull(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return a20.a.j((w00.c) n11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.l q0(c cVar, m20.c receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k) {
                return ((k) receiver).getProjection();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.n r(c cVar, m20.m receiver, int i11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                s0 s0Var = ((w0) receiver).getParameters().get(i11);
                kotlin.jvm.internal.s.f(s0Var, "this.parameters[index]");
                return s0Var;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static int r0(c cVar, m20.k receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.m(cVar, receiver);
        }

        public static t00.i s(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                Objects.requireNonNull(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return t00.h.P((w00.c) n11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static Collection<m20.i> s0(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                Collection<d0> a11 = ((w0) receiver).a();
                kotlin.jvm.internal.s.f(a11, "this.supertypes");
                return a11;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static t00.i t(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                Objects.requireNonNull(n11, "null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor");
                return t00.h.S((w00.c) n11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.c t0(c cVar, m20.d receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof j) {
                return ((j) receiver).H0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.i u(c cVar, m20.n receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof s0) {
                return n20.a.i((s0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.m u0(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.n(cVar, receiver);
        }

        public static m20.i v(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof d0) {
                return w10.f.e((d0) receiver);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.m v0(c cVar, m20.j receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                return ((k0) receiver).H0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.i w(c cVar, m20.l receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof y0) {
                return ((y0) receiver).getType().K0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j w0(c cVar, m20.g receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k20.x) {
                return ((k20.x) receiver).Q0();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.n x(c cVar, m20.s receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof o) {
                return ((o) receiver).a();
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j x0(c cVar, m20.i receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            return q.a.o(cVar, receiver);
        }

        public static m20.n y(c cVar, m20.m receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof w0) {
                w00.e n11 = ((w0) receiver).n();
                if (n11 instanceof s0) {
                    return (s0) n11;
                }
                return null;
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.i y0(c cVar, m20.i receiver, boolean z11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof m20.j) {
                return cVar.g((m20.j) receiver, z11);
            }
            if (receiver instanceof m20.g) {
                m20.g gVar = (m20.g) receiver;
                return cVar.k0(cVar.g(cVar.c(gVar), z11), cVar.g(cVar.b(gVar), z11));
            }
            throw new IllegalStateException("sealed".toString());
        }

        public static m20.t z(c cVar, m20.l receiver) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof y0) {
                k1 b11 = ((y0) receiver).b();
                kotlin.jvm.internal.s.f(b11, "this.projectionKind");
                return m20.p.a(b11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }

        public static m20.j z0(c cVar, m20.j receiver, boolean z11) {
            kotlin.jvm.internal.s.g(cVar, "this");
            kotlin.jvm.internal.s.g(receiver, "receiver");
            if (receiver instanceof k0) {
                return ((k0) receiver).O0(z11);
            }
            throw new IllegalArgumentException(("ClassicTypeSystemContext couldn't handle: " + receiver + ", " + m0.b(receiver.getClass())).toString());
        }
    }

    @Override // m20.o
    m20.j a(m20.i iVar);

    @Override // m20.o
    m20.j b(m20.g gVar);

    @Override // m20.o
    m20.j c(m20.g gVar);

    @Override // m20.o
    m20.m d(m20.j jVar);

    @Override // m20.o
    boolean e(m20.j jVar);

    @Override // m20.o
    m20.d f(m20.j jVar);

    @Override // m20.o
    m20.j g(m20.j jVar, boolean z11);

    m20.i k0(m20.j jVar, m20.j jVar2);
}