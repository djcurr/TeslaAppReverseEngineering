package com.google.android.exoplayer2.ui;

import ak.k0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes3.dex */
final class g {
    private int A;
    private int B;
    private int C;
    private int D;
    private StaticLayout E;
    private StaticLayout F;
    private int G;
    private int H;
    private int I;
    private Rect J;

    /* renamed from: a  reason: collision with root package name */
    private final float f14542a;

    /* renamed from: b  reason: collision with root package name */
    private final float f14543b;

    /* renamed from: c  reason: collision with root package name */
    private final float f14544c;

    /* renamed from: d  reason: collision with root package name */
    private final float f14545d;

    /* renamed from: e  reason: collision with root package name */
    private final float f14546e;

    /* renamed from: f  reason: collision with root package name */
    private final TextPaint f14547f;

    /* renamed from: g  reason: collision with root package name */
    private final Paint f14548g;

    /* renamed from: h  reason: collision with root package name */
    private final Paint f14549h;

    /* renamed from: i  reason: collision with root package name */
    private CharSequence f14550i;

    /* renamed from: j  reason: collision with root package name */
    private Layout.Alignment f14551j;

    /* renamed from: k  reason: collision with root package name */
    private Bitmap f14552k;

    /* renamed from: l  reason: collision with root package name */
    private float f14553l;

    /* renamed from: m  reason: collision with root package name */
    private int f14554m;

    /* renamed from: n  reason: collision with root package name */
    private int f14555n;

    /* renamed from: o  reason: collision with root package name */
    private float f14556o;

    /* renamed from: p  reason: collision with root package name */
    private int f14557p;

    /* renamed from: q  reason: collision with root package name */
    private float f14558q;

    /* renamed from: r  reason: collision with root package name */
    private float f14559r;

    /* renamed from: s  reason: collision with root package name */
    private int f14560s;

    /* renamed from: t  reason: collision with root package name */
    private int f14561t;

    /* renamed from: u  reason: collision with root package name */
    private int f14562u;

    /* renamed from: v  reason: collision with root package name */
    private int f14563v;

    /* renamed from: w  reason: collision with root package name */
    private int f14564w;

    /* renamed from: x  reason: collision with root package name */
    private float f14565x;

    /* renamed from: y  reason: collision with root package name */
    private float f14566y;

    /* renamed from: z  reason: collision with root package name */
    private float f14567z;

