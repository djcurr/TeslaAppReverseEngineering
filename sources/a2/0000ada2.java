package q70;

import java.lang.reflect.Array;

/* loaded from: classes5.dex */
public class a extends g {

    /* renamed from: c  reason: collision with root package name */
    private int[][] f48018c;

    /* renamed from: d  reason: collision with root package name */
    private int f48019d;

    public a(int i11, int[][] iArr) {
        if (iArr[0].length != ((i11 + 31) >> 5)) {
            throw new ArithmeticException("Int array does not match given number of columns.");
        }
        this.f48023b = i11;
        this.f48022a = iArr.length;
        this.f48019d = iArr[0].length;
        int i12 = i11 & 31;
        int i13 = i12 == 0 ? -1 : (1 << i12) - 1;
        for (int i14 = 0; i14 < this.f48022a; i14++) {
            int[] iArr2 = iArr[i14];
            int i15 = this.f48019d - 1;
            iArr2[i15] = iArr2[i15] & i13;
        }
        this.f48018c = iArr;
    }

    public a(a aVar) {
        this.f48023b = aVar.a();
        this.f48022a = aVar.b();
        this.f48019d = aVar.f48019d;
        this.f48018c = new int[aVar.f48018c.length];
        int i11 = 0;
        while (true) {
            int[][] iArr = this.f48018c;
            if (i11 >= iArr.length) {
                return;
            }
            iArr[i11] = d.a(aVar.f48018c[i11]);
            i11++;
        }
    }

    public a(byte[] bArr) {
        if (bArr.length < 9) {
            throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
        }
        this.f48022a = f.e(bArr, 0);
        int e11 = f.e(bArr, 4);
        this.f48023b = e11;
        int i11 = this.f48022a;
        int i12 = ((e11 + 7) >>> 3) * i11;
        if (i11 > 0) {
            int i13 = 8;
            if (i12 == bArr.length - 8) {
                int i14 = (e11 + 31) >>> 5;
                this.f48019d = i14;
                this.f48018c = (int[][]) Array.newInstance(int.class, i11, i14);
                int i15 = this.f48023b;
                int i16 = i15 >> 5;
                int i17 = i15 & 31;
                for (int i18 = 0; i18 < this.f48022a; i18++) {
                    int i19 = 0;
                    while (i19 < i16) {
                        this.f48018c[i18][i19] = f.e(bArr, i13);
                        i19++;
                        i13 += 4;
                    }
                    int i21 = 0;
                    while (i21 < i17) {
                        int[] iArr = this.f48018c[i18];
                        iArr[i16] = ((bArr[i13] & 255) << i21) ^ iArr[i16];
                        i21 += 8;
                        i13++;
                    }
                }
                return;
            }
        }
        throw new ArithmeticException("given array is not an encoded matrix over GF(2)");
    }

    public byte[] c() {
        int i11 = this.f48022a;
        int i12 = 8;
        byte[] bArr = new byte[(((this.f48023b + 7) >>> 3) * i11) + 8];
        f.a(i11, bArr, 0);
        f.a(this.f48023b, bArr, 4);
        int i13 = this.f48023b;
        int i14 = i13 >>> 5;
        int i15 = i13 & 31;
        for (int i16 = 0; i16 < this.f48022a; i16++) {
            int i17 = 0;
            while (i17 < i14) {
                f.a(this.f48018c[i16][i17], bArr, i12);
                i17++;
                i12 += 4;
            }
            int i18 = 0;
            while (i18 < i15) {
                bArr[i12] = (byte) ((this.f48018c[i16][i14] >>> i18) & 255);
                i18 += 8;
                i12++;
            }
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof a) {
            a aVar = (a) obj;
            if (this.f48022a == aVar.f48022a && this.f48023b == aVar.f48023b && this.f48019d == aVar.f48019d) {
                for (int i11 = 0; i11 < this.f48022a; i11++) {
                    if (!d.b(this.f48018c[i11], aVar.f48018c[i11])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int i11 = (((this.f48022a * 31) + this.f48023b) * 31) + this.f48019d;
        for (int i12 = 0; i12 < this.f48022a; i12++) {
            i11 = (i11 * 31) + org.bouncycastle.util.a.I(this.f48018c[i12]);
        }
        return i11;
    }

    public String toString() {
        int i11 = this.f48023b & 31;
        int i12 = this.f48019d;
        if (i11 != 0) {
            i12--;
        }
        StringBuffer stringBuffer = new StringBuffer();
        for (int i13 = 0; i13 < this.f48022a; i13++) {
            stringBuffer.append(i13 + ": ");
            for (int i14 = 0; i14 < i12; i14++) {
                int i15 = this.f48018c[i13][i14];
                for (int i16 = 0; i16 < 32; i16++) {
                    if (((i15 >>> i16) & 1) == 0) {
                        stringBuffer.append('0');
                    } else {
                        stringBuffer.append('1');
                    }
                }
                stringBuffer.append(' ');
            }
            int i17 = this.f48018c[i13][this.f48019d - 1];
            for (int i18 = 0; i18 < i11; i18++) {
                if (((i17 >>> i18) & 1) == 0) {
                    stringBuffer.append('0');
                } else {
                    stringBuffer.append('1');
                }
            }
            stringBuffer.append('\n');
        }
        return stringBuffer.toString();
    }
}