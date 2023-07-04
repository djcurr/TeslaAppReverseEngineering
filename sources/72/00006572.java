package d8;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import v7.j;
import y7.q;

/* loaded from: classes.dex */
public class h extends b {
    private final RectF B;
    private final Paint C;
    private final float[] D;
    private final Path E;
    private final e F;
    private y7.a<ColorFilter, ColorFilter> G;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
        this.B = new RectF();
        w7.a aVar2 = new w7.a();
        this.C = aVar2;
        this.D = new float[8];
        this.E = new Path();
        this.F = eVar;
        aVar2.setAlpha(0);
        aVar2.setStyle(Paint.Style.FILL);
        aVar2.setColor(eVar.o());
    }

    @Override // d8.b, a8.f
    public <T> void c(T t11, i8.c<T> cVar) {
        super.c(t11, cVar);
        if (t11 == j.K) {
            if (cVar == null) {
                this.G = null;
            } else {
                this.G = new q(cVar);
            }
        }
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        this.B.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, this.F.q(), this.F.p());
        this.f23789m.mapRect(this.B);
        rectF.set(this.B);
    }

    @Override // d8.b
    public void s(Canvas canvas, Matrix matrix, int i11) {
        int alpha = Color.alpha(this.F.o());
        if (alpha == 0) {
            return;
        }
        int intValue = (int) ((i11 / 255.0f) * (((alpha / 255.0f) * (this.f23798v.h() == null ? 100 : this.f23798v.h().h().intValue())) / 100.0f) * 255.0f);
        this.C.setAlpha(intValue);
        y7.a<ColorFilter, ColorFilter> aVar = this.G;
        if (aVar != null) {
            this.C.setColorFilter(aVar.h());
        }
        if (intValue > 0) {
            float[] fArr = this.D;
            fArr[0] = 0.0f;
            fArr[1] = 0.0f;
            fArr[2] = this.F.q();
            float[] fArr2 = this.D;
            fArr2[3] = 0.0f;
            fArr2[4] = this.F.q();
            this.D[5] = this.F.p();
            float[] fArr3 = this.D;
            fArr3[6] = 0.0f;
            fArr3[7] = this.F.p();
            matrix.mapPoints(this.D);
            this.E.reset();
            Path path = this.E;
            float[] fArr4 = this.D;
            path.moveTo(fArr4[0], fArr4[1]);
            Path path2 = this.E;
            float[] fArr5 = this.D;
            path2.lineTo(fArr5[2], fArr5[3]);
            Path path3 = this.E;
            float[] fArr6 = this.D;
            path3.lineTo(fArr6[4], fArr6[5]);
            Path path4 = this.E;
            float[] fArr7 = this.D;
            path4.lineTo(fArr7[6], fArr7[7]);
            Path path5 = this.E;
            float[] fArr8 = this.D;
            path5.lineTo(fArr8[0], fArr8[1]);
            this.E.close();
            canvas.drawPath(this.E, this.C);
        }
    }
}