    public g(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, new int[]{16843287, 16843288}, 0, 0);
        this.f14546e = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        this.f14545d = obtainStyledAttributes.getFloat(1, 1.0f);
        obtainStyledAttributes.recycle();
        float round = Math.round((context.getResources().getDisplayMetrics().densityDpi * 2.0f) / 160.0f);
        this.f14542a = round;
        this.f14543b = round;
        this.f14544c = round;
        TextPaint textPaint = new TextPaint();
        this.f14547f = textPaint;
        textPaint.setAntiAlias(true);
        textPaint.setSubpixelText(true);
        Paint paint = new Paint();
        this.f14548g = paint;
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        Paint paint2 = new Paint();
        this.f14549h = paint2;
        paint2.setAntiAlias(true);
        paint2.setFilterBitmap(true);
    }

    private static boolean a(CharSequence charSequence, CharSequence charSequence2) {
        return charSequence == charSequence2 || (charSequence != null && charSequence.equals(charSequence2));
    }

    private void c(Canvas canvas) {
        canvas.drawBitmap(this.f14552k, (Rect) null, this.J, this.f14549h);
    }

    private void d(Canvas canvas, boolean z11) {
        if (z11) {
            e(canvas);
            return;
        }
        ak.a.e(this.J);
        ak.a.e(this.f14552k);
        c(canvas);
    }

    private void e(Canvas canvas) {
        StaticLayout staticLayout = this.E;
        StaticLayout staticLayout2 = this.F;
        if (staticLayout == null || staticLayout2 == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(this.G, this.H);
        if (Color.alpha(this.f14562u) > 0) {
            this.f14548g.setColor(this.f14562u);
            canvas.drawRect(-this.I, BitmapDescriptorFactory.HUE_RED, staticLayout.getWidth() + this.I, staticLayout.getHeight(), this.f14548g);
        }
        int i11 = this.f14564w;
        if (i11 == 1) {
            this.f14547f.setStrokeJoin(Paint.Join.ROUND);
            this.f14547f.setStrokeWidth(this.f14542a);
            this.f14547f.setColor(this.f14563v);
            this.f14547f.setStyle(Paint.Style.FILL_AND_STROKE);
            staticLayout2.draw(canvas);
        } else if (i11 == 2) {
            TextPaint textPaint = this.f14547f;
            float f11 = this.f14543b;
            float f12 = this.f14544c;
            textPaint.setShadowLayer(f11, f12, f12, this.f14563v);
        } else if (i11 == 3 || i11 == 4) {
            boolean z11 = i11 == 3;
            int i12 = z11 ? -1 : this.f14563v;
            int i13 = z11 ? this.f14563v : -1;
            float f13 = this.f14543b / 2.0f;
            this.f14547f.setColor(this.f14560s);
            this.f14547f.setStyle(Paint.Style.FILL);
            float f14 = -f13;
            this.f14547f.setShadowLayer(this.f14543b, f14, f14, i12);
            staticLayout2.draw(canvas);
            this.f14547f.setShadowLayer(this.f14543b, f13, f13, i13);
        }
        this.f14547f.setColor(this.f14560s);
        this.f14547f.setStyle(Paint.Style.FILL);
        staticLayout.draw(canvas);
        this.f14547f.setShadowLayer(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 0);
        canvas.restoreToCount(save);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void f() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f14552k
            int r1 = r7.C
            int r2 = r7.A
            int r1 = r1 - r2
            int r3 = r7.D
            int r4 = r7.B
            int r3 = r3 - r4
            float r2 = (float) r2
            float r1 = (float) r1
            float r5 = r7.f14556o
            float r5 = r5 * r1
            float r2 = r2 + r5
            float r4 = (float) r4
            float r3 = (float) r3
            float r5 = r7.f14553l
            float r5 = r5 * r3
            float r4 = r4 + r5
            float r5 = r7.f14558q
            float r1 = r1 * r5
            int r1 = java.lang.Math.round(r1)
            float r5 = r7.f14559r
            r6 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            int r6 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
            if (r6 == 0) goto L2e
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
            goto L3f
        L2e:
            float r3 = (float) r1
            int r5 = r0.getHeight()
            float r5 = (float) r5
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r5 = r5 / r0
            float r3 = r3 * r5
            int r0 = java.lang.Math.round(r3)
        L3f:
            int r3 = r7.f14557p
            r5 = 1
            r6 = 2
            if (r3 != r6) goto L48
            float r3 = (float) r1
        L46:
            float r2 = r2 - r3
            goto L4e
        L48:
            if (r3 != r5) goto L4e
            int r3 = r1 / 2
            float r3 = (float) r3
            goto L46
        L4e:
            int r2 = java.lang.Math.round(r2)
            int r3 = r7.f14555n
            if (r3 != r6) goto L59
            float r3 = (float) r0
        L57:
            float r4 = r4 - r3
            goto L5f
        L59:
            if (r3 != r5) goto L5f
            int r3 = r0 / 2
            float r3 = (float) r3
            goto L57
        L5f:
            int r3 = java.lang.Math.round(r4)
            android.graphics.Rect r4 = new android.graphics.Rect
            int r1 = r1 + r2
            int r0 = r0 + r3
            r4.<init>(r2, r3, r1, r0)
            r7.J = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.g.f():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:71:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void g() {
        /*
            Method dump skipped, instructions count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.ui.g.g():void");
    }

    public void b(nj.b bVar, nj.a aVar, float f11, float f12, float f13, Canvas canvas, int i11, int i12, int i13, int i14) {
        boolean z11 = bVar.f41696c == null;
        int i15 = -16777216;
        if (z11) {
            if (TextUtils.isEmpty(bVar.f41694a)) {
                return;
            }
            i15 = bVar.f41704k ? bVar.f41705l : aVar.f41689c;
        }
        if (a(this.f14550i, bVar.f41694a) && k0.c(this.f14551j, bVar.f41695b) && this.f14552k == bVar.f41696c && this.f14553l == bVar.f41697d && this.f14554m == bVar.f41698e && k0.c(Integer.valueOf(this.f14555n), Integer.valueOf(bVar.f41699f)) && this.f14556o == bVar.f41700g && k0.c(Integer.valueOf(this.f14557p), Integer.valueOf(bVar.f41701h)) && this.f14558q == bVar.f41702i && this.f14559r == bVar.f41703j && this.f14560s == aVar.f41687a && this.f14561t == aVar.f41688b && this.f14562u == i15 && this.f14564w == aVar.f41690d && this.f14563v == aVar.f41691e && k0.c(this.f14547f.getTypeface(), aVar.f41692f) && this.f14565x == f11 && this.f14566y == f12 && this.f14567z == f13 && this.A == i11 && this.B == i12 && this.C == i13 && this.D == i14) {
            d(canvas, z11);
            return;
        }
        this.f14550i = bVar.f41694a;
        this.f14551j = bVar.f41695b;
        this.f14552k = bVar.f41696c;
        this.f14553l = bVar.f41697d;
        this.f14554m = bVar.f41698e;
        this.f14555n = bVar.f41699f;
        this.f14556o = bVar.f41700g;
        this.f14557p = bVar.f41701h;
        this.f14558q = bVar.f41702i;
        this.f14559r = bVar.f41703j;
        this.f14560s = aVar.f41687a;
        this.f14561t = aVar.f41688b;
        this.f14562u = i15;
        this.f14564w = aVar.f41690d;
        this.f14563v = aVar.f41691e;
        this.f14547f.setTypeface(aVar.f41692f);
        this.f14565x = f11;
        this.f14566y = f12;
        this.f14567z = f13;
        this.A = i11;
        this.B = i12;
        this.C = i13;
        this.D = i14;
        if (z11) {
            ak.a.e(this.f14550i);
            g();
        } else {
            ak.a.e(this.f14552k);
            f();
        }
        d(canvas, z11);
    }
}