package e10;

import java.util.Iterator;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.e;
import w00.l0;
import w00.s0;
import w00.v0;
import w10.e;
import w10.j;

/* loaded from: classes5.dex */
public final class l implements w10.e {

    /* loaded from: classes5.dex */
    public /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        public static final /* synthetic */ int[] f24470a;

        static {
            int[] iArr = new int[j.i.a.values().length];
            iArr[j.i.a.OVERRIDABLE.ordinal()] = 1;
            f24470a = iArr;
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<v0, k20.d0> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f24471a = new b();

        b() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final k20.d0 mo12invoke(v0 v0Var) {
            return v0Var.getType();
        }
    }

    @Override // w10.e
    public e.b a(kotlin.reflect.jvm.internal.impl.descriptors.a superDescriptor, kotlin.reflect.jvm.internal.impl.descriptors.a subDescriptor, w00.c cVar) {
        List<s0> typeParameters;
        u20.h S;
        u20.h B;
        u20.h F;
        List m11;
        u20.h E;
        boolean z11;
        kotlin.reflect.jvm.internal.impl.descriptors.a mo156c;
        List<s0> typeParameters2;
        List<s0> i11;
        boolean z12;
        kotlin.jvm.internal.s.g(superDescriptor, "superDescriptor");
        kotlin.jvm.internal.s.g(subDescriptor, "subDescriptor");
        if (subDescriptor instanceof g10.e) {
            g10.e eVar = (g10.e) subDescriptor;
            kotlin.jvm.internal.s.f(eVar.getTypeParameters(), "subDescriptor.typeParameters");
            if (!(!typeParameters.isEmpty())) {
                j.i x11 = w10.j.x(superDescriptor, subDescriptor);
                if ((x11 == null ? null : x11.c()) != null) {
                    return e.b.UNKNOWN;
                }
                List<v0> h11 = eVar.h();
                kotlin.jvm.internal.s.f(h11, "subDescriptor.valueParameters");
                S = wz.e0.S(h11);
                B = u20.p.B(S, b.f24471a);
                k20.d0 returnType = eVar.getReturnType();
                kotlin.jvm.internal.s.e(returnType);
                F = u20.p.F(B, returnType);
                l0 N = eVar.N();
                m11 = wz.w.m(N == null ? null : N.getType());
                E = u20.p.E(F, m11);
                Iterator it2 = E.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        z11 = false;
                        break;
                    }
                    k20.d0 d0Var = (k20.d0) it2.next();
                    if (!(!d0Var.G0().isEmpty()) || (d0Var.K0() instanceof j10.f)) {
                        z12 = false;
                        continue;
                    } else {
                        z12 = true;
                        continue;
                    }
                    if (z12) {
                        z11 = true;
                        break;
                    }
                }
                if (!z11 && (mo156c = superDescriptor.mo156c(new j10.e(null, 1, null).c())) != null) {
                    if (mo156c instanceof kotlin.reflect.jvm.internal.impl.descriptors.h) {
                        kotlin.reflect.jvm.internal.impl.descriptors.h hVar = (kotlin.reflect.jvm.internal.impl.descriptors.h) mo156c;
                        kotlin.jvm.internal.s.f(hVar.getTypeParameters(), "erasedSuper.typeParameters");
                        if (!typeParameters2.isEmpty()) {
                            e.a<? extends kotlin.reflect.jvm.internal.impl.descriptors.h> s11 = hVar.s();
                            i11 = wz.w.i();
                            mo156c = s11.mo252m(i11).build();
                            kotlin.jvm.internal.s.e(mo156c);
                        }
                    }
                    j.i.a c11 = w10.j.f55379d.G(mo156c, subDescriptor, false).c();
                    kotlin.jvm.internal.s.f(c11, "DEFAULT.isOverridableByW…Descriptor, false).result");
                    if (a.f24470a[c11.ordinal()] == 1) {
                        return e.b.OVERRIDABLE;
                    }
                    return e.b.UNKNOWN;
                }
                return e.b.UNKNOWN;
            }
        }
        return e.b.UNKNOWN;
    }

    @Override // w10.e
    public e.a b() {
        return e.a.SUCCESS_ONLY;
    }
}