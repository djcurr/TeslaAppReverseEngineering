package cp;

/* loaded from: classes2.dex */
public final class f extends p {

    /* renamed from: h  reason: collision with root package name */
    private final int[] f23026h = new int[4];

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // cp.p
    public int k(uo.a aVar, int[] iArr, StringBuilder sb2) {
        int[] iArr2 = this.f23026h;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int g11 = aVar.g();
        int i11 = iArr[1];
        for (int i12 = 0; i12 < 4 && i11 < g11; i12++) {
            sb2.append((char) (p.i(aVar, iArr2, i11, p.f23047f) + 48));
            for (int i13 : iArr2) {
                i11 += i13;
            }
        }
        int i14 = p.m(aVar, i11, true, p.f23046e)[1];
        for (int i15 = 0; i15 < 4 && i14 < g11; i15++) {
            sb2.append((char) (p.i(aVar, iArr2, i14, p.f23047f) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // cp.p
    com.google.zxing.a p() {
        return com.google.zxing.a.EAN_8;
    }
}