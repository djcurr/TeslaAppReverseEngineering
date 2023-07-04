package tn;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.model.payments.request.Address;
import com.google.gson.stream.MalformedJsonException;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import on.f;

/* loaded from: classes2.dex */
public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Reader f52355a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f52356b = false;

    /* renamed from: c  reason: collision with root package name */
    private final char[] f52357c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private int f52358d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f52359e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f52360f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f52361g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f52362h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f52363i;

    /* renamed from: j  reason: collision with root package name */
    private int f52364j;

    /* renamed from: k  reason: collision with root package name */
    private String f52365k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f52366l;

    /* renamed from: m  reason: collision with root package name */
    private int f52367m;

    /* renamed from: n  reason: collision with root package name */
    private String[] f52368n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f52369o;

    /* renamed from: tn.a$a  reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    class C1156a extends f {
        C1156a() {
        }

        @Override // on.f
        public void a(a aVar) {
            if (aVar instanceof pn.f) {
                ((pn.f) aVar).M1();
                return;
            }
            int i11 = aVar.f52362h;
            if (i11 == 0) {
                i11 = aVar.m();
            }
            if (i11 == 13) {
                aVar.f52362h = 9;
            } else if (i11 == 12) {
                aVar.f52362h = 8;
            } else if (i11 == 14) {
                aVar.f52362h = 10;
            } else {
                throw new IllegalStateException("Expected a name but was " + aVar.Q0() + aVar.n0());
            }
        }
    }

    static {
        f.f42809a = new C1156a();
    }

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f52366l = iArr;
        this.f52367m = 0;
        this.f52367m = 0 + 1;
        iArr[0] = 6;
        this.f52368n = new String[32];
        this.f52369o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f52355a = reader;
    }

    private boolean D(int i11) {
        int i12;
        int i13;
        char[] cArr = this.f52357c;
        int i14 = this.f52361g;
        int i15 = this.f52358d;
        this.f52361g = i14 - i15;
        int i16 = this.f52359e;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f52359e = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f52359e = 0;
        }
        this.f52358d = 0;
        do {
            Reader reader = this.f52355a;
            int i18 = this.f52359e;
            int read = reader.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.f52359e + read;
            this.f52359e = i12;
            if (this.f52360f == 0 && (i13 = this.f52361g) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f52358d++;
                this.f52361g = i13 + 1;
                i11++;
                continue;
            }
        } while (i12 < i11);
        return true;
    }

    private int F0(boolean z11) {
        char[] cArr = this.f52357c;
        int i11 = this.f52358d;
        int i12 = this.f52359e;
        while (true) {
            if (i11 == i12) {
                this.f52358d = i11;
                if (!D(1)) {
                    if (z11) {
                        throw new EOFException("End of input" + n0());
                    }
                    return -1;
                }
                i11 = this.f52358d;
                i12 = this.f52359e;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f52360f++;
                this.f52361g = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f52358d = i13;
                    if (i13 == i12) {
                        this.f52358d = i13 - 1;
                        boolean D = D(2);
                        this.f52358d++;
                        if (!D) {
                            return c11;
                        }
                    }
                    j();
                    int i14 = this.f52358d;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f52358d = i14 + 1;
                        if (p1("*/")) {
                            i11 = this.f52358d + 2;
                            i12 = this.f52359e;
                        } else {
                            throw z1("Unterminated comment");
                        }
                    } else if (c12 != '/') {
                        return c11;
                    } else {
                        this.f52358d = i14 + 1;
                        t1();
                        i11 = this.f52358d;
                        i12 = this.f52359e;
                    }
                } else if (c11 == '#') {
                    this.f52358d = i13;
                    j();
                    t1();
                    i11 = this.f52358d;
                    i12 = this.f52359e;
                } else {
                    this.f52358d = i13;
                    return c11;
                }
            }
            i11 = i13;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f52358d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String I0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f52357c
            r1 = 0
        L3:
            int r2 = r9.f52358d
            int r3 = r9.f52359e
        L7:
            r4 = r3
            r3 = r2
        L9:
            r5 = 16
            r6 = 1
            if (r2 >= r4) goto L5c
            int r7 = r2 + 1
            char r2 = r0[r2]
            if (r2 != r10) goto L28
            r9.f52358d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L20
            java.lang.String r10 = new java.lang.String
            r10.<init>(r0, r3, r7)
            return r10
        L20:
            r1.append(r0, r3, r7)
            java.lang.String r10 = r1.toString()
            return r10
        L28:
            r8 = 92
            if (r2 != r8) goto L4f
            r9.f52358d = r7
            int r7 = r7 - r3
            int r7 = r7 - r6
            if (r1 != 0) goto L40
            int r1 = r7 + 1
            int r1 = r1 * 2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r2.<init>(r1)
            r1 = r2
        L40:
            r1.append(r0, r3, r7)
            char r2 = r9.Z0()
            r1.append(r2)
            int r2 = r9.f52358d
            int r3 = r9.f52359e
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f52360f
            int r2 = r2 + r6
            r9.f52360f = r2
            r9.f52361g = r7
        L5a:
            r2 = r7
            goto L9
        L5c:
            if (r1 != 0) goto L6c
            int r1 = r2 - r3
            int r1 = r1 * 2
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r1 = java.lang.Math.max(r1, r5)
            r4.<init>(r1)
            r1 = r4
        L6c:
            int r4 = r2 - r3
            r1.append(r0, r3, r4)
            r9.f52358d = r2
            boolean r2 = r9.D(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.z1(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.a.I0(char):java.lang.String");
    }

    private String J(boolean z11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        int i11 = 0;
        while (true) {
            int i12 = this.f52367m;
            if (i11 < i12) {
                int i13 = this.f52366l[i11];
                if (i13 == 1 || i13 == 2) {
                    int i14 = this.f52369o[i11];
                    if (z11 && i14 > 0 && i11 == i12 - 1) {
                        i14--;
                    }
                    sb2.append('[');
                    sb2.append(i14);
                    sb2.append(']');
                } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                    sb2.append(CoreConstants.DOT);
                    String[] strArr = this.f52368n;
                    if (strArr[i11] != null) {
                        sb2.append(strArr[i11]);
                    }
                }
                i11++;
            } else {
                return sb2.toString();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x004a, code lost:
        j();
     */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String P0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f52358d
            int r4 = r3 + r2
            int r5 = r6.f52359e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f52357c
            int r3 = r3 + r2
            char r3 = r4[r3]
            r4 = 9
            if (r3 == r4) goto L5c
            r4 = 10
            if (r3 == r4) goto L5c
            r4 = 12
            if (r3 == r4) goto L5c
            r4 = 13
            if (r3 == r4) goto L5c
            r4 = 32
            if (r3 == r4) goto L5c
            r4 = 35
            if (r3 == r4) goto L4a
            r4 = 44
            if (r3 == r4) goto L5c
            r4 = 47
            if (r3 == r4) goto L4a
            r4 = 61
            if (r3 == r4) goto L4a
            r4 = 123(0x7b, float:1.72E-43)
            if (r3 == r4) goto L5c
            r4 = 125(0x7d, float:1.75E-43)
            if (r3 == r4) goto L5c
            r4 = 58
            if (r3 == r4) goto L5c
            r4 = 59
            if (r3 == r4) goto L4a
            switch(r3) {
                case 91: goto L5c;
                case 92: goto L4a;
                case 93: goto L5c;
                default: goto L47;
            }
        L47:
            int r2 = r2 + 1
            goto L3
        L4a:
            r6.j()
            goto L5c
        L4e:
            char[] r3 = r6.f52357c
            int r3 = r3.length
            if (r2 >= r3) goto L5e
            int r3 = r2 + 1
            boolean r3 = r6.D(r3)
            if (r3 == 0) goto L5c
            goto L3
        L5c:
            r0 = r2
            goto L7e
        L5e:
            if (r1 != 0) goto L6b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r3 = 16
            int r3 = java.lang.Math.max(r2, r3)
            r1.<init>(r3)
        L6b:
            char[] r3 = r6.f52357c
            int r4 = r6.f52358d
            r1.append(r3, r4, r2)
            int r3 = r6.f52358d
            int r3 = r3 + r2
            r6.f52358d = r3
            r2 = 1
            boolean r2 = r6.D(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f52357c
            int r3 = r6.f52358d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f52357c
            int r3 = r6.f52358d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f52358d
            int r2 = r2 + r0
            r6.f52358d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.a.P0():java.lang.String");
    }

    private int R0() {
        int i11;
        String str;
        String str2;
        char c11 = this.f52357c[this.f52358d];
        if (c11 == 't' || c11 == 'T') {
            i11 = 5;
            str = "true";
            str2 = "TRUE";
        } else if (c11 == 'f' || c11 == 'F') {
            i11 = 6;
            str = "false";
            str2 = "FALSE";
        } else if (c11 != 'n' && c11 != 'N') {
            return 0;
        } else {
            i11 = 7;
            str = Address.ADDRESS_NULL_PLACEHOLDER;
            str2 = ActionConst.NULL;
        }
        int length = str.length();
        for (int i12 = 1; i12 < length; i12++) {
            if (this.f52358d + i12 >= this.f52359e && !D(i12 + 1)) {
                return 0;
            }
            char c12 = this.f52357c[this.f52358d + i12];
            if (c12 != str.charAt(i12) && c12 != str2.charAt(i12)) {
                return 0;
            }
        }
        if ((this.f52358d + length < this.f52359e || D(length + 1)) && e0(this.f52357c[this.f52358d + length])) {
            return 0;
        }
        this.f52358d += length;
        this.f52362h = i11;
        return i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (e0(r14) != false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0093, code lost:
        if (r9 != 2) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0095, code lost:
        if (r10 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x009b, code lost:
        if (r11 != Long.MIN_VALUE) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x009d, code lost:
        if (r13 == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00a3, code lost:
        if (r11 != 0) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00a5, code lost:
        if (r13 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00a7, code lost:
        if (r13 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00aa, code lost:
        r11 = -r11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x00ab, code lost:
        r18.f52363i = r11;
        r18.f52358d += r8;
        r18.f52362h = 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00b6, code lost:
        return 15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00b7, code lost:
        if (r9 == 2) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00ba, code lost:
        if (r9 == 4) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x00bd, code lost:
        if (r9 != 7) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x00c0, code lost:
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x00c2, code lost:
        r18.f52364j = r8;
        r18.f52362h = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x00c8, code lost:
        return 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x00c9, code lost:
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private int S0() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.a.S0():int");
    }

    private void X0(int i11) {
        int i12 = this.f52367m;
        int[] iArr = this.f52366l;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f52366l = Arrays.copyOf(iArr, i13);
            this.f52369o = Arrays.copyOf(this.f52369o, i13);
            this.f52368n = (String[]) Arrays.copyOf(this.f52368n, i13);
        }
        int[] iArr2 = this.f52366l;
        int i14 = this.f52367m;
        this.f52367m = i14 + 1;
        iArr2[i14] = i11;
    }

    private char Z0() {
        int i11;
        int i12;
        if (this.f52358d == this.f52359e && !D(1)) {
            throw z1("Unterminated escape sequence");
        }
        char[] cArr = this.f52357c;
        int i13 = this.f52358d;
        int i14 = i13 + 1;
        this.f52358d = i14;
        char c11 = cArr[i13];
        if (c11 == '\n') {
            this.f52360f++;
            this.f52361g = i14;
        } else if (c11 != '\"' && c11 != '\'' && c11 != '/' && c11 != '\\') {
            if (c11 != 'b') {
                if (c11 != 'f') {
                    if (c11 != 'n') {
                        if (c11 != 'r') {
                            if (c11 != 't') {
                                if (c11 == 'u') {
                                    if (i14 + 4 > this.f52359e && !D(4)) {
                                        throw z1("Unterminated escape sequence");
                                    }
                                    char c12 = 0;
                                    int i15 = this.f52358d;
                                    int i16 = i15 + 4;
                                    while (i15 < i16) {
                                        char c13 = this.f52357c[i15];
                                        char c14 = (char) (c12 << 4);
                                        if (c13 < '0' || c13 > '9') {
                                            if (c13 >= 'a' && c13 <= 'f') {
                                                i11 = c13 - 'a';
                                            } else if (c13 < 'A' || c13 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f52357c, this.f52358d, 4));
                                            } else {
                                                i11 = c13 - 'A';
                                            }
                                            i12 = i11 + 10;
                                        } else {
                                            i12 = c13 - '0';
                                        }
                                        c12 = (char) (c14 + i12);
                                        i15++;
                                    }
                                    this.f52358d += 4;
                                    return c12;
                                }
                                throw z1("Invalid escape sequence");
                            }
                            return '\t';
                        }
                        return '\r';
                    }
                    return '\n';
                }
                return '\f';
            }
            return '\b';
        }
        return c11;
    }

    private boolean e0(char c11) {
        if (c11 == '\t' || c11 == '\n' || c11 == '\f' || c11 == '\r' || c11 == ' ') {
            return false;
        }
        if (c11 != '#') {
            if (c11 == ',') {
                return false;
            }
            if (c11 != '/' && c11 != '=') {
                if (c11 == '{' || c11 == '}' || c11 == ':') {
                    return false;
                }
                if (c11 != ';') {
                    switch (c11) {
                        case '[':
                        case ']':
                            return false;
                        case '\\':
                            break;
                        default:
                            return true;
                    }
                }
            }
        }
        j();
        return false;
    }

    private void h1(char c11) {
        char[] cArr = this.f52357c;
        do {
            int i11 = this.f52358d;
            int i12 = this.f52359e;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f52358d = i13;
                    return;
                } else if (c12 == '\\') {
                    this.f52358d = i13;
                    Z0();
                    i11 = this.f52358d;
                    i12 = this.f52359e;
                } else {
                    if (c12 == '\n') {
                        this.f52360f++;
                        this.f52361g = i13;
                    }
                    i11 = i13;
                }
            }
            this.f52358d = i11;
        } while (D(1));
        throw z1("Unterminated string");
    }

    private void j() {
        if (!this.f52356b) {
            throw z1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void l() {
        F0(true);
        int i11 = this.f52358d - 1;
        this.f52358d = i11;
        if (i11 + 5 <= this.f52359e || D(5)) {
            int i12 = this.f52358d;
            char[] cArr = this.f52357c;
            if (cArr[i12] == ')' && cArr[i12 + 1] == ']' && cArr[i12 + 2] == '}' && cArr[i12 + 3] == '\'' && cArr[i12 + 4] == '\n') {
                this.f52358d = i12 + 5;
            }
        }
    }

    private boolean p1(String str) {
        int length = str.length();
        while (true) {
            if (this.f52358d + length > this.f52359e && !D(length)) {
                return false;
            }
            char[] cArr = this.f52357c;
            int i11 = this.f52358d;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f52357c[this.f52358d + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.f52360f++;
            this.f52361g = i11 + 1;
            this.f52358d++;
        }
    }

    private void t1() {
        char c11;
        do {
            if (this.f52358d >= this.f52359e && !D(1)) {
                return;
            }
            char[] cArr = this.f52357c;
            int i11 = this.f52358d;
            int i12 = i11 + 1;
            this.f52358d = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f52360f++;
                this.f52361g = i12;
                return;
            }
        } while (c11 != '\r');
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0048, code lost:
        j();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void v1() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f52358d
            int r2 = r1 + r0
            int r3 = r4.f52359e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f52357c
            int r1 = r1 + r0
            char r1 = r2[r1]
            r2 = 9
            if (r1 == r2) goto L4b
            r2 = 10
            if (r1 == r2) goto L4b
            r2 = 12
            if (r1 == r2) goto L4b
            r2 = 13
            if (r1 == r2) goto L4b
            r2 = 32
            if (r1 == r2) goto L4b
            r2 = 35
            if (r1 == r2) goto L48
            r2 = 44
            if (r1 == r2) goto L4b
            r2 = 47
            if (r1 == r2) goto L48
            r2 = 61
            if (r1 == r2) goto L48
            r2 = 123(0x7b, float:1.72E-43)
            if (r1 == r2) goto L4b
            r2 = 125(0x7d, float:1.75E-43)
            if (r1 == r2) goto L4b
            r2 = 58
            if (r1 == r2) goto L4b
            r2 = 59
            if (r1 == r2) goto L48
            switch(r1) {
                case 91: goto L4b;
                case 92: goto L48;
                case 93: goto L4b;
                default: goto L45;
            }
        L45:
            int r0 = r0 + 1
            goto L1
        L48:
            r4.j()
        L4b:
            int r1 = r4.f52358d
            int r1 = r1 + r0
            r4.f52358d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f52358d = r1
            r0 = 1
            boolean r0 = r4.D(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: tn.a.v1():void");
    }

    private IOException z1(String str) {
        throw new MalformedJsonException(str + n0());
    }

    public void C() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 2) {
            int i12 = this.f52367m - 1;
            this.f52367m = i12;
            this.f52368n[i12] = null;
            int[] iArr = this.f52369o;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f52362h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + Q0() + n0());
    }

    public long C0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            this.f52362h = 0;
            int[] iArr = this.f52369o;
            int i12 = this.f52367m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f52363i;
        }
        if (i11 == 16) {
            this.f52365k = new String(this.f52357c, this.f52358d, this.f52364j);
            this.f52358d += this.f52364j;
        } else if (i11 != 8 && i11 != 9 && i11 != 10) {
            throw new IllegalStateException("Expected a long but was " + Q0() + n0());
        } else {
            if (i11 == 10) {
                this.f52365k = P0();
            } else {
                this.f52365k = I0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long parseLong = Long.parseLong(this.f52365k);
                this.f52362h = 0;
                int[] iArr2 = this.f52369o;
                int i13 = this.f52367m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f52362h = 11;
        double parseDouble = Double.parseDouble(this.f52365k);
        long j11 = (long) parseDouble;
        if (j11 == parseDouble) {
            this.f52365k = null;
            this.f52362h = 0;
            int[] iArr3 = this.f52369o;
            int i14 = this.f52367m - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return j11;
        }
        throw new NumberFormatException("Expected a long but was " + this.f52365k + n0());
    }

    public String D0() {
        String I0;
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 14) {
            I0 = P0();
        } else if (i11 == 12) {
            I0 = I0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i11 == 13) {
            I0 = I0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else {
            throw new IllegalStateException("Expected a name but was " + Q0() + n0());
        }
        this.f52362h = 0;
        this.f52368n[this.f52367m - 1] = I0;
        return I0;
    }

    public void G0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 7) {
            this.f52362h = 0;
            int[] iArr = this.f52369o;
            int i12 = this.f52367m - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + Q0() + n0());
    }

    public String J0() {
        String str;
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 10) {
            str = P0();
        } else if (i11 == 8) {
            str = I0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i11 == 9) {
            str = I0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i11 == 11) {
            str = this.f52365k;
            this.f52365k = null;
        } else if (i11 == 15) {
            str = Long.toString(this.f52363i);
        } else if (i11 == 16) {
            str = new String(this.f52357c, this.f52358d, this.f52364j);
            this.f52358d += this.f52364j;
        } else {
            throw new IllegalStateException("Expected a string but was " + Q0() + n0());
        }
        this.f52362h = 0;
        int[] iArr = this.f52369o;
        int i12 = this.f52367m - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    public String L() {
        return J(true);
    }

    public com.google.gson.stream.a Q0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        switch (i11) {
            case 1:
                return com.google.gson.stream.a.BEGIN_OBJECT;
            case 2:
                return com.google.gson.stream.a.END_OBJECT;
            case 3:
                return com.google.gson.stream.a.BEGIN_ARRAY;
            case 4:
                return com.google.gson.stream.a.END_ARRAY;
            case 5:
            case 6:
                return com.google.gson.stream.a.BOOLEAN;
            case 7:
                return com.google.gson.stream.a.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return com.google.gson.stream.a.STRING;
            case 12:
            case 13:
            case 14:
                return com.google.gson.stream.a.NAME;
            case 15:
            case 16:
                return com.google.gson.stream.a.NUMBER;
            case 17:
                return com.google.gson.stream.a.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    public boolean R() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        return (i11 == 2 || i11 == 4 || i11 == 17) ? false : true;
    }

    public void a() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 3) {
            X0(1);
            this.f52369o[this.f52367m - 1] = 0;
            this.f52362h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + Q0() + n0());
    }

    public final boolean a0() {
        return this.f52356b;
    }

    public final void b1(boolean z11) {
        this.f52356b = z11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f52362h = 0;
        this.f52366l[0] = 8;
        this.f52367m = 1;
        this.f52355a.close();
    }

    public void g() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 1) {
            X0(3);
            this.f52362h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + Q0() + n0());
    }

    public String getPath() {
        return J(false);
    }

    int m() {
        int F0;
        int[] iArr = this.f52366l;
        int i11 = this.f52367m;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int F02 = F0(true);
            if (F02 != 44) {
                if (F02 != 59) {
                    if (F02 == 93) {
                        this.f52362h = 4;
                        return 4;
                    }
                    throw z1("Unterminated array");
                }
                j();
            }
        } else if (i12 == 3 || i12 == 5) {
            iArr[i11 - 1] = 4;
            if (i12 == 5 && (F0 = F0(true)) != 44) {
                if (F0 != 59) {
                    if (F0 == 125) {
                        this.f52362h = 2;
                        return 2;
                    }
                    throw z1("Unterminated object");
                }
                j();
            }
            int F03 = F0(true);
            if (F03 == 34) {
                this.f52362h = 13;
                return 13;
            } else if (F03 == 39) {
                j();
                this.f52362h = 12;
                return 12;
            } else if (F03 == 125) {
                if (i12 != 5) {
                    this.f52362h = 2;
                    return 2;
                }
                throw z1("Expected name");
            } else {
                j();
                this.f52358d--;
                if (e0((char) F03)) {
                    this.f52362h = 14;
                    return 14;
                }
                throw z1("Expected name");
            }
        } else if (i12 == 4) {
            iArr[i11 - 1] = 5;
            int F04 = F0(true);
            if (F04 != 58) {
                if (F04 == 61) {
                    j();
                    if (this.f52358d < this.f52359e || D(1)) {
                        char[] cArr = this.f52357c;
                        int i13 = this.f52358d;
                        if (cArr[i13] == '>') {
                            this.f52358d = i13 + 1;
                        }
                    }
                } else {
                    throw z1("Expected ':'");
                }
            }
        } else if (i12 == 6) {
            if (this.f52356b) {
                l();
            }
            this.f52366l[this.f52367m - 1] = 7;
        } else if (i12 == 7) {
            if (F0(false) == -1) {
                this.f52362h = 17;
                return 17;
            }
            j();
            this.f52358d--;
        } else if (i12 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int F05 = F0(true);
        if (F05 == 34) {
            this.f52362h = 9;
            return 9;
        } else if (F05 == 39) {
            j();
            this.f52362h = 8;
            return 8;
        } else {
            if (F05 != 44 && F05 != 59) {
                if (F05 == 91) {
                    this.f52362h = 3;
                    return 3;
                } else if (F05 != 93) {
                    if (F05 != 123) {
                        this.f52358d--;
                        int R0 = R0();
                        if (R0 != 0) {
                            return R0;
                        }
                        int S0 = S0();
                        if (S0 != 0) {
                            return S0;
                        }
                        if (e0(this.f52357c[this.f52358d])) {
                            j();
                            this.f52362h = 10;
                            return 10;
                        }
                        throw z1("Expected value");
                    }
                    this.f52362h = 1;
                    return 1;
                } else if (i12 == 1) {
                    this.f52362h = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw z1("Unexpected value");
            }
            j();
            this.f52358d--;
            this.f52362h = 7;
            return 7;
        }
    }

    String n0() {
        return " at line " + (this.f52360f + 1) + " column " + ((this.f52358d - this.f52361g) + 1) + " path " + getPath();
    }

    public void p() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 4) {
            int i12 = this.f52367m - 1;
            this.f52367m = i12;
            int[] iArr = this.f52369o;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f52362h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + Q0() + n0());
    }

    public boolean p0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 5) {
            this.f52362h = 0;
            int[] iArr = this.f52369o;
            int i12 = this.f52367m - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        } else if (i11 == 6) {
            this.f52362h = 0;
            int[] iArr2 = this.f52369o;
            int i13 = this.f52367m - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + Q0() + n0());
        }
    }

    public double t0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            this.f52362h = 0;
            int[] iArr = this.f52369o;
            int i12 = this.f52367m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f52363i;
        }
        if (i11 == 16) {
            this.f52365k = new String(this.f52357c, this.f52358d, this.f52364j);
            this.f52358d += this.f52364j;
        } else if (i11 == 8 || i11 == 9) {
            this.f52365k = I0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i11 == 10) {
            this.f52365k = P0();
        } else if (i11 != 11) {
            throw new IllegalStateException("Expected a double but was " + Q0() + n0());
        }
        this.f52362h = 11;
        double parseDouble = Double.parseDouble(this.f52365k);
        if (!this.f52356b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + n0());
        }
        this.f52365k = null;
        this.f52362h = 0;
        int[] iArr2 = this.f52369o;
        int i13 = this.f52367m - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    public String toString() {
        return getClass().getSimpleName() + n0();
    }

    public int u0() {
        int i11 = this.f52362h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            long j11 = this.f52363i;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f52362h = 0;
                int[] iArr = this.f52369o;
                int i13 = this.f52367m - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new NumberFormatException("Expected an int but was " + this.f52363i + n0());
        }
        if (i11 == 16) {
            this.f52365k = new String(this.f52357c, this.f52358d, this.f52364j);
            this.f52358d += this.f52364j;
        } else if (i11 != 8 && i11 != 9 && i11 != 10) {
            throw new IllegalStateException("Expected an int but was " + Q0() + n0());
        } else {
            if (i11 == 10) {
                this.f52365k = P0();
            } else {
                this.f52365k = I0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int parseInt = Integer.parseInt(this.f52365k);
                this.f52362h = 0;
                int[] iArr2 = this.f52369o;
                int i14 = this.f52367m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f52362h = 11;
        double parseDouble = Double.parseDouble(this.f52365k);
        int i15 = (int) parseDouble;
        if (i15 == parseDouble) {
            this.f52365k = null;
            this.f52362h = 0;
            int[] iArr3 = this.f52369o;
            int i16 = this.f52367m - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        }
        throw new NumberFormatException("Expected an int but was " + this.f52365k + n0());
    }

    public void y1() {
        int i11 = 0;
        do {
            int i12 = this.f52362h;
            if (i12 == 0) {
                i12 = m();
            }
            if (i12 == 3) {
                X0(1);
            } else if (i12 == 1) {
                X0(3);
            } else {
                if (i12 == 4) {
                    this.f52367m--;
                } else if (i12 == 2) {
                    this.f52367m--;
                } else {
                    if (i12 == 14 || i12 == 10) {
                        v1();
                    } else if (i12 == 8 || i12 == 12) {
                        h1(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else if (i12 == 9 || i12 == 13) {
                        h1(CoreConstants.DOUBLE_QUOTE_CHAR);
                    } else if (i12 == 16) {
                        this.f52358d += this.f52364j;
                    }
                    this.f52362h = 0;
                }
                i11--;
                this.f52362h = 0;
            }
            i11++;
            this.f52362h = 0;
        } while (i11 != 0);
        int[] iArr = this.f52369o;
        int i13 = this.f52367m;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f52368n[i13 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }
}