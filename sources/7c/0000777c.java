package io.grpc.okhttp.internal;

import javax.security.auth.x500.X500Principal;

/* loaded from: classes5.dex */
final class d {

    /* renamed from: a  reason: collision with root package name */
    private final String f31534a;

    /* renamed from: b  reason: collision with root package name */
    private final int f31535b;

    /* renamed from: c  reason: collision with root package name */
    private int f31536c;

    /* renamed from: d  reason: collision with root package name */
    private int f31537d;

    /* renamed from: e  reason: collision with root package name */
    private int f31538e;

    /* renamed from: f  reason: collision with root package name */
    private int f31539f;

    /* renamed from: g  reason: collision with root package name */
    private char[] f31540g;

    public d(X500Principal x500Principal) {
        String name = x500Principal.getName("RFC2253");
        this.f31534a = name;
        this.f31535b = name.length();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a1, code lost:
        return new java.lang.String(r1, r2, r8.f31539f - r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.lang.String a() {
        /*
            r8 = this;
            int r0 = r8.f31536c
            r8.f31537d = r0
            r8.f31538e = r0
        L6:
            int r0 = r8.f31536c
            int r1 = r8.f31535b
            if (r0 < r1) goto L19
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f31540g
            int r2 = r8.f31537d
            int r3 = r8.f31538e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L19:
            char[] r1 = r8.f31540g
            char r2 = r1[r0]
            r3 = 44
            r4 = 43
            r5 = 59
            r6 = 32
            if (r2 == r6) goto L5e
            if (r2 == r5) goto L53
            r5 = 92
            if (r2 == r5) goto L40
            if (r2 == r4) goto L53
            if (r2 == r3) goto L53
            int r2 = r8.f31538e
            int r3 = r2 + 1
            r8.f31538e = r3
            char r3 = r1[r0]
            r1[r2] = r3
            int r0 = r0 + 1
            r8.f31536c = r0
            goto L6
        L40:
            int r0 = r8.f31538e
            int r2 = r0 + 1
            r8.f31538e = r2
            char r2 = r8.d()
            r1[r0] = r2
            int r0 = r8.f31536c
            int r0 = r0 + 1
            r8.f31536c = r0
            goto L6
        L53:
            java.lang.String r0 = new java.lang.String
            int r2 = r8.f31537d
            int r3 = r8.f31538e
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        L5e:
            int r2 = r8.f31538e
            r8.f31539f = r2
            int r0 = r0 + 1
            r8.f31536c = r0
            int r0 = r2 + 1
            r8.f31538e = r0
            r1[r2] = r6
        L6c:
            int r0 = r8.f31536c
            int r1 = r8.f31535b
            if (r0 >= r1) goto L85
            char[] r2 = r8.f31540g
            char r7 = r2[r0]
            if (r7 != r6) goto L85
            int r1 = r8.f31538e
            int r7 = r1 + 1
            r8.f31538e = r7
            r2[r1] = r6
            int r0 = r0 + 1
            r8.f31536c = r0
            goto L6c
        L85:
            if (r0 == r1) goto L95
            char[] r1 = r8.f31540g
            char r2 = r1[r0]
            if (r2 == r3) goto L95
            char r2 = r1[r0]
            if (r2 == r4) goto L95
            char r0 = r1[r0]
            if (r0 != r5) goto L6
        L95:
            java.lang.String r0 = new java.lang.String
            char[] r1 = r8.f31540g
            int r2 = r8.f31537d
            int r3 = r8.f31539f
            int r3 = r3 - r2
            r0.<init>(r1, r2, r3)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.grpc.okhttp.internal.d.a():java.lang.String");
    }

    private int c(int i11) {
        int i12;
        int i13;
        int i14 = i11 + 1;
        if (i14 < this.f31535b) {
            char[] cArr = this.f31540g;
            char c11 = cArr[i11];
            if (c11 >= '0' && c11 <= '9') {
                i12 = c11 - '0';
            } else if (c11 >= 'a' && c11 <= 'f') {
                i12 = c11 - 'W';
            } else if (c11 < 'A' || c11 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f31534a);
            } else {
                i12 = c11 - '7';
            }
            char c12 = cArr[i14];
            if (c12 >= '0' && c12 <= '9') {
                i13 = c12 - '0';
            } else if (c12 >= 'a' && c12 <= 'f') {
                i13 = c12 - 'W';
            } else if (c12 < 'A' || c12 > 'F') {
                throw new IllegalStateException("Malformed DN: " + this.f31534a);
            } else {
                i13 = c12 - '7';
            }
            return (i12 << 4) + i13;
        }
        throw new IllegalStateException("Malformed DN: " + this.f31534a);
    }

    private char d() {
        int i11 = this.f31536c + 1;
        this.f31536c = i11;
        if (i11 != this.f31535b) {
            char[] cArr = this.f31540g;
            char c11 = cArr[i11];
            if (c11 != ' ' && c11 != '%' && c11 != '\\' && c11 != '_' && c11 != '\"' && c11 != '#') {
                switch (c11) {
                    case '*':
                    case '+':
                    case ',':
                        break;
                    default:
                        switch (c11) {
                            case ';':
                            case '<':
                            case '=':
                            case '>':
                                break;
                            default:
                                return e();
                        }
                }
            }
            return cArr[i11];
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
    }

    private char e() {
        int i11;
        int i12;
        int c11 = c(this.f31536c);
        this.f31536c++;
        if (c11 < 128) {
            return (char) c11;
        }
        if (c11 < 192 || c11 > 247) {
            return '?';
        }
        if (c11 <= 223) {
            i12 = c11 & 31;
            i11 = 1;
        } else if (c11 <= 239) {
            i11 = 2;
            i12 = c11 & 15;
        } else {
            i11 = 3;
            i12 = c11 & 7;
        }
        for (int i13 = 0; i13 < i11; i13++) {
            int i14 = this.f31536c + 1;
            this.f31536c = i14;
            if (i14 == this.f31535b || this.f31540g[i14] != '\\') {
                return '?';
            }
            int i15 = i14 + 1;
            this.f31536c = i15;
            int c12 = c(i15);
            this.f31536c++;
            if ((c12 & 192) != 128) {
                return '?';
            }
            i12 = (i12 << 6) + (c12 & 63);
        }
        return (char) i12;
    }

    private String f() {
        int i11;
        int i12 = this.f31536c;
        if (i12 + 4 < this.f31535b) {
            this.f31537d = i12;
            this.f31536c = i12 + 1;
            while (true) {
                i11 = this.f31536c;
                if (i11 == this.f31535b) {
                    break;
                }
                char[] cArr = this.f31540g;
                if (cArr[i11] == '+' || cArr[i11] == ',' || cArr[i11] == ';') {
                    break;
                } else if (cArr[i11] == ' ') {
                    this.f31538e = i11;
                    this.f31536c = i11 + 1;
                    while (true) {
                        int i13 = this.f31536c;
                        if (i13 >= this.f31535b || this.f31540g[i13] != ' ') {
                            break;
                        }
                        this.f31536c = i13 + 1;
                    }
                } else {
                    if (cArr[i11] >= 'A' && cArr[i11] <= 'F') {
                        cArr[i11] = (char) (cArr[i11] + ' ');
                    }
                    this.f31536c = i11 + 1;
                }
            }
            this.f31538e = i11;
            int i14 = this.f31538e;
            int i15 = this.f31537d;
            int i16 = i14 - i15;
            if (i16 >= 5 && (i16 & 1) != 0) {
                int i17 = i16 / 2;
                byte[] bArr = new byte[i17];
                int i18 = i15 + 1;
                for (int i19 = 0; i19 < i17; i19++) {
                    bArr[i19] = (byte) c(i18);
                    i18 += 2;
                }
                return new String(this.f31540g, this.f31537d, i16);
            }
            throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
    }

    private String g() {
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        while (true) {
            i11 = this.f31536c;
            i12 = this.f31535b;
            if (i11 >= i12 || this.f31540g[i11] != ' ') {
                break;
            }
            this.f31536c = i11 + 1;
        }
        if (i11 == i12) {
            return null;
        }
        this.f31537d = i11;
        this.f31536c = i11 + 1;
        while (true) {
            i13 = this.f31536c;
            i14 = this.f31535b;
            if (i13 >= i14) {
                break;
            }
            char[] cArr = this.f31540g;
            if (cArr[i13] == '=' || cArr[i13] == ' ') {
                break;
            }
            this.f31536c = i13 + 1;
        }
        if (i13 < i14) {
            this.f31538e = i13;
            if (this.f31540g[i13] == ' ') {
                while (true) {
                    i15 = this.f31536c;
                    i16 = this.f31535b;
                    if (i15 >= i16) {
                        break;
                    }
                    char[] cArr2 = this.f31540g;
                    if (cArr2[i15] == '=' || cArr2[i15] != ' ') {
                        break;
                    }
                    this.f31536c = i15 + 1;
                }
                if (this.f31540g[i15] != '=' || i15 == i16) {
                    throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
                }
            }
            this.f31536c++;
            while (true) {
                int i17 = this.f31536c;
                if (i17 >= this.f31535b || this.f31540g[i17] != ' ') {
                    break;
                }
                this.f31536c = i17 + 1;
            }
            int i18 = this.f31538e;
            int i19 = this.f31537d;
            if (i18 - i19 > 4) {
                char[] cArr3 = this.f31540g;
                if (cArr3[i19 + 3] == '.' && ((cArr3[i19] == 'O' || cArr3[i19] == 'o') && ((cArr3[i19 + 1] == 'I' || cArr3[i19 + 1] == 'i') && (cArr3[i19 + 2] == 'D' || cArr3[i19 + 2] == 'd')))) {
                    this.f31537d = i19 + 4;
                }
            }
            char[] cArr4 = this.f31540g;
            int i21 = this.f31537d;
            return new String(cArr4, i21, i18 - i21);
        }
        throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
    }

    private String h() {
        int i11 = this.f31536c + 1;
        this.f31536c = i11;
        this.f31537d = i11;
        this.f31538e = i11;
        while (true) {
            int i12 = this.f31536c;
            if (i12 != this.f31535b) {
                char[] cArr = this.f31540g;
                if (cArr[i12] == '\"') {
                    this.f31536c = i12 + 1;
                    while (true) {
                        int i13 = this.f31536c;
                        if (i13 >= this.f31535b || this.f31540g[i13] != ' ') {
                            break;
                        }
                        this.f31536c = i13 + 1;
                    }
                    char[] cArr2 = this.f31540g;
                    int i14 = this.f31537d;
                    return new String(cArr2, i14, this.f31538e - i14);
                }
                if (cArr[i12] == '\\') {
                    cArr[this.f31538e] = d();
                } else {
                    cArr[this.f31538e] = cArr[i12];
                }
                this.f31536c++;
                this.f31538e++;
            } else {
                throw new IllegalStateException("Unexpected end of DN: " + this.f31534a);
            }
        }
    }

    public String b(String str) {
        String h11;
        this.f31536c = 0;
        this.f31537d = 0;
        this.f31538e = 0;
        this.f31539f = 0;
        this.f31540g = this.f31534a.toCharArray();
        String g11 = g();
        if (g11 == null) {
            return null;
        }
        do {
            int i11 = this.f31536c;
            if (i11 == this.f31535b) {
                return null;
            }
            char c11 = this.f31540g[i11];
            if (c11 == '\"') {
                h11 = h();
            } else if (c11 != '#') {
                h11 = (c11 == '+' || c11 == ',' || c11 == ';') ? "" : a();
            } else {
                h11 = f();
            }
            if (str.equalsIgnoreCase(g11)) {
                return h11;
            }
            int i12 = this.f31536c;
            if (i12 >= this.f31535b) {
                return null;
            }
            char[] cArr = this.f31540g;
            if (cArr[i12] != ',' && cArr[i12] != ';' && cArr[i12] != '+') {
                throw new IllegalStateException("Malformed DN: " + this.f31534a);
            }
            this.f31536c = i12 + 1;
            g11 = g();
        } while (g11 != null);
        throw new IllegalStateException("Malformed DN: " + this.f31534a);
    }
}