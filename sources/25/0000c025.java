package y0;

import androidx.compose.ui.platform.y1;
import c1.a2;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import o1.a;
import o1.f;
import org.spongycastle.i18n.MessageBundle;
import org.spongycastle.i18n.TextBundle;
import p0.a;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final o1.f f57815a;

    /* renamed from: b  reason: collision with root package name */
    private static final o1.f f57816b;

    /* renamed from: c  reason: collision with root package name */
    private static final long f57817c;

    /* renamed from: d  reason: collision with root package name */
    private static final long f57818d;

    /* renamed from: e  reason: collision with root package name */
    private static final long f57819e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: y0.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C1312a implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final C1312a f57820a = new C1312a();

        /* renamed from: y0.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1313a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ f2.m0 f57821a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f57822b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ f2.m0 f57823c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f57824d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1313a(f2.m0 m0Var, int i11, f2.m0 m0Var2, int i12) {
                super(1);
                this.f57821a = m0Var;
                this.f57822b = i11;
                this.f57823c = m0Var2;
                this.f57824d = i12;
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
                f2.m0 m0Var = this.f57821a;
                if (m0Var != null) {
                    m0.a.j(layout, m0Var, 0, this.f57822b, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
                f2.m0 m0Var2 = this.f57823c;
                if (m0Var2 == null) {
                    return;
                }
                m0.a.j(layout, m0Var2, 0, this.f57824d, BitmapDescriptorFactory.HUE_RED, 4, null);
            }
        }

        C1312a() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        /* JADX WARN: Removed duplicated region for block: B:43:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x00e7  */
        /* JADX WARN: Removed duplicated region for block: B:61:0x00ff  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x0108  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:65:0x0114  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x011b  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x011e  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x012a  */
        @Override // f2.z
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final f2.a0 b(f2.b0 r12, java.util.List<? extends f2.y> r13, long r14) {
            /*
                Method dump skipped, instructions count: 340
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: y0.a.C1312a.b(f2.b0, java.util.List, long):f2.a0");
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
        final /* synthetic */ p0.i f57825a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57826b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57827c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f57828d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(p0.i iVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, int i11) {
            super(2);
            this.f57825a = iVar;
            this.f57826b = pVar;
            this.f57827c = pVar2;
            this.f57828d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.a(this.f57825a, this.f57826b, this.f57827c, iVar, this.f57828d | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57829a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57830b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57831c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f57832d;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: y0.a$c$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C1314a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57833a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f57834b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y0.a$c$a$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1315a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57835a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f57836b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1315a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
                    super(2);
                    this.f57835a = pVar;
                    this.f57836b = i11;
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                    invoke(iVar, num.intValue());
                    return vz.b0.f54756a;
                }

                public final void invoke(c1.i iVar, int i11) {
                    if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                        iVar.G();
                    } else {
                        o1.a(h0.f58131a.c(iVar, 6).k(), this.f57835a, iVar, (this.f57836b >> 3) & 112);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C1314a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
                super(2);
                this.f57833a = pVar;
                this.f57834b = i11;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    c1.r.a(new c1.x0[]{o.a().c(Float.valueOf(n.f58482a.c(iVar, 6)))}, j1.c.b(iVar, -819892272, true, new C1315a(this.f57833a, this.f57834b)), iVar, 56);
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57837a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ int f57838b;

            /* JADX INFO: Access modifiers changed from: package-private */
            /* renamed from: y0.a$c$b$a  reason: collision with other inner class name */
            /* loaded from: classes.dex */
            public static final class C1316a extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

                /* renamed from: a  reason: collision with root package name */
                final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57839a;

                /* renamed from: b  reason: collision with root package name */
                final /* synthetic */ int f57840b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C1316a(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
                    super(2);
                    this.f57839a = pVar;
                    this.f57840b = i11;
                }

                @Override // h00.p
                /* renamed from: invoke */
                public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                    invoke(iVar, num.intValue());
                    return vz.b0.f54756a;
                }

                public final void invoke(c1.i iVar, int i11) {
                    if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                        iVar.G();
                    } else {
                        o1.a(h0.f58131a.c(iVar, 6).d(), this.f57839a, iVar, (this.f57840b >> 6) & 112);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
                super(2);
                this.f57837a = pVar;
                this.f57838b = i11;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return vz.b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    c1.r.a(new c1.x0[]{o.a().c(Float.valueOf(n.f58482a.d(iVar, 6)))}, j1.c.b(iVar, -819892861, true, new C1316a(this.f57837a, this.f57838b)), iVar, 56);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, int i11) {
            super(2);
            this.f57829a = pVar;
            this.f57830b = pVar2;
            this.f57831c = pVar3;
            this.f57832d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                iVar.G();
                return;
            }
            h00.p<c1.i, Integer, vz.b0> pVar = this.f57829a;
            h00.p<c1.i, Integer, vz.b0> pVar2 = this.f57830b;
            h00.p<c1.i, Integer, vz.b0> pVar3 = this.f57831c;
            int i12 = this.f57832d;
            iVar.x(-1113030915);
            f.a aVar = o1.f.f42062f1;
            f2.z a11 = p0.h.a(p0.a.f45228a.h(), o1.a.f42039a.h(), iVar, 0);
            iVar.x(1376089394);
            x2.d dVar = (x2.d) iVar.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) iVar.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) iVar.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar);
            if (!(iVar.k() instanceof c1.e)) {
                c1.h.c();
            }
            iVar.D();
            if (iVar.f()) {
                iVar.s(a12);
            } else {
                iVar.o();
            }
            iVar.E();
            c1.i a13 = a2.a(iVar);
            a2.c(a13, a11, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            iVar.c();
            b11.invoke(c1.g1.a(c1.g1.b(iVar)), iVar, 0);
            iVar.x(2058660585);
            iVar.x(276693625);
            p0.j jVar = p0.j.f45341a;
            iVar.x(-80835772);
            a.a(jVar, pVar == null ? null : j1.c.c(-985531970, true, new C1314a(pVar, i12)), pVar2 != null ? j1.c.c(-985531593, true, new b(pVar2, i12)) : null, iVar, 6);
            pVar3.mo160invoke(iVar, Integer.valueOf(i12 & 14));
            iVar.N();
            iVar.N();
            iVar.N();
            iVar.q();
            iVar.N();
            iVar.N();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57841a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ o1.f f57842b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57843c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57844d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ t1.c1 f57845e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ long f57846f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ long f57847g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ int f57848h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f57849i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(h00.p<? super c1.i, ? super Integer, vz.b0> pVar, o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, h00.p<? super c1.i, ? super Integer, vz.b0> pVar3, t1.c1 c1Var, long j11, long j12, int i11, int i12) {
            super(2);
            this.f57841a = pVar;
            this.f57842b = fVar;
            this.f57843c = pVar2;
            this.f57844d = pVar3;
            this.f57845e = c1Var;
            this.f57846f = j11;
            this.f57847g = j12;
            this.f57848h = i11;
            this.f57849i = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.b(this.f57841a, this.f57842b, this.f57843c, this.f57844d, this.f57845e, this.f57846f, this.f57847g, iVar, this.f57848h | 1, this.f57849i);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f57850a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f57851b;

        /* renamed from: y0.a$e$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C1317a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<List<f2.m0>> f57852a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f2.b0 f57853b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f57854c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f57855d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ List<Integer> f57856e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C1317a(List<List<f2.m0>> list, f2.b0 b0Var, float f11, int i11, List<Integer> list2) {
                super(1);
                this.f57852a = list;
                this.f57853b = b0Var;
                this.f57854c = f11;
                this.f57855d = i11;
                this.f57856e = list2;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ vz.b0 mo12invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                int k11;
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                List<List<f2.m0>> list = this.f57852a;
                f2.b0 b0Var = this.f57853b;
                float f11 = this.f57854c;
                int i11 = this.f57855d;
                List<Integer> list2 = this.f57856e;
                int size = list.size();
                int i12 = 0;
                while (i12 < size) {
                    int i13 = i12 + 1;
                    List<f2.m0> list3 = list.get(i12);
                    int size2 = list3.size();
                    int[] iArr = new int[size2];
                    int i14 = 0;
                    while (i14 < size2) {
                        int B0 = list3.get(i14).B0();
                        k11 = wz.w.k(list3);
                        iArr[i14] = B0 + (i14 < k11 ? b0Var.G(f11) : 0);
                        i14++;
                    }
                    a.k a11 = p0.a.f45228a.a();
                    int[] iArr2 = new int[size2];
                    for (int i15 = 0; i15 < size2; i15++) {
                        iArr2[i15] = 0;
                    }
                    a11.b(b0Var, i11, iArr, iArr2);
                    int i16 = 0;
                    for (int size3 = list3.size(); i16 < size3; size3 = size3) {
                        m0.a.j(layout, list3.get(i16), iArr2[i16], list2.get(i12).intValue(), BitmapDescriptorFactory.HUE_RED, 4, null);
                        i16++;
                        iArr2 = iArr2;
                        list3 = list3;
                        i12 = i12;
                    }
                    i12 = i13;
                }
            }
        }

        e(float f11, float f12) {
            this.f57850a = f11;
            this.f57851b = f12;
        }

        private static final boolean f(List<f2.m0> list, kotlin.jvm.internal.j0 j0Var, f2.b0 b0Var, float f11, long j11, f2.m0 m0Var) {
            return list.isEmpty() || (j0Var.f34912a + b0Var.G(f11)) + m0Var.B0() <= x2.b.n(j11);
        }

        private static final void g(List<List<f2.m0>> list, kotlin.jvm.internal.j0 j0Var, f2.b0 b0Var, float f11, List<f2.m0> list2, List<Integer> list3, kotlin.jvm.internal.j0 j0Var2, List<Integer> list4, kotlin.jvm.internal.j0 j0Var3, kotlin.jvm.internal.j0 j0Var4) {
            List<f2.m0> O0;
            if (!list.isEmpty()) {
                j0Var.f34912a += b0Var.G(f11);
            }
            O0 = wz.e0.O0(list2);
            list.add(O0);
            list3.add(Integer.valueOf(j0Var2.f34912a));
            list4.add(Integer.valueOf(j0Var.f34912a));
            j0Var.f34912a += j0Var2.f34912a;
            j0Var3.f34912a = Math.max(j0Var3.f34912a, j0Var4.f34912a);
            list2.clear();
            j0Var4.f34912a = 0;
            j0Var2.f34912a = 0;
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final f2.a0 b(f2.b0 Layout, List<? extends f2.y> measurables, long j11) {
            int max;
            kotlin.jvm.internal.j0 j0Var;
            ArrayList arrayList;
            kotlin.jvm.internal.j0 j0Var2;
            kotlin.jvm.internal.s.g(Layout, "$this$Layout");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            kotlin.jvm.internal.j0 j0Var3 = new kotlin.jvm.internal.j0();
            kotlin.jvm.internal.j0 j0Var4 = new kotlin.jvm.internal.j0();
            ArrayList arrayList5 = new ArrayList();
            kotlin.jvm.internal.j0 j0Var5 = new kotlin.jvm.internal.j0();
            kotlin.jvm.internal.j0 j0Var6 = new kotlin.jvm.internal.j0();
            long b11 = x2.c.b(0, x2.b.n(j11), 0, 0, 13, null);
            for (f2.y yVar : measurables) {
                f2.m0 X = yVar.X(b11);
                long j12 = b11;
                kotlin.jvm.internal.j0 j0Var7 = j0Var6;
                if (f(arrayList5, j0Var5, Layout, this.f57850a, j11, X)) {
                    j0Var = j0Var5;
                    arrayList = arrayList5;
                    j0Var2 = j0Var4;
                } else {
                    j0Var = j0Var5;
                    arrayList = arrayList5;
                    j0Var2 = j0Var4;
                    g(arrayList2, j0Var4, Layout, this.f57851b, arrayList5, arrayList3, j0Var7, arrayList4, j0Var3, j0Var);
                }
                kotlin.jvm.internal.j0 j0Var8 = j0Var;
                if (!arrayList.isEmpty()) {
                    j0Var8.f34912a += Layout.G(this.f57850a);
                }
                ArrayList arrayList6 = arrayList;
                arrayList6.add(X);
                j0Var8.f34912a += X.B0();
                j0Var6 = j0Var7;
                j0Var6.f34912a = Math.max(j0Var6.f34912a, X.w0());
                arrayList5 = arrayList6;
                j0Var5 = j0Var8;
                b11 = j12;
                j0Var4 = j0Var2;
            }
            ArrayList arrayList7 = arrayList5;
            kotlin.jvm.internal.j0 j0Var9 = j0Var4;
            kotlin.jvm.internal.j0 j0Var10 = j0Var5;
            if (!arrayList7.isEmpty()) {
                g(arrayList2, j0Var9, Layout, this.f57851b, arrayList7, arrayList3, j0Var6, arrayList4, j0Var3, j0Var10);
            }
            if (x2.b.n(j11) != Integer.MAX_VALUE) {
                max = x2.b.n(j11);
            } else {
                max = Math.max(j0Var3.f34912a, x2.b.p(j11));
            }
            int i11 = max;
            return b0.a.b(Layout, i11, Math.max(j0Var9.f34912a, x2.b.o(j11)), null, new C1317a(arrayList2, Layout, this.f57850a, i11, arrayList4), 4, null);
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
    public static final class f extends kotlin.jvm.internal.u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ float f57857a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f57858b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f57859c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f57860d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(float f11, float f12, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f57857a = f11;
            this.f57858b = f12;
            this.f57859c = pVar;
            this.f57860d = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.c(this.f57857a, this.f57858b, this.f57859c, iVar, this.f57860d | 1);
        }
    }

    static {
        f.a aVar = o1.f.f42062f1;
        float f11 = 24;
        f57815a = p0.u.l(aVar, x2.g.f(f11), BitmapDescriptorFactory.HUE_RED, x2.g.f(f11), BitmapDescriptorFactory.HUE_RED, 10, null);
        f57816b = p0.u.l(aVar, x2.g.f(f11), BitmapDescriptorFactory.HUE_RED, x2.g.f(f11), x2.g.f(28), 2, null);
        f57817c = x2.s.f(40);
        f57818d = x2.s.f(36);
        f57819e = x2.s.f(38);
    }

    public static final void a(p0.i iVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar2, c1.i iVar2, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(iVar, "<this>");
        c1.i h11 = iVar2.h(-1735756929);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(iVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(pVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(pVar2) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            o1.f a11 = iVar.a(o1.f.f42062f1, 1.0f, false);
            C1312a c1312a = C1312a.f57820a;
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a12 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(a11);
            if (!(h11.k() instanceof c1.e)) {
                c1.h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a12);
            } else {
                h11.o();
            }
            h11.E();
            c1.i a13 = a2.a(h11);
            a2.c(a13, c1312a, c0551a.d());
            a2.c(a13, dVar, c0551a.b());
            a2.c(a13, qVar, c0551a.c());
            a2.c(a13, y1Var, c0551a.f());
            h11.c();
            b11.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
            h11.x(2058660585);
            h11.x(-1160646213);
            h11.x(-1160646206);
            if (pVar != null) {
                o1.f b12 = f2.r.b(f57815a, MessageBundle.TITLE_ENTRY);
                a.C0826a c0826a = o1.a.f42039a;
                o1.f b13 = iVar.b(b12, c0826a.h());
                h11.x(-1990474327);
                f2.z i13 = p0.c.i(c0826a.k(), false, h11, 0);
                h11.x(1376089394);
                x2.d dVar2 = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar2 = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var2 = (y1) h11.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a14 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b14 = f2.u.b(b13);
                if (!(h11.k() instanceof c1.e)) {
                    c1.h.c();
                }
                h11.D();
                if (h11.f()) {
                    h11.s(a14);
                } else {
                    h11.o();
                }
                h11.E();
                c1.i a15 = a2.a(h11);
                a2.c(a15, i13, c0551a.d());
                a2.c(a15, dVar2, c0551a.b());
                a2.c(a15, qVar2, c0551a.c());
                a2.c(a15, y1Var2, c0551a.f());
                h11.c();
                b14.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
                h11.x(2058660585);
                h11.x(-1253629305);
                p0.d dVar3 = p0.d.f45270a;
                h11.x(-630329100);
                pVar.mo160invoke(h11, 0);
                h11.N();
                h11.N();
                h11.N();
                h11.q();
                h11.N();
                h11.N();
                vz.b0 b0Var = vz.b0.f54756a;
            }
            h11.N();
            if (pVar2 != null) {
                o1.f b15 = f2.r.b(f57816b, TextBundle.TEXT_ENTRY);
                a.C0826a c0826a2 = o1.a.f42039a;
                o1.f b16 = iVar.b(b15, c0826a2.h());
                h11.x(-1990474327);
                f2.z i14 = p0.c.i(c0826a2.k(), false, h11, 0);
                h11.x(1376089394);
                x2.d dVar4 = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
                x2.q qVar3 = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
                y1 y1Var3 = (y1) h11.A(androidx.compose.ui.platform.l0.m());
                h00.a<h2.a> a16 = c0551a.a();
                h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b17 = f2.u.b(b16);
                if (!(h11.k() instanceof c1.e)) {
                    c1.h.c();
                }
                h11.D();
                if (h11.f()) {
                    h11.s(a16);
                } else {
                    h11.o();
                }
                h11.E();
                c1.i a17 = a2.a(h11);
                a2.c(a17, i14, c0551a.d());
                a2.c(a17, dVar4, c0551a.b());
                a2.c(a17, qVar3, c0551a.c());
                a2.c(a17, y1Var3, c0551a.f());
                h11.c();
                b17.invoke(c1.g1.a(c1.g1.b(h11)), h11, 0);
                h11.x(2058660585);
                h11.x(-1253629305);
                p0.d dVar5 = p0.d.f45270a;
                h11.x(-630328933);
                pVar2.mo160invoke(h11, 0);
                h11.N();
                h11.N();
                h11.N();
                h11.q();
                h11.N();
                h11.N();
                vz.b0 b0Var2 = vz.b0.f54756a;
            }
            h11.N();
            h11.N();
            h11.q();
            h11.N();
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new b(iVar, pVar, pVar2, i11));
    }

    /* JADX WARN: Code restructure failed: missing block: B:97:0x0117, code lost:
        if ((r38 & 64) != 0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:122:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r27, o1.f r28, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r29, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r30, t1.c1 r31, long r32, long r34, c1.i r36, int r37, int r38) {
        /*
            Method dump skipped, instructions count: 431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: y0.a.b(h00.p, o1.f, h00.p, h00.p, t1.c1, long, long, c1.i, int, int):void");
    }

    public static final void c(float f11, float f12, h00.p<? super c1.i, ? super Integer, vz.b0> content, c1.i iVar, int i11) {
        int i12;
        kotlin.jvm.internal.s.g(content, "content");
        c1.i h11 = iVar.h(-489408515);
        if ((i11 & 14) == 0) {
            i12 = (h11.b(f11) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.b(f12) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(content) ? 256 : 128;
        }
        if (((i12 & 731) ^ 146) == 0 && h11.i()) {
            h11.G();
        } else {
            e eVar = new e(f11, f12);
            h11.x(1376089394);
            f.a aVar = o1.f.f42062f1;
            x2.d dVar = (x2.d) h11.A(androidx.compose.ui.platform.l0.d());
            x2.q qVar = (x2.q) h11.A(androidx.compose.ui.platform.l0.i());
            y1 y1Var = (y1) h11.A(androidx.compose.ui.platform.l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<c1.g1<h2.a>, c1.i, Integer, vz.b0> b11 = f2.u.b(aVar);
            int i13 = ((((i12 >> 6) & 14) << 9) & 7168) | 6;
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
            a2.c(a12, eVar, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(c1.g1.a(c1.g1.b(h11)), h11, Integer.valueOf((i13 >> 3) & 112));
            h11.x(2058660585);
            content.mo160invoke(h11, Integer.valueOf((i13 >> 9) & 14));
            h11.N();
            h11.q();
            h11.N();
        }
        c1.e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new f(f11, f12, content, i11));
    }
}