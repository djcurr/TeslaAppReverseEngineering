package y50;

import java.math.BigInteger;
import java.security.SecureRandom;
import u50.b1;

/* loaded from: classes5.dex */
public class l implements b {

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f59168e = BigInteger.valueOf(0);

    /* renamed from: a  reason: collision with root package name */
    private final p50.g f59169a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f59170b;

    /* renamed from: c  reason: collision with root package name */
    private final byte[] f59171c;

    /* renamed from: d  reason: collision with root package name */
    private BigInteger f59172d;

    public l(org.bouncycastle.crypto.p pVar) {
        p50.g gVar = new p50.g(pVar);
        this.f59169a = gVar;
        this.f59171c = new byte[gVar.getMacSize()];
        this.f59170b = new byte[gVar.getMacSize()];
    }

    private BigInteger a(byte[] bArr) {
        BigInteger bigInteger = new BigInteger(1, bArr);
        return bArr.length * 8 > this.f59172d.bitLength() ? bigInteger.shiftRight((bArr.length * 8) - this.f59172d.bitLength()) : bigInteger;
    }

    @Override // y50.b
    public void init(BigInteger bigInteger, BigInteger bigInteger2, byte[] bArr) {
        this.f59172d = bigInteger;
        org.bouncycastle.util.a.y(this.f59171c, (byte) 1);
        org.bouncycastle.util.a.y(this.f59170b, (byte) 0);
        int i11 = r70.a.i(bigInteger);
        byte[] bArr2 = new byte[i11];
        byte[] c11 = r70.a.c(bigInteger2);
        System.arraycopy(c11, 0, bArr2, i11 - c11.length, c11.length);
        byte[] bArr3 = new byte[i11];
        BigInteger a11 = a(bArr);
        if (a11.compareTo(bigInteger) >= 0) {
            a11 = a11.subtract(bigInteger);
        }
        byte[] c12 = r70.a.c(a11);
        System.arraycopy(c12, 0, bArr3, i11 - c12.length, c12.length);
        this.f59169a.init(new b1(this.f59170b));
        p50.g gVar = this.f59169a;
        byte[] bArr4 = this.f59171c;
        gVar.update(bArr4, 0, bArr4.length);
        this.f59169a.update((byte) 0);
        this.f59169a.update(bArr2, 0, i11);
        this.f59169a.update(bArr3, 0, i11);
        this.f59169a.doFinal(this.f59170b, 0);
        this.f59169a.init(new b1(this.f59170b));
        p50.g gVar2 = this.f59169a;
        byte[] bArr5 = this.f59171c;
        gVar2.update(bArr5, 0, bArr5.length);
        this.f59169a.doFinal(this.f59171c, 0);
        p50.g gVar3 = this.f59169a;
        byte[] bArr6 = this.f59171c;
        gVar3.update(bArr6, 0, bArr6.length);
        this.f59169a.update((byte) 1);
        this.f59169a.update(bArr2, 0, i11);
        this.f59169a.update(bArr3, 0, i11);
        this.f59169a.doFinal(this.f59170b, 0);
        this.f59169a.init(new b1(this.f59170b));
        p50.g gVar4 = this.f59169a;
        byte[] bArr7 = this.f59171c;
        gVar4.update(bArr7, 0, bArr7.length);
        this.f59169a.doFinal(this.f59171c, 0);
    }

    @Override // y50.b
    public void init(BigInteger bigInteger, SecureRandom secureRandom) {
        throw new IllegalStateException("Operation not supported");
    }

    @Override // y50.b
    public boolean isDeterministic() {
        return true;
    }

    @Override // y50.b
    public BigInteger nextK() {
        int i11 = r70.a.i(this.f59172d);
        byte[] bArr = new byte[i11];
        while (true) {
            int i12 = 0;
            while (i12 < i11) {
                p50.g gVar = this.f59169a;
                byte[] bArr2 = this.f59171c;
                gVar.update(bArr2, 0, bArr2.length);
                this.f59169a.doFinal(this.f59171c, 0);
                int min = Math.min(i11 - i12, this.f59171c.length);
                System.arraycopy(this.f59171c, 0, bArr, i12, min);
                i12 += min;
            }
            BigInteger a11 = a(bArr);
            if (a11.compareTo(f59168e) > 0 && a11.compareTo(this.f59172d) < 0) {
                return a11;
            }
            p50.g gVar2 = this.f59169a;
            byte[] bArr3 = this.f59171c;
            gVar2.update(bArr3, 0, bArr3.length);
            this.f59169a.update((byte) 0);
            this.f59169a.doFinal(this.f59170b, 0);
            this.f59169a.init(new b1(this.f59170b));
            p50.g gVar3 = this.f59169a;
            byte[] bArr4 = this.f59171c;
            gVar3.update(bArr4, 0, bArr4.length);
            this.f59169a.doFinal(this.f59171c, 0);
        }
    }
}