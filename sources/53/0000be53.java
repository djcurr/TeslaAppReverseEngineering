package x1;

import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.spongycastle.crypto.tls.CipherSuite;
import t1.q0;
import x1.f;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    private final List<f> f56771a = new ArrayList();

    /* renamed from: b  reason: collision with root package name */
    private final b f56772b = new b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);

    /* renamed from: c  reason: collision with root package name */
    private final b f56773c = new b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);

    /* renamed from: d  reason: collision with root package name */
    private final b f56774d = new b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);

    /* renamed from: e  reason: collision with root package name */
    private final b f56775e = new b(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        private float f56778a;

        /* renamed from: b  reason: collision with root package name */
        private float f56779b;

        public b() {
            this(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 3, null);
        }

        public b(float f11, float f12) {
            this.f56778a = f11;
            this.f56779b = f12;
        }

        public final float a() {
            return this.f56778a;
        }

        public final float b() {
            return this.f56779b;
        }

        public final void c() {
            this.f56778a = BitmapDescriptorFactory.HUE_RED;
            this.f56779b = BitmapDescriptorFactory.HUE_RED;
        }

        public final void d(float f11) {
            this.f56778a = f11;
        }

        public final void e(float f11) {
            this.f56779b = f11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                return kotlin.jvm.internal.s.c(Float.valueOf(this.f56778a), Float.valueOf(bVar.f56778a)) && kotlin.jvm.internal.s.c(Float.valueOf(this.f56779b), Float.valueOf(bVar.f56779b));
            }
            return false;
        }

        public int hashCode() {
            return (Float.hashCode(this.f56778a) * 31) + Float.hashCode(this.f56779b);
        }

        public String toString() {
            return "PathPoint(x=" + this.f56778a + ", y=" + this.f56779b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ b(float f11, float f12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? 0.0f : f11, (i11 & 2) != 0 ? 0.0f : f12);
        }
    }

    private final void A(f.q qVar, boolean z11, q0 q0Var) {
        if (z11) {
            this.f56775e.d(this.f56772b.a() - this.f56773c.a());
            this.f56775e.e(this.f56772b.b() - this.f56773c.b());
        } else {
            this.f56775e.c();
        }
        q0Var.f(this.f56775e.a(), this.f56775e.b(), qVar.c(), qVar.d());
        this.f56773c.d(this.f56772b.a() + this.f56775e.a());
        this.f56773c.e(this.f56772b.b() + this.f56775e.b());
        b bVar = this.f56772b;
        bVar.d(bVar.a() + qVar.c());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + qVar.d());
    }

    private final void B(f.r rVar, q0 q0Var) {
        q0Var.n(BitmapDescriptorFactory.HUE_RED, rVar.c());
        b bVar = this.f56772b;
        bVar.e(bVar.b() + rVar.c());
    }

    private final double E(double d11) {
        return (d11 / ((double) CipherSuite.TLS_DHE_PSK_WITH_NULL_SHA256)) * 3.141592653589793d;
    }

    private final void F(f.s sVar, q0 q0Var) {
        q0Var.o(this.f56772b.a(), sVar.c());
        this.f56772b.e(sVar.c());
    }

    private final void a(char c11, float[] fArr) {
        this.f56771a.addAll(g.a(c11, fArr));
    }

    private final void c(f.a aVar, q0 q0Var) {
        i(q0Var, this.f56772b.a(), this.f56772b.b(), aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
        this.f56772b.d(aVar.c());
        this.f56772b.e(aVar.d());
        this.f56773c.d(this.f56772b.a());
        this.f56773c.e(this.f56772b.b());
    }

    private final void d(q0 q0Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, double d19) {
        double d21 = d13;
        double d22 = 4;
        int ceil = (int) Math.ceil(Math.abs((d19 * d22) / 3.141592653589793d));
        double cos = Math.cos(d17);
        double sin = Math.sin(d17);
        double cos2 = Math.cos(d18);
        double sin2 = Math.sin(d18);
        double d23 = -d21;
        double d24 = d23 * cos;
        double d25 = d14 * sin;
        double d26 = (d24 * sin2) - (d25 * cos2);
        double d27 = d23 * sin;
        double d28 = d14 * cos;
        double d29 = (sin2 * d27) + (cos2 * d28);
        double d31 = d19 / ceil;
        double d32 = d15;
        double d33 = d29;
        double d34 = d26;
        int i11 = 0;
        double d35 = d16;
        double d36 = d18;
        while (i11 < ceil) {
            double d37 = d36 + d31;
            double sin3 = Math.sin(d37);
            double cos3 = Math.cos(d37);
            int i12 = ceil;
            double d38 = (d11 + ((d21 * cos) * cos3)) - (d25 * sin3);
            double d39 = d12 + (d21 * sin * cos3) + (d28 * sin3);
            double d41 = (d24 * sin3) - (d25 * cos3);
            double d42 = (sin3 * d27) + (cos3 * d28);
            double d43 = d37 - d36;
            double tan = Math.tan(d43 / 2);
            double sin4 = (Math.sin(d43) * (Math.sqrt(d22 + ((3.0d * tan) * tan)) - 1)) / 3;
            q0Var.m((float) (d32 + (d34 * sin4)), (float) (d35 + (d33 * sin4)), (float) (d38 - (sin4 * d41)), (float) (d39 - (sin4 * d42)), (float) d38, (float) d39);
            d31 = d31;
            i11++;
            sin = sin;
            d35 = d39;
            d32 = d38;
            ceil = i12;
            d36 = d37;
            d33 = d42;
            d22 = d22;
            d34 = d41;
            cos = cos;
            d21 = d13;
        }
    }

    private final void f(q0 q0Var) {
        this.f56772b.d(this.f56774d.a());
        this.f56772b.e(this.f56774d.b());
        this.f56773c.d(this.f56774d.a());
        this.f56773c.e(this.f56774d.b());
        q0Var.close();
        q0Var.l(this.f56772b.a(), this.f56772b.b());
    }

    private final float[] g(float[] fArr, int i11, int i12) {
        if (i11 <= i12) {
            int length = fArr.length;
            if (i11 >= 0 && i11 <= length) {
                int i13 = i12 - i11;
                int min = Math.min(i13, length - i11);
                float[] fArr2 = new float[i13];
                wz.o.h(fArr, fArr2, 0, i11, min + i11);
                return fArr2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw new IllegalArgumentException();
    }

    private final void h(f.c cVar, q0 q0Var) {
        q0Var.m(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
        this.f56773c.d(cVar.d());
        this.f56773c.e(cVar.g());
        this.f56772b.d(cVar.e());
        this.f56772b.e(cVar.h());
    }

    private final void i(q0 q0Var, double d11, double d12, double d13, double d14, double d15, double d16, double d17, boolean z11, boolean z12) {
        double d18;
        double d19;
        double E = E(d17);
        double cos = Math.cos(E);
        double sin = Math.sin(E);
        double d21 = ((d11 * cos) + (d12 * sin)) / d15;
        double d22 = (((-d11) * sin) + (d12 * cos)) / d16;
        double d23 = ((d13 * cos) + (d14 * sin)) / d15;
        double d24 = (((-d13) * sin) + (d14 * cos)) / d16;
        double d25 = d21 - d23;
        double d26 = d22 - d24;
        double d27 = 2;
        double d28 = (d21 + d23) / d27;
        double d29 = (d22 + d24) / d27;
        double d31 = (d25 * d25) + (d26 * d26);
        if (d31 == 0.0d) {
            return;
        }
        double d32 = (1.0d / d31) - 0.25d;
        if (d32 < 0.0d) {
            double sqrt = (float) (Math.sqrt(d31) / 1.99999d);
            i(q0Var, d11, d12, d13, d14, d15 * sqrt, d16 * sqrt, d17, z11, z12);
            return;
        }
        double sqrt2 = Math.sqrt(d32);
        double d33 = d25 * sqrt2;
        double d34 = sqrt2 * d26;
        if (z11 == z12) {
            d18 = d28 - d34;
            d19 = d29 + d33;
        } else {
            d18 = d28 + d34;
            d19 = d29 - d33;
        }
        double atan2 = Math.atan2(d22 - d19, d21 - d18);
        double atan22 = Math.atan2(d24 - d19, d23 - d18) - atan2;
        int i11 = (atan22 > 0.0d ? 1 : (atan22 == 0.0d ? 0 : -1));
        if (z12 != (i11 >= 0)) {
            atan22 = i11 > 0 ? atan22 - 6.283185307179586d : atan22 + 6.283185307179586d;
        }
        double d35 = d18 * d15;
        double d36 = d19 * d16;
        d(q0Var, (d35 * cos) - (d36 * sin), (d35 * sin) + (d36 * cos), d15, d16, d11, d12, E, atan2, atan22);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0051 A[LOOP:0: B:3:0x0008->B:36:0x0051, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0054 A[EDGE_INSN: B:40:0x0054->B:37:0x0054 ?: BREAK  , SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void j(java.lang.String r9, int r10, x1.h.a r11) {
        /*
            r8 = this;
            r0 = 0
            r11.d(r0)
            r1 = r10
            r2 = r0
            r3 = r2
            r4 = r3
        L8:
            int r5 = r9.length()
            if (r1 >= r5) goto L54
            char r5 = r9.charAt(r1)
            r6 = 32
            r7 = 1
            if (r5 != r6) goto L19
        L17:
            r6 = r7
            goto L1f
        L19:
            r6 = 44
            if (r5 != r6) goto L1e
            goto L17
        L1e:
            r6 = r0
        L1f:
            if (r6 == 0) goto L24
        L21:
            r2 = r0
            r4 = r7
            goto L4e
        L24:
            r6 = 45
            if (r5 != r6) goto L30
            if (r1 == r10) goto L4d
            if (r2 != 0) goto L4d
            r11.d(r7)
            goto L21
        L30:
            r2 = 46
            if (r5 != r2) goto L3d
            if (r3 != 0) goto L39
            r2 = r0
            r3 = r7
            goto L4e
        L39:
            r11.d(r7)
            goto L21
        L3d:
            r2 = 101(0x65, float:1.42E-43)
            if (r5 != r2) goto L43
        L41:
            r2 = r7
            goto L49
        L43:
            r2 = 69
            if (r5 != r2) goto L48
            goto L41
        L48:
            r2 = r0
        L49:
            if (r2 == 0) goto L4d
            r2 = r7
            goto L4e
        L4d:
            r2 = r0
        L4e:
            if (r4 == 0) goto L51
            goto L54
        L51:
            int r1 = r1 + 1
            goto L8
        L54:
            r11.c(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: x1.h.j(java.lang.String, int, x1.h$a):void");
    }

    private final float[] k(String str) {
        if (str.charAt(0) == 'z' || str.charAt(0) == 'Z') {
            return new float[0];
        }
        float[] fArr = new float[str.length()];
        a aVar = new a(0, false, 3, null);
        int length = str.length();
        int i11 = 1;
        int i12 = 0;
        while (i11 < length) {
            j(str, i11, aVar);
            int a11 = aVar.a();
            if (i11 < a11) {
                String substring = str.substring(i11, a11);
                kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                fArr[i12] = Float.parseFloat(substring);
                i12++;
            }
            i11 = aVar.b() ? a11 : a11 + 1;
        }
        return g(fArr, 0, i12);
    }

    private final void l(f.d dVar, q0 q0Var) {
        q0Var.o(dVar.c(), this.f56772b.b());
        this.f56772b.d(dVar.c());
    }

    private final void m(f.e eVar, q0 q0Var) {
        q0Var.o(eVar.c(), eVar.d());
        this.f56772b.d(eVar.c());
        this.f56772b.e(eVar.d());
    }

    private final void n(f.C1297f c1297f, q0 q0Var) {
        this.f56772b.d(c1297f.c());
        this.f56772b.e(c1297f.d());
        q0Var.l(c1297f.c(), c1297f.d());
        this.f56774d.d(this.f56772b.a());
        this.f56774d.e(this.f56772b.b());
    }

    private final int o(String str, int i11) {
        while (i11 < str.length()) {
            char charAt = str.charAt(i11);
            if (((charAt - 'A') * (charAt - 'Z') <= 0 || (charAt - 'a') * (charAt - 'z') <= 0) && charAt != 'e' && charAt != 'E') {
                return i11;
            }
            i11++;
        }
        return i11;
    }

    private final void q(f.g gVar, q0 q0Var) {
        q0Var.e(gVar.c(), gVar.e(), gVar.d(), gVar.f());
        this.f56773c.d(gVar.c());
        this.f56773c.e(gVar.e());
        this.f56772b.d(gVar.d());
        this.f56772b.e(gVar.f());
    }

    private final void r(f.h hVar, boolean z11, q0 q0Var) {
        if (z11) {
            float f11 = 2;
            this.f56775e.d((this.f56772b.a() * f11) - this.f56773c.a());
            this.f56775e.e((f11 * this.f56772b.b()) - this.f56773c.b());
        } else {
            this.f56775e.d(this.f56772b.a());
            this.f56775e.e(this.f56772b.b());
        }
        q0Var.m(this.f56775e.a(), this.f56775e.b(), hVar.c(), hVar.e(), hVar.d(), hVar.f());
        this.f56773c.d(hVar.c());
        this.f56773c.e(hVar.e());
        this.f56772b.d(hVar.d());
        this.f56772b.e(hVar.f());
    }

    private final void s(f.i iVar, boolean z11, q0 q0Var) {
        if (z11) {
            float f11 = 2;
            this.f56775e.d((this.f56772b.a() * f11) - this.f56773c.a());
            this.f56775e.e((f11 * this.f56772b.b()) - this.f56773c.b());
        } else {
            this.f56775e.d(this.f56772b.a());
            this.f56775e.e(this.f56772b.b());
        }
        q0Var.e(this.f56775e.a(), this.f56775e.b(), iVar.c(), iVar.d());
        this.f56773c.d(this.f56775e.a());
        this.f56773c.e(this.f56775e.b());
        this.f56772b.d(iVar.c());
        this.f56772b.e(iVar.d());
    }

    private final void t(f.j jVar, q0 q0Var) {
        float c11 = jVar.c() + this.f56772b.a();
        float d11 = jVar.d() + this.f56772b.b();
        i(q0Var, this.f56772b.a(), this.f56772b.b(), c11, d11, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
        this.f56772b.d(c11);
        this.f56772b.e(d11);
        this.f56773c.d(this.f56772b.a());
        this.f56773c.e(this.f56772b.b());
    }

    private final void u(f.k kVar, q0 q0Var) {
        q0Var.d(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
        this.f56773c.d(this.f56772b.a() + kVar.d());
        this.f56773c.e(this.f56772b.b() + kVar.g());
        b bVar = this.f56772b;
        bVar.d(bVar.a() + kVar.e());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + kVar.h());
    }

    private final void v(f.l lVar, q0 q0Var) {
        q0Var.n(lVar.c(), BitmapDescriptorFactory.HUE_RED);
        b bVar = this.f56772b;
        bVar.d(bVar.a() + lVar.c());
    }

    private final void w(f.m mVar, q0 q0Var) {
        q0Var.n(mVar.c(), mVar.d());
        b bVar = this.f56772b;
        bVar.d(bVar.a() + mVar.c());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + mVar.d());
    }

    private final void x(f.n nVar, q0 q0Var) {
        b bVar = this.f56772b;
        bVar.d(bVar.a() + nVar.c());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + nVar.d());
        q0Var.c(nVar.c(), nVar.d());
        this.f56774d.d(this.f56772b.a());
        this.f56774d.e(this.f56772b.b());
    }

    private final void y(f.o oVar, q0 q0Var) {
        q0Var.f(oVar.c(), oVar.e(), oVar.d(), oVar.f());
        this.f56773c.d(this.f56772b.a() + oVar.c());
        this.f56773c.e(this.f56772b.b() + oVar.e());
        b bVar = this.f56772b;
        bVar.d(bVar.a() + oVar.d());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + oVar.f());
    }

    private final void z(f.p pVar, boolean z11, q0 q0Var) {
        if (z11) {
            this.f56775e.d(this.f56772b.a() - this.f56773c.a());
            this.f56775e.e(this.f56772b.b() - this.f56773c.b());
        } else {
            this.f56775e.c();
        }
        q0Var.d(this.f56775e.a(), this.f56775e.b(), pVar.c(), pVar.e(), pVar.d(), pVar.f());
        this.f56773c.d(this.f56772b.a() + pVar.c());
        this.f56773c.e(this.f56772b.b() + pVar.e());
        b bVar = this.f56772b;
        bVar.d(bVar.a() + pVar.d());
        b bVar2 = this.f56772b;
        bVar2.e(bVar2.b() + pVar.f());
    }

    public final List<f> C() {
        return this.f56771a;
    }

    public final q0 D(q0 target) {
        kotlin.jvm.internal.s.g(target, "target");
        target.reset();
        this.f56772b.c();
        this.f56773c.c();
        this.f56774d.c();
        this.f56775e.c();
        List<f> list = this.f56771a;
        int size = list.size();
        f fVar = null;
        int i11 = 0;
        while (i11 < size) {
            int i12 = i11 + 1;
            f fVar2 = list.get(i11);
            if (fVar == null) {
                fVar = fVar2;
            }
            if (fVar2 instanceof f.b) {
                f(target);
            } else if (fVar2 instanceof f.n) {
                x((f.n) fVar2, target);
            } else if (fVar2 instanceof f.C1297f) {
                n((f.C1297f) fVar2, target);
            } else if (fVar2 instanceof f.m) {
                w((f.m) fVar2, target);
            } else if (fVar2 instanceof f.e) {
                m((f.e) fVar2, target);
            } else if (fVar2 instanceof f.l) {
                v((f.l) fVar2, target);
            } else if (fVar2 instanceof f.d) {
                l((f.d) fVar2, target);
            } else if (fVar2 instanceof f.r) {
                B((f.r) fVar2, target);
            } else if (fVar2 instanceof f.s) {
                F((f.s) fVar2, target);
            } else if (fVar2 instanceof f.k) {
                u((f.k) fVar2, target);
            } else if (fVar2 instanceof f.c) {
                h((f.c) fVar2, target);
            } else if (fVar2 instanceof f.p) {
                kotlin.jvm.internal.s.e(fVar);
                z((f.p) fVar2, fVar.a(), target);
            } else if (fVar2 instanceof f.h) {
                kotlin.jvm.internal.s.e(fVar);
                r((f.h) fVar2, fVar.a(), target);
            } else if (fVar2 instanceof f.o) {
                y((f.o) fVar2, target);
            } else if (fVar2 instanceof f.g) {
                q((f.g) fVar2, target);
            } else if (fVar2 instanceof f.q) {
                kotlin.jvm.internal.s.e(fVar);
                A((f.q) fVar2, fVar.b(), target);
            } else if (fVar2 instanceof f.i) {
                kotlin.jvm.internal.s.e(fVar);
                s((f.i) fVar2, fVar.b(), target);
            } else if (fVar2 instanceof f.j) {
                t((f.j) fVar2, target);
            } else if (fVar2 instanceof f.a) {
                c((f.a) fVar2, target);
            }
            fVar = fVar2;
            i11 = i12;
        }
        return target;
    }

    public final h b(List<? extends f> nodes) {
        kotlin.jvm.internal.s.g(nodes, "nodes");
        this.f56771a.addAll(nodes);
        return this;
    }

    public final void e() {
        this.f56771a.clear();
    }

    public final h p(String pathData) {
        kotlin.jvm.internal.s.g(pathData, "pathData");
        this.f56771a.clear();
        int i11 = 0;
        int i12 = 1;
        while (i12 < pathData.length()) {
            int o11 = o(pathData, i12);
            String substring = pathData.substring(i11, o11);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            int length = substring.length() - 1;
            int i13 = 0;
            boolean z11 = false;
            while (i13 <= length) {
                boolean z12 = kotlin.jvm.internal.s.i(substring.charAt(!z11 ? i13 : length), 32) <= 0;
                if (z11) {
                    if (!z12) {
                        break;
                    }
                    length--;
                } else if (z12) {
                    i13++;
                } else {
                    z11 = true;
                }
            }
            String obj = substring.subSequence(i13, length + 1).toString();
            if (obj.length() > 0) {
                a(obj.charAt(0), k(obj));
            }
            i11 = o11;
            i12 = o11 + 1;
        }
        if (i12 - i11 == 1 && i11 < pathData.length()) {
            a(pathData.charAt(i11), new float[0]);
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        private int f56776a;

        /* renamed from: b  reason: collision with root package name */
        private boolean f56777b;

        public a() {
            this(0, false, 3, null);
        }

        public a(int i11, boolean z11) {
            this.f56776a = i11;
            this.f56777b = z11;
        }

        public final int a() {
            return this.f56776a;
        }

        public final boolean b() {
            return this.f56777b;
        }

        public final void c(int i11) {
            this.f56776a = i11;
        }

        public final void d(boolean z11) {
            this.f56777b = z11;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof a) {
                a aVar = (a) obj;
                return this.f56776a == aVar.f56776a && this.f56777b == aVar.f56777b;
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public int hashCode() {
            int hashCode = Integer.hashCode(this.f56776a) * 31;
            boolean z11 = this.f56777b;
            int i11 = z11;
            if (z11 != 0) {
                i11 = 1;
            }
            return hashCode + i11;
        }

        public String toString() {
            return "ExtractFloatResult(endPosition=" + this.f56776a + ", endWithNegativeOrDot=" + this.f56777b + CoreConstants.RIGHT_PARENTHESIS_CHAR;
        }

        public /* synthetic */ a(int i11, boolean z11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? false : z11);
        }
    }
}