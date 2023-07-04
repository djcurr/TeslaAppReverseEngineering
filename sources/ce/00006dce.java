package f8;

import android.graphics.Color;
import g8.c;

/* loaded from: classes.dex */
public class g implements m0<Integer> {

    /* renamed from: a  reason: collision with root package name */
    public static final g f26069a = new g();

    private g() {
    }

    @Override // f8.m0
    /* renamed from: b */
    public Integer a(g8.c cVar, float f11) {
        boolean z11 = cVar.e0() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.g();
        }
        double D = cVar.D();
        double D2 = cVar.D();
        double D3 = cVar.D();
        double D4 = cVar.e0() == c.b.NUMBER ? cVar.D() : 1.0d;
        if (z11) {
            cVar.l();
        }
        if (D <= 1.0d && D2 <= 1.0d && D3 <= 1.0d) {
            D *= 255.0d;
            D2 *= 255.0d;
            D3 *= 255.0d;
            if (D4 <= 1.0d) {
                D4 *= 255.0d;
            }
        }
        return Integer.valueOf(Color.argb((int) D4, (int) D, (int) D2, (int) D3));
    }
}