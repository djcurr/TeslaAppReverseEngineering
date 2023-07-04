package f8;

import g8.c;

/* loaded from: classes.dex */
class n {

    /* renamed from: a  reason: collision with root package name */
    private static final c.a f26096a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a8.c a(g8.c cVar) {
        cVar.j();
        String str = null;
        String str2 = null;
        float f11 = 0.0f;
        String str3 = null;
        while (cVar.p()) {
            int p02 = cVar.p0(f26096a);
            if (p02 == 0) {
                str = cVar.R();
            } else if (p02 == 1) {
                str3 = cVar.R();
            } else if (p02 == 2) {
                str2 = cVar.R();
            } else if (p02 != 3) {
                cVar.t0();
                cVar.u0();
            } else {
                f11 = (float) cVar.D();
            }
        }
        cVar.m();
        return new a8.c(str, str3, str2, f11);
    }
}