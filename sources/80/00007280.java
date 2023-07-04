package h30;

import ch.qos.logback.core.CoreConstants;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public final class g0 extends a {

    /* renamed from: e  reason: collision with root package name */
    private final String f28845e;

    public g0(String source) {
        kotlin.jvm.internal.s.g(source, "source");
        this.f28845e = source;
    }

    @Override // h30.a
    public int F(int i11) {
        if (i11 < B().length()) {
            return i11;
        }
        return -1;
    }

    @Override // h30.a
    public int H() {
        char charAt;
        int i11 = this.f28788a;
        if (i11 == -1) {
            return i11;
        }
        while (i11 < B().length() && ((charAt = B().charAt(i11)) == ' ' || charAt == '\n' || charAt == '\r' || charAt == '\t')) {
            i11++;
        }
        this.f28788a = i11;
        return i11;
    }

    @Override // h30.a
    public boolean K() {
        int H = H();
        if (H == B().length() || H == -1 || B().charAt(H) != ',') {
            return false;
        }
        this.f28788a++;
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // h30.a
    /* renamed from: O */
    public String B() {
        return this.f28845e;
    }

    @Override // h30.a
    public boolean f() {
        int i11 = this.f28788a;
        if (i11 == -1) {
            return false;
        }
        while (i11 < B().length()) {
            char charAt = B().charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                this.f28788a = i11;
                return C(charAt);
            }
            i11++;
        }
        this.f28788a = i11;
        return false;
    }

    @Override // h30.a
    public String k() {
        int Y;
        n(CoreConstants.DOUBLE_QUOTE_CHAR);
        int i11 = this.f28788a;
        Y = kotlin.text.w.Y(B(), CoreConstants.DOUBLE_QUOTE_CHAR, i11, false, 4, null);
        if (Y != -1) {
            for (int i12 = i11; i12 < Y; i12++) {
                if (B().charAt(i12) == '\\') {
                    return q(B(), this.f28788a, i12);
                }
            }
            this.f28788a = Y + 1;
            String substring = B().substring(i11, Y);
            kotlin.jvm.internal.s.f(substring, "this as java.lang.String…ing(startIndex, endIndex)");
            return substring;
        }
        y((byte) 1);
        throw new KotlinNothingValueException();
    }

    @Override // h30.a
    public byte l() {
        byte a11;
        String B = B();
        do {
            int i11 = this.f28788a;
            if (i11 == -1 || i11 >= B.length()) {
                return (byte) 10;
            }
            int i12 = this.f28788a;
            this.f28788a = i12 + 1;
            a11 = b.a(B.charAt(i12));
        } while (a11 == 3);
        return a11;
    }

    @Override // h30.a
    public void n(char c11) {
        if (this.f28788a == -1) {
            M(c11);
        }
        String B = B();
        while (this.f28788a < B.length()) {
            int i11 = this.f28788a;
            this.f28788a = i11 + 1;
            char charAt = B.charAt(i11);
            if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                if (charAt == c11) {
                    return;
                }
                M(c11);
            }
        }
        M(c11);
    }
}