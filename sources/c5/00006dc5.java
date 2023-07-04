package f8;

import android.graphics.PointF;
import g8.c;

/* loaded from: classes.dex */
public class b0 implements m0<PointF> {

    /* renamed from: a  reason: collision with root package name */
    public static final b0 f26059a = new b0();

    private b0() {
    }

    @Override // f8.m0
    /* renamed from: b */
    public PointF a(g8.c cVar, float f11) {
        c.b e02 = cVar.e0();
        if (e02 == c.b.BEGIN_ARRAY) {
            return s.e(cVar, f11);
        }
        if (e02 == c.b.BEGIN_OBJECT) {
            return s.e(cVar, f11);
        }
        if (e02 == c.b.NUMBER) {
            PointF pointF = new PointF(((float) cVar.D()) * f11, ((float) cVar.D()) * f11);
            while (cVar.p()) {
                cVar.u0();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is " + e02);
    }
}