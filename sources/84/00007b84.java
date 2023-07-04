package je;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public class k extends n {
    private final Paint K;
    private final Paint L;
    private final Bitmap O;
    private WeakReference<Bitmap> P;

    public k(Resources resources, Bitmap bitmap, Paint paint) {
        super(new BitmapDrawable(resources, bitmap));
        Paint paint2 = new Paint();
        this.K = paint2;
        Paint paint3 = new Paint(1);
        this.L = paint3;
        this.O = bitmap;
        if (paint != null) {
            paint2.set(paint);
        }
        paint2.setFlags(1);
        paint3.setStyle(Paint.Style.STROKE);
    }

    private void g() {
        WeakReference<Bitmap> weakReference = this.P;
        if (weakReference == null || weakReference.get() != this.O) {
            this.P = new WeakReference<>(this.O);
            Paint paint = this.K;
            Bitmap bitmap = this.O;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            paint.setShader(new BitmapShader(bitmap, tileMode, tileMode));
            this.f33415f = true;
        }
        if (this.f33415f) {
            this.K.getShader().setLocalMatrix(this.B);
            this.f33415f = false;
        }
        this.K.setFilterBitmap(a());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // je.n
    public boolean d() {
        return super.d() && this.O != null;
    }

    @Override // je.n, android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        if (tf.b.d()) {
            tf.b.a("RoundedBitmapDrawable#draw");
        }
        if (!d()) {
            super.draw(canvas);
            if (tf.b.d()) {
                tf.b.b();
                return;
            }
            return;
        }
        f();
        e();
        g();
        int save = canvas.save();
        canvas.concat(this.f33430y);
        canvas.drawPath(this.f33414e, this.K);
        float f11 = this.f33413d;
        if (f11 > BitmapDescriptorFactory.HUE_RED) {
            this.L.setStrokeWidth(f11);
            this.L.setColor(e.c(this.f33416g, this.K.getAlpha()));
            canvas.drawPath(this.f33417h, this.L);
        }
        canvas.restoreToCount(save);
        if (tf.b.d()) {
            tf.b.b();
        }
    }

    @Override // je.n, android.graphics.drawable.Drawable
    public void setAlpha(int i11) {
        super.setAlpha(i11);
        if (i11 != this.K.getAlpha()) {
            this.K.setAlpha(i11);
            super.setAlpha(i11);
            invalidateSelf();
        }
    }

    @Override // je.n, android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
        this.K.setColorFilter(colorFilter);
    }
}