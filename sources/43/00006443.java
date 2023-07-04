package cp;

import com.google.zxing.NotFoundException;

/* loaded from: classes2.dex */
public final class q extends p {

    /* renamed from: i  reason: collision with root package name */
    private static final int[] f23052i = {1, 1, 1, 1, 1, 1};

    /* renamed from: j  reason: collision with root package name */
    static final int[][] f23053j = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* renamed from: h  reason: collision with root package name */
    private final int[] f23054h = new int[4];

    public static String r(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c11 = cArr[5];
        switch (c11) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c11);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c11);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    private static void s(StringBuilder sb2, int i11) {
        for (int i12 = 0; i12 <= 1; i12++) {
            for (int i13 = 0; i13 < 10; i13++) {
                if (i11 == f23053j[i12][i13]) {
                    sb2.insert(0, (char) (i12 + 48));
                    sb2.append((char) (i13 + 48));
                    return;
                }
            }
        }
        throw NotFoundException.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cp.p
    public boolean g(String str) {
        return super.g(r(str));
    }

    @Override // cp.p
    protected int[] j(uo.a aVar, int i11) {
        return p.m(aVar, i11, true, f23052i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cp.p
    public int k(uo.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f23054h;
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
        s(sb2, i12);
        return i11;
    }

    @Override // cp.p
    com.google.zxing.a p() {
        return com.google.zxing.a.UPC_E;
    }
}