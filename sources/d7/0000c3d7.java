package z;

import android.view.Display;

/* loaded from: classes.dex */
public final class p extends m0 {

    /* renamed from: b  reason: collision with root package name */
    private final float f59988b;

    /* renamed from: c  reason: collision with root package name */
    private final float f59989c;

    /* renamed from: d  reason: collision with root package name */
    private final Display f59990d;

    /* renamed from: e  reason: collision with root package name */
    private final d f59991e;

    public p(Display display, d dVar, float f11, float f12) {
        this.f59988b = f11;
        this.f59989c = f12;
        this.f59990d = display;
        this.f59991e = dVar;
    }

    private Integer e() {
        d dVar = this.f59991e;
        if (dVar instanceof androidx.camera.core.impl.r) {
            return ((androidx.camera.core.impl.r) dVar).c();
        }
        return null;
    }

    private int f(boolean z11) {
        try {
            int h11 = this.f59991e.h(this.f59990d.getRotation());
            return z11 ? (360 - h11) % 360 : h11;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0038  */
    @Override // z.m0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected android.graphics.PointF a(float r9, float r10) {
        /*
            r8 = this;
            float r0 = r8.f59988b
            float r1 = r8.f59989c
            java.lang.Integer r2 = r8.e()
            if (r2 == 0) goto L12
            int r2 = r2.intValue()
            if (r2 != 0) goto L12
            r2 = 1
            goto L13
        L12:
            r2 = 0
        L13:
            int r3 = r8.f(r2)
            r4 = 270(0x10e, float:3.78E-43)
            r5 = 90
            if (r3 == r5) goto L26
            if (r3 != r4) goto L20
            goto L26
        L20:
            r6 = r10
            r10 = r9
            r9 = r6
            r7 = r1
            r1 = r0
            r0 = r7
        L26:
            if (r3 == r5) goto L34
            r5 = 180(0xb4, float:2.52E-43)
            if (r3 == r5) goto L32
            if (r3 == r4) goto L2f
            goto L36
        L2f:
            float r10 = r1 - r10
            goto L36
        L32:
            float r10 = r1 - r10
        L34:
            float r9 = r0 - r9
        L36:
            if (r2 == 0) goto L3a
            float r10 = r1 - r10
        L3a:
            float r10 = r10 / r1
            float r9 = r9 / r0
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>(r10, r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: z.p.a(float, float):android.graphics.PointF");
    }
}