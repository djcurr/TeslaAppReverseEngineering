package y0;

import f2.b0;
import f2.m0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class l1 implements f2.z {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f58385a;

    /* renamed from: b  reason: collision with root package name */
    private final float f58386b;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58387a = new a();

        a() {
            super(2);
        }

        public final Integer a(f2.j intrinsicMeasurable, int i11) {
            kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.a(i11));
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo160invoke(f2.j jVar, Integer num) {
            return a(jVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final b f58388a = new b();

        b() {
            super(2);
        }

        public final Integer a(f2.j intrinsicMeasurable, int i11) {
            kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.T(i11));
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo160invoke(f2.j jVar, Integer num) {
            return a(jVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58389a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58390b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f58391c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f58392d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f58393e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58394f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58395g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58396h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58397i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ l1 f58398j;

        /* renamed from: k  reason: collision with root package name */
        final /* synthetic */ int f58399k;

        /* renamed from: l  reason: collision with root package name */
        final /* synthetic */ int f58400l;

        /* renamed from: m  reason: collision with root package name */
        final /* synthetic */ f2.b0 f58401m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(f2.m0 m0Var, int i11, int i12, int i13, int i14, f2.m0 m0Var2, f2.m0 m0Var3, f2.m0 m0Var4, f2.m0 m0Var5, l1 l1Var, int i15, int i16, f2.b0 b0Var) {
            super(1);
            this.f58389a = m0Var;
            this.f58390b = i11;
            this.f58391c = i12;
            this.f58392d = i13;
            this.f58393e = i14;
            this.f58394f = m0Var2;
            this.f58395g = m0Var3;
            this.f58396h = m0Var4;
            this.f58397i = m0Var5;
            this.f58398j = l1Var;
            this.f58399k = i15;
            this.f58400l = i16;
            this.f58401m = b0Var;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            int d11;
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            if (this.f58389a == null) {
                k1.t(layout, this.f58392d, this.f58393e, this.f58394f, this.f58395g, this.f58396h, this.f58397i, this.f58398j.f58385a, this.f58401m.getDensity());
                return;
            }
            d11 = m00.l.d(this.f58390b - this.f58391c, 0);
            k1.s(layout, this.f58392d, this.f58393e, this.f58394f, this.f58389a, this.f58395g, this.f58396h, this.f58397i, this.f58398j.f58385a, d11, this.f58400l + this.f58399k, this.f58398j.f58386b, this.f58401m.getDensity());
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f58402a = new d();

        d() {
            super(2);
        }

        public final Integer a(f2.j intrinsicMeasurable, int i11) {
            kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.u(i11));
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo160invoke(f2.j jVar, Integer num) {
            return a(jVar, num.intValue());
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f58403a = new e();

        e() {
            super(2);
        }

        public final Integer a(f2.j intrinsicMeasurable, int i11) {
            kotlin.jvm.internal.s.g(intrinsicMeasurable, "intrinsicMeasurable");
            return Integer.valueOf(intrinsicMeasurable.S(i11));
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ Integer mo160invoke(f2.j jVar, Integer num) {
            return a(jVar, num.intValue());
        }
    }

    public l1(boolean z11, float f11) {
        this.f58385a = z11;
        this.f58386b = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int h(f2.k kVar, List<? extends f2.j> list, int i11, h00.p<? super f2.j, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int p11;
        for (Object obj5 : list) {
            if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj5), "TextField")) {
                int intValue = pVar.mo160invoke(obj5, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj2), "Label")) {
                        break;
                    }
                }
                f2.j jVar = (f2.j) obj2;
                int intValue2 = jVar == null ? 0 : pVar.mo160invoke(jVar, Integer.valueOf(i11)).intValue();
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj3), "Trailing")) {
                        break;
                    }
                }
                f2.j jVar2 = (f2.j) obj3;
                int intValue3 = jVar2 == null ? 0 : pVar.mo160invoke(jVar2, Integer.valueOf(i11)).intValue();
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj4), "Leading")) {
                        break;
                    }
                }
                f2.j jVar3 = (f2.j) obj4;
                int intValue4 = jVar3 == null ? 0 : pVar.mo160invoke(jVar3, Integer.valueOf(i11)).intValue();
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                f2.j jVar4 = (f2.j) obj;
                p11 = k1.p(intValue, intValue2 > 0, intValue2, intValue4, intValue3, jVar4 == null ? 0 : pVar.mo160invoke(jVar4, Integer.valueOf(i11)).intValue(), j1.i(), kVar.getDensity());
                return p11;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int i(List<? extends f2.j> list, int i11, h00.p<? super f2.j, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int q11;
        for (Object obj5 : list) {
            if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj5), "TextField")) {
                int intValue = pVar.mo160invoke(obj5, Integer.valueOf(i11)).intValue();
                Iterator<T> it2 = list.iterator();
                while (true) {
                    obj = null;
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj2), "Label")) {
                        break;
                    }
                }
                f2.j jVar = (f2.j) obj2;
                int intValue2 = jVar == null ? 0 : pVar.mo160invoke(jVar, Integer.valueOf(i11)).intValue();
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (!it3.hasNext()) {
                        obj3 = null;
                        break;
                    }
                    obj3 = it3.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj3), "Trailing")) {
                        break;
                    }
                }
                f2.j jVar2 = (f2.j) obj3;
                int intValue3 = jVar2 == null ? 0 : pVar.mo160invoke(jVar2, Integer.valueOf(i11)).intValue();
                Iterator<T> it4 = list.iterator();
                while (true) {
                    if (!it4.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it4.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) obj4), "Leading")) {
                        break;
                    }
                }
                f2.j jVar3 = (f2.j) obj4;
                int intValue4 = jVar3 == null ? 0 : pVar.mo160invoke(jVar3, Integer.valueOf(i11)).intValue();
                Iterator<T> it5 = list.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        break;
                    }
                    Object next = it5.next();
                    if (kotlin.jvm.internal.s.c(j1.g((f2.j) next), "Hint")) {
                        obj = next;
                        break;
                    }
                }
                f2.j jVar4 = (f2.j) obj;
                q11 = k1.q(intValue4, intValue3, intValue, intValue2, jVar4 == null ? 0 : pVar.mo160invoke(jVar4, Integer.valueOf(i11)).intValue(), j1.i());
                return q11;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // f2.z
    public int a(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return i(measurables, i11, e.f58403a);
    }

    @Override // f2.z
    public f2.a0 b(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
        float f11;
        float f12;
        float f13;
        Object obj;
        Object obj2;
        Object obj3;
        int Z;
        Object obj4;
        int q11;
        int p11;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        int G = receiver.G(j1.h());
        f11 = k1.f58276a;
        int G2 = receiver.G(f11);
        f12 = k1.f58277b;
        int G3 = receiver.G(f12);
        f13 = k1.f58278c;
        int G4 = receiver.G(f13);
        long e11 = x2.b.e(j11, 0, 0, 0, 0, 10, null);
        Iterator<T> it2 = measurables.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (kotlin.jvm.internal.s.c(f2.r.a((f2.y) obj), "Leading")) {
                break;
            }
        }
        f2.y yVar = (f2.y) obj;
        f2.m0 X = yVar == null ? null : yVar.X(e11);
        int k11 = j1.k(X) + 0;
        Iterator<T> it3 = measurables.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (kotlin.jvm.internal.s.c(f2.r.a((f2.y) obj2), "Trailing")) {
                break;
            }
        }
        f2.y yVar2 = (f2.y) obj2;
        f2.m0 X2 = yVar2 == null ? null : yVar2.X(x2.c.i(e11, -k11, 0, 2, null));
        int i11 = -G3;
        int i12 = -(k11 + j1.k(X2));
        long h11 = x2.c.h(e11, i12, i11);
        Iterator<T> it4 = measurables.iterator();
        while (true) {
            if (!it4.hasNext()) {
                obj3 = null;
                break;
            }
            obj3 = it4.next();
            if (kotlin.jvm.internal.s.c(f2.r.a((f2.y) obj3), "Label")) {
                break;
            }
        }
        f2.y yVar3 = (f2.y) obj3;
        f2.m0 X3 = yVar3 == null ? null : yVar3.X(h11);
        if (X3 == null) {
            Z = 0;
        } else {
            Z = X3.Z(f2.b.b());
            if (Z == Integer.MIN_VALUE) {
                Z = X3.w0();
            }
        }
        int max = Math.max(Z, G2);
        long h12 = x2.c.h(x2.b.e(j11, 0, 0, 0, 0, 11, null), i12, X3 != null ? (i11 - G4) - max : (-G) * 2);
        for (f2.y yVar4 : measurables) {
            if (kotlin.jvm.internal.s.c(f2.r.a(yVar4), "TextField")) {
                f2.m0 X4 = yVar4.X(h12);
                long e12 = x2.b.e(h12, 0, 0, 0, 0, 14, null);
                Iterator<T> it5 = measurables.iterator();
                while (true) {
                    if (!it5.hasNext()) {
                        obj4 = null;
                        break;
                    }
                    obj4 = it5.next();
                    if (kotlin.jvm.internal.s.c(f2.r.a((f2.y) obj4), "Hint")) {
                        break;
                    }
                }
                f2.y yVar5 = (f2.y) obj4;
                f2.m0 X5 = yVar5 == null ? null : yVar5.X(e12);
                q11 = k1.q(j1.k(X), j1.k(X2), X4.B0(), j1.k(X3), j1.k(X5), j11);
                p11 = k1.p(X4.w0(), X3 != null, max, j1.j(X), j1.j(X2), j1.j(X5), j11, receiver.getDensity());
                return b0.a.b(receiver, q11, p11, null, new c(X3, G2, Z, q11, p11, X4, X5, X, X2, this, max, G4, receiver), 4, null);
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // f2.z
    public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return i(measurables, i11, b.f58388a);
    }

    @Override // f2.z
    public int d(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return h(kVar, measurables, i11, a.f58387a);
    }

    @Override // f2.z
    public int e(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return h(kVar, measurables, i11, d.f58402a);
    }
}