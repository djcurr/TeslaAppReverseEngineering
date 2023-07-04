package r70;

import i50.c0;

/* loaded from: classes5.dex */
public class d {

    /* renamed from: b  reason: collision with root package name */
    private static char[] f49300b = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f49301a;

    public d(byte[] bArr) {
        this(bArr, 160);
    }

    public d(byte[] bArr, int i11) {
        this.f49301a = a(bArr, i11);
    }

    public static byte[] a(byte[] bArr, int i11) {
        if (i11 % 8 == 0) {
            c0 c0Var = new c0(256);
            c0Var.update(bArr, 0, bArr.length);
            int i12 = i11 / 8;
            byte[] bArr2 = new byte[i12];
            c0Var.doFinal(bArr2, 0, i12);
            return bArr2;
        }
        throw new IllegalArgumentException("bitLength must be a multiple of 8");
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            return org.bouncycastle.util.a.c(((d) obj).f49301a, this.f49301a);
        }
        return false;
    }

    public int hashCode() {
        return org.bouncycastle.util.a.F(this.f49301a);
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i11 = 0; i11 != this.f49301a.length; i11++) {
            if (i11 > 0) {
                stringBuffer.append(":");
            }
            stringBuffer.append(f49300b[(this.f49301a[i11] >>> 4) & 15]);
            stringBuffer.append(f49300b[this.f49301a[i11] & 15]);
        }
        return stringBuffer.toString();
    }
}