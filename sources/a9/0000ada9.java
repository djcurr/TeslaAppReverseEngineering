package q70;

/* loaded from: classes5.dex */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private int[] f48024a;

    public h(byte[] bArr) {
        if (bArr.length <= 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        int e11 = f.e(bArr, 0);
        int a11 = e.a(e11 - 1);
        if (bArr.length != (e11 * a11) + 4) {
            throw new IllegalArgumentException("invalid encoding");
        }
        this.f48024a = new int[e11];
        for (int i11 = 0; i11 < e11; i11++) {
            this.f48024a[i11] = f.f(bArr, (i11 * a11) + 4, a11);
        }
        if (!b(this.f48024a)) {
            throw new IllegalArgumentException("invalid encoding");
        }
    }

    private boolean b(int[] iArr) {
        int length = iArr.length;
        boolean[] zArr = new boolean[length];
        for (int i11 = 0; i11 < length; i11++) {
            if (iArr[i11] < 0 || iArr[i11] >= length || zArr[iArr[i11]]) {
                return false;
            }
            zArr[iArr[i11]] = true;
        }
        return true;
    }

    public byte[] a() {
        int length = this.f48024a.length;
        int a11 = e.a(length - 1);
        byte[] bArr = new byte[(length * a11) + 4];
        f.a(length, bArr, 0);
        for (int i11 = 0; i11 < length; i11++) {
            f.b(this.f48024a[i11], bArr, (i11 * a11) + 4, a11);
        }
        return bArr;
    }

    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return d.b(this.f48024a, ((h) obj).f48024a);
        }
        return false;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.I(this.f48024a);
    }

    public String toString() {
        String str = "[" + this.f48024a[0];
        for (int i11 = 1; i11 < this.f48024a.length; i11++) {
            str = str + ", " + this.f48024a[i11];
        }
        return str + "]";
    }
}