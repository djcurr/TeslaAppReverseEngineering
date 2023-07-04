package p0;

import androidx.compose.foundation.layout.RowColumnParentData;
import androidx.compose.ui.layout.Placeable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import f2.b0;
import f2.m0;
import java.util.List;

/* loaded from: classes.dex */
public final class z {

    /* loaded from: classes.dex */
    public static final class a implements f2.z {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ p f45434a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ float f45435b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ f0 f45436c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ h00.s<Integer, int[], x2.q, x2.d, int[], vz.b0> f45437d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ k f45438e;

        /* renamed from: p0.z$a$a  reason: collision with other inner class name */
        /* loaded from: classes.dex */
        static final class C0969a extends kotlin.jvm.internal.u implements h00.l<m0.a, vz.b0> {

            /* renamed from: a  reason: collision with root package name */
            final /* synthetic */ List<f2.y> f45439a;

            /* renamed from: b  reason: collision with root package name */
            final /* synthetic */ m0[] f45440b;

            /* renamed from: c  reason: collision with root package name */
            final /* synthetic */ h00.s<Integer, int[], x2.q, x2.d, int[], vz.b0> f45441c;

            /* renamed from: d  reason: collision with root package name */
            final /* synthetic */ int f45442d;

            /* renamed from: e  reason: collision with root package name */
            final /* synthetic */ f2.b0 f45443e;

            /* renamed from: f  reason: collision with root package name */
            final /* synthetic */ int[] f45444f;

            /* renamed from: g  reason: collision with root package name */
            final /* synthetic */ p f45445g;

            /* renamed from: h  reason: collision with root package name */
            final /* synthetic */ a0[] f45446h;

            /* renamed from: i  reason: collision with root package name */
            final /* synthetic */ k f45447i;

            /* renamed from: j  reason: collision with root package name */
            final /* synthetic */ int f45448j;

            /* renamed from: k  reason: collision with root package name */
            final /* synthetic */ kotlin.jvm.internal.j0 f45449k;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0969a(List<? extends f2.y> list, Placeable[] placeableArr, h00.s<? super Integer, ? super int[], ? super x2.q, ? super x2.d, ? super int[], vz.b0> sVar, int i11, f2.b0 b0Var, int[] iArr, p pVar, RowColumnParentData[] rowColumnParentDataArr, k kVar, int i12, kotlin.jvm.internal.j0 j0Var) {
                super(1);
                this.f45439a = list;
                this.f45440b = placeableArr;
                this.f45441c = sVar;
                this.f45442d = i11;
                this.f45443e = b0Var;
                this.f45444f = iArr;
                this.f45445g = pVar;
                this.f45446h = rowColumnParentDataArr;
                this.f45447i = kVar;
                this.f45448j = i12;
                this.f45449k = j0Var;
            }

            @Override // h00.l
            public /* bridge */ /* synthetic */ vz.b0 invoke(m0.a aVar) {
                invoke2(aVar);
                return vz.b0.f54756a;
            }

