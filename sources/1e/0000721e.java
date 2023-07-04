package h2;

/* loaded from: classes.dex */
public final class n {
    public static final f0 a(k kVar) {
        kotlin.jvm.internal.s.g(kVar, "<this>");
        f0 d02 = kVar.d0();
        if (d02 != null) {
            return d02;
        }
        throw new IllegalStateException("LayoutNode should be attached to an owner".toString());
    }
}