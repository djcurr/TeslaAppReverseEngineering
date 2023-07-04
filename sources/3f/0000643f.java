package cp;

import com.google.zxing.NotFoundException;
import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes2.dex */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    private final int[] f23037a = new int[4];

    /* renamed from: b  reason: collision with root package name */
    private final StringBuilder f23038b = new StringBuilder();

    private int a(uo.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f23037a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g11 = aVar.g();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 2 && i11 < g11; i13++) {
            int i14 = p.i(aVar, iArr2, i11, p.f23048g);
            sb2.append((char) ((i14 % 10) + 48));
            for (int i15 : iArr2) {
                i11 += i15;
            }
            if (i14 >= 10) {
                i12 |= 1 << (1 - i13);
            }
            if (i13 != 1) {
                i11 = aVar.f(aVar.e(i11));
            }
        }
        if (sb2.length() == 2) {
            if (Integer.parseInt(sb2.toString()) % 4 == i12) {
                return i11;
            }
            throw NotFoundException.a();
        }
        throw NotFoundException.a();
    }

    private static Map<com.google.zxing.k, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.k.class);
        enumMap.put((EnumMap) com.google.zxing.k.ISSUE_NUMBER, (com.google.zxing.k) Integer.valueOf(str));
        return enumMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public com.google.zxing.j b(int i11, uo.a aVar, int[] iArr) {
        StringBuilder sb2 = this.f23038b;
        sb2.setLength(0);
        int a11 = a(aVar, iArr, sb2);
        String sb3 = sb2.toString();
        Map<com.google.zxing.k, Object> c11 = c(sb3);
        float f11 = i11;
        com.google.zxing.j jVar = new com.google.zxing.j(sb3, null, new com.google.zxing.l[]{new com.google.zxing.l((iArr[0] + iArr[1]) / 2.0f, f11), new com.google.zxing.l(a11, f11)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (c11 != null) {
            jVar.g(c11);
        }
        return jVar;
    }
}