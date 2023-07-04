package p50;

import i50.f0;
import org.bouncycastle.crypto.v;
import u50.b1;
import u50.p1;

/* loaded from: classes5.dex */
public class o implements v {

    /* renamed from: a  reason: collision with root package name */
    private f0 f46307a;

    public o(int i11, int i12) {
        this.f46307a = new f0(i11, i12);
    }

    @Override // org.bouncycastle.crypto.v
    public int doFinal(byte[] bArr, int i11) {
        return this.f46307a.f(bArr, i11);
    }

    @Override // org.bouncycastle.crypto.v
    public String getAlgorithmName() {
        return "Skein-MAC-" + (this.f46307a.g() * 8) + "-" + (this.f46307a.h() * 8);
    }

    @Override // org.bouncycastle.crypto.v
    public int getMacSize() {
        return this.f46307a.h();
    }

    @Override // org.bouncycastle.crypto.v
    public void init(org.bouncycastle.crypto.i iVar) {
        p1 a11;
        if (iVar instanceof p1) {
            a11 = (p1) iVar;
        } else if (!(iVar instanceof b1)) {
            throw new IllegalArgumentException("Invalid parameter passed to Skein MAC init - " + iVar.getClass().getName());
        } else {
            a11 = new p1.b().c(((b1) iVar).a()).a();
        }
        if (a11.a() == null) {
            throw new IllegalArgumentException("Skein MAC requires a key parameter.");
        }
        this.f46307a.i(a11);
    }

    @Override // org.bouncycastle.crypto.v
    public void reset() {
        this.f46307a.m();
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte b11) {
        this.f46307a.r(b11);
    }

    @Override // org.bouncycastle.crypto.v
    public void update(byte[] bArr, int i11, int i12) {
        this.f46307a.s(bArr, i11, i12);
    }
}