package cp;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class n {

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f23039c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* renamed from: a  reason: collision with root package name */
    private final int[] f23040a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f23041b = new StringBuilder();

    private int a(uo.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f23040a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g11 = aVar.g();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 5 && i11 < g11; i13++) {
            int i14 = p.i(aVar, iArr2, i11, p.f23048g);
            sb2.append((char) ((i14 % 10) + 48));
            for (int i15 : iArr2) {
                i11 += i15;
            }
            if (i14 >= 10) {
                i12 |= 1 << (4 - i13);
            }
            if (i13 != 4) {
                i11 = aVar.f(aVar.e(i11));
            }
        }
        if (sb2.length() == 5) {
            if (d(sb2.toString()) == c(i12)) {
                return i11;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static int c(int i11) {
        for (int i12 = 0; i12 < 10; i12++) {
            if (i11 == f23039c[i12]) {
                return i12;
            }
        }
        throw NotFoundException.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i11 = 0;
        for (int i12 = length - 2; i12 >= 0; i12 -= 2) {
            i11 += charSequence.charAt(i12) - '0';
        }
        int i13 = i11 * 3;
        for (int i14 = length - 1; i14 >= 0; i14 -= 2) {
            i13 += charSequence.charAt(i14) - '0';
        }
        return (i13 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
        if (r5.equals("90000") == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String e(java.lang.String r5) {
        /*
            r0 = 0
            char r1 = r5.charAt(r0)
            r2 = 48
            java.lang.String r3 = ""
            r4 = 1
            if (r1 == r2) goto L4d
            r2 = 53
            if (r1 == r2) goto L4a
            r2 = 57
            if (r1 == r2) goto L15
            goto L4f
        L15:
            r1 = -1
            int r2 = r5.hashCode()
            switch(r2) {
                case 54118329: goto L35;
                case 54395376: goto L2a;
                case 54395377: goto L1f;
                default: goto L1d;
            }
        L1d:
            r0 = r1
            goto L3e
        L1f:
            java.lang.String r0 = "99991"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L28
            goto L1d
        L28:
            r0 = 2
            goto L3e
        L2a:
            java.lang.String r0 = "99990"
            boolean r0 = r5.equals(r0)
            if (r0 != 0) goto L33
            goto L1d
        L33:
            r0 = r4
            goto L3e
        L35:
            java.lang.String r2 = "90000"
            boolean r2 = r5.equals(r2)
            if (r2 != 0) goto L3e
            goto L1d
        L3e:
            switch(r0) {
                case 0: goto L48;
                case 1: goto L45;
                case 2: goto L42;
                default: goto L41;
            }
        L41:
            goto L4f
        L42:
            java.lang.String r5 = "0.00"
            return r5
        L45:
            java.lang.String r5 = "Used"
            return r5
        L48:
            r5 = 0
            return r5
        L4a:
            java.lang.String r3 = "$"
            goto L4f
        L4d:
            java.lang.String r3 = "£"
        L4f:
            java.lang.String r5 = r5.substring(r4)
            int r5 = java.lang.Integer.parseInt(r5)
            int r0 = r5 / 100
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r5 = r5 % 100
            r1 = 10
            if (r5 >= r1) goto L6e
            java.lang.String r5 = java.lang.String.valueOf(r5)
            java.lang.String r1 = "0"
            java.lang.String r5 = r1.concat(r5)
            goto L72
        L6e:
            java.lang.String r5 = java.lang.String.valueOf(r5)
        L72:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r3)
            r1.append(r0)
            r0 = 46
            r1.append(r0)
            r1.append(r5)
            java.lang.String r5 = r1.toString()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: cp.n.e(java.lang.String):java.lang.String");
    }

    private static Map<com.google.zxing.k, Object> f(String str) {
        String e11;
        if (str.length() == 5 && (e11 = e(str)) != null) {
            EnumMap enumMap = new EnumMap(com.google.zxing.k.class);
            enumMap.put((EnumMap) com.google.zxing.k.SUGGESTED_PRICE, (com.google.zxing.k) e11);
            return enumMap;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.zxing.j b(int i11, uo.a aVar, int[] iArr) {
        StringBuilder sb2 = this.f23041b;
        sb2.setLength(0);
        int a11 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<com.google.zxing.k, Object> f11 = f(sb3);
        float f12 = i11;
        com.google.zxing.j jVar = new com.google.zxing.j(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, f12), new com.google.zxing.l(a11, f12)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (f11 != null) {
            jVar.g(f11);
        }
        return jVar;
    }
}