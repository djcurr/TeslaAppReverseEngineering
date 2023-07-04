package com.ijzerenhein.sharedelement;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;
import com.facebook.react.bridge.ReadableMap;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import je.q;

/* loaded from: classes2.dex */
public class j {

    /* renamed from: a */
    RectF f17793a;

    /* renamed from: b */
    Rect f17794b;

    /* renamed from: c */
    RectF f17795c;

    /* renamed from: d */
    Matrix f17796d;

    /* renamed from: e */
    q.c f17797e;

    /* renamed from: f */
    int f17798f;

    /* renamed from: g */
    float f17799g;

    /* renamed from: h */
    float f17800h;

    /* renamed from: i */
    float f17801i;

    /* renamed from: j */
    float f17802j;

    /* renamed from: k */
    float f17803k;

    /* renamed from: l */
    float f17804l;

    /* renamed from: m */
    int f17805m;

    /* renamed from: n */
    String f17806n;

    /* renamed from: o */
    float f17807o;

    /* renamed from: p */
    static Rect f17782p = new Rect();

    /* renamed from: q */
    static RectF f17783q = new RectF();

    /* renamed from: r */
    static int f17784r = 1;

    /* renamed from: s */
    static int f17785s = 2;

    /* renamed from: t */
    static int f17786t = 4;

    /* renamed from: u */
    static int f17787u = 8;

    /* renamed from: v */
    static int f17788v = 16;

    /* renamed from: w */
    static int f17789w = 32;

    /* renamed from: x */
    static int f17790x = 64;

    /* renamed from: y */
    static int f17791y = 128;

    /* renamed from: z */
    static int f17792z = 256;
    static int A = 512;
    static int B = (((((8 + 16) + 32) + 64) + 128) + 256) + 512;
    static int C = 1024;

    j() {
        this.f17793a = new RectF();
        this.f17794b = new Rect();
        this.f17795c = new RectF();
        this.f17796d = new Matrix();
        this.f17797e = q.c.f33449a;
        this.f17798f = 0;
        this.f17799g = 1.0f;
        this.f17800h = BitmapDescriptorFactory.HUE_RED;
        this.f17801i = BitmapDescriptorFactory.HUE_RED;
        this.f17802j = BitmapDescriptorFactory.HUE_RED;
        this.f17803k = BitmapDescriptorFactory.HUE_RED;
        this.f17804l = BitmapDescriptorFactory.HUE_RED;
        this.f17805m = 0;
        this.f17806n = "solid";
        this.f17807o = BitmapDescriptorFactory.HUE_RED;
    }

    static boolean b(q.c cVar, q.c cVar2) {
        return cVar == cVar2;
    }

    public static Matrix c(View view) {
        Matrix matrix = new Matrix(view.getMatrix());
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        float[] fArr2 = new float[9];
        ViewParent parent = view.getParent();
        while ((parent instanceof View) && parent != null) {
            ((View) parent).getMatrix().getValues(fArr2);
            fArr[0] = fArr[0] * fArr2[0];
            fArr[4] = fArr[4] * fArr2[4];
            fArr[1] = fArr[1] + fArr2[1];
            fArr[3] = fArr[3] + fArr2[3];
            fArr[2] = fArr[2] + fArr2[2];
            fArr[5] = fArr[5] + fArr2[5];
            parent = parent.getParent();
        }
        if (parent == null) {
            return null;
        }
        matrix.setValues(fArr);
        return matrix;
    }

    public static float d(View view, j jVar) {
        RectF rectF = new RectF();
        i(view, rectF);
        RectF rectF2 = new RectF();
        if (rectF2.setIntersect(rectF, jVar.f17795c)) {
            float width = rectF.width() * rectF.height();
            float width2 = rectF2.width() * rectF2.height();
            return (width2 / width) * (width2 / (jVar.f17795c.width() * jVar.f17795c.height()));
        }
        return BitmapDescriptorFactory.HUE_RED;
    }

    static int e(int i11, int i12, float f11) {
        int red = Color.red(i11);
        int green = Color.green(i11);
        int blue = Color.blue(i11);
        int alpha = Color.alpha(i11);
        return Color.argb((int) (alpha + ((Color.alpha(i12) - alpha) * f11)), (int) (red + ((Color.red(i12) - red) * f11)), (int) (green + ((Color.green(i12) - green) * f11)), (int) (blue + ((Color.blue(i12) - blue) * f11)));
    }

