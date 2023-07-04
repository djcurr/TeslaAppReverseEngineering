package okhttp3.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.s;
import kotlin.text.w;
import okio.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\u001a\f\u0010\u0001\u001a\u0004\u0018\u00010\u0000*\u00020\u0000\u001a\f\u0010\u0003\u001a\u00020\u0002*\u00020\u0000H\u0002\u001a\"\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002\u001a0\u0010\r\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002\u001a\u0010\u0010\u000e\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nH\u0002¨\u0006\u000f"}, d2 = {"", "toCanonicalHost", "", "containsInvalidHostnameAsciiCodes", "input", "", "pos", "limit", "Ljava/net/InetAddress;", "decodeIpv6", "", "address", "addressOffset", "decodeIpv4Suffix", "inet6AddressToAscii", "okhttp"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes5.dex */
public final class HostnamesKt {
    private static final boolean containsInvalidHostnameAsciiCodes(String str) {
        int Y;
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            char charAt = str.charAt(i11);
            if (s.i(charAt, 31) <= 0 || s.i(charAt, 127) >= 0) {
                return true;
            }
            Y = w.Y(" #%/:?@[\\]", charAt, 0, false, 6, null);
            if (Y != -1) {
                return true;
            }
        }
        return false;
    }

    private static final boolean decodeIpv4Suffix(String str, int i11, int i12, byte[] bArr, int i13) {
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
                if (s.i(charAt, 48) < 0 || s.i(charAt, 57) > 0) {
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

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0097, code lost:
        if (r13 == 16) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r14 != (-1)) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x009b, code lost:
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x009c, code lost:
        r0 = r13 - r14;
        java.lang.System.arraycopy(r9, r14, r9, 16 - r0, r0);
        java.util.Arrays.fill(r9, r14, (16 - r13) + r14, (byte) 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00ae, code lost:
        return java.net.InetAddress.getByAddress(r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final java.net.InetAddress decodeIpv6(java.lang.String r18, int r19, int r20) {
        /*
            Method dump skipped, instructions count: 175
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.decodeIpv6(java.lang.String, int, int):java.net.InetAddress");
    }

    private static final String inet6AddressToAscii(byte[] bArr) {
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
            if (i16 > i14 && i16 >= 4) {
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
                fVar.i1((Util.and(bArr[i11], 255) << 8) | Util.and(bArr[i11 + 1], 255));
                i11 += 2;
            }
        }
        return fVar.G0();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.String toCanonicalHost(java.lang.String r5) {
        /*
            java.lang.String r0 = "$this$toCanonicalHost"
            kotlin.jvm.internal.s.g(r5, r0)
            java.lang.String r0 = ":"
            r1 = 0
            r2 = 2
            r3 = 0
            boolean r0 = kotlin.text.m.M(r5, r0, r1, r2, r3)
            r4 = 1
            if (r0 == 0) goto L6e
            java.lang.String r0 = "["
            boolean r0 = kotlin.text.m.H(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            java.lang.String r0 = "]"
            boolean r0 = kotlin.text.m.t(r5, r0, r1, r2, r3)
            if (r0 == 0) goto L2b
            int r0 = r5.length()
            int r0 = r0 - r4
            java.net.InetAddress r0 = decodeIpv6(r5, r4, r0)
            goto L33
        L2b:
            int r0 = r5.length()
            java.net.InetAddress r0 = decodeIpv6(r5, r1, r0)
        L33:
            if (r0 == 0) goto L6d
            byte[] r1 = r0.getAddress()
            int r2 = r1.length
            r3 = 16
            if (r2 != r3) goto L48
            java.lang.String r5 = "address"
            kotlin.jvm.internal.s.f(r1, r5)
            java.lang.String r5 = inet6AddressToAscii(r1)
            return r5
        L48:
            int r1 = r1.length
            r2 = 4
            if (r1 != r2) goto L51
            java.lang.String r5 = r0.getHostAddress()
            return r5
        L51:
            java.lang.AssertionError r0 = new java.lang.AssertionError
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Invalid IPv6 address: '"
            r1.append(r2)
            r1.append(r5)
            r5 = 39
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            r0.<init>(r5)
            throw r0
        L6d:
            return r3
        L6e:
            java.lang.String r5 = java.net.IDN.toASCII(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "IDN.toASCII(host)"
            kotlin.jvm.internal.s.f(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.util.Locale r0 = java.util.Locale.US     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r2 = "Locale.US"
            kotlin.jvm.internal.s.f(r0, r2)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r5 == 0) goto L9c
            java.lang.String r5 = r5.toLowerCase(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "(this as java.lang.String).toLowerCase(locale)"
            kotlin.jvm.internal.s.f(r5, r0)     // Catch: java.lang.IllegalArgumentException -> La4
            int r0 = r5.length()     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 != 0) goto L90
            r1 = r4
        L90:
            if (r1 == 0) goto L93
            return r3
        L93:
            boolean r0 = containsInvalidHostnameAsciiCodes(r5)     // Catch: java.lang.IllegalArgumentException -> La4
            if (r0 == 0) goto L9a
            goto L9b
        L9a:
            r3 = r5
        L9b:
            return r3
        L9c:
            java.lang.NullPointerException r5 = new java.lang.NullPointerException     // Catch: java.lang.IllegalArgumentException -> La4
            java.lang.String r0 = "null cannot be cast to non-null type java.lang.String"
            r5.<init>(r0)     // Catch: java.lang.IllegalArgumentException -> La4
            throw r5     // Catch: java.lang.IllegalArgumentException -> La4
        La4:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.HostnamesKt.toCanonicalHost(java.lang.String):java.lang.String");
    }
}