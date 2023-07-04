package kh;

import androidx.compose.ui.platform.l0;
import androidx.compose.ui.platform.y1;
import c1.a2;
import c1.e1;
import c1.g1;
import c1.h;
import c1.i;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.a0;
import f2.b0;
import f2.j;
import f2.m0;
import f2.y;
import f2.z;
import h00.l;
import h2.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p0.a;
import vz.b0;
import wz.e0;
import wz.w;
import x2.k;
import x2.o;
import x2.p;
import x2.q;

/* loaded from: classes3.dex */
public final class b {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class a implements z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ kh.c f34611a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f34612b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f34613c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34614d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ d f34615e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ d f34616f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ kh.a f34617g;

        /* renamed from: kh.b$a$a  reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        static final class C0644a extends u implements l<m0.a, b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<List<m0>> f34618a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ f2.b0 f34619b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ float f34620c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ d f34621d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ d f34622e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ kh.c f34623f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ int f34624g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ kh.a f34625h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ List<Integer> f34626i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ List<Integer> f34627j;

            /* renamed from: kh.b$a$a$a  reason: collision with other inner class name */
            /* loaded from: classes3.dex */
            public /* synthetic */ class C0645a {

                /* renamed from: a  reason: collision with root package name */
                public static final /* synthetic */ int[] f34628a;

                static {
                    int[] iArr = new int[kh.a.values().length];
                    iArr[kh.a.Start.ordinal()] = 1;
                    iArr[kh.a.End.ordinal()] = 2;
                    iArr[kh.a.Center.ordinal()] = 3;
                    f34628a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0644a(List<List<m0>> list, f2.b0 b0Var, float f11, d dVar, d dVar2, kh.c cVar, int i11, kh.a aVar, List<Integer> list2, List<Integer> list3) {
                super(1);
                this.f34618a = list;
                this.f34619b = b0Var;
                this.f34620c = f11;
                this.f34621d = dVar;
                this.f34622e = dVar2;
                this.f34623f = cVar;
                this.f34624g = i11;
                this.f34625h = aVar;
                this.f34626i = list2;
                this.f34627j = list3;
            }

            @Override // h00.l
            /* renamed from: invoke */
            public /* bridge */ /* synthetic */ b0 mo12invoke(m0.a aVar) {
                invoke2(aVar);
                return b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                int k11;
                a.k arrangement$flowlayout_release;
                boolean z11;
                int i11;
                kh.a aVar;
                List<Integer> list;
                int i12;
                List<Integer> list2;
                int k12;
                s.g(layout, "$this$layout");
                List<List<m0>> list3 = this.f34618a;
                f2.b0 b0Var = this.f34619b;
                float f11 = this.f34620c;
                d dVar = this.f34621d;
                d dVar2 = this.f34622e;
                kh.c cVar = this.f34623f;
                int i13 = this.f34624g;
                kh.a aVar2 = this.f34625h;
                List<Integer> list4 = this.f34626i;
                List<Integer> list5 = this.f34627j;
                int i14 = 0;
                for (Object obj : list3) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        w.s();
                    }
                    List list6 = (List) obj;
                    int size = list6.size();
                    int[] iArr = new int[size];
                    int i16 = 0;
                    while (i16 < size) {
                        int d11 = b.d((m0) list6.get(i16), cVar);
                        List<Integer> list7 = list5;
                        k12 = w.k(list6);
                        iArr[i16] = d11 + (i16 < k12 ? b0Var.G(f11) : 0);
                        i16++;
                        list5 = list7;
                    }
                    List<Integer> list8 = list5;
                    k11 = w.k(list3);
                    if (i14 < k11) {
                        arrangement$flowlayout_release = dVar.getArrangement$flowlayout_release();
                    } else {
                        arrangement$flowlayout_release = dVar2.getArrangement$flowlayout_release();
                    }
                    int[] iArr2 = new int[size];
                    for (int i17 = 0; i17 < size; i17++) {
                        iArr2[i17] = 0;
                    }
                    arrangement$flowlayout_release.b(b0Var, i13, iArr, iArr2);
                    int i18 = 0;
                    for (Object obj2 : list6) {
                        int i19 = i18 + 1;
                        if (i18 < 0) {
                            w.s();
                        }
                        m0 m0Var = (m0) obj2;
                        int i21 = C0645a.f34628a[aVar2.ordinal()];
                        if (i21 == 1) {
                            z11 = false;
                            i11 = 0;
                        } else if (i21 == 2) {
                            z11 = false;
                            i11 = list4.get(i14).intValue() - b.c(m0Var, cVar);
                        } else if (i21 != 3) {
                            throw new NoWhenBranchMatchedException();
                        } else {
                            z11 = false;
                            i11 = k.i(o1.a.f42039a.d().a(o.f56954b.a(), p.a(0, list4.get(i14).intValue() - b.c(m0Var, cVar)), q.Ltr));
                        }
                        if (cVar == kh.c.Horizontal) {
                            int i22 = iArr2[i18];
                            List<Integer> list9 = list8;
                            list = list4;
                            aVar = aVar2;
                            m0.a.j(layout, m0Var, i22, list9.get(i14).intValue() + i11, BitmapDescriptorFactory.HUE_RED, 4, null);
                            i12 = i14;
                            list2 = list9;
                        } else {
                            aVar = aVar2;
                            List<Integer> list10 = list8;
                            list = list4;
                            int i23 = i14;
                            i12 = i23;
                            list2 = list10;
                            m0.a.j(layout, m0Var, list10.get(i23).intValue() + i11, iArr2[i18], BitmapDescriptorFactory.HUE_RED, 4, null);
                        }
                        list4 = list;
                        i18 = i19;
                        aVar2 = aVar;
                        i14 = i12;
                        list8 = list2;
                    }
                    i14 = i15;
                    list5 = list8;
                }
            }
        }

        a(kh.c cVar, float f11, f fVar, float f12, d dVar, d dVar2, kh.a aVar) {
            this.f34611a = cVar;
            this.f34612b = f11;
            this.f34613c = fVar;
            this.f34614d = f12;
            this.f34615e = dVar;
            this.f34616f = dVar2;
            this.f34617g = aVar;
        }

        private static final boolean f(List<m0> list, j0 j0Var, f2.b0 b0Var, float f11, e eVar, kh.c cVar, m0 m0Var) {
            return list.isEmpty() || (j0Var.f34912a + b0Var.G(f11)) + b.d(m0Var, cVar) <= eVar.b();
        }

        private static final void g(List<List<m0>> list, j0 j0Var, f2.b0 b0Var, float f11, List<m0> list2, List<Integer> list3, j0 j0Var2, List<Integer> list4, j0 j0Var3, j0 j0Var4) {
            List<m0> O0;
            if (!list.isEmpty()) {
                j0Var.f34912a += b0Var.G(f11);
            }
            O0 = e0.O0(list2);
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
        public int a(f2.k kVar, List<? extends j> list, int i11) {
            return z.a.d(this, kVar, list, i11);
        }

        @Override // f2.z
        public final a0 b(f2.b0 Layout, List<? extends y> measurables, long j11) {
            long b11;
            int max;
            j0 j0Var;
            ArrayList arrayList;
            j0 j0Var2;
            s.g(Layout, "$this$Layout");
            s.g(measurables, "measurables");
            ArrayList arrayList2 = new ArrayList();
            ArrayList arrayList3 = new ArrayList();
            ArrayList arrayList4 = new ArrayList();
            j0 j0Var3 = new j0();
            j0 j0Var4 = new j0();
            ArrayList arrayList5 = new ArrayList();
            j0 j0Var5 = new j0();
            j0 j0Var6 = new j0();
            e eVar = new e(j11, this.f34611a, null);
            if (this.f34611a == kh.c.Horizontal) {
                b11 = x2.c.b(0, eVar.b(), 0, 0, 13, null);
            } else {
                b11 = x2.c.b(0, 0, 0, eVar.b(), 7, null);
            }
            long j12 = b11;
            for (y yVar : measurables) {
                m0 X = yVar.X(j12);
                long j13 = j12;
                e eVar2 = eVar;
                j0 j0Var7 = j0Var6;
                if (f(arrayList5, j0Var5, Layout, this.f34612b, eVar, this.f34611a, X)) {
                    j0Var = j0Var5;
                    arrayList = arrayList5;
                    j0Var2 = j0Var4;
                } else {
                    j0Var = j0Var5;
                    arrayList = arrayList5;
                    j0Var2 = j0Var4;
                    g(arrayList2, j0Var4, Layout, this.f34614d, arrayList5, arrayList3, j0Var7, arrayList4, j0Var3, j0Var);
                }
                j0 j0Var8 = j0Var;
                if (!arrayList.isEmpty()) {
                    j0Var8.f34912a += Layout.G(this.f34612b);
                }
                ArrayList arrayList6 = arrayList;
                arrayList6.add(X);
                j0Var8.f34912a += b.d(X, this.f34611a);
                j0Var6 = j0Var7;
                j0Var6.f34912a = Math.max(j0Var6.f34912a, b.c(X, this.f34611a));
                arrayList5 = arrayList6;
                j0Var5 = j0Var8;
                eVar = eVar2;
                j12 = j13;
                j0Var4 = j0Var2;
            }
            e eVar3 = eVar;
            ArrayList arrayList7 = arrayList5;
            j0 j0Var9 = j0Var4;
            j0 j0Var10 = j0Var5;
            if (!arrayList7.isEmpty()) {
                g(arrayList2, j0Var9, Layout, this.f34614d, arrayList7, arrayList3, j0Var6, arrayList4, j0Var3, j0Var10);
            }
            if (eVar3.b() != Integer.MAX_VALUE && this.f34613c == f.Expand) {
                max = eVar3.b();
            } else {
                max = Math.max(j0Var3.f34912a, eVar3.c());
            }
            int i11 = max;
            int max2 = Math.max(j0Var9.f34912a, eVar3.a());
            kh.c cVar = this.f34611a;
            kh.c cVar2 = kh.c.Horizontal;
            return b0.a.b(Layout, cVar == cVar2 ? i11 : max2, cVar == cVar2 ? max2 : i11, null, new C0644a(arrayList2, Layout, this.f34612b, this.f34615e, this.f34616f, cVar, i11, this.f34617g, arrayList3, arrayList4), 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends j> list, int i11) {
            return z.a.b(this, kVar, list, i11);
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends j> list, int i11) {
            return z.a.a(this, kVar, list, i11);
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends j> list, int i11) {
            return z.a.c(this, kVar, list, i11);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: kh.b$b  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public static final class C0646b extends u implements h00.p<i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f34629a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ kh.c f34630b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f f34631c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ d f34632d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ float f34633e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ kh.a f34634f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ float f34635g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ d f34636h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ h00.p<i, Integer, vz.b0> f34637i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34638j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0646b(o1.f fVar, kh.c cVar, f fVar2, d dVar, float f11, kh.a aVar, float f12, d dVar2, h00.p<? super i, ? super Integer, vz.b0> pVar, int i11) {
            super(2);
            this.f34629a = fVar;
            this.f34630b = cVar;
            this.f34631c = fVar2;
            this.f34632d = dVar;
            this.f34633e = f11;
            this.f34634f = aVar;
            this.f34635g = f12;
            this.f34636h = dVar2;
            this.f34637i = pVar;
            this.f34638j = i11;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            b.a(this.f34629a, this.f34630b, this.f34631c, this.f34632d, this.f34633e, this.f34634f, this.f34635g, this.f34636h, this.f34637i, iVar, this.f34638j | 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static final class c extends u implements h00.p<i, Integer, vz.b0> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ o1.f f34639a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f f34640b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ d f34641c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ float f34642d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ kh.a f34643e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ float f34644f;

        /* renamed from: g  reason: collision with root package name */
        final /* synthetic */ d f34645g;

        /* renamed from: h  reason: collision with root package name */
        final /* synthetic */ h00.p<i, Integer, vz.b0> f34646h;

        /* renamed from: i  reason: collision with root package name */
        final /* synthetic */ int f34647i;

        /* renamed from: j  reason: collision with root package name */
        final /* synthetic */ int f34648j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(o1.f fVar, f fVar2, d dVar, float f11, kh.a aVar, float f12, d dVar2, h00.p<? super i, ? super Integer, vz.b0> pVar, int i11, int i12) {
            super(2);
            this.f34639a = fVar;
            this.f34640b = fVar2;
            this.f34641c = dVar;
            this.f34642d = f11;
            this.f34643e = aVar;
            this.f34644f = f12;
            this.f34645g = dVar2;
            this.f34646h = pVar;
            this.f34647i = i11;
            this.f34648j = i12;
        }

        @Override // h00.p
        /* renamed from: invoke */
        public /* bridge */ /* synthetic */ vz.b0 mo160invoke(i iVar, Integer num) {
            invoke(iVar, num.intValue());
            return vz.b0.f54756a;
        }

        public final void invoke(i iVar, int i11) {
            b.b(this.f34639a, this.f34640b, this.f34641c, this.f34642d, this.f34643e, this.f34644f, this.f34645g, this.f34646h, iVar, this.f34647i | 1, this.f34648j);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(o1.f fVar, kh.c cVar, f fVar2, d dVar, float f11, kh.a aVar, float f12, d dVar2, h00.p<? super i, ? super Integer, vz.b0> pVar, i iVar, int i11) {
        int i12;
        i h11 = iVar.h(1107216104);
        if ((i11 & 14) == 0) {
            i12 = (h11.O(fVar) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 112) == 0) {
            i12 |= h11.O(cVar) ? 32 : 16;
        }
        if ((i11 & 896) == 0) {
            i12 |= h11.O(fVar2) ? 256 : 128;
        }
        if ((i11 & 7168) == 0) {
            i12 |= h11.O(dVar) ? 2048 : 1024;
        }
        if ((57344 & i11) == 0) {
            i12 |= h11.b(f11) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((458752 & i11) == 0) {
            i12 |= h11.O(aVar) ? 131072 : 65536;
        }
        if ((3670016 & i11) == 0) {
            i12 |= h11.b(f12) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((29360128 & i11) == 0) {
            i12 |= h11.O(dVar2) ? 8388608 : 4194304;
        }
        if ((234881024 & i11) == 0) {
            i12 |= h11.O(pVar) ? 67108864 : 33554432;
        }
        if (((191739611 & i12) ^ 38347922) == 0 && h11.i()) {
            h11.G();
        } else {
            a aVar2 = new a(cVar, f11, fVar2, f12, dVar, dVar2, aVar);
            h11.x(1376089394);
            x2.d dVar3 = (x2.d) h11.A(l0.d());
            q qVar = (q) h11.A(l0.i());
            y1 y1Var = (y1) h11.A(l0.m());
            a.C0551a c0551a = h2.a.Y0;
            h00.a<h2.a> a11 = c0551a.a();
            h00.q<g1<h2.a>, i, Integer, vz.b0> b11 = f2.u.b(fVar);
            int i13 = (((((i12 << 3) & 112) | ((i12 >> 24) & 14)) << 9) & 7168) | 6;
            if (!(h11.k() instanceof c1.e)) {
                h.c();
            }
            h11.D();
            if (h11.f()) {
                h11.s(a11);
            } else {
                h11.o();
            }
            h11.E();
            i a12 = a2.a(h11);
            a2.c(a12, aVar2, c0551a.d());
            a2.c(a12, dVar3, c0551a.b());
            a2.c(a12, qVar, c0551a.c());
            a2.c(a12, y1Var, c0551a.f());
            h11.c();
            b11.invoke(g1.a(g1.b(h11)), h11, Integer.valueOf((i13 >> 3) & 112));
            h11.x(2058660585);
            pVar.mo160invoke(h11, Integer.valueOf((i13 >> 9) & 14));
            h11.N();
            h11.q();
            h11.N();
        }
        e1 l11 = h11.l();
        if (l11 == null) {
            return;
        }
        l11.a(new C0646b(fVar, cVar, fVar2, dVar, f11, aVar, f12, dVar2, pVar, i11));
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void b(o1.f r25, kh.f r26, kh.d r27, float r28, kh.a r29, float r30, kh.d r31, h00.p<? super c1.i, ? super java.lang.Integer, vz.b0> r32, c1.i r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kh.b.b(o1.f, kh.f, kh.d, float, kh.a, float, kh.d, h00.p, c1.i, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int c(m0 m0Var, kh.c cVar) {
        return cVar == kh.c.Horizontal ? m0Var.w0() : m0Var.B0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int d(m0 m0Var, kh.c cVar) {
        return cVar == kh.c.Horizontal ? m0Var.B0() : m0Var.w0();
    }
}