    public static RectF f(RectF rectF, RectF rectF2, float f11) {
        float f12 = rectF.left;
        float f13 = f12 + ((rectF2.left - f12) * f11);
        float f14 = rectF.top;
        float f15 = f14 + ((rectF2.top - f14) * f11);
        float f16 = rectF.right;
        float f17 = rectF.bottom;
        return new RectF(f13, f15, f16 + ((rectF2.right - f16) * f11), f17 + ((rectF2.bottom - f17) * f11));
    }

    public static j g(j jVar, RectF rectF, j jVar2, RectF rectF2, float f11) {
        j jVar3 = new j();
        jVar3.f17797e = h(jVar, rectF, jVar2, rectF2, f11);
        float f12 = jVar.f17799g;
        jVar3.f17799g = f12 + ((jVar2.f17799g - f12) * f11);
        jVar3.f17798f = e(jVar.f17798f, jVar2.f17798f, f11);
        float f13 = jVar.f17800h;
        jVar3.f17800h = f13 + ((jVar2.f17800h - f13) * f11);
        float f14 = jVar.f17801i;
        jVar3.f17801i = f14 + ((jVar2.f17801i - f14) * f11);
        float f15 = jVar.f17802j;
        jVar3.f17802j = f15 + ((jVar2.f17802j - f15) * f11);
        float f16 = jVar.f17803k;
        jVar3.f17803k = f16 + ((jVar2.f17803k - f16) * f11);
        float f17 = jVar.f17804l;
        jVar3.f17804l = f17 + ((jVar2.f17804l - f17) * f11);
        jVar3.f17805m = e(jVar.f17805m, jVar2.f17805m, f11);
        jVar3.f17806n = jVar.f17806n;
        float f18 = jVar.f17807o;
        jVar3.f17807o = f18 + ((jVar2.f17807o - f18) * f11);
        return jVar3;
    }

    static q.c h(j jVar, RectF rectF, j jVar2, RectF rectF2, float f11) {
        q.c cVar = jVar.f17797e;
        q.c cVar2 = jVar2.f17797e;
        if (cVar == cVar2) {
            return cVar;
        }
        q.b bVar = new q.b(cVar, cVar2, new Rect(0, 0, (int) rectF.width(), (int) rectF.height()), new Rect(0, 0, (int) rectF2.width(), (int) rectF2.height()));
        bVar.b(f11);
        return bVar;
    }

