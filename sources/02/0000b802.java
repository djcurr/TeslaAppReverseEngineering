package uo;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private final byte[] f53617a;

    /* renamed from: b  reason: collision with root package name */
    private int f53618b;

    /* renamed from: c  reason: collision with root package name */
    private int f53619c;

    public c(byte[] bArr) {
        this.f53617a = bArr;
    }

    public int a() {
        return ((this.f53617a.length - this.f53618b) * 8) - this.f53619c;
    }

    public int b() {
        return this.f53619c;
    }

    public int c() {
        return this.f53618b;
    }

    public int d(int i11) {
        if (i11 > 0 && i11 <= 32 && i11 <= a()) {
            int i12 = this.f53619c;
            int i13 = 0;
            if (i12 > 0) {
                int i14 = 8 - i12;
                int i15 = i11 < i14 ? i11 : i14;
                int i16 = i14 - i15;
                byte[] bArr = this.f53617a;
                int i17 = this.f53618b;
                int i18 = (((255 >> (8 - i15)) << i16) & bArr[i17]) >> i16;
                i11 -= i15;
                int i19 = i12 + i15;
                this.f53619c = i19;
                if (i19 == 8) {
                    this.f53619c = 0;
                    this.f53618b = i17 + 1;
                }
                i13 = i18;
            }
            if (i11 > 0) {
                while (i11 >= 8) {
                    int i21 = i13 << 8;
                    byte[] bArr2 = this.f53617a;
                    int i22 = this.f53618b;
                    i13 = (bArr2[i22] & 255) | i21;
                    this.f53618b = i22 + 1;
                    i11 -= 8;
                }
                if (i11 > 0) {
                    int i23 = 8 - i11;
                    int i24 = (i13 << i11) | ((((255 >> i23) << i23) & this.f53617a[this.f53618b]) >> i23);
                    this.f53619c += i11;
                    return i24;
                }
                return i13;
            }
            return i13;
        }
        throw new IllegalArgumentException(String.valueOf(i11));
    }
}