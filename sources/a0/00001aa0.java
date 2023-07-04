package com.facebook.react.views.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import com.facebook.react.uimanager.l0;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import java.util.Locale;

/* loaded from: classes3.dex */
public class e extends Drawable {

    /* renamed from: a  reason: collision with root package name */
    private l0 f12803a;

    /* renamed from: b  reason: collision with root package name */
    private l0 f12804b;

    /* renamed from: c  reason: collision with root package name */
    private l0 f12805c;

    /* renamed from: d  reason: collision with root package name */
    private c f12806d;

    /* renamed from: e  reason: collision with root package name */
    private Path f12807e;

    /* renamed from: f  reason: collision with root package name */
    private Path f12808f;

    /* renamed from: g  reason: collision with root package name */
    private Path f12809g;

    /* renamed from: h  reason: collision with root package name */
    private Path f12810h;

    /* renamed from: j  reason: collision with root package name */
    private Path f12812j;

    /* renamed from: k  reason: collision with root package name */
    private RectF f12813k;

    /* renamed from: l  reason: collision with root package name */
    private RectF f12814l;

    /* renamed from: m  reason: collision with root package name */
    private RectF f12815m;

    /* renamed from: n  reason: collision with root package name */
    private RectF f12816n;

    /* renamed from: o  reason: collision with root package name */
    private PointF f12817o;

    /* renamed from: p  reason: collision with root package name */
    private PointF f12818p;

    /* renamed from: q  reason: collision with root package name */
    private PointF f12819q;

    /* renamed from: r  reason: collision with root package name */
    private PointF f12820r;

    /* renamed from: x  reason: collision with root package name */
    private float[] f12826x;

    /* renamed from: y  reason: collision with root package name */
    private final Context f12827y;

    /* renamed from: z  reason: collision with root package name */
    private int f12828z;

    /* renamed from: i  reason: collision with root package name */
    private Path f12811i = new Path();

    /* renamed from: s  reason: collision with root package name */
    private boolean f12821s = false;

    /* renamed from: t  reason: collision with root package name */
    private float f12822t = Float.NaN;

    /* renamed from: u  reason: collision with root package name */
    private final Paint f12823u = new Paint(1);

    /* renamed from: v  reason: collision with root package name */
    private int f12824v = 0;

    /* renamed from: w  reason: collision with root package name */
    private int f12825w = 255;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes3.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f12829a;

