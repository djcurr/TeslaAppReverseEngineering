package y0;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public static final n f58482a = new n();

    private n() {
    }

    private final float a(float f11, float f12, c1.i iVar, int i11) {
        iVar.x(-1499253717);
        long v11 = ((t1.a0) iVar.A(p.a())).v();
        if (!h0.f58131a.a(iVar, 6).o() ? t1.c0.h(v11) >= 0.5d : t1.c0.h(v11) <= 0.5d) {
            f11 = f12;
        }
        iVar.N();
        return f11;
    }

    public final float b(c1.i iVar, int i11) {
        iVar.x(-651892877);
        float a11 = a(0.38f, 0.38f, iVar, ((i11 << 6) & 896) | 54);
        iVar.N();
        return a11;
    }

    public final float c(c1.i iVar, int i11) {
        iVar.x(-1305244065);
        float a11 = a(1.0f, 0.87f, iVar, ((i11 << 6) & 896) | 54);
        iVar.N();
        return a11;
    }

    public final float d(c1.i iVar, int i11) {
        iVar.x(575700177);
        float a11 = a(0.74f, 0.6f, iVar, ((i11 << 6) & 896) | 54);
        iVar.N();
        return a11;
    }
}