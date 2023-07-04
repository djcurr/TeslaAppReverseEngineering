package cp;

import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
public final class e extends p {

    /* renamed from: i  reason: collision with root package name */
    static final int[] f23024i = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* renamed from: h  reason: collision with root package name */
    private final int[] f23025h = new int[4];

    private static void r(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 < 10; i12++) {
            if (i11 == f23024i[i12]) {
                sb2.insert(0, (char) (i12 + 48));
                return;
            }
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cp.p
    public int k(uo.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f23025h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g11 = aVar.g();
        int i11 = iArr[1];
        int i12 = 0;
        for (int i13 = 0; i13 < 6 && i11 < g11; i13++) {
            int i14 = p.i(aVar, iArr2, i11, p.f23048g);
            sb2.append((char) ((i14 % 10) + 48));
            for (int i15 : iArr2) {
                i11 += i15;
            }
            if (i14 >= 10) {
                i12 |= 1 << (5 - i13);
            }
        }
        r(sb2, i12);
        int i16 = p.m(aVar, i11, true, p.f23046e)[1];
        for (int i17 = 0; i17 < 6 && i16 < g11; i17++) {
            sb2.append((char) (p.i(aVar, iArr2, i16, p.f23047f) + 48));
            for (int i18 : iArr2) {
                i16 += i18;
            }
        }
        return i16;
    }

    @Override // cp.p
    com.google.zxing.a p() {
        return com.google.zxing.a.EAN_13;
    }
}