package y10;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import k20.a1;
import k20.c1;
import k20.d0;
import k20.k0;
import k20.k1;
import k20.w0;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w00.s0;
import wz.e0;

/* loaded from: classes5.dex */
public final class n implements w0 {

    /* renamed from: f  reason: collision with root package name */
    public static final a f58976f = new a(null);

    /* renamed from: a  reason: collision with root package name */
    private final long f58977a;

    /* renamed from: b  reason: collision with root package name */
    private final w00.x f58978b;

    /* renamed from: c  reason: collision with root package name */
    private final Set<d0> f58979c;

    /* renamed from: d  reason: collision with root package name */
    private final k0 f58980d;

    /* renamed from: e  reason: collision with root package name */
    private final vz.k f58981e;

    /* loaded from: classes5.dex */
    public static final class a {

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: y10.n$a$a  reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public enum EnumC1338a {
            COMMON_SUPER_TYPE,
            INTERSECTION_TYPE
        }

        /* loaded from: classes5.dex */
        public /* synthetic */ class b {

            /* renamed from: a  reason: collision with root package name */
            public static final /* synthetic */ int[] f58982a;

            static {
                int[] iArr = new int[EnumC1338a.values().length];
                iArr[EnumC1338a.COMMON_SUPER_TYPE.ordinal()] = 1;
                iArr[EnumC1338a.INTERSECTION_TYPE.ordinal()] = 2;
                f58982a = iArr;
            }
        }

        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final k0 a(Collection<? extends k0> collection, EnumC1338a enumC1338a) {
            if (collection.isEmpty()) {
                return null;
            }
            Iterator<T> it2 = collection.iterator();
            if (it2.hasNext()) {
                Object next = it2.next();
                while (it2.hasNext()) {
                    a aVar = n.f58976f;
                    next = aVar.c((k0) next, (k0) it2.next(), enumC1338a);
                }
                return (k0) next;
            }
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }

        private final k0 c(k0 k0Var, k0 k0Var2, EnumC1338a enumC1338a) {
            if (k0Var == null || k0Var2 == null) {
                return null;
            }
            w0 H0 = k0Var.H0();
            w0 H02 = k0Var2.H0();
            boolean z11 = H0 instanceof n;
            if (z11 && (H02 instanceof n)) {
                return e((n) H0, (n) H02, enumC1338a);
            }
            if (z11) {
                return d((n) H0, k0Var2);
            }
            if (H02 instanceof n) {
                return d((n) H02, k0Var);
            }
            return null;
        }

        private final k0 d(n nVar, k0 k0Var) {
            if (nVar.f().contains(k0Var)) {
                return k0Var;
            }
            return null;
        }

        private final k0 e(n nVar, n nVar2, EnumC1338a enumC1338a) {
            Set h02;
            int i11 = b.f58982a[enumC1338a.ordinal()];
            if (i11 == 1) {
                h02 = e0.h0(nVar.f(), nVar2.f());
            } else if (i11 != 2) {
                throw new NoWhenBranchMatchedException();
            } else {
                h02 = e0.T0(nVar.f(), nVar2.f());
            }
            return k20.e0.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), new n(nVar.f58977a, nVar.f58978b, h02, null), false);
        }

        public final k0 b(Collection<? extends k0> types) {
            kotlin.jvm.internal.s.g(types, "types");
            return a(types, EnumC1338a.INTERSECTION_TYPE);
        }
    }

    /* loaded from: classes5.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.a<List<k0>> {
        b() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final List<k0> mo11invoke() {
            List d11;
            List<k0> o11;
            k0 n11 = n.this.l().x().n();
            kotlin.jvm.internal.s.f(n11, "builtIns.comparable.defaultType");
            d11 = wz.v.d(new a1(k1.IN_VARIANCE, n.this.f58980d));
            o11 = wz.w.o(c1.f(n11, d11, null, 2, null));
            if (!n.this.h()) {
                o11.add(n.this.l().L());
            }
            return o11;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.l<d0, CharSequence> {

        /* renamed from: a  reason: collision with root package name */
        public static final c f58984a = new c();

        c() {
            super(1);
        }

        @Override // h00.l
        /* renamed from: a */
        public final CharSequence mo12invoke(d0 it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return it2.toString();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private n(long j11, w00.x xVar, Set<? extends d0> set) {
        vz.k a11;
        this.f58980d = k20.e0.e(kotlin.reflect.jvm.internal.impl.descriptors.annotations.g.f34943d1.b(), this, false);
        a11 = vz.m.a(new b());
        this.f58981e = a11;
        this.f58977a = j11;
        this.f58978b = xVar;
        this.f58979c = set;
    }

    public /* synthetic */ n(long j11, w00.x xVar, Set set, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, xVar, set);
    }

    private final List<d0> g() {
        return (List) this.f58981e.mo16getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean h() {
        Collection<d0> a11 = t.a(this.f58978b);
        if ((a11 instanceof Collection) && a11.isEmpty()) {
            return true;
        }
        for (d0 d0Var : a11) {
            if (!(!f().contains(d0Var))) {
                return false;
            }
        }
        return true;
    }

    private final String i() {
        String l02;
        StringBuilder sb2 = new StringBuilder();
        sb2.append('[');
        l02 = e0.l0(this.f58979c, ",", null, null, 0, null, c.f58984a, 30, null);
        sb2.append(l02);
        sb2.append(']');
        return sb2.toString();
    }

    @Override // k20.w0
    public Collection<d0> a() {
        return g();
    }

    public final Set<d0> f() {
        return this.f58979c;
    }

    @Override // k20.w0
    public List<s0> getParameters() {
        List<s0> i11;
        i11 = wz.w.i();
        return i11;
    }

    @Override // k20.w0
    public t00.h l() {
        return this.f58978b.l();
    }

    @Override // k20.w0
    /* renamed from: m */
    public w0 mo154m(kotlin.reflect.jvm.internal.impl.types.checker.h kotlinTypeRefiner) {
        kotlin.jvm.internal.s.g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    @Override // k20.w0
    public w00.e n() {
        return null;
    }

    @Override // k20.w0
    public boolean o() {
        return false;
    }

    public String toString() {
        return kotlin.jvm.internal.s.p("IntegerLiteralType", i());
    }
}