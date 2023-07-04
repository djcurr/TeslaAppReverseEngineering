package androidx.compose.ui.window;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.v1;
import c1.y;
import c1.z;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.m0;
import f2.z;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import l2.t;
import l2.v;
import vz.b0;
import wz.w;
import x2.q;

/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.compose.ui.window.a$a  reason: collision with other inner class name */
    /* loaded from: classes.dex */
    public static final class C0055a extends u implements h00.l<z, y> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f3212a;

        /* renamed from: androidx.compose.ui.window.a$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0056a implements y {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ h f3213a;

            public C0056a(h hVar) {
                this.f3213a = hVar;
            }

            @Override // c1.y
            public void dispose() {
                this.f3213a.dismiss();
                this.f3213a.b();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0055a(h hVar) {
            super(1);
            this.f3212a = hVar;
        }

        @Override // h00.l
        public final y mo12invoke(z DisposableEffect) {
            s.g(DisposableEffect, "$this$DisposableEffect");
            this.f3212a.show();
            return new C0056a(this.f3212a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends u implements h00.a<b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h f3214a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f3215b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f3216c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ q f3217d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h hVar, h00.a<b0> aVar, androidx.compose.ui.window.g gVar, q qVar) {
            super(0);
            this.f3214a = hVar;
            this.f3215b = aVar;
            this.f3216c = gVar;
            this.f3217d = qVar;
        }

        @Override // h00.a
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo11invoke() {
            invoke2();
            return b0.f54756a;
        }

        /* renamed from: invoke  reason: avoid collision after fix types in other method */
        public final void invoke2() {
            this.f3214a.f(this.f3215b, this.f3216c, this.f3217d);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ h00.a<b0> f3218a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.window.g f3219b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, b0> f3220c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3221d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ int f3222e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(h00.a<b0> aVar, androidx.compose.ui.window.g gVar, h00.p<? super c1.i, ? super Integer, b0> pVar, int i11, int i12) {
            super(2);
            this.f3218a = aVar;
            this.f3219b = gVar;
            this.f3220c = pVar;
            this.f3221d = i11;
            this.f3222e = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.a(this.f3218a, this.f3219b, this.f3220c, iVar, this.f3221d | 1, this.f3222e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends u implements h00.p<c1.i, Integer, b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ v1<h00.p<c1.i, Integer, b0>> f3223a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: androidx.compose.ui.window.a$d$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        public static final class C0057a extends u implements h00.l<v, b0> {

            /* renamed from: a  reason: collision with root package name */
            public static final C0057a f3224a = new C0057a();

            C0057a() {
                super(1);
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(v vVar) {
                invoke2(vVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(v semantics) {
                s.g(semantics, "$this$semantics");
                t.h(semantics);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes.dex */
        public static final class b extends u implements h00.p<c1.i, Integer, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ v1<h00.p<c1.i, Integer, b0>> f3225a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(v1<? extends h00.p<? super c1.i, ? super Integer, b0>> v1Var) {
                super(2);
                this.f3225a = v1Var;
            }

            @Override // h00.p
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
                invoke(iVar, num.intValue());
                return b0.f54756a;
            }

            public final void invoke(c1.i iVar, int i11) {
                if (((i11 & 11) ^ 2) == 0 && iVar.i()) {
                    iVar.G();
                } else {
                    a.b(this.f3225a).mo160invoke(iVar, 0);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(v1<? extends h00.p<? super c1.i, ? super Integer, b0>> v1Var) {
            super(2);
            this.f3223a = v1Var;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            if (((i11 & 11) ^ 2) != 0 || !iVar.i()) {
                a.c(l2.o.b(o1.f.f42062f1, false, C0057a.f3224a, 1, null), j1.c.b(iVar, -819888186, true, new b(this.f3223a)), iVar, 48, 0);
            } else {
                iVar.G();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class e extends u implements h00.a<UUID> {

        /* renamed from: a  reason: collision with root package name */
        public static final e f3226a = new e();

        e() {
            super(0);
        }

        @Override // h00.a
        /* renamed from: a */
        public final UUID mo11invoke() {
            return UUID.randomUUID();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class f implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        public static final f f3227a = new f();

        /* renamed from: androidx.compose.ui.window.a$f$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0058a extends u implements h00.l<m0.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<m0> f3228a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0058a(List<? extends m0> list) {
                super(1);
                this.f3228a = list;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(m0.a aVar) {
                invoke2(aVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                s.g(layout, "$this$layout");
                List<m0> list = this.f3228a;
                int size = list.size();
                for (int i11 = 0; i11 < size; i11++) {
                    m0.a.n(layout, list.get(i11), 0, 0, BitmapDescriptorFactory.HUE_RED, 4, null);
                }
            }
        }

        f() {
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final a0 b(f2.b0 Layout, List<? extends f2.y> measurables, long j11) {
            Object obj;
            int k11;
            Object obj2;
            int k12;
            s.g(Layout, "$this$Layout");
            s.g(measurables, "measurables");
            ArrayList arrayList = new ArrayList(measurables.size());
            int size = measurables.size();
            for (int i11 = 0; i11 < size; i11++) {
                arrayList.add(measurables.get(i11).X(j11));
            }
            int i12 = 1;
            if (arrayList.isEmpty()) {
                obj = null;
            } else {
                obj = arrayList.get(0);
                int B0 = ((m0) obj).B0();
                k11 = w.k(arrayList);
                if (1 <= k11) {
                    int i13 = 1;
                    while (true) {
                        int i14 = i13 + 1;
                        Object obj3 = arrayList.get(i13);
                        int B02 = ((m0) obj3).B0();
                        if (B0 < B02) {
                            obj = obj3;
                            B0 = B02;
                        }
                        if (i13 == k11) {
                            break;
                        }
                        i13 = i14;
                    }
                }
            }
            m0 m0Var = (m0) obj;
            Integer valueOf = m0Var == null ? null : Integer.valueOf(m0Var.B0());
            int p11 = valueOf == null ? x2.b.p(j11) : valueOf.intValue();
            if (arrayList.isEmpty()) {
                obj2 = null;
            } else {
                obj2 = arrayList.get(0);
                int w02 = ((m0) obj2).w0();
                k12 = w.k(arrayList);
                if (1 <= k12) {
                    while (true) {
                        int i15 = i12 + 1;
                        Object obj4 = arrayList.get(i12);
                        int w03 = ((m0) obj4).w0();
                        if (w02 < w03) {
                            obj2 = obj4;
                            w02 = w03;
                        }
                        if (i12 == k12) {
                            break;
                        }
                        i12 = i15;
                    }
                }
            }
            m0 m0Var2 = (m0) obj2;
            Integer valueOf2 = m0Var2 != null ? Integer.valueOf(m0Var2.w0()) : null;
            return b0.a.b(Layout, p11, valueOf2 == null ? x2.b.o(j11) : valueOf2.intValue(), null, new C0058a(arrayList), 4, null);
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
    public static final class g extends u implements h00.p<c1.i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f3229a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ h00.p<c1.i, Integer, vz.b0> f3230b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ int f3231c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ int f3232d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        g(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f3229a = fVar;
            this.f3230b = pVar;
            this.f3231c = i11;
            this.f3232d = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(c1.i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(c1.i iVar, int i11) {
            a.c(this.f3229a, this.f3230b, iVar, this.f3231c | 1, this.f3232d);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0089, code lost:
        if ((r24 & 2) != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(h00.a<vz.b0> r19, androidx.compose.ui.window.g r20, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r21, c1.i r22, int r23, int r24) {
        /*
            Method dump skipped, instructions count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.a.a(h00.a, androidx.compose.ui.window.g, h00.p, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.p<c1.i, Integer, vz.b0> b(v1<? extends h00.p<? super c1.i, ? super Integer, vz.b0>> v1Var) {
        return (h00.p) v1Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(o1.f fVar, h00.p<? super c1.i, ? super Integer, vz.b0> pVar, c1.i iVar, int i11, int i12) {
        int i13;
        c1.i h11 = iVar.h(2018494685);
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
            i13 |= h11.O(pVar) ? 32 : 16;
        }
        if (((i13 & 91) ^ 18) == 0 && h11.i()) {
            h11.G();
        } else {
            if (i14 != 0) {
                fVar = o1.f.f42062f1;
            }
            f fVar2 = f.f3227a;
            h11.x(1376089394);
            x2.d dVar = (x2.d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
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
            a2.c(a12, fVar2, c0551a.d());
            a2.c(a12, dVar, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i15 >> 3) & 112));
            h11.x(2058660585);
            pVar.mo160invoke(h11, Integer.valueOf((i15 >> 9) & 14));
            h11.N();
            h11.q();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new g(fVar, pVar, i11, i12));
    }
}