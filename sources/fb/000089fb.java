package n60;

import java.math.BigInteger;

/* loaded from: classes5.dex */
class s {

    /* renamed from: a  reason: collision with root package name */
    private final BigInteger f40647a;

    /* renamed from: b  reason: collision with root package name */
    private final int f40648b;

    public s(BigInteger bigInteger, int i11) {
        if (i11 < 0) {
            throw new IllegalArgumentException("scale may not be negative");
        }
        this.f40647a = bigInteger;
        this.f40648b = i11;
    }

    private void c(s sVar) {
        if (this.f40648b != sVar.f40648b) {
            throw new IllegalArgumentException("Only SimpleBigDecimal of same scale allowed in arithmetic operations");
        }
    }

    public s a(s sVar) {
        c(sVar);
        return new s(this.f40647a.add(sVar.f40647a), this.f40648b);
    }

    public s b(int i11) {
        if (i11 >= 0) {
            int i12 = this.f40648b;
            return i11 == i12 ? this : new s(this.f40647a.shiftLeft(i11 - i12), i11);
        }
        throw new IllegalArgumentException("scale may not be negative");
    }

    public int d(BigInteger bigInteger) {
        return this.f40647a.compareTo(bigInteger.shiftLeft(this.f40648b));
    }

    public BigInteger e() {
        return this.f40647a.shiftRight(this.f40648b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof s) {
            s sVar = (s) obj;
            return this.f40647a.equals(sVar.f40647a) && this.f40648b == sVar.f40648b;
        }
        return false;
    }

    public int f() {
        return this.f40648b;
    }

    public s g() {
        return new s(this.f40647a.negate(), this.f40648b);
    }

    public BigInteger h() {
        return a(new s(d.f40585b, 1).b(this.f40648b)).e();
    }

    public int hashCode() {
        return this.f40647a.hashCode() ^ this.f40648b;
    }

    public s i(BigInteger bigInteger) {
        return new s(this.f40647a.subtract(bigInteger.shiftLeft(this.f40648b)), this.f40648b);
    }

    public s j(s sVar) {
        return a(sVar.g());
    }

    public String toString() {
        if (this.f40648b == 0) {
            return this.f40647a.toString();
        }
        BigInteger e11 = e();
        BigInteger subtract = this.f40647a.subtract(e11.shiftLeft(this.f40648b));
        if (this.f40647a.signum() == -1) {
            subtract = d.f40585b.shiftLeft(this.f40648b).subtract(subtract);
        }
        if (e11.signum() == -1 && !subtract.equals(d.f40584a)) {
            e11 = e11.add(d.f40585b);
        }
        String bigInteger = e11.toString();
        char[] cArr = new char[this.f40648b];
        String bigInteger2 = subtract.toString(2);
        int length = bigInteger2.length();
        int i11 = this.f40648b - length;
        for (int i12 = 0; i12 < i11; i12++) {
            cArr[i12] = '0';
        }
        for (int i13 = 0; i13 < length; i13++) {
            cArr[i11 + i13] = bigInteger2.charAt(i13);
        }
        String str = new String(cArr);
        StringBuffer stringBuffer = new StringBuffer(bigInteger);
        stringBuffer.append(".");
        stringBuffer.append(str);
        return stringBuffer.toString();
    }
}