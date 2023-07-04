package com.google.android.material.chip;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.TextUtils;
import android.util.AttributeSet;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.internal.h;
import com.google.android.material.internal.j;
import com.google.android.material.internal.l;
import fk.k;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import tk.c;
import tk.d;
import uk.b;
import wk.g;

/* loaded from: classes3.dex */
public class a extends g implements Drawable.Callback, h.b {
    private static final int[] T3 = {16842910};
    private static final ShapeDrawable U3 = new ShapeDrawable(new OvalShape());
    private int A3;
    private int B3;
    private int C3;
    private int D3;
    private ColorStateList E;
    private boolean E3;
    private ColorStateList F;
    private int F3;
    private float G;
    private int G3;
    private float H;
    private ColorFilter H3;
    private PorterDuffColorFilter I3;
    private ColorStateList J3;
    private ColorStateList K;
    private PorterDuff.Mode K3;
    private float L;
    private int[] L3;
    private boolean M3;
    private ColorStateList N3;
    private ColorStateList O;
    private WeakReference<InterfaceC0272a> O3;
    private CharSequence P;
    private TextUtils.TruncateAt P3;
    private boolean Q;
    private float Q1;
    private gk.h Q2;
    private boolean Q3;
    private Drawable R;
    private int R3;
    private boolean S3;
    private ColorStateList T;
    private CharSequence V1;
    private float Y;

    /* renamed from: b1  reason: collision with root package name */
    private boolean f15128b1;

    /* renamed from: b2  reason: collision with root package name */
    private boolean f15129b2;

    /* renamed from: g1  reason: collision with root package name */
    private boolean f15130g1;

    /* renamed from: g2  reason: collision with root package name */
    private boolean f15131g2;

    /* renamed from: i3  reason: collision with root package name */
    private float f15132i3;

    /* renamed from: j3  reason: collision with root package name */
    private float f15133j3;

    /* renamed from: k3  reason: collision with root package name */
    private float f15134k3;

    /* renamed from: l3  reason: collision with root package name */
    private float f15135l3;

    /* renamed from: m3  reason: collision with root package name */
    private float f15136m3;

    /* renamed from: n3  reason: collision with root package name */
    private float f15137n3;

    /* renamed from: o3  reason: collision with root package name */
    private float f15138o3;

    /* renamed from: p1  reason: collision with root package name */
    private Drawable f15139p1;

    /* renamed from: p2  reason: collision with root package name */
    private Drawable f15140p2;

    /* renamed from: p3  reason: collision with root package name */
    private float f15141p3;

    /* renamed from: q3  reason: collision with root package name */
    private final Context f15142q3;

    /* renamed from: r3  reason: collision with root package name */
    private final Paint f15143r3;

    /* renamed from: s3  reason: collision with root package name */
    private final Paint f15144s3;

    /* renamed from: t3  reason: collision with root package name */
    private final Paint.FontMetrics f15145t3;

    /* renamed from: u3  reason: collision with root package name */
    private final RectF f15146u3;

    /* renamed from: v3  reason: collision with root package name */
    private final PointF f15147v3;

    /* renamed from: w3  reason: collision with root package name */
    private final Path f15148w3;

    /* renamed from: x1  reason: collision with root package name */
    private Drawable f15149x1;

    /* renamed from: x2  reason: collision with root package name */
    private ColorStateList f15150x2;

    /* renamed from: x3  reason: collision with root package name */
    private final h f15151x3;

    /* renamed from: y1  reason: collision with root package name */
    private ColorStateList f15152y1;

    /* renamed from: y2  reason: collision with root package name */
    private gk.h f15153y2;

    /* renamed from: y3  reason: collision with root package name */
    private int f15154y3;

    /* renamed from: z3  reason: collision with root package name */
    private int f15155z3;

