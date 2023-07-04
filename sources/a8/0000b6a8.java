package u00;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import k20.d0;
import k20.d1;
import k20.k0;
import k20.k1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.s;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.g;
import kotlin.reflect.jvm.internal.impl.descriptors.b;
import p20.j;
import u10.f;
import w00.i;
import w00.n0;
import w00.p;
import w00.s0;
import w00.v0;
import wz.e0;
import wz.u;
import wz.w;
import wz.x;
import y00.g0;
import y00.l0;
import y00.p;

/* loaded from: classes5.dex */
public final class e extends g0 {
    public static final a K = new a(null);

    /* loaded from: classes5.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final v0 b(e eVar, int i11, s0 s0Var) {
            String lowerCase;
            String b11 = s0Var.getName().b();
            s.f(b11, "typeParameter.name.asString()");
            if (s.c(b11, "T")) {
                lowerCase = "instance";
            } else if (s.c(b11, "E")) {
                lowerCase = "receiver";
            } else {
                lowerCase = b11.toLowerCase(Locale.ROOT);
                s.f(lowerCase, "(this as java.lang.Strin….toLowerCase(Locale.ROOT)");
            }
            g b12 = g.f34943d1.b();
            f f11 = f.f(lowerCase);
            s.f(f11, "identifier(name)");
            k0 n11 = s0Var.n();
            s.f(n11, "typeParameter.defaultType");
            n0 NO_SOURCE = n0.f55303a;
            s.f(NO_SOURCE, "NO_SOURCE");
            return new l0(eVar, null, i11, b12, f11, n11, false, false, false, null, NO_SOURCE);
        }

        public final e a(b functionClass, boolean z11) {
            List<? extends s0> i11;
            Iterable<wz.k0> U0;
            int t11;
            s.g(functionClass, "functionClass");
            List<s0> o11 = functionClass.o();
            e eVar = new e(functionClass, null, b.a.DECLARATION, z11, null);
            w00.l0 E0 = functionClass.E0();
            i11 = w.i();
            ArrayList arrayList = new ArrayList();
            for (Object obj : o11) {
                if (!(((s0) obj).k() == k1.IN_VARIANCE)) {
                    break;
                }
                arrayList.add(obj);
            }
            U0 = e0.U0(arrayList);
            t11 = x.t(U0, 10);
            ArrayList arrayList2 = new ArrayList(t11);
            for (wz.k0 k0Var : U0) {
                arrayList2.add(e.K.b(eVar, k0Var.c(), (s0) k0Var.d()));
            }
            eVar.N0(null, E0, i11, arrayList2, ((s0) u.n0(o11)).n(), kotlin.reflect.jvm.internal.impl.descriptors.f.ABSTRACT, p.f55309e);
            eVar.V0(true);
            return eVar;
        }
    }

    private e(i iVar, e eVar, b.a aVar, boolean z11) {
        super(iVar, eVar, g.f34943d1.b(), j.f45928g, aVar, n0.f55303a);
        b1(true);
        d1(z11);
        U0(false);
    }

    public /* synthetic */ e(i iVar, e eVar, b.a aVar, boolean z11, DefaultConstructorMarker defaultConstructorMarker) {
        this(iVar, eVar, aVar, z11);
    }

    private final kotlin.reflect.jvm.internal.impl.descriptors.e l1(List<f> list) {
        int t11;
        boolean z11;
        f fVar;
        int size = h().size() - list.size();
        boolean z12 = true;
        List<v0> valueParameters = h();
        s.f(valueParameters, "valueParameters");
        t11 = x.t(valueParameters, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (v0 v0Var : valueParameters) {
            f name = v0Var.getName();
            s.f(name, "it.name");
            int index = v0Var.getIndex();
            int i11 = index - size;
            if (i11 >= 0 && (fVar = list.get(i11)) != null) {
                name = fVar;
            }
            arrayList.add(v0Var.B0(this, name, index));
        }
        p.c O0 = O0(d1.f34234b);
        if (!list.isEmpty()) {
            for (f fVar2 : list) {
                if (fVar2 == null) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z12 = false;
        p.c j11 = O0.F(z12).c(arrayList).j(d0());
        s.f(j11, "newCopyBuilder(TypeSubst…   .setOriginal(original)");
        kotlin.reflect.jvm.internal.impl.descriptors.e I0 = super.I0(j11);
        s.e(I0);
        s.f(I0, "super.doSubstitute(copyConfiguration)!!");
        return I0;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean A() {
        return false;
    }

    @Override // y00.g0, y00.p
    protected y00.p H0(i newOwner, kotlin.reflect.jvm.internal.impl.descriptors.e eVar, b.a kind, f fVar, g annotations, n0 source) {
        s.g(newOwner, "newOwner");
        s.g(kind, "kind");
        s.g(annotations, "annotations");
        s.g(source, "source");
        return new e(newOwner, (e) eVar, kind, isSuspend());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y00.p
    public kotlin.reflect.jvm.internal.impl.descriptors.e I0(p.c configuration) {
        boolean z11;
        int t11;
        s.g(configuration, "configuration");
        e eVar = (e) super.I0(configuration);
        if (eVar == null) {
            return null;
        }
        List<v0> h11 = eVar.h();
        s.f(h11, "substituted.valueParameters");
        boolean z12 = false;
        if (!(h11 instanceof Collection) || !h11.isEmpty()) {
            for (v0 v0Var : h11) {
                d0 type = v0Var.getType();
                s.f(type, "it.type");
                if (t00.g.c(type) != null) {
                    z11 = true;
                    continue;
                } else {
                    z11 = false;
                    continue;
                }
                if (z11) {
                    break;
                }
            }
        }
        z12 = true;
        if (z12) {
            return eVar;
        }
        List<v0> h12 = eVar.h();
        s.f(h12, "substituted.valueParameters");
        t11 = x.t(h12, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (v0 v0Var2 : h12) {
            d0 type2 = v0Var2.getType();
            s.f(type2, "it.type");
            arrayList.add(t00.g.c(type2));
        }
        return eVar.l1(arrayList);
    }

    @Override // y00.p, w00.u
    public boolean isExternal() {
        return false;
    }

    @Override // y00.p, kotlin.reflect.jvm.internal.impl.descriptors.e
    public boolean isInline() {
        return false;
    }
}