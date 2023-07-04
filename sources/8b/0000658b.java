package db;

import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Animation;
import android.view.animation.Transformation;
import android.widget.ImageView;
import com.canhub.cropper.CropOverlayView;
import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class b extends Animation implements Animation.AnimationListener {

    /* renamed from: a  reason: collision with root package name */
    private final float[] f23864a;

    /* renamed from: b  reason: collision with root package name */
    private final float[] f23865b;

    /* renamed from: c  reason: collision with root package name */
    private final RectF f23866c;

    /* renamed from: d  reason: collision with root package name */
    private final RectF f23867d;

    /* renamed from: e  reason: collision with root package name */
    private final float[] f23868e;

    /* renamed from: f  reason: collision with root package name */
    private final float[] f23869f;

    /* renamed from: g  reason: collision with root package name */
    private final ImageView f23870g;

    /* renamed from: h  reason: collision with root package name */
    private final CropOverlayView f23871h;

    public b(ImageView imageView, CropOverlayView cropOverlayView) {
        s.g(imageView, "imageView");
        s.g(cropOverlayView, "cropOverlayView");
        this.f23870g = imageView;
        this.f23871h = cropOverlayView;
        this.f23864a = new float[8];
        this.f23865b = new float[8];
        this.f23866c = new RectF();
        this.f23867d = new RectF();
        this.f23868e = new float[9];
        this.f23869f = new float[9];
        setDuration(300L);
        setFillAfter(true);
        setInterpolator(new AccelerateDecelerateInterpolator());
        setAnimationListener(this);
    }

    public final void a(float[] boundPoints, Matrix imageMatrix) {
        s.g(boundPoints, "boundPoints");
        s.g(imageMatrix, "imageMatrix");
        System.arraycopy(boundPoints, 0, this.f23865b, 0, 8);
        this.f23867d.set(this.f23871h.getCropWindowRect());
        imageMatrix.getValues(this.f23869f);
    }

    @Override // android.view.animation.Animation
    protected void applyTransformation(float f11, Transformation t11) {
        s.g(t11, "t");
        RectF rectF = new RectF();
        RectF rectF2 = this.f23866c;
        float f12 = rectF2.left;
        RectF rectF3 = this.f23867d;
        rectF.left = f12 + ((rectF3.left - f12) * f11);
        float f13 = rectF2.top;
        rectF.top = f13 + ((rectF3.top - f13) * f11);
        float f14 = rectF2.right;
        rectF.right = f14 + ((rectF3.right - f14) * f11);
        float f15 = rectF2.bottom;
        rectF.bottom = f15 + ((rectF3.bottom - f15) * f11);
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            float[] fArr2 = this.f23864a;
            fArr[i11] = fArr2[i11] + ((this.f23865b[i11] - fArr2[i11]) * f11);
        }
        CropOverlayView cropOverlayView = this.f23871h;
        cropOverlayView.setCropWindowRect(rectF);
        cropOverlayView.s(fArr, this.f23870g.getWidth(), this.f23870g.getHeight());
        cropOverlayView.invalidate();
        float[] fArr3 = new float[9];
        for (int i12 = 0; i12 < 9; i12++) {
            float[] fArr4 = this.f23868e;
            fArr3[i12] = fArr4[i12] + ((this.f23869f[i12] - fArr4[i12]) * f11);
        }
        ImageView imageView = this.f23870g;
        imageView.getImageMatrix().setValues(fArr3);
        imageView.invalidate();
    }

    public final void b(float[] boundPoints, Matrix imageMatrix) {
        s.g(boundPoints, "boundPoints");
        s.g(imageMatrix, "imageMatrix");
        reset();
        System.arraycopy(boundPoints, 0, this.f23864a, 0, 8);
        this.f23866c.set(this.f23871h.getCropWindowRect());
        imageMatrix.getValues(this.f23868e);
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationEnd(Animation animation) {
        s.g(animation, "animation");
        this.f23870g.clearAnimation();
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationRepeat(Animation animation) {
        s.g(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public void onAnimationStart(Animation animation) {
        s.g(animation, "animation");
    }
}