package y7;

import android.graphics.PointF;
import java.util.List;

/* loaded from: classes.dex */
public class k extends g<PointF> {

    /* renamed from: i  reason: collision with root package name */
    private final PointF f59290i;

    public k(List<i8.a<PointF>> list) {
        super(list);
        this.f59290i = new PointF();
    }

    @Override // y7.a
    /* renamed from: p */
    public PointF i(i8.a<PointF> aVar, float f11) {
        return j(aVar, f11, f11, f11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // y7.a
    /* renamed from: q */
    public PointF j(i8.a<PointF> aVar, float f11, float f12, float f13) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = aVar.f30188b;
        if (pointF3 != null && (pointF = aVar.f30189c) != null) {
            PointF pointF4 = pointF3;
            PointF pointF5 = pointF;
            i8.c<A> cVar = this.f59262e;
            if (cVar == 0 || (pointF2 = (PointF) cVar.b(aVar.f30193g, aVar.f30194h.floatValue(), pointF4, pointF5, f11, e(), f())) == null) {
                PointF pointF6 = this.f59290i;
                float f14 = pointF4.x;
                float f15 = f14 + (f12 * (pointF5.x - f14));
                float f16 = pointF4.y;
                pointF6.set(f15, f16 + (f13 * (pointF5.y - f16)));
                return this.f59290i;
            }
            return pointF2;
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }
}