package d8;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.RectF;
import c8.o;
import f8.j;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public class g extends b {
    private final x7.d B;
    private final c C;

    /* JADX INFO: Access modifiers changed from: package-private */
    public g(com.airbnb.lottie.a aVar, e eVar, c cVar) {
        super(aVar, eVar);
        this.C = cVar;
        x7.d dVar = new x7.d(aVar, this, new o("__container", eVar.n(), false));
        this.B = dVar;
        dVar.b(Collections.emptyList(), Collections.emptyList());
    }

    @Override // d8.b
    protected void G(a8.e eVar, int i11, List<a8.e> list, a8.e eVar2) {
        this.B.d(eVar, i11, list, eVar2);
    }

    @Override // d8.b, x7.e
    public void e(RectF rectF, Matrix matrix, boolean z11) {
        super.e(rectF, matrix, z11);
        this.B.e(rectF, this.f23789m, z11);
    }

    @Override // d8.b
    void s(Canvas canvas, Matrix matrix, int i11) {
        this.B.g(canvas, matrix, i11);
    }

    @Override // d8.b
    public c8.a u() {
        c8.a u11 = super.u();
        return u11 != null ? u11 : this.C.u();
    }

    @Override // d8.b
    public j w() {
        j w11 = super.w();
        return w11 != null ? w11 : this.C.w();
    }
}