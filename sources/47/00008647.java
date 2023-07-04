package m50;

import org.bouncycastle.crypto.e;
import org.bouncycastle.crypto.i;
import r70.j;
import u50.q0;

/* loaded from: classes5.dex */
public class b extends a {
    public b(e eVar) {
        super(eVar);
        if (eVar.getBlockSize() != 16) {
            throw new IllegalArgumentException("base cipher needs to be 128 bits");
        }
        if (j.c("org.bouncycastle.fpe.disable") || j.c("org.bouncycastle.fpe.disable_ff1")) {
            throw new UnsupportedOperationException("FF1 encryption disabled");
        }
    }

    @Override // m50.a
    protected int a(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        System.arraycopy(this.f38419c.b() > 256 ? a.f(d.o(this.f38417a, this.f38419c.b(), this.f38419c.c(), a.g(bArr), i11, i12 / 2)) : d.n(this.f38417a, this.f38419c.b(), this.f38419c.c(), bArr, i11, i12), 0, bArr2, i13, i12);
        return i12;
    }

    @Override // m50.a
    protected int b(byte[] bArr, int i11, int i12, byte[] bArr2, int i13) {
        System.arraycopy(this.f38419c.b() > 256 ? a.f(d.u(this.f38417a, this.f38419c.b(), this.f38419c.c(), a.g(bArr), i11, i12 / 2)) : d.t(this.f38417a, this.f38419c.b(), this.f38419c.c(), bArr, i11, i12), 0, bArr2, i13, i12);
        return i12;
    }

    @Override // m50.a
    public String c() {
        return "FF1";
    }

    @Override // m50.a
    public void d(boolean z11, i iVar) {
        this.f38418b = z11;
        q0 q0Var = (q0) iVar;
        this.f38419c = q0Var;
        this.f38417a.init(!q0Var.d(), this.f38419c.a());
    }
}