    public static void i(View view, RectF rectF) {
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, view.getWidth(), view.getHeight());
        view.getMatrix().mapRect(rectF);
        rectF.offset(view.getLeft(), view.getTop());
        ViewParent parent = view.getParent();
        while (parent instanceof View) {
            View view2 = (View) parent;
            rectF.offset(-view2.getScrollX(), -view2.getScrollY());
            view2.getMatrix().mapRect(rectF);
            rectF.offset(view2.getLeft(), view2.getTop());
            parent = view2.getParent();
        }
    }

    public static RectF k(boolean z11, RectF rectF, j jVar, int[] iArr) {
        if (rectF == null) {
            return f17783q;
        }
        if (!z11 || jVar == null) {
            return rectF;
        }
        RectF rectF2 = new RectF(rectF);
        rectF2.offset(-iArr[0], -iArr[1]);
        Matrix matrix = new Matrix();
        jVar.f17796d.invert(matrix);
        matrix.mapRect(rectF2);
        rectF2.offset(iArr[0], iArr[1]);
        return rectF2;
    }

    public static RectF l(boolean z11, j jVar, int[] iArr) {
        if (jVar == null) {
            return f17783q;
        }
        return k(z11, jVar.f17793a, jVar, iArr);
    }

    public int a(j jVar) {
        int i11 = this.f17799g != jVar.f17799g ? 0 + f17784r : 0;
        if (this.f17798f != jVar.f17798f) {
            i11 += f17786t;
        }
        if (this.f17805m != jVar.f17805m) {
            i11 += f17787u;
        }
        if (this.f17804l != jVar.f17804l) {
            i11 += f17788v;
        }
        if (!this.f17806n.equals(jVar.f17806n)) {
            i11 += f17789w;
        }
        if (this.f17800h != jVar.f17800h) {
            i11 += f17790x;
        }
        if (this.f17801i != jVar.f17801i) {
            i11 += f17791y;
        }
        if (this.f17802j != jVar.f17802j) {
            i11 += f17792z;
        }
        if (this.f17803k != jVar.f17803k) {
            i11 += A;
        }
        if (this.f17807o != jVar.f17807o) {
            i11 += f17785s;
        }
        return !b(this.f17797e, jVar.f17797e) ? i11 + C : i11;
    }

    public boolean j() {
        if (this.f17799g <= BitmapDescriptorFactory.HUE_RED) {
            return false;
        }
        if (this.f17807o > BitmapDescriptorFactory.HUE_RED) {
            return true;
        }
        return Color.alpha(this.f17798f) > 0 || Color.alpha(this.f17805m) > 0;
    }

    public j(ReadableMap readableMap, Context context) {
        this.f17793a = new RectF();
        this.f17794b = new Rect();
        this.f17795c = new RectF();
        this.f17796d = new Matrix();
        this.f17797e = q.c.f33449a;
        this.f17798f = 0;
        this.f17799g = 1.0f;
        this.f17800h = BitmapDescriptorFactory.HUE_RED;
        this.f17801i = BitmapDescriptorFactory.HUE_RED;
        this.f17802j = BitmapDescriptorFactory.HUE_RED;
        this.f17803k = BitmapDescriptorFactory.HUE_RED;
        this.f17804l = BitmapDescriptorFactory.HUE_RED;
        this.f17805m = 0;
        this.f17806n = "solid";
        this.f17807o = BitmapDescriptorFactory.HUE_RED;
        if (readableMap.hasKey("opacity")) {
            this.f17799g = (float) readableMap.getDouble("opacity");
        }
        if (readableMap.hasKey("backgroundColor")) {
            this.f17798f = readableMap.getInt("backgroundColor");
        }
        if (readableMap.hasKey("borderColor")) {
            this.f17805m = readableMap.getInt("borderColor");
        }
        if (readableMap.hasKey("borderWidth")) {
            this.f17804l = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderWidth"));
        }
        if (readableMap.hasKey("borderStyle")) {
            this.f17806n = readableMap.getString("borderStyle");
        }
        if (readableMap.hasKey("resizeMode")) {
            this.f17797e = com.facebook.react.views.image.d.c(readableMap.getString("resizeMode"));
        }
        if (readableMap.hasKey("elevation")) {
            this.f17807o = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("elevation"));
        }
        boolean g11 = jg.a.d().g(context);
        if (readableMap.hasKey("borderRadius")) {
            float c11 = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderRadius"));
            this.f17800h = c11;
            this.f17801i = c11;
            this.f17802j = c11;
            this.f17803k = c11;
        }
        if (readableMap.hasKey("borderTopEndRadius")) {
            float c12 = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderTopEndRadius"));
            if (g11) {
                this.f17800h = c12;
            } else {
                this.f17801i = c12;
            }
        }
        if (readableMap.hasKey("borderTopStartRadius")) {
            float c13 = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderTopStartRadius"));
            if (g11) {
                this.f17801i = c13;
            } else {
                this.f17800h = c13;
            }
        }
        if (readableMap.hasKey("borderBottomEndRadius")) {
            float c14 = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderBottomEndRadius"));
            if (g11) {
                this.f17802j = c14;
            } else {
                this.f17803k = c14;
            }
        }
        if (readableMap.hasKey("borderBottomStartRadius")) {
            float c15 = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderBottomStartRadius"));
            if (g11) {
                this.f17803k = c15;
            } else {
                this.f17802j = c15;
            }
        }
        if (readableMap.hasKey("borderTopLeftRadius")) {
            this.f17800h = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderTopLeftRadius"));
        }
        if (readableMap.hasKey("borderTopRightRadius")) {
            this.f17801i = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderTopRightRadius"));
        }
        if (readableMap.hasKey("borderBottomLeftRadius")) {
            this.f17802j = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderBottomLeftRadius"));
        }
        if (readableMap.hasKey("borderBottomRightRadius")) {
            this.f17803k = com.facebook.react.uimanager.p.c((float) readableMap.getDouble("borderBottomRightRadius"));
        }
    }
}