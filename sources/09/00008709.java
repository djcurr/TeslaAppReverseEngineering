package mq;

import okhttp3.internal.http2.Settings;

/* loaded from: classes2.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    byte[] f38726a;

    /* renamed from: b  reason: collision with root package name */
    int f38727b;

    public d() {
        this.f38726a = new byte[64];
    }

    private void b(int i11) {
        byte[] bArr = this.f38726a;
        int length = bArr.length * 2;
        int i12 = this.f38727b;
        int i13 = i11 + i12;
        if (length <= i13) {
            length = i13;
        }
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, i12);
        this.f38726a = bArr2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d a(String str, int i11, int i12) {
        int i13;
        int length = str.length();
        int i14 = i11;
        int i15 = i14;
        while (i14 < length) {
            char charAt = str.charAt(i14);
            i15 = (charAt < 1 || charAt > 127) ? charAt <= 2047 ? i15 + 2 : i15 + 3 : i15 + 1;
            i14++;
        }
        if (i15 <= i12) {
            int i16 = this.f38727b;
            int i17 = (i16 - i11) - 2;
            if (i17 >= 0) {
                byte[] bArr = this.f38726a;
                bArr[i17] = (byte) (i15 >>> 8);
                bArr[i17 + 1] = (byte) i15;
            }
            if ((i16 + i15) - i11 > this.f38726a.length) {
                b(i15 - i11);
            }
            int i18 = this.f38727b;
            while (i11 < length) {
                char charAt2 = str.charAt(i11);
                if (charAt2 >= 1 && charAt2 <= 127) {
                    i13 = i18 + 1;
                    this.f38726a[i18] = (byte) charAt2;
                } else if (charAt2 <= 2047) {
                    byte[] bArr2 = this.f38726a;
                    int i19 = i18 + 1;
                    bArr2[i18] = (byte) (((charAt2 >> 6) & 31) | 192);
                    i18 = i19 + 1;
                    bArr2[i19] = (byte) ((charAt2 & '?') | 128);
                    i11++;
                } else {
                    byte[] bArr3 = this.f38726a;
                    int i21 = i18 + 1;
                    bArr3[i18] = (byte) (((charAt2 >> '\f') & 15) | 224);
                    int i22 = i21 + 1;
                    bArr3[i21] = (byte) (((charAt2 >> 6) & 63) | 128);
                    i13 = i22 + 1;
                    bArr3[i22] = (byte) ((charAt2 & '?') | 128);
                }
                i18 = i13;
                i11++;
            }
            this.f38727b = i18;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d c(int i11, int i12) {
        int i13 = this.f38727b;
        if (i13 + 2 > this.f38726a.length) {
            b(2);
        }
        byte[] bArr = this.f38726a;
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        bArr[i14] = (byte) i12;
        this.f38727b = i14 + 1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d d(int i11, int i12, int i13) {
        int i14 = this.f38727b;
        if (i14 + 4 > this.f38726a.length) {
            b(4);
        }
        byte[] bArr = this.f38726a;
        int i15 = i14 + 1;
        bArr[i14] = (byte) i11;
        int i16 = i15 + 1;
        bArr[i15] = (byte) i12;
        int i17 = i16 + 1;
        bArr[i16] = (byte) (i13 >>> 8);
        bArr[i17] = (byte) i13;
        this.f38727b = i17 + 1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d e(int i11, int i12) {
        int i13 = this.f38727b;
        if (i13 + 3 > this.f38726a.length) {
            b(3);
        }
        byte[] bArr = this.f38726a;
        int i14 = i13 + 1;
        bArr[i13] = (byte) i11;
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i12 >>> 8);
        bArr[i15] = (byte) i12;
        this.f38727b = i15 + 1;
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final d f(int i11, int i12, int i13) {
        int i14 = this.f38727b;
        if (i14 + 5 > this.f38726a.length) {
            b(5);
        }
        byte[] bArr = this.f38726a;
        int i15 = i14 + 1;
        bArr[i14] = (byte) i11;
        int i16 = i15 + 1;
        bArr[i15] = (byte) (i12 >>> 8);
        int i17 = i16 + 1;
        bArr[i16] = (byte) i12;
        int i18 = i17 + 1;
        bArr[i17] = (byte) (i13 >>> 8);
        bArr[i18] = (byte) i13;
        this.f38727b = i18 + 1;
        return this;
    }

    public d g(int i11) {
        int i12 = this.f38727b;
        int i13 = i12 + 1;
        if (i13 > this.f38726a.length) {
            b(1);
        }
        this.f38726a[i12] = (byte) i11;
        this.f38727b = i13;
        return this;
    }

    public d h(byte[] bArr, int i11, int i12) {
        if (this.f38727b + i12 > this.f38726a.length) {
            b(i12);
        }
        if (bArr != null) {
            System.arraycopy(bArr, i11, this.f38726a, this.f38727b, i12);
        }
        this.f38727b += i12;
        return this;
    }

    public d i(int i11) {
        int i12 = this.f38727b;
        if (i12 + 4 > this.f38726a.length) {
            b(4);
        }
        byte[] bArr = this.f38726a;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i11 >>> 16);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i11 >>> 8);
        bArr[i15] = (byte) i11;
        this.f38727b = i15 + 1;
        return this;
    }

    public d j(long j11) {
        int i11 = this.f38727b;
        if (i11 + 8 > this.f38726a.length) {
            b(8);
        }
        byte[] bArr = this.f38726a;
        int i12 = (int) (j11 >>> 32);
        int i13 = i11 + 1;
        bArr[i11] = (byte) (i12 >>> 24);
        int i14 = i13 + 1;
        bArr[i13] = (byte) (i12 >>> 16);
        int i15 = i14 + 1;
        bArr[i14] = (byte) (i12 >>> 8);
        int i16 = i15 + 1;
        bArr[i15] = (byte) i12;
        int i17 = (int) j11;
        int i18 = i16 + 1;
        bArr[i16] = (byte) (i17 >>> 24);
        int i19 = i18 + 1;
        bArr[i18] = (byte) (i17 >>> 16);
        int i21 = i19 + 1;
        bArr[i19] = (byte) (i17 >>> 8);
        bArr[i21] = (byte) i17;
        this.f38727b = i21 + 1;
        return this;
    }

    public d k(int i11) {
        int i12 = this.f38727b;
        if (i12 + 2 > this.f38726a.length) {
            b(2);
        }
        byte[] bArr = this.f38726a;
        int i13 = i12 + 1;
        bArr[i12] = (byte) (i11 >>> 8);
        bArr[i13] = (byte) i11;
        this.f38727b = i13 + 1;
        return this;
    }

    public d l(String str) {
        int length = str.length();
        if (length <= 65535) {
            int i11 = this.f38727b;
            if (i11 + 2 + length > this.f38726a.length) {
                b(length + 2);
            }
            byte[] bArr = this.f38726a;
            int i12 = i11 + 1;
            bArr[i11] = (byte) (length >>> 8);
            int i13 = i12 + 1;
            bArr[i12] = (byte) length;
            int i14 = 0;
            while (i14 < length) {
                char charAt = str.charAt(i14);
                if (charAt >= 1 && charAt <= 127) {
                    bArr[i13] = (byte) charAt;
                    i14++;
                    i13++;
                } else {
                    this.f38727b = i13;
                    return a(str, i14, Settings.DEFAULT_INITIAL_WINDOW_SIZE);
                }
            }
            this.f38727b = i13;
            return this;
        }
        throw new IllegalArgumentException("UTF8 string too large");
    }

    public d(int i11) {
        this.f38726a = new byte[i11];
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public d(byte[] bArr) {
        this.f38726a = bArr;
        this.f38727b = bArr.length;
    }
}