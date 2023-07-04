package jq;

import ch.qos.logback.core.CoreConstants;
import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;
import java.math.BigDecimal;
import java.math.BigInteger;
import lq.f;

/* loaded from: classes2.dex */
abstract class b {

    /* renamed from: s  reason: collision with root package name */
    protected static boolean[] f33904s;

    /* renamed from: t  reason: collision with root package name */
    protected static boolean[] f33905t;

    /* renamed from: u  reason: collision with root package name */
    protected static boolean[] f33906u;

    /* renamed from: v  reason: collision with root package name */
    protected static boolean[] f33907v;

    /* renamed from: w  reason: collision with root package name */
    protected static boolean[] f33908w;

    /* renamed from: a  reason: collision with root package name */
    protected char f33909a;

    /* renamed from: b  reason: collision with root package name */
    private String f33910b;

    /* renamed from: c  reason: collision with root package name */
    protected final a f33911c = new a(15);

    /* renamed from: d  reason: collision with root package name */
    protected Object f33912d;

    /* renamed from: e  reason: collision with root package name */
    protected String f33913e;

    /* renamed from: f  reason: collision with root package name */
    protected int f33914f;

    /* renamed from: g  reason: collision with root package name */
    protected final boolean f33915g;

    /* renamed from: h  reason: collision with root package name */
    protected final boolean f33916h;

    /* renamed from: i  reason: collision with root package name */
    protected final boolean f33917i;

    /* renamed from: j  reason: collision with root package name */
    protected final boolean f33918j;

    /* renamed from: k  reason: collision with root package name */
    protected final boolean f33919k;

    /* renamed from: l  reason: collision with root package name */
    protected final boolean f33920l;

    /* renamed from: m  reason: collision with root package name */
    protected final boolean f33921m;

    /* renamed from: n  reason: collision with root package name */
    protected final boolean f33922n;

    /* renamed from: o  reason: collision with root package name */
    protected final boolean f33923o;

    /* renamed from: p  reason: collision with root package name */
    protected final boolean f33924p;

    /* renamed from: q  reason: collision with root package name */
    protected final boolean f33925q;

    /* renamed from: r  reason: collision with root package name */
    protected final boolean f33926r;

    /* loaded from: classes2.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        char[] f33927a;

        /* renamed from: b  reason: collision with root package name */
        int f33928b = -1;

        public a(int i11) {
            this.f33927a = new char[i11];
        }

        public void a(char c11) {
            int i11 = this.f33928b + 1;
            this.f33928b = i11;
            char[] cArr = this.f33927a;
            if (cArr.length <= i11) {
                char[] cArr2 = new char[(cArr.length * 2) + 1];
                System.arraycopy(cArr, 0, cArr2, 0, cArr.length);
                this.f33927a = cArr2;
            }
            this.f33927a[this.f33928b] = c11;
        }

        public void b() {
            this.f33928b = -1;
        }

