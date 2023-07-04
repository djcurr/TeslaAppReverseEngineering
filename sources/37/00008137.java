package l0;

/* loaded from: classes.dex */
public final class b {
    public static final a<Float, m> a(float f11, float f12) {
        return new a<>(Float.valueOf(f11), f1.b(kotlin.jvm.internal.l.f34915a), Float.valueOf(f12));
    }

    public static /* synthetic */ a b(float f11, float f12, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            f12 = 0.01f;
        }
        return a(f11, f12);
    }
}