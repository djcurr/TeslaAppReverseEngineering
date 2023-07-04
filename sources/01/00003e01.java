package com.google.zxing;

/* loaded from: classes2.dex */
public final class e extends f {

    /* renamed from: c  reason: collision with root package name */
    private final f f17421c;

    public e(f fVar) {
        super(fVar.d(), fVar.a());
        this.f17421c = fVar;
    }

    @Override // com.google.zxing.f
    public byte[] b() {
        byte[] b11 = this.f17421c.b();
        int d11 = d() * a();
        byte[] bArr = new byte[d11];
        for (int i11 = 0; i11 < d11; i11++) {
            bArr[i11] = (byte) (255 - (b11[i11] & 255));
        }
        return bArr;
    }

    @Override // com.google.zxing.f
    public byte[] c(int i11, byte[] bArr) {
        byte[] c11 = this.f17421c.c(i11, bArr);
        int d11 = d();
        for (int i12 = 0; i12 < d11; i12++) {
            c11[i12] = (byte) (255 - (c11[i12] & 255));
        }
        return c11;
    }

    @Override // com.google.zxing.f
    public boolean f() {
        return this.f17421c.f();
    }

    @Override // com.google.zxing.f
    public f g() {
        return new e(this.f17421c.g());
    }
}