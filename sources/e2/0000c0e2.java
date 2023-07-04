package y0;

import f2.b0;
import f2.m0;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class q0 implements f2.z {

    /* renamed from: a  reason: collision with root package name */
    private final h00.l<s1.l, vz.b0> f58580a;

    /* renamed from: b  reason: collision with root package name */
    private final boolean f58581b;

    /* renamed from: c  reason: collision with root package name */
    private final float f58582c;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f58583a = new a();

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
        public static final b f58584a = new b();

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
        final /* synthetic */ int f58585a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ int f58586b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58587c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58588d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58589e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58590f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58591g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ f2.m0 f58592h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ q0 f58593i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ f2.b0 f58594j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i11, int i12, f2.m0 m0Var, f2.m0 m0Var2, f2.m0 m0Var3, f2.m0 m0Var4, f2.m0 m0Var5, f2.m0 m0Var6, q0 q0Var, f2.b0 b0Var) {
            super(1);
            this.f58585a = i11;
            this.f58586b = i12;
            this.f58587c = m0Var;
            this.f58588d = m0Var2;
            this.f58589e = m0Var3;
            this.f58590f = m0Var4;
            this.f58591g = m0Var5;
            this.f58592h = m0Var6;
            this.f58593i = q0Var;
            this.f58594j = b0Var;
        }

        @Override // h00.l
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo12invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            p0.l(layout, this.f58585a, this.f58586b, this.f58587c, this.f58588d, this.f58589e, this.f58590f, this.f58591g, this.f58592h, this.f58593i.f(), this.f58593i.h(), this.f58594j.getDensity());
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.p<f2.j, Integer, Integer> {

        /* renamed from: a  reason: collision with root package name */
        public static final d f58595a = new d();

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
        public static final e f58596a = new e();

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

    /* JADX WARN: Multi-variable type inference failed */
    public q0(h00.l<? super s1.l, vz.b0> onLabelMeasured, boolean z11, float f11) {
        kotlin.jvm.internal.s.g(onLabelMeasured, "onLabelMeasured");
        this.f58580a = onLabelMeasured;
        this.f58581b = z11;
        this.f58582c = f11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int i(f2.k kVar, List<? extends f2.j> list, int i11, h00.p<? super f2.j, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int h11;
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
                h11 = p0.h(intValue4, intValue3, intValue, intValue2, jVar4 == null ? 0 : pVar.mo160invoke(jVar4, Integer.valueOf(i11)).intValue(), j1.i(), kVar.getDensity());
                return h11;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final int j(List<? extends f2.j> list, int i11, h00.p<? super f2.j, ? super Integer, Integer> pVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i12;
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
                i12 = p0.i(intValue4, intValue3, intValue, intValue2, jVar4 == null ? 0 : pVar.mo160invoke(jVar4, Integer.valueOf(i11)).intValue(), j1.i());
                return i12;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // f2.z
    public int a(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return j(measurables, i11, e.f58596a);
    }

    @Override // f2.z
    public f2.a0 b(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i11;
        int h11;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        int G = receiver.G(j1.h());
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
        int i12 = -(k11 + j1.k(X2));
        int i13 = -G;
        long h12 = x2.c.h(e11, i12, i13);
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
        f2.m0 X3 = yVar3 == null ? null : yVar3.X(h12);
        if (X3 != null) {
            g().mo12invoke(s1.l.c(s1.m.a(X3.B0(), X3.w0())));
        }
        long e12 = x2.b.e(x2.c.h(j11, i12, i13 - Math.max(j1.j(X3) / 2, G)), 0, 0, 0, 0, 11, null);
        for (f2.y yVar4 : measurables) {
            if (kotlin.jvm.internal.s.c(f2.r.a(yVar4), "TextField")) {
                f2.m0 X4 = yVar4.X(e12);
                long e13 = x2.b.e(e12, 0, 0, 0, 0, 14, null);
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
                f2.m0 X5 = yVar5 == null ? null : yVar5.X(e13);
                i11 = p0.i(j1.k(X), j1.k(X2), X4.B0(), j1.k(X3), j1.k(X5), j11);
                h11 = p0.h(j1.j(X), j1.j(X2), X4.w0(), j1.j(X3), j1.j(X5), j11, receiver.getDensity());
                for (f2.y yVar6 : measurables) {
                    if (kotlin.jvm.internal.s.c(f2.r.a(yVar6), "border")) {
                        return b0.a.b(receiver, i11, h11, null, new c(h11, i11, X, X2, X4, X3, X5, yVar6.X(x2.c.a(i11 != Integer.MAX_VALUE ? i11 : 0, i11, h11 != Integer.MAX_VALUE ? h11 : 0, h11)), this, receiver), 4, null);
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    @Override // f2.z
    public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return j(measurables, i11, b.f58584a);
    }

    @Override // f2.z
    public int d(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return i(kVar, measurables, i11, a.f58583a);
    }

    @Override // f2.z
    public int e(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        return i(kVar, measurables, i11, d.f58595a);
    }

    public final float f() {
        return this.f58582c;
    }

    public final h00.l<s1.l, vz.b0> g() {
        return this.f58580a;
    }

    public final boolean h() {
        return this.f58581b;
    }
}