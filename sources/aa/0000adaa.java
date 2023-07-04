package q70;

import org.slf4j.Marker;

/* loaded from: classes5.dex */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private b f48025a;

    /* renamed from: b  reason: collision with root package name */
    private int f48026b;

    /* renamed from: c  reason: collision with root package name */
    private int[] f48027c;

    public i(b bVar, int i11) {
        this.f48025a = bVar;
        this.f48026b = i11;
        int[] iArr = new int[i11 + 1];
        this.f48027c = iArr;
        iArr[i11] = 1;
    }

    public i(b bVar, byte[] bArr) {
        this.f48025a = bVar;
        int i11 = 8;
        int i12 = 1;
        while (bVar.d() > i11) {
            i12++;
            i11 += 8;
        }
        if (bArr.length % i12 != 0) {
            throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
        }
        this.f48027c = new int[bArr.length / i12];
        int i13 = 0;
        int i14 = 0;
        while (true) {
            int[] iArr = this.f48027c;
            if (i13 >= iArr.length) {
                if (iArr.length != 1 && iArr[iArr.length - 1] == 0) {
                    throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
                }
                d();
                return;
            }
            int i15 = 0;
            while (i15 < i11) {
                int[] iArr2 = this.f48027c;
                iArr2[i13] = ((bArr[i14] & 255) << i15) ^ iArr2[i13];
                i15 += 8;
                i14++;
            }
            if (!this.f48025a.g(this.f48027c[i13])) {
                throw new IllegalArgumentException(" Error: byte array is not encoded polynomial over given finite field GF2m");
            }
            i13++;
        }
    }

    public i(b bVar, int[] iArr) {
        this.f48025a = bVar;
        this.f48027c = q(iArr);
        d();
    }

    public i(i iVar) {
        this.f48025a = iVar.f48025a;
        this.f48026b = iVar.f48026b;
        this.f48027c = d.a(iVar.f48027c);
    }

    private int[] a(int[] iArr, int[] iArr2) {
        int[] iArr3;
        if (iArr.length < iArr2.length) {
            iArr3 = new int[iArr2.length];
            System.arraycopy(iArr2, 0, iArr3, 0, iArr2.length);
        } else {
            iArr3 = new int[iArr.length];
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            iArr = iArr2;
        }
        for (int length = iArr.length - 1; length >= 0; length--) {
            iArr3[length] = this.f48025a.a(iArr3[length], iArr[length]);
        }
        return iArr3;
    }

    private static int c(int[] iArr) {
        int length = iArr.length - 1;
        while (length >= 0 && iArr[length] == 0) {
            length--;
        }
        return length;
    }

    private void d() {
        int length = this.f48027c.length;
        do {
            this.f48026b = length - 1;
            length = this.f48026b;
            if (length < 0) {
                return;
            }
        } while (this.f48027c[length] == 0);
    }

    private static int i(int[] iArr) {
        int c11 = c(iArr);
        if (c11 == -1) {
            return 0;
        }
        return iArr[c11];
    }

    private static boolean j(int[] iArr, int[] iArr2) {
        int c11 = c(iArr);
        if (c11 != c(iArr2)) {
            return false;
        }
        for (int i11 = 0; i11 <= c11; i11++) {
            if (iArr[i11] != iArr2[i11]) {
                return false;
            }
        }
        return true;
    }

    private int[] l(int[] iArr, int[] iArr2) {
        int c11 = c(iArr2);
        if (c11 != -1) {
            int length = iArr.length;
            int[] iArr3 = new int[length];
            int f11 = this.f48025a.f(i(iArr2));
            System.arraycopy(iArr, 0, iArr3, 0, length);
            while (c11 <= c(iArr3)) {
                iArr3 = a(o(p(iArr2, c(iArr3) - c11), this.f48025a.h(i(iArr3), f11)), iArr3);
            }
            return iArr3;
        }
        throw new ArithmeticException("Division by zero");
    }

    private int[] o(int[] iArr, int i11) {
        int c11 = c(iArr);
        if (c11 == -1 || i11 == 0) {
            return new int[1];
        }
        if (i11 == 1) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[c11 + 1];
        while (c11 >= 0) {
            iArr2[c11] = this.f48025a.h(iArr[c11], i11);
            c11--;
        }
        return iArr2;
    }

    private static int[] p(int[] iArr, int i11) {
        int c11 = c(iArr);
        if (c11 == -1) {
            return new int[1];
        }
        int[] iArr2 = new int[c11 + i11 + 1];
        System.arraycopy(iArr, 0, iArr2, i11, c11 + 1);
        return iArr2;
    }

    private static int[] q(int[] iArr) {
        int c11 = c(iArr);
        if (c11 == -1) {
            return new int[1];
        }
        int i11 = c11 + 1;
        if (iArr.length == i11) {
            return d.a(iArr);
        }
        int[] iArr2 = new int[i11];
        System.arraycopy(iArr, 0, iArr2, 0, i11);
        return iArr2;
    }

    public void b(i iVar) {
        this.f48027c = a(this.f48027c, iVar.f48027c);
        d();
    }

    public int e(int i11) {
        int[] iArr = this.f48027c;
        int i12 = this.f48026b;
        int i13 = iArr[i12];
        for (int i14 = i12 - 1; i14 >= 0; i14--) {
            i13 = this.f48025a.h(i13, i11) ^ this.f48027c[i14];
        }
        return i13;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof i)) {
            i iVar = (i) obj;
            if (this.f48025a.equals(iVar.f48025a) && this.f48026b == iVar.f48026b && j(this.f48027c, iVar.f48027c)) {
                return true;
            }
        }
        return false;
    }

    public int f(int i11) {
        if (i11 < 0 || i11 > this.f48026b) {
            return 0;
        }
        return this.f48027c[i11];
    }

    public int g() {
        int[] iArr = this.f48027c;
        int length = iArr.length - 1;
        if (iArr[length] == 0) {
            return -1;
        }
        return length;
    }

    public byte[] h() {
        int i11 = 8;
        int i12 = 1;
        while (this.f48025a.d() > i11) {
            i12++;
            i11 += 8;
        }
        byte[] bArr = new byte[this.f48027c.length * i12];
        int i13 = 0;
        for (int i14 = 0; i14 < this.f48027c.length; i14++) {
            int i15 = 0;
            while (i15 < i11) {
                bArr[i13] = (byte) (this.f48027c[i14] >>> i15);
                i15 += 8;
                i13++;
            }
        }
        return bArr;
    }

    public int hashCode() {
        int hashCode = this.f48025a.hashCode();
        int i11 = 0;
        while (true) {
            int[] iArr = this.f48027c;
            if (i11 >= iArr.length) {
                return hashCode;
            }
            hashCode = (hashCode * 31) + iArr[i11];
            i11++;
        }
    }

    public i k(i iVar) {
        return new i(this.f48025a, l(this.f48027c, iVar.f48027c));
    }

    public void m(int i11) {
        if (!this.f48025a.g(i11)) {
            throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
        }
        this.f48027c = o(this.f48027c, i11);
        d();
    }

    public i n(int i11) {
        if (this.f48025a.g(i11)) {
            return new i(this.f48025a, o(this.f48027c, i11));
        }
        throw new ArithmeticException("Not an element of the finite field this polynomial is defined over.");
    }

    public String toString() {
        String str = " Polynomial over " + this.f48025a.toString() + ": \n";
        for (int i11 = 0; i11 < this.f48027c.length; i11++) {
            str = str + this.f48025a.b(this.f48027c[i11]) + "Y^" + i11 + Marker.ANY_NON_NULL_MARKER;
        }
        return str + ";";
    }
}