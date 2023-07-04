package k0;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import java.util.ArrayList;
import java.util.List;
import vz.b0;
import wz.e0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class b implements f2.z {

    /* renamed from: a  reason: collision with root package name */
    private final k0.e f34054a;

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<f2.j, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34055a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i11) {
            super(1);
            this.f34055a = i11;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(f2.j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.a(this.f34055a));
        }
    }

    /* renamed from: k0.b$b  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    static final class C0629b extends kotlin.jvm.internal.u implements h00.l<f2.j, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34056a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0629b(int i11) {
            super(1);
            this.f34056a = i11;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(f2.j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.T(this.f34056a));
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<m0> f34057a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends m0> list) {
            super(1);
            this.f34057a = list;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            List<m0> list = this.f34057a;
            int size = list.size() - 1;
            if (size < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                m0.a.j(layout, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                if (i12 > size) {
                    return;
                }
                i11 = i12;
            }
        }
    }

    /* loaded from: classes.dex */
    static final class d extends kotlin.jvm.internal.u implements h00.l<f2.j, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34058a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(int i11) {
            super(1);
            this.f34058a = i11;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(f2.j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.u(this.f34058a));
        }
    }

    /* loaded from: classes.dex */
    static final class e extends kotlin.jvm.internal.u implements h00.l<f2.j, Integer> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ int f34059a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(int i11) {
            super(1);
            this.f34059a = i11;
        }

        @Override // h00.l
        /* renamed from: a */
        public final Integer invoke(f2.j it2) {
            kotlin.jvm.internal.s.g(it2, "it");
            return Integer.valueOf(it2.S(this.f34059a));
        }
    }

    public b(k0.e scope) {
        kotlin.jvm.internal.s.g(scope, "scope");
        this.f34054a = scope;
    }

    @Override // f2.z
    public int a(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        u20.h S;
        u20.h B;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        S = e0.S(measurables);
        B = u20.p.B(S, new e(i11));
        Integer num = (Integer) u20.k.D(B);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v16 */
    @Override // f2.z
    public f2.a0 b(f2.b0 receiver, List<? extends f2.y> measurables, long j11) {
        int t11;
        Object obj;
        int k11;
        int k12;
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        t11 = wz.x.t(measurables, 10);
        ArrayList arrayList = new ArrayList(t11);
        for (f2.y yVar : measurables) {
            arrayList.add(yVar.X(j11));
        }
        m0 m0Var = null;
        int i11 = 1;
        if (arrayList.isEmpty()) {
            obj = null;
        } else {
            obj = arrayList.get(0);
            int B0 = ((m0) obj).B0();
            k11 = wz.w.k(arrayList);
            if (1 <= k11) {
                int i12 = 1;
                while (true) {
                    int i13 = i12 + 1;
                    Object obj2 = arrayList.get(i12);
                    int B02 = ((m0) obj2).B0();
                    if (B0 < B02) {
                        obj = obj2;
                        B0 = B02;
                    }
                    if (i12 == k11) {
                        break;
                    }
                    i12 = i13;
                }
            }
        }
        m0 m0Var2 = (m0) obj;
        int B03 = m0Var2 == null ? 0 : m0Var2.B0();
        if (!arrayList.isEmpty()) {
            Object obj3 = arrayList.get(0);
            int w02 = ((m0) obj3).w0();
            k12 = wz.w.k(arrayList);
            Object obj4 = obj3;
            if (1 <= k12) {
                while (true) {
                    int i14 = i11 + 1;
                    Object obj5 = arrayList.get(i11);
                    int w03 = ((m0) obj5).w0();
                    obj3 = obj4;
                    if (w02 < w03) {
                        obj3 = obj5;
                        w02 = w03;
                    }
                    if (i11 == k12) {
                        break;
                    }
                    i11 = i14;
                    obj4 = obj3;
                }
            }
            m0Var = obj3;
        }
        m0 m0Var3 = m0Var;
        int w04 = m0Var3 != null ? m0Var3.w0() : 0;
        this.f34054a.a().setValue(x2.o.b(x2.p.a(B03, w04)));
        return b0.a.b(receiver, B03, w04, null, new c(arrayList), 4, null);
    }

    @Override // f2.z
    public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        u20.h S;
        u20.h B;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        S = e0.S(measurables);
        B = u20.p.B(S, new C0629b(i11));
        Integer num = (Integer) u20.k.D(B);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // f2.z
    public int d(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        u20.h S;
        u20.h B;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        S = e0.S(measurables);
        B = u20.p.B(S, new a(i11));
        Integer num = (Integer) u20.k.D(B);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // f2.z
    public int e(f2.k kVar, List<? extends f2.j> measurables, int i11) {
        u20.h S;
        u20.h B;
        kotlin.jvm.internal.s.g(kVar, "<this>");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        S = e0.S(measurables);
        B = u20.p.B(S, new d(i11));
        Integer num = (Integer) u20.k.D(B);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }
}