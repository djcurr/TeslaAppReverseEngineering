package je;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* loaded from: classes3.dex */
public class l extends Drawable implements j {

    /* renamed from: c  reason: collision with root package name */
    float[] f33379c;

    /* renamed from: a  reason: collision with root package name */
    private final float[] f33377a = new float[8];

    /* renamed from: b  reason: collision with root package name */
    final float[] f33378b = new float[8];

    /* renamed from: d  reason: collision with root package name */
    final Paint f33380d = new Paint(1);

    /* renamed from: e  reason: collision with root package name */
    private boolean f33381e = false;

    /* renamed from: f  reason: collision with root package name */
    private float f33382f = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: g  reason: collision with root package name */
    private float f33383g = BitmapDescriptorFactory.HUE_RED;

    /* renamed from: h  reason: collision with root package name */
    private int f33384h = 0;

    /* renamed from: i  reason: collision with root package name */
    private boolean f33385i = false;

    /* renamed from: j  reason: collision with root package name */
    private boolean f33386j = false;

    /* renamed from: k  reason: collision with root package name */
    final Path f33387k = new Path();

    /* renamed from: l  reason: collision with root package name */
    final Path f33388l = new Path();

    /* renamed from: m  reason: collision with root package name */
    private int f33389m = 0;

    /* renamed from: n  reason: collision with root package name */
    private final RectF f33390n = new RectF();

    /* renamed from: o  reason: collision with root package name */
    private int f33391o = 255;

    public l(int i11) {
        e(i11);
    }

    public static l a(ColorDrawable colorDrawable) {
        return new l(colorDrawable.getColor());
    }

    private void f() {
        float[] fArr;
        float[] fArr2;
        this.f33387k.reset();
        this.f33388l.reset();
        this.f33390n.set(getBounds());
        RectF rectF = this.f33390n;
        float f11 = this.f33382f;
        rectF.inset(f11 / 2.0f, f11 / 2.0f);
        int i11 = 0;
        if (this.f33381e) {
            this.f33388l.addCircle(this.f33390n.centerX(), this.f33390n.centerY(), Math.min(this.f33390n.width(), this.f33390n.height()) / 2.0f, Path.Direction.CW);
        } else {
            int i12 = 0;
            while (true) {
                fArr = this.f33378b;
                if (i12 >= fArr.length) {
                    break;
                }
                fArr[i12] = (this.f33377a[i12] + this.f33383g) - (this.f33382f / 2.0f);
                i12++;
            }
            this.f33388l.addRoundRect(this.f33390n, fArr, Path.Direction.CW);
        }
        RectF rectF2 = this.f33390n;
        float f12 = this.f33382f;
        rectF2.inset((-f12) / 2.0f, (-f12) / 2.0f);
        float f13 = this.f33383g + (this.f33385i ? this.f33382f : BitmapDescriptorFactory.HUE_RED);
        this.f33390n.inset(f13, f13);
        if (this.f33381e) {
            this.f33387k.addCircle(this.f33390n.centerX(), this.f33390n.centerY(), Math.min(this.f33390n.width(), this.f33390n.height()) / 2.0f, Path.Direction.CW);
        } else if (this.f33385i) {
            if (this.f33379c == null) {
                this.f33379c = new float[8];
            }
            while (true) {
                fArr2 = this.f33379c;
                if (i11 >= fArr2.length) {
                    break;
                }
                fArr2[i11] = this.f33377a[i11] - this.f33382f;
                i11++;
            }
            this.f33387k.addRoundRect(this.f33390n, fArr2, Path.Direction.CW);
        } else {
            this.f33387k.addRoundRect(this.f33390n, this.f33377a, Path.Direction.CW);
        }
        float f14 = -f13;
        this.f33390n.inset(f14, f14);
    }

    @Override // je.j
    public void b(int i11, float f11) {
        if (this.f33384h != i11) {
            this.f33384h = i11;
            invalidateSelf();
        }
        if (this.f33382f != f11) {
            this.f33382f = f11;
            f();
            invalidateSelf();
        }
    }

    @Override // je.j
    public void c(boolean z11) {
        this.f33381e = z11;
        f();
        invalidateSelf();
    }

    public boolean d() {
        return this.f33386j;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        this.f33380d.setColor(e.c(this.f33389m, this.f33391o));
        this.f33380d.setStyle(Paint.Style.FILL);
        this.f33380d.setFilterBitmap(d());
        canvas.drawPath(this.f33387k, this.f33380d);
        if (this.f33382f != BitmapDescriptorFactory.HUE_RED) {
            this.f33380d.setColor(e.c(this.f33384h, this.f33391o));
            this.f33380d.setStyle(Paint.Style.STROKE);
            this.f33380d.setStrokeWidth(this.f33382f);
            canvas.drawPath(this.f33388l, this.f33380d);
        }
    }

    public void e(int i11) {
        if (this.f33389m != i11) {
            this.f33389m = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f33391o;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return e.b(e.c(this.f33389m, this.f33391o));
    }

    @Override // je.j
    public void i(float f11) {
        if (this.f33383g != f11) {
            this.f33383g = f11;
            f();
            invalidateSelf();
        }
    }

    @Override // je.j
    public void j(float f11) {
        md.k.c(f11 >= BitmapDescriptorFactory.HUE_RED, "radius should be non negative");
        Arrays.fill(this.f33377a, f11);
        f();
        invalidateSelf();
    }

    @Override // je.j
    public void m(boolean z11) {
        if (this.f33386j != z11) {
            this.f33386j = z11;
            invalidateSelf();
        }
    }

    @Override // je.j
    public void n(boolean z11) {
        if (this.f33385i != z11) {
            this.f33385i = z11;
            f();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        f();
    }

    @Override // je.j
    public void s(float[] fArr) {
        if (fArr == null) {
            Arrays.fill(this.f33377a, (float) BitmapDescriptorFactory.HUE_RED);
        } else {
            md.k.c(fArr.length == 8, "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f33377a, 0, 8);
        }
        f();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        if (i11 != this.f33391o) {
            this.f33391o = i11;
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}