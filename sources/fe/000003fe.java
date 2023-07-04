package androidx.camera.view;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Size;
import android.view.Display;
import android.view.TextureView;
import android.view.View;
import androidx.camera.core.e1;
import androidx.camera.core.n0;
import androidx.camera.view.PreviewView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: h  reason: collision with root package name */
    private static final PreviewView.e f2613h = PreviewView.e.FILL_CENTER;

    /* renamed from: a  reason: collision with root package name */
    private Size f2614a;

    /* renamed from: b  reason: collision with root package name */
    private Rect f2615b;

    /* renamed from: c  reason: collision with root package name */
    private Rect f2616c;

    /* renamed from: d  reason: collision with root package name */
    private int f2617d;

    /* renamed from: e  reason: collision with root package name */
    private int f2618e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f2619f;

    /* renamed from: g  reason: collision with root package name */
    private PreviewView.e f2620g = f2613h;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static /* synthetic */ class a {

        /* renamed from: a  reason: collision with root package name */
        static final /* synthetic */ int[] f2621a;

        static {
            int[] iArr = new int[PreviewView.e.values().length];
            f2621a = iArr;
            try {
                iArr[PreviewView.e.FIT_CENTER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f2621a[PreviewView.e.FILL_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f2621a[PreviewView.e.FIT_END.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f2621a[PreviewView.e.FILL_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f2621a[PreviewView.e.FIT_START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f2621a[PreviewView.e.FILL_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private static RectF b(RectF rectF, float f11) {
        float f12 = f11 + f11;
        return new RectF(f12 - rectF.right, rectF.top, f12 - rectF.left, rectF.bottom);
    }

    private Rect c(Rect rect) {
        h0.c cVar = (h0.c) h0.a.a(h0.c.class);
        if (cVar != null) {
            RectF rectF = new RectF(rect);
            Matrix matrix = new Matrix();
            matrix.setScale(cVar.a(), 1.0f, rect.centerX(), rect.centerY());
            matrix.mapRect(rectF);
            Rect rect2 = new Rect();
            rectF.round(rect2);
            return rect2;
        }
        return rect;
    }

    private Size f() {
        if (y.d(this.f2617d)) {
            return new Size(this.f2616c.height(), this.f2616c.width());
        }
        return new Size(this.f2616c.width(), this.f2616c.height());
    }

    private RectF k(Size size, int i11) {
        v3.h.h(l());
        Matrix i12 = i(size, i11);
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2614a.getWidth(), this.f2614a.getHeight());
        i12.mapRect(rectF);
        return rectF;
    }

    private boolean l() {
        return (this.f2615b == null || this.f2614a == null) ? false : true;
    }

    private static void n(Matrix matrix, RectF rectF, RectF rectF2, PreviewView.e eVar) {
        Matrix.ScaleToFit scaleToFit;
        switch (a.f2621a[eVar.ordinal()]) {
            case 1:
            case 2:
                scaleToFit = Matrix.ScaleToFit.CENTER;
                break;
            case 3:
            case 4:
                scaleToFit = Matrix.ScaleToFit.END;
                break;
            case 5:
            case 6:
                scaleToFit = Matrix.ScaleToFit.START;
                break;
            default:
                n0.c("PreviewTransform", "Unexpected crop rect: " + eVar);
                scaleToFit = Matrix.ScaleToFit.FILL;
                break;
        }
        if (eVar == PreviewView.e.FIT_CENTER || eVar == PreviewView.e.FIT_START || eVar == PreviewView.e.FIT_END) {
            matrix.setRectToRect(rectF, rectF2, scaleToFit);
            return;
        }
        matrix.setRectToRect(rectF2, rectF, scaleToFit);
        matrix.invert(matrix);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Bitmap a(Bitmap bitmap, Size size, int i11) {
        if (l()) {
            Matrix j11 = j();
            RectF k11 = k(size, i11);
            Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), bitmap.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            matrix.postConcat(j11);
            matrix.postScale(k11.width() / this.f2614a.getWidth(), k11.height() / this.f2614a.getHeight());
            matrix.postTranslate(k11.left, k11.top);
            canvas.drawBitmap(bitmap, matrix, new Paint(7));
            return createBitmap;
        }
        return bitmap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix d(Size size, int i11) {
        if (l()) {
            Matrix matrix = new Matrix();
            i(size, i11).invert(matrix);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2614a.getWidth(), this.f2614a.getHeight()), new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, 1.0f), Matrix.ScaleToFit.FILL);
            matrix.postConcat(matrix2);
            return matrix;
        }
        return null;
    }

    RectF e(Size size, int i11) {
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight());
        Size f11 = f();
        RectF rectF2 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, f11.getWidth(), f11.getHeight());
        Matrix matrix = new Matrix();
        n(matrix, rectF2, rectF, this.f2620g);
        matrix.mapRect(rectF2);
        return i11 == 1 ? b(rectF2, size.getWidth() / 2.0f) : rectF2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public PreviewView.e g() {
        return this.f2620g;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Rect h() {
        return this.f2615b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Matrix i(Size size, int i11) {
        RectF e11;
        v3.h.h(l());
        if (m(size)) {
            e11 = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, size.getWidth(), size.getHeight());
        } else {
            e11 = e(size, i11);
        }
        Matrix c11 = y.c(new RectF(this.f2615b), e11, this.f2617d);
        if (this.f2619f) {
            if (y.d(this.f2617d)) {
                c11.preScale(1.0f, -1.0f, this.f2615b.centerX(), this.f2615b.centerY());
            } else {
                c11.preScale(-1.0f, 1.0f, this.f2615b.centerX(), this.f2615b.centerY());
            }
        }
        return c11;
    }

    Matrix j() {
        v3.h.h(l());
        RectF rectF = new RectF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.f2614a.getWidth(), this.f2614a.getHeight());
        int i11 = -y.f(this.f2618e);
        h0.e eVar = (h0.e) h0.a.a(h0.e.class);
        if (eVar != null) {
            i11 += eVar.a(this.f2619f);
        }
        return y.c(rectF, rectF, i11);
    }

    boolean m(Size size) {
        return y.e(size, true, f(), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void o(PreviewView.e eVar) {
        this.f2620g = eVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void p(e1.g gVar, Size size, boolean z11) {
        n0.a("PreviewTransform", "Transformation info set: " + gVar + " " + size + " " + z11);
        this.f2615b = c(gVar.a());
        this.f2616c = gVar.a();
        this.f2617d = gVar.b();
        this.f2618e = gVar.c();
        this.f2614a = size;
        this.f2619f = z11;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void q(Size size, int i11, View view) {
        if (size.getHeight() != 0 && size.getWidth() != 0) {
            if (l()) {
                if (view instanceof TextureView) {
                    ((TextureView) view).setTransform(j());
                } else {
                    Display display = view.getDisplay();
                    if (display != null && display.getRotation() != this.f2618e) {
                        n0.c("PreviewTransform", "Non-display rotation not supported with SurfaceView / PERFORMANCE mode.");
                    }
                }
                RectF k11 = k(size, i11);
                view.setPivotX(BitmapDescriptorFactory.HUE_RED);
                view.setPivotY(BitmapDescriptorFactory.HUE_RED);
                view.setScaleX(k11.width() / this.f2614a.getWidth());
                view.setScaleY(k11.height() / this.f2614a.getHeight());
                view.setTranslationX(k11.left - view.getLeft());
                view.setTranslationY(k11.top - view.getTop());
                return;
            }
            return;
        }
        n0.m("PreviewTransform", "Transform not applied due to PreviewView size: " + size);
    }
}