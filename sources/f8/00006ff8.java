package g30;

/* loaded from: classes5.dex */
public abstract class y0 extends v1<String> {
    protected abstract String Y(String str, String str2);

    protected String Z(e30.f desc, int i11) {
        kotlin.jvm.internal.s.g(desc, "desc");
        return desc.e(i11);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // g30.v1
    /* renamed from: a0 */
    public final String U(e30.f fVar, int i11) {
        kotlin.jvm.internal.s.g(fVar, "<this>");
        return b0(Z(fVar, i11));
    }

    protected final String b0(String nestedName) {
        kotlin.jvm.internal.s.g(nestedName, "nestedName");
        String T = T();
        if (T == null) {
            T = "";
        }
        return Y(T, nestedName);
    }
}