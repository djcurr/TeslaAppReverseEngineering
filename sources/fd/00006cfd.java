package f2;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import h2.k;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public final class q0 extends k.f {

    /* renamed from: b  reason: collision with root package name */
    public static final q0 f25595b = new q0();

    /* loaded from: classes.dex */
    static final class a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f25596a = new a();

        a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
        }
    }

    /* loaded from: classes.dex */
    static final class b extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f25597a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(m0 m0Var) {
            super(1);
            this.f25597a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            m0.a.r(layout, this.f25597a, 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
        }
    }

    /* loaded from: classes.dex */
    static final class c extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<m0> f25598a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends m0> list) {
            super(1);
            this.f25598a = list;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return vz.b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            kotlin.jvm.internal.s.g(layout, "$this$layout");
            List<m0> list = this.f25598a;
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                m0.a.r(layout, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, null, 12, null);
            }
        }
    }

    private q0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // f2.z
    public a0 b(b0 receiver, List<? extends y> measurables, long j11) {
        kotlin.jvm.internal.s.g(receiver, "$receiver");
        kotlin.jvm.internal.s.g(measurables, "measurables");
        if (measurables.isEmpty()) {
            return b0.a.b(receiver, x2.b.p(j11), x2.b.o(j11), null, a.f25596a, 4, null);
        }
        int i11 = 0;
        if (measurables.size() == 1) {
            m0 X = measurables.get(0).X(j11);
            return b0.a.b(receiver, x2.c.g(j11, X.B0()), x2.c.f(j11, X.w0()), null, new b(X), 4, null);
        }
        ArrayList arrayList = new ArrayList(measurables.size());
        int size = measurables.size();
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(measurables.get(i12).X(j11));
        }
        int size2 = arrayList.size();
        int i13 = 0;
        int i14 = 0;
        while (i11 < size2) {
            int i15 = i11 + 1;
            m0 m0Var = (m0) arrayList.get(i11);
            i13 = Math.max(m0Var.B0(), i13);
            i14 = Math.max(m0Var.w0(), i14);
            i11 = i15;
        }
        return b0.a.b(receiver, x2.c.g(j11, i13), x2.c.f(j11, i14), null, new c(arrayList), 4, null);
    }
}