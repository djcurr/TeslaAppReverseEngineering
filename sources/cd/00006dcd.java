package f8;

import g8.c;

/* loaded from: classes.dex */
public class f0 implements m0<i8.d> {

    /* renamed from: a  reason: collision with root package name */
    public static final f0 f26068a = new f0();

    private f0() {
    }

    @Override // f8.m0
    /* renamed from: b */
    public i8.d a(g8.c cVar, float f11) {
        boolean z11 = cVar.e0() == c.b.BEGIN_ARRAY;
        if (z11) {
            cVar.g();
        }
        float D = (float) cVar.D();
        float D2 = (float) cVar.D();
        while (cVar.p()) {
            cVar.u0();
        }
        if (z11) {
            cVar.l();
        }
        return new i8.d((D / 100.0f) * f11, (D2 / 100.0f) * f11);
    }
}