package d8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

/* loaded from: classes.dex */
public class f extends b {
    /* JADX INFO: Access modifiers changed from: package-private */
    public f(com.airbnb.lottie.a aVar, e eVar) {
        super(aVar, eVar);
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        rectF.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
    }

    @Override // d8.b
    void s(Canvas canvas, Matrix matrix, int i11) {
    }
}