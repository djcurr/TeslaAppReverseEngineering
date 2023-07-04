package y7;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;

/* loaded from: classes.dex */
public class b extends g<Integer> {
    public b(List<i8.a<Integer>> list) {
        super(list);
    }

    public int p() {
        return q(b(), d());
    }

    public int q(i8.a<Integer> aVar, float f11) {
        Integer num;
        if (aVar.f30188b != null && aVar.f30189c != null) {
            i8.c<A> cVar = this.f59262e;
            if (cVar != 0 && (num = (Integer) cVar.b(aVar.f30193g, aVar.f30194h.floatValue(), aVar.f30188b, aVar.f30189c, f11, e(), f())) != null) {
                return num.intValue();
            }
            return h8.b.c(h8.g.c(f11, BitmapDescriptorFactory.HUE_RED, 1.0f), aVar.f30188b.intValue(), aVar.f30189c.intValue());
        }
        throw new IllegalStateException("Missing values for keyframe.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // y7.a
    /* renamed from: r */
    public Integer i(i8.a<Integer> aVar, float f11) {
        return Integer.valueOf(q(aVar, f11));
    }
}