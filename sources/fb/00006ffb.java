package g30;

/* loaded from: classes5.dex */
public abstract class z0 extends w1<String> {
    protected abstract String Z(String str, String str2);

    protected String a0(e30.f descriptor, int i11) {
        kotlin.jvm.internal.s.g(descriptor, "descriptor");
        return descriptor.e(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.w1
    /* renamed from: b0 */
    public final String W(e30.f fVar, int i11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return c0(a0(fVar, i11));
    }

    protected final String c0(String nestedName) {
        kotlin.jvm.internal.s.g(nestedName, "nestedName");
        String V = V();
        if (V == null) {
            V = "";
        }
        return Z(V, nestedName);
    }
}