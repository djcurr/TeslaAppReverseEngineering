package com.google.zxing;

/* loaded from: classes2.dex */
public final class h extends f {

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f17426c;

    /* renamed from: d  reason: collision with root package name */
    private final int f17427d;

    /* renamed from: e  reason: collision with root package name */
    private final int f17428e;

    /* renamed from: f  reason: collision with root package name */
    private final int f17429f;

    /* renamed from: g  reason: collision with root package name */
    private final int f17430g;

    public h(byte[] bArr, int i11, int i12, int i13, int i14, int i15, int i16, boolean z11) {
        super(i15, i16);
        if (i13 + i15 <= i11 && i14 + i16 <= i12) {
            this.f17426c = bArr;
            this.f17427d = i11;
            this.f17428e = i12;
            this.f17429f = i13;
            this.f17430g = i14;
            if (z11) {
                h(i15, i16);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
    }

    private void h(int i11, int i12) {
        byte[] bArr = this.f17426c;
        int i13 = (this.f17430g * this.f17427d) + this.f17429f;
        int i14 = 0;
        while (i14 < i12) {
            int i15 = (i11 / 2) + i13;
            int i16 = (i13 + i11) - 1;
            int i17 = i13;
            while (i17 < i15) {
                byte b11 = bArr[i17];
                bArr[i17] = bArr[i16];
                bArr[i16] = b11;
                i17++;
                i16--;
            }
            i14++;
            i13 += this.f17427d;
        }
    }

    @Override // com.google.zxing.f
    public byte[] b() {
        int d11 = d();
        int a11 = a();
        int i11 = this.f17427d;
        if (d11 == i11 && a11 == this.f17428e) {
            return this.f17426c;
        }
        int i12 = d11 * a11;
        byte[] bArr = new byte[i12];
        int i13 = (this.f17430g * i11) + this.f17429f;
        if (d11 == i11) {
            System.arraycopy(this.f17426c, i13, bArr, 0, i12);
            return bArr;
        }
        for (int i14 = 0; i14 < a11; i14++) {
            System.arraycopy(this.f17426c, i13, bArr, i14 * d11, d11);
            i13 += this.f17427d;
        }
        return bArr;
    }

    @Override // com.google.zxing.f
    public byte[] c(int i11, byte[] bArr) {
        if (i11 >= 0 && i11 < a()) {
            int d11 = d();
            if (bArr == null || bArr.length < d11) {
                bArr = new byte[d11];
            }
            System.arraycopy(this.f17426c, ((i11 + this.f17430g) * this.f17427d) + this.f17429f, bArr, 0, d11);
            return bArr;
        }
        throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i11)));
    }
}