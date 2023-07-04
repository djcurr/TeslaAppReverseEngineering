package h30;

import ch.qos.logback.core.CoreConstants;
import com.adyen.checkout.components.model.payments.request.Address;
import java.util.ArrayList;
import kotlin.KotlinNothingValueException;

/* loaded from: classes5.dex */
public abstract class a {

    /* renamed from: a  reason: collision with root package name */
    protected int f28788a;

    /* renamed from: c  reason: collision with root package name */
    private String f28790c;

    /* renamed from: b  reason: collision with root package name */
    public final q f28789b = new q();

    /* renamed from: d  reason: collision with root package name */
    private StringBuilder f28791d = new StringBuilder();

    private final int A(CharSequence charSequence, int i11) {
        char charAt = charSequence.charAt(i11);
        boolean z11 = true;
        if ('0' <= charAt && charAt < ':') {
            return charAt - '0';
        }
        char c11 = 'a';
        if (!('a' <= charAt && charAt < 'g')) {
            c11 = 'A';
            if ('A' > charAt || charAt >= 'G') {
                z11 = false;
            }
            if (!z11) {
                x(this, "Invalid toHexChar char '" + charAt + "' in unicode escape", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        return (charAt - c11) + 10;
    }

    private final String J() {
        String str = this.f28790c;
        kotlin.jvm.internal.s.e(str);
        this.f28790c = null;
        return str;
    }

    private final boolean N() {
        return B().charAt(this.f28788a - 1) != '\"';
    }

    private final int b(int i11) {
        int F = F(i11);
        if (F != -1) {
            int i12 = F + 1;
            char charAt = B().charAt(F);
            if (charAt == 'u') {
                return d(B(), i12);
            }
            char b11 = b.b(charAt);
            if (b11 != 0) {
                this.f28791d.append(b11);
                return i12;
            }
            x(this, "Invalid escaped char '" + charAt + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        x(this, "Expected escape sequence to continue, got EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final int c(int i11, int i12) {
        e(i11, i12);
        return b(i12 + 1);
    }

    private final int d(CharSequence charSequence, int i11) {
        int i12 = i11 + 4;
        if (i12 >= charSequence.length()) {
            this.f28788a = i11;
            u();
            if (this.f28788a + 4 < charSequence.length()) {
                return d(charSequence, this.f28788a);
            }
            x(this, "Unexpected EOF during unicode escape", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        this.f28791d.append((char) ((A(charSequence, i11) << 12) + (A(charSequence, i11 + 1) << 8) + (A(charSequence, i11 + 2) << 4) + A(charSequence, i11 + 3)));
        return i12;
    }

    private final boolean h(int i11) {
        int F = F(i11);
        if (F < B().length() && F != -1) {
            int i12 = F + 1;
            int charAt = B().charAt(F) | ' ';
            if (charAt == 116) {
                j("rue", i12);
                return true;
            } else if (charAt == 102) {
                j("alse", i12);
                return false;
            } else {
                x(this, "Expected valid boolean literal prefix, but had '" + r() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
        }
        x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final void j(String str, int i11) {
        if (B().length() - i11 >= str.length()) {
            int length = str.length();
            for (int i12 = 0; i12 < length; i12++) {
                if (str.charAt(i12) != (B().charAt(i11 + i12) | ' ')) {
                    x(this, "Expected valid boolean literal prefix, but had '" + r() + CoreConstants.SINGLE_QUOTE_CHAR, 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            this.f28788a = i11 + str.length();
            return;
        }
        x(this, "Unexpected end of boolean literal", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    private final String t(int i11, int i12) {
        e(i11, i12);
        String sb2 = this.f28791d.toString();
        kotlin.jvm.internal.s.f(sb2, "escapedString.toString()");
        this.f28791d.setLength(0);
        return sb2;
    }

    public static /* synthetic */ Void x(a aVar, String str, int i11, String str2, int i12, Object obj) {
        if (obj == null) {
            if ((i12 & 2) != 0) {
                i11 = aVar.f28788a;
            }
            if ((i12 & 4) != 0) {
                str2 = "";
            }
            return aVar.w(str, i11, str2);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fail");
    }

    protected abstract CharSequence B();

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean C(char c11) {
        return !(((c11 == '}' || c11 == ']') || c11 == ':') || c11 == ',');
    }

    public final byte D() {
        CharSequence B = B();
        int i11 = this.f28788a;
        while (true) {
            int F = F(i11);
            if (F != -1) {
                char charAt = B.charAt(F);
                if (charAt != ' ' && charAt != '\n' && charAt != '\r' && charAt != '\t') {
                    this.f28788a = F;
                    return b.a(charAt);
                }
                i11 = F + 1;
            } else {
                this.f28788a = F;
                return (byte) 10;
            }
        }
    }

    public final String E(boolean z11) {
        String p11;
        byte D = D();
        if (z11) {
            if (D != 1 && D != 0) {
                return null;
            }
            p11 = r();
        } else if (D != 1) {
            return null;
        } else {
            p11 = p();
        }
        this.f28790c = p11;
        return p11;
    }

    public abstract int F(int i11);

    public final void G(boolean z11) {
        ArrayList arrayList = new ArrayList();
        byte D = D();
        if (D != 8 && D != 6) {
            r();
            return;
        }
        while (true) {
            byte D2 = D();
            boolean z12 = true;
            if (D2 != 1) {
                if (D2 != 8 && D2 != 6) {
                    z12 = false;
                }
                if (z12) {
                    arrayList.add(Byte.valueOf(D2));
                } else if (D2 == 9) {
                    if (((Number) wz.u.n0(arrayList)).byteValue() == 8) {
                        wz.u.H(arrayList);
                    } else {
                        int i11 = this.f28788a;
                        throw o.f(i11, "found ] instead of } at path: " + this.f28789b, B());
                    }
                } else if (D2 == 7) {
                    if (((Number) wz.u.n0(arrayList)).byteValue() == 6) {
                        wz.u.H(arrayList);
                    } else {
                        int i12 = this.f28788a;
                        throw o.f(i12, "found } instead of ] at path: " + this.f28789b, B());
                    }
                } else if (D2 == 10) {
                    x(this, "Unexpected end of input due to malformed JSON during ignoring unknown keys", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                l();
                if (arrayList.size() == 0) {
                    return;
                }
            } else if (z11) {
                r();
            } else {
                k();
            }
        }
    }

    public abstract int H();

    public String I(int i11, int i12) {
        return B().subSequence(i11, i12).toString();
    }

    public abstract boolean K();

    public final boolean L() {
        int F = F(H());
        int length = B().length() - F;
        if (length < 4 || F == -1) {
            return true;
        }
        for (int i11 = 0; i11 < 4; i11++) {
            if (Address.ADDRESS_NULL_PLACEHOLDER.charAt(i11) != B().charAt(F + i11)) {
                return true;
            }
        }
        if (length <= 4 || b.a(B().charAt(F + 4)) != 0) {
            this.f28788a = F + 4;
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void M(char c11) {
        int i11 = this.f28788a - 1;
        this.f28788a = i11;
        if (i11 >= 0 && c11 == '\"' && kotlin.jvm.internal.s.c(r(), Address.ADDRESS_NULL_PLACEHOLDER)) {
            w("Expected string literal but 'null' literal was found", this.f28788a - 4, "Use 'coerceInputValues = true' in 'Json {}` builder to coerce nulls to default values.");
            throw new KotlinNothingValueException();
        } else {
            y(b.a(c11));
            throw new KotlinNothingValueException();
        }
    }

    protected void e(int i11, int i12) {
        this.f28791d.append(B(), i11, i12);
    }

    public abstract boolean f();

    public final boolean g() {
        return h(H());
    }

    public final boolean i() {
        boolean z11;
        int H = H();
        if (H != B().length()) {
            if (B().charAt(H) == '\"') {
                H++;
                z11 = true;
            } else {
                z11 = false;
            }
            boolean h11 = h(H);
            if (z11) {
                if (this.f28788a != B().length()) {
                    if (B().charAt(this.f28788a) == '\"') {
                        this.f28788a++;
                    } else {
                        x(this, "Expected closing quotation mark", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    x(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
            }
            return h11;
        }
        x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public abstract String k();

    public abstract byte l();

    public final byte m(byte b11) {
        byte l11 = l();
        if (l11 == b11) {
            return l11;
        }
        y(b11);
        throw new KotlinNothingValueException();
    }

    public abstract void n(char c11);

    public final long o() {
        boolean z11;
        int F = F(H());
        if (F < B().length() && F != -1) {
            if (B().charAt(F) == '\"') {
                F++;
                if (F == B().length()) {
                    x(this, "EOF", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                }
                z11 = true;
            } else {
                z11 = false;
            }
            int i11 = F;
            long j11 = 0;
            boolean z12 = true;
            boolean z13 = false;
            while (z12) {
                char charAt = B().charAt(i11);
                if (charAt != '-') {
                    if (b.a(charAt) != 0) {
                        break;
                    }
                    i11++;
                    z12 = i11 != B().length();
                    int i12 = charAt - '0';
                    if (!(i12 >= 0 && i12 < 10)) {
                        x(this, "Unexpected symbol '" + charAt + "' in numeric literal", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                    j11 = (j11 * 10) - i12;
                    if (j11 > 0) {
                        x(this, "Numeric value overflow", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                } else if (i11 != F) {
                    x(this, "Unexpected symbol '-' in numeric literal", 0, null, 6, null);
                    throw new KotlinNothingValueException();
                } else {
                    i11++;
                    z13 = true;
                }
            }
            if (F != i11 && (!z13 || F != i11 - 1)) {
                if (z11) {
                    if (z12) {
                        if (B().charAt(i11) != '\"') {
                            x(this, "Expected closing quotation mark", 0, null, 6, null);
                            throw new KotlinNothingValueException();
                        }
                        i11++;
                    } else {
                        x(this, "EOF", 0, null, 6, null);
                        throw new KotlinNothingValueException();
                    }
                }
                this.f28788a = i11;
                if (z13) {
                    return j11;
                }
                if (j11 != Long.MIN_VALUE) {
                    return -j11;
                }
                x(this, "Numeric value overflow", 0, null, 6, null);
                throw new KotlinNothingValueException();
            }
            x(this, "Expected numeric literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        x(this, "EOF", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final String p() {
        if (this.f28790c != null) {
            return J();
        }
        return k();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String q(CharSequence source, int i11, int i12) {
        String t11;
        int F;
        kotlin.jvm.internal.s.g(source, "source");
        char charAt = source.charAt(i12);
        boolean z11 = false;
        while (charAt != '\"') {
            if (charAt == '\\') {
                F = F(c(i11, i12));
                if (F == -1) {
                    x(this, "EOF", F, null, 4, null);
                    throw new KotlinNothingValueException();
                }
            } else {
                i12++;
                if (i12 >= source.length()) {
                    e(i11, i12);
                    F = F(i12);
                    if (F == -1) {
                        x(this, "EOF", F, null, 4, null);
                        throw new KotlinNothingValueException();
                    }
                } else {
                    continue;
                    charAt = source.charAt(i12);
                }
            }
            z11 = true;
            i11 = F;
            i12 = i11;
            charAt = source.charAt(i12);
        }
        if (!z11) {
            t11 = I(i11, i12);
        } else {
            t11 = t(i11, i12);
        }
        this.f28788a = i12 + 1;
        return t11;
    }

    public final String r() {
        String t11;
        if (this.f28790c != null) {
            return J();
        }
        int H = H();
        if (H < B().length() && H != -1) {
            byte a11 = b.a(B().charAt(H));
            if (a11 == 1) {
                return p();
            }
            if (a11 == 0) {
                boolean z11 = false;
                while (b.a(B().charAt(H)) == 0) {
                    H++;
                    if (H >= B().length()) {
                        e(this.f28788a, H);
                        int F = F(H);
                        if (F == -1) {
                            this.f28788a = H;
                            return t(0, 0);
                        }
                        H = F;
                        z11 = true;
                    }
                }
                if (!z11) {
                    t11 = I(this.f28788a, H);
                } else {
                    t11 = t(this.f28788a, H);
                }
                this.f28788a = H;
                return t11;
            }
            x(this, "Expected beginning of the string, but got " + B().charAt(H), 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        x(this, "EOF", H, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final String s() {
        String r11 = r();
        if (kotlin.jvm.internal.s.c(r11, Address.ADDRESS_NULL_PLACEHOLDER) && N()) {
            x(this, "Unexpected 'null' value instead of string literal", 0, null, 6, null);
            throw new KotlinNothingValueException();
        }
        return r11;
    }

    public String toString() {
        return "JsonReader(source='" + ((Object) B()) + "', currentPosition=" + this.f28788a + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }

    public void u() {
    }

    public final void v() {
        if (l() == 10) {
            return;
        }
        x(this, "Expected EOF after parsing, but had " + B().charAt(this.f28788a - 1) + " instead", 0, null, 6, null);
        throw new KotlinNothingValueException();
    }

    public final Void w(String message, int i11, String hint) {
        String str;
        kotlin.jvm.internal.s.g(message, "message");
        kotlin.jvm.internal.s.g(hint, "hint");
        if (hint.length() == 0) {
            str = "";
        } else {
            str = '\n' + hint;
        }
        throw o.f(i11, message + " at path: " + this.f28789b.a() + str, B());
    }

    public final Void y(byte b11) {
        String str = b11 == 1 ? "quotation mark '\"'" : b11 == 4 ? "comma ','" : b11 == 5 ? "semicolon ':'" : b11 == 6 ? "start of the object '{'" : b11 == 7 ? "end of the object '}'" : b11 == 8 ? "start of the array '['" : b11 == 9 ? "end of the array ']'" : "valid token";
        String valueOf = (this.f28788a == B().length() || this.f28788a <= 0) ? "EOF" : String.valueOf(B().charAt(this.f28788a - 1));
        x(this, "Expected " + str + ", but had '" + valueOf + "' instead", this.f28788a - 1, null, 4, null);
        throw new KotlinNothingValueException();
    }

    public final void z(String key) {
        int e02;
        kotlin.jvm.internal.s.g(key, "key");
        e02 = kotlin.text.w.e0(I(0, this.f28788a), key, 0, false, 6, null);
        w("Encountered an unknown key '" + key + CoreConstants.SINGLE_QUOTE_CHAR, e02, "Use 'ignoreUnknownKeys = true' in 'Json {}' builder to ignore unknown keys.");
        throw new KotlinNothingValueException();
    }
}