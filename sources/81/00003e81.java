package com.horcrux.svg;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReactContext;
import com.swmansion.reanimated.layoutReanimation.Snapshot;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class b0 extends RenderableView {

    /* renamed from: a  reason: collision with root package name */
    private SVGLength f17559a;

    /* renamed from: b  reason: collision with root package name */
    private SVGLength f17560b;

    /* renamed from: c  reason: collision with root package name */
    private SVGLength f17561c;

    /* renamed from: d  reason: collision with root package name */
    private SVGLength f17562d;

    /* renamed from: e  reason: collision with root package name */
    private SVGLength f17563e;

    /* renamed from: f  reason: collision with root package name */
    private SVGLength f17564f;

    public b0(ReactContext reactContext) {
        super(reactContext);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    @Override // com.horcrux.svg.RenderableView, com.horcrux.svg.VirtualView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.graphics.Path getPath(android.graphics.Canvas r20, android.graphics.Paint r21) {
        /*
            r19 = this;
            r0 = r19
            android.graphics.Path r9 = new android.graphics.Path
            r9.<init>()
            com.horcrux.svg.SVGLength r1 = r0.f17559a
            double r1 = r0.relativeOnWidth(r1)
            com.horcrux.svg.SVGLength r3 = r0.f17560b
            double r3 = r0.relativeOnHeight(r3)
            com.horcrux.svg.SVGLength r5 = r0.f17561c
            double r5 = r0.relativeOnWidth(r5)
            com.horcrux.svg.SVGLength r7 = r0.f17562d
            double r7 = r0.relativeOnHeight(r7)
            com.horcrux.svg.SVGLength r10 = r0.f17563e
            if (r10 != 0) goto L3d
            com.horcrux.svg.SVGLength r11 = r0.f17564f
            if (r11 == 0) goto L28
            goto L3d
        L28:
            float r10 = (float) r1
            float r11 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            android.graphics.Path$Direction r7 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r10
            r3 = r11
            r4 = r5
            r5 = r6
            r6 = r7
            r1.addRect(r2, r3, r4, r5, r6)
            r9.close()
            goto L99
        L3d:
            if (r10 != 0) goto L47
            com.horcrux.svg.SVGLength r10 = r0.f17564f
            double r10 = r0.relativeOnHeight(r10)
        L45:
            r12 = r10
            goto L5a
        L47:
            com.horcrux.svg.SVGLength r11 = r0.f17564f
            if (r11 != 0) goto L50
            double r10 = r0.relativeOnWidth(r10)
            goto L45
        L50:
            double r10 = r0.relativeOnWidth(r10)
            com.horcrux.svg.SVGLength r12 = r0.f17564f
            double r12 = r0.relativeOnHeight(r12)
        L5a:
            r14 = 4611686018427387904(0x4000000000000000, double:2.0)
            double r16 = r5 / r14
            int r18 = (r10 > r16 ? 1 : (r10 == r16 ? 0 : -1))
            if (r18 <= 0) goto L64
            r10 = r16
        L64:
            double r14 = r7 / r14
            int r16 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r16 <= 0) goto L6b
            r12 = r14
        L6b:
            int r14 = android.os.Build.VERSION.SDK_INT
            r15 = 21
            if (r14 < r15) goto L87
            float r14 = (float) r1
            float r15 = (float) r3
            double r1 = r1 + r5
            float r5 = (float) r1
            double r3 = r3 + r7
            float r6 = (float) r3
            float r7 = (float) r10
            float r8 = (float) r12
            android.graphics.Path$Direction r10 = android.graphics.Path.Direction.CW
            r1 = r9
            r2 = r14
            r3 = r15
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r10
            r1.addRoundRect(r2, r3, r4, r5, r6, r7, r8)
            goto L99
        L87:
            android.graphics.RectF r14 = new android.graphics.RectF
            float r15 = (float) r1
            float r0 = (float) r3
            double r1 = r1 + r5
            float r1 = (float) r1
            double r3 = r3 + r7
            float r2 = (float) r3
            r14.<init>(r15, r0, r1, r2)
            float r0 = (float) r10
            float r1 = (float) r12
            android.graphics.Path$Direction r2 = android.graphics.Path.Direction.CW
            r9.addRoundRect(r14, r0, r1, r2)
        L99:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.horcrux.svg.b0.getPath(android.graphics.Canvas, android.graphics.Paint):android.graphics.Path");
    }

    @ng.a(name = Snapshot.HEIGHT)
    public void setHeight(Dynamic dynamic) {
        this.f17562d = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "rx")
    public void setRx(Dynamic dynamic) {
        this.f17563e = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "ry")
    public void setRy(Dynamic dynamic) {
        this.f17564f = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = Snapshot.WIDTH)
    public void setWidth(Dynamic dynamic) {
        this.f17561c = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "x")
    public void setX(Dynamic dynamic) {
        this.f17559a = SVGLength.b(dynamic);
        invalidate();
    }

    @ng.a(name = "y")
    public void setY(Dynamic dynamic) {
        this.f17560b = SVGLength.b(dynamic);
        invalidate();
    }
}