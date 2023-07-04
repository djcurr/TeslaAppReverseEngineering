package g50;

import java.math.BigInteger;
import u50.d0;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class d implements org.bouncycastle.crypto.d {

    /* renamed from: a  reason: collision with root package name */
    d0 f27780a;

    @Override // org.bouncycastle.crypto.d
    public BigInteger a(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b11 = this.f27780a.b();
        if (b11.equals(e0Var.b())) {
            BigInteger mod = b11.c().multiply(this.f27780a.c()).mod(b11.e());
            n60.i a11 = n60.c.a(b11.a(), e0Var.c());
            if (a11.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDHC");
            }
            n60.i A = a11.y(mod).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDHC");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECDHC public key has wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public int getFieldSize() {
        return (this.f27780a.b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27780a = (d0) iVar;
    }
}