package com.facebook.soloader;

import ch.qos.logback.core.CoreConstants;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int f12923a = 3;

    /* renamed from: b  reason: collision with root package name */
    private static final int f12924b = 3;

    /* renamed from: c  reason: collision with root package name */
    private static final int f12925c = 3 + 3;

    /* renamed from: d  reason: collision with root package name */
    private static boolean f12926d = false;

    /* renamed from: e  reason: collision with root package name */
    private static byte[] f12927e;

    /* renamed from: f  reason: collision with root package name */
    private static List<Integer> f12928f;

    /* renamed from: g  reason: collision with root package name */
    private static Map<Integer, List<Integer>> f12929g;

    public static String[] a(String str, f fVar) {
        String[] g11;
        return (f12929g == null || (g11 = g(str)) == null) ? m.a(fVar) : g11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003d, code lost:
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String[] b(int r6, int r7) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            int r6 = r6 + r7
            int r7 = com.facebook.soloader.n.f12925c
            int r6 = r6 - r7
            r7 = 0
            r1 = r7
            r2 = r1
        Lc:
            byte[] r3 = com.facebook.soloader.n.f12927e
            int r4 = r3.length
            r5 = 0
            if (r6 >= r4) goto L3e
            r3 = r3[r6]
            r4 = 10
            if (r3 == r4) goto L3e
            r4 = 32
            if (r3 != r4) goto L2b
            if (r2 == 0) goto L3a
            java.lang.String r1 = c(r1)
            if (r1 != 0) goto L25
            return r5
        L25:
            r0.add(r1)
            r1 = r7
            r2 = r1
            goto L3a
        L2b:
            r2 = 48
            if (r3 < r2) goto L3d
            r2 = 57
            if (r3 <= r2) goto L34
            goto L3d
        L34:
            int r1 = r1 * 10
            int r3 = r3 + (-48)
            int r1 = r1 + r3
            r2 = 1
        L3a:
            int r6 = r6 + 1
            goto Lc
        L3d:
            return r5
        L3e:
            if (r2 == 0) goto L4a
            java.lang.String r6 = c(r1)
            if (r6 != 0) goto L47
            return r5
        L47:
            r0.add(r6)
        L4a:
            int r6 = r0.size()
            if (r6 != 0) goto L51
            return r5
        L51:
            int r6 = r0.size()
            java.lang.String[] r6 = new java.lang.String[r6]
            java.lang.Object[] r6 = r0.toArray(r6)
            java.lang.String[] r6 = (java.lang.String[]) r6
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.n.b(int, int):java.lang.String[]");
    }

    private static String c(int i11) {
        if (i11 >= f12928f.size()) {
            return null;
        }
        int intValue = f12928f.get(i11).intValue();
        int i12 = intValue;
        while (true) {
            byte[] bArr = f12927e;
            if (i12 >= bArr.length || bArr[i12] <= 32) {
                break;
            }
            i12++;
        }
        int i13 = (i12 - intValue) + f12925c;
        char[] cArr = new char[i13];
        cArr[0] = 'l';
        cArr[1] = 'i';
        cArr[2] = 'b';
        for (int i14 = 0; i14 < i13 - f12925c; i14++) {
            cArr[f12923a + i14] = (char) f12927e[intValue + i14];
        }
        cArr[i13 - 3] = CoreConstants.DOT;
        cArr[i13 - 2] = 's';
        cArr[i13 - 1] = 'o';
        return new String(cArr);
    }

    private static int d(String str) {
        List<Integer> list = f12929g.get(Integer.valueOf(e(str)));
        if (list == null) {
            return -1;
        }
        for (Integer num : list) {
            int intValue = num.intValue();
            if (f(str, intValue)) {
                return intValue;
            }
        }
        return -1;
    }

    private static int e(String str) {
        int i11 = 5381;
        for (int i12 = f12923a; i12 < str.length() - f12924b; i12++) {
            i11 = str.codePointAt(i12) + (i11 << 5) + i11;
        }
        return i11;
    }

    private static boolean f(String str, int i11) {
        int i12;
        int i13 = f12923a;
        while (true) {
            int length = str.length();
            i12 = f12924b;
            if (i13 >= length - i12 || i11 >= f12927e.length || (str.codePointAt(i13) & 255) != f12927e[i11]) {
                break;
            }
            i13++;
            i11++;
        }
        return i13 == str.length() - i12;
    }

    static String[] g(String str) {
        int d11;
        if (f12926d && str.length() > f12925c && (d11 = d(str)) != -1) {
            return b(d11, str.length());
        }
        return null;
    }
}