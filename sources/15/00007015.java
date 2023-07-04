package g50;

import java.math.BigInteger;
import u50.c1;
import u50.d0;
import u50.d1;
import u50.e0;
import u50.y;

/* loaded from: classes5.dex */
public class f implements org.bouncycastle.crypto.d {

    /* renamed from: a  reason: collision with root package name */
    c1 f27782a;

    private n60.i b(y yVar, d0 d0Var, d0 d0Var2, e0 e0Var, e0 e0Var2, e0 e0Var3) {
        BigInteger e11 = yVar.e();
        int bitLength = (e11.bitLength() + 1) / 2;
        BigInteger shiftLeft = n60.d.f40585b.shiftLeft(bitLength);
        n60.e a11 = yVar.a();
        n60.i a12 = n60.c.a(a11, e0Var.c());
        n60.i a13 = n60.c.a(a11, e0Var2.c());
        n60.i a14 = n60.c.a(a11, e0Var3.c());
        BigInteger mod = d0Var.c().multiply(a12.f().t().mod(shiftLeft).setBit(bitLength)).add(d0Var2.c()).mod(e11);
        BigInteger bit = a14.f().t().mod(shiftLeft).setBit(bitLength);
        BigInteger mod2 = yVar.c().multiply(mod).mod(e11);
        return n60.c.r(a13, bit.multiply(mod2).mod(e11), a14, mod2);
    }

    @Override // org.bouncycastle.crypto.d
    public BigInteger a(org.bouncycastle.crypto.i iVar) {
        if (r70.j.c("org.bouncycastle.ec.disable_mqv")) {
            throw new IllegalStateException("ECMQV explicitly disabled");
        }
        d1 d1Var = (d1) iVar;
        d0 c11 = this.f27782a.c();
        y b11 = c11.b();
        if (b11.equals(d1Var.b().b())) {
            n60.i A = b(b11, c11, this.f27782a.a(), this.f27782a.b(), d1Var.b(), d1Var.a()).A();
            if (A.u()) {
                throw new IllegalStateException("Infinity is not a valid agreement value for MQV");
            }
            return A.f().t();
        }
        throw new IllegalStateException("ECMQV public key components have wrong domain parameters");
    }

    @Override // org.bouncycastle.crypto.d
    public int getFieldSize() {
        return (this.f27782a.c().b().a().t() + 7) / 8;
    }

    @Override // org.bouncycastle.crypto.d
    public void init(org.bouncycastle.crypto.i iVar) {
        this.f27782a = (c1) iVar;
    }
}