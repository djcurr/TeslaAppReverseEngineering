package freemarker.core;

/* loaded from: classes5.dex */
public final class m extends k {

    /* renamed from: h  reason: collision with root package name */
    private static final char[] f26888h;

    /* renamed from: i  reason: collision with root package name */
    static final m f26889i;

    /* renamed from: f  reason: collision with root package name */
    private char[] f26890f;

    /* renamed from: g  reason: collision with root package name */
    private final boolean f26891g;

    static {
        char[] cArr = new char[0];
        f26888h = cArr;
        f26889i = new m(cArr, false);
    }

    private m(char[] cArr, boolean z11) {
        this.f26890f = cArr;
        this.f26891g = z11;
    }

    @Override // freemarker.core.k
    protected String d(boolean z11) {
        if (z11) {
            String str = new String(this.f26890f);
            if (this.f26891g) {
                StringBuffer stringBuffer = new StringBuffer();
                stringBuffer.append("<#noparse>");
                stringBuffer.append(str);
                stringBuffer.append("</#noparse>");
                return stringBuffer.toString();
            }
            return str;
        }
        StringBuffer stringBuffer2 = new StringBuffer();
        stringBuffer2.append("text ");
        stringBuffer2.append(jx.e.g(new String(this.f26890f)));
        return stringBuffer2.toString();
    }
}