            /* renamed from: invoke  reason: avoid collision after fix types in other method */
            public final void invoke2(m0.a layout) {
                x2.q layoutDirection;
                int i11;
                int[] iArr;
                kotlin.jvm.internal.s.g(layout, "$this$layout");
                int size = this.f45439a.size();
                int[] iArr2 = new int[size];
                int i12 = 0;
                for (int i13 = 0; i13 < size; i13++) {
                    m0 m0Var = this.f45440b[i13];
                    kotlin.jvm.internal.s.e(m0Var);
                    iArr2[i13] = z.A(m0Var, this.f45445g);
                }
                this.f45441c.invoke(Integer.valueOf(this.f45442d), iArr2, this.f45443e.getLayoutDirection(), this.f45443e, this.f45444f);
                m0[] m0VarArr = this.f45440b;
                a0[] a0VarArr = this.f45446h;
                k kVar = this.f45447i;
                int i14 = this.f45448j;
                p pVar = this.f45445g;
                f2.b0 b0Var = this.f45443e;
                kotlin.jvm.internal.j0 j0Var = this.f45449k;
                int[] iArr3 = this.f45444f;
                int length = m0VarArr.length;
                int i15 = 0;
                while (i12 < length) {
                    m0 m0Var2 = m0VarArr[i12];
                    int i16 = i12 + 1;
                    int i17 = i15 + 1;
                    kotlin.jvm.internal.s.e(m0Var2);
                    k q11 = z.q(a0VarArr[i15]);
                    if (q11 == null) {
                        q11 = kVar;
                    }
                    int z11 = i14 - z.z(m0Var2, pVar);
                    p pVar2 = p.Horizontal;
                    if (pVar == pVar2) {
                        layoutDirection = x2.q.Ltr;
                    } else {
                        layoutDirection = b0Var.getLayoutDirection();
                    }
                    x2.q qVar = layoutDirection;
                    m0[] m0VarArr2 = m0VarArr;
                    int a11 = q11.a(z11, qVar, m0Var2, j0Var.f34912a);
                    if (pVar == pVar2) {
                        i11 = length;
                        iArr = iArr3;
                        m0.a.j(layout, m0Var2, iArr3[i15], a11, BitmapDescriptorFactory.HUE_RED, 4, null);
                    } else {
                        i11 = length;
                        iArr = iArr3;
                        m0.a.j(layout, m0Var2, a11, iArr[i15], BitmapDescriptorFactory.HUE_RED, 4, null);
                    }
                    iArr3 = iArr;
                    i12 = i16;
                    i15 = i17;
                    m0VarArr = m0VarArr2;
                    length = i11;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        a(p pVar, float f11, f0 f0Var, h00.s<? super Integer, ? super int[], ? super x2.q, ? super x2.d, ? super int[], vz.b0> sVar, k kVar) {
            this.f45434a = pVar;
            this.f45435b = f11;
            this.f45436c = f0Var;
            this.f45437d = sVar;
            this.f45438e = kVar;
        }

        @Override // f2.z
        public int a(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return ((Number) z.d(this.f45434a).invoke(measurables, Integer.valueOf(i11), Integer.valueOf(kVar.G(this.f45435b)))).intValue();
        }

        @Override // f2.z
        public f2.a0 b(f2.b0 receiver, List<? extends f2.y> list, long j11) {
            int f11;
            int i11;
            int i12;
            int a11;
            int c11;
            int i13;
            int i14;
            int c12;
            int i15;
            int max;
            List<? extends f2.y> measurables = list;
            kotlin.jvm.internal.s.g(receiver, "$receiver");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            t tVar = new t(j11, this.f45434a, null);
            int G = receiver.G(this.f45435b);
            int size = list.size();
            m0[] m0VarArr = new m0[size];
            int size2 = list.size();
            a0[] a0VarArr = new a0[size2];
            for (int i16 = 0; i16 < size2; i16++) {
                a0VarArr[i16] = z.r(measurables.get(i16));
            }
            int size3 = list.size();
            int i17 = 0;
            int i18 = 0;
            int i19 = 0;
            int i21 = 0;
            int i22 = 0;
            boolean z11 = false;
            float f12 = 0.0f;
            while (true) {
                if (i19 >= size3) {
                    break;
                }
                int i23 = i19 + 1;
                f2.y yVar = measurables.get(i19);
                a0 a0Var = a0VarArr[i19];
                float t11 = z.t(a0Var);
                if (t11 > BitmapDescriptorFactory.HUE_RED) {
                    f12 += t11;
                    i21++;
                    i19 = i23;
                } else {
                    int e11 = tVar.e();
                    int i24 = i19;
                    int i25 = size3;
                    a0[] a0VarArr2 = a0VarArr;
                    m0 X = yVar.X(t.b(tVar, 0, e11 != Integer.MAX_VALUE ? e11 - i22 : Integer.MAX_VALUE, 0, 0, 8, null).g(this.f45434a));
                    int min = Math.min(G, (e11 - i22) - z.A(X, this.f45434a));
                    i22 += z.A(X, this.f45434a) + min;
                    i18 = Math.max(i18, z.z(X, this.f45434a));
                    z11 = z11 || z.x(a0Var);
                    m0VarArr[i24] = X;
                    i17 = min;
                    i19 = i23;
                    size3 = i25;
                    a0VarArr = a0VarArr2;
                }
            }
            int i26 = i18;
            a0[] a0VarArr3 = a0VarArr;
            if (i21 == 0) {
                i22 -= i17;
                i11 = i26;
                i12 = 0;
            } else {
                int i27 = (f12 > BitmapDescriptorFactory.HUE_RED ? 1 : (f12 == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                if (i27 > 0 && tVar.e() != Integer.MAX_VALUE) {
                    f11 = tVar.e();
                } else {
                    f11 = tVar.f();
                }
                int i28 = G * (i21 - 1);
                int i29 = (f11 - i22) - i28;
                float f13 = i27 > 0 ? i29 / f12 : 0.0f;
                int i31 = 0;
                int i32 = 0;
                while (i31 < size2) {
                    a0 a0Var2 = a0VarArr3[i31];
                    i31++;
                    c12 = j00.c.c(z.t(a0Var2) * f13);
                    i32 += c12;
                }
                int size4 = list.size();
                int i33 = i29 - i32;
                i11 = i26;
                int i34 = 0;
                int i35 = 0;
                while (i34 < size4) {
                    int i36 = i34 + 1;
                    if (m0VarArr[i34] == null) {
                        f2.y yVar2 = measurables.get(i34);
                        a0 a0Var3 = a0VarArr3[i34];
                        float t12 = z.t(a0Var3);
                        if (t12 > BitmapDescriptorFactory.HUE_RED) {
                            a11 = j00.c.a(i33);
                            int i37 = i33 - a11;
                            c11 = j00.c.c(t12 * f13);
                            int max2 = Math.max(0, c11 + a11);
                            float f14 = f13;
                            if (!z.s(a0Var3) || max2 == Integer.MAX_VALUE) {
                                i13 = size4;
                                i14 = 0;
                            } else {
                                i14 = max2;
                                i13 = size4;
                            }
                            m0 X2 = yVar2.X(new t(i14, max2, 0, tVar.c()).g(this.f45434a));
                            i35 += z.A(X2, this.f45434a);
                            i11 = Math.max(i11, z.z(X2, this.f45434a));
                            z11 = z11 || z.x(a0Var3);
                            m0VarArr[i34] = X2;
                            measurables = list;
                            f13 = f14;
                            i34 = i36;
                            size4 = i13;
                            i33 = i37;
                        } else {
                            throw new IllegalStateException("All weights <= 0 should have placeables".toString());
                        }
                    } else {
                        measurables = list;
                        i34 = i36;
                    }
                }
                i12 = m00.l.i(i35 + i28, tVar.e() - i22);
            }
            kotlin.jvm.internal.j0 j0Var = new kotlin.jvm.internal.j0();
            if (z11) {
                int i38 = 0;
                i15 = 0;
                while (i38 < size) {
                    int i39 = i38 + 1;
                    m0 m0Var = m0VarArr[i38];
                    kotlin.jvm.internal.s.e(m0Var);
                    k q11 = z.q(a0VarArr3[i38]);
                    Integer b11 = q11 == null ? null : q11.b(m0Var);
                    if (b11 != null) {
                        int i41 = j0Var.f34912a;
                        int intValue = b11.intValue();
                        if (intValue == Integer.MIN_VALUE) {
                            intValue = 0;
                        }
                        j0Var.f34912a = Math.max(i41, intValue);
                        int z12 = z.z(m0Var, this.f45434a);
                        p pVar = this.f45434a;
                        int intValue2 = b11.intValue();
                        if (intValue2 == Integer.MIN_VALUE) {
                            intValue2 = z.z(m0Var, pVar);
                        }
                        i15 = Math.max(i15, z12 - intValue2);
                    }
                    i38 = i39;
                }
            } else {
                i15 = 0;
            }
            int max3 = Math.max(i22 + i12, tVar.f());
            if (tVar.c() != Integer.MAX_VALUE && this.f45436c == f0.Expand) {
                max = tVar.c();
            } else {
                max = Math.max(i11, Math.max(tVar.d(), j0Var.f34912a + i15));
            }
            int i42 = max;
            p pVar2 = this.f45434a;
            p pVar3 = p.Horizontal;
            int i43 = pVar2 == pVar3 ? max3 : i42;
            int i44 = pVar2 == pVar3 ? i42 : max3;
            int size5 = list.size();
            int[] iArr = new int[size5];
            for (int i45 = 0; i45 < size5; i45++) {
                iArr[i45] = 0;
            }
            return b0.a.b(receiver, i43, i44, null, new C0969a(list, m0VarArr, this.f45437d, max3, receiver, iArr, this.f45434a, a0VarArr3, this.f45438e, i42, j0Var), 4, null);
        }

        @Override // f2.z
        public int c(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return ((Number) z.b(this.f45434a).invoke(measurables, Integer.valueOf(i11), Integer.valueOf(kVar.G(this.f45435b)))).intValue();
        }

        @Override // f2.z
        public int d(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return ((Number) z.a(this.f45434a).invoke(measurables, Integer.valueOf(i11), Integer.valueOf(kVar.G(this.f45435b)))).intValue();
        }

        @Override // f2.z
        public int e(f2.k kVar, List<? extends f2.j> measurables, int i11) {
            kotlin.jvm.internal.s.g(kVar, "<this>");
            kotlin.jvm.internal.s.g(measurables, "measurables");
            return ((Number) z.c(this.f45434a).invoke(measurables, Integer.valueOf(i11), Integer.valueOf(kVar.G(this.f45435b)))).intValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int A(m0 m0Var, p pVar) {
        return pVar == p.Horizontal ? m0Var.B0() : m0Var.w0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.q<List<? extends f2.j>, Integer, Integer, Integer> a(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f45365a.a();
        }
        return o.f45365a.e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.q<List<? extends f2.j>, Integer, Integer, Integer> b(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f45365a.b();
        }
        return o.f45365a.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.q<List<? extends f2.j>, Integer, Integer, Integer> c(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f45365a.c();
        }
        return o.f45365a.g();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h00.q<List<? extends f2.j>, Integer, Integer, Integer> d(p pVar) {
        if (pVar == p.Horizontal) {
            return o.f45365a.d();
        }
        return o.f45365a.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k q(a0 a0Var) {
        if (a0Var == null) {
            return null;
        }
        return a0Var.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final a0 r(f2.j jVar) {
        Object t11 = jVar.t();
        if (t11 instanceof a0) {
            return (a0) t11;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean s(a0 a0Var) {
        if (a0Var == null) {
            return true;
        }
        return a0Var.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float t(a0 a0Var) {
        return a0Var == null ? BitmapDescriptorFactory.HUE_RED : a0Var.c();
    }

    private static final int u(List<? extends f2.j> list, h00.p<? super f2.j, ? super Integer, Integer> pVar, h00.p<? super f2.j, ? super Integer, Integer> pVar2, int i11, int i12) {
        int c11;
        int min = Math.min((list.size() - 1) * i12, i11);
        int size = list.size();
        int i13 = 0;
        float f11 = 0.0f;
        int i14 = 0;
        int i15 = 0;
        while (i14 < size) {
            int i16 = i14 + 1;
            f2.j jVar = list.get(i14);
            float t11 = t(r(jVar));
            if (t11 == BitmapDescriptorFactory.HUE_RED) {
                int min2 = Math.min(pVar.invoke(jVar, Integer.MAX_VALUE).intValue(), i11 - min);
                min += min2;
                i15 = Math.max(i15, pVar2.invoke(jVar, Integer.valueOf(min2)).intValue());
            } else if (t11 > BitmapDescriptorFactory.HUE_RED) {
                f11 += t11;
            }
            i14 = i16;
        }
        if (f11 == BitmapDescriptorFactory.HUE_RED) {
            c11 = 0;
        } else {
            c11 = i11 == Integer.MAX_VALUE ? Integer.MAX_VALUE : j00.c.c(Math.max(i11 - min, 0) / f11);
        }
        int size2 = list.size();
        while (i13 < size2) {
            int i17 = i13 + 1;
            f2.j jVar2 = list.get(i13);
            float t12 = t(r(jVar2));
            if (t12 > BitmapDescriptorFactory.HUE_RED) {
                i15 = Math.max(i15, pVar2.invoke(jVar2, Integer.valueOf(c11 != Integer.MAX_VALUE ? j00.c.c(c11 * t12) : Integer.MAX_VALUE)).intValue());
            }
            i13 = i17;
        }
        return i15;
    }

    private static final int v(List<? extends f2.j> list, h00.p<? super f2.j, ? super Integer, Integer> pVar, int i11, int i12) {
        int c11;
        int c12;
        int size = list.size();
        float f11 = 0.0f;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            if (i13 < size) {
                int i16 = i13 + 1;
                f2.j jVar = list.get(i13);
                float t11 = t(r(jVar));
                int intValue = pVar.invoke(jVar, Integer.valueOf(i11)).intValue();
                if (t11 == BitmapDescriptorFactory.HUE_RED) {
                    i15 += intValue;
                } else if (t11 > BitmapDescriptorFactory.HUE_RED) {
                    f11 += t11;
                    c12 = j00.c.c(intValue / t11);
                    i14 = Math.max(i14, c12);
                }
                i13 = i16;
            } else {
                c11 = j00.c.c(i14 * f11);
                return c11 + i15 + ((list.size() - 1) * i12);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(List<? extends f2.j> list, h00.p<? super f2.j, ? super Integer, Integer> pVar, h00.p<? super f2.j, ? super Integer, Integer> pVar2, int i11, int i12, p pVar3, p pVar4) {
        if (pVar3 == pVar4) {
            return v(list, pVar, i11, i12);
        }
        return u(list, pVar2, pVar, i11, i12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(a0 a0Var) {
        k q11 = q(a0Var);
        if (q11 == null) {
            return false;
        }
        return q11.c();
    }

    public static final f2.z y(p orientation, h00.s<? super Integer, ? super int[], ? super x2.q, ? super x2.d, ? super int[], vz.b0> arrangement, float f11, f0 crossAxisSize, k crossAxisAlignment) {
        kotlin.jvm.internal.s.g(orientation, "orientation");
        kotlin.jvm.internal.s.g(arrangement, "arrangement");
        kotlin.jvm.internal.s.g(crossAxisSize, "crossAxisSize");
        kotlin.jvm.internal.s.g(crossAxisAlignment, "crossAxisAlignment");
        return new a(orientation, f11, crossAxisSize, arrangement, crossAxisAlignment);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int z(m0 m0Var, p pVar) {
        return pVar == p.Horizontal ? m0Var.w0() : m0Var.B0();
    }
}