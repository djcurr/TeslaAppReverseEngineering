package u1;

import kotlin.jvm.internal.s;

/* loaded from: classes.dex */
public final class n extends c {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String name, int i11) {
        super(name, b.f52891a.c(), i11, null);
        s.g(name, "name");
    }

    private final float j(float f11) {
        float l11;
        l11 = m00.l.l(f11, -2.0f, 2.0f);
        return l11;
    }

    @Override // u1.c
    public float[] a(float[] v11) {
        s.g(v11, "v");
        v11[0] = j(v11[0]);
        v11[1] = j(v11[1]);
        v11[2] = j(v11[2]);
        return v11;
    }

    @Override // u1.c
    public float d(int i11) {
        return 2.0f;
    }

    @Override // u1.c
    public float e(int i11) {
        return -2.0f;
    }

    @Override // u1.c
    public float[] i(float[] v11) {
        s.g(v11, "v");
        v11[0] = j(v11[0]);
        v11[1] = j(v11[1]);
        v11[2] = j(v11[2]);
        return v11;
    }
}