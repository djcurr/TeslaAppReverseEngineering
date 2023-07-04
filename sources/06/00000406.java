package androidx.camera.view;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.util.Size;
import z.m0;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class l extends m0 {

    /* renamed from: d  reason: collision with root package name */
    static final PointF f2635d = new PointF(2.0f, 2.0f);

    /* renamed from: b  reason: collision with root package name */
    private final f f2636b;

    /* renamed from: c  reason: collision with root package name */
    private Matrix f2637c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public l(f fVar) {
        this.f2636b = fVar;
    }

    @Override // z.m0
    protected PointF a(float f11, float f12) {
        float[] fArr = {f11, f12};
        synchronized (this) {
            Matrix matrix = this.f2637c;
            if (matrix == null) {
                return f2635d;
            }
            matrix.mapPoints(fArr);
            return new PointF(fArr[0], fArr[1]);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void e(Size size, int i11) {
        a0.j.a();
        synchronized (this) {
            if (size.getWidth() != 0 && size.getHeight() != 0) {
                this.f2637c = this.f2636b.d(size, i11);
                return;
            }
            this.f2637c = null;
        }
    }
}