    /* renamed from: com.google.android.material.chip.a$a  reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    public interface InterfaceC0272a {
        void a();
    }

    private a(Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        this.H = -1.0f;
        this.f15143r3 = new Paint(1);
        this.f15145t3 = new Paint.FontMetrics();
        this.f15146u3 = new RectF();
        this.f15147v3 = new PointF();
        this.f15148w3 = new Path();
        this.G3 = 255;
        this.K3 = PorterDuff.Mode.SRC_IN;
        this.O3 = new WeakReference<>(null);
        O(context);
        this.f15142q3 = context;
        h hVar = new h(this);
        this.f15151x3 = hVar;
        this.P = "";
        hVar.e().density = context.getResources().getDisplayMetrics().density;
        this.f15144s3 = null;
        int[] iArr = T3;
        setState(iArr);
        n2(iArr);
        this.Q3 = true;
        if (b.f53537a) {
            U3.setTint(-1);
        }
    }

    private void A0(Canvas canvas, Rect rect) {
        if (P2()) {
            n0(rect, this.f15146u3);
            RectF rectF = this.f15146u3;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.R.setBounds(0, 0, (int) this.f15146u3.width(), (int) this.f15146u3.height());
            this.R.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    private void B0(Canvas canvas, Rect rect) {
        if (this.L <= BitmapDescriptorFactory.HUE_RED || this.S3) {
            return;
        }
        this.f15143r3.setColor(this.B3);
        this.f15143r3.setStyle(Paint.Style.STROKE);
        if (!this.S3) {
            this.f15143r3.setColorFilter(n1());
        }
        RectF rectF = this.f15146u3;
        float f11 = this.L;
        rectF.set(rect.left + (f11 / 2.0f), rect.top + (f11 / 2.0f), rect.right - (f11 / 2.0f), rect.bottom - (f11 / 2.0f));
        float f12 = this.H - (this.L / 2.0f);
        canvas.drawRoundRect(this.f15146u3, f12, f12, this.f15143r3);
    }

    private void C0(Canvas canvas, Rect rect) {
        if (this.S3) {
            return;
        }
        this.f15143r3.setColor(this.f15154y3);
        this.f15143r3.setStyle(Paint.Style.FILL);
        this.f15146u3.set(rect);
        canvas.drawRoundRect(this.f15146u3, K0(), K0(), this.f15143r3);
    }

    private void D0(Canvas canvas, Rect rect) {
        if (Q2()) {
            q0(rect, this.f15146u3);
            RectF rectF = this.f15146u3;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.f15139p1.setBounds(0, 0, (int) this.f15146u3.width(), (int) this.f15146u3.height());
            if (b.f53537a) {
                this.f15149x1.setBounds(this.f15139p1.getBounds());
                this.f15149x1.jumpToCurrentState();
                this.f15149x1.draw(canvas);
            } else {
                this.f15139p1.draw(canvas);
            }
            canvas.translate(-f11, -f12);
        }
    }

    private void E0(Canvas canvas, Rect rect) {
        this.f15143r3.setColor(this.C3);
        this.f15143r3.setStyle(Paint.Style.FILL);
        this.f15146u3.set(rect);
        if (!this.S3) {
            canvas.drawRoundRect(this.f15146u3, K0(), K0(), this.f15143r3);
            return;
        }
        h(new RectF(rect), this.f15148w3);
        super.p(canvas, this.f15143r3, this.f15148w3, u());
    }

    private void F0(Canvas canvas, Rect rect) {
        Paint paint = this.f15144s3;
        if (paint != null) {
            paint.setColor(m3.a.k(-16777216, 127));
            canvas.drawRect(rect, this.f15144s3);
            if (P2() || O2()) {
                n0(rect, this.f15146u3);
                canvas.drawRect(this.f15146u3, this.f15144s3);
            }
            if (this.P != null) {
                canvas.drawLine(rect.left, rect.exactCenterY(), rect.right, rect.exactCenterY(), this.f15144s3);
            }
            if (Q2()) {
                q0(rect, this.f15146u3);
                canvas.drawRect(this.f15146u3, this.f15144s3);
            }
            this.f15144s3.setColor(m3.a.k(-65536, 127));
            p0(rect, this.f15146u3);
            canvas.drawRect(this.f15146u3, this.f15144s3);
            this.f15144s3.setColor(m3.a.k(-16711936, 127));
            r0(rect, this.f15146u3);
            canvas.drawRect(this.f15146u3, this.f15144s3);
        }
    }

    private void G0(Canvas canvas, Rect rect) {
        if (this.P != null) {
            Paint.Align v02 = v0(rect, this.f15147v3);
            t0(rect, this.f15146u3);
            if (this.f15151x3.d() != null) {
                this.f15151x3.e().drawableState = getState();
                this.f15151x3.j(this.f15142q3);
            }
            this.f15151x3.e().setTextAlign(v02);
            int i11 = 0;
            boolean z11 = Math.round(this.f15151x3.f(j1().toString())) > Math.round(this.f15146u3.width());
            if (z11) {
                i11 = canvas.save();
                canvas.clipRect(this.f15146u3);
            }
            CharSequence charSequence = this.P;
            if (z11 && this.P3 != null) {
                charSequence = TextUtils.ellipsize(charSequence, this.f15151x3.e(), this.f15146u3.width(), this.P3);
            }
            CharSequence charSequence2 = charSequence;
            int length = charSequence2.length();
            PointF pointF = this.f15147v3;
            canvas.drawText(charSequence2, 0, length, pointF.x, pointF.y, this.f15151x3.e());
            if (z11) {
                canvas.restoreToCount(i11);
            }
        }
    }

    private boolean O2() {
        return this.f15131g2 && this.f15140p2 != null && this.E3;
    }

    private boolean P2() {
        return this.Q && this.R != null;
    }

    private boolean Q2() {
        return this.f15130g1 && this.f15139p1 != null;
    }

    private void R2(Drawable drawable) {
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    private void S2() {
        this.N3 = this.M3 ? b.a(this.O) : null;
    }

    private void T2() {
        this.f15149x1 = new RippleDrawable(b.a(h1()), this.f15139p1, U3);
    }

    private float b1() {
        Drawable drawable = this.E3 ? this.f15140p2 : this.R;
        float f11 = this.Y;
        if (f11 <= BitmapDescriptorFactory.HUE_RED && drawable != null) {
            f11 = (float) Math.ceil(l.b(this.f15142q3, 24));
            if (drawable.getIntrinsicHeight() <= f11) {
                return drawable.getIntrinsicHeight();
            }
        }
        return f11;
    }

    private float c1() {
        Drawable drawable = this.E3 ? this.f15140p2 : this.R;
        float f11 = this.Y;
        return (f11 > BitmapDescriptorFactory.HUE_RED || drawable == null) ? f11 : drawable.getIntrinsicWidth();
    }

    private void d2(ColorStateList colorStateList) {
        if (this.E != colorStateList) {
            this.E = colorStateList;
            onStateChange(getState());
        }
    }

    private void m0(Drawable drawable) {
        if (drawable == null) {
            return;
        }
        drawable.setCallback(this);
        n3.a.m(drawable, n3.a.f(this));
        drawable.setLevel(getLevel());
        drawable.setVisible(isVisible(), false);
        if (drawable == this.f15139p1) {
            if (drawable.isStateful()) {
                drawable.setState(Y0());
            }
            n3.a.o(drawable, this.f15152y1);
            return;
        }
        Drawable drawable2 = this.R;
        if (drawable == drawable2 && this.f15128b1) {
            n3.a.o(drawable2, this.T);
        }
        if (drawable.isStateful()) {
            drawable.setState(getState());
        }
    }

    private void n0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (P2() || O2()) {
            float f11 = this.f15132i3 + this.f15133j3;
            float c12 = c1();
            if (n3.a.f(this) == 0) {
                float f12 = rect.left + f11;
                rectF.left = f12;
                rectF.right = f12 + c12;
            } else {
                float f13 = rect.right - f11;
                rectF.right = f13;
                rectF.left = f13 - c12;
            }
            float b12 = b1();
            float exactCenterY = rect.exactCenterY() - (b12 / 2.0f);
            rectF.top = exactCenterY;
            rectF.bottom = exactCenterY + b12;
        }
    }

    private ColorFilter n1() {
        ColorFilter colorFilter = this.H3;
        return colorFilter != null ? colorFilter : this.I3;
    }

    private void p0(Rect rect, RectF rectF) {
        rectF.set(rect);
        if (Q2()) {
            float f11 = this.f15141p3 + this.f15138o3 + this.Q1 + this.f15137n3 + this.f15136m3;
            if (n3.a.f(this) == 0) {
                rectF.right = rect.right - f11;
            } else {
                rectF.left = rect.left + f11;
            }
        }
    }

    private static boolean p1(int[] iArr, int i11) {
        if (iArr == null) {
            return false;
        }
        for (int i12 : iArr) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    private void q0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f11 = this.f15141p3 + this.f15138o3;
            if (n3.a.f(this) == 0) {
                float f12 = rect.right - f11;
                rectF.right = f12;
                rectF.left = f12 - this.Q1;
            } else {
                float f13 = rect.left + f11;
                rectF.left = f13;
                rectF.right = f13 + this.Q1;
            }
            float exactCenterY = rect.exactCenterY();
            float f14 = this.Q1;
            float f15 = exactCenterY - (f14 / 2.0f);
            rectF.top = f15;
            rectF.bottom = f15 + f14;
        }
    }

    private void r0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (Q2()) {
            float f11 = this.f15141p3 + this.f15138o3 + this.Q1 + this.f15137n3 + this.f15136m3;
            if (n3.a.f(this) == 0) {
                float f12 = rect.right;
                rectF.right = f12;
                rectF.left = f12 - f11;
            } else {
                int i11 = rect.left;
                rectF.left = i11;
                rectF.right = i11 + f11;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private void t0(Rect rect, RectF rectF) {
        rectF.setEmpty();
        if (this.P != null) {
            float o02 = this.f15132i3 + o0() + this.f15135l3;
            float s02 = this.f15141p3 + s0() + this.f15136m3;
            if (n3.a.f(this) == 0) {
                rectF.left = rect.left + o02;
                rectF.right = rect.right - s02;
            } else {
                rectF.left = rect.left + s02;
                rectF.right = rect.right - o02;
            }
            rectF.top = rect.top;
            rectF.bottom = rect.bottom;
        }
    }

    private static boolean t1(ColorStateList colorStateList) {
        return colorStateList != null && colorStateList.isStateful();
    }

    private float u0() {
        this.f15151x3.e().getFontMetrics(this.f15145t3);
        Paint.FontMetrics fontMetrics = this.f15145t3;
        return (fontMetrics.descent + fontMetrics.ascent) / 2.0f;
    }

    private static boolean u1(Drawable drawable) {
        return drawable != null && drawable.isStateful();
    }

    private static boolean v1(d dVar) {
        return (dVar == null || dVar.i() == null || !dVar.i().isStateful()) ? false : true;
    }

    private boolean w0() {
        return this.f15131g2 && this.f15140p2 != null && this.f15129b2;
    }

    private void w1(AttributeSet attributeSet, int i11, int i12) {
        TypedArray h11 = j.h(this.f15142q3, attributeSet, k.R, i11, i12, new int[0]);
        this.S3 = h11.hasValue(k.D0);
        d2(c.a(this.f15142q3, h11, k.f26615q0));
        H1(c.a(this.f15142q3, h11, k.f26537d0));
        V1(h11.getDimension(k.f26585l0, BitmapDescriptorFactory.HUE_RED));
        int i13 = k.f26543e0;
        if (h11.hasValue(i13)) {
            J1(h11.getDimension(i13, BitmapDescriptorFactory.HUE_RED));
        }
        Z1(c.a(this.f15142q3, h11, k.f26603o0));
        b2(h11.getDimension(k.f26609p0, BitmapDescriptorFactory.HUE_RED));
        A2(c.a(this.f15142q3, h11, k.C0));
        F2(h11.getText(k.X));
        d f11 = c.f(this.f15142q3, h11, k.S);
        f11.l(h11.getDimension(k.T, f11.j()));
        G2(f11);
        int i14 = h11.getInt(k.V, 0);
        if (i14 == 1) {
            s2(TextUtils.TruncateAt.START);
        } else if (i14 == 2) {
            s2(TextUtils.TruncateAt.MIDDLE);
        } else if (i14 == 3) {
            s2(TextUtils.TruncateAt.END);
        }
        U1(h11.getBoolean(k.f26579k0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "chipIconVisible") == null) {
            U1(h11.getBoolean(k.f26561h0, false));
        }
        N1(c.d(this.f15142q3, h11, k.f26555g0));
        int i15 = k.f26573j0;
        if (h11.hasValue(i15)) {
            R1(c.a(this.f15142q3, h11, i15));
        }
        P1(h11.getDimension(k.f26567i0, -1.0f));
        q2(h11.getBoolean(k.f26657x0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "closeIconVisible") == null) {
            q2(h11.getBoolean(k.f26627s0, false));
        }
        e2(c.d(this.f15142q3, h11, k.f26621r0));
        o2(c.a(this.f15142q3, h11, k.f26651w0));
        j2(h11.getDimension(k.f26639u0, BitmapDescriptorFactory.HUE_RED));
        z1(h11.getBoolean(k.Y, false));
        G1(h11.getBoolean(k.f26531c0, false));
        if (attributeSet != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconEnabled") != null && attributeSet.getAttributeValue("http://schemas.android.com/apk/res-auto", "checkedIconVisible") == null) {
            G1(h11.getBoolean(k.f26519a0, false));
        }
        B1(c.d(this.f15142q3, h11, k.Z));
        int i16 = k.f26525b0;
        if (h11.hasValue(i16)) {
            D1(c.a(this.f15142q3, h11, i16));
        }
        D2(gk.h.b(this.f15142q3, h11, k.E0));
        t2(gk.h.b(this.f15142q3, h11, k.f26669z0));
        X1(h11.getDimension(k.f26597n0, BitmapDescriptorFactory.HUE_RED));
        x2(h11.getDimension(k.B0, BitmapDescriptorFactory.HUE_RED));
        v2(h11.getDimension(k.A0, BitmapDescriptorFactory.HUE_RED));
        K2(h11.getDimension(k.G0, BitmapDescriptorFactory.HUE_RED));
        I2(h11.getDimension(k.F0, BitmapDescriptorFactory.HUE_RED));
        l2(h11.getDimension(k.f26645v0, BitmapDescriptorFactory.HUE_RED));
        g2(h11.getDimension(k.f26633t0, BitmapDescriptorFactory.HUE_RED));
        L1(h11.getDimension(k.f26549f0, BitmapDescriptorFactory.HUE_RED));
        z2(h11.getDimensionPixelSize(k.W, Integer.MAX_VALUE));
        h11.recycle();
    }

    public static a x0(Context context, AttributeSet attributeSet, int i11, int i12) {
        a aVar = new a(context, attributeSet, i11, i12);
        aVar.w1(attributeSet, i11, i12);
        return aVar;
    }

    private void y0(Canvas canvas, Rect rect) {
        if (O2()) {
            n0(rect, this.f15146u3);
            RectF rectF = this.f15146u3;
            float f11 = rectF.left;
            float f12 = rectF.top;
            canvas.translate(f11, f12);
            this.f15140p2.setBounds(0, 0, (int) this.f15146u3.width(), (int) this.f15146u3.height());
            this.f15140p2.draw(canvas);
            canvas.translate(-f11, -f12);
        }
    }

    private boolean y1(int[] iArr, int[] iArr2) {
        boolean z11;
        boolean onStateChange = super.onStateChange(iArr);
        ColorStateList colorStateList = this.E;
        int l11 = l(colorStateList != null ? colorStateList.getColorForState(iArr, this.f15154y3) : 0);
        boolean z12 = true;
        if (this.f15154y3 != l11) {
            this.f15154y3 = l11;
            onStateChange = true;
        }
        ColorStateList colorStateList2 = this.F;
        int l12 = l(colorStateList2 != null ? colorStateList2.getColorForState(iArr, this.f15155z3) : 0);
        if (this.f15155z3 != l12) {
            this.f15155z3 = l12;
            onStateChange = true;
        }
        int g11 = kk.a.g(l11, l12);
        if ((this.A3 != g11) | (x() == null)) {
            this.A3 = g11;
            Y(ColorStateList.valueOf(g11));
            onStateChange = true;
        }
        ColorStateList colorStateList3 = this.K;
        int colorForState = colorStateList3 != null ? colorStateList3.getColorForState(iArr, this.B3) : 0;
        if (this.B3 != colorForState) {
            this.B3 = colorForState;
            onStateChange = true;
        }
        int colorForState2 = (this.N3 == null || !b.b(iArr)) ? 0 : this.N3.getColorForState(iArr, this.C3);
        if (this.C3 != colorForState2) {
            this.C3 = colorForState2;
            if (this.M3) {
                onStateChange = true;
            }
        }
        int colorForState3 = (this.f15151x3.d() == null || this.f15151x3.d().i() == null) ? 0 : this.f15151x3.d().i().getColorForState(iArr, this.D3);
        if (this.D3 != colorForState3) {
            this.D3 = colorForState3;
            onStateChange = true;
        }
        boolean z13 = p1(getState(), 16842912) && this.f15129b2;
        if (this.E3 == z13 || this.f15140p2 == null) {
            z11 = false;
        } else {
            float o02 = o0();
            this.E3 = z13;
            if (o02 != o0()) {
                onStateChange = true;
                z11 = true;
            } else {
                z11 = false;
                onStateChange = true;
            }
        }
        ColorStateList colorStateList4 = this.J3;
        int colorForState4 = colorStateList4 != null ? colorStateList4.getColorForState(iArr, this.F3) : 0;
        if (this.F3 != colorForState4) {
            this.F3 = colorForState4;
            this.I3 = mk.a.a(this, this.J3, this.K3);
        } else {
            z12 = onStateChange;
        }
        if (u1(this.R)) {
            z12 |= this.R.setState(iArr);
        }
        if (u1(this.f15140p2)) {
            z12 |= this.f15140p2.setState(iArr);
        }
        if (u1(this.f15139p1)) {
            int[] iArr3 = new int[iArr.length + iArr2.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            System.arraycopy(iArr2, 0, iArr3, iArr.length, iArr2.length);
            z12 |= this.f15139p1.setState(iArr3);
        }
        if (b.f53537a && u1(this.f15149x1)) {
            z12 |= this.f15149x1.setState(iArr2);
        }
        if (z12) {
            invalidateSelf();
        }
        if (z11) {
            x1();
        }
        return z12;
    }

    private void z0(Canvas canvas, Rect rect) {
        if (this.S3) {
            return;
        }
        this.f15143r3.setColor(this.f15155z3);
        this.f15143r3.setStyle(Paint.Style.FILL);
        this.f15143r3.setColorFilter(n1());
        this.f15146u3.set(rect);
        canvas.drawRoundRect(this.f15146u3, K0(), K0(), this.f15143r3);
    }

    public void A1(int i11) {
        z1(this.f15142q3.getResources().getBoolean(i11));
    }

    public void A2(ColorStateList colorStateList) {
        if (this.O != colorStateList) {
            this.O = colorStateList;
            S2();
            onStateChange(getState());
        }
    }

    public void B1(Drawable drawable) {
        if (this.f15140p2 != drawable) {
            float o02 = o0();
            this.f15140p2 = drawable;
            float o03 = o0();
            R2(this.f15140p2);
            m0(this.f15140p2);
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void B2(int i11) {
        A2(h.a.c(this.f15142q3, i11));
    }

    public void C1(int i11) {
        B1(h.a.d(this.f15142q3, i11));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void C2(boolean z11) {
        this.Q3 = z11;
    }

    public void D1(ColorStateList colorStateList) {
        if (this.f15150x2 != colorStateList) {
            this.f15150x2 = colorStateList;
            if (w0()) {
                n3.a.o(this.f15140p2, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public void D2(gk.h hVar) {
        this.f15153y2 = hVar;
    }

    public void E1(int i11) {
        D1(h.a.c(this.f15142q3, i11));
    }

    public void E2(int i11) {
        D2(gk.h.c(this.f15142q3, i11));
    }

    public void F1(int i11) {
        G1(this.f15142q3.getResources().getBoolean(i11));
    }

    public void F2(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (TextUtils.equals(this.P, charSequence)) {
            return;
        }
        this.P = charSequence;
        this.f15151x3.i(true);
        invalidateSelf();
        x1();
    }

    public void G1(boolean z11) {
        if (this.f15131g2 != z11) {
            boolean O2 = O2();
            this.f15131g2 = z11;
            boolean O22 = O2();
            if (O2 != O22) {
                if (O22) {
                    m0(this.f15140p2);
                } else {
                    R2(this.f15140p2);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public void G2(d dVar) {
        this.f15151x3.h(dVar, this.f15142q3);
    }

    public Drawable H0() {
        return this.f15140p2;
    }

    public void H1(ColorStateList colorStateList) {
        if (this.F != colorStateList) {
            this.F = colorStateList;
            onStateChange(getState());
        }
    }

    public void H2(int i11) {
        G2(new d(this.f15142q3, i11));
    }

    public ColorStateList I0() {
        return this.f15150x2;
    }

    public void I1(int i11) {
        H1(h.a.c(this.f15142q3, i11));
    }

    public void I2(float f11) {
        if (this.f15136m3 != f11) {
            this.f15136m3 = f11;
            invalidateSelf();
            x1();
        }
    }

    public ColorStateList J0() {
        return this.F;
    }

    @Deprecated
    public void J1(float f11) {
        if (this.H != f11) {
            this.H = f11;
            setShapeAppearanceModel(E().w(f11));
        }
    }

    public void J2(int i11) {
        I2(this.f15142q3.getResources().getDimension(i11));
    }

    public float K0() {
        return this.S3 ? H() : this.H;
    }

    @Deprecated
    public void K1(int i11) {
        J1(this.f15142q3.getResources().getDimension(i11));
    }

    public void K2(float f11) {
        if (this.f15135l3 != f11) {
            this.f15135l3 = f11;
            invalidateSelf();
            x1();
        }
    }

    public float L0() {
        return this.f15141p3;
    }

    public void L1(float f11) {
        if (this.f15141p3 != f11) {
            this.f15141p3 = f11;
            invalidateSelf();
            x1();
        }
    }

    public void L2(int i11) {
        K2(this.f15142q3.getResources().getDimension(i11));
    }

    public Drawable M0() {
        Drawable drawable = this.R;
        if (drawable != null) {
            return n3.a.q(drawable);
        }
        return null;
    }

    public void M1(int i11) {
        L1(this.f15142q3.getResources().getDimension(i11));
    }

    public void M2(boolean z11) {
        if (this.M3 != z11) {
            this.M3 = z11;
            S2();
            onStateChange(getState());
        }
    }

    public float N0() {
        return this.Y;
    }

    public void N1(Drawable drawable) {
        Drawable M0 = M0();
        if (M0 != drawable) {
            float o02 = o0();
            this.R = drawable != null ? n3.a.r(drawable).mutate() : null;
            float o03 = o0();
            R2(M0);
            if (P2()) {
                m0(this.R);
            }
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean N2() {
        return this.Q3;
    }

    public ColorStateList O0() {
        return this.T;
    }

    public void O1(int i11) {
        N1(h.a.d(this.f15142q3, i11));
    }

    public float P0() {
        return this.G;
    }

    public void P1(float f11) {
        if (this.Y != f11) {
            float o02 = o0();
            this.Y = f11;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public float Q0() {
        return this.f15132i3;
    }

    public void Q1(int i11) {
        P1(this.f15142q3.getResources().getDimension(i11));
    }

    public ColorStateList R0() {
        return this.K;
    }

    public void R1(ColorStateList colorStateList) {
        this.f15128b1 = true;
        if (this.T != colorStateList) {
            this.T = colorStateList;
            if (P2()) {
                n3.a.o(this.R, colorStateList);
            }
            onStateChange(getState());
        }
    }

    public float S0() {
        return this.L;
    }

    public void S1(int i11) {
        R1(h.a.c(this.f15142q3, i11));
    }

    public Drawable T0() {
        Drawable drawable = this.f15139p1;
        if (drawable != null) {
            return n3.a.q(drawable);
        }
        return null;
    }

    public void T1(int i11) {
        U1(this.f15142q3.getResources().getBoolean(i11));
    }

    public CharSequence U0() {
        return this.V1;
    }

    public void U1(boolean z11) {
        if (this.Q != z11) {
            boolean P2 = P2();
            this.Q = z11;
            boolean P22 = P2();
            if (P2 != P22) {
                if (P22) {
                    m0(this.R);
                } else {
                    R2(this.R);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public float V0() {
        return this.f15138o3;
    }

    public void V1(float f11) {
        if (this.G != f11) {
            this.G = f11;
            invalidateSelf();
            x1();
        }
    }

    public float W0() {
        return this.Q1;
    }

    public void W1(int i11) {
        V1(this.f15142q3.getResources().getDimension(i11));
    }

    public float X0() {
        return this.f15137n3;
    }

    public void X1(float f11) {
        if (this.f15132i3 != f11) {
            this.f15132i3 = f11;
            invalidateSelf();
            x1();
        }
    }

    public int[] Y0() {
        return this.L3;
    }

    public void Y1(int i11) {
        X1(this.f15142q3.getResources().getDimension(i11));
    }

    public ColorStateList Z0() {
        return this.f15152y1;
    }

    public void Z1(ColorStateList colorStateList) {
        if (this.K != colorStateList) {
            this.K = colorStateList;
            if (this.S3) {
                h0(colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // com.google.android.material.internal.h.b
    public void a() {
        x1();
        invalidateSelf();
    }

    public void a1(RectF rectF) {
        r0(getBounds(), rectF);
    }

    public void a2(int i11) {
        Z1(h.a.c(this.f15142q3, i11));
    }

    public void b2(float f11) {
        if (this.L != f11) {
            this.L = f11;
            this.f15143r3.setStrokeWidth(f11);
            if (this.S3) {
                super.i0(f11);
            }
            invalidateSelf();
        }
    }

    public void c2(int i11) {
        b2(this.f15142q3.getResources().getDimension(i11));
    }

    public TextUtils.TruncateAt d1() {
        return this.P3;
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        if (bounds.isEmpty() || getAlpha() == 0) {
            return;
        }
        int i11 = this.G3;
        int a11 = i11 < 255 ? hk.a.a(canvas, bounds.left, bounds.top, bounds.right, bounds.bottom, i11) : 0;
        C0(canvas, bounds);
        z0(canvas, bounds);
        if (this.S3) {
            super.draw(canvas);
        }
        B0(canvas, bounds);
        E0(canvas, bounds);
        A0(canvas, bounds);
        y0(canvas, bounds);
        if (this.Q3) {
            G0(canvas, bounds);
        }
        D0(canvas, bounds);
        F0(canvas, bounds);
        if (this.G3 < 255) {
            canvas.restoreToCount(a11);
        }
    }

    public gk.h e1() {
        return this.Q2;
    }

    public void e2(Drawable drawable) {
        Drawable T0 = T0();
        if (T0 != drawable) {
            float s02 = s0();
            this.f15139p1 = drawable != null ? n3.a.r(drawable).mutate() : null;
            if (b.f53537a) {
                T2();
            }
            float s03 = s0();
            R2(T0);
            if (Q2()) {
                m0(this.f15139p1);
            }
            invalidateSelf();
            if (s02 != s03) {
                x1();
            }
        }
    }

    public float f1() {
        return this.f15134k3;
    }

    public void f2(CharSequence charSequence) {
        if (this.V1 != charSequence) {
            this.V1 = t3.a.c().h(charSequence);
            invalidateSelf();
        }
    }

    public float g1() {
        return this.f15133j3;
    }

    public void g2(float f11) {
        if (this.f15138o3 != f11) {
            this.f15138o3 = f11;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.G3;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        return this.H3;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return (int) this.G;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return Math.min(Math.round(this.f15132i3 + o0() + this.f15135l3 + this.f15151x3.f(j1().toString()) + this.f15136m3 + s0() + this.f15141p3), this.R3);
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        if (this.S3) {
            super.getOutline(outline);
            return;
        }
        Rect bounds = getBounds();
        if (!bounds.isEmpty()) {
            outline.setRoundRect(bounds, this.H);
        } else {
            outline.setRoundRect(0, 0, getIntrinsicWidth(), getIntrinsicHeight(), this.H);
        }
        outline.setAlpha(getAlpha() / 255.0f);
    }

    public ColorStateList h1() {
        return this.O;
    }

    public void h2(int i11) {
        g2(this.f15142q3.getResources().getDimension(i11));
    }

    public gk.h i1() {
        return this.f15153y2;
    }

    public void i2(int i11) {
        e2(h.a.d(this.f15142q3, i11));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.invalidateDrawable(this);
        }
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return t1(this.E) || t1(this.F) || t1(this.K) || (this.M3 && t1(this.N3)) || v1(this.f15151x3.d()) || w0() || u1(this.R) || u1(this.f15140p2) || t1(this.J3);
    }

    public CharSequence j1() {
        return this.P;
    }

    public void j2(float f11) {
        if (this.Q1 != f11) {
            this.Q1 = f11;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    public d k1() {
        return this.f15151x3.d();
    }

    public void k2(int i11) {
        j2(this.f15142q3.getResources().getDimension(i11));
    }

    public float l1() {
        return this.f15136m3;
    }

    public void l2(float f11) {
        if (this.f15137n3 != f11) {
            this.f15137n3 = f11;
            invalidateSelf();
            if (Q2()) {
                x1();
            }
        }
    }

    public float m1() {
        return this.f15135l3;
    }

    public void m2(int i11) {
        l2(this.f15142q3.getResources().getDimension(i11));
    }

    public boolean n2(int[] iArr) {
        if (Arrays.equals(this.L3, iArr)) {
            return false;
        }
        this.L3 = iArr;
        if (Q2()) {
            return y1(getState(), iArr);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float o0() {
        return (P2() || O2()) ? this.f15133j3 + c1() + this.f15134k3 : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean o1() {
        return this.M3;
    }

    public void o2(ColorStateList colorStateList) {
        if (this.f15152y1 != colorStateList) {
            this.f15152y1 = colorStateList;
            if (Q2()) {
                n3.a.o(this.f15139p1, colorStateList);
            }
            onStateChange(getState());
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLayoutDirectionChanged(int i11) {
        boolean onLayoutDirectionChanged = super.onLayoutDirectionChanged(i11);
        if (P2()) {
            onLayoutDirectionChanged |= n3.a.m(this.R, i11);
        }
        if (O2()) {
            onLayoutDirectionChanged |= n3.a.m(this.f15140p2, i11);
        }
        if (Q2()) {
            onLayoutDirectionChanged |= n3.a.m(this.f15139p1, i11);
        }
        if (onLayoutDirectionChanged) {
            invalidateSelf();
            return true;
        }
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i11) {
        boolean onLevelChange = super.onLevelChange(i11);
        if (P2()) {
            onLevelChange |= this.R.setLevel(i11);
        }
        if (O2()) {
            onLevelChange |= this.f15140p2.setLevel(i11);
        }
        if (Q2()) {
            onLevelChange |= this.f15139p1.setLevel(i11);
        }
        if (onLevelChange) {
            invalidateSelf();
        }
        return onLevelChange;
    }

    @Override // wk.g, android.graphics.drawable.Drawable, com.google.android.material.internal.h.b
    public boolean onStateChange(int[] iArr) {
        if (this.S3) {
            super.onStateChange(iArr);
        }
        return y1(iArr, Y0());
    }

    public void p2(int i11) {
        o2(h.a.c(this.f15142q3, i11));
    }

    public boolean q1() {
        return this.f15129b2;
    }

    public void q2(boolean z11) {
        if (this.f15130g1 != z11) {
            boolean Q2 = Q2();
            this.f15130g1 = z11;
            boolean Q22 = Q2();
            if (Q2 != Q22) {
                if (Q22) {
                    m0(this.f15139p1);
                } else {
                    R2(this.f15139p1);
                }
                invalidateSelf();
                x1();
            }
        }
    }

    public boolean r1() {
        return u1(this.f15139p1);
    }

    public void r2(InterfaceC0272a interfaceC0272a) {
        this.O3 = new WeakReference<>(interfaceC0272a);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public float s0() {
        return Q2() ? this.f15137n3 + this.Q1 + this.f15138o3 : BitmapDescriptorFactory.HUE_RED;
    }

    public boolean s1() {
        return this.f15130g1;
    }

    public void s2(TextUtils.TruncateAt truncateAt) {
        this.P3 = truncateAt;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j11) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.scheduleDrawable(this, runnable, j11);
        }
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (this.G3 != i11) {
            this.G3 = i11;
            invalidateSelf();
        }
    }

    @Override // wk.g, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        if (this.H3 != colorFilter) {
            this.H3 = colorFilter;
            invalidateSelf();
        }
    }

    @Override // wk.g, android.graphics.drawable.Drawable, n3.b
    public void setTintList(ColorStateList colorStateList) {
        if (this.J3 != colorStateList) {
            this.J3 = colorStateList;
            onStateChange(getState());
        }
    }

    @Override // wk.g, android.graphics.drawable.Drawable, n3.b
    public void setTintMode(PorterDuff.Mode mode) {
        if (this.K3 != mode) {
            this.K3 = mode;
            this.I3 = mk.a.a(this, this.J3, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        boolean visible = super.setVisible(z11, z12);
        if (P2()) {
            visible |= this.R.setVisible(z11, z12);
        }
        if (O2()) {
            visible |= this.f15140p2.setVisible(z11, z12);
        }
        if (Q2()) {
            visible |= this.f15139p1.setVisible(z11, z12);
        }
        if (visible) {
            invalidateSelf();
        }
        return visible;
    }

    public void t2(gk.h hVar) {
        this.Q2 = hVar;
    }

    public void u2(int i11) {
        t2(gk.h.c(this.f15142q3, i11));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        Drawable.Callback callback = getCallback();
        if (callback != null) {
            callback.unscheduleDrawable(this, runnable);
        }
    }

    Paint.Align v0(Rect rect, PointF pointF) {
        pointF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        Paint.Align align = Paint.Align.LEFT;
        if (this.P != null) {
            float o02 = this.f15132i3 + o0() + this.f15135l3;
            if (n3.a.f(this) == 0) {
                pointF.x = rect.left + o02;
                align = Paint.Align.LEFT;
            } else {
                pointF.x = rect.right - o02;
                align = Paint.Align.RIGHT;
            }
            pointF.y = rect.centerY() - u0();
        }
        return align;
    }

    public void v2(float f11) {
        if (this.f15134k3 != f11) {
            float o02 = o0();
            this.f15134k3 = f11;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void w2(int i11) {
        v2(this.f15142q3.getResources().getDimension(i11));
    }

    protected void x1() {
        InterfaceC0272a interfaceC0272a = this.O3.get();
        if (interfaceC0272a != null) {
            interfaceC0272a.a();
        }
    }

    public void x2(float f11) {
        if (this.f15133j3 != f11) {
            float o02 = o0();
            this.f15133j3 = f11;
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void y2(int i11) {
        x2(this.f15142q3.getResources().getDimension(i11));
    }

    public void z1(boolean z11) {
        if (this.f15129b2 != z11) {
            this.f15129b2 = z11;
            float o02 = o0();
            if (!z11 && this.E3) {
                this.E3 = false;
            }
            float o03 = o0();
            invalidateSelf();
            if (o02 != o03) {
                x1();
            }
        }
    }

    public void z2(int i11) {
        this.R3 = i11;
    }
}