        public String toString() {
            return new String(this.f33927a, 0, this.f33928b + 1);
        }
    }

    static {
        boolean[] zArr = new boolean[126];
        f33904s = zArr;
        boolean[] zArr2 = new boolean[126];
        f33905t = zArr2;
        boolean[] zArr3 = new boolean[126];
        f33906u = zArr3;
        boolean[] zArr4 = new boolean[126];
        f33907v = zArr4;
        boolean[] zArr5 = new boolean[126];
        f33908w = zArr5;
        zArr3[26] = true;
        zArr3[58] = true;
        zArr4[26] = true;
        zArr4[125] = true;
        zArr4[44] = true;
        zArr2[26] = true;
        zArr2[93] = true;
        zArr2[44] = true;
        zArr5[26] = true;
        zArr[58] = true;
        zArr[44] = true;
        zArr[26] = true;
        zArr[125] = true;
        zArr[93] = true;
    }

    public b(int i11) {
        this.f33916h = (i11 & 4) > 0;
        this.f33917i = (i11 & 2) > 0;
        this.f33918j = (i11 & 1) > 0;
        this.f33922n = (i11 & 8) > 0;
        this.f33924p = (i11 & 16) > 0;
        this.f33915g = (i11 & 32) > 0;
        this.f33919k = (i11 & 64) > 0;
        this.f33923o = (i11 & 128) > 0;
        this.f33920l = (i11 & 768) != 768;
        this.f33921m = (i11 & 512) == 0;
        this.f33925q = (i11 & 1024) > 0;
        this.f33926r = (i11 & 2048) > 0;
    }

    public void a() {
        if (this.f33922n) {
            return;
        }
        int length = this.f33913e.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = this.f33913e.charAt(i11);
            if (charAt >= 0) {
                if (charAt > 31) {
                    if (charAt == 127 && this.f33925q) {
                        throw new ParseException(this.f33914f + i11, 0, Character.valueOf(charAt));
                    }
                } else {
                    throw new ParseException(this.f33914f + i11, 0, Character.valueOf(charAt));
                }
            }
        }
    }

    public void b() {
        int length = this.f33913e.length();
        if (length == 1) {
            return;
        }
        if (length == 2) {
            if (this.f33913e.equals("00")) {
                throw new ParseException(this.f33914f, 6, this.f33913e);
            }
            return;
        }
        char charAt = this.f33913e.charAt(0);
        char charAt2 = this.f33913e.charAt(1);
        if (charAt != '-') {
            if (charAt == '0' && charAt2 >= '0' && charAt2 <= '9') {
                throw new ParseException(this.f33914f, 6, this.f33913e);
            }
            return;
        }
        char charAt3 = this.f33913e.charAt(2);
        if (charAt2 == '0' && charAt3 >= '0' && charAt3 <= '9') {
            throw new ParseException(this.f33914f, 6, this.f33913e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number c() {
        if (!this.f33915g) {
            b();
        }
        try {
            if (!this.f33923o) {
                return Float.valueOf(Float.parseFloat(this.f33913e));
            }
            if (this.f33913e.length() > 18) {
                BigDecimal bigDecimal = new BigDecimal(this.f33913e);
                if (this.f33926r) {
                    return bigDecimal;
                }
                double parseDouble = Double.parseDouble(this.f33913e);
                return String.valueOf(parseDouble).equals(this.f33913e) ? Double.valueOf(parseDouble) : bigDecimal;
            }
            return Double.valueOf(Double.parseDouble(this.f33913e));
        } catch (NumberFormatException unused) {
            throw new ParseException(this.f33914f, 1, this.f33913e);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public <T> T d(f<T> fVar) {
        this.f33914f = -1;
        try {
            f();
            T t11 = (T) h(fVar);
            if (this.f33920l) {
                if (!this.f33921m) {
                    t();
                }
                if (this.f33909a != 26) {
                    throw new ParseException(this.f33914f - 1, 1, Character.valueOf(this.f33909a));
                }
            }
            this.f33913e = null;
            this.f33912d = null;
            return t11;
        } catch (IOException e11) {
            throw new ParseException(this.f33914f, e11);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public Number e(String str) {
        int i11;
        int i12;
        boolean z11;
        int length = str.length();
        boolean z12 = false;
        if (str.charAt(0) == '-') {
            i11 = 20;
            if (!this.f33915g && length >= 3 && str.charAt(1) == '0') {
                throw new ParseException(this.f33914f, 6, str);
            }
            i12 = 1;
        } else if (!this.f33915g && length >= 2 && str.charAt(0) == '0') {
            throw new ParseException(this.f33914f, 6, str);
        } else {
            i11 = 19;
            i12 = 0;
        }
        int i13 = i12;
        if (length < i11) {
            z11 = false;
        } else if (length > i11) {
            return new BigInteger(str, 10);
        } else {
            length--;
            z11 = true;
        }
        long j11 = 0;
        while (i12 < length) {
            j11 = (j11 * 10) + ('0' - str.charAt(i12));
            i12++;
        }
        if (z11) {
            int i14 = (j11 > (-922337203685477580L) ? 1 : (j11 == (-922337203685477580L) ? 0 : -1));
            if (i14 <= 0) {
                if (i14 >= 0) {
                    if (i13 != 0) {
                    }
                }
                z12 = true;
            }
            if (z12) {
                return new BigInteger(str, 10);
            }
            j11 = (j11 * 10) + ('0' - str.charAt(i12));
        }
        if (i13 != 0) {
            if (this.f33924p && j11 >= -2147483648L) {
                return Integer.valueOf((int) j11);
            }
            return Long.valueOf(j11);
        }
        long j12 = -j11;
        if (this.f33924p && j12 <= 2147483647L) {
            return Integer.valueOf((int) j12);
        }
        return Long.valueOf(j12);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void f();

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0043, code lost:
        if (r5 == ':') goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0047, code lost:
        if (r5 == ']') goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004b, code lost:
        if (r5 == '}') goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0057, code lost:
        if (r4 == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
        if (r7.f33919k == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x006b, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.f33914f, 0, java.lang.Character.valueOf(r7.f33909a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x006c, code lost:
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0073, code lost:
        return r8.b(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0081, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r7.f33914f, 0, java.lang.Character.valueOf(r7.f33909a));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected <T> T g(lq.f<T> r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r8.c()
            char r1 = r7.f33909a
            r2 = 91
            if (r1 != r2) goto Lad
            r7.f()
            char r1 = r7.f33909a
            r2 = 44
            r3 = 0
            if (r1 != r2) goto L27
            boolean r1 = r7.f33919k
            if (r1 == 0) goto L19
            goto L27
        L19:
            com.nimbusds.jose.shaded.json.parser.ParseException r8 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r0 = r7.f33914f
            char r1 = r7.f33909a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L27:
            r1 = 1
        L28:
            r4 = r3
        L29:
            char r5 = r7.f33909a
            r6 = 9
            if (r5 == r6) goto La8
            r6 = 10
            if (r5 == r6) goto La8
            r6 = 13
            if (r5 == r6) goto La8
            r6 = 26
            if (r5 == r6) goto L9c
            r6 = 32
            if (r5 == r6) goto La8
            if (r5 == r2) goto L82
            r6 = 58
            if (r5 == r6) goto L74
            r6 = 93
            if (r5 == r6) goto L57
            r4 = 125(0x7d, float:1.75E-43)
            if (r5 == r4) goto L74
            boolean[] r4 = jq.b.f33905t
            java.lang.Object r4 = r7.i(r8, r4)
            r8.a(r0, r4)
            goto L28
        L57:
            if (r4 == 0) goto L6c
            boolean r1 = r7.f33919k
            if (r1 == 0) goto L5e
            goto L6c
        L5e:
            com.nimbusds.jose.shaded.json.parser.ParseException r8 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r0 = r7.f33914f
            char r1 = r7.f33909a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L6c:
            r7.f()
            java.lang.Object r8 = r8.b(r0)
            return r8
        L74:
            com.nimbusds.jose.shaded.json.parser.ParseException r8 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r0 = r7.f33914f
            char r1 = r7.f33909a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L82:
            if (r4 == 0) goto L97
            boolean r4 = r7.f33919k
            if (r4 == 0) goto L89
            goto L97
        L89:
            com.nimbusds.jose.shaded.json.parser.ParseException r8 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r0 = r7.f33914f
            char r1 = r7.f33909a
            java.lang.Character r1 = java.lang.Character.valueOf(r1)
            r8.<init>(r0, r3, r1)
            throw r8
        L97:
            r7.f()
            r4 = r1
            goto L29
        L9c:
            com.nimbusds.jose.shaded.json.parser.ParseException r8 = new com.nimbusds.jose.shaded.json.parser.ParseException
            int r0 = r7.f33914f
            int r0 = r0 - r1
            r1 = 3
            java.lang.String r2 = "EOF"
            r8.<init>(r0, r1, r2)
            throw r8
        La8:
            r7.f()
            goto L29
        Lad:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException
            java.lang.String r0 = "Internal Error"
            r8.<init>(r0)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b.g(lq.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ba, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r3.f33914f, 0, java.lang.Character.valueOf(r3.f33909a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00fd, code lost:
        r0 = l(jq.b.f33908w);
        r3.f33912d = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0109, code lost:
        return r4.b(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected <T> T h(lq.f<T> r4) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b.h(lq.f):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a0, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r2.f33914f, 0, java.lang.Character.valueOf(r2.f33909a));
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00e3, code lost:
        return l(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected java.lang.Object i(lq.f<?> r3, boolean[] r4) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b.i(lq.f, boolean[]):java.lang.Object");
    }

    protected abstract void j(boolean[] zArr);

    protected abstract void k();

    protected abstract Object l(boolean[] zArr);

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e5, code lost:
        throw new com.nimbusds.jose.shaded.json.parser.ParseException(r12.f33914f, 0, java.lang.Character.valueOf(r12.f33909a));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected <T> T m(lq.f<T> r13) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: jq.b.m(lq.f):java.lang.Object");
    }

    abstract void n();

    protected abstract void o();

    /* JADX INFO: Access modifiers changed from: protected */
    public void p() {
        char c11 = this.f33909a;
        while (true) {
            f();
            char c12 = this.f33909a;
            if (c12 == '\"' || c12 == '\'') {
                if (c11 == c12) {
                    f();
                    this.f33913e = this.f33911c.toString();
                    return;
                }
                this.f33911c.a(c12);
            } else if (c12 == '\\') {
                f();
                char c13 = this.f33909a;
                if (c13 == '\"') {
                    this.f33911c.a(CoreConstants.DOUBLE_QUOTE_CHAR);
                } else if (c13 == '\'') {
                    this.f33911c.a(CoreConstants.SINGLE_QUOTE_CHAR);
                } else if (c13 == '/') {
                    this.f33911c.a('/');
                } else if (c13 == '\\') {
                    this.f33911c.a(CoreConstants.ESCAPE_CHAR);
                } else if (c13 == 'b') {
                    this.f33911c.a('\b');
                } else if (c13 == 'f') {
                    this.f33911c.a('\f');
                } else if (c13 == 'n') {
                    this.f33911c.a('\n');
                } else if (c13 == 'r') {
                    this.f33911c.a('\r');
                } else if (c13 == 'x') {
                    this.f33911c.a(q(2));
                } else if (c13 == 't') {
                    this.f33911c.a('\t');
                } else if (c13 == 'u') {
                    this.f33911c.a(q(4));
                }
            } else if (c12 != 127) {
                switch (c12) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case '\b':
                    case '\t':
                    case '\n':
                    case 11:
                    case '\f':
                    case '\r':
                    case 14:
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 27:
                    case 28:
                    case 29:
                    case 30:
                    case 31:
                        if (!this.f33922n) {
                            throw new ParseException(this.f33914f, 0, Character.valueOf(this.f33909a));
                        }
                        break;
                    case 26:
                        throw new ParseException(this.f33914f - 1, 3, null);
                    default:
                        this.f33911c.a(c12);
                        break;
                }
            } else if (this.f33922n) {
                continue;
            } else {
                if (this.f33925q) {
                    throw new ParseException(this.f33914f, 0, Character.valueOf(this.f33909a));
                }
                this.f33911c.a(c12);
            }
        }
    }

    protected char q(int i11) {
        int i12;
        int i13;
        int i14 = 0;
        for (int i15 = 0; i15 < i11; i15++) {
            int i16 = i14 * 16;
            f();
            char c11 = this.f33909a;
            if (c11 > '9' || c11 < '0') {
                if (c11 <= 'F' && c11 >= 'A') {
                    i12 = c11 - 'A';
                } else if (c11 < 'a' || c11 > 'f') {
                    if (c11 == 26) {
                        throw new ParseException(this.f33914f, 3, "EOF");
                    }
                    throw new ParseException(this.f33914f, 4, Character.valueOf(this.f33909a));
                } else {
                    i12 = c11 - 'a';
                }
                i13 = i12 + 10;
            } else {
                i13 = c11 - '0';
            }
            i14 = i16 + i13;
        }
        return (char) i14;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void r() {
        while (true) {
            char c11 = this.f33909a;
            if (c11 < '0' || c11 > '9') {
                return;
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void s(boolean[] zArr) {
        while (true) {
            char c11 = this.f33909a;
            if (c11 == 26) {
                return;
            }
            if (c11 >= 0 && c11 < '~' && zArr[c11]) {
                return;
            }
            n();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void t() {
        while (true) {
            char c11 = this.f33909a;
            if (c11 > ' ' || c11 == 26) {
                return;
            }
            n();
        }
    }
}