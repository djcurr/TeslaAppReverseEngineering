package f8;

import a8.b;
import g8.c;

/* loaded from: classes.dex */
public class i implements m0<a8.b> {

    /* renamed from: a  reason: collision with root package name */
    public static final i f26074a = new i();

    /* renamed from: b  reason: collision with root package name */
    private static final c.a f26075b = c.a.a("t", "f", "s", "j", "tr", "lh", "ls", "fc", "sc", "sw", "of");

    private i() {
    }

    @Override // f8.m0
    /* renamed from: b */
    public a8.b a(g8.c cVar, float f11) {
        b.a aVar = b.a.CENTER;
        cVar.j();
        b.a aVar2 = aVar;
        String str = null;
        String str2 = null;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        float f12 = 0.0f;
        float f13 = 0.0f;
        float f14 = 0.0f;
        float f15 = 0.0f;
        boolean z11 = true;
        while (cVar.p()) {
            switch (cVar.p0(f26075b)) {
                case 0:
                    str = cVar.R();
                    break;
                case 1:
                    str2 = cVar.R();
                    break;
                case 2:
                    f12 = (float) cVar.D();
                    break;
                case 3:
                    int J = cVar.J();
                    aVar2 = b.a.CENTER;
                    if (J <= aVar2.ordinal() && J >= 0) {
                        aVar2 = b.a.values()[J];
                        break;
                    }
                    break;
                case 4:
                    i11 = cVar.J();
                    break;
                case 5:
                    f13 = (float) cVar.D();
                    break;
                case 6:
                    f14 = (float) cVar.D();
                    break;
                case 7:
                    i12 = s.d(cVar);
                    break;
                case 8:
                    i13 = s.d(cVar);
                    break;
                case 9:
                    f15 = (float) cVar.D();
                    break;
                case 10:
                    z11 = cVar.C();
                    break;
                default:
                    cVar.t0();
                    cVar.u0();
                    break;
            }
        }
        cVar.m();
        return new a8.b(str, str2, f12, aVar2, i11, f13, f14, i12, i13, f15, z11);
    }
}