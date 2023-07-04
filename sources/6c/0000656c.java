package d8;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import v7.j;
import y7.q;

/* loaded from: classes.dex */
public class d extends b {
    private final Paint B;
    private final Rect C;
    private final Rect D;
    private y7.a<ColorFilter, ColorFilter> E;
    private y7.a<Bitmap, Bitmap> F;

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
        this.B = new w7.a(3);
        this.C = new Rect();
        this.D = new Rect();
    }

    private Bitmap N() {
        Bitmap h11;
        y7.a<Bitmap, Bitmap> aVar = this.F;
        return (aVar == null || (h11 = aVar.h()) == null) ? this.f23790n.u(this.f23791o.m()) : h11;
    }

    @Override // d8.b, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == j.K) {
            if (cVar == null) {
                this.E = null;
            } else {
                this.E = new q(cVar);
            }
        } else if (t11 == j.N) {
            if (cVar == null) {
                this.F = null;
            } else {
                this.F = new q(cVar);
            }
        }
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        Bitmap N = N();
        if (N != null) {
            rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, N.getWidth() * h8.h.e(), N.getHeight() * h8.h.e());
            this.f23789m.mapRect(rectF);
        }
    }

    @Override // d8.b
    public void s(Canvas canvas, Matrix matrix, int i11) {
        Bitmap N = N();
        if (N == null || N.isRecycled()) {
            return;
        }
        float e11 = h8.h.e();
        this.B.setAlpha(i11);
        y7.a<ColorFilter, ColorFilter> aVar = this.E;
        if (aVar != null) {
            this.B.setColorFilter(aVar.h());
        }
        canvas.save();
        canvas.concat(matrix);
        this.C.set(0, 0, N.getWidth(), N.getHeight());
        this.D.set(0, 0, (int) (N.getWidth() * e11), (int) (N.getHeight() * e11));
        canvas.drawBitmap(N, this.C, this.D, this.B);
        canvas.restore();
    }
}