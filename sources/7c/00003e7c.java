package com.horcrux.svg;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableArray;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.horcrux.svg.SVGLength;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public class a {

    /* renamed from: a  reason: collision with root package name */
    private final EnumC0319a f17538a;

    /* renamed from: b  reason: collision with root package name */
    private final SVGLength[] f17539b;

    /* renamed from: c  reason: collision with root package name */
    private ReadableArray f17540c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f17541d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f17542e;

    /* renamed from: f  reason: collision with root package name */
    private Matrix f17543f;

    /* renamed from: g  reason: collision with root package name */
    private Rect f17544g;

    /* renamed from: h  reason: collision with root package name */
    private v f17545h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.horcrux.svg.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public enum EnumC0319a {
        LINEAR_GRADIENT,
        RADIAL_GRADIENT,
        PATTERN
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes2.dex */
    public enum b {
        OBJECT_BOUNDING_BOX,
        USER_SPACE_ON_USE
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(EnumC0319a enumC0319a, SVGLength[] sVGLengthArr, b bVar) {
        this.f17538a = enumC0319a;
        this.f17539b = sVGLengthArr;
        this.f17541d = bVar == b.OBJECT_BOUNDING_BOX;
    }

    private RectF a(RectF rectF) {
        float f11;
        if (!this.f17541d) {
            rectF = new RectF(this.f17544g);
        }
        float width = rectF.width();
        float height = rectF.height();
        boolean z11 = this.f17541d;
        float f12 = BitmapDescriptorFactory.HUE_RED;
        if (z11) {
            f12 = rectF.left;
            f11 = rectF.top;
        } else {
            f11 = 0.0f;
        }
        return new RectF(f12, f11, width + f12, height + f11);
    }

    private double b(SVGLength sVGLength, double d11, float f11, float f12) {
        double d12;
        if (this.f17541d && sVGLength.f17528b == SVGLength.UnitType.NUMBER) {
            d12 = d11;
            return x.a(sVGLength, d11, 0.0d, d12, f12);
        }
        d12 = f11;
        return x.a(sVGLength, d11, 0.0d, d12, f12);
    }

    private static void c(ReadableArray readableArray, int i11, float[] fArr, int[] iArr, float f11) {
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = i12 * 2;
            fArr[i12] = (float) readableArray.getDouble(i13);
            int i14 = readableArray.getInt(i13 + 1);
            iArr[i12] = (i14 & 16777215) | (Math.round((i14 >>> 24) * f11) << 24);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void d(b bVar) {
        this.f17542e = bVar == b.OBJECT_BOUNDING_BOX;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(ReadableArray readableArray) {
        this.f17540c = readableArray;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void f(Matrix matrix) {
        this.f17543f = matrix;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void g(v vVar) {
        this.f17545h = vVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void h(Rect rect) {
        this.f17544g = rect;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void i(Paint paint, RectF rectF, float f11, float f12) {
        int[] iArr;
        float[] fArr;
        RectF a11 = a(rectF);
        float width = a11.width();
        float height = a11.height();
        float f13 = a11.left;
        float f14 = a11.top;
        float textSize = paint.getTextSize();
        if (this.f17538a == EnumC0319a.PATTERN) {
            double d11 = width;
            double b11 = b(this.f17539b[0], d11, f11, textSize);
            double d12 = height;
            double b12 = b(this.f17539b[1], d12, f11, textSize);
            double b13 = b(this.f17539b[2], d11, f11, textSize);
            double b14 = b(this.f17539b[3], d12, f11, textSize);
            if (b13 <= 1.0d || b14 <= 1.0d) {
                return;
            }
            Bitmap createBitmap = Bitmap.createBitmap((int) b13, (int) b14, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            RectF viewBox = this.f17545h.getViewBox();
            if (viewBox != null && viewBox.width() > BitmapDescriptorFactory.HUE_RED && viewBox.height() > BitmapDescriptorFactory.HUE_RED) {
                RectF rectF2 = new RectF((float) b11, (float) b12, (float) b13, (float) b14);
                v vVar = this.f17545h;
                canvas.concat(t0.a(viewBox, rectF2, vVar.f17731m, vVar.f17732n));
            }
            if (this.f17542e) {
                canvas.scale(width / f11, height / f11);
            }
            this.f17545h.draw(canvas, new Paint(), f12);
            Matrix matrix = new Matrix();
            Matrix matrix2 = this.f17543f;
            if (matrix2 != null) {
                matrix.preConcat(matrix2);
            }
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            BitmapShader bitmapShader = new BitmapShader(createBitmap, tileMode, tileMode);
            bitmapShader.setLocalMatrix(matrix);
            paint.setShader(bitmapShader);
            return;
        }
        int size = this.f17540c.size();
        if (size == 0) {
            nd.a.G("ReactNative", "Gradient contains no stops");
            return;
        }
        int i11 = size / 2;
        int[] iArr2 = new int[i11];
        float[] fArr2 = new float[i11];
        c(this.f17540c, i11, fArr2, iArr2, f12);
        if (i11 == 1) {
            int[] iArr3 = {iArr2[0], iArr2[0]};
            float[] fArr3 = {fArr2[0], fArr2[0]};
            nd.a.G("ReactNative", "Gradient contains only one stop");
            iArr = iArr3;
            fArr = fArr3;
        } else {
            iArr = iArr2;
            fArr = fArr2;
        }
        EnumC0319a enumC0319a = this.f17538a;
        if (enumC0319a == EnumC0319a.LINEAR_GRADIENT) {
            double d13 = width;
            double b15 = b(this.f17539b[0], d13, f11, textSize);
            double d14 = f13;
            double d15 = height;
            double d16 = f14;
            Shader linearGradient = new LinearGradient((float) (b15 + d14), (float) (b(this.f17539b[1], d15, f11, textSize) + d16), (float) (b(this.f17539b[2], d13, f11, textSize) + d14), (float) (b(this.f17539b[3], d15, f11, textSize) + d16), iArr, fArr, Shader.TileMode.CLAMP);
            if (this.f17543f != null) {
                Matrix matrix3 = new Matrix();
                matrix3.preConcat(this.f17543f);
                linearGradient.setLocalMatrix(matrix3);
            }
            paint.setShader(linearGradient);
        } else if (enumC0319a == EnumC0319a.RADIAL_GRADIENT) {
            double d17 = width;
            double b16 = b(this.f17539b[2], d17, f11, textSize);
            double d18 = height;
            double b17 = b(this.f17539b[3], d18, f11, textSize) / b16;
            Shader radialGradient = new RadialGradient((float) (b(this.f17539b[4], d17, f11, textSize) + f13), (float) (b(this.f17539b[5], d18 / b17, f11, textSize) + (f14 / b17)), (float) b16, iArr, fArr, Shader.TileMode.CLAMP);
            Matrix matrix4 = new Matrix();
            matrix4.preScale(1.0f, (float) b17);
            Matrix matrix5 = this.f17543f;
            if (matrix5 != null) {
                matrix4.preConcat(matrix5);
            }
            radialGradient.setLocalMatrix(matrix4);
            paint.setShader(radialGradient);
        }
    }
}