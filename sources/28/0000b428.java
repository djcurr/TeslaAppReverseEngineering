package t1;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.NoWhenBranchMatchedException;
import t1.m0;

/* loaded from: classes.dex */
public final class n0 {
    public static final void b(v1.e drawOutline, m0 outline, s brush, float f11, v1.f style, b0 b0Var, int i11) {
        q0 a11;
        kotlin.jvm.internal.s.g(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.s.g(outline, "outline");
        kotlin.jvm.internal.s.g(brush, "brush");
        kotlin.jvm.internal.s.g(style, "style");
        if (outline instanceof m0.b) {
            s1.h a12 = ((m0.b) outline).a();
            drawOutline.f0(brush, i(a12), g(a12), f11, style, b0Var, i11);
            return;
        }
        if (outline instanceof m0.c) {
            m0.c cVar = (m0.c) outline;
            a11 = cVar.b();
            if (a11 == null) {
                s1.j a13 = cVar.a();
                drawOutline.s(brush, j(a13), h(a13), s1.b.b(s1.a.d(a13.b()), BitmapDescriptorFactory.HUE_RED, 2, null), f11, style, b0Var, i11);
                return;
            }
        } else if (!(outline instanceof m0.a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            a11 = ((m0.a) outline).a();
        }
        drawOutline.r(a11, brush, f11, style, b0Var, i11);
    }

    public static /* synthetic */ void c(v1.e eVar, m0 m0Var, s sVar, float f11, v1.f fVar, b0 b0Var, int i11, int i12, Object obj) {
        if ((i12 & 4) != 0) {
            f11 = 1.0f;
        }
        float f12 = f11;
        if ((i12 & 8) != 0) {
            fVar = v1.i.f53871a;
        }
        v1.f fVar2 = fVar;
        if ((i12 & 16) != 0) {
            b0Var = null;
        }
        b0 b0Var2 = b0Var;
        if ((i12 & 32) != 0) {
            i11 = v1.e.f53867k1.a();
        }
        b(eVar, m0Var, sVar, f12, fVar2, b0Var2, i11);
    }

    public static final void d(v1.e drawOutline, m0 outline, long j11, float f11, v1.f style, b0 b0Var, int i11) {
        q0 a11;
        kotlin.jvm.internal.s.g(drawOutline, "$this$drawOutline");
        kotlin.jvm.internal.s.g(outline, "outline");
        kotlin.jvm.internal.s.g(style, "style");
        if (outline instanceof m0.b) {
            s1.h a12 = ((m0.b) outline).a();
            drawOutline.y(j11, i(a12), g(a12), f11, style, b0Var, i11);
            return;
        }
        if (outline instanceof m0.c) {
            m0.c cVar = (m0.c) outline;
            a11 = cVar.b();
            if (a11 == null) {
                s1.j a13 = cVar.a();
                drawOutline.K(j11, j(a13), h(a13), s1.b.b(s1.a.d(a13.b()), BitmapDescriptorFactory.HUE_RED, 2, null), style, f11, b0Var, i11);
                return;
            }
        } else if (!(outline instanceof m0.a)) {
            throw new NoWhenBranchMatchedException();
        } else {
            a11 = ((m0.a) outline).a();
        }
        drawOutline.O(a11, j11, f11, style, b0Var, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00a0 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean f(s1.j r6) {
        /*
            long r0 = r6.b()
            float r0 = s1.a.d(r0)
            long r1 = r6.c()
            float r1 = s1.a.d(r1)
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            r0 = r1
            goto L19
        L18:
            r0 = r2
        L19:
            if (r0 == 0) goto L4f
            long r3 = r6.c()
            float r0 = s1.a.d(r3)
            long r3 = r6.i()
            float r3 = s1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L31
            r0 = r1
            goto L32
        L31:
            r0 = r2
        L32:
            if (r0 == 0) goto L4f
            long r3 = r6.i()
            float r0 = s1.a.d(r3)
            long r3 = r6.h()
            float r3 = s1.a.d(r3)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = r1
            goto L4b
        L4a:
            r0 = r2
        L4b:
            if (r0 == 0) goto L4f
            r0 = r1
            goto L50
        L4f:
            r0 = r2
        L50:
            long r3 = r6.b()
            float r3 = s1.a.e(r3)
            long r4 = r6.c()
            float r4 = s1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L66
            r3 = r1
            goto L67
        L66:
            r3 = r2
        L67:
            if (r3 == 0) goto L9d
            long r3 = r6.c()
            float r3 = s1.a.e(r3)
            long r4 = r6.i()
            float r4 = s1.a.e(r4)
            int r3 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r3 != 0) goto L7f
            r3 = r1
            goto L80
        L7f:
            r3 = r2
        L80:
            if (r3 == 0) goto L9d
            long r3 = r6.i()
            float r3 = s1.a.e(r3)
            long r4 = r6.h()
            float r6 = s1.a.e(r4)
            int r6 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r6 != 0) goto L98
            r6 = r1
            goto L99
        L98:
            r6 = r2
        L99:
            if (r6 == 0) goto L9d
            r6 = r1
            goto L9e
        L9d:
            r6 = r2
        L9e:
            if (r0 == 0) goto La3
            if (r6 == 0) goto La3
            goto La4
        La3:
            r1 = r2
        La4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: t1.n0.f(s1.j):boolean");
    }

    private static final long g(s1.h hVar) {
        return s1.m.a(hVar.n(), hVar.h());
    }

    private static final long h(s1.j jVar) {
        return s1.m.a(jVar.j(), jVar.d());
    }

    private static final long i(s1.h hVar) {
        return s1.g.a(hVar.i(), hVar.l());
    }

    private static final long j(s1.j jVar) {
        return s1.g.a(jVar.e(), jVar.g());
    }
}