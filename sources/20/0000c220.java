package y7;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class j extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f59286i;

    /* renamed from: j  reason: collision with root package name */
    private final float[] f59287j;

    /* renamed from: k  reason: collision with root package name */
    private final PathMeasure f59288k;

    /* renamed from: l  reason: collision with root package name */
    private i f59289l;

    public j(List<? extends i8.a<PointF>> list) {
        super(list);
        this.f59286i = new PointF();
        this.f59287j = new float[2];
        this.f59288k = new PathMeasure();
    }

    @Override // y7.a
    /* renamed from: p */
    public PointF i(i8.a<PointF> aVar, float f11) {
        PointF pointF;
        i iVar = (i) aVar;
        Path j11 = iVar.j();
        if (j11 == null) {
            return aVar.f30188b;
        }
        i8.c<A> cVar = this.f59262e;
        if (cVar == 0 || (pointF = (PointF) cVar.b(iVar.f30193g, iVar.f30194h.floatValue(), (PointF) iVar.f30188b, (PointF) iVar.f30189c, e(), f11, f())) == null) {
            if (this.f59289l != iVar) {
                this.f59288k.setPath(j11, false);
                this.f59289l = iVar;
            }
            PathMeasure pathMeasure = this.f59288k;
            pathMeasure.getPosTan(f11 * pathMeasure.getLength(), this.f59287j, null);
            PointF pointF2 = this.f59286i;
            float[] fArr = this.f59287j;
            pointF2.set(fArr[0], fArr[1]);
            return this.f59286i;
        }
        return pointF;
    }
}