        static {
            int[] iArr = new int[c.values().length];
            f12829a = iArr;
            try {
                iArr[c.SOLID.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12829a[c.DASHED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12829a[c.DOTTED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* loaded from: classes3.dex */
    public enum b {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_RIGHT,
        BOTTOM_LEFT,
        TOP_START,
        TOP_END,
        BOTTOM_START,
        BOTTOM_END
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes3.dex */
    public enum c {
        SOLID,
        DASHED,
        DOTTED;

        public static PathEffect getPathEffect(c cVar, float f11) {
            int i11 = a.f12829a[cVar.ordinal()];
            if (i11 == 2) {
                float f12 = f11 * 3.0f;
                return new DashPathEffect(new float[]{f12, f12, f12, f12}, BitmapDescriptorFactory.HUE_RED);
            } else if (i11 != 3) {
                return null;
            } else {
                return new DashPathEffect(new float[]{f11, f11, f11, f11}, BitmapDescriptorFactory.HUE_RED);
            }
        }
    }

    public e(Context context) {
        this.f12827y = context;
    }

    private void B() {
        float f11;
        float f12;
        float max;
        float max2;
        float max3;
        float max4;
        float max5;
        float max6;
        float max7;
        float max8;
        if (this.f12821s) {
            this.f12821s = false;
            if (this.f12807e == null) {
                this.f12807e = new Path();
            }
            if (this.f12808f == null) {
                this.f12808f = new Path();
            }
            if (this.f12809g == null) {
                this.f12809g = new Path();
            }
            if (this.f12812j == null) {
                this.f12812j = new Path();
            }
            if (this.f12813k == null) {
                this.f12813k = new RectF();
            }
            if (this.f12814l == null) {
                this.f12814l = new RectF();
            }
            if (this.f12815m == null) {
                this.f12815m = new RectF();
            }
            if (this.f12816n == null) {
                this.f12816n = new RectF();
            }
            this.f12807e.reset();
            this.f12808f.reset();
            this.f12809g.reset();
            this.f12812j.reset();
            this.f12813k.set(getBounds());
            this.f12814l.set(getBounds());
            this.f12815m.set(getBounds());
            this.f12816n.set(getBounds());
            RectF k11 = k();
            RectF rectF = this.f12813k;
            rectF.top += k11.top;
            rectF.bottom -= k11.bottom;
            rectF.left += k11.left;
            rectF.right -= k11.right;
            RectF rectF2 = this.f12816n;
            rectF2.top += k11.top * 0.5f;
            rectF2.bottom -= k11.bottom * 0.5f;
            rectF2.left += k11.left * 0.5f;
            rectF2.right -= k11.right * 0.5f;
            float m11 = m();
            float h11 = h(m11, b.TOP_LEFT);
            float h12 = h(m11, b.TOP_RIGHT);
            float h13 = h(m11, b.BOTTOM_LEFT);
            float h14 = h(m11, b.BOTTOM_RIGHT);
            boolean z11 = o() == 1;
            float g11 = g(b.TOP_START);
            float g12 = g(b.TOP_END);
            float g13 = g(b.BOTTOM_START);
            float g14 = g(b.BOTTOM_END);
            if (jg.a.d().b(this.f12827y)) {
                if (!com.facebook.yoga.g.a(g11)) {
                    h11 = g11;
                }
                if (!com.facebook.yoga.g.a(g12)) {
                    h12 = g12;
                }
                if (!com.facebook.yoga.g.a(g13)) {
                    h13 = g13;
                }
                if (!com.facebook.yoga.g.a(g14)) {
                    h14 = g14;
                }
                f11 = z11 ? h12 : h11;
                if (!z11) {
                    h11 = h12;
                }
                f12 = z11 ? h14 : h13;
                if (z11) {
                    h14 = h13;
                }
            } else {
                float f13 = z11 ? g12 : g11;
                if (!z11) {
                    g11 = g12;
                }
                float f14 = z11 ? g14 : g13;
                if (!z11) {
                    g13 = g14;
                }
                if (!com.facebook.yoga.g.a(f13)) {
                    h11 = f13;
                }
                if (!com.facebook.yoga.g.a(g11)) {
                    h12 = g11;
                }
                if (!com.facebook.yoga.g.a(f14)) {
                    h13 = f14;
                }
                f11 = h11;
                h11 = h12;
                f12 = h13;
                if (!com.facebook.yoga.g.a(g13)) {
                    h14 = g13;
                }
            }
            float f15 = f12;
            this.f12807e.addRoundRect(this.f12813k, new float[]{Math.max(f11 - k11.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f11 - k11.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(h11 - k11.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(h11 - k11.top, (float) BitmapDescriptorFactory.HUE_RED), Math.max(h14 - k11.right, (float) BitmapDescriptorFactory.HUE_RED), Math.max(h14 - k11.bottom, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f12 - k11.left, (float) BitmapDescriptorFactory.HUE_RED), Math.max(f12 - k11.bottom, (float) BitmapDescriptorFactory.HUE_RED)}, Path.Direction.CW);
            this.f12808f.addRoundRect(this.f12814l, new float[]{f11, f11, h11, h11, h14, h14, f15, f15}, Path.Direction.CW);
            l0 l0Var = this.f12803a;
            float a11 = l0Var != null ? l0Var.a(8) / 2.0f : BitmapDescriptorFactory.HUE_RED;
            float f16 = f11 + a11;
            float f17 = h11 + a11;
            float f18 = h14 + a11;
            float f19 = f15 + a11;
            this.f12809g.addRoundRect(this.f12815m, new float[]{f16, f16, f17, f17, f18, f18, f19, f19}, Path.Direction.CW);
            Path path = this.f12812j;
            RectF rectF3 = this.f12816n;
            float[] fArr = new float[8];
            float f21 = k11.left;
            fArr[0] = Math.max(f11 - (f21 * 0.5f), f21 > BitmapDescriptorFactory.HUE_RED ? f11 / f21 : 0.0f);
            float f22 = k11.top;
            fArr[1] = Math.max(f11 - (f22 * 0.5f), f22 > BitmapDescriptorFactory.HUE_RED ? f11 / f22 : 0.0f);
            float f23 = k11.right;
            fArr[2] = Math.max(h11 - (f23 * 0.5f), f23 > BitmapDescriptorFactory.HUE_RED ? h11 / f23 : 0.0f);
            float f24 = k11.top;
            fArr[3] = Math.max(h11 - (f24 * 0.5f), f24 > BitmapDescriptorFactory.HUE_RED ? h11 / f24 : 0.0f);
            float f25 = k11.right;
            fArr[4] = Math.max(h14 - (f25 * 0.5f), f25 > BitmapDescriptorFactory.HUE_RED ? h14 / f25 : 0.0f);
            float f26 = k11.bottom;
            fArr[5] = Math.max(h14 - (f26 * 0.5f), f26 > BitmapDescriptorFactory.HUE_RED ? h14 / f26 : 0.0f);
            float f27 = k11.left;
            fArr[6] = Math.max(f15 - (f27 * 0.5f), f27 > BitmapDescriptorFactory.HUE_RED ? f15 / f27 : 0.0f);
            float f28 = k11.bottom;
            fArr[7] = Math.max(f15 - (f28 * 0.5f), f28 > BitmapDescriptorFactory.HUE_RED ? f15 / f28 : 0.0f);
            path.addRoundRect(rectF3, fArr, Path.Direction.CW);
            if (this.f12817o == null) {
                this.f12817o = new PointF();
            }
            PointF pointF = this.f12817o;
            RectF rectF4 = this.f12813k;
            float f29 = rectF4.left;
            pointF.x = f29;
            float f31 = rectF4.top;
            pointF.y = f31;
            RectF rectF5 = this.f12814l;
            l(f29, f31, (max * 2.0f) + f29, (max2 * 2.0f) + f31, rectF5.left, rectF5.top, f29, f31, pointF);
            if (this.f12820r == null) {
                this.f12820r = new PointF();
            }
            PointF pointF2 = this.f12820r;
            RectF rectF6 = this.f12813k;
            float f32 = rectF6.left;
            pointF2.x = f32;
            float f33 = rectF6.bottom;
            pointF2.y = f33;
            RectF rectF7 = this.f12814l;
            l(f32, f33 - (max8 * 2.0f), (max7 * 2.0f) + f32, f33, rectF7.left, rectF7.bottom, f32, f33, pointF2);
            if (this.f12818p == null) {
                this.f12818p = new PointF();
            }
            PointF pointF3 = this.f12818p;
            RectF rectF8 = this.f12813k;
            float f34 = rectF8.right;
            pointF3.x = f34;
            float f35 = rectF8.top;
            pointF3.y = f35;
            RectF rectF9 = this.f12814l;
            l(f34 - (max3 * 2.0f), f35, f34, (max4 * 2.0f) + f35, rectF9.right, rectF9.top, f34, f35, pointF3);
            if (this.f12819q == null) {
                this.f12819q = new PointF();
            }
            PointF pointF4 = this.f12819q;
            RectF rectF10 = this.f12813k;
            float f36 = rectF10.right;
            pointF4.x = f36;
            float f37 = rectF10.bottom;
            pointF4.y = f37;
            RectF rectF11 = this.f12814l;
            l(f36 - (max5 * 2.0f), f37 - (2.0f * max6), f36, f37, rectF11.right, rectF11.bottom, f36, f37, pointF4);
        }
    }

    private void C() {
        c cVar = this.f12806d;
        this.f12823u.setPathEffect(cVar != null ? c.getPathEffect(cVar, n()) : null);
    }

    private void D(int i11) {
        c cVar = this.f12806d;
        this.f12823u.setPathEffect(cVar != null ? c.getPathEffect(cVar, i11) : null);
    }

    private static int a(float f11, float f12) {
        return ((((int) f11) << 24) & (-16777216)) | (((int) f12) & 16777215);
    }

    private void b(Canvas canvas, int i11, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18) {
        if (i11 == 0) {
            return;
        }
        if (this.f12810h == null) {
            this.f12810h = new Path();
        }
        this.f12823u.setColor(i11);
        this.f12810h.reset();
        this.f12810h.moveTo(f11, f12);
        this.f12810h.lineTo(f13, f14);
        this.f12810h.lineTo(f15, f16);
        this.f12810h.lineTo(f17, f18);
        this.f12810h.lineTo(f11, f12);
        canvas.drawPath(this.f12810h, this.f12823u);
    }

    private void c(Canvas canvas) {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        this.f12823u.setStyle(Paint.Style.FILL);
        int b11 = com.facebook.react.views.view.b.b(this.f12824v, this.f12825w);
        if (Color.alpha(b11) != 0) {
            this.f12823u.setColor(b11);
            canvas.drawRect(getBounds(), this.f12823u);
        }
        RectF k11 = k();
        int round = Math.round(k11.left);
        int round2 = Math.round(k11.top);
        int round3 = Math.round(k11.right);
        int round4 = Math.round(k11.bottom);
        if (round > 0 || round3 > 0 || round2 > 0 || round4 > 0) {
            Rect bounds = getBounds();
            int f11 = f(0);
            int f12 = f(1);
            int f13 = f(2);
            int f14 = f(3);
            boolean z11 = o() == 1;
            int f15 = f(4);
            int f16 = f(5);
            if (jg.a.d().b(this.f12827y)) {
                if (q(4)) {
                    f11 = f15;
                }
                if (q(5)) {
                    f13 = f16;
                }
                int i18 = z11 ? f13 : f11;
                if (!z11) {
                    f11 = f13;
                }
                i12 = f11;
                i11 = i18;
            } else {
                int i19 = z11 ? f16 : f15;
                if (!z11) {
                    f15 = f16;
                }
                boolean q11 = q(4);
                boolean q12 = q(5);
                boolean z12 = z11 ? q12 : q11;
                if (!z11) {
                    q11 = q12;
                }
                if (z12) {
                    f11 = i19;
                }
                i11 = f11;
                i12 = q11 ? f15 : f13;
            }
            int i21 = bounds.left;
            int i22 = bounds.top;
            int e11 = e(round, round2, round3, round4, i11, f12, i12, f14);
            if (e11 != 0) {
                if (Color.alpha(e11) != 0) {
                    int i23 = bounds.right;
                    int i24 = bounds.bottom;
                    this.f12823u.setColor(e11);
                    this.f12823u.setStyle(Paint.Style.STROKE);
                    if (round > 0) {
                        this.f12811i.reset();
                        int round5 = Math.round(k11.left);
                        D(round5);
                        this.f12823u.setStrokeWidth(round5);
                        float f17 = i21 + (round5 / 2);
                        this.f12811i.moveTo(f17, i22);
                        this.f12811i.lineTo(f17, i24);
                        canvas.drawPath(this.f12811i, this.f12823u);
                    }
                    if (round2 > 0) {
                        this.f12811i.reset();
                        int round6 = Math.round(k11.top);
                        D(round6);
                        this.f12823u.setStrokeWidth(round6);
                        float f18 = i22 + (round6 / 2);
                        this.f12811i.moveTo(i21, f18);
                        this.f12811i.lineTo(i23, f18);
                        canvas.drawPath(this.f12811i, this.f12823u);
                    }
                    if (round3 > 0) {
                        this.f12811i.reset();
                        int round7 = Math.round(k11.right);
                        D(round7);
                        this.f12823u.setStrokeWidth(round7);
                        float f19 = i23 - (round7 / 2);
                        this.f12811i.moveTo(f19, i22);
                        this.f12811i.lineTo(f19, i24);
                        canvas.drawPath(this.f12811i, this.f12823u);
                    }
                    if (round4 > 0) {
                        this.f12811i.reset();
                        int round8 = Math.round(k11.bottom);
                        D(round8);
                        this.f12823u.setStrokeWidth(round8);
                        float f21 = i24 - (round8 / 2);
                        this.f12811i.moveTo(i21, f21);
                        this.f12811i.lineTo(i23, f21);
                        canvas.drawPath(this.f12811i, this.f12823u);
                        return;
                    }
                    return;
                }
                return;
            }
            this.f12823u.setAntiAlias(false);
            int width = bounds.width();
            int height = bounds.height();
            if (round > 0) {
                float f22 = i21;
                float f23 = i21 + round;
                i13 = i22;
                b(canvas, i11, f22, i22, f23, i22 + round2, f23, i17 - round4, f22, i22 + height);
            } else {
                i13 = i22;
            }
            if (round2 > 0) {
                float f24 = i13;
                float f25 = i13 + round2;
                b(canvas, f12, i21, f24, i21 + round, f25, i16 - round3, f25, i21 + width, f24);
            }
            if (round3 > 0) {
                int i25 = i21 + width;
                float f26 = i25;
                float f27 = i25 - round3;
                b(canvas, i12, f26, i13, f26, i13 + height, f27, i15 - round4, f27, i13 + round2);
            }
            if (round4 > 0) {
                int i26 = i13 + height;
                float f28 = i26;
                float f29 = i26 - round4;
                b(canvas, f14, i21, f28, i21 + width, f28, i14 - round3, f29, i21 + round, f29);
            }
            this.f12823u.setAntiAlias(true);
        }
    }

    private void d(Canvas canvas) {
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        B();
        canvas.save();
        int b11 = com.facebook.react.views.view.b.b(this.f12824v, this.f12825w);
        if (Color.alpha(b11) != 0) {
            this.f12823u.setColor(b11);
            this.f12823u.setStyle(Paint.Style.FILL);
            canvas.drawPath(this.f12807e, this.f12823u);
        }
        RectF k11 = k();
        int f15 = f(0);
        int f16 = f(1);
        int f17 = f(2);
        int f18 = f(3);
        if (k11.top > BitmapDescriptorFactory.HUE_RED || k11.bottom > BitmapDescriptorFactory.HUE_RED || k11.left > BitmapDescriptorFactory.HUE_RED || k11.right > BitmapDescriptorFactory.HUE_RED) {
            float n11 = n();
            int f19 = f(8);
            if (k11.top != n11 || k11.bottom != n11 || k11.left != n11 || k11.right != n11 || f15 != f19 || f16 != f19 || f17 != f19 || f18 != f19) {
                this.f12823u.setStyle(Paint.Style.FILL);
                canvas.clipPath(this.f12808f, Region.Op.INTERSECT);
                canvas.clipPath(this.f12807e, Region.Op.DIFFERENCE);
                boolean z11 = o() == 1;
                int f21 = f(4);
                int f22 = f(5);
                if (jg.a.d().b(this.f12827y)) {
                    if (q(4)) {
                        f15 = f21;
                    }
                    if (q(5)) {
                        f17 = f22;
                    }
                    i11 = z11 ? f17 : f15;
                    if (!z11) {
                        f15 = f17;
                    }
                    i12 = f15;
                } else {
                    int i13 = z11 ? f22 : f21;
                    if (!z11) {
                        f21 = f22;
                    }
                    boolean q11 = q(4);
                    boolean q12 = q(5);
                    boolean z12 = z11 ? q12 : q11;
                    if (!z11) {
                        q11 = q12;
                    }
                    if (z12) {
                        f15 = i13;
                    }
                    if (q11) {
                        i11 = f15;
                        i12 = f21;
                    } else {
                        i11 = f15;
                        i12 = f17;
                    }
                }
                RectF rectF = this.f12814l;
                float f23 = rectF.left;
                float f24 = rectF.right;
                float f25 = rectF.top;
                float f26 = rectF.bottom;
                if (k11.left > BitmapDescriptorFactory.HUE_RED) {
                    PointF pointF = this.f12817o;
                    float f27 = pointF.x;
                    float f28 = pointF.y;
                    PointF pointF2 = this.f12820r;
                    f11 = f26;
                    f12 = f25;
                    f13 = f24;
                    f14 = f23;
                    b(canvas, i11, f23, f25, f27, f28, pointF2.x, pointF2.y, f23, f11);
                } else {
                    f11 = f26;
                    f12 = f25;
                    f13 = f24;
                    f14 = f23;
                }
                if (k11.top > BitmapDescriptorFactory.HUE_RED) {
                    PointF pointF3 = this.f12817o;
                    float f29 = pointF3.x;
                    float f31 = pointF3.y;
                    PointF pointF4 = this.f12818p;
                    b(canvas, f16, f14, f12, f29, f31, pointF4.x, pointF4.y, f13, f12);
                }
                if (k11.right > BitmapDescriptorFactory.HUE_RED) {
                    PointF pointF5 = this.f12818p;
                    float f32 = pointF5.x;
                    float f33 = pointF5.y;
                    PointF pointF6 = this.f12819q;
                    b(canvas, i12, f13, f12, f32, f33, pointF6.x, pointF6.y, f13, f11);
                }
                if (k11.bottom > BitmapDescriptorFactory.HUE_RED) {
                    PointF pointF7 = this.f12820r;
                    float f34 = pointF7.x;
                    float f35 = pointF7.y;
                    PointF pointF8 = this.f12819q;
                    b(canvas, f18, f14, f11, f34, f35, pointF8.x, pointF8.y, f13, f11);
                }
            } else if (n11 > BitmapDescriptorFactory.HUE_RED) {
                this.f12823u.setColor(com.facebook.react.views.view.b.b(f19, this.f12825w));
                this.f12823u.setStyle(Paint.Style.STROKE);
                this.f12823u.setStrokeWidth(n11);
                canvas.drawPath(this.f12812j, this.f12823u);
            }
        }
        canvas.restore();
    }

    private static int e(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        int i19 = (i14 > 0 ? i18 : -1) & (i11 > 0 ? i15 : -1) & (i12 > 0 ? i16 : -1) & (i13 > 0 ? i17 : -1);
        if (i11 <= 0) {
            i15 = 0;
        }
        if (i12 <= 0) {
            i16 = 0;
        }
        int i21 = i15 | i16;
        if (i13 <= 0) {
            i17 = 0;
        }
        int i22 = i21 | i17;
        if (i14 <= 0) {
            i18 = 0;
        }
        if (i19 == (i22 | i18)) {
            return i19;
        }
        return 0;
    }

    private int f(int i11) {
        l0 l0Var = this.f12804b;
        float a11 = l0Var != null ? l0Var.a(i11) : BitmapDescriptorFactory.HUE_RED;
        l0 l0Var2 = this.f12805c;
        return a(l0Var2 != null ? l0Var2.a(i11) : 255.0f, a11);
    }

    private static void l(double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18, PointF pointF) {
        double d19 = (d11 + d13) / 2.0d;
        double d21 = (d12 + d14) / 2.0d;
        double d22 = d15 - d19;
        double d23 = d16 - d21;
        double abs = Math.abs(d13 - d11) / 2.0d;
        double abs2 = Math.abs(d14 - d12) / 2.0d;
        double d24 = ((d18 - d21) - d23) / ((d17 - d19) - d22);
        double d25 = d23 - (d22 * d24);
        double d26 = abs2 * abs2;
        double d27 = abs * abs;
        double d28 = d26 + (d27 * d24 * d24);
        double d29 = abs * 2.0d * abs * d25 * d24;
        double d31 = (-(d27 * ((d25 * d25) - d26))) / d28;
        double d32 = d28 * 2.0d;
        double sqrt = ((-d29) / d32) - Math.sqrt(d31 + Math.pow(d29 / d32, 2.0d));
        double d33 = sqrt + d19;
        double d34 = (d24 * sqrt) + d25 + d21;
        if (Double.isNaN(d33) || Double.isNaN(d34)) {
            return;
        }
        pointF.x = (float) d33;
        pointF.y = (float) d34;
    }

    private boolean q(int i11) {
        l0 l0Var = this.f12804b;
        float a11 = l0Var != null ? l0Var.a(i11) : Float.NaN;
        l0 l0Var2 = this.f12805c;
        return (com.facebook.yoga.g.a(a11) || com.facebook.yoga.g.a(l0Var2 != null ? l0Var2.a(i11) : Float.NaN)) ? false : true;
    }

    private void s(int i11, float f11) {
        if (this.f12805c == null) {
            this.f12805c = new l0(255.0f);
        }
        if (com.facebook.react.uimanager.e.a(this.f12805c.b(i11), f11)) {
            return;
        }
        this.f12805c.d(i11, f11);
        invalidateSelf();
    }

    private void u(int i11, float f11) {
        if (this.f12804b == null) {
            this.f12804b = new l0(BitmapDescriptorFactory.HUE_RED);
        }
        if (com.facebook.react.uimanager.e.a(this.f12804b.b(i11), f11)) {
            return;
        }
        this.f12804b.d(i11, f11);
        invalidateSelf();
    }

    public boolean A(int i11) {
        if (this.f12828z != i11) {
            this.f12828z = i11;
            return r(i11);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C();
        if (!p()) {
            c(canvas);
        } else {
            d(canvas);
        }
    }

    public float g(b bVar) {
        return h(Float.NaN, bVar);
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f12825w;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return com.facebook.react.views.view.b.a(com.facebook.react.views.view.b.b(this.f12824v, this.f12825w));
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if ((!com.facebook.yoga.g.a(this.f12822t) && this.f12822t > BitmapDescriptorFactory.HUE_RED) || this.f12826x != null) {
            B();
            outline.setConvexPath(this.f12809g);
            return;
        }
        outline.setRect(getBounds());
    }

    public float h(float f11, b bVar) {
        float[] fArr = this.f12826x;
        if (fArr == null) {
            return f11;
        }
        float f12 = fArr[bVar.ordinal()];
        return com.facebook.yoga.g.a(f12) ? f11 : f12;
    }

    public float i(float f11, int i11) {
        l0 l0Var = this.f12803a;
        if (l0Var == null) {
            return f11;
        }
        float b11 = l0Var.b(i11);
        return com.facebook.yoga.g.a(b11) ? f11 : b11;
    }

    public int j() {
        return this.f12824v;
    }

    public RectF k() {
        float i11 = i(BitmapDescriptorFactory.HUE_RED, 8);
        float i12 = i(i11, 1);
        float i13 = i(i11, 3);
        float i14 = i(i11, 0);
        float i15 = i(i11, 2);
        if (this.f12803a != null) {
            boolean z11 = o() == 1;
            float b11 = this.f12803a.b(4);
            float b12 = this.f12803a.b(5);
            if (jg.a.d().b(this.f12827y)) {
                if (!com.facebook.yoga.g.a(b11)) {
                    i14 = b11;
                }
                if (!com.facebook.yoga.g.a(b12)) {
                    i15 = b12;
                }
                float f11 = z11 ? i15 : i14;
                if (z11) {
                    i15 = i14;
                }
                i14 = f11;
            } else {
                float f12 = z11 ? b12 : b11;
                if (!z11) {
                    b11 = b12;
                }
                if (!com.facebook.yoga.g.a(f12)) {
                    i14 = f12;
                }
                if (!com.facebook.yoga.g.a(b11)) {
                    i15 = b11;
                }
            }
        }
        return new RectF(i14, i12, i15, i13);
    }

    public float m() {
        return com.facebook.yoga.g.a(this.f12822t) ? BitmapDescriptorFactory.HUE_RED : this.f12822t;
    }

    public float n() {
        l0 l0Var = this.f12803a;
        return (l0Var == null || com.facebook.yoga.g.a(l0Var.b(8))) ? BitmapDescriptorFactory.HUE_RED : this.f12803a.b(8);
    }

    public int o() {
        return this.f12828z;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f12821s = true;
    }

    public boolean p() {
        if (com.facebook.yoga.g.a(this.f12822t) || this.f12822t <= BitmapDescriptorFactory.HUE_RED) {
            float[] fArr = this.f12826x;
            if (fArr != null) {
                for (float f11 : fArr) {
                    if (!com.facebook.yoga.g.a(f11) && f11 > BitmapDescriptorFactory.HUE_RED) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public boolean r(int i11) {
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f12825w) {
            this.f12825w = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    public void t(int i11, float f11, float f12) {
        u(i11, f11);
        s(i11, f12);
    }

    public void v(String str) {
        c valueOf = str == null ? null : c.valueOf(str.toUpperCase(Locale.US));
        if (this.f12806d != valueOf) {
            this.f12806d = valueOf;
            this.f12821s = true;
            invalidateSelf();
        }
    }

    public void w(int i11, float f11) {
        if (this.f12803a == null) {
            this.f12803a = new l0();
        }
        if (com.facebook.react.uimanager.e.a(this.f12803a.b(i11), f11)) {
            return;
        }
        this.f12803a.d(i11, f11);
        if (i11 == 0 || i11 == 1 || i11 == 2 || i11 == 3 || i11 == 4 || i11 == 5 || i11 == 8) {
            this.f12821s = true;
        }
        invalidateSelf();
    }

    public void x(int i11) {
        this.f12824v = i11;
        invalidateSelf();
    }

    public void y(float f11) {
        if (com.facebook.react.uimanager.e.a(this.f12822t, f11)) {
            return;
        }
        this.f12822t = f11;
        this.f12821s = true;
        invalidateSelf();
    }

    public void z(float f11, int i11) {
        if (this.f12826x == null) {
            float[] fArr = new float[8];
            this.f12826x = fArr;
            Arrays.fill(fArr, Float.NaN);
        }
        if (com.facebook.react.uimanager.e.a(this.f12826x[i11], f11)) {
            return;
        }
        this.f12826x[i11] = f11;
        this.f12821s = true;
        invalidateSelf();
    }
}