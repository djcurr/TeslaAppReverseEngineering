package androidx.compose.ui.window;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.m0;
import f2.y;
import f2.z;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import vz.b0;
import wz.w;

/* loaded from: classes.dex */
public final class c implements z {

    /* renamed from: a  reason: collision with root package name */
    public static final c f3267a = new c();

    /* loaded from: classes.dex */
    public static final class a extends u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        public static final a f3268a = new a();

        public a() {
            super(1);
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            s.g(layout, "$this$layout");
        }
    }

    /* loaded from: classes.dex */
    public static final class b extends u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ m0 f3269a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(m0 m0Var) {
            super(1);
            this.f3269a = m0Var;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            s.g(layout, "$this$layout");
            m0.a.n(layout, this.f3269a, 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
        }
    }

    /* renamed from: androidx.compose.ui.window.c$c  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0061c extends u implements h00.l<m0.a, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ List<m0> f3270a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C0061c(List<? extends m0> list) {
            super(1);
            this.f3270a = list;
        }

        @Override // h00.l
        public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
            invoke2(aVar);
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2(m0.a layout) {
            int k11;
            s.g(layout, "$this$layout");
            k11 = w.k(this.f3270a);
            if (k11 < 0) {
                return;
            }
            int i11 = 0;
            while (true) {
                int i12 = i11 + 1;
                m0.a.n(layout, this.f3270a.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                if (i11 == k11) {
                    return;
                }
                i11 = i12;
            }
        }
    }

    @Override // f2.z
    public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
        return z.a.d(this, kVar, list, i11);
    }

    @Override // f2.z
    public final a0 b(f2.b0 Layout, List<? extends y> measurables, long j11) {
        int k11;
        int i11;
        int i12;
        s.g(Layout, "$this$Layout");
        s.g(measurables, "measurables");
        int size = measurables.size();
        if (size != 0) {
            int i13 = 0;
            if (size != 1) {
                ArrayList arrayList = new ArrayList(measurables.size());
                int size2 = measurables.size();
                for (int i14 = 0; i14 < size2; i14++) {
                    arrayList.add(measurables.get(i14).X(j11));
                }
                k11 = w.k(arrayList);
                if (k11 >= 0) {
                    int i15 = 0;
                    int i16 = 0;
                    while (true) {
                        int i17 = i13 + 1;
                        m0 m0Var = (m0) arrayList.get(i13);
                        i15 = Math.max(i15, m0Var.B0());
                        i16 = Math.max(i16, m0Var.w0());
                        if (i13 == k11) {
                            break;
                        }
                        i13 = i17;
                    }
                    i11 = i15;
                    i12 = i16;
                } else {
                    i11 = 0;
                    i12 = 0;
                }
                return b0.a.b(Layout, i11, i12, null, new C0061c(arrayList), 4, null);
            }
            m0 X = measurables.get(0).X(j11);
            return b0.a.b(Layout, X.B0(), X.w0(), null, new b(X), 4, null);
        }
        return b0.a.b(Layout, 0, 0, null, a.f3268a, 4, null);
    }

    @Override // f2.z
    public int c(f2.k kVar, List<? extends f2.j> list, int i11) {
        return z.a.b(this, kVar, list, i11);
    }

    @Override // f2.z
    public int d(f2.k kVar, List<? extends f2.j> list, int i11) {
        return z.a.a(this, kVar, list, i11);
    }

    @Override // f2.z
    public int e(f2.k kVar, List<? extends f2.j> list, int i11) {
        return z.a.c(this, kVar, list, i11);
    }
}