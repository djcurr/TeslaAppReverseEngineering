package x0;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import vz.b0;

/* loaded from: classes.dex */
public final class q {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class a implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final a f56585a = new a();

        /* renamed from: x0.q$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1294a extends kotlin.jvm.internal.u implements h00.l<m0.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<m0> f56586a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1294a(List<? extends m0> list) {
                super(1);
                this.f56586a = list;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                List<m0> list = this.f56586a;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m0.a.j(layout, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }
        }

        a() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 Layout, List<? extends f2.y> measurables, long j11) {
            kotlin.jvm.internal.s.g(Layout, "$this$Layout");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            Integer num = 0;
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(measurables.get(i11).X(j11));
            }
            int size2 = arrayList.size();
            Integer num2 = num;
            for (int i12 = 0; i12 < size2; i12++) {
                num2 = Integer.valueOf(Math.max(num2.intValue(), ((m0) arrayList.get(i12)).B0()));
            }
            int intValue = num2.intValue();
            int size3 = arrayList.size();
            for (int i13 = 0; i13 < size3; i13++) {
                num = Integer.valueOf(Math.max(num.intValue(), ((m0) arrayList.get(i13)).w0()));
            }
            return b0.a.b(Layout, intValue, num.intValue(), null, new C1294a(arrayList), 4, null);
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f56587a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f56588b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f56589c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f56590d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f56587a = fVar;
            this.f56588b = pVar;
            this.f56589c = i11;
            this.f56590d = i12;
        }

        @Override // h00.p
        public /* bridge */ /* synthetic */ vz.b0 invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            q.a(this.f56587a, this.f56588b, iVar, this.f56589c | 1, this.f56590d);
        }
    }

    public static final void a(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11, int i12) {
        int i13;
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(-1115407240);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 14) == 0) {
            i13 = (h11.O(fVar) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 112) == 0) {
            i13 |= h11.O(content) ? 32 : 16;
        }
        if (((i13 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            if (i14 != 0) {
                fVar = o1.f.f42062f1;
            }
            a aVar = a.f56585a;
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            x2.q qVar = (x2.q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(fVar);
            int i15 = (((((i13 << 3) & 112) | ((i13 >> 3) & 14)) << 9) & 7168) | 6;
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a12 = a2.a(h11);
            a2.c(a12, aVar, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i15 >> 3) & 112));
            h11.x(2058660585);
            content.invoke(h11, Integer.valueOf((i15 >> 9) & 14));
            h11.N();
            h11.q();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(fVar, content, i11, i12));
    }
}