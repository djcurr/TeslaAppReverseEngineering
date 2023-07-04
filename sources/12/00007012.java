package g50;

import java.math.BigInteger;
import u50.d0;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class c implements org.bouncycastle.crypto.d {

    /* renamed from: a  reason: collision with root package name */
    private d0 f27779a;

    @Override // org.bouncycastle.crypto.d
    public BigInteger a(org.bouncycastle.crypto.i iVar) {
        e0 e0Var = (e0) iVar;
        y b11 = this.f27779a.b();
        if (b11.equals(e0Var.b())) {
            BigInteger c11 = this.f27779a.c();
            n60.i a11 = n60.c.a(b11.a(), e0Var.c());
            if (a11.u()) {
                throw new IllegalStateException("Infinity is not a valid public key for ECDH");
            }
            BigInteger c12 = b11.c();
            if (!c12.equals(n60.d.f40585b)) {
                c11 = b11.d().multiply(c11).mod(b11.e());
                a11 = n60.c.q(a11, c12);
            }
            n60.i A = a11.y(c11).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for ECDH");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECDH public key has wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public int getFieldSize() {
        return (this.f27779a.b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27779a = (d0) iVar;
    }
}