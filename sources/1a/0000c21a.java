package y7;

import java.util.List;

/* loaded from: classes.dex */
public class d extends g<Float> {
    public d(List<i8.a<Float>> list) {
        super(list);
    }

    public float p() {
        return q(b(), d());
    }

    float q(i8.a<Float> aVar, float f11) {
        Float f12;
        if (aVar.f30188b != null && aVar.f30189c != null) {
            i8.c<A> cVar = this.f59262e;
            if (cVar != 0 && (f12 = (Float) cVar.b(aVar.f30193g, aVar.f30194h.floatValue(), aVar.f30188b, aVar.f30189c, f11, e(), f())) != null) {
                return f12.floatValue();
            }
            return h8.g.k(aVar.f(), aVar.c(), f11);
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    @Override // y7.a
    /* renamed from: r */
    public Float i(i8.a<Float> aVar, float f11) {
        return Float.valueOf(q(aVar, f11));
    }
}