package i50;

import u50.p1;

/* loaded from: classes5.dex */
public class e0 implements org.bouncycastle.crypto.r, r70.h {

    /* renamed from: a  reason: collision with root package name */
    private f0 f30000a;

    public e0(int i11, int i12) {
        this.f30000a = new f0(i11, i12);
        b(null);
    }

    public e0(e0 e0Var) {
        this.f30000a = new f0(e0Var.f30000a);
    }

    @Override // r70.h
    public void a(r70.h hVar) {
        this.f30000a.a(((e0) hVar).f30000a);
    }

    public void b(p1 p1Var) {
        this.f30000a.i(p1Var);
    }

    @Override // r70.h
    public r70.h copy() {
        return new e0(this);
    }

    @Override // org.bouncycastle.crypto.p
    public int doFinal(byte[] bArr, int i11) {
        return this.f30000a.f(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.p
    public String getAlgorithmName() {
        return "Skein-" + (this.f30000a.g() * 8) + "-" + (this.f30000a.h() * 8);
    }

    @Override // org.bouncycastle.crypto.r
    public int getByteLength() {
        return this.f30000a.g();
    }

    @Override // org.bouncycastle.crypto.p
    public int getDigestSize() {
        return this.f30000a.h();
    }

    @Override // org.bouncycastle.crypto.p
    public void reset() {
        this.f30000a.m();
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte b11) {
        this.f30000a.r(b11);
    }

    @Override // org.bouncycastle.crypto.p
    public void update(byte[] bArr, int i11, int i12) {
        this.f30000a.s(bArr, i11, i12);
    }
}