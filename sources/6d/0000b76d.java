package u50;

import java.math.BigInteger;

/* loaded from: classes5.dex */
public class t extends p {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f53288d = BigInteger.valueOf(1);

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f53289e = BigInteger.valueOf(2);

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53290c;

    public t(BigInteger bigInteger, r rVar) {
        super(false, rVar);
        this.f53290c = d(bigInteger, rVar);
    }

    private BigInteger d(BigInteger bigInteger, r rVar) {
        if (rVar != null) {
            BigInteger bigInteger2 = f53289e;
            if (bigInteger2.compareTo(bigInteger) > 0 || rVar.b().subtract(bigInteger2).compareTo(bigInteger) < 0 || !f53288d.equals(bigInteger.modPow(rVar.c(), rVar.b()))) {
                throw new IllegalArgumentException("y value does not appear to be in correct group");
            }
            return bigInteger;
        }
        return bigInteger;
    }

    public BigInteger c() {
        return this.f53290c;
    }
}