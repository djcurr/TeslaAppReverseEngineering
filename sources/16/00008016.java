package kotlinx.coroutines.internal;

/* loaded from: classes5.dex */
public final class p {
    public static final void a(int i11) {
        if (!(i11 >= 1)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.p("Expected positive parallelism level, but got ", Integer.valueOf(i11)).toString());
        }
    }
}