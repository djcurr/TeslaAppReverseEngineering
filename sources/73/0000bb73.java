package w0;

/* loaded from: classes.dex */
public final class w0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long b(long j11, s1.h hVar) {
        float j12;
        float e11;
        if (s1.f.l(j11) < hVar.i()) {
            j12 = hVar.i();
        } else {
            j12 = s1.f.l(j11) > hVar.j() ? hVar.j() : s1.f.l(j11);
        }
        if (s1.f.m(j11) < hVar.l()) {
            e11 = hVar.l();
        } else {
            e11 = s1.f.m(j11) > hVar.e() ? hVar.e() : s1.f.m(j11);
        }
        return s1.g.a(j12, e11);
    }
}