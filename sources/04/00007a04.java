package io.sentry.vendor.gson.stream;

import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.action.ActionConst;
import com.adyen.checkout.components.model.payments.request.Address;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.util.Arrays;
import java.util.Objects;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes5.dex */
public class a implements Closeable {

    /* renamed from: a  reason: collision with root package name */
    private final Reader f32660a;

    /* renamed from: b  reason: collision with root package name */
    private boolean f32661b = false;

    /* renamed from: c  reason: collision with root package name */
    private final char[] f32662c = new char[1024];

    /* renamed from: d  reason: collision with root package name */
    private int f32663d = 0;

    /* renamed from: e  reason: collision with root package name */
    private int f32664e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f32665f = 0;

    /* renamed from: g  reason: collision with root package name */
    private int f32666g = 0;

    /* renamed from: h  reason: collision with root package name */
    int f32667h = 0;

    /* renamed from: i  reason: collision with root package name */
    private long f32668i;

    /* renamed from: j  reason: collision with root package name */
    private int f32669j;

    /* renamed from: k  reason: collision with root package name */
    private String f32670k;

    /* renamed from: l  reason: collision with root package name */
    private int[] f32671l;

    /* renamed from: m  reason: collision with root package name */
    private int f32672m;

    /* renamed from: n  reason: collision with root package name */
    private String[] f32673n;

    /* renamed from: o  reason: collision with root package name */
    private int[] f32674o;

    public a(Reader reader) {
        int[] iArr = new int[32];
        this.f32671l = iArr;
        this.f32672m = 0;
        this.f32672m = 0 + 1;
        iArr[0] = 6;
        this.f32673n = new String[32];
        this.f32674o = new int[32];
        Objects.requireNonNull(reader, "in == null");
        this.f32660a = reader;
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x005c, code lost:
        if (r1 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x005e, code lost:
        r1 = new java.lang.StringBuilder(java.lang.Math.max((r2 - r3) * 2, 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        r1.append(r0, r3, r2 - r3);
        r9.f32663d = r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String C0(char r10) {
        /*
            r9 = this;
            char[] r0 = r9.f32662c
            r1 = 0
        L3:
            int r2 = r9.f32663d
            int r3 = r9.f32664e
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
            r9.f32663d = r7
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
            r9.f32663d = r7
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
            char r2 = r9.Q0()
            r1.append(r2)
            int r2 = r9.f32663d
            int r3 = r9.f32664e
            goto L7
        L4f:
            r5 = 10
            if (r2 != r5) goto L5a
            int r2 = r9.f32665f
            int r2 = r2 + r6
            r9.f32665f = r2
            r9.f32666g = r7
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
            r9.f32663d = r2
            boolean r2 = r9.D(r6)
            if (r2 == 0) goto L7a
            goto L3
        L7a:
            java.lang.String r10 = "Unterminated string"
            java.io.IOException r10 = r9.h1(r10)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.C0(char):java.lang.String");
    }

    private boolean D(int i11) {
        int i12;
        int i13;
        char[] cArr = this.f32662c;
        int i14 = this.f32666g;
        int i15 = this.f32663d;
        this.f32666g = i14 - i15;
        int i16 = this.f32664e;
        if (i16 != i15) {
            int i17 = i16 - i15;
            this.f32664e = i17;
            System.arraycopy(cArr, i15, cArr, 0, i17);
        } else {
            this.f32664e = 0;
        }
        this.f32663d = 0;
        do {
            Reader reader = this.f32660a;
            int i18 = this.f32664e;
            int read = reader.read(cArr, i18, cArr.length - i18);
            if (read == -1) {
                return false;
            }
            i12 = this.f32664e + read;
            this.f32664e = i12;
            if (this.f32665f == 0 && (i13 = this.f32666g) == 0 && i12 > 0 && cArr[0] == 65279) {
                this.f32663d++;
                this.f32666g = i13 + 1;
                i11++;
                continue;
            }
        } while (i12 < i11);
        return true;
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
    private java.lang.String F0() {
        /*
            r6 = this;
            r0 = 0
            r1 = 0
        L2:
            r2 = r0
        L3:
            int r3 = r6.f32663d
            int r4 = r3 + r2
            int r5 = r6.f32664e
            if (r4 >= r5) goto L4e
            char[] r4 = r6.f32662c
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
            char[] r3 = r6.f32662c
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
            char[] r3 = r6.f32662c
            int r4 = r6.f32663d
            r1.append(r3, r4, r2)
            int r3 = r6.f32663d
            int r3 = r3 + r2
            r6.f32663d = r3
            r2 = 1
            boolean r2 = r6.D(r2)
            if (r2 != 0) goto L2
        L7e:
            if (r1 != 0) goto L8a
            java.lang.String r1 = new java.lang.String
            char[] r2 = r6.f32662c
            int r3 = r6.f32663d
            r1.<init>(r2, r3, r0)
            goto L95
        L8a:
            char[] r2 = r6.f32662c
            int r3 = r6.f32663d
            r1.append(r2, r3, r0)
            java.lang.String r1 = r1.toString()
        L95:
            int r2 = r6.f32663d
            int r2 = r2 + r0
            r6.f32663d = r2
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.F0():java.lang.String");
    }

    private int I0() {
        int i11;
        String str;
        String str2;
        char c11 = this.f32662c[this.f32663d];
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
            if (this.f32663d + i12 >= this.f32664e && !D(i12 + 1)) {
                return 0;
            }
            char c12 = this.f32662c[this.f32663d + i12];
            if (c12 != str.charAt(i12) && c12 != str2.charAt(i12)) {
                return 0;
            }
        }
        if ((this.f32663d + length < this.f32664e || D(length + 1)) && J(this.f32662c[this.f32663d + length])) {
            return 0;
        }
        this.f32663d += length;
        this.f32667h = i11;
        return i11;
    }

    private boolean J(char c11) {
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

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0091, code lost:
        if (J(r14) != false) goto L76;
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
        r18.f32668i = r11;
        r18.f32663d += r8;
        r18.f32667h = 15;
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
        r18.f32669j = r8;
        r18.f32667h = 16;
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
    private int J0() {
        /*
            Method dump skipped, instructions count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.J0():int");
    }

    private void P0(int i11) {
        int i12 = this.f32672m;
        int[] iArr = this.f32671l;
        if (i12 == iArr.length) {
            int i13 = i12 * 2;
            this.f32671l = Arrays.copyOf(iArr, i13);
            this.f32674o = Arrays.copyOf(this.f32674o, i13);
            this.f32673n = (String[]) Arrays.copyOf(this.f32673n, i13);
        }
        int[] iArr2 = this.f32671l;
        int i14 = this.f32672m;
        this.f32672m = i14 + 1;
        iArr2[i14] = i11;
    }

    private char Q0() {
        int i11;
        int i12;
        if (this.f32663d == this.f32664e && !D(1)) {
            throw h1("Unterminated escape sequence");
        }
        char[] cArr = this.f32662c;
        int i13 = this.f32663d;
        int i14 = i13 + 1;
        this.f32663d = i14;
        char c11 = cArr[i13];
        if (c11 == '\n') {
            this.f32665f++;
            this.f32666g = i14;
        } else if (c11 != '\"' && c11 != '\'' && c11 != '/' && c11 != '\\') {
            if (c11 != 'b') {
                if (c11 != 'f') {
                    if (c11 != 'n') {
                        if (c11 != 'r') {
                            if (c11 != 't') {
                                if (c11 == 'u') {
                                    if (i14 + 4 > this.f32664e && !D(4)) {
                                        throw h1("Unterminated escape sequence");
                                    }
                                    char c12 = 0;
                                    int i15 = this.f32663d;
                                    int i16 = i15 + 4;
                                    while (i15 < i16) {
                                        char c13 = this.f32662c[i15];
                                        char c14 = (char) (c12 << 4);
                                        if (c13 < '0' || c13 > '9') {
                                            if (c13 >= 'a' && c13 <= 'f') {
                                                i11 = c13 - 'a';
                                            } else if (c13 < 'A' || c13 > 'F') {
                                                throw new NumberFormatException("\\u" + new String(this.f32662c, this.f32663d, 4));
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
                                    this.f32663d += 4;
                                    return c12;
                                }
                                throw h1("Invalid escape sequence");
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

    private void R0(char c11) {
        char[] cArr = this.f32662c;
        do {
            int i11 = this.f32663d;
            int i12 = this.f32664e;
            while (i11 < i12) {
                int i13 = i11 + 1;
                char c12 = cArr[i11];
                if (c12 == c11) {
                    this.f32663d = i13;
                    return;
                } else if (c12 == '\\') {
                    this.f32663d = i13;
                    Q0();
                    i11 = this.f32663d;
                    i12 = this.f32664e;
                } else {
                    if (c12 == '\n') {
                        this.f32665f++;
                        this.f32666g = i13;
                    }
                    i11 = i13;
                }
            }
            this.f32663d = i11;
        } while (D(1));
        throw h1("Unterminated string");
    }

    private boolean S0(String str) {
        int length = str.length();
        while (true) {
            if (this.f32663d + length > this.f32664e && !D(length)) {
                return false;
            }
            char[] cArr = this.f32662c;
            int i11 = this.f32663d;
            if (cArr[i11] != '\n') {
                for (int i12 = 0; i12 < length; i12++) {
                    if (this.f32662c[this.f32663d + i12] != str.charAt(i12)) {
                        break;
                    }
                }
                return true;
            }
            this.f32665f++;
            this.f32666g = i11 + 1;
            this.f32663d++;
        }
    }

    private void X0() {
        char c11;
        do {
            if (this.f32663d >= this.f32664e && !D(1)) {
                return;
            }
            char[] cArr = this.f32662c;
            int i11 = this.f32663d;
            int i12 = i11 + 1;
            this.f32663d = i12;
            c11 = cArr[i11];
            if (c11 == '\n') {
                this.f32665f++;
                this.f32666g = i12;
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
    private void Z0() {
        /*
            r4 = this;
        L0:
            r0 = 0
        L1:
            int r1 = r4.f32663d
            int r2 = r1 + r0
            int r3 = r4.f32664e
            if (r2 >= r3) goto L51
            char[] r2 = r4.f32662c
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
            int r1 = r4.f32663d
            int r1 = r1 + r0
            r4.f32663d = r1
            return
        L51:
            int r1 = r1 + r0
            r4.f32663d = r1
            r0 = 1
            boolean r0 = r4.D(r0)
            if (r0 != 0) goto L0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.vendor.gson.stream.a.Z0():void");
    }

    private IOException h1(String str) {
        throw new MalformedJsonException(str + L());
    }

    private void j() {
        if (!this.f32661b) {
            throw h1("Use JsonReader.setLenient(true) to accept malformed JSON");
        }
    }

    private void l() {
        t0(true);
        int i11 = this.f32663d - 1;
        this.f32663d = i11;
        if (i11 + 5 <= this.f32664e || D(5)) {
            char[] cArr = this.f32662c;
            if (cArr[i11] == ')' && cArr[i11 + 1] == ']' && cArr[i11 + 2] == '}' && cArr[i11 + 3] == '\'' && cArr[i11 + 4] == '\n') {
                this.f32663d += 5;
            }
        }
    }

    private int t0(boolean z11) {
        char[] cArr = this.f32662c;
        int i11 = this.f32663d;
        int i12 = this.f32664e;
        while (true) {
            if (i11 == i12) {
                this.f32663d = i11;
                if (!D(1)) {
                    if (z11) {
                        throw new EOFException("End of input" + L());
                    }
                    return -1;
                }
                i11 = this.f32663d;
                i12 = this.f32664e;
            }
            int i13 = i11 + 1;
            char c11 = cArr[i11];
            if (c11 == '\n') {
                this.f32665f++;
                this.f32666g = i13;
            } else if (c11 != ' ' && c11 != '\r' && c11 != '\t') {
                if (c11 == '/') {
                    this.f32663d = i13;
                    if (i13 == i12) {
                        this.f32663d = i13 - 1;
                        boolean D = D(2);
                        this.f32663d++;
                        if (!D) {
                            return c11;
                        }
                    }
                    j();
                    int i14 = this.f32663d;
                    char c12 = cArr[i14];
                    if (c12 == '*') {
                        this.f32663d = i14 + 1;
                        if (S0("*/")) {
                            i11 = this.f32663d + 2;
                            i12 = this.f32664e;
                        } else {
                            throw h1("Unterminated comment");
                        }
                    } else if (c12 != '/') {
                        return c11;
                    } else {
                        this.f32663d = i14 + 1;
                        X0();
                        i11 = this.f32663d;
                        i12 = this.f32664e;
                    }
                } else if (c11 == '#') {
                    this.f32663d = i13;
                    j();
                    X0();
                    i11 = this.f32663d;
                    i12 = this.f32664e;
                } else {
                    this.f32663d = i13;
                    return c11;
                }
            }
            i11 = i13;
        }
    }

    public void C() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 2) {
            int i12 = this.f32672m - 1;
            this.f32672m = i12;
            this.f32673n[i12] = null;
            int[] iArr = this.f32674o;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f32667h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_OBJECT but was " + G0() + L());
    }

    public String D0() {
        String str;
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 10) {
            str = F0();
        } else if (i11 == 8) {
            str = C0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i11 == 9) {
            str = C0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i11 == 11) {
            str = this.f32670k;
            this.f32670k = null;
        } else if (i11 == 15) {
            str = Long.toString(this.f32668i);
        } else if (i11 == 16) {
            str = new String(this.f32662c, this.f32663d, this.f32669j);
            this.f32663d += this.f32669j;
        } else {
            throw new IllegalStateException("Expected a string but was " + G0() + L());
        }
        this.f32667h = 0;
        int[] iArr = this.f32674o;
        int i12 = this.f32672m - 1;
        iArr[i12] = iArr[i12] + 1;
        return str;
    }

    public b G0() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        switch (i11) {
            case 1:
                return b.BEGIN_OBJECT;
            case 2:
                return b.END_OBJECT;
            case 3:
                return b.BEGIN_ARRAY;
            case 4:
                return b.END_ARRAY;
            case 5:
            case 6:
                return b.BOOLEAN;
            case 7:
                return b.NULL;
            case 8:
            case 9:
            case 10:
            case 11:
                return b.STRING;
            case 12:
            case 13:
            case 14:
                return b.NAME;
            case 15:
            case 16:
                return b.NUMBER;
            case 17:
                return b.END_DOCUMENT;
            default:
                throw new AssertionError();
        }
    }

    String L() {
        return " at line " + (this.f32665f + 1) + " column " + ((this.f32663d - this.f32666g) + 1) + " path " + getPath();
    }

    public boolean R() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 5) {
            this.f32667h = 0;
            int[] iArr = this.f32674o;
            int i12 = this.f32672m - 1;
            iArr[i12] = iArr[i12] + 1;
            return true;
        } else if (i11 == 6) {
            this.f32667h = 0;
            int[] iArr2 = this.f32674o;
            int i13 = this.f32672m - 1;
            iArr2[i13] = iArr2[i13] + 1;
            return false;
        } else {
            throw new IllegalStateException("Expected a boolean but was " + G0() + L());
        }
    }

    public void a() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 3) {
            P0(1);
            this.f32674o[this.f32672m - 1] = 0;
            this.f32667h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_ARRAY but was " + G0() + L());
    }

    public double a0() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            this.f32667h = 0;
            int[] iArr = this.f32674o;
            int i12 = this.f32672m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f32668i;
        }
        if (i11 == 16) {
            this.f32670k = new String(this.f32662c, this.f32663d, this.f32669j);
            this.f32663d += this.f32669j;
        } else if (i11 == 8 || i11 == 9) {
            this.f32670k = C0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
        } else if (i11 == 10) {
            this.f32670k = F0();
        } else if (i11 != 11) {
            throw new IllegalStateException("Expected a double but was " + G0() + L());
        }
        this.f32667h = 11;
        double parseDouble = Double.parseDouble(this.f32670k);
        if (!this.f32661b && (Double.isNaN(parseDouble) || Double.isInfinite(parseDouble))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + parseDouble + L());
        }
        this.f32670k = null;
        this.f32667h = 0;
        int[] iArr2 = this.f32674o;
        int i13 = this.f32672m - 1;
        iArr2[i13] = iArr2[i13] + 1;
        return parseDouble;
    }

    public void b1() {
        int i11 = 0;
        do {
            int i12 = this.f32667h;
            if (i12 == 0) {
                i12 = m();
            }
            if (i12 == 3) {
                P0(1);
            } else if (i12 == 1) {
                P0(3);
            } else {
                if (i12 == 4) {
                    this.f32672m--;
                } else if (i12 == 2) {
                    this.f32672m--;
                } else {
                    if (i12 == 14 || i12 == 10) {
                        Z0();
                    } else if (i12 == 8 || i12 == 12) {
                        R0(CoreConstants.SINGLE_QUOTE_CHAR);
                    } else if (i12 == 9 || i12 == 13) {
                        R0(CoreConstants.DOUBLE_QUOTE_CHAR);
                    } else if (i12 == 16) {
                        this.f32663d += this.f32669j;
                    }
                    this.f32667h = 0;
                }
                i11--;
                this.f32667h = 0;
            }
            i11++;
            this.f32667h = 0;
        } while (i11 != 0);
        int[] iArr = this.f32674o;
        int i13 = this.f32672m;
        int i14 = i13 - 1;
        iArr[i14] = iArr[i14] + 1;
        this.f32673n[i13 - 1] = Address.ADDRESS_NULL_PLACEHOLDER;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f32667h = 0;
        this.f32671l[0] = 8;
        this.f32672m = 1;
        this.f32660a.close();
    }

    public int e0() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            long j11 = this.f32668i;
            int i12 = (int) j11;
            if (j11 == i12) {
                this.f32667h = 0;
                int[] iArr = this.f32674o;
                int i13 = this.f32672m - 1;
                iArr[i13] = iArr[i13] + 1;
                return i12;
            }
            throw new NumberFormatException("Expected an int but was " + this.f32668i + L());
        }
        if (i11 == 16) {
            this.f32670k = new String(this.f32662c, this.f32663d, this.f32669j);
            this.f32663d += this.f32669j;
        } else if (i11 != 8 && i11 != 9 && i11 != 10) {
            throw new IllegalStateException("Expected an int but was " + G0() + L());
        } else {
            if (i11 == 10) {
                this.f32670k = F0();
            } else {
                this.f32670k = C0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                int parseInt = Integer.parseInt(this.f32670k);
                this.f32667h = 0;
                int[] iArr2 = this.f32674o;
                int i14 = this.f32672m - 1;
                iArr2[i14] = iArr2[i14] + 1;
                return parseInt;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32667h = 11;
        double parseDouble = Double.parseDouble(this.f32670k);
        int i15 = (int) parseDouble;
        if (i15 == parseDouble) {
            this.f32670k = null;
            this.f32667h = 0;
            int[] iArr3 = this.f32674o;
            int i16 = this.f32672m - 1;
            iArr3[i16] = iArr3[i16] + 1;
            return i15;
        }
        throw new NumberFormatException("Expected an int but was " + this.f32670k + L());
    }

    public void g() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 1) {
            P0(3);
            this.f32667h = 0;
            return;
        }
        throw new IllegalStateException("Expected BEGIN_OBJECT but was " + G0() + L());
    }

    public String getPath() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(CoreConstants.DOLLAR);
        int i11 = this.f32672m;
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = this.f32671l[i12];
            if (i13 == 1 || i13 == 2) {
                sb2.append('[');
                sb2.append(this.f32674o[i12]);
                sb2.append(']');
            } else if (i13 == 3 || i13 == 4 || i13 == 5) {
                sb2.append(CoreConstants.DOT);
                String[] strArr = this.f32673n;
                if (strArr[i12] != null) {
                    sb2.append(strArr[i12]);
                }
            }
        }
        return sb2.toString();
    }

    int m() {
        int t02;
        int[] iArr = this.f32671l;
        int i11 = this.f32672m;
        int i12 = iArr[i11 - 1];
        if (i12 == 1) {
            iArr[i11 - 1] = 2;
        } else if (i12 == 2) {
            int t03 = t0(true);
            if (t03 != 44) {
                if (t03 != 59) {
                    if (t03 == 93) {
                        this.f32667h = 4;
                        return 4;
                    }
                    throw h1("Unterminated array");
                }
                j();
            }
        } else if (i12 == 3 || i12 == 5) {
            iArr[i11 - 1] = 4;
            if (i12 == 5 && (t02 = t0(true)) != 44) {
                if (t02 != 59) {
                    if (t02 == 125) {
                        this.f32667h = 2;
                        return 2;
                    }
                    throw h1("Unterminated object");
                }
                j();
            }
            int t04 = t0(true);
            if (t04 == 34) {
                this.f32667h = 13;
                return 13;
            } else if (t04 == 39) {
                j();
                this.f32667h = 12;
                return 12;
            } else if (t04 == 125) {
                if (i12 != 5) {
                    this.f32667h = 2;
                    return 2;
                }
                throw h1("Expected name");
            } else {
                j();
                this.f32663d--;
                if (J((char) t04)) {
                    this.f32667h = 14;
                    return 14;
                }
                throw h1("Expected name");
            }
        } else if (i12 == 4) {
            iArr[i11 - 1] = 5;
            int t05 = t0(true);
            if (t05 != 58) {
                if (t05 == 61) {
                    j();
                    if (this.f32663d < this.f32664e || D(1)) {
                        char[] cArr = this.f32662c;
                        int i13 = this.f32663d;
                        if (cArr[i13] == '>') {
                            this.f32663d = i13 + 1;
                        }
                    }
                } else {
                    throw h1("Expected ':'");
                }
            }
        } else if (i12 == 6) {
            if (this.f32661b) {
                l();
            }
            this.f32671l[this.f32672m - 1] = 7;
        } else if (i12 == 7) {
            if (t0(false) == -1) {
                this.f32667h = 17;
                return 17;
            }
            j();
            this.f32663d--;
        } else if (i12 == 8) {
            throw new IllegalStateException("JsonReader is closed");
        }
        int t06 = t0(true);
        if (t06 == 34) {
            this.f32667h = 9;
            return 9;
        } else if (t06 == 39) {
            j();
            this.f32667h = 8;
            return 8;
        } else {
            if (t06 != 44 && t06 != 59) {
                if (t06 == 91) {
                    this.f32667h = 3;
                    return 3;
                } else if (t06 != 93) {
                    if (t06 != 123) {
                        this.f32663d--;
                        int I0 = I0();
                        if (I0 != 0) {
                            return I0;
                        }
                        int J0 = J0();
                        if (J0 != 0) {
                            return J0;
                        }
                        if (J(this.f32662c[this.f32663d])) {
                            j();
                            this.f32667h = 10;
                            return 10;
                        }
                        throw h1("Expected value");
                    }
                    this.f32667h = 1;
                    return 1;
                } else if (i12 == 1) {
                    this.f32667h = 4;
                    return 4;
                }
            }
            if (i12 != 1 && i12 != 2) {
                throw h1("Unexpected value");
            }
            j();
            this.f32663d--;
            this.f32667h = 7;
            return 7;
        }
    }

    public long n0() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 15) {
            this.f32667h = 0;
            int[] iArr = this.f32674o;
            int i12 = this.f32672m - 1;
            iArr[i12] = iArr[i12] + 1;
            return this.f32668i;
        }
        if (i11 == 16) {
            this.f32670k = new String(this.f32662c, this.f32663d, this.f32669j);
            this.f32663d += this.f32669j;
        } else if (i11 != 8 && i11 != 9 && i11 != 10) {
            throw new IllegalStateException("Expected a long but was " + G0() + L());
        } else {
            if (i11 == 10) {
                this.f32670k = F0();
            } else {
                this.f32670k = C0(i11 == 8 ? CoreConstants.SINGLE_QUOTE_CHAR : CoreConstants.DOUBLE_QUOTE_CHAR);
            }
            try {
                long parseLong = Long.parseLong(this.f32670k);
                this.f32667h = 0;
                int[] iArr2 = this.f32674o;
                int i13 = this.f32672m - 1;
                iArr2[i13] = iArr2[i13] + 1;
                return parseLong;
            } catch (NumberFormatException unused) {
            }
        }
        this.f32667h = 11;
        double parseDouble = Double.parseDouble(this.f32670k);
        long j11 = (long) parseDouble;
        if (j11 == parseDouble) {
            this.f32670k = null;
            this.f32667h = 0;
            int[] iArr3 = this.f32674o;
            int i14 = this.f32672m - 1;
            iArr3[i14] = iArr3[i14] + 1;
            return j11;
        }
        throw new NumberFormatException("Expected a long but was " + this.f32670k + L());
    }

    public void p() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 4) {
            int i12 = this.f32672m - 1;
            this.f32672m = i12;
            int[] iArr = this.f32674o;
            int i13 = i12 - 1;
            iArr[i13] = iArr[i13] + 1;
            this.f32667h = 0;
            return;
        }
        throw new IllegalStateException("Expected END_ARRAY but was " + G0() + L());
    }

    public String p0() {
        String C0;
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 14) {
            C0 = F0();
        } else if (i11 == 12) {
            C0 = C0(CoreConstants.SINGLE_QUOTE_CHAR);
        } else if (i11 == 13) {
            C0 = C0(CoreConstants.DOUBLE_QUOTE_CHAR);
        } else {
            throw new IllegalStateException("Expected a name but was " + G0() + L());
        }
        this.f32667h = 0;
        this.f32673n[this.f32672m - 1] = C0;
        return C0;
    }

    public String toString() {
        return getClass().getSimpleName() + L();
    }

    public void u0() {
        int i11 = this.f32667h;
        if (i11 == 0) {
            i11 = m();
        }
        if (i11 == 7) {
            this.f32667h = 0;
            int[] iArr = this.f32674o;
            int i12 = this.f32672m - 1;
            iArr[i12] = iArr[i12] + 1;
            return;
        }
        throw new IllegalStateException("Expected null but was " + G0() + L());
    }
}