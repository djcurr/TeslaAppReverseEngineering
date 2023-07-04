package com.canhub.cropper;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.canhub.cropper.CropImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes.dex */
public class CropOverlayView extends View {
    private int A;
    private float B;
    private CropImageView.d C;
    private CropImageView.c E;
    private final Rect F;
    private boolean G;
    private Integer H;

    /* renamed from: a  reason: collision with root package name */
    private ScaleGestureDetector f10912a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f10913b;

    /* renamed from: c  reason: collision with root package name */
    private final f f10914c;

    /* renamed from: d  reason: collision with root package name */
    private b f10915d;

    /* renamed from: e  reason: collision with root package name */
    private final RectF f10916e;

    /* renamed from: f  reason: collision with root package name */
    private Paint f10917f;

    /* renamed from: g  reason: collision with root package name */
    private Paint f10918g;

    /* renamed from: h  reason: collision with root package name */
    private Paint f10919h;

    /* renamed from: i  reason: collision with root package name */
    private Paint f10920i;

    /* renamed from: j  reason: collision with root package name */
    private Path f10921j;

    /* renamed from: k  reason: collision with root package name */
    private final float[] f10922k;

    /* renamed from: l  reason: collision with root package name */
    private final RectF f10923l;

    /* renamed from: m  reason: collision with root package name */
    private int f10924m;

    /* renamed from: n  reason: collision with root package name */
    private int f10925n;

    /* renamed from: o  reason: collision with root package name */
    private float f10926o;

    /* renamed from: p  reason: collision with root package name */
    private float f10927p;

    /* renamed from: q  reason: collision with root package name */
    private float f10928q;

    /* renamed from: t  reason: collision with root package name */
    private float f10929t;

    /* renamed from: w  reason: collision with root package name */
    private float f10930w;

    /* renamed from: x  reason: collision with root package name */
    private g f10931x;

    /* renamed from: y  reason: collision with root package name */
    private boolean f10932y;

    /* renamed from: z  reason: collision with root package name */
    private int f10933z;

    /* loaded from: classes.dex */
    public interface b {
        void a(boolean z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        private c() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF h11 = CropOverlayView.this.f10914c.h();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f11 = focusY - currentSpanY;
            float f12 = focusX - currentSpanX;
            float f13 = focusX + currentSpanX;
            float f14 = focusY + currentSpanY;
            if (f12 >= f13 || f11 > f14 || f12 < BitmapDescriptorFactory.HUE_RED || f13 > CropOverlayView.this.f10914c.c() || f11 < BitmapDescriptorFactory.HUE_RED || f14 > CropOverlayView.this.f10914c.b()) {
                return true;
            }
            h11.set(f12, f11, f13, f14);
            CropOverlayView.this.f10914c.r(h11);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10914c = new f();
        this.f10916e = new RectF();
        this.f10921j = new Path();
        this.f10922k = new float[8];
        this.f10923l = new RectF();
        this.B = this.f10933z / this.A;
        this.F = new Rect();
    }

    private boolean b(RectF rectF) {
        float u11 = com.canhub.cropper.c.u(this.f10922k);
        float w11 = com.canhub.cropper.c.w(this.f10922k);
        float v11 = com.canhub.cropper.c.v(this.f10922k);
        float p11 = com.canhub.cropper.c.p(this.f10922k);
        if (!n()) {
            this.f10923l.set(u11, w11, v11, p11);
            return false;
        }
        float[] fArr = this.f10922k;
        float f11 = fArr[0];
        float f12 = fArr[1];
        float f13 = fArr[4];
        float f14 = fArr[5];
        float f15 = fArr[6];
        float f16 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f11 = fArr[6];
                f12 = fArr[7];
                f13 = fArr[2];
                f14 = fArr[3];
                f15 = fArr[4];
                f16 = fArr[5];
            } else {
                f11 = fArr[4];
                f12 = fArr[5];
                f13 = fArr[0];
                f14 = fArr[1];
                f15 = fArr[2];
                f16 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f11 = fArr[2];
            f12 = fArr[3];
            f13 = fArr[6];
            f14 = fArr[7];
            f15 = fArr[0];
            f16 = fArr[1];
        }
        float f17 = (f16 - f12) / (f15 - f11);
        float f18 = (-1.0f) / f17;
        float f19 = f12 - (f17 * f11);
        float f21 = f12 - (f11 * f18);
        float f22 = f14 - (f17 * f13);
        float f23 = f14 - (f13 * f18);
        float centerY = rectF.centerY() - rectF.top;
        float centerX = rectF.centerX();
        float f24 = rectF.left;
        float f25 = centerY / (centerX - f24);
        float f26 = -f25;
        float f27 = rectF.top;
        float f28 = f27 - (f24 * f25);
        float f29 = rectF.right;
        float f31 = f27 - (f26 * f29);
        float f32 = f17 - f25;
        float f33 = (f28 - f19) / f32;
        float max = Math.max(u11, f33 < f29 ? f33 : u11);
        float f34 = (f28 - f21) / (f18 - f25);
        if (f34 >= rectF.right) {
            f34 = max;
        }
        float max2 = Math.max(max, f34);
        float f35 = f18 - f26;
        float f36 = (f31 - f23) / f35;
        if (f36 >= rectF.right) {
            f36 = max2;
        }
        float max3 = Math.max(max2, f36);
        float f37 = (f31 - f21) / f35;
        if (f37 <= rectF.left) {
            f37 = v11;
        }
        float min = Math.min(v11, f37);
        float f38 = (f31 - f22) / (f17 - f26);
        if (f38 <= rectF.left) {
            f38 = min;
        }
        float min2 = Math.min(min, f38);
        float f39 = (f28 - f22) / f32;
        if (f39 <= rectF.left) {
            f39 = min2;
        }
        float min3 = Math.min(min2, f39);
        float max4 = Math.max(w11, Math.max((f17 * max3) + f19, (f18 * min3) + f21));
        float min4 = Math.min(p11, Math.min((f18 * max3) + f23, (f17 * min3) + f22));
        RectF rectF2 = this.f10923l;
        rectF2.left = max3;
        rectF2.top = max4;
        rectF2.right = min3;
        rectF2.bottom = min4;
        return true;
    }

    private void c(boolean z11) {
        try {
            b bVar = this.f10915d;
            if (bVar != null) {
                bVar.a(z11);
            }
        } catch (Exception e11) {
            Log.e("AIC", "Exception in crop window changed", e11);
        }
    }

    private void d(Canvas canvas) {
        int i11;
        RectF h11 = this.f10914c.h();
        float max = Math.max(com.canhub.cropper.c.u(this.f10922k), (float) BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(com.canhub.cropper.c.w(this.f10922k), (float) BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(com.canhub.cropper.c.v(this.f10922k), getWidth());
        float min2 = Math.min(com.canhub.cropper.c.p(this.f10922k), getHeight());
        if (this.E == CropImageView.c.RECTANGLE) {
            if (n() && (i11 = Build.VERSION.SDK_INT) > 17) {
                this.f10921j.reset();
                Path path = this.f10921j;
                float[] fArr = this.f10922k;
                path.moveTo(fArr[0], fArr[1]);
                Path path2 = this.f10921j;
                float[] fArr2 = this.f10922k;
                path2.lineTo(fArr2[2], fArr2[3]);
                Path path3 = this.f10921j;
                float[] fArr3 = this.f10922k;
                path3.lineTo(fArr3[4], fArr3[5]);
                Path path4 = this.f10921j;
                float[] fArr4 = this.f10922k;
                path4.lineTo(fArr4[6], fArr4[7]);
                this.f10921j.close();
                canvas.save();
                if (i11 >= 26) {
                    canvas.clipOutPath(this.f10921j);
                } else {
                    canvas.clipPath(this.f10921j, Region.Op.INTERSECT);
                }
                canvas.clipRect(h11, Region.Op.XOR);
                canvas.drawRect(max, max2, min, min2, this.f10920i);
                canvas.restore();
                return;
            }
            canvas.drawRect(max, max2, min, h11.top, this.f10920i);
            canvas.drawRect(max, h11.bottom, min, min2, this.f10920i);
            canvas.drawRect(max, h11.top, h11.left, h11.bottom, this.f10920i);
            canvas.drawRect(h11.right, h11.top, min, h11.bottom, this.f10920i);
            return;
        }
        this.f10921j.reset();
        int i12 = Build.VERSION.SDK_INT;
        if (i12 <= 17 && this.E == CropImageView.c.OVAL) {
            this.f10916e.set(h11.left + 2.0f, h11.top + 2.0f, h11.right - 2.0f, h11.bottom - 2.0f);
        } else {
            this.f10916e.set(h11.left, h11.top, h11.right, h11.bottom);
        }
        this.f10921j.addOval(this.f10916e, Path.Direction.CW);
        canvas.save();
        if (i12 >= 26) {
            canvas.clipOutPath(this.f10921j);
        } else {
            canvas.clipPath(this.f10921j, Region.Op.XOR);
        }
        canvas.drawRect(max, max2, min, min2, this.f10920i);
        canvas.restore();
    }

    private void e(Canvas canvas) {
        Paint paint = this.f10917f;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF h11 = this.f10914c.h();
            float f11 = strokeWidth / 2.0f;
            h11.inset(f11, f11);
            if (this.E == CropImageView.c.RECTANGLE) {
                canvas.drawRect(h11, this.f10917f);
            } else {
                canvas.drawOval(h11, this.f10917f);
            }
        }
    }

    private void f(Canvas canvas) {
        if (this.f10918g != null) {
            Paint paint = this.f10917f;
            float f11 = BitmapDescriptorFactory.HUE_RED;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            float strokeWidth2 = this.f10918g.getStrokeWidth();
            float f12 = strokeWidth2 / 2.0f;
            if (this.E == CropImageView.c.RECTANGLE) {
                f11 = this.f10926o;
            }
            float f13 = f11 + f12;
            RectF h11 = this.f10914c.h();
            h11.inset(f13, f13);
            float f14 = (strokeWidth2 - strokeWidth) / 2.0f;
            float f15 = f12 + f14;
            float f16 = h11.left;
            float f17 = h11.top;
            canvas.drawLine(f16 - f14, f17 - f15, f16 - f14, f17 + this.f10927p, this.f10918g);
            float f18 = h11.left;
            float f19 = h11.top;
            canvas.drawLine(f18 - f15, f19 - f14, f18 + this.f10927p, f19 - f14, this.f10918g);
            float f21 = h11.right;
            float f22 = h11.top;
            canvas.drawLine(f21 + f14, f22 - f15, f21 + f14, f22 + this.f10927p, this.f10918g);
            float f23 = h11.right;
            float f24 = h11.top;
            canvas.drawLine(f23 + f15, f24 - f14, f23 - this.f10927p, f24 - f14, this.f10918g);
            float f25 = h11.left;
            float f26 = h11.bottom;
            canvas.drawLine(f25 - f14, f26 + f15, f25 - f14, f26 - this.f10927p, this.f10918g);
            float f27 = h11.left;
            float f28 = h11.bottom;
            canvas.drawLine(f27 - f15, f28 + f14, f27 + this.f10927p, f28 + f14, this.f10918g);
            float f29 = h11.right;
            float f31 = h11.bottom;
            canvas.drawLine(f29 + f14, f31 + f15, f29 + f14, f31 - this.f10927p, this.f10918g);
            float f32 = h11.right;
            float f33 = h11.bottom;
            canvas.drawLine(f32 + f15, f33 + f14, f32 - this.f10927p, f33 + f14, this.f10918g);
        }
    }

    private void g(Canvas canvas) {
        if (this.f10919h != null) {
            Paint paint = this.f10917f;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : BitmapDescriptorFactory.HUE_RED;
            RectF h11 = this.f10914c.h();
            h11.inset(strokeWidth, strokeWidth);
            float width = h11.width() / 3.0f;
            float height = h11.height() / 3.0f;
            if (this.E == CropImageView.c.OVAL) {
                float width2 = (h11.width() / 2.0f) - strokeWidth;
                float height2 = (h11.height() / 2.0f) - strokeWidth;
                float f11 = h11.left + width;
                float f12 = h11.right - width;
                float sin = (float) (height2 * Math.sin(Math.acos((width2 - width) / width2)));
                canvas.drawLine(f11, (h11.top + height2) - sin, f11, (h11.bottom - height2) + sin, this.f10919h);
                canvas.drawLine(f12, (h11.top + height2) - sin, f12, (h11.bottom - height2) + sin, this.f10919h);
                float f13 = h11.top + height;
                float f14 = h11.bottom - height;
                float cos = (float) (width2 * Math.cos(Math.asin((height2 - height) / height2)));
                canvas.drawLine((h11.left + width2) - cos, f13, (h11.right - width2) + cos, f13, this.f10919h);
                canvas.drawLine((h11.left + width2) - cos, f14, (h11.right - width2) + cos, f14, this.f10919h);
                return;
            }
            float f15 = h11.left + width;
            float f16 = h11.right - width;
            canvas.drawLine(f15, h11.top, f15, h11.bottom, this.f10919h);
            canvas.drawLine(f16, h11.top, f16, h11.bottom, this.f10919h);
            float f17 = h11.top + height;
            float f18 = h11.bottom - height;
            canvas.drawLine(h11.left, f17, h11.right, f17, this.f10919h);
            canvas.drawLine(h11.left, f18, h11.right, f18, this.f10919h);
        }
    }

    private void h(RectF rectF) {
        if (rectF.width() < this.f10914c.e()) {
            float e11 = (this.f10914c.e() - rectF.width()) / 2.0f;
            rectF.left -= e11;
            rectF.right += e11;
        }
        if (rectF.height() < this.f10914c.d()) {
            float d11 = (this.f10914c.d() - rectF.height()) / 2.0f;
            rectF.top -= d11;
            rectF.bottom += d11;
        }
        if (rectF.width() > this.f10914c.c()) {
            float width = (rectF.width() - this.f10914c.c()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.f10914c.b()) {
            float height = (rectF.height() - this.f10914c.b()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        b(rectF);
        if (this.f10923l.width() > BitmapDescriptorFactory.HUE_RED && this.f10923l.height() > BitmapDescriptorFactory.HUE_RED) {
            float max = Math.max(this.f10923l.left, (float) BitmapDescriptorFactory.HUE_RED);
            float max2 = Math.max(this.f10923l.top, (float) BitmapDescriptorFactory.HUE_RED);
            float min = Math.min(this.f10923l.right, getWidth());
            float min2 = Math.min(this.f10923l.bottom, getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (!this.f10932y || Math.abs(rectF.width() - (rectF.height() * this.B)) <= 0.1d) {
            return;
        }
        if (rectF.width() > rectF.height() * this.B) {
            float abs = Math.abs((rectF.height() * this.B) - rectF.width()) / 2.0f;
            rectF.left += abs;
            rectF.right -= abs;
            return;
        }
        float abs2 = Math.abs((rectF.width() / this.B) - rectF.height()) / 2.0f;
        rectF.top += abs2;
        rectF.bottom -= abs2;
    }

    private static Paint j(int i11) {
        Paint paint = new Paint();
        paint.setColor(i11);
        return paint;
    }

    private static Paint k(float f11, int i11) {
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            Paint paint = new Paint();
            paint.setColor(i11);
            paint.setStrokeWidth(f11);
            paint.setStyle(Paint.Style.STROKE);
            paint.setAntiAlias(true);
            return paint;
        }
        return null;
    }

    private void l() {
        float max = Math.max(com.canhub.cropper.c.u(this.f10922k), (float) BitmapDescriptorFactory.HUE_RED);
        float max2 = Math.max(com.canhub.cropper.c.w(this.f10922k), (float) BitmapDescriptorFactory.HUE_RED);
        float min = Math.min(com.canhub.cropper.c.v(this.f10922k), getWidth());
        float min2 = Math.min(com.canhub.cropper.c.p(this.f10922k), getHeight());
        if (min <= max || min2 <= max2) {
            return;
        }
        RectF rectF = new RectF();
        this.G = true;
        float f11 = this.f10928q;
        float f12 = min - max;
        float f13 = f11 * f12;
        float f14 = min2 - max2;
        float f15 = f11 * f14;
        if (this.F.width() > 0 && this.F.height() > 0) {
            rectF.left = (this.F.left / this.f10914c.k()) + max;
            rectF.top = (this.F.top / this.f10914c.j()) + max2;
            rectF.right = rectF.left + (this.F.width() / this.f10914c.k());
            rectF.bottom = rectF.top + (this.F.height() / this.f10914c.j());
            rectF.left = Math.max(max, rectF.left);
            rectF.top = Math.max(max2, rectF.top);
            rectF.right = Math.min(min, rectF.right);
            rectF.bottom = Math.min(min2, rectF.bottom);
        } else if (this.f10932y && min > max && min2 > max2) {
            if (f12 / f14 > this.B) {
                rectF.top = max2 + f15;
                rectF.bottom = min2 - f15;
                float width = getWidth() / 2.0f;
                this.B = this.f10933z / this.A;
                float max3 = Math.max(this.f10914c.e(), rectF.height() * this.B) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f13;
                rectF.right = min - f13;
                float height = getHeight() / 2.0f;
                float max4 = Math.max(this.f10914c.d(), rectF.width() / this.B) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
        } else {
            rectF.left = max + f13;
            rectF.top = max2 + f15;
            rectF.right = min - f13;
            rectF.bottom = min2 - f15;
        }
        h(rectF);
        this.f10914c.r(rectF);
    }

    private boolean n() {
        float[] fArr = this.f10922k;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    private void o(float f11, float f12) {
        g f13 = this.f10914c.f(f11, f12, this.f10929t, this.E);
        this.f10931x = f13;
        if (f13 != null) {
            invalidate();
        }
    }

    private void p(float f11, float f12) {
        if (this.f10931x != null) {
            float f13 = this.f10930w;
            RectF h11 = this.f10914c.h();
            if (b(h11)) {
                f13 = BitmapDescriptorFactory.HUE_RED;
            }
            this.f10931x.m(h11, f11, f12, this.f10923l, this.f10924m, this.f10925n, f13, this.f10932y, this.B);
            this.f10914c.r(h11);
            c(true);
            invalidate();
        }
    }

    private void q() {
        if (this.f10931x != null) {
            this.f10931x = null;
            c(false);
            invalidate();
        }
    }

    public int getAspectRatioX() {
        return this.f10933z;
    }

    public int getAspectRatioY() {
        return this.A;
    }

    public CropImageView.c getCropShape() {
        return this.E;
    }

    public RectF getCropWindowRect() {
        return this.f10914c.h();
    }

    public CropImageView.d getGuidelines() {
        return this.C;
    }

    public Rect getInitialCropWindowRect() {
        return this.F;
    }

    public void i() {
        RectF cropWindowRect = getCropWindowRect();
        h(cropWindowRect);
        this.f10914c.r(cropWindowRect);
    }

    public boolean m() {
        return this.f10932y;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        d(canvas);
        if (this.f10914c.s()) {
            CropImageView.d dVar = this.C;
            if (dVar == CropImageView.d.ON) {
                g(canvas);
            } else if (dVar == CropImageView.d.ON_TOUCH && this.f10931x != null) {
                g(canvas);
            }
        }
        e(canvas);
        f(canvas);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (isEnabled()) {
            if (this.f10913b) {
                this.f10912a.onTouchEvent(motionEvent);
            }
            int action = motionEvent.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        p(motionEvent.getX(), motionEvent.getY());
                        getParent().requestDisallowInterceptTouchEvent(true);
                        return true;
                    } else if (action != 3) {
                        return false;
                    }
                }
                getParent().requestDisallowInterceptTouchEvent(false);
                q();
                return true;
            }
            o(motionEvent.getX(), motionEvent.getY());
            return true;
        }
        return false;
    }

    public void r() {
        if (this.G) {
            setCropWindowRect(com.canhub.cropper.c.f10969b);
            l();
            invalidate();
        }
    }

    public void s(float[] fArr, int i11, int i12) {
        if (fArr == null || !Arrays.equals(this.f10922k, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.f10922k, (float) BitmapDescriptorFactory.HUE_RED);
            } else {
                System.arraycopy(fArr, 0, this.f10922k, 0, fArr.length);
            }
            this.f10924m = i11;
            this.f10925n = i12;
            RectF h11 = this.f10914c.h();
            if (h11.width() == BitmapDescriptorFactory.HUE_RED || h11.height() == BitmapDescriptorFactory.HUE_RED) {
                l();
            }
        }
    }

    public void setAspectRatioX(int i11) {
        if (i11 > 0) {
            if (this.f10933z != i11) {
                this.f10933z = i11;
                this.B = i11 / this.A;
                if (this.G) {
                    l();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setAspectRatioY(int i11) {
        if (i11 > 0) {
            if (this.A != i11) {
                this.A = i11;
                this.B = this.f10933z / i11;
                if (this.G) {
                    l();
                    invalidate();
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
    }

    public void setCropShape(CropImageView.c cVar) {
        if (this.E != cVar) {
            this.E = cVar;
            if (Build.VERSION.SDK_INT <= 17) {
                if (cVar == CropImageView.c.OVAL) {
                    Integer valueOf = Integer.valueOf(getLayerType());
                    this.H = valueOf;
                    if (valueOf.intValue() != 1) {
                        setLayerType(1, null);
                    } else {
                        this.H = null;
                    }
                } else {
                    Integer num = this.H;
                    if (num != null) {
                        setLayerType(num.intValue(), null);
                        this.H = null;
                    }
                }
            }
            invalidate();
        }
    }

    public void setCropWindowChangeListener(b bVar) {
        this.f10915d = bVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.f10914c.r(rectF);
    }

    public void setFixedAspectRatio(boolean z11) {
        if (this.f10932y != z11) {
            this.f10932y = z11;
            if (this.G) {
                l();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.d dVar) {
        if (this.C != dVar) {
            this.C = dVar;
            if (this.G) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(e eVar) {
        this.f10914c.q(eVar);
        setCropShape(eVar.f10981a);
        setSnapRadius(eVar.f10982b);
        setGuidelines(eVar.f10986d);
        setFixedAspectRatio(eVar.f10996l);
        setAspectRatioX(eVar.f10997m);
        setAspectRatioY(eVar.f10998n);
        u(eVar.f10993i);
        this.f10929t = eVar.f10985c;
        this.f10928q = eVar.f10995k;
        this.f10917f = k(eVar.f10999o, eVar.f11000p);
        this.f10926o = eVar.f11004t;
        this.f10927p = eVar.f11005w;
        this.f10918g = k(eVar.f11003q, eVar.f11006x);
        this.f10919h = k(eVar.f11009y, eVar.f11011z);
        this.f10920i = j(eVar.A);
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.F;
        if (rect == null) {
            rect = com.canhub.cropper.c.f10968a;
        }
        rect2.set(rect);
        if (this.G) {
            l();
            invalidate();
            c(false);
        }
    }

    public void setSnapRadius(float f11) {
        this.f10930w = f11;
    }

    public void t(float f11, float f12, float f13, float f14) {
        this.f10914c.p(f11, f12, f13, f14);
    }

    public boolean u(boolean z11) {
        if (this.f10913b != z11) {
            this.f10913b = z11;
            if (z11 && this.f10912a == null) {
                this.f10912a = new ScaleGestureDetector(getContext(), new c());
                return true;
            }
            return true;
        }
        return false;
    }
}