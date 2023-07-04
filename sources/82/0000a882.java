package ox;

import ch.qos.logback.core.CoreConstants;
import java.net.IDN;
import java.net.InetAddress;
import java.util.Locale;
import okio.f;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f45192a;

    /* renamed from: b  reason: collision with root package name */
    private final int f45193b;

    /* renamed from: c  reason: collision with root package name */
    private final String f45194c;

    /* loaded from: classes5.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        String f45195a;

        /* renamed from: b  reason: collision with root package name */
        String f45196b;

        /* renamed from: c  reason: collision with root package name */
        int f45197c = -1;

        private static String b(String str, int i11, int i12) {
            String d11 = a.d(str, i11, i12, false);
            if (d11.startsWith("[") && d11.endsWith("]")) {
                InetAddress e11 = e(d11, 1, d11.length() - 1);
                if (e11 == null) {
                    return null;
                }
                byte[] address = e11.getAddress();
                if (address.length == 16) {
                    return i(address);
                }
                throw new AssertionError();
            }
            return f(d11);
        }

        private static boolean c(String str) {
            for (int i11 = 0; i11 < str.length(); i11++) {
                char charAt = str.charAt(i11);
                if (charAt <= 31 || charAt >= 127 || " #%/:?@[\\]".indexOf(charAt) != -1) {
                    return true;
                }
            }
            return false;
        }

        private static boolean d(String str, int i11, int i12, byte[] bArr, int i13) {
            int i14 = i13;
            while (i11 < i12) {
                if (i14 == bArr.length) {
                    return false;
                }
                if (i14 != i13) {
                    if (str.charAt(i11) != '.') {
                        return false;
                    }
                    i11++;
                }
                int i15 = i11;
                int i16 = 0;
                while (i15 < i12) {
                    char charAt = str.charAt(i15);
                    if (charAt < '0' || charAt > '9') {
                        break;
                    } else if ((i16 == 0 && i11 != i15) || (i16 = ((i16 * 10) + charAt) - 48) > 255) {
                        return false;
                    } else {
                        i15++;
                    }
                }
                if (i15 - i11 == 0) {
                    return false;
                }
                bArr[i14] = (byte) i16;
                i14++;
                i11 = i15;
            }
            return i14 == i13 + 4;
        }

        /* JADX WARN: Code restructure failed: missing block: B:41:0x0079, code lost:
            return null;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x004f  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.net.InetAddress e(java.lang.String r11, int r12, int r13) {
            /*
                r0 = 16
                byte[] r1 = new byte[r0]
                r2 = -1
                r3 = 0
                r5 = r2
                r6 = r5
                r4 = r3
            L9:
                r7 = 0
                if (r12 >= r13) goto L7a
                if (r4 != r0) goto Lf
                return r7
            Lf:
                int r8 = r12 + 2
                if (r8 > r13) goto L27
                java.lang.String r9 = "::"
                r10 = 2
                boolean r9 = r11.regionMatches(r12, r9, r3, r10)
                if (r9 == 0) goto L27
                if (r5 == r2) goto L1f
                return r7
            L1f:
                int r4 = r4 + 2
                r5 = r4
                if (r8 != r13) goto L25
                goto L7a
            L25:
                r6 = r8
                goto L4b
            L27:
                if (r4 == 0) goto L4a
                java.lang.String r8 = ":"
                r9 = 1
                boolean r8 = r11.regionMatches(r12, r8, r3, r9)
                if (r8 == 0) goto L35
                int r12 = r12 + 1
                goto L4a
            L35:
                java.lang.String r8 = "."
                boolean r12 = r11.regionMatches(r12, r8, r3, r9)
                if (r12 == 0) goto L49
                int r12 = r4 + (-2)
                boolean r11 = d(r11, r6, r13, r1, r12)
                if (r11 != 0) goto L46
                return r7
            L46:
                int r4 = r4 + 2
                goto L7a
            L49:
                return r7
            L4a:
                r6 = r12
            L4b:
                r8 = r3
                r12 = r6
            L4d:
                if (r12 >= r13) goto L60
                char r9 = r11.charAt(r12)
                int r9 = ox.a.a(r9)
                if (r9 != r2) goto L5a
                goto L60
            L5a:
                int r8 = r8 << 4
                int r8 = r8 + r9
                int r12 = r12 + 1
                goto L4d
            L60:
                int r9 = r12 - r6
                if (r9 == 0) goto L79
                r10 = 4
                if (r9 <= r10) goto L68
                goto L79
            L68:
                int r7 = r4 + 1
                int r9 = r8 >>> 8
                r9 = r9 & 255(0xff, float:3.57E-43)
                byte r9 = (byte) r9
                r1[r4] = r9
                int r4 = r7 + 1
                r8 = r8 & 255(0xff, float:3.57E-43)
                byte r8 = (byte) r8
                r1[r7] = r8
                goto L9
            L79:
                return r7
            L7a:
                if (r4 == r0) goto L8b
                if (r5 != r2) goto L7f
                return r7
            L7f:
                int r11 = r4 - r5
                int r12 = 16 - r11
                java.lang.System.arraycopy(r1, r5, r1, r12, r11)
                int r0 = r0 - r4
                int r0 = r0 + r5
                java.util.Arrays.fill(r1, r5, r0, r3)
            L8b:
                java.net.InetAddress r11 = java.net.InetAddress.getByAddress(r1)     // Catch: java.net.UnknownHostException -> L90
                return r11
            L90:
                java.lang.AssertionError r11 = new java.lang.AssertionError
                r11.<init>()
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ox.a.b.e(java.lang.String, int, int):java.net.InetAddress");
        }

        private static String f(String str) {
            try {
                String lowerCase = IDN.toASCII(str).toLowerCase(Locale.US);
                if (lowerCase.isEmpty()) {
                    return null;
                }
                if (c(lowerCase)) {
                    return null;
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        private static String i(byte[] bArr) {
            int i11 = 0;
            int i12 = -1;
            int i13 = 0;
            int i14 = 0;
            while (i13 < bArr.length) {
                int i15 = i13;
                while (i15 < 16 && bArr[i15] == 0 && bArr[i15 + 1] == 0) {
                    i15 += 2;
                }
                int i16 = i15 - i13;
                if (i16 > i14) {
                    i12 = i13;
                    i14 = i16;
                }
                i13 = i15 + 2;
            }
            f fVar = new f();
            while (i11 < bArr.length) {
                if (i11 == i12) {
                    fVar.O0(58);
                    i11 += i14;
                    if (i11 == 16) {
                        fVar.O0(58);
                    }
                } else {
                    if (i11 > 0) {
                        fVar.O0(58);
                    }
                    fVar.i1(((bArr[i11] & 255) << 8) | (bArr[i11 + 1] & 255));
                    i11 += 2;
                }
            }
            return fVar.G0();
        }

        public a a() {
            if (this.f45195a != null) {
                if (this.f45196b != null) {
                    return new a(this);
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        int g() {
            int i11 = this.f45197c;
            return i11 != -1 ? i11 : a.b(this.f45195a);
        }

        public b h(String str) {
            if (str != null) {
                String b11 = b(str, 0, str.length());
                if (b11 != null) {
                    this.f45196b = b11;
                    return this;
                }
                throw new IllegalArgumentException("unexpected host: " + str);
            }
            throw new IllegalArgumentException("host == null");
        }

        public b j(int i11) {
            if (i11 > 0 && i11 <= 65535) {
                this.f45197c = i11;
                return this;
            }
            throw new IllegalArgumentException("unexpected port: " + i11);
        }

        public b k(String str) {
            if (str != null) {
                if (str.equalsIgnoreCase("http")) {
                    this.f45195a = "http";
                } else if (str.equalsIgnoreCase("https")) {
                    this.f45195a = "https";
                } else {
                    throw new IllegalArgumentException("unexpected scheme: " + str);
                }
                return this;
            }
            throw new IllegalArgumentException("scheme == null");
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f45195a);
            sb2.append("://");
            if (this.f45196b.indexOf(58) != -1) {
                sb2.append('[');
                sb2.append(this.f45196b);
                sb2.append(']');
            } else {
                sb2.append(this.f45196b);
            }
            int g11 = g();
            if (g11 != a.b(this.f45195a)) {
                sb2.append(CoreConstants.COLON_CHAR);
                sb2.append(g11);
            }
            return sb2.toString();
        }
    }

    static int a(char c11) {
        if (c11 < '0' || c11 > '9') {
            char c12 = 'a';
            if (c11 < 'a' || c11 > 'f') {
                c12 = 'A';
                if (c11 < 'A' || c11 > 'F') {
                    return -1;
                }
            }
            return (c11 - c12) + 10;
        }
        return c11 - '0';
    }

    public static int b(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static String d(String str, int i11, int i12, boolean z11) {
        for (int i13 = i11; i13 < i12; i13++) {
            char charAt = str.charAt(i13);
            if (charAt == '%' || (charAt == '+' && z11)) {
                f fVar = new f();
                fVar.Z(str, i11, i13);
                e(fVar, str, i13, i12, z11);
                return fVar.G0();
            }
        }
        return str.substring(i11, i12);
    }

    static void e(f fVar, String str, int i11, int i12, boolean z11) {
        int i13;
        while (i11 < i12) {
            int codePointAt = str.codePointAt(i11);
            if (codePointAt == 37 && (i13 = i11 + 2) < i12) {
                int a11 = a(str.charAt(i11 + 1));
                int a12 = a(str.charAt(i13));
                if (a11 != -1 && a12 != -1) {
                    fVar.O0((a11 << 4) + a12);
                    i11 = i13;
                }
                fVar.Q1(codePointAt);
            } else {
                if (codePointAt == 43 && z11) {
                    fVar.O0(32);
                }
                fVar.Q1(codePointAt);
            }
            i11 += Character.charCount(codePointAt);
        }
    }

    public String c() {
        return this.f45192a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof a) && ((a) obj).f45194c.equals(this.f45194c);
    }

    public int f() {
        return this.f45193b;
    }

    public int hashCode() {
        return this.f45194c.hashCode();
    }

    public String toString() {
        return this.f45194c;
    }

    private a(b bVar) {
        String str = bVar.f45195a;
        this.f45192a = bVar.f45196b;
        this.f45193b = bVar.g();
        this.f45194c = bVar.toString();
    }
}