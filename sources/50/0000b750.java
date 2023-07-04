package u50;

import java.math.BigInteger;
import java.util.Objects;

/* loaded from: classes5.dex */
public class k extends f {

    /* renamed from: d  reason: collision with root package name */
    private static final BigInteger f53233d = BigInteger.valueOf(1);

    /* renamed from: e  reason: collision with root package name */
    private static final BigInteger f53234e = BigInteger.valueOf(2);

    /* renamed from: c  reason: collision with root package name */
    private BigInteger f53235c;

    public k(BigInteger bigInteger, i iVar) {
        super(false, iVar);
        this.f53235c = e(bigInteger, iVar);
    }

    private static int d(BigInteger bigInteger, BigInteger bigInteger2) {
        int bitLength = bigInteger2.bitLength();
        int[] r11 = v60.n.r(bitLength, bigInteger);
        int[] r12 = v60.n.r(bitLength, bigInteger2);
        int length = r12.length;
        int i11 = 0;
        while (true) {
            if (r11[0] == 0) {
                v60.n.I(length, r11, 0);
            } else {
                int b11 = r70.f.b(r11[0]);
                if (b11 > 0) {
                    v60.n.G(length, r11, b11, 0);
                    int i12 = r12[0];
                    i11 ^= (b11 << 1) & (i12 ^ (i12 >>> 1));
                }
                int i13 = v60.n.i(length, r11, r12);
                if (i13 == 0) {
                    break;
                }
                if (i13 < 0) {
                    i11 ^= r11[0] & r12[0];
                    int[] iArr = r12;
                    r12 = r11;
                    r11 = iArr;
                }
                while (true) {
                    int i14 = length - 1;
                    if (r11[i14] != 0) {
                        break;
                    }
                    length = i14;
                }
                v60.n.Q(length, r11, r12, r11);
            }
        }
        if (v60.n.z(length, r12)) {
            return 1 - (i11 & 2);
        }
        return 0;
    }

    private BigInteger e(BigInteger bigInteger, i iVar) {
        Objects.requireNonNull(bigInteger, "y value cannot be null");
        BigInteger f11 = iVar.f();
        BigInteger bigInteger2 = f53234e;
        if (bigInteger.compareTo(bigInteger2) < 0 || bigInteger.compareTo(f11.subtract(bigInteger2)) > 0) {
            throw new IllegalArgumentException("invalid DH public key");
        }
        BigInteger g11 = iVar.g();
        if (g11 == null) {
            return bigInteger;
        }
        if (f11.testBit(0) && f11.bitLength() - 1 == g11.bitLength() && f11.shiftRight(1).equals(g11)) {
            if (1 == d(bigInteger, f11)) {
                return bigInteger;
            }
        } else if (f53233d.equals(bigInteger.modPow(g11, f11))) {
            return bigInteger;
        }
        throw new IllegalArgumentException("Y value does not appear to be in correct group");
    }

    public BigInteger c() {
        return this.f53235c;
    }

    @Override // u50.f
    public boolean equals(Object obj) {
        return (obj instanceof k) && ((k) obj).c().equals(this.f53235c) && super.equals(obj);
    }

    @Override // u50.f
    public int hashCode() {
        return this.f53235c.hashCode() ^ super.hashCode();
    }
}