package h30;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* loaded from: classes5.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    protected char[] f28863a;

    /* renamed from: b  reason: collision with root package name */
    private int f28864b;

    public t(char[] array) {
        kotlin.jvm.internal.s.g(array, "array");
        this.f28863a = array;
    }

    private final void e(int i11, int i12, String str) {
        int i13;
        int length = str.length();
        while (i11 < length) {
            int g11 = g(i12, 2);
            char charAt = str.charAt(i11);
            if (charAt < h0.a().length) {
                byte b11 = h0.a()[charAt];
                if (b11 == 0) {
                    i13 = g11 + 1;
                    this.f28863a[g11] = charAt;
                } else {
                    if (b11 == 1) {
                        String str2 = h0.b()[charAt];
                        kotlin.jvm.internal.s.e(str2);
                        int g12 = g(g11, str2.length());
                        str2.getChars(0, str2.length(), this.f28863a, g12);
                        i12 = g12 + str2.length();
                        this.f28864b = i12;
                    } else {
                        char[] cArr = this.f28863a;
                        cArr[g11] = CoreConstants.ESCAPE_CHAR;
                        cArr[g11 + 1] = (char) b11;
                        i12 = g11 + 2;
                        this.f28864b = i12;
                    }
                    i11++;
                }
            } else {
                i13 = g11 + 1;
                this.f28863a[g11] = charAt;
            }
            i12 = i13;
            i11++;
        }
        int g13 = g(i12, 1);
        this.f28863a[g13] = CoreConstants.DOUBLE_QUOTE_CHAR;
        this.f28864b = g13 + 1;
    }

    private final void f(int i11) {
        g(this.f28864b, i11);
    }

    public final void a(char c11) {
        f(1);
        char[] cArr = this.f28863a;
        int i11 = this.f28864b;
        this.f28864b = i11 + 1;
        cArr[i11] = c11;
    }

    public final void b(long j11) {
        c(String.valueOf(j11));
    }

    public final void c(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        int length = string.length();
        f(length);
        string.getChars(0, string.length(), this.f28863a, this.f28864b);
        this.f28864b += length;
    }

    public final void d(String string) {
        kotlin.jvm.internal.s.g(string, "string");
        f(string.length() + 2);
        char[] cArr = this.f28863a;
        int i11 = this.f28864b;
        int i12 = i11 + 1;
        cArr[i11] = CoreConstants.DOUBLE_QUOTE_CHAR;
        int length = string.length();
        string.getChars(0, length, cArr, i12);
        int i13 = length + i12;
        for (int i14 = i12; i14 < i13; i14++) {
            char c11 = cArr[i14];
            if (c11 < h0.a().length && h0.a()[c11] != 0) {
                e(i14 - i12, i14, string);
                return;
            }
        }
        cArr[i13] = CoreConstants.DOUBLE_QUOTE_CHAR;
        this.f28864b = i13 + 1;
    }

    protected int g(int i11, int i12) {
        int d11;
        int i13 = i12 + i11;
        char[] cArr = this.f28863a;
        if (cArr.length <= i13) {
            d11 = m00.l.d(i13, i11 * 2);
            char[] copyOf = Arrays.copyOf(cArr, d11);
            kotlin.jvm.internal.s.f(copyOf, "copyOf(this, newSize)");
            this.f28863a = copyOf;
        }
        return i11;
    }

    public void h() {
        e.f28826a.a(this.f28863a);
    }

    public String toString() {
        return new String(this.f28863a, 0, this.f28864b);
    }

    public t() {
        this(e.f28826a.b());
    }
}