package q70;

/* loaded from: classes5.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    private int f48020a;

    /* renamed from: b  reason: collision with root package name */
    private int f48021b;

    public b(byte[] bArr) {
        this.f48020a = 0;
        if (bArr.length != 4) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        int d11 = f.d(bArr);
        this.f48021b = d11;
        if (!j.c(d11)) {
            throw new IllegalArgumentException("byte array is not an encoded finite field");
        }
        this.f48020a = j.a(this.f48021b);
    }

    private static String i(int i11) {
        if (i11 == 0) {
            return "0";
        }
        String str = ((byte) (i11 & 1)) == 1 ? "1" : "";
        int i12 = i11 >>> 1;
        int i13 = 1;
        while (i12 != 0) {
            if (((byte) (i12 & 1)) == 1) {
                str = str + "+x^" + i13;
            }
            i12 >>>= 1;
            i13++;
        }
        return str;
    }

    public int a(int i11, int i12) {
        return i11 ^ i12;
    }

    public String b(int i11) {
        StringBuilder sb2;
        String str;
        String str2 = "";
        for (int i12 = 0; i12 < this.f48020a; i12++) {
            if ((((byte) i11) & 1) == 0) {
                sb2 = new StringBuilder();
                str = "0";
            } else {
                sb2 = new StringBuilder();
                str = "1";
            }
            sb2.append(str);
            sb2.append(str2);
            str2 = sb2.toString();
            i11 >>>= 1;
        }
        return str2;
    }

    public int c(int i11, int i12) {
        if (i12 == 0) {
            return 1;
        }
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i12 < 0) {
            i11 = f(i11);
            i12 = -i12;
        }
        int i13 = 1;
        while (i12 != 0) {
            if ((i12 & 1) == 1) {
                i13 = h(i13, i11);
            }
            i11 = h(i11, i11);
            i12 >>>= 1;
        }
        return i13;
    }

    public int d() {
        return this.f48020a;
    }

    public byte[] e() {
        return f.c(this.f48021b);
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof b)) {
            b bVar = (b) obj;
            if (this.f48020a == bVar.f48020a && this.f48021b == bVar.f48021b) {
                return true;
            }
        }
        return false;
    }

    public int f(int i11) {
        return c(i11, (1 << this.f48020a) - 2);
    }

    public boolean g(int i11) {
        int i12 = this.f48020a;
        return i12 == 31 ? i11 >= 0 : i11 >= 0 && i11 < (1 << i12);
    }

    public int h(int i11, int i12) {
        return j.d(i11, i12, this.f48021b);
    }

    public int hashCode() {
        return this.f48021b;
    }

    public String toString() {
        return "Finite Field GF(2^" + this.f48020a + ") = GF(2)[X]/<" + i(this.f48021b) + "> ";
    }
}