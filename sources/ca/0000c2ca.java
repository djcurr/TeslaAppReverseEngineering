package yo;

import yo.e;

/* loaded from: classes2.dex */
final class b {

    /* renamed from: a  reason: collision with root package name */
    private final int f59650a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f59651b;

    private b(int i11, byte[] bArr) {
        this.f59650a = i11;
        this.f59651b = bArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static b[] b(byte[] bArr, e eVar) {
        e.c d11 = eVar.d();
        e.b[] a11 = d11.a();
        int i11 = 0;
        for (e.b bVar : a11) {
            i11 += bVar.a();
        }
        b[] bVarArr = new b[i11];
        int i12 = 0;
        for (e.b bVar2 : a11) {
            int i13 = 0;
            while (i13 < bVar2.a()) {
                int b11 = bVar2.b();
                bVarArr[i12] = new b(b11, new byte[d11.b() + b11]);
                i13++;
                i12++;
            }
        }
        int length = bVarArr[0].f59651b.length - d11.b();
        int i14 = length - 1;
        int i15 = 0;
        for (int i16 = 0; i16 < i14; i16++) {
            int i17 = 0;
            while (i17 < i12) {
                bVarArr[i17].f59651b[i16] = bArr[i15];
                i17++;
                i15++;
            }
        }
        boolean z11 = eVar.i() == 24;
        int i18 = z11 ? 8 : i12;
        int i19 = 0;
        while (i19 < i18) {
            bVarArr[i19].f59651b[i14] = bArr[i15];
            i19++;
            i15++;
        }
        int length2 = bVarArr[0].f59651b.length;
        while (length < length2) {
            int i21 = 0;
            while (i21 < i12) {
                int i22 = z11 ? (i21 + 8) % i12 : i21;
                bVarArr[i22].f59651b[(!z11 || i22 <= 7) ? length : length - 1] = bArr[i15];
                i21++;
                i15++;
            }
            length++;
        }
        if (i15 == bArr.length) {
            return bVarArr;
        }
        throw new IllegalArgumentException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public byte[] a() {
        return this.f59651b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        return this.f59650a;
    }
}