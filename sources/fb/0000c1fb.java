package y50;

import i50.d0;
import java.math.BigInteger;
import org.bouncycastle.crypto.CryptoException;
import org.bouncycastle.crypto.z;
import u50.b0;
import u50.e0;
import u50.e1;
import u50.g1;
import u50.y;

/* loaded from: classes5.dex */
public class r implements z, n60.d {

    /* renamed from: g  reason: collision with root package name */
    private final b f59201g;

    /* renamed from: h  reason: collision with root package name */
    private final org.bouncycastle.crypto.p f59202h;

    /* renamed from: i  reason: collision with root package name */
    private final a f59203i;

    /* renamed from: j  reason: collision with root package name */
    private y f59204j;

    /* renamed from: k  reason: collision with root package name */
    private n60.i f59205k;

    /* renamed from: l  reason: collision with root package name */
    private b0 f59206l;

    /* renamed from: m  reason: collision with root package name */
    private byte[] f59207m;

    public r() {
        this(s.f59208a, new d0());
    }

    public r(org.bouncycastle.crypto.p pVar) {
        this(s.f59208a, pVar);
    }

    public r(a aVar, org.bouncycastle.crypto.p pVar) {
        this.f59201g = new q();
        this.f59203i = aVar;
        this.f59202h = pVar;
    }

    private void a(org.bouncycastle.crypto.p pVar, n60.f fVar) {
        byte[] e11 = fVar.e();
        pVar.update(e11, 0, e11.length);
    }

    private void b(org.bouncycastle.crypto.p pVar, byte[] bArr) {
        int length = bArr.length * 8;
        pVar.update((byte) ((length >> 8) & 255));
        pVar.update((byte) (length & 255));
        pVar.update(bArr, 0, bArr.length);
    }

    private byte[] e() {
        byte[] bArr = new byte[this.f59202h.getDigestSize()];
        this.f59202h.doFinal(bArr, 0);
        g();
        return bArr;
    }

    private byte[] f(byte[] bArr) {
        this.f59202h.reset();
        b(this.f59202h, bArr);
        a(this.f59202h, this.f59204j.a().n());
        a(this.f59202h, this.f59204j.a().o());
        a(this.f59202h, this.f59204j.b().f());
        a(this.f59202h, this.f59204j.b().g());
        a(this.f59202h, this.f59205k.f());
        a(this.f59202h, this.f59205k.g());
        byte[] bArr2 = new byte[this.f59202h.getDigestSize()];
        this.f59202h.doFinal(bArr2, 0);
        return bArr2;
    }

    private boolean h(BigInteger bigInteger, BigInteger bigInteger2) {
        BigInteger e11 = this.f59204j.e();
        BigInteger bigInteger3 = n60.d.f40585b;
        if (bigInteger.compareTo(bigInteger3) < 0 || bigInteger.compareTo(e11) >= 0 || bigInteger2.compareTo(bigInteger3) < 0 || bigInteger2.compareTo(e11) >= 0) {
            return false;
        }
        BigInteger c11 = c(e11, e());
        BigInteger mod = bigInteger.add(bigInteger2).mod(e11);
        if (mod.equals(n60.d.f40584a)) {
            return false;
        }
        n60.i A = n60.c.r(this.f59204j.b(), bigInteger2, ((e0) this.f59206l).c(), mod).A();
        if (A.u()) {
            return false;
        }
        return c11.add(A.f().t()).mod(e11).equals(bigInteger);
    }

    protected BigInteger c(BigInteger bigInteger, byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    protected n60.h d() {
        return new n60.k();
    }

    public void g() {
        this.f59202h.reset();
        byte[] bArr = this.f59207m;
        if (bArr != null) {
            this.f59202h.update(bArr, 0, bArr.length);
        }
    }

    @Override // org.bouncycastle.crypto.z
    public byte[] generateSignature() {
        byte[] e11 = e();
        BigInteger e12 = this.f59204j.e();
        BigInteger c11 = c(e12, e11);
        BigInteger c12 = ((u50.d0) this.f59206l).c();
        n60.h d11 = d();
        while (true) {
            BigInteger nextK = this.f59201g.nextK();
            BigInteger mod = c11.add(d11.a(this.f59204j.b(), nextK).A().f().t()).mod(e12);
            BigInteger bigInteger = n60.d.f40584a;
            if (!mod.equals(bigInteger) && !mod.add(nextK).equals(e12)) {
                BigInteger mod2 = r70.a.j(e12, c12.add(n60.d.f40585b)).multiply(nextK.subtract(mod.multiply(c12)).mod(e12)).mod(e12);
                if (!mod2.equals(bigInteger)) {
                    try {
                        return this.f59203i.b(this.f59204j.e(), mod, mod2);
                    } catch (Exception e13) {
                        throw new CryptoException("unable to encode signature: " + e13.getMessage(), e13);
                    }
                }
            }
        }
    }

    @Override // org.bouncycastle.crypto.z
    public void init(boolean z11, org.bouncycastle.crypto.i iVar) {
        byte[] b11;
        n60.i c11;
        if (iVar instanceof e1) {
            e1 e1Var = (e1) iVar;
            org.bouncycastle.crypto.i b12 = e1Var.b();
            byte[] a11 = e1Var.a();
            if (a11.length >= 8192) {
                throw new IllegalArgumentException("SM2 user ID must be less than 2^16 bits long");
            }
            b11 = a11;
            iVar = b12;
        } else {
            b11 = org.bouncycastle.util.encoders.b.b("31323334353637383132333435363738");
        }
        if (z11) {
            if (iVar instanceof g1) {
                g1 g1Var = (g1) iVar;
                b0 b0Var = (b0) g1Var.a();
                this.f59206l = b0Var;
                y b13 = b0Var.b();
                this.f59204j = b13;
                this.f59201g.init(b13.e(), g1Var.b());
            } else {
                b0 b0Var2 = (b0) iVar;
                this.f59206l = b0Var2;
                y b14 = b0Var2.b();
                this.f59204j = b14;
                this.f59201g.init(b14.e(), org.bouncycastle.crypto.k.b());
            }
            c11 = d().a(this.f59204j.b(), ((u50.d0) this.f59206l).c()).A();
        } else {
            b0 b0Var3 = (b0) iVar;
            this.f59206l = b0Var3;
            this.f59204j = b0Var3.b();
            c11 = ((e0) this.f59206l).c();
        }
        this.f59205k = c11;
        byte[] f11 = f(b11);
        this.f59207m = f11;
        this.f59202h.update(f11, 0, f11.length);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte b11) {
        this.f59202h.update(b11);
    }

    @Override // org.bouncycastle.crypto.z
    public void update(byte[] bArr, int i11, int i12) {
        this.f59202h.update(bArr, i11, i12);
    }

    @Override // org.bouncycastle.crypto.z
    public boolean verifySignature(byte[] bArr) {
        try {
            BigInteger[] a11 = this.f59203i.a(this.f59204j.e(), bArr);
            return h(a11[0], a11[1]);
        } catch (Exception unused) {
            return false;
